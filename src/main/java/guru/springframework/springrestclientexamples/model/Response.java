package guru.springframework.springrestclientexamples.model;

public class Response {
    private Meta meta;
    private Customer[] customers;

    public Meta getMeta() { return meta; }
    public void setMeta(Meta value) { this.meta = value; }

    public Customer[] getCustomers() { return customers; }
    public void setCustomers(Customer[] value) { this.customers = value; }
}