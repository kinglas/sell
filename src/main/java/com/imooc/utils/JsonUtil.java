package com.imooc.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by kinglas on 2017/10/24.
 */
public class JsonUtil {
    public static String toJson(Object object){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }

}
