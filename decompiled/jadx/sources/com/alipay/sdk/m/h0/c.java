package com.alipay.sdk.m.h0;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class c implements Runnable {
    public final /* synthetic */ b a;

    public c(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.a.a();
        } catch (Exception e) {
            d.a(e);
        }
    }
}
