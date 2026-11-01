package p067l;

/* JADX INFO: renamed from: l.᩶ܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H4EU */
/* JADX INFO: loaded from: classes4.dex */
public final class C21645 extends Thread {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
    
        r1.mo15804();
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        while (true) {
            try {
                synchronized (C6892.class) {
                    C6892 c6892M15800 = C6892.m15800();
                    if (c6892M15800 != null) {
                        if (c6892M15800 == C6892.f17949) {
                            C6892.f17949 = null;
                            return;
                        }
                    }
                }
            } catch (InterruptedException unused) {
            }
        }
    }
}
