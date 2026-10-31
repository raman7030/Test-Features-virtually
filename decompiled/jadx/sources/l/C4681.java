package l;

/* JADX INFO: renamed from: l.ۙܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4681 extends AbstractC23826 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3270 f14872;

    @Override // l.AbstractC18182, l.InterfaceC15234
    public final int characteristics() {
        return 16721;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4681(C3270 c3270, int i, int i2) {
        super(i, i2);
        this.f14872 = c3270;
    }

    @Override // l.AbstractC18182
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char mo13736(int i) {
        return this.f14872.f10303.f35010[i];
    }

    @Override // l.AbstractC18182
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16770 mo13737(int i, int i2) {
        return new C4681(this.f14872, i, i2);
    }

    @Override // l.AbstractC18182, l.AbstractC1153, l.InterfaceC1124
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void forEachRemaining(InterfaceC23662 interfaceC23662) {
        C11737 c11737 = this.f14872.f10303;
        char[] cArr = c11737.f35010;
        int i = c11737.f35006;
        while (true) {
            int i2 = this.f56561;
            if (i2 >= i) {
                return;
            }
            this.f56561 = i2 + 1;
            interfaceC23662.mo18328(cArr[i2]);
        }
    }
}
