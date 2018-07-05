package com.zhxh.xvideolib;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by zhxh on 2018/7/5
 */
public class MusicIntentReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context ctx, Intent intent) {
        if (intent.getAction().equals(android.media.AudioManager.ACTION_AUDIO_BECOMING_NOISY)) {
            // signal your service to stop playback
            // (via an Intent, for instance)
        }
    }
}