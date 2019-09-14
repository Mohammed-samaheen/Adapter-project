package com;

import org.json.JSONObject;
import org.json.XML;

public class Adapter {

    private  static Adapter _instance=null;
    private static final int PARTY_PRINT_INTEND_FACTOR=4;

    private Adapter() {
    }

    public static Adapter getAdapter(){
        if(_instance==null)
            return new Adapter();
        else
            return _instance;
    }

    public String toJson(String xmlString){

        JSONObject jsonObject = XML.toJSONObject(xmlString);
        String jsonPartyPrintString=jsonObject.toString(PARTY_PRINT_INTEND_FACTOR);

        return jsonPartyPrintString;
    }

}
