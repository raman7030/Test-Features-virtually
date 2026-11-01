package p067l;

/* JADX INFO: renamed from: l.ۙۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: V5UF */
/* JADX INFO: loaded from: classes3.dex */
public final class C6717 extends AbstractC9476 implements InterfaceC8909, InterfaceC3132 {

    /* JADX INFO: renamed from: ᩺ */
    public static final EnumC5850 f17422 = EnumC5850.Format45cc;

    /* JADX INFO: renamed from: ۗ */
    public final int f17423;

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC10250 f17424;

    /* JADX INFO: renamed from: ۛ */
    public final int f17425;

    /* JADX INFO: renamed from: ۤ */
    public final int f17426;

    /* JADX INFO: renamed from: ۨ */
    public final int f17427;

    /* JADX INFO: renamed from: ۫ */
    public final int f17428;

    /* JADX INFO: renamed from: ۬ */
    public final int f17429;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC10250 f17430;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " " + C9731.m22753(this) + ", " + getReference() + ", " + mo11754();
    }

    public C6717(EnumC3167 enumC3167, int i, int i2, int i3, int i4, int i5, int i6, InterfaceC10250 interfaceC10250, InterfaceC10250 interfaceC10251) {
        super(enumC3167);
        C12981.m29755(i);
        this.f17429 = i;
        if (i > 0) {
            C12981.m29767(i2);
        } else {
            i2 = 0;
        }
        this.f17423 = i2;
        if (i > 1) {
            C12981.m29767(i3);
        } else {
            i3 = 0;
        }
        this.f17428 = i3;
        if (i > 2) {
            C12981.m29767(i4);
        } else {
            i4 = 0;
        }
        this.f17426 = i4;
        if (i > 3) {
            C12981.m29767(i5);
        } else {
            i5 = 0;
        }
        this.f17425 = i5;
        if (i > 4) {
            C12981.m29767(i6);
        } else {
            i6 = 0;
        }
        this.f17427 = i6;
        this.f17430 = interfaceC10250;
        this.f17424 = interfaceC10251;
    }

    @Override // p067l.InterfaceC8753
    /* JADX INFO: renamed from: ᩻ */
    public final int mo5886() {
        return this.f17429;
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ᩳ */
    public final int mo5885() {
        return this.f17423;
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ܽ */
    public final int mo5883() {
        return this.f17428;
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ܳ */
    public final int mo5882() {
        return this.f17426;
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ܿ */
    public final int mo5884() {
        return this.f17425;
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ۧ */
    public final int mo5881() {
        return this.f17427;
    }

    @Override // p067l.InterfaceC12777
    public final InterfaceC10250 getReference() {
        return this.f17430;
    }

    @Override // p067l.InterfaceC3132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5343(C20765 c20765) {
        this.f17430 = c20765.m46903(this.f17430);
        this.f17424 = c20765.m46903(this.f17424);
    }

    @Override // p067l.InterfaceC12777
    /* JADX INFO: renamed from: ֡ */
    public final int mo5880() {
        return this.f25973.f6092;
    }

    @Override // p067l.InterfaceC14532
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC10250 mo11754() {
        return this.f17424;
    }

    @Override // p067l.InterfaceC14532
    /* JADX INFO: renamed from: ۠ */
    public final int mo11755() {
        return this.f25973.f6091;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f17422;
    }
}
