package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0003a implements InterfaceC0037w {

    /* JADX INFO: renamed from: a */
    public Method f70a;

    /* JADX INFO: renamed from: b */
    public byte[] f71b;

    /* JADX INFO: renamed from: c */
    public String f72c;

    /* JADX INFO: renamed from: d */
    public int f73d;

    /* JADX INFO: renamed from: e */
    public String f74e;

    /* JADX INFO: renamed from: f */
    public boolean f75f;

    public AbstractC0003a(Method method, int i, String str, byte[] bArr, String str2, boolean z) {
        this.f70a = method;
        this.f73d = i;
        this.f72c = str;
        this.f71b = bArr;
        this.f74e = str2;
        this.f75f = z;
    }
}
