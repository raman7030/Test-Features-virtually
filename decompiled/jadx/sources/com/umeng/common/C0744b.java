package com.umeng.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;

/* JADX INFO: renamed from: com.umeng.common.b */
/* JADX INFO: compiled from: 7461 */
/* JADX INFO: loaded from: classes.dex */
public final class C0744b {

    /* JADX INFO: renamed from: a */
    public static C0744b f3028a = null;

    /* JADX INFO: renamed from: b */
    public static Context f3029b = null;

    /* JADX INFO: renamed from: c */
    public static String f3030c = null;

    /* JADX INFO: renamed from: d */
    public static final String f3031d = "mobclick_agent_user_";

    /* JADX INFO: renamed from: com.umeng.common.b$a */
    /* JADX INFO: compiled from: 7461 */
    public final class a {

        /* JADX INFO: renamed from: a */
        public static final C0744b f3032a = new C0744b();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C0744b m2703a(Context context) {
        if (f3029b == null && context != null) {
            f3029b = context.getApplicationContext();
        }
        if (f3029b != null) {
            f3030c = context.getPackageName();
        }
        return a.f3032a;
    }

    /* JADX INFO: renamed from: a */
    public void m2710a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SharedPreferences.Editor editorEdit = m2707e().edit();
        editorEdit.putString("au_p", str);
        editorEdit.putString("au_u", str2);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: a */
    public String[] m2711a() {
        SharedPreferences sharedPreferencesM2707e = m2707e();
        if (sharedPreferencesM2707e != null) {
            String string = sharedPreferencesM2707e.getString("au_p", null);
            String string2 = sharedPreferencesM2707e.getString("au_u", null);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                return new String[]{string, string2};
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m2712b() {
        SharedPreferences sharedPreferencesM2707e = m2707e();
        if (sharedPreferencesM2707e != null) {
            sharedPreferencesM2707e.edit().remove("au_p").remove("au_u").commit();
        }
    }

    /* JADX INFO: renamed from: c */
    public String m2713c() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f3029b);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("st", null);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m2709a(String str) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f3029b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("st", str).commit();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2708a(int i) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f3029b);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt("vt", i).commit();
        }
    }

    /* JADX INFO: renamed from: d */
    public int m2714d() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f3029b);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("vt", 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    private SharedPreferences m2707e() {
        Context context = f3029b;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("mobclick_agent_user_" + f3030c, 0);
    }

    /* JADX INFO: renamed from: a */
    public static String m2704a(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        return (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0)) == null) ? "" : sharedPreferences.getString(str2, "");
    }

    /* JADX INFO: renamed from: a */
    public static void m2706a(Context context, String str, String str2, String str3) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0)) == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        editorEdit.putString(str2, str3);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: a */
    public static void m2705a(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getApplicationContext().getSharedPreferences(str, 0).edit();
        editorEdit.remove(AnalyticsConfig.DEBUG_KEY);
        editorEdit.remove(AnalyticsConfig.RTD_PERIOD);
        editorEdit.remove(AnalyticsConfig.RTD_START_TIME);
        editorEdit.clear();
        editorEdit.commit();
    }
}
