package com.alipay.apmobilesecuritysdk.p009f;

import android.os.Process;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.f.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0064c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0063b f194a;

    public RunnableC0064c(C0063b c0063b) {
        this.f194a = c0063b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Process.setThreadPriority(0);
            while (!this.f194a.f193c.isEmpty()) {
                Runnable runnable = (Runnable) this.f194a.f193c.get(0);
                this.f194a.f193c.remove(0);
                if (runnable != null) {
                    runnable.run();
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f194a.f192b = null;
            throw th;
        }
        this.f194a.f192b = null;
    }
}
