package l;

/* JADX INFO: renamed from: l.ۤ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6V3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10588 implements AutoCloseable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23287 f31787;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC20466 f31788;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final char[] f31789;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f31790;

    public C10588(char[] cArr, AbstractC20466 abstractC20466, int i, C23287 c23287) {
        this.f31787 = c23287;
        this.f31789 = cArr;
        this.f31788 = abstractC20466;
        this.f31790 = i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C23287 c23287 = this.f31787;
        if (c23287 != null) {
            c23287.close();
        }
    }
}
