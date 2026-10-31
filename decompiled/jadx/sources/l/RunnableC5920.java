package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4DP */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5920 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10678 f18154;

    public RunnableC5920(C10678 c10678) {
        this.f18154 = c10678;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f18154) {
            C10678 c10678 = this.f18154;
            if ((!c10678.f32131) || c10678.f32141) {
                return;
            }
            try {
                c10678.m26801();
            } catch (IOException unused) {
                this.f18154.f32138 = true;
            }
            try {
                if (this.f18154.m26802()) {
                    this.f18154.m26803();
                    this.f18154.f32139 = 0;
                }
            } catch (IOException unused2) {
                C10678 c10679 = this.f18154;
                c10679.f32132 = true;
                c10679.f32136 = C23852.m52568(C23852.m52564());
            }
        }
    }
}
