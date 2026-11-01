package p067l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ۗ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5111 extends AbstractC2783 {

    /* JADX INFO: renamed from: ۫ */
    public final AbstractC5375 f12011;

    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC19370 f12012;

    public C5111(AbstractC5375 abstractC5375, InterfaceC19370 interfaceC19370, String str, long j) {
        super(str, j, Long.valueOf(j));
        this.f12011 = abstractC5375;
        this.f12012 = interfaceC19370;
    }

    @Override // p067l.AbstractC2783
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo4369() {
        return this.f12011.mo11725(0L, this.f12012.getPath());
    }
}
