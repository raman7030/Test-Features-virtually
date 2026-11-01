package p067l;

/* JADX INFO: renamed from: l.ۨ۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 64OZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13481 extends AbstractC9476 implements InterfaceC6071 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC5850 f37862 = EnumC5850.Format11n;

    /* JADX INFO: renamed from: ۙ */
    public final int f37863;

    /* JADX INFO: renamed from: ᩶ */
    public final int f37864;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " v" + mo4189() + ", " + mo7162();
    }

    public C13481(EnumC3167 enumC3167, int i, int i2) {
        super(enumC3167);
        C12981.m29767(i);
        this.f37863 = i;
        if (i2 >= -8 && i2 <= 7) {
            this.f37864 = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid literal value: %d. Must be between -8 and 7, inclusive.", Integer.valueOf(i2)));
    }

    @Override // p067l.InterfaceC4059
    /* JADX INFO: renamed from: ֫ */
    public final int mo4189() {
        return this.f37863;
    }

    @Override // p067l.InterfaceC15202
    /* JADX INFO: renamed from: ۡ */
    public final int mo7161() {
        return this.f37864;
    }

    @Override // p067l.InterfaceC11436
    /* JADX INFO: renamed from: ᩸ */
    public final long mo7162() {
        return this.f37864;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f37862;
    }
}
