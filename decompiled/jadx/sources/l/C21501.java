package l;

/* JADX INFO: renamed from: l.᩸ۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBG5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21501 extends AbstractC4193 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f69156;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f69157;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f69158;

    public C21501(EnumC8095 enumC8095, int i, int i2, int i3, int i4, int i5) {
        super(enumC8095, i, i2, 0, 0L);
        if (i5 != ((short) i5)) {
            throw new IllegalArgumentException(C19370.m44628(i5, "protoIndex doesn't fit in a short: "));
        }
        this.f69157 = i3;
        this.f69158 = i4;
        this.f69156 = i5;
    }

    @Override // l.AbstractC4193
    /* JADX INFO: renamed from: ᩴ */
    public final int mo2709() {
        return this.f69158;
    }

    @Override // l.AbstractC4193
    /* JADX INFO: renamed from: ܽ */
    public final int mo2707() {
        return this.f69157;
    }

    @Override // l.AbstractC4193
    /* JADX INFO: renamed from: ۘ */
    public final short mo12643() {
        return (short) this.f69156;
    }
}
