package chain_of_responsibility.filter;

import chain_of_responsibility.Request;

import java.util.List;

public class AuthorizationFilter extends Filter {

    public AuthorizationFilter() {
    }

    public AuthorizationFilter(Filter nextFilter) {
        super(nextFilter);
    }

    @Override
    public boolean doFilter(Request request) {
        List<String> headers = request.getHeaders();
        if (headers == null || headers.isEmpty() || !headers.contains("Authorization")) {
            return false;
        }

        return super.doFilter(request);
    }
}
