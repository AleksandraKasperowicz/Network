package Task3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class SumServerController {

    @GetMapping("/getSum")
    public String getSum(@RequestParam String numbers){
        return Integer.toString(Arrays.stream(numbers.split(",")).mapToInt(Integer::parseInt).sum());
    }

}
