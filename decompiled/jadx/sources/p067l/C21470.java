package p067l;

/* JADX INFO: renamed from: l.᩶ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4QY */
/* JADX INFO: loaded from: classes5.dex */
public final class C21470 extends AbstractC9476 implements InterfaceC25002 {

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC5850 f67734 = EnumC5850.Format3rms;

    /* JADX INFO: renamed from: ۗ */
    public final int f67735;

    /* JADX INFO: renamed from: ۙ */
    public final int f67736;

    /* JADX INFO: renamed from: ᩶ */
    public final int f67737;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " " + C9731.m22754(this) + ", " + mo36892();
    }

    public C21470(int i, int i2, int i3, EnumC3167 enumC3167) {
        super(enumC3167);
        C12981.m29765(i);
        this.f67736 = i;
        C12981.m29771(i2);
        this.f67737 = i2;
        this.f67735 = i3;
    }

    @Override // p067l.InterfaceC18140
    /* JADX INFO: renamed from: ᩴ */
    public final int mo11756() {
        return this.f67736;
    }

    @Override // p067l.InterfaceC8753
    /* JADX INFO: renamed from: ᩻ */
    public final int mo5886() {
        return this.f67737;
    }

    @Override // p067l.InterfaceC22165
    /* JADX INFO: renamed from: ᩹ */
    public final int mo36892() {
        return this.f67735;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f67734;
    }
}
