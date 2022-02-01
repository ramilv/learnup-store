package shop.learnup.shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import shop.learnup.shop.jwt.JwtService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static shop.learnup.shop.filters.JwtAuthorizationFilter.getToken;

@Controller
public class AuthController {

    private final JwtService jwtService;
    private final UserDetailsService userService;

    @Autowired
    public AuthController(UserDetailsService userService, JwtService jwtService) {
        this.jwtService = jwtService;
        this.userService = userService;
    }

    @GetMapping("/api/tokenRefresh")
    public void auth(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String token = getToken(request);
        String username = null;

        if (token != null) {
            username = jwtService.getUsernameFromRefreshToken(token);
            if (username != null) {
                final UserDetails user = userService.loadUserByUsername(username);
                if (user != null) {
                    final String accessToken = jwtService.generateAccessToken(request.getRequestURI(), user);
                    final String refreshToken = jwtService.generateRefreshToken(request.getRequestURI(), user);
                    response.setHeader("access_token", accessToken);
                    response.setHeader("refresh_token", refreshToken);
                    return;
                }
            }
        }

    }
}
