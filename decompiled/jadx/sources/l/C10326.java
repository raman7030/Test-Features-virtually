package l;

/* JADX INFO: renamed from: l.ۤܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10326 extends AbstractC23826 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6092 f31075;

    @Override // l.AbstractC18182, l.InterfaceC15234
    public final int characteristics() {
        return 16720;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10326(C6092 c6092, int i, int i2) {
        super(i, i2);
        this.f31075 = c6092;
    }

    @Override // l.AbstractC18182
    /* JADX INFO: renamed from: ֫ */
    public final char mo13736(int i) {
        return this.f31075.f18671.f35005[i];
    }

    @Override // l.AbstractC18182
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16770 mo13737(int i, int i2) {
        return new C10326(this.f31075, i, i2);
    }

    @Override // l.AbstractC18182, l.AbstractC1153, l.InterfaceC1124
    /* JADX INFO: renamed from: ֫ */
    public final void forEachRemaining(InterfaceC23662 interfaceC23662) {
        C11737 c11737 = this.f31075.f18671;
        char[] cArr = c11737.f35005;
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
