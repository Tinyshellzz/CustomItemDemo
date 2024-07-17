package com.tinyshellzz.customitemdemo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ObjectPool {
    public static CustomItemDemo plugin;

    public final static Gson gson;

    static {
        gson = new GsonBuilder()
                .setPrettyPrinting()    // Optional
                .disableHtmlEscaping()
                .create();
    }
}
