package com.coolweather.android.gson;

import com.bumptech.glide.load.resource.SimpleResource;
import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2017/10/9.
 */

public class Forecast {

    @SerializedName("date")
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{

        @SerializedName("max")
        public String max;

        @SerializedName("min")
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
