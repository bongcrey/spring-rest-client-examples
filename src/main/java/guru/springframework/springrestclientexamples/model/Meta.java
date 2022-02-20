package guru.springframework.springrestclientexamples.model;

public class Meta {
    private long count;
    private long limit;
    private long page;
    private String previousURL;
    private String nextURL;

    public long getCount() { return count; }
    public void setCount(long value) { this.count = value; }

    public long getLimit() { return limit; }
    public void setLimit(long value) { this.limit = value; }

    public long getPage() { return page; }
    public void setPage(long value) { this.page = value; }

    public String getPreviousURL() { return previousURL; }
    public void setPreviousURL(String value) { this.previousURL = value; }

    public String getNextURL() { return nextURL; }
    public void setNextURL(String value) { this.nextURL = value; }
}

