package shop.learnup.shop.domain.messages;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

public class StoreMessageBody implements Serializable {
    public int number;
    public String name;

    public StoreMessageBody(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }
}
