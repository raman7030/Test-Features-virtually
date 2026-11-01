package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֡᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2963 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C13573 f5173;

    public /* synthetic */ RunnableC2963(C13573 c13573) {
        this.f5173 = c13573;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f5173.close();
        } catch (IOException e) {
            throw new C15154(e);
        }
    }
}
