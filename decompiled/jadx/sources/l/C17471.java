package l;

/* JADX INFO: renamed from: l.ܿܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70P */
/* JADX INFO: loaded from: classes4.dex */
public final class C17471 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f53391;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f53391) {
            return;
        }
        this.f53391 = true;
        if (C14648.f44780.decrementAndGet() >= 0) {
            return;
        }
        C14648.f44780.incrementAndGet();
        throw new IllegalStateException("Hex file channel count underflow");
    }
}
