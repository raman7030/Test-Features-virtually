package com.alipay.apmobilesecuritysdk.p008e;

import android.content.Context;
import android.content.SharedPreferences;
import com.alipay.sdk.p010m.p018d0.C0106a;
import com.alipay.sdk.p010m.p020e0.C0111c;
import com.alipay.sdk.p010m.p024g0.C0135e;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.e.g */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0059g {
    /* JADX INFO: renamed from: a */
    public static synchronized String m338a(Context context, String str) {
        String strM679b = C0135e.m679b(context, "openapi_file_pri", "openApi" + str, "");
        if (C0106a.m564a(strM679b)) {
            return "";
        }
        String strM589b = C0111c.m589b(C0111c.m583a(), strM679b);
        return C0106a.m564a(strM589b) ? "" : strM589b;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m339a(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("openapi_file_pri", 0).edit();
        if (editorEdit != null) {
            editorEdit.clear();
            editorEdit.commit();
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m340a(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("openapi_file_pri", 0).edit();
            if (editorEdit != null) {
                editorEdit.putString("openApi" + str, C0111c.m584a(C0111c.m583a(), str2));
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m341b(Context context, String str) {
    }
}
