package l;

/* JADX INFO: renamed from: l.ۖۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 2589 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2460 extends AbstractC7479 implements InterfaceC6012 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f7851 = EnumC3664.Format23x;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f7852;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f7853;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f7854;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " v" + mo1790() + ", v" + mo7930() + ", v" + mo7931();
    }

    public C2460(int i, int i2, int i3, EnumC0841 enumC0841) {
        super(enumC0841);
        C11166.m27701(i);
        this.f7854 = i;
        C11166.m27701(i2);
        this.f7853 = i2;
        C11166.m27701(i3);
        this.f7852 = i3;
    }

    @Override // l.InterfaceC1779
    /* JADX INFO: renamed from: ֫ */
    public final int mo1790() {
        return this.f7854;
    }

    @Override // l.InterfaceC23651
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int mo7930() {
        return this.f7853;
    }

    @Override // l.InterfaceC14478
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo7931() {
        return this.f7852;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f7851;
    }
}
