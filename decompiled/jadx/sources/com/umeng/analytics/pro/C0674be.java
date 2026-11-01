package com.umeng.analytics.pro;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import p067l.C21466;

/* JADX INFO: renamed from: com.umeng.analytics.pro.be */
/* JADX INFO: compiled from: G4R6 */
/* JADX INFO: loaded from: classes.dex */
public class C0674be {

    /* JADX INFO: renamed from: a */
    public final ByteArrayOutputStream f2462a;

    /* JADX INFO: renamed from: b */
    public final C0703cg f2463b;

    /* JADX INFO: renamed from: c */
    public AbstractC0690bu f2464c;

    public C0674be() {
        this(new C0684bo.a());
    }

    public C0674be(InterfaceC0692bw interfaceC0692bw) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f2462a = byteArrayOutputStream;
        C0703cg c0703cg = new C0703cg(byteArrayOutputStream);
        this.f2463b = c0703cg;
        this.f2464c = interfaceC0692bw.mo2402a(c0703cg);
    }

    /* JADX INFO: renamed from: a */
    public byte[] m2321a(InterfaceC0664av interfaceC0664av) {
        this.f2462a.reset();
        interfaceC0664av.write(this.f2464c);
        return this.f2462a.toByteArray();
    }

    /* JADX INFO: renamed from: a */
    public String m2320a(InterfaceC0664av interfaceC0664av, String str) throws C0671bb {
        try {
            return new String(m2321a(interfaceC0664av), str);
        } catch (UnsupportedEncodingException unused) {
            throw new C0671bb(C21466.m48631("JVM DOES NOT SUPPORT ENCODING: ", str));
        }
    }

    /* JADX INFO: renamed from: b */
    public String m2322b(InterfaceC0664av interfaceC0664av) {
        return new String(m2321a(interfaceC0664av));
    }
}
