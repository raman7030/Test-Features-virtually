package l;

import android.os.Process;

/* JADX INFO: renamed from: l.ۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB1R */
/* JADX INFO: loaded from: classes2.dex */
public final class C6692 extends Thread {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f20797;

    public C6692(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f20797 = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f20797);
        super.run();
    }
}
