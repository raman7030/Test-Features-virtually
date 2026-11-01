package p067l;

/* JADX INFO: renamed from: l.ܳۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K5JX */
/* JADX INFO: loaded from: classes3.dex */
public final class C15968 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC17980 f46236;

    /* JADX INFO: renamed from: ۧ */
    public boolean f46237;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m36280() {
        while (!this.f46237) {
            this.f46236.getClass();
            wait();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m36283() {
        this.f46237 = false;
    }

    /* JADX INFO: renamed from: ܿ */
    public final synchronized boolean m36284() {
        if (this.f46237) {
            return false;
        }
        this.f46237 = true;
        notifyAll();
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized boolean m36285() {
        return this.f46237;
    }

    public C15968() {
        this(InterfaceC17980.f53699);
    }

    public C15968(InterfaceC17980 interfaceC17980) {
        this.f46236 = interfaceC17980;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m36282() {
        boolean z = false;
        while (!this.f46237) {
            try {
                this.f46236.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m36281(long j) {
        try {
            if (j <= 0) {
                return this.f46237;
            }
            long jMo35966 = this.f46236.mo35966();
            long j2 = j + jMo35966;
            if (j2 < jMo35966) {
                m36282();
            } else {
                boolean z = false;
                while (!this.f46237 && jMo35966 < j2) {
                    try {
                        this.f46236.getClass();
                        wait(j2 - jMo35966);
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                    jMo35966 = this.f46236.mo35966();
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.f46237;
        } catch (Throwable th) {
            throw th;
        }
    }
}
