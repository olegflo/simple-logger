package com.example.simple_logger;

import android.util.Log;

/**
 * @author Oleg Soroka
 * @date 04.02.13
 * @time 13:33
 * <p/>
 * Simple logger based on Android logger http://developer.android.com/reference/android/util/Log.html
 */
public class Lo {

    private static String DEFAULT_TAG_PREFIX = "TAG";
    private static String DEFAULT_TAG = "TAG";
    private String tag;
    private static Boolean logPermission = true;

    public Lo(Object caller) {
        this.tag = caller.getClass().getSimpleName();
    }

    // Info

    public void gi(String logFormat, Object... args) {
        if (logPermission) {
            Log.i(getFullTag(), String.format(logFormat, args));
        }
    }

    public void gi(Object arg) {
        if (logPermission) {
            Log.i(getFullTag(), String.format("%s", arg));
        }
    }

    // Error

    public void ge(String logFormat, Object... args) {
        if (logPermission) {
            Log.e(getFullTag(), String.format(logFormat, args));
        }
    }

    public void ge(Object arg) {
        if (logPermission) {
            Log.e(getFullTag(), String.format("%s", arg));
        }
    }

    // Warning

    public void gw(String logFormat, Object... args) {
        if (logPermission) {
            Log.w(getFullTag(), String.format(logFormat, args));
        }
    }

    public void gw(Object arg) {
        if (logPermission) {
            Log.w(getFullTag(), String.format("%s", arg));
        }
    }

    // Debug

    public void g(String logFormat, Object... args) {
        if (logPermission) {
            Log.d(getFullTag(), String.format(logFormat, args));
        }
    }

    public void g(Object arg) {
        if (logPermission) {
            Log.d(getFullTag(), String.format("%s", arg));
        }
    }

    // Static debug

    public static void ggd(String logFormat, Object... args) {
        ggd(DEFAULT_TAG, logFormat, args);
    }

    public static void ggd(Object arg) {
        ggd(DEFAULT_TAG, arg);
    }

    // Log Tagged Debug
    public static void gtd(String tag, Object arg) {
        ggd(tag, "%s", arg);
    }

    public static void ggd(String tag, String logFormat, Object... args) {
        if (logPermission) {
            Log.i(tag, String.format(logFormat, args));
        }
    }

    // Static info

    public static void ggi(String logFormat, Object... args) {
        ggi(DEFAULT_TAG, logFormat, args);
    }

    public static void ggi(Object arg) {
        ggi(DEFAULT_TAG, arg);
    }

    // Log Tagged Info
    public static void gti(String tag, Object arg) {
        ggi(tag, "%s", arg);
    }

    public static void ggi(String tag, String logFormat, Object... args) {
        if (logPermission) {
            Log.i(tag, String.format(logFormat, args));
        }
    }

    // Static warning

    public static void ggw(String logFormat, Object... args) {
        ggw(DEFAULT_TAG, logFormat, args);
    }

    public static void ggw(Object arg) {
        ggw(DEFAULT_TAG, arg);
    }

    // Log Tagged Warning
    public static void gtw(String tag, Object arg) {
        ggw(tag, "%s", arg);
    }

    public static void ggw(String tag, String logFormat, Object... args) {
        if (logPermission) {
            Log.w(tag, String.format(logFormat, args));
        }
    }

    // Static error

    public static void gge(String logFormat, Object... args) {
        gge(DEFAULT_TAG, logFormat, args);
    }

    public static void gge(Object arg) {
        gge(DEFAULT_TAG, arg);
    }

    // Log Tagged Error
    public static void gte(String tag, Object arg) {
        gge(tag, "%s", arg);
    }

    public static void gge(String tag, String logFormat, Object... args) {
        if (logPermission) {
            Log.e(tag, String.format(logFormat, args));
        }
    }

    //

    public static String getFullTag(String tag) {
        return String.format("%s %s", DEFAULT_TAG_PREFIX, tag);
    }

    public String getFullTag() {
        return String.format("%s %s", DEFAULT_TAG_PREFIX, tag);
    }

    public static Boolean getLogPermission() {
        return logPermission;
    }

    public static void setLogPermission(Boolean logPermission) {
        Lo.logPermission = logPermission;
    }
}