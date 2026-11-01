package p067l;

/* JADX INFO: renamed from: l.ܰ۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 84PD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15491 extends AbstractC9476 implements InterfaceC20824 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC5850 f44218 = EnumC5850.Format12x;

    /* JADX INFO: renamed from: ۙ */
    public final int f44219;

    /* JADX INFO: renamed from: ᩶ */
    public final int f44220;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " v" + mo4189() + ", v" + mo9978();
    }

    public C15491(EnumC3167 enumC3167, int i, int i2) {
        super(enumC3167);
        C12981.m29767(i);
        this.f44220 = i;
        C12981.m29767(i2);
        this.f44219 = i2;
    }

    @Override // p067l.InterfaceC4059
    /* JADX INFO: renamed from: ֫ */
    public final int mo4189() {
        return this.f44220;
    }

    @Override // p067l.InterfaceC24846
    /* JADX INFO: renamed from: ܶ */
    public final int mo9978() {
        return this.f44219;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f44218;
    }
}
