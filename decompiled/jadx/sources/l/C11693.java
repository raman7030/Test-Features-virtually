package l;

/* JADX INFO: renamed from: l.ۨ۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 64OZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11693 extends AbstractC7479 implements InterfaceC3896 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f34863 = EnumC3664.Format11n;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f34864;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f34865;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " v" + mo1790() + ", " + mo4920();
    }

    public C11693(EnumC0841 enumC0841, int i, int i2) {
        super(enumC0841);
        C11166.m27705(i);
        this.f34864 = i;
        if (i2 >= -8 && i2 <= 7) {
            this.f34865 = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid literal value: %d. Must be between -8 and 7, inclusive.", Integer.valueOf(i2)));
    }

    @Override // l.InterfaceC1779
    /* JADX INFO: renamed from: ֫ */
    public final int mo1790() {
        return this.f34864;
    }

    @Override // l.InterfaceC13504
    /* JADX INFO: renamed from: ۡ */
    public final int mo4919() {
        return this.f34865;
    }

    @Override // l.InterfaceC9541
    /* JADX INFO: renamed from: ᩸ */
    public final long mo4920() {
        return this.f34865;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f34863;
    }
}
