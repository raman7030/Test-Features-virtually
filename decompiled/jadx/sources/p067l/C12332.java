package p067l;

/* JADX INFO: renamed from: l.ۤᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6RY */
/* JADX INFO: loaded from: classes3.dex */
public final class C12332 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public C24301 f34415;

    /* JADX INFO: renamed from: ᩹ */
    public final C8308 f34416;

    public C12332(C8308 c8308, C24301 c24301) {
        this.f34416 = c8308;
        this.f34415 = c24301;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f34415 = null;
        this.f34416.close();
    }
}
