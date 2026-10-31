package com.alipay.apmobilesecuritysdk.f;

import java.util.LinkedList;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public static b a = new b();
    public Thread b = null;
    public LinkedList c = new LinkedList();

    public static b a() {
        return a;
    }

    public synchronized void a(Runnable runnable) {
        this.c.add(runnable);
        if (this.b == null) {
            Thread thread = new Thread(new c(this));
            this.b = thread;
            thread.start();
        }
    }
}
