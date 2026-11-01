package p067l;

import android.os.Process;

/* JADX INFO: renamed from: l.ۜۤ */
/* JADX INFO: compiled from: DB1R */
/* JADX INFO: loaded from: classes2.dex */
public final class C1174 extends Thread {

    /* JADX INFO: renamed from: ᩸ */
    public final int f23672;

    public C1174(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f23672 = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f23672);
        super.run();
    }
}
