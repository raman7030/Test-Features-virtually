package l;

/* JADX INFO: renamed from: l.ܿۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M5ND */
/* JADX INFO: loaded from: classes5.dex */
public final class C17276 extends AbstractC7479 implements InterfaceC21535 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f52954 = EnumC3664.Format21s;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f52955;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f52956;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " v" + mo1790() + ", " + mo4920();
    }

    public C17276(EnumC0841 enumC0841, int i, int i2) {
        super(enumC0841);
        C11166.m27701(i);
        this.f52955 = i;
        C11166.m27707(i2);
        this.f52956 = i2;
    }

    @Override // l.InterfaceC1779
    /* JADX INFO: renamed from: ֫ */
    public final int mo1790() {
        return this.f52955;
    }

    @Override // l.InterfaceC13504
    /* JADX INFO: renamed from: ۡ */
    public final int mo4919() {
        return this.f52956;
    }

    @Override // l.InterfaceC9541
    /* JADX INFO: renamed from: ᩸ */
    public final long mo4920() {
        return this.f52956;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f52954;
    }
}
