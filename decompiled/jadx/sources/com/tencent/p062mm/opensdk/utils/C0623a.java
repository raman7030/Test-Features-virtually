package com.tencent.p062mm.opensdk.utils;

import android.os.Bundle;
import p067l.C10878;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.utils.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0623a {
    /* JADX INFO: renamed from: a */
    public static int m2025a(Bundle bundle, String str) {
        if (bundle == null) {
            return -1;
        }
        try {
            return bundle.getInt(str, -1);
        } catch (Exception e) {
            C10878.m25049(e, new StringBuilder("getIntExtra exception:"), "MicroMsg.IntentUtil");
            return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m2026b(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getString(str);
        } catch (Exception e) {
            C10878.m25049(e, new StringBuilder("getStringExtra exception:"), "MicroMsg.IntentUtil");
            return null;
        }
    }
}
