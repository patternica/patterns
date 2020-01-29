package chain_of_responsibility;

import java.util.List;

public class Request {

    private List<String> headers;
    private String contentType;
    private Double protocolVersion;

    public Request(List<String> headers, String contentType, Double protocolVersion) {
        this.headers = headers;
        this.contentType = contentType;
        this.protocolVersion = protocolVersion;
    }

    public List<String> getHeaders() {
        return headers;
    }

    public void setHeaders(List<String> headers) {
        this.headers = headers;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Double getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(Double protocolVersion) {
        this.protocolVersion = protocolVersion;
    }
}
