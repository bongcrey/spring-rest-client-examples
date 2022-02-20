package guru.springframework.springrestclientexamples.services;

import guru.springframework.springrestclientexamples.model.Response;

public interface ApiService {
    
    Response getCustomers(Integer page, Integer limit);
}
