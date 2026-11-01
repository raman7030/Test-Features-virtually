package com.umeng.umzid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.idtracking.C0808g;
import com.umeng.commonsdk.statistics.idtracking.C0809h;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.umeng.umzid.c */
/* JADX INFO: loaded from: classes.dex */
public class C0841c {
    /* JADX INFO: renamed from: a */
    public static String m3329a(Context context) {
        SharedPreferences sharedPreferencesM3325a;
        if (context == null || (sharedPreferencesM3325a = C0839a.m3325a(context)) == null) {
            return null;
        }
        return sharedPreferencesM3325a.getString("aaid", null);
    }

    /* JADX INFO: renamed from: a */
    public static String m3330a(String str) {
        try {
            return new String(Base64.decode(str.getBytes(C0233a.f1077D), 2));
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3331a(Context context, String str) {
        SharedPreferences sharedPreferencesM3325a;
        SharedPreferences.Editor editorEdit;
        String strM3333b = m3333b(str);
        if (context == null || strM3333b == null || TextUtils.isEmpty(strM3333b) || (sharedPreferencesM3325a = C0839a.m3325a(context)) == null || (editorEdit = sharedPreferencesM3325a.edit()) == null) {
            return;
        }
        editorEdit.putString(C0808g.f3432a, strM3333b).commit();
    }

    /* JADX INFO: renamed from: b */
    public static String m3332b(Context context) {
        try {
            String str = DeviceConfig.UNKNOW;
            Method declaredMethod = DeviceConfig.class.getDeclaredMethod("getMac", Context.class);
            if (declaredMethod == null) {
                return "";
            }
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(DeviceConfig.class, context);
            return (objInvoke == null || !(objInvoke instanceof String)) ? "" : (String) objInvoke;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m3333b(String str) {
        try {
            return Base64.encodeToString(str.getBytes(C0233a.f1077D), 2);
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3334b(Context context, String str) {
        SharedPreferences sharedPreferencesM3325a;
        SharedPreferences.Editor editorEdit;
        String strM3333b = m3333b(str);
        if (context == null || strM3333b == null || TextUtils.isEmpty(strM3333b) || (sharedPreferencesM3325a = C0839a.m3325a(context)) == null || (editorEdit = sharedPreferencesM3325a.edit()) == null) {
            return;
        }
        editorEdit.putString(C0809h.f3437d, strM3333b).commit();
    }

    /* JADX INFO: renamed from: c */
    public static String m3335c(Context context) {
        try {
            String str = DeviceConfig.UNKNOW;
            Method declaredMethod = DeviceConfig.class.getDeclaredMethod("getOaid", Context.class);
            if (declaredMethod == null) {
                return "";
            }
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(DeviceConfig.class, context);
            return (objInvoke == null || !(objInvoke instanceof String)) ? "" : (String) objInvoke;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3336c(Context context, String str) {
        SharedPreferences sharedPreferencesM3325a;
        SharedPreferences.Editor editorEdit;
        if (context == null || TextUtils.isEmpty(str) || (sharedPreferencesM3325a = C0839a.m3325a(context)) == null || (editorEdit = sharedPreferencesM3325a.edit()) == null) {
            return;
        }
        editorEdit.putString("resetToken", str).commit();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3337c(String str) {
        return !TextUtils.isEmpty(str) && str.equals(m3333b(m3330a(str)));
    }

    /* JADX INFO: renamed from: d */
    public static void m3338d(Context context, String str) {
        SharedPreferences sharedPreferencesM3325a;
        SharedPreferences.Editor editorEdit;
        if (context == null || TextUtils.isEmpty(str) || (sharedPreferencesM3325a = C0839a.m3325a(context)) == null || (editorEdit = sharedPreferencesM3325a.edit()) == null) {
            return;
        }
        editorEdit.putString("uabc", str).commit();
    }

    /* JADX INFO: renamed from: e */
    public static void m3339e(Context context, String str) {
        SharedPreferences sharedPreferencesM3325a;
        SharedPreferences.Editor editorEdit;
        if (context == null || str == null || TextUtils.isEmpty(str) || (sharedPreferencesM3325a = C0839a.m3325a(context)) == null || (editorEdit = sharedPreferencesM3325a.edit()) == null) {
            return;
        }
        editorEdit.putString("aaid", str).commit();
    }

    /* JADX INFO: renamed from: f */
    public static void m3340f(Context context, String str) {
        SharedPreferences sharedPreferencesM3325a;
        SharedPreferences.Editor editorEdit;
        if (context == null || str == null || TextUtils.isEmpty(str) || (sharedPreferencesM3325a = C0839a.m3325a(context)) == null || (editorEdit = sharedPreferencesM3325a.edit()) == null) {
            return;
        }
        editorEdit.putString("zdata", str).commit();
    }
}
