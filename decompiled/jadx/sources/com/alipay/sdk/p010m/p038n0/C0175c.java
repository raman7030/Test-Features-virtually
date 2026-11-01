package com.alipay.sdk.p010m.p038n0;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.alipay.sdk.m.n0.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0175c {

    /* JADX INFO: renamed from: a */
    public String f725a;

    /* JADX INFO: renamed from: b */
    public Boolean f726b;

    /* JADX INFO: renamed from: a */
    public void m808a(boolean z) {
        this.f726b = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m809a() {
        return this.f726b != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m810a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(this.f725a, str);
    }

    /* JADX INFO: renamed from: b */
    public void m811b(String str) {
        this.f725a = str;
    }

    /* JADX INFO: renamed from: b */
    public boolean m812b() {
        Boolean bool = this.f726b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
