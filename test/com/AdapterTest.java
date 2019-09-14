package com;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdapterTest {

    @Test
    public void getAdapterTest() {
        Adapter adapter =Adapter.getAdapter();
        Adapter adapter1=Adapter.getAdapter();
        System.out.println(adapter.hashCode()+" "+adapter1.hashCode());
        assertTrue(adapter.hashCode()==adapter1.hashCode());
    }

    @Test
    public void toJsonTest() {
        Adapter adapter =Adapter.getAdapter();
        String expected="{\"employees\": {\"employee\": [\n" +
                "    {\n" +
                "        \"firstName\": \"Leonardo\",\n" +
                "        \"lastName\": \"DiCaprio\",\n" +
                "        \"photo\": \"http://1.bp.blogspot.com/-zvS_6Q1IzR8/T5l6qvnRmcI/AAAAAAAABcc/HXO7HDEJKo0/s200/Leonardo+Dicaprio7.jpg\",\n" +
                "        \"id\": 1\n" +
                "    },\n" +
                "    {\n" +
                "        \"firstName\": \"Johnny\",\n" +
                "        \"lastName\": \"Depp\",\n" +
                "        \"photo\": \"http://4.bp.blogspot.com/_xR71w9-qx9E/SrAz--pu0MI/AAAAAAAAC38/2ZP28rVEFKc/s200/johnny-depp-pirates.jpg\",\n" +
                "        \"id\": 2\n" +
                "    },\n" +
                "    {\n" +
                "        \"firstName\": \"Hritik\",\n" +
                "        \"lastName\": \"Roshan\",\n" +
                "        \"photo\": \"http://thewallmachine.com/files/1411921557.jpg\",\n" +
                "        \"id\": 3\n" +
                "    }\n" +
                "]}}";
        String input="<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<employees>\n" +
                "\t<employee>\n" +
                "\t\t<id>1</id>\n" +
                "\t\t<firstName>Leonardo</firstName>\n" +
                "\t\t<lastName>DiCaprio</lastName>\n" +
                "\t\t<photo>http://1.bp.blogspot.com/-zvS_6Q1IzR8/T5l6qvnRmcI/AAAAAAAABcc/HXO7HDEJKo0/s200/Leonardo+Dicaprio7.jpg</photo>\n" +
                "\t</employee>\n" +
                "\t<employee>\n" +
                "\t\t<id>2</id>\n" +
                "\t\t<firstName>Johnny</firstName>\n" +
                "\t\t<lastName>Depp</lastName>\n" +
                "\t\t<photo>http://4.bp.blogspot.com/_xR71w9-qx9E/SrAz--pu0MI/AAAAAAAAC38/2ZP28rVEFKc/s200/johnny-depp-pirates.jpg</photo>\n" +
                "\t</employee>\n" +
                "\t<employee>\n" +
                "\t\t<id>3</id>\n" +
                "\t\t<firstName>Hritik</firstName>\n" +
                "\t\t<lastName>Roshan</lastName>\n" +
                "\t\t<photo>http://thewallmachine.com/files/1411921557.jpg</photo>\n" +
                "\t</employee>\n" +
                "</employees>  ";
        assertEquals(expected,adapter.toJson(input));
    }
}