package com.tencent.p062mm.opensdk.channel.p063a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p062mm.opensdk.constants.Build;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import com.tencent.p062mm.opensdk.utils.C0626d;
import com.tencent.p062mm.opensdk.utils.Log;
import p067l.C10965;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.channel.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0605a {

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.channel.a.a$a */
    public final class a {

        /* JADX INFO: renamed from: a */
        public String f2092a;
        public String action;

        /* JADX INFO: renamed from: b */
        public long f2093b;
        public Bundle bundle;
        public String content;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2006a(Context context, a aVar) {
        String str;
        if (context == null) {
            str = "send fail, invalid argument";
        } else {
            if (!C0626d.m2033b(aVar.action)) {
                String strM25286 = !C0626d.m2033b(aVar.f2092a) ? C10965.m25286(new StringBuilder(), aVar.f2092a, ".permission.MM_MESSAGE") : null;
                Intent intent = new Intent(aVar.action);
                Bundle bundle = aVar.bundle;
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                String packageName = context.getPackageName();
                intent.putExtra(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
                intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
                intent.putExtra(ConstantsAPI.CONTENT, aVar.content);
                intent.putExtra(ConstantsAPI.APP_SUPORT_CONTENT_TYPE, aVar.f2093b);
                intent.putExtra(ConstantsAPI.CHECK_SUM, C0606b.m2007a(aVar.content, Build.SDK_INT, packageName));
                context.sendBroadcast(intent, strM25286);
                Log.m2020d("MicroMsg.SDK.MMessage", "send mm message, intent=" + intent + ", perm=" + strM25286);
                return true;
            }
            str = "send fail, action is null";
        }
        Log.m2021e("MicroMsg.SDK.MMessage", str);
        return false;
    }
}
