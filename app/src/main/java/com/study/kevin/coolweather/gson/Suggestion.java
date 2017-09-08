package com.study.kevin.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kevin on 2017/9/8 08:10.
 * Email: 863129201@qq.com.
 */

public class Suggestion {

    @SerializedName("comf")
    public ComFort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    @SerializedName("sport")
    public Sport sport;

    public class ComFort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
