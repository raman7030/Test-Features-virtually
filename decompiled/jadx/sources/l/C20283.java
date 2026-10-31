package l;

/* JADX INFO: renamed from: l.᩶ܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H4EU */
/* JADX INFO: loaded from: classes4.dex */
public final class C20283 extends Thread {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
    
        r1.mo13924();
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        while (true) {
            try {
                synchronized (C4760.class) {
                    C4760 c4760M13920 = C4760.m13920();
                    if (c4760M13920 != null) {
                        if (c4760M13920 == C4760.f15119) {
                            C4760.f15119 = null;
                            return;
                        }
                    }
                }
            } catch (InterruptedException unused) {
            }
        }
    }
}
