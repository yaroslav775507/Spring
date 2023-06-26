package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class RestApiDemoController {
    private List<Alcohols> alcohols = new ArrayList<>();

    public RestApiDemoController() {
        this.alcohols.addAll(List.of(
                new Alcohols(1, "Jameson", "John Jameson",
                        "Ireland", 6, 2500 ,10, 40 ),
                new Alcohols(2, "Finlandia", "Finlandia Vodka Worldwide LTD",
                        "Finland", 0, 699.00,5, 40),
                new Alcohols(3,"Martini Bianco","Alessandro Martini",
                        "Italy",1,599,9,12),
                new Alcohols(4,"Рoteen", "Cooley Distillery, Bunratty Potcheen",
                        "Ireland",2,4000,7,70)
        ));
    }
    // Для GET запроса по адресу "/alcohols" - возвращаем список алкоголя
    @GetMapping("/alcohols")
    Iterable<Alcohols> getAlcohols() {
        return alcohols;
    }
    // Для GET запроса по адресу "/alcohols/{id}" - возвращаем алкоголь с конкретным id
    @GetMapping("/alcohols/{id}")
    Optional<Alcohols> getAlcoholsById(@PathVariable int id) {
        for (Alcohols b: alcohols) {
            if (b.getId()==id) {
                return Optional.of(b);
            }
        }
        return Optional.empty();
    }
    // Для POST запроса по адресу "/alcohols/" - получаем новый алкоголь
    // от пользователя и сохраняем у себя!
    @PostMapping("/alcohols/")
    Alcohols postAlcohol(@RequestBody Alcohols alcohol) {
        alcohols.add(alcohol);
        return alcohol;
    }
    // Для DELETE запроса по адресу "/alcohols/{id}" - получаем id
    // алкоголь, который нужно удалить!
    @DeleteMapping("/alcohols/{id}")
    void deleteBook(@PathVariable int id) {
        alcohols.removeIf(c -> c.getId()==id);
    }
}

