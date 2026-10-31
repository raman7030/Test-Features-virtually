package l;

/* JADX INFO: renamed from: l.ۤᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6RY */
/* JADX INFO: loaded from: classes3.dex */
public final class C10483 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23077 f31451;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6249 f31452;

    public C10483(C6249 c6249, C23077 c23077) {
        this.f31452 = c6249;
        this.f31451 = c23077;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f31451 = null;
        this.f31452.close();
    }
}
