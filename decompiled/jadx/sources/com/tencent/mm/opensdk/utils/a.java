package com.tencent.mm.opensdk.utils;

import android.os.Bundle;
import l.C8954;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            return -1;
        }
        try {
            return bundle.getInt(str, -1);
        } catch (Exception e) {
            C8954.m23075(e, new StringBuilder("getIntExtra exception:"), "MicroMsg.IntentUtil");
            return -1;
        }
    }

    public static String b(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getString(str);
        } catch (Exception e) {
            C8954.m23075(e, new StringBuilder("getStringExtra exception:"), "MicroMsg.IntentUtil");
            return null;
        }
    }
}
