package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֡᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0625 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11789 f2400;

    public /* synthetic */ RunnableC0625(C11789 c11789) {
        this.f2400 = c11789;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2400.close();
        } catch (IOException e) {
            throw new C13452(e);
        }
    }
}
