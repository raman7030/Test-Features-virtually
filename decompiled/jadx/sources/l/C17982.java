package l;

/* JADX INFO: renamed from: l.ᩳۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U5Q7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17982 extends AbstractC7479 implements InterfaceC15183 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f56085 = EnumC3664.Format21lh;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f56086;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f56087;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " v" + mo1790() + ", " + mo4920();
    }

    public C17982(EnumC0841 enumC0841, int i, long j) {
        super(enumC0841);
        C11166.m27701(i);
        this.f56086 = i;
        if ((281474976710655L & j) == 0) {
            this.f56087 = j;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid literal value: %d. Low 48 bits must be zeroed out.", Long.valueOf(j)));
    }

    @Override // l.InterfaceC1779
    /* JADX INFO: renamed from: ֫ */
    public final int mo1790() {
        return this.f56086;
    }

    @Override // l.InterfaceC9541
    /* JADX INFO: renamed from: ᩸ */
    public final long mo4920() {
        return this.f56087;
    }

    @Override // l.InterfaceC5744
    /* JADX INFO: renamed from: ۗ */
    public final short mo4918() {
        return (short) (this.f56087 >>> 48);
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f56085;
    }
}
