package l;

/* JADX INFO: renamed from: l.ۢۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Q574 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9516 extends AbstractC7479 implements InterfaceC13067 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f28897 = EnumC3664.Format22s;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f28898;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f28899;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f28900;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " v" + mo1790() + ", v" + mo7930() + ", " + mo4920();
    }

    public C9516(int i, int i2, int i3, EnumC0841 enumC0841) {
        super(enumC0841);
        C11166.m27705(i);
        this.f28899 = i;
        C11166.m27705(i2);
        this.f28898 = i2;
        C11166.m27707(i3);
        this.f28900 = i3;
    }

    @Override // l.InterfaceC1779
    /* JADX INFO: renamed from: ֫ */
    public final int mo1790() {
        return this.f28899;
    }

    @Override // l.InterfaceC23651
    /* JADX INFO: renamed from: ܶ */
    public final int mo7930() {
        return this.f28898;
    }

    @Override // l.InterfaceC13504
    /* JADX INFO: renamed from: ۡ */
    public final int mo4919() {
        return this.f28900;
    }

    @Override // l.InterfaceC9541
    /* JADX INFO: renamed from: ᩸ */
    public final long mo4920() {
        return this.f28900;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f28897;
    }
}
