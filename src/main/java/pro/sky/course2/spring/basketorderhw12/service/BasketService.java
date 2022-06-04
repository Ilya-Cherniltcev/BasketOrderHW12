package pro.sky.course2.spring.basketorderhw12.service;

import java.util.List;
import java.util.Set;
// -----
public interface BasketService {

    Set<Integer> getBasket();

    Set<Integer> addItemToBasket(List<String> items);
}
