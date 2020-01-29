package chain_of_responsibility;

import chain_of_responsibility.filter.AuthorizationFilter;
import chain_of_responsibility.filter.HttpProtocolVersionFilter;
import chain_of_responsibility.filter.JsonContentTypeFilter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> headers = new ArrayList<String>();
        headers.add("Authorization");

        Request validRequest = new Request(headers, ContentType.APPLICATION_JSON.getValue(), 2.0);

        JsonContentTypeFilter contentTypeFilter = new JsonContentTypeFilter();
        AuthorizationFilter authorizationFilter = new AuthorizationFilter(contentTypeFilter);
        HttpProtocolVersionFilter protocolVersionFilter = new HttpProtocolVersionFilter(authorizationFilter);

        System.out.println("Valid result: " + protocolVersionFilter.doFilter(validRequest));

        List<String> headers2 = new ArrayList<String>();
        headers2.add("Content-Length");

        Request invalidRequest = new Request(headers2, ContentType.APPLICATION_XML.getValue(), 1.3);

        System.out.println("Invalid result: " + protocolVersionFilter.doFilter(invalidRequest));
    }
}
