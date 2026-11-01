package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.analytics.pro.C0655am;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.internal.a */
/* JADX INFO: compiled from: M46Z */
/* JADX INFO: loaded from: classes.dex */
public class C0814a {

    /* JADX INFO: renamed from: a */
    public static Context f3443a;

    /* JADX INFO: renamed from: b */
    public String f3444b;

    /* JADX INFO: renamed from: c */
    public String f3445c;

    public C0814a() {
        this.f3444b = null;
        this.f3445c = null;
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.internal.a$a */
    /* JADX INFO: compiled from: M46Z */
    public class a {

        /* JADX INFO: renamed from: a */
        public static final C0814a f3446a = new C0814a();
    }

    /* JADX INFO: renamed from: a */
    public static C0814a m3088a(Context context) {
        if (f3443a == null && context != null) {
            f3443a = context.getApplicationContext();
        }
        return a.f3446a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m3092a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(C0655am.f2320av);
    }

    /* JADX INFO: renamed from: b */
    public boolean m3094b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(C0655am.f2281aI);
    }

    /* JADX INFO: renamed from: c */
    public boolean m3095c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(C0655am.f2276aD);
    }

    /* JADX INFO: renamed from: d */
    public boolean m3096d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(C0655am.f2279aG);
    }

    /* JADX INFO: renamed from: e */
    public void m3097e(String str) {
        String strSubstring = str.substring(0, str.indexOf(95));
        m3090g(strSubstring);
        m3089f(strSubstring);
    }

    /* JADX INFO: renamed from: f */
    private void m3089f(String str) {
        try {
            this.f3444b = str.replaceAll("&=", " ").replaceAll("&&", " ").replaceAll("==", "/") + "/Android/" + Build.DISPLAY + "/" + Build.MODEL + "/" + Build.VERSION.RELEASE + " " + HelperUtils.getUmengMD5(UMUtils.getAppkey(f3443a));
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f3443a, th);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m3090g(String str) {
        try {
            String str2 = str.split("&&")[0];
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            String[] strArrSplit = str2.split("&=");
            StringBuilder sb = new StringBuilder();
            sb.append(C0655am.f2289aQ);
            for (String str3 : strArrSplit) {
                if (!TextUtils.isEmpty(str3)) {
                    String strSubstring = str3.substring(0, 2);
                    if (strSubstring.endsWith("=")) {
                        strSubstring = strSubstring.replace("=", "");
                    }
                    sb.append(strSubstring);
                }
            }
            this.f3445c = sb.toString();
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f3443a, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public String m3091a() {
        return this.f3445c;
    }

    /* JADX INFO: renamed from: b */
    public String m3093b() {
        return this.f3444b;
    }
}
