package guru.springframework.springrestclientexamples.model;

public class Customer {
    private String firstname;
    private String lastname;
    private String customerURL;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String value) {
        this.firstname = value;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String value) {
        this.lastname = value;
    }

    public String getCustomerURL() {
        return customerURL;
    }

    public void setCustomerURL(String value) {
        this.customerURL = value;
    }
}