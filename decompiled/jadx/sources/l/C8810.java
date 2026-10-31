package l;

/* JADX INFO: renamed from: l.ۡۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N539 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8810 extends AbstractC1815 implements InterfaceC12362 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f26835 = EnumC3664.Format22t;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f26836;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f26837;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " v" + mo1790() + ", v" + mo7930() + ", " + mo2818();
    }

    public C8810(EnumC0841 enumC0841, int i, int i2, C17337 c17337) {
        super(enumC0841, c17337);
        C11166.m27705(i);
        this.f26837 = i;
        C11166.m27705(i2);
        this.f26836 = i2;
    }

    @Override // l.InterfaceC1779
    /* JADX INFO: renamed from: ֫ */
    public final int mo1790() {
        return this.f26837;
    }

    @Override // l.InterfaceC23651
    /* JADX INFO: renamed from: ܶ */
    public final int mo7930() {
        return this.f26836;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f26835;
    }
}
