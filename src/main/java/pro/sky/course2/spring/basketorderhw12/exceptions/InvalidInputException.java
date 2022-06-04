package pro.sky.course2.spring.basketorderhw12.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


// =====   ошибка 400 Bad Request ==========
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidInputException extends RuntimeException{
    public InvalidInputException(String alert) {
    }
}
