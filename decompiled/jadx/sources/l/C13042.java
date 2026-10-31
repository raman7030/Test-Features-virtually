package l;

/* JADX INFO: renamed from: l.۬ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 04XX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13042 extends AbstractC7479 implements InterfaceC9705 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f39048 = EnumC3664.Format51l;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f39049;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f39050;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " v" + mo1790() + ", " + mo4920();
    }

    public C13042(EnumC0841 enumC0841, int i, long j) {
        super(enumC0841);
        C11166.m27701(i);
        this.f39049 = i;
        this.f39050 = j;
    }

    @Override // l.InterfaceC1779
    /* JADX INFO: renamed from: ֫ */
    public final int mo1790() {
        return this.f39049;
    }

    @Override // l.InterfaceC9541
    /* JADX INFO: renamed from: ᩸ */
    public final long mo4920() {
        return this.f39050;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f39048;
    }
}
