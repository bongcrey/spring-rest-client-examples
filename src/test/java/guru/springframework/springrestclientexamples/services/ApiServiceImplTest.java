package guru.springframework.springrestclientexamples.services;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import guru.springframework.springrestclientexamples.model.Response;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Before
    public void setup() throws Exception {

    }

    @Test
    public void testGetCustomers() {
        Response response = apiService.getCustomers(1, 5);
        assertEquals(5, response.getCustomers().length);
    }
}
