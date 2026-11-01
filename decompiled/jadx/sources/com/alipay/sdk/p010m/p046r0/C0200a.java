package com.alipay.sdk.p010m.p046r0;

import android.content.Context;
import android.content.SharedPreferences;
import com.alipay.sdk.p010m.p044q0.C0196f;
import com.umeng.analytics.pro.C0655am;

/* JADX INFO: renamed from: com.alipay.sdk.m.r0.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0200a {

    /* JADX INFO: renamed from: a */
    public String f940a;

    /* JADX INFO: renamed from: b */
    public SharedPreferences f941b;

    /* JADX INFO: renamed from: c */
    public SharedPreferences.Editor f942c = null;

    /* JADX INFO: renamed from: d */
    public Context f943d;

    /* JADX INFO: renamed from: e */
    public boolean f944e;

    public C0200a(Context context, String str, String str2, boolean z, boolean z2) {
        this.f941b = null;
        this.f944e = z2;
        this.f940a = str2;
        this.f943d = context;
        if (context != null) {
            this.f941b = context.getSharedPreferences(str2, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m972a() {
        SharedPreferences sharedPreferences;
        if (this.f942c != null || (sharedPreferences = this.f941b) == null) {
            return;
        }
        this.f942c = sharedPreferences.edit();
    }

    /* JADX INFO: renamed from: b */
    public void m974b(String str) {
        if (C0196f.m948b(str) || str.equals(C0655am.f2281aI)) {
            return;
        }
        m972a();
        SharedPreferences.Editor editor = this.f942c;
        if (editor != null) {
            editor.remove(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m973a(String str, String str2) {
        if (C0196f.m948b(str) || str.equals(C0655am.f2281aI)) {
            return;
        }
        m972a();
        SharedPreferences.Editor editor = this.f942c;
        if (editor != null) {
            editor.putString(str, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX INFO: renamed from: b */
    public boolean m975b() {
        boolean z;
        Context context;
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editor = this.f942c;
        if (editor == null) {
            z = true;
        } else {
            if (!this.f944e && this.f941b != null) {
                editor.putLong(C0655am.f2281aI, jCurrentTimeMillis);
            }
            if (this.f942c.commit()) {
                z = true;
            } else {
                z = false;
            }
        }
        if (this.f941b != null && (context = this.f943d) != null) {
            this.f941b = context.getSharedPreferences(this.f940a, 0);
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public String m971a(String str) {
        SharedPreferences sharedPreferences = this.f941b;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!C0196f.m948b(string)) {
                return string;
            }
        }
        return "";
    }
}
