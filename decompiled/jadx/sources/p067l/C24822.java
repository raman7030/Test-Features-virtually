package p067l;

/* JADX INFO: renamed from: l.᩻ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 45MR */
/* JADX INFO: loaded from: classes2.dex */
public final class C24822 extends AbstractC9476 implements InterfaceC21494 {

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC5850 f79302 = EnumC5850.Format22b;

    /* JADX INFO: renamed from: ۗ */
    public final int f79303;

    /* JADX INFO: renamed from: ۙ */
    public final int f79304;

    /* JADX INFO: renamed from: ᩶ */
    public final int f79305;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " v" + mo4189() + ", v" + mo9978() + ", " + mo7162();
    }

    public C24822(int i, int i2, int i3, EnumC3167 enumC3167) {
        super(enumC3167);
        C12981.m29763(i);
        this.f79304 = i;
        C12981.m29763(i2);
        this.f79303 = i2;
        if (i3 >= -128 && i3 <= 127) {
            this.f79305 = i3;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid literal value: %d. Must be between -128 and 127, inclusive.", Integer.valueOf(i3)));
    }

    @Override // p067l.InterfaceC4059
    /* JADX INFO: renamed from: ֫ */
    public final int mo4189() {
        return this.f79304;
    }

    @Override // p067l.InterfaceC24846
    /* JADX INFO: renamed from: ܶ */
    public final int mo9978() {
        return this.f79303;
    }

    @Override // p067l.InterfaceC15202
    /* JADX INFO: renamed from: ۡ */
    public final int mo7161() {
        return this.f79305;
    }

    @Override // p067l.InterfaceC11436
    /* JADX INFO: renamed from: ᩸ */
    public final long mo7162() {
        return this.f79305;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f79302;
    }
}
