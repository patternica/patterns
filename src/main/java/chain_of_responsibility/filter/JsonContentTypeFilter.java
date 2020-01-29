package chain_of_responsibility.filter;

import chain_of_responsibility.ContentType;
import chain_of_responsibility.Request;

public class JsonContentTypeFilter extends Filter {


    public JsonContentTypeFilter() {
        super();
    }

    public JsonContentTypeFilter(Filter nextFilter) {
        super(nextFilter);
    }

    public boolean doFilter(Request request) {
        String contentType = request.getContentType();
        if (contentType == null || !contentType.equals(ContentType.APPLICATION_JSON.getValue())) {
            return false;
        }

        return super.doFilter(request);
    }
}
