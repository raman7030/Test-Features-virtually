package com.tencent.mm.opensdk.channel.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.opensdk.constants.Build;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.d;
import l.C9045;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.channel.a.a$a, reason: collision with other inner class name */
    public final class C0031a {
        public String a;
        public String action;
        public long b;
        public Bundle bundle;
        public String content;
    }

    public static boolean a(Context context, C0031a c0031a) {
        String str;
        if (context == null) {
            str = "send fail, invalid argument";
        } else {
            if (!d.b(c0031a.action)) {
                String strM23341 = !d.b(c0031a.a) ? C9045.m23341(new StringBuilder(), c0031a.a, ".permission.MM_MESSAGE") : null;
                Intent intent = new Intent(c0031a.action);
                Bundle bundle = c0031a.bundle;
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                String packageName = context.getPackageName();
                intent.putExtra(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
                intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
                intent.putExtra(ConstantsAPI.CONTENT, c0031a.content);
                intent.putExtra(ConstantsAPI.APP_SUPORT_CONTENT_TYPE, c0031a.b);
                intent.putExtra(ConstantsAPI.CHECK_SUM, b.a(c0031a.content, Build.SDK_INT, packageName));
                context.sendBroadcast(intent, strM23341);
                Log.d("MicroMsg.SDK.MMessage", "send mm message, intent=" + intent + ", perm=" + strM23341);
                return true;
            }
            str = "send fail, action is null";
        }
        Log.e("MicroMsg.SDK.MMessage", str);
        return false;
    }
}
