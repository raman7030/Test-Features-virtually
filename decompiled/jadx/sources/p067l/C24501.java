package p067l;

/* JADX INFO: renamed from: l.᩺᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6UN */
/* JADX INFO: loaded from: classes.dex */
public final class C24501 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶ */
    public static final C4797 f77515 = new C4797(65536);

    /* JADX INFO: renamed from: ᩸ */
    public final C3455 f77516;

    /* JADX INFO: renamed from: ᩹ */
    public char[] f77517;

    public C24501(C22902 c22902, int i) {
        char[] cArrM10123;
        C3455 c3455 = c22902 == null ? null : c22902.f72073;
        this.f77516 = c3455;
        if (c3455 != null) {
            this.f77517 = c3455.m6168(i);
            return;
        }
        if (i < 0) {
            throw new IllegalArgumentException("Negative workspace length");
        }
        if (i != 0 && i <= 8192) {
            int i2 = 16;
            while (i2 < i) {
                i2 <<= 1;
            }
            i = i2;
        }
        if (i == 0) {
            this.f77517 = C4797.f10877;
            return;
        }
        C4797 c4797 = f77515;
        synchronized (c4797) {
            cArrM10123 = c4797.m10123(i);
            this.f77517 = cArrM10123;
        }
        if (cArrM10123 == null) {
            this.f77517 = new char[i];
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final char[] m54003() {
        char[] cArr = this.f77517;
        if (cArr != null) {
            return cArr;
        }
        throw new IllegalStateException("Text workspace is closed");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        char[] cArr = this.f77517;
        if (cArr == null) {
            return;
        }
        this.f77517 = null;
        C3455 c3455 = this.f77516;
        if (c3455 != null) {
            c3455.m6167(cArr);
        } else if (cArr.length != 0) {
            C4797 c4797 = f77515;
            synchronized (c4797) {
                c4797.m10122(cArr);
            }
        }
    }
}
