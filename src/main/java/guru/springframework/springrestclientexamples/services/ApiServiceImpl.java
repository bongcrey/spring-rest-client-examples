package guru.springframework.springrestclientexamples.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import guru.springframework.springrestclientexamples.model.Response;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Response getCustomers(Integer page, Integer limit) {

        return restTemplate.getForObject("https://api.predic8.de:443/shop/customers/?limit=" + limit, Response.class);
    }
    
}
