package com.alipay.sdk.p010m.p053v;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.alipay.sdk.m.v.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0230a {
    None("none"),
    WapPay("js://wappay"),
    Update("js://update"),
    OpenWeb("loc:openweb"),
    SetResult("loc:setResult"),
    Exit("loc:exit"),
    LocalWebPay("js://localWebPay");


    /* JADX INFO: renamed from: a */
    public String f1062a;

    EnumC0230a(String str) {
        this.f1062a = str;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC0230a m1074a(String str) {
        if (TextUtils.isEmpty(str)) {
            return None;
        }
        EnumC0230a enumC0230a = None;
        for (EnumC0230a enumC0230a2 : values()) {
            if (str.startsWith(enumC0230a2.f1062a)) {
                return enumC0230a2;
            }
        }
        return enumC0230a;
    }
}
