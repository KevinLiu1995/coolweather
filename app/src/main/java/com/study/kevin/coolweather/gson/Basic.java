package com.study.kevin.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kevin on 2017/9/8 08:00.
 * Email: 863129201@qq.com.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;

    }
}
