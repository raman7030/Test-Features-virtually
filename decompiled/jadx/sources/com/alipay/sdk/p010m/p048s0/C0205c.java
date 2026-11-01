package com.alipay.sdk.p010m.p048s0;

import android.content.Context;
import com.alipay.sdk.p010m.p044q0.C0194d;
import com.alipay.sdk.p010m.p044q0.C0196f;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: com.alipay.sdk.m.s0.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0205c {

    /* JADX INFO: renamed from: a */
    public static C0204b f960a;

    /* JADX INFO: renamed from: b */
    public static final Object f961b = new Object();

    /* JADX INFO: renamed from: a */
    public static long m996a(C0204b c0204b) {
        if (c0204b == null) {
            return 0L;
        }
        String str = c0204b.m991c() + c0204b.m993d() + c0204b.m985a() + c0204b.m995e() + c0204b.m988b();
        if (C0196f.m948b(str)) {
            return 0L;
        }
        Adler32 adler32 = new Adler32();
        adler32.reset();
        adler32.update(str.getBytes());
        return adler32.getValue();
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C0204b m998b(Context context) {
        C0204b c0204b = f960a;
        if (c0204b != null) {
            return c0204b;
        }
        if (context == null) {
            return null;
        }
        C0204b c0204bM997a = m997a(context);
        f960a = c0204bM997a;
        return c0204bM997a;
    }

    /* JADX INFO: renamed from: a */
    public static C0204b m997a(Context context) {
        if (context == null) {
            return null;
        }
        synchronized (f961b) {
            String strM1008e = C0206d.m999a(context).m1008e();
            if (C0196f.m948b(strM1008e)) {
                return null;
            }
            if (strM1008e.endsWith("\n")) {
                strM1008e = strM1008e.substring(0, strM1008e.length() - 1);
            }
            C0204b c0204b = new C0204b();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strM940a = C0194d.m940a(context);
            String strM942b = C0194d.m942b(context);
            c0204b.m992c(strM940a);
            c0204b.m987a(strM940a);
            c0204b.m989b(jCurrentTimeMillis);
            c0204b.m990b(strM942b);
            c0204b.m994d(strM1008e);
            c0204b.m986a(m996a(c0204b));
            return c0204b;
        }
    }
}
