package com.xyx.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2017/11/19.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        public String updateTime;
    }
}
