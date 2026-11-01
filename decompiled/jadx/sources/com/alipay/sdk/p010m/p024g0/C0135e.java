package com.alipay.sdk.p010m.p024g0;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* JADX INFO: renamed from: com.alipay.sdk.m.g0.e */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0135e {
    /* JADX INFO: renamed from: a */
    public static void m677a(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit;
        if (str3 == null || (editorEdit = context.getSharedPreferences(str, 0).edit()) == null) {
            return;
        }
        editorEdit.putString(str2, str3);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: a */
    public static void m678a(Context context, String str, Map map) {
        SharedPreferences.Editor editorEdit;
        if (map == null || (editorEdit = context.getSharedPreferences(str, 0).edit()) == null) {
            return;
        }
        for (String str2 : map.keySet()) {
            editorEdit.putString(str2, (String) map.get(str2));
        }
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: b */
    public static String m679b(Context context, String str, String str2, String str3) {
        return context.getSharedPreferences(str, 0).getString(str2, str3);
    }
}
