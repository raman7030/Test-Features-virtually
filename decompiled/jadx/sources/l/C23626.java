package l;

/* JADX INFO: renamed from: l.᩻ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 45MR */
/* JADX INFO: loaded from: classes2.dex */
public final class C23626 extends AbstractC7479 implements InterfaceC20124 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f76558 = EnumC3664.Format22b;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f76559;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f76560;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f76561;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " v" + mo1790() + ", v" + mo7930() + ", " + mo4920();
    }

    public C23626(int i, int i2, int i3, EnumC0841 enumC0841) {
        super(enumC0841);
        C11166.m27701(i);
        this.f76560 = i;
        C11166.m27701(i2);
        this.f76559 = i2;
        if (i3 >= -128 && i3 <= 127) {
            this.f76561 = i3;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid literal value: %d. Must be between -128 and 127, inclusive.", Integer.valueOf(i3)));
    }

    @Override // l.InterfaceC1779
    /* JADX INFO: renamed from: ֫ */
    public final int mo1790() {
        return this.f76560;
    }

    @Override // l.InterfaceC23651
    /* JADX INFO: renamed from: ܶ */
    public final int mo7930() {
        return this.f76559;
    }

    @Override // l.InterfaceC13504
    /* JADX INFO: renamed from: ۡ */
    public final int mo4919() {
        return this.f76561;
    }

    @Override // l.InterfaceC9541
    /* JADX INFO: renamed from: ᩸ */
    public final long mo4920() {
        return this.f76561;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f76558;
    }
}
