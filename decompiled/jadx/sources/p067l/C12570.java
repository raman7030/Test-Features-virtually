package p067l;

/* JADX INFO: renamed from: l.ۧۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6TT */
/* JADX INFO: loaded from: classes3.dex */
public final class C12570 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶ */
    public final int f35320;

    /* JADX INFO: renamed from: ᩸ */
    public final C14677 f35321;

    /* JADX INFO: renamed from: ᩹ */
    public final C7479 f35322;

    public C12570(C14677 c14677, int i, C7479 c7479) {
        this.f35321 = c14677;
        this.f35320 = i;
        this.f35322 = c7479;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f35322.close();
    }
}
