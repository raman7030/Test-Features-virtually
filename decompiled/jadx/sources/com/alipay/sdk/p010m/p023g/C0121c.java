package com.alipay.sdk.p010m.p023g;

import java.lang.reflect.Type;
import java.util.Date;

/* JADX INFO: renamed from: com.alipay.sdk.m.g.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0121c implements InterfaceC0127i, InterfaceC0128j {
    @Override // com.alipay.sdk.p010m.p023g.InterfaceC0128j
    /* JADX INFO: renamed from: a */
    public Object mo659a(Object obj) {
        return Long.valueOf(((Date) obj).getTime());
    }

    @Override // com.alipay.sdk.p010m.p023g.InterfaceC0127i
    /* JADX INFO: renamed from: a */
    public Object mo660a(Object obj, Type type) {
        return new Date(((Long) obj).longValue());
    }

    @Override // com.alipay.sdk.p010m.p023g.InterfaceC0127i, com.alipay.sdk.p010m.p023g.InterfaceC0128j
    /* JADX INFO: renamed from: a */
    public boolean mo661a(Class cls) {
        return Date.class.isAssignableFrom(cls);
    }
}
