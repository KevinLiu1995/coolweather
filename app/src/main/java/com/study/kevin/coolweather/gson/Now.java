package com.study.kevin.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kevin on 2017/9/8 08:07.
 * Email: 863129201@qq.com.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
