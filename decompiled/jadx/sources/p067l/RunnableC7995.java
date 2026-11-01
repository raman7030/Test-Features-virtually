package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4DP */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC7995 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C12516 f21008;

    public RunnableC7995(C12516 c12516) {
        this.f21008 = c12516;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f21008) {
            C12516 c12516 = this.f21008;
            if ((!c12516.f35102) || c12516.f35112) {
                return;
            }
            try {
                c12516.m28840();
            } catch (IOException unused) {
                this.f21008.f35109 = true;
            }
            try {
                if (this.f21008.m28841()) {
                    this.f21008.m28842();
                    this.f21008.f35110 = 0;
                }
            } catch (IOException unused2) {
                C12516 c12517 = this.f21008;
                c12517.f35103 = true;
                c12517.f35107 = C25037.m54977(C25037.m54973());
            }
        }
    }
}
