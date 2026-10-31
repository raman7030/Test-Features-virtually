package l;

/* JADX INFO: renamed from: l.᩺᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6UN */
/* JADX INFO: loaded from: classes.dex */
public final class C23287 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C2555 f74771 = new C2555(65536);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1143 f74772;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public char[] f74773;

    public C23287(C21605 c21605, int i) {
        char[] cArrM8091;
        C1143 c1143 = c21605 == null ? null : c21605.f69370;
        this.f74772 = c1143;
        if (c1143 != null) {
            this.f74773 = c1143.m3927(i);
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
            this.f74773 = C2555.f8087;
            return;
        }
        C2555 c2555 = f74771;
        synchronized (c2555) {
            cArrM8091 = c2555.m8091(i);
            this.f74773 = cArrM8091;
        }
        if (cArrM8091 == null) {
            this.f74773 = new char[i];
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char[] m51607() {
        char[] cArr = this.f74773;
        if (cArr != null) {
            return cArr;
        }
        throw new IllegalStateException("Text workspace is closed");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        char[] cArr = this.f74773;
        if (cArr == null) {
            return;
        }
        this.f74773 = null;
        C1143 c1143 = this.f74772;
        if (c1143 != null) {
            c1143.m3926(cArr);
        } else if (cArr.length != 0) {
            C2555 c2555 = f74771;
            synchronized (c2555) {
                c2555.m8090(cArr);
            }
        }
    }
}
