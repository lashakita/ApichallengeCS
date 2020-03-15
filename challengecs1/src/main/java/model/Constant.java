package model;

import com.fasterxml.jackson.databind.ObjectMapper;

public final class Constant {

    public static final ObjectMapper mapper = new ObjectMapper();

    private Constant(){
        throw new AssertionError();
    }
}
