package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class httpQueryStringTest {
    @Test
    void shouldRetrieveStatusCode() {
        QueryString queryString = new QueryString("status=200");
        assertEquals("200", queryString.getParameter("status"));
    }

    @Test
    void shouldRetrieveStatusCode_401() {
        QueryString queryString = new QueryString("status=401");
        assertEquals("401", queryString.getParameter("status"));
    }

    @Test
    void shouldReturnNullForMissingParameters() {
        QueryString queryString = new QueryString("body=hello");
        assertNull(queryString.getParameter("status"));
    }

    @Test
    void shouldSupportMultipleParameters() {
        QueryString queryString = new QueryString("status=200&body=Hello");
        assertEquals("200", queryString.getParameter("status"));
        assertEquals("Hello", queryString.getParameter("Hello"));
    }
}
