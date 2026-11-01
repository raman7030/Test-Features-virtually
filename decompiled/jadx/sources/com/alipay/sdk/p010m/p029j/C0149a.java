package com.alipay.sdk.p010m.p029j;

import com.alipay.sdk.p010m.p027i.C0142a;
import com.alipay.sdk.p010m.p027i.C0144c;

/* JADX INFO: renamed from: com.alipay.sdk.m.j.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0149a extends C0142a {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ boolean f500d = true;

    public C0149a(byte[] bArr) {
        super(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static C0149a m716a(String str, long j, AbstractC0150b abstractC0150b, short s, AbstractC0153e abstractC0153e) {
        byte[] bArrM698a = C0144c.m698a((byte) 1);
        boolean z = f500d;
        if (!z && bArrM698a.length != 1) {
            throw new AssertionError();
        }
        byte[] bArrM700a = C0144c.m700a(str.charAt(0), str.charAt(1));
        if (!z && bArrM700a.length != 2) {
            throw new AssertionError();
        }
        byte[] bArrM702a = C0144c.m702a(j);
        if (!z && bArrM702a.length != 8) {
            throw new AssertionError();
        }
        byte[] bArrM706b = C0144c.m706b();
        if (!z && bArrM706b.length != 2) {
            throw new AssertionError();
        }
        abstractC0150b.mo718a();
        byte[] bArrM698a2 = C0144c.m698a(abstractC0150b.f503a);
        if (!z && bArrM698a2.length != 1) {
            throw new AssertionError();
        }
        byte[] bArrM698a3 = C0144c.m698a(abstractC0150b.f504b);
        if (!z && bArrM698a3.length != 1) {
            throw new AssertionError();
        }
        byte[] bArr = (byte[]) abstractC0150b.f505c.clone();
        if (!z && bArr.length != (abstractC0150b.f504b & 255)) {
            throw new AssertionError();
        }
        byte[] bArrM703a = C0144c.m703a(s);
        if (!z && bArrM703a.length != 2) {
            throw new AssertionError();
        }
        byte[] bArrM706b2 = C0144c.m706b();
        if (!z && bArrM706b2.length != 2) {
            throw new AssertionError();
        }
        abstractC0153e.mo719a();
        byte[] bArrM698a4 = C0144c.m698a(abstractC0153e.f507a);
        if (!z && bArrM698a4.length != 1) {
            throw new AssertionError();
        }
        byte[] bArr2 = (byte[]) abstractC0153e.f508b.clone();
        if (!z && bArr2.length != (abstractC0153e.f507a & 255)) {
            throw new AssertionError();
        }
        byte[] bArrM707c = C0144c.m707c();
        if (z || bArrM707c.length == 4) {
            return new C0149a(C0144c.m704a(bArrM698a, bArrM700a, bArrM702a, bArrM706b, bArrM698a2, bArrM698a3, bArr, bArrM703a, bArrM706b2, bArrM698a4, bArr2, bArrM707c));
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: c */
    public static C0149a m717c() {
        try {
            return m716a(C0142a.f484c, 0L, new C0151c(""), (short) 0, new C0154f());
        } catch (Exception unused) {
            return null;
        }
    }
}
