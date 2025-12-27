package pixel.academy.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewRestContoler {

    @GetMapping("/")
    public String hello() {
        return "Hello Republic of Moldova!:";
    }
}
