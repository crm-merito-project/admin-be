package merito.crm;

import io.micronaut.http.annotation.*;

@Controller("/")
public class MainController {

    @Get(uri = "/", produces = "text/plain")
    public String index() {
        return "Example Response";
    }
}