package p067l;

/* JADX INFO: renamed from: l.ܶۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S5UP */
/* JADX INFO: loaded from: classes5.dex */
public final class C16774 extends AbstractC9476 implements InterfaceC19638 {

    /* JADX INFO: renamed from: ۨ */
    public static final EnumC5850 f49432 = EnumC5850.Format35ms;

    /* JADX INFO: renamed from: ۗ */
    public final int f49433;

    /* JADX INFO: renamed from: ۙ */
    public final int f49434;

    /* JADX INFO: renamed from: ۛ */
    public final int f49435;

    /* JADX INFO: renamed from: ۤ */
    public final int f49436;

    /* JADX INFO: renamed from: ۫ */
    public final int f49437;

    /* JADX INFO: renamed from: ۬ */
    public final int f49438;

    /* JADX INFO: renamed from: ᩶ */
    public final int f49439;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " " + C9731.m22753(this) + ", " + mo36892();
    }

    public C16774(EnumC3167 enumC3167, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(enumC3167);
        C12981.m29755(i);
        this.f49434 = i;
        if (i > 0) {
            C12981.m29767(i2);
        } else {
            i2 = 0;
        }
        this.f49439 = i2;
        if (i > 1) {
            C12981.m29767(i3);
        } else {
            i3 = 0;
        }
        this.f49433 = i3;
        if (i > 2) {
            C12981.m29767(i4);
        } else {
            i4 = 0;
        }
        this.f49438 = i4;
        if (i > 3) {
            C12981.m29767(i5);
        } else {
            i5 = 0;
        }
        this.f49437 = i5;
        if (i > 4) {
            C12981.m29767(i6);
        } else {
            i6 = 0;
        }
        this.f49436 = i6;
        this.f49435 = i7;
    }

    @Override // p067l.InterfaceC8753
    /* JADX INFO: renamed from: ᩻ */
    public final int mo5886() {
        return this.f49434;
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ᩳ */
    public final int mo5885() {
        return this.f49439;
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ܽ */
    public final int mo5883() {
        return this.f49433;
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ܳ */
    public final int mo5882() {
        return this.f49438;
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ܿ */
    public final int mo5884() {
        return this.f49437;
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ۧ */
    public final int mo5881() {
        return this.f49436;
    }

    @Override // p067l.InterfaceC22165
    /* JADX INFO: renamed from: ᩹ */
    public final int mo36892() {
        return this.f49435;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f49432;
    }
}
