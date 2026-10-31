package l;

import bin.mt.term.Exec;

/* JADX INFO: renamed from: l.ۧ᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1TZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11225 extends Thread {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17574 f33664;

    public C11225(C17574 c17574) {
        this.f33664 = c17574;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C17574 c17574 = this.f33664;
        c17574.f53708.sendMessage(c17574.f53708.obtainMessage(4, Integer.valueOf(Exec.waitFor(c17574.f53709))));
    }
}
