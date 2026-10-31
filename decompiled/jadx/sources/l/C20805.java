package l;

/* JADX INFO: renamed from: l.᩷ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P5O2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20805 extends AbstractC7479 implements InterfaceC3190 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f67346 = EnumC3664.Format22cs;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f67347;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f67348;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f67349;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " v" + mo1790() + ", v" + mo7930() + ", " + mo14389();
    }

    public C20805(int i, int i2, int i3, EnumC0841 enumC0841) {
        super(enumC0841);
        C11166.m27705(i);
        this.f67348 = i;
        C11166.m27705(i2);
        this.f67347 = i2;
        this.f67349 = i3;
    }

    @Override // l.InterfaceC1779
    /* JADX INFO: renamed from: ֫ */
    public final int mo1790() {
        return this.f67348;
    }

    @Override // l.InterfaceC23651
    /* JADX INFO: renamed from: ܶ */
    public final int mo7930() {
        return this.f67347;
    }

    @Override // l.InterfaceC12094
    /* JADX INFO: renamed from: ܺ */
    public final int mo14389() {
        return this.f67349;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f67346;
    }
}
