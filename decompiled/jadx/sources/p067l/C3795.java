package p067l;

/* JADX INFO: renamed from: l.֫֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F9W6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3795 extends C7937 {

    /* JADX INFO: renamed from: ᩳ֫ */
    public C24030 f8134;

    @Override // p067l.C7937, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p067l.C7937
    /* JADX INFO: renamed from: ֫ */
    public final synchronized C13972 mo7406() {
        return this.f8134.m53258();
    }

    public C3795(C24030 c24030, C5807 c5807) {
        super(c24030.m53263(), c5807);
        this.f8134 = c24030;
    }

    @Override // p067l.C7937
    public final boolean isOpen() {
        return this.f8134.isOpen();
    }
}
