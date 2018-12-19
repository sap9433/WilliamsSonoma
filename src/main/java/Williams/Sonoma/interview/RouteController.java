package Williams.Sonoma.interview;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {
    @RequestMapping(value = "/api/products/all")
    public String getProducts() {
        return new RestTemplate().getForObject(
            "https://www.westelm.com/services/catalog/v4/category/shop/new/all-new/index.json", String.class
        );
    }
}