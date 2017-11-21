package com.xyx.coolweather.gson;

/**
 * Created by lenovo on 2017/11/19.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
