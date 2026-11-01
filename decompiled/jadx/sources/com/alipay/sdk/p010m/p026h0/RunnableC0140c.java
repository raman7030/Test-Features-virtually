package com.alipay.sdk.p010m.p026h0;

/* JADX INFO: renamed from: com.alipay.sdk.m.h0.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0140c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0139b f479a;

    public RunnableC0140c(C0139b c0139b) {
        this.f479a = c0139b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f479a.m687a();
        } catch (Exception e) {
            C0141d.m691a(e);
        }
    }
}
