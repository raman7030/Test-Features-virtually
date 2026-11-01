package p067l;

import bin.p000mt.term.Exec;

/* JADX INFO: renamed from: l.ۧ᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13037 extends Thread {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C19071 f36663;

    public C13037(C19071 c19071) {
        this.f36663 = c19071;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C19071 c19071 = this.f36663;
        c19071.f56898.sendMessage(c19071.f56898.obtainMessage(4, Integer.valueOf(Exec.waitFor(c19071.f56899))));
    }
}
