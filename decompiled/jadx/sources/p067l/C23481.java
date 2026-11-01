package p067l;

/* JADX INFO: renamed from: l.᩹ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SF */
/* JADX INFO: loaded from: classes2.dex */
public final class C23481 extends AbstractC9476 implements InterfaceC16284 {

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC5850 f74816 = EnumC5850.Format3rmi;

    /* JADX INFO: renamed from: ۗ */
    public final int f74817;

    /* JADX INFO: renamed from: ۙ */
    public final int f74818;

    /* JADX INFO: renamed from: ᩶ */
    public final int f74819;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " " + C9731.m22754(this) + ", " + mo23505();
    }

    public C23481(int i, int i2, int i3, EnumC3167 enumC3167) {
        super(enumC3167);
        C12981.m29765(i);
        this.f74817 = i;
        C12981.m29771(i2);
        this.f74818 = i2;
        this.f74819 = i3;
    }

    @Override // p067l.InterfaceC18140
    /* JADX INFO: renamed from: ᩴ */
    public final int mo11756() {
        return this.f74817;
    }

    @Override // p067l.InterfaceC8753
    /* JADX INFO: renamed from: ᩻ */
    public final int mo5886() {
        return this.f74818;
    }

    @Override // p067l.InterfaceC13192
    /* JADX INFO: renamed from: ۘ */
    public final int mo23505() {
        return this.f74819;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f74816;
    }
}
