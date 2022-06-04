package pro.sky.course2.spring.basketorderhw12.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.course2.spring.basketorderhw12.service.BasketService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/store/order/")
public class BasketController {
    private final BasketService service;

    public BasketController(BasketService service) {
        this.service = service;
    }

// ------- добавить покупку в корзину ----------------
    @GetMapping(path = "/add")
    Set<Integer> addItemToBasket(@RequestParam("num") List<String> items) {
        return service.addItemToBasket(items);
    }

// ------- получить корзину с покупками ----------------
    @GetMapping(path = "/get")
    Set<Integer> getBasket() {
        return service.getBasket();
    }
}
