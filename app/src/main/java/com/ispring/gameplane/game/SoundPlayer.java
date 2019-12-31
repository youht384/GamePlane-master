package com.ispring.gameplane.game;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import com.ispring.gameplane.R;

/**
 *
 * @author zsl
 * @blog http://blog.csdn.net/yy1300326388
 *
 */
public class SoundPlayer {
    // SoundPool对象
    public static SoundPool mSoundPlayer = new SoundPool(10,
            AudioManager.STREAM_SYSTEM, 5);
    public static SoundPlayer soundPlayUtils;
    // 上下文
    static Context mContext;

    /**
     * 初始化
     *
     * @param context
     */
    public static SoundPlayer init(Context context) {
        if (soundPlayUtils == null) {
            soundPlayUtils = new SoundPlayer();
        }

        // 初始化声音
        mContext = context;

        mSoundPlayer.load(mContext, R.raw.bom, 1);// 1
        mSoundPlayer.load(mContext, R.raw.refr, 2);// 2
        mSoundPlayer.load(mContext, R.raw.pyo2, 3);// 3
        mSoundPlayer.load(mContext, R.raw.shoot1, 4);// 4
        mSoundPlayer.load(mContext, R.raw.coin05, 5);// 5
        mSoundPlayer.load(mContext, R.raw.coin07, 6);// 6
        mSoundPlayer.load(mContext, R.raw.coin08, 7);// 7
        mSoundPlayer.load(mContext, R.raw.explosion1, 8);// 8
        mSoundPlayer.load(mContext, R.raw.carvoice, 9);

        return soundPlayUtils;
    }

    /**
     * 播放声音
     *
     * @param soundID
     */
    public static void play(int soundID) {
        mSoundPlayer.play(soundID, 0.4F, 0.4F, 0, 0, 1);
    }

}

