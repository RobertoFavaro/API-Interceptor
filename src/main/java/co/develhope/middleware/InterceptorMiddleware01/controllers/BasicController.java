package co.develhope.middleware.InterceptorMiddleware01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.OffsetDateTime;

@RestController
@RequestMapping("/time")
public class BasicController {
    @GetMapping("")
    public String getCurrentDateTime() {
        return OffsetDateTime.now().toString();
    }
}
