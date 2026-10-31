package l;

/* JADX INFO: renamed from: l.֫֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F9W6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1501 extends C5859 {

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C22792 f5352;

    @Override // l.C5859, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // l.C5859
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C12209 mo5164() {
        return this.f5352.m50868();
    }

    public C1501(C22792 c22792, C3618 c3618) {
        super(c22792.m50873(), c3618);
        this.f5352 = c22792;
    }

    @Override // l.C5859
    public final boolean isOpen() {
        return this.f5352.isOpen();
    }
}
