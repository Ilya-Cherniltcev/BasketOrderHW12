package pro.sky.course2.spring.basketorderhw12.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import pro.sky.course2.spring.basketorderhw12.exceptions.InvalidInputException;
import org.apache.commons.lang3.StringUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class BasketServiceImpl implements BasketService {
    private final Set<Integer> basket = new HashSet<>();

    @Override
    public Set<Integer> addItemToBasket(List<String> items) {
        boolean isNumeric=false;
// --- проверяем на наличие только цифр (артикул товара) --------------
        for (String item : items) {
            isNumeric = StringUtils.isNumeric(item);
            if (!isNumeric) {
                throw new InvalidInputException("Input only numeric symbols");
            }
            int artNumber = Integer.parseInt(item);
            basket.add(artNumber);
        }
        return basket;
    }

    @Override
    public Set<Integer> getBasket() {
        return basket;
    }
}
