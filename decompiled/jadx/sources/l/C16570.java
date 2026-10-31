package l;

/* JADX INFO: renamed from: l.ܽۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 65QR */
/* JADX INFO: loaded from: classes5.dex */
public final class C16570 extends AbstractC7479 implements InterfaceC8129 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f50936 = EnumC3664.Format21ih;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f50937;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f50938;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " v" + mo1790() + ", " + mo4920();
    }

    public C16570(EnumC0841 enumC0841, int i, int i2) {
        super(enumC0841);
        C11166.m27701(i);
        this.f50937 = i;
        if ((65535 & i2) == 0) {
            this.f50938 = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid literal value: %d. Low 16 bits must be zeroed out.", Integer.valueOf(i2)));
    }

    @Override // l.InterfaceC1779
    /* JADX INFO: renamed from: ֫ */
    public final int mo1790() {
        return this.f50937;
    }

    @Override // l.InterfaceC13504
    /* JADX INFO: renamed from: ۡ */
    public final int mo4919() {
        return this.f50938;
    }

    @Override // l.InterfaceC9541
    /* JADX INFO: renamed from: ᩸ */
    public final long mo4920() {
        return this.f50938;
    }

    @Override // l.InterfaceC5744
    /* JADX INFO: renamed from: ۗ */
    public final short mo4918() {
        return (short) (this.f50938 >>> 16);
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f50936;
    }
}
