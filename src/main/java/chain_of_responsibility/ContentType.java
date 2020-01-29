package chain_of_responsibility;

public enum ContentType {

    APPLICATION_JSON("application/json"),
    APPLICATION_XML("application/xml");

    private String value;

    ContentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}


