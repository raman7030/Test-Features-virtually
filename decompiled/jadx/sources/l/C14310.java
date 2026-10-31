package l;

/* JADX INFO: renamed from: l.ܳۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K5JX */
/* JADX INFO: loaded from: classes3.dex */
public final class C14310 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16427 f43144;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f43145;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m34147() {
        while (!this.f43145) {
            this.f43144.getClass();
            wait();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m34150() {
        this.f43145 = false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m34151() {
        if (this.f43145) {
            return false;
        }
        this.f43145 = true;
        notifyAll();
        return true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m34152() {
        return this.f43145;
    }

    public C14310() {
        this(InterfaceC16427.f50519);
    }

    public C14310(InterfaceC16427 interfaceC16427) {
        this.f43144 = interfaceC16427;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m34149() {
        boolean z = false;
        while (!this.f43145) {
            try {
                this.f43144.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m34148(long j) {
        try {
            if (j <= 0) {
                return this.f43145;
            }
            long jMo33834 = this.f43144.mo33834();
            long j2 = j + jMo33834;
            if (j2 < jMo33834) {
                m34149();
            } else {
                boolean z = false;
                while (!this.f43145 && jMo33834 < j2) {
                    try {
                        this.f43144.getClass();
                        wait(j2 - jMo33834);
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                    jMo33834 = this.f43144.mo33834();
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.f43145;
        } catch (Throwable th) {
            throw th;
        }
    }
}
