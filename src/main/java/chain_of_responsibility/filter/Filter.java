package chain_of_responsibility.filter;

import chain_of_responsibility.Request;

public abstract class Filter {

    public Filter() {
    }

    public Filter(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }

    protected Filter nextFilter;

    public boolean doFilter(Request request) {
        if (nextFilter != null) {
            return nextFilter.doFilter(request);
        }

        return true;
    }
}
