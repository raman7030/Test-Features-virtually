package com.tencent.p062mm.opensdk.utils;

import android.net.Uri;
import android.provider.BaseColumns;
import p067l.C10878;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.utils.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0625c {

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.utils.c$b */
    public final class b implements BaseColumns {
        public static final Uri CONTENT_URI = Uri.parse("content://com.tencent.mm.sdk.plugin.provider/sharedpref");
    }

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.utils.c$a */
    public final class a {
        /* JADX INFO: renamed from: a */
        public static Object m2028a(int i, String str) {
            try {
                switch (i) {
                    case 1:
                        return Integer.valueOf(str);
                    case 2:
                        return Long.valueOf(str);
                    case 3:
                        return str;
                    case 4:
                        return Boolean.valueOf(str);
                    case 5:
                        return Float.valueOf(str);
                    case 6:
                        return Double.valueOf(str);
                    default:
                        Log.m2021e("MicroMsg.SDK.PluginProvider.Resolver", "unknown type");
                        return null;
                }
            } catch (Exception e) {
                C10878.m25049(e, new StringBuilder("resolveObj exception:"), "MicroMsg.SDK.PluginProvider.Resolver");
                return null;
            }
        }
    }
}
