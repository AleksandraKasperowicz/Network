package Task2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @GetMapping("/echo")
    public String echo(@RequestParam String text) {
        return text.toUpperCase();
    }

    @GetMapping("/echo2")
    public String echo2(){

        return "<b>Hejka</b>";
    }
}