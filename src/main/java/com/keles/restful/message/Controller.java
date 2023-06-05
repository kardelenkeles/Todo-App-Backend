package com.keles.restful.message;

import com.keles.restful.message.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {

    @GetMapping(path = "/bean")
    public Bean getMessage() {
        // throw new RuntimeException("Some error has happened!")
        Bean m = new Bean();
        m.setMessage("Hello - world");
        return m;
    }

    @GetMapping(path = "/bean/path-variable/{name}")
    public Bean getMessagePathVariable(@PathVariable String name) {
        Bean m = new Bean();
        m.setMessage(String.format("Hello - world, %s", name));
        return m;
    }

}
