package com.study.kevin.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Kevin on 2017/9/7 21:41.
 * Email: 863129201@qq.com.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
