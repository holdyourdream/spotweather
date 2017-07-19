package com.spotweather.android.util;
/*
 * Created by 21737380 on 2017/7/19.
 */

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    public static void SendOkHttpRequest(String address,okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
