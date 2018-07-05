package com.zhxh.xvideolib;

import android.os.Binder;

/**
 * 自定义Binder对象
 * Created by zhxh on 2018/7/5
 */

public class MediaPlayerBinder extends Binder {
    private MediaPlayerBinderService service;

    public MediaPlayerBinder(MediaPlayerBinderService service) {
        this.service = service;
    }

    public MediaPlayerBinderService getService() {
        return service;
    }

    public void setService(MediaPlayerBinderService service) {
        this.service = service;
    }
}
