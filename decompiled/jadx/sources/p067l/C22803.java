package p067l;

/* JADX INFO: renamed from: l.᩸ۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBG5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22803 extends AbstractC6354 {

    /* JADX INFO: renamed from: ܳ */
    public final int f71853;

    /* JADX INFO: renamed from: ܿ */
    public final int f71854;

    /* JADX INFO: renamed from: ᩻ */
    public final int f71855;

    public C22803(EnumC10062 enumC10062, int i, int i2, int i3, int i4, int i5) {
        super(enumC10062, i, i2, 0, 0L);
        if (i5 != ((short) i5)) {
            throw new IllegalArgumentException(C20778.m46922(i5, "protoIndex doesn't fit in a short: "));
        }
        this.f71854 = i3;
        this.f71855 = i4;
        this.f71853 = i5;
    }

    @Override // p067l.AbstractC6354
    /* JADX INFO: renamed from: ᩴ */
    public final int mo5048() {
        return this.f71855;
    }

    @Override // p067l.AbstractC6354
    /* JADX INFO: renamed from: ܽ */
    public final int mo5046() {
        return this.f71854;
    }

    @Override // p067l.AbstractC6354
    /* JADX INFO: renamed from: ۘ */
    public final short mo14519() {
        return (short) this.f71853;
    }
}
