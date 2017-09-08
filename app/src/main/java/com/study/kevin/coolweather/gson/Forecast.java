package com.study.kevin.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kevin on 2017/9/8 08:14.
 * Email: 863129201@qq.com.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{

        public String Max;

        public String min;
    }

    public class More{

        @SerializedName("txt_d")
        public String info;
    }
}
