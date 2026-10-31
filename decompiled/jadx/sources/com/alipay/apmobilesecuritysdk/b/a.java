package com.alipay.apmobilesecuritysdk.b;

import com.alipay.sdk.m.i0.d;
import l.C16014;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static a b = new a();
    public int a = 0;

    public static a a() {
        return b;
    }

    private String a(String str, String str2) {
        return C16014.m37867(str, str2);
    }

    public void a(int i) {
        this.a = i;
    }

    public int b() {
        return this.a;
    }

    public String c() {
        String str;
        String strA = d.a();
        if (com.alipay.sdk.m.d0.a.b(strA)) {
            return strA;
        }
        int i = this.a;
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
        return a(com.alipay.sdk.m.n.a.s, str);
    }
}
