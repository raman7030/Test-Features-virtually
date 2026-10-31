package com.alipay.apmobilesecuritysdk.f;

import android.os.Process;

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
            Process.setThreadPriority(0);
            while (!this.a.c.isEmpty()) {
                Runnable runnable = (Runnable) this.a.c.get(0);
                this.a.c.remove(0);
                if (runnable != null) {
                    runnable.run();
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.a.b = null;
            throw th;
        }
        this.a.b = null;
    }
}
