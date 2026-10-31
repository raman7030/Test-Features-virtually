package l;

/* JADX INFO: renamed from: l.ܰ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C14133 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f42616;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f42617;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C16765 f42618;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f42619;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f42620;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f42621;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C11041 f42622;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f42623;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f42624;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C18177 f42625;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m33732() {
        if (this.f42624 || this.f42617) {
            throw new IllegalStateException("Copy request is already consumed");
        }
        this.f42617 = true;
    }

    public C14133(C11041 c11041, C18177 c18177, long j, int i, int i2, long j2, C16765 c16765) {
        this.f42622 = c11041;
        this.f42625 = c18177;
        this.f42616 = j;
        this.f42619 = i;
        this.f42623 = i2;
        this.f42621 = j2;
        this.f42618 = c16765;
    }

    public final int length() {
        long j = (((long) this.f42623) - ((long) this.f42619)) + 1;
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m33733() {
        synchronized (this) {
            if (this.f42620) {
                return;
            }
            this.f42620 = true;
            this.f42618.close();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f42624) {
                return;
            }
            this.f42624 = true;
            m33733();
        }
    }
}
