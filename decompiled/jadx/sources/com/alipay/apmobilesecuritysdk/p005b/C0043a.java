package com.alipay.apmobilesecuritysdk.p005b;

import com.alipay.sdk.p010m.p018d0.C0106a;
import com.alipay.sdk.p010m.p028i0.C0148d;
import com.alipay.sdk.p010m.p037n.C0170a;
import p067l.C17588;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.b.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0043a {

    /* JADX INFO: renamed from: b */
    public static C0043a f167b = new C0043a();

    /* JADX INFO: renamed from: a */
    public int f168a = 0;

    /* JADX INFO: renamed from: a */
    public static C0043a m284a() {
        return f167b;
    }

    /* JADX INFO: renamed from: a */
    private String m285a(String str, String str2) {
        return C17588.m40053(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public void m286a(int i) {
        this.f168a = i;
    }

    /* JADX INFO: renamed from: b */
    public int m287b() {
        return this.f168a;
    }

    /* JADX INFO: renamed from: c */
    public String m288c() {
        String str;
        String strM714a = C0148d.m714a();
        if (C0106a.m567b(strM714a)) {
            return strM714a;
        }
        int i = this.f168a;
        if (i == 1) {
            str = "://mobilegw.stable.alipay.net/mgw.htm";
        } else {
            if (i == 2) {
                return "https://mobilegwpre.alipay.com/mgw.htm";
            }
            if (i == 3) {
                str = "://mobilegw-1-64.test.alipay.net/mgw.htm";
            } else {
                if (i != 4) {
                    return "https://mobilegw.alipay.com/mgw.htm";
                }
                str = "://mobilegw.aaa.alipay.net/mgw.htm";
            }
        }
        return m285a(C0170a.f680s, str);
    }
}
