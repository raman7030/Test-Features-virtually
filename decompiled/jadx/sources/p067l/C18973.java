package p067l;

/* JADX INFO: renamed from: l.ܿܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70P */
/* JADX INFO: loaded from: classes4.dex */
public final class C18973 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f56578;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f56578) {
            return;
        }
        this.f56578 = true;
        if (C16290.f47887.decrementAndGet() >= 0) {
            return;
        }
        C16290.f47887.incrementAndGet();
        throw new IllegalStateException("Hex file channel count underflow");
    }
}
