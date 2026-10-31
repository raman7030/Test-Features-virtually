package l;

/* JADX INFO: renamed from: l.ܶ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes5.dex */
public final class C14926 extends AbstractC21005 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21278 f45506;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14926(C21278 c21278) {
        super(c21278.f12619);
        this.f45506 = c21278;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14926(C21278 c21278, int i, int i2) {
        super(i, i2);
        this.f45506 = c21278;
    }

    @Override // l.AbstractC21005
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo35370() {
        return this.f45506.f12618;
    }

    @Override // l.AbstractC18182
    /* JADX INFO: renamed from: ֫ */
    public final char mo13736(int i) {
        return this.f45506.f68628.f70388[i];
    }

    @Override // l.AbstractC18182
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16770 mo13737(int i, int i2) {
        return new C14926(this.f45506, i, i2);
    }

    @Override // l.AbstractC18182, l.InterfaceC1124
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean tryAdvance(InterfaceC23662 interfaceC23662) {
        if (this.f56561 >= mo42413()) {
            return false;
        }
        char[] cArr = this.f45506.f68628.f70388;
        int i = this.f56561;
        this.f56561 = i + 1;
        interfaceC23662.mo18328(cArr[i]);
        return true;
    }

    @Override // l.AbstractC18182, l.AbstractC1153, l.InterfaceC1124
    /* JADX INFO: renamed from: ֫ */
    public final void forEachRemaining(InterfaceC23662 interfaceC23662) {
        char[] cArr = this.f45506.f68628.f70388;
        int iMo42413 = mo42413();
        while (true) {
            int i = this.f56561;
            if (i >= iMo42413) {
                return;
            }
            this.f56561 = i + 1;
            interfaceC23662.mo18328(cArr[i]);
        }
    }
}
