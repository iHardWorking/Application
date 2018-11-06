package com.my.it.myapplication;

import cn.bmob.v3.BmobObject;

/**
 * Created by it on 2018/11/6.
 */

public class Goods extends BmobObject {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
