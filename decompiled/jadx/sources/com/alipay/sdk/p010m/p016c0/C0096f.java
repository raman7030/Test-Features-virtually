package com.alipay.sdk.p010m.p016c0;

import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: renamed from: com.alipay.sdk.m.c0.f */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0096f {

    /* JADX INFO: renamed from: a */
    public Stack f437a = new Stack();

    /* JADX INFO: renamed from: a */
    public void m552a(C0095e c0095e) {
        this.f437a.push(c0095e);
    }

    /* JADX INFO: renamed from: b */
    public boolean m553b() {
        return this.f437a.isEmpty();
    }

    /* JADX INFO: renamed from: c */
    public C0095e m554c() {
        return (C0095e) this.f437a.pop();
    }

    /* JADX INFO: renamed from: a */
    public void m551a() {
        if (m553b()) {
            return;
        }
        Iterator it = this.f437a.iterator();
        while (it.hasNext()) {
            ((C0095e) it.next()).m546b();
        }
        this.f437a.clear();
    }
}
