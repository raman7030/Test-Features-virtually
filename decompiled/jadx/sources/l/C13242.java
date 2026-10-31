package l;

/* JADX INFO: renamed from: l.۬ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes4.dex */
public final class C13242 extends AbstractC23847 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12537 f39635;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13242(C12537 c12537) {
        super(c12537.f4443);
        this.f39635 = c12537;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13242(C12537 c12537, int i, int i2) {
        super(i, i2);
        this.f39635 = c12537;
    }

    @Override // l.AbstractC23847
    /* JADX INFO: renamed from: ۧ */
    public final int mo21906() {
        return this.f39635.f4442;
    }

    @Override // l.AbstractC18203
    /* JADX INFO: renamed from: ֫ */
    public final float mo21904(int i) {
        return this.f39635.f37664.f31324[i];
    }

    @Override // l.AbstractC18203
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16791 mo21905(int i, int i2) {
        return new C13242(this.f39635, i, i2);
    }

    @Override // l.AbstractC18203, l.InterfaceC1124
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean tryAdvance(InterfaceC4113 interfaceC4113) {
        if (this.f56589 >= mo42418()) {
            return false;
        }
        float[] fArr = this.f39635.f37664.f31324;
        int i = this.f56589;
        this.f56589 = i + 1;
        interfaceC4113.mo12346(fArr[i]);
        return true;
    }

    @Override // l.AbstractC18203, l.AbstractC22415, l.InterfaceC1124
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void forEachRemaining(InterfaceC4113 interfaceC4113) {
        float[] fArr = this.f39635.f37664.f31324;
        int iMo42418 = mo42418();
        while (true) {
            int i = this.f56589;
            if (i >= iMo42418) {
                return;
            }
            this.f56589 = i + 1;
            interfaceC4113.mo12346(fArr[i]);
        }
    }
}
