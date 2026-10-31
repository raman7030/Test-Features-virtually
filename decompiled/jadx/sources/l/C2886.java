package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ۗ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2886 extends AbstractC0436 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC3163 f9213;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 f9214;

    public C2886(AbstractC3163 abstractC3163, InterfaceC17889 interfaceC17889, String str, long j) {
        super(str, j, Long.valueOf(j));
        this.f9213 = abstractC3163;
        this.f9214 = interfaceC17889;
    }

    @Override // l.AbstractC0436
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo1993() {
        return this.f9213.mo9681(0L, this.f9214.getPath());
    }
}
