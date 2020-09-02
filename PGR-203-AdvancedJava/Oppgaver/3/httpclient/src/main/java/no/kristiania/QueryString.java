package no.kristiania;

public class QueryString {

    private final String parameterValue;
    private final String parameterName;

    public QueryString(String queryString){
        int pos = queryString.indexOf('=');
        parameterName = queryString.substring(0, pos);
        parameterValue = queryString.substring(pos + 1);
    }

    public Object getParameter(String status) {
        if(status.equals(parameterName)) {
            return parameterValue;
        } else {
            return null;
        }
    }
}
