package no.kristiania;

import java.util.HashMap;
import java.util.Map;

public class QueryString {
    private Map<String, String> parameters = new HashMap<>()
    private String parameterValue;
    private String parameterName;

    public QueryString(String queryString){
        for(String parameter : queryString.split("&")){
            int pos = parameter.indexOf('=');
            parameterName = parameter.substring(0, pos);
            parameterValue = parameter.substring(pos + 1);
            parameters.put(parameterName, parameterValue)
        }

    }

    public Object getParameter(String status) {
        if(status.equals(parameterName)) {
            return parameterValue;
        } else {
            return null;
        }
    }
}
