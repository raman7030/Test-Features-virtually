package l;

/* JADX INFO: renamed from: l.ۧۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6TT */
/* JADX INFO: loaded from: classes3.dex */
public final class C10734 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f32347;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12951 f32348;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5377 f32349;

    public C10734(C12951 c12951, int i, C5377 c5377) {
        this.f32348 = c12951;
        this.f32347 = i;
        this.f32349 = c5377;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f32349.close();
    }
}
