package chain_of_responsibility.filter;

import chain_of_responsibility.Request;

public class HttpProtocolVersionFilter extends Filter {

    public HttpProtocolVersionFilter() {
    }

    public HttpProtocolVersionFilter(Filter nextFilter) {
        super(nextFilter);
    }

    @Override
    public boolean doFilter(Request request) {
        Double protocolVersion = request.getProtocolVersion();
        if (protocolVersion == null || protocolVersion < 2.0) {
            return false;
        }

        return super.doFilter(request);
    }
}
