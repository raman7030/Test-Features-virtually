package p067l;

/* JADX INFO: renamed from: l.ۙ֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06PO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6490 implements AutoCloseable, InterfaceC18588 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ AbstractC5149 f16780;

    /* JADX INFO: renamed from: ۙ */
    public final CharSequence f16781;

    /* JADX INFO: renamed from: ᩶ */
    public final C9729 f16782;

    /* JADX INFO: renamed from: ᩸ */
    public final long f16783;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC21243 f16784;

    public C6490(AbstractC5149 abstractC5149, long j, CharSequence charSequence, C9729 c9729, InterfaceC21243 interfaceC21243) {
        this.f16780 = abstractC5149;
        this.f16783 = j;
        this.f16781 = charSequence;
        this.f16782 = c9729;
        this.f16784 = interfaceC21243;
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        AbstractC5149 abstractC5149 = this.f16780;
        return abstractC5149.f12104 || this.f16783 != abstractC5149.f12096;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C9729 c9729 = this.f16782;
        if (c9729 != null) {
            c9729.close();
        }
    }
}
