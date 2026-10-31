package com.tencent.mm.opensdk.channel;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.tencent.mm.opensdk.channel.a.b;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.d;
import l.C9045;

/* JADX INFO: loaded from: classes.dex */
public class MMessageActV2 {
    public static final String DEFAULT_ENTRY_CLASS_NAME = ".wxapi.WXEntryActivity";
    public static final String MM_ENTRY_PACKAGE_NAME = "com.tencent.mm";
    public static final String MM_MSG_ENTRY_CLASS_NAME = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
    public static final String TAG = "MicroMsg.SDK.MMessageAct";

    public class Args {
        public static final int INVALID_FLAGS = -1;
        public Bundle bundle;
        public String content;
        public int flags = -1;
        public int launchMode = 2;
        public String targetClassName;
        public String targetPkgName;
        public String token;

        public String toString() {
            return "targetPkgName:" + this.targetPkgName + ", targetClassName:" + this.targetClassName + ", content:" + this.content + ", flags:" + this.flags + ", bundle:" + this.bundle;
        }
    }

    public static void sendUsingPendingIntent(Context context, Intent intent) {
        PendingIntent activity;
        try {
            Log.i(TAG, "sendUsingPendingIntent");
            int i = Build.VERSION.SDK_INT;
            int i2 = i >= 23 ? 201326592 : 134217728;
            if (i >= 35) {
                ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
                activity = PendingIntent.getActivity(context, 3, intent, i2, activityOptionsMakeBasic.toBundle());
            } else {
                activity = PendingIntent.getActivity(context, 3, intent, i2);
            }
            activity.send(context, 4, null, new PendingIntent.OnFinished() { // from class: com.tencent.mm.opensdk.channel.MMessageActV2.1
                @Override // android.app.PendingIntent.OnFinished
                public final void onSendFinished(PendingIntent pendingIntent, Intent intent2, int i3, String str, Bundle bundle) {
                    Log.i(MMessageActV2.TAG, "sendUsingPendingIntent onSendFinished resultCode: " + i3 + ", resultData: " + str);
                }
            }, null);
        } catch (Exception e) {
            Log.e(TAG, "sendUsingPendingIntent fail, ex = " + e.getMessage());
            context.startActivity(intent);
        }
    }

    public static boolean send(Context context, Args args) {
        if (context == null || args == null) {
            Log.e(TAG, "send fail, invalid argument");
            return false;
        }
        if (d.b(args.targetPkgName)) {
            Log.e(TAG, "send fail, invalid targetPkgName, targetPkgName = " + args.targetPkgName);
            return false;
        }
        if (d.b(args.targetClassName)) {
            args.targetClassName = C9045.m23341(new StringBuilder(), args.targetPkgName, DEFAULT_ENTRY_CLASS_NAME);
        }
        Log.i(TAG, "send, targetPkgName = " + args.targetPkgName + ", targetClassName = " + args.targetClassName + ", launchMode = " + args.launchMode);
        Intent intent = new Intent();
        intent.setClassName(args.targetPkgName, args.targetClassName);
        Bundle bundle = args.bundle;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        String packageName = context.getPackageName();
        intent.putExtra(ConstantsAPI.SDK_VERSION, com.tencent.mm.opensdk.constants.Build.SDK_INT);
        intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
        intent.putExtra(ConstantsAPI.CONTENT, args.content);
        intent.putExtra(ConstantsAPI.CHECK_SUM, b.a(args.content, com.tencent.mm.opensdk.constants.Build.SDK_INT, packageName));
        intent.putExtra(ConstantsAPI.TOKEN, args.token);
        int i = args.flags;
        if (i == -1) {
            intent.addFlags(268435456).addFlags(134217728);
        } else {
            intent.setFlags(i);
        }
        try {
            if (Build.VERSION.SDK_INT < 29 || args.launchMode != 2) {
                context.startActivity(intent);
            } else {
                sendUsingPendingIntent(context, intent);
            }
            Log.d(TAG, "send mm message, intent=".concat(String.valueOf(intent)));
            return true;
        } catch (Exception e) {
            Log.e(TAG, "send fail, ex = " + android.util.Log.getStackTraceString(e));
            return false;
        }
    }
}
