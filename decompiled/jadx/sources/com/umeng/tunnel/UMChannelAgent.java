package com.umeng.tunnel;

import android.content.Context;
import com.umeng.commonsdk.vchannel.Sender;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class UMChannelAgent {
    public static final String TAG = "UMChannelAgent";
    public static final String UMENG_VCHANNEL = "com.umeng.commonsdk.vchannel.Sender";
    public static boolean vChannelReady;

    static {
        try {
            vChannelReady = true;
        } catch (Throwable unused) {
        }
    }

    public static void reflectOnEvent(Context context, String str, Map map) {
        try {
            Sender.class.getMethod("onEvent", Context.class, String.class, Map.class).invoke(null, context, str, map);
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | Exception unused) {
        }
    }

    public static void reflectSetCustomHeader(Map map) {
        try {
            Sender.class.getMethod("setCustomHeader", Map.class).invoke(null, map);
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | Exception unused) {
        }
    }

    public static boolean init() {
        return vChannelReady;
    }

    public static void setCustomHeader(Map map) {
        reflectSetCustomHeader(map);
    }

    public static void onDebugEvent(Context context, String str, Map map) {
        reflectOnEvent(context, str, map);
    }
}
