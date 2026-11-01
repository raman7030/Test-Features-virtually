package com.alipay.apmobilesecuritysdk.p009f;

import java.util.LinkedList;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.f.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0063b {

    /* JADX INFO: renamed from: a */
    public static C0063b f191a = new C0063b();

    /* JADX INFO: renamed from: b */
    public Thread f192b = null;

    /* JADX INFO: renamed from: c */
    public LinkedList f193c = new LinkedList();

    /* JADX INFO: renamed from: a */
    public static C0063b m382a() {
        return f191a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m385a(Runnable runnable) {
        this.f193c.add(runnable);
        if (this.f192b == null) {
            Thread thread = new Thread(new RunnableC0064c(this));
            this.f192b = thread;
            thread.start();
        }
    }
}
