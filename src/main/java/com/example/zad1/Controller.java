package com.example.zad1;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/reversal")
    StringBuilder reverseString(@RequestBody String textToReverse){
        StringBuilder sb = new StringBuilder(textToReverse);
        return sb.reverse();
    }

}
