package shop.learnup.shop.services.interfaces;

import java.util.List;

public interface EntityService<T, I> {

    T get(I id);

    T create(T item);

    T update(T item);

    void delete(I id);

    List<T> getAll();

}
