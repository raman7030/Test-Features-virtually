package p067l;

/* JADX INFO: renamed from: l.ܰ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C15801 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final long f45702;

    /* JADX INFO: renamed from: ۙ */
    public boolean f45703;

    /* JADX INFO: renamed from: ۛ */
    public final C18302 f45704;

    /* JADX INFO: renamed from: ۤ */
    public final int f45705;

    /* JADX INFO: renamed from: ۨ */
    public boolean f45706;

    /* JADX INFO: renamed from: ۫ */
    public final long f45707;

    /* JADX INFO: renamed from: ۬ */
    public final C12862 f45708;

    /* JADX INFO: renamed from: ᩶ */
    public final int f45709;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f45710;

    /* JADX INFO: renamed from: ᩹ */
    public final C19644 f45711;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m35864() {
        if (this.f45710 || this.f45703) {
            throw new IllegalStateException("Copy request is already consumed");
        }
        this.f45703 = true;
    }

    public C15801(C12862 c12862, C19644 c19644, long j, int i, int i2, long j2, C18302 c18302) {
        this.f45708 = c12862;
        this.f45711 = c19644;
        this.f45702 = j;
        this.f45705 = i;
        this.f45709 = i2;
        this.f45707 = j2;
        this.f45704 = c18302;
    }

    public final int length() {
        long j = (((long) this.f45709) - ((long) this.f45705)) + 1;
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m35865() {
        synchronized (this) {
            if (this.f45706) {
                return;
            }
            this.f45706 = true;
            this.f45704.close();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f45710) {
                return;
            }
            this.f45710 = true;
            m35865();
        }
    }
}
