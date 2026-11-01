package p067l;

/* JADX INFO: renamed from: l.֡ۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A593 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2693 extends AbstractC4093 implements InterfaceC9423 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC5850 f4529 = EnumC5850.Format31t;

    /* JADX INFO: renamed from: ۙ */
    public final int f4530;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " v" + mo4189() + ", " + mo5147();
    }

    public C2693(EnumC3167 enumC3167, int i, C18845 c18845) {
        super(enumC3167, c18845);
        C12981.m29763(i);
        this.f4530 = i;
    }

    @Override // p067l.InterfaceC4059
    /* JADX INFO: renamed from: ֫ */
    public final int mo4189() {
        return this.f4530;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f4529;
    }
}
