package l;

/* JADX INFO: renamed from: l.ۙ֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06PO */
/* JADX INFO: loaded from: classes3.dex */
public final class C4337 implements AutoCloseable, InterfaceC17066 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC2926 f13966;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence f13967;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7744 f13968;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f13969;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC19860 f13970;

    public C4337(AbstractC2926 abstractC2926, long j, CharSequence charSequence, C7744 c7744, InterfaceC19860 interfaceC19860) {
        this.f13966 = abstractC2926;
        this.f13969 = j;
        this.f13967 = charSequence;
        this.f13968 = c7744;
        this.f13970 = interfaceC19860;
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        AbstractC2926 abstractC2926 = this.f13966;
        return abstractC2926.f9305 || this.f13969 != abstractC2926.f9297;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C7744 c7744 = this.f13968;
        if (c7744 != null) {
            c7744.close();
        }
    }
}
