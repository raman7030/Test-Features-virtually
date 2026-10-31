package l;

/* JADX INFO: renamed from: l.ܰ۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 84PD */
/* JADX INFO: loaded from: classes4.dex */
public final class C13808 extends AbstractC7479 implements InterfaceC19419 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f41140 = EnumC3664.Format12x;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f41141;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f41142;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " v" + mo1790() + ", v" + mo7930();
    }

    public C13808(EnumC0841 enumC0841, int i, int i2) {
        super(enumC0841);
        C11166.m27705(i);
        this.f41142 = i;
        C11166.m27705(i2);
        this.f41141 = i2;
    }

    @Override // l.InterfaceC1779
    /* JADX INFO: renamed from: ֫ */
    public final int mo1790() {
        return this.f41142;
    }

    @Override // l.InterfaceC23651
    /* JADX INFO: renamed from: ܶ */
    public final int mo7930() {
        return this.f41141;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f41140;
    }
}
