package com.fpp.guestapp.app;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.support.multidex.MultiDexApplication;
import android.util.DisplayMetrics;

import com.fpp.guestapp.utils.LogUtil;


/**
 * @author fpp
 * @description: App
 * @date 2018/11/23 17:44
 */
public class App extends MultiDexApplication {

    private String TAG = "App";

    private static App appInstance;

    public static App getInstance() {
        return appInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appInstance = this;
        LogUtil.isDebug = true;  // 初始化log日志



    }

    @Override
    public void onTerminate() {
        // 程序终止的时候执行
        LogUtil.d(TAG, "onTerminate");
        super.onTerminate();
    }

    @Override
    public void onLowMemory() {
        // 低内存的时候执行
         LogUtil.d(TAG, "onLowMemory");
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        // 程序在内存清理的时候执行
         LogUtil.d(TAG, "onTrimMemory");
        super.onTrimMemory(level);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
         LogUtil.d(TAG, "onConfigurationChanged");
        super.onConfigurationChanged(newConfig);
    }

    /**
     * 描述：退出应用
     *
     * @author zhuzhu
     * @version v0.1
     * @since 2015-04-13
     */
    public void exitApp() {
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            public void run() {
                ActivityManager activityMan = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
                activityMan.restartPackage(getPackageName());
                System.exit(0);
            }
        }, 1000);
    }

    ;

    /**
     * 描述：获取屏幕尺寸
     *
     * @author zhuzhu
     * @version v0.1
     * @since 2015-04-13
     */
    public DisplayMetrics getDisplayMetrics() {
        return this.getResources().getDisplayMetrics();
    }

//    /**
//     * 描述：用户是否已经登录
//     */
//    public boolean getLoginState() {
//        String loginState =  ShareStoreProcess.getInstance().getDataByKey(ConstantUtil.LOGIN_STATE_COLUMN);
//        return ("true".equals(loginState)) ? true : false;
//    }
//
//    /**
//     * 描述：退出账号或应用
//     */
//    public void handleSignOut(boolean bExit)
//    {
//        Intent it = new Intent(ConstantUtil.exitAction);
//        sendBroadcast(it);
//    }


}
