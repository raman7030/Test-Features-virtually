package l;

/* JADX INFO: renamed from: l.᩺۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4NV */
/* JADX INFO: loaded from: classes2.dex */
public final class C22981 extends AbstractC7479 implements InterfaceC18713 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f74000 = EnumC3664.Format11x;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f74001;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " v" + mo1790();
    }

    public C22981(int i, EnumC0841 enumC0841) {
        super(enumC0841);
        C11166.m27701(i);
        this.f74001 = i;
    }

    @Override // l.InterfaceC1779
    /* JADX INFO: renamed from: ֫ */
    public final int mo1790() {
        return this.f74001;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f74000;
    }
}
