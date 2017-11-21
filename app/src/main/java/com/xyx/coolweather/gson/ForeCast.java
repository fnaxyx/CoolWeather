package com.xyx.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2017/11/19.
 */

public class ForeCast {
    public String date;

     @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature{
        public String max;
        public String min;
    }
}
