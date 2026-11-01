package p067l;

/* JADX INFO: renamed from: l.ۤ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6V3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12432 implements AutoCloseable {

    /* JADX INFO: renamed from: ۙ */
    public final C24501 f34757;

    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC21820 f34758;

    /* JADX INFO: renamed from: ᩸ */
    public final char[] f34759;

    /* JADX INFO: renamed from: ᩹ */
    public final int f34760;

    public C12432(char[] cArr, AbstractC21820 abstractC21820, int i, C24501 c24501) {
        this.f34757 = c24501;
        this.f34759 = cArr;
        this.f34758 = abstractC21820;
        this.f34760 = i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C24501 c24501 = this.f34757;
        if (c24501 != null) {
            c24501.close();
        }
    }
}
