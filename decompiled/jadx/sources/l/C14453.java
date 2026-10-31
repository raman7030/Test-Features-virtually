package l;

/* JADX INFO: renamed from: l.ܳۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J4YT */
/* JADX INFO: loaded from: classes4.dex */
public final class C14453 extends AbstractC1815 implements InterfaceC22240 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f44294 = EnumC3664.Format21t;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f44295;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " v" + mo1790() + ", " + mo2818();
    }

    public C14453(EnumC0841 enumC0841, int i, C17337 c17337) {
        super(enumC0841, c17337);
        C11166.m27701(i);
        this.f44295 = i;
    }

    @Override // l.InterfaceC1779
    /* JADX INFO: renamed from: ֫ */
    public final int mo1790() {
        return this.f44295;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f44294;
    }
}
