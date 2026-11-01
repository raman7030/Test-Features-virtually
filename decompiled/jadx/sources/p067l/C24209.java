package p067l;

/* JADX INFO: renamed from: l.᩺۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4NV */
/* JADX INFO: loaded from: classes2.dex */
public final class C24209 extends AbstractC9476 implements InterfaceC20153 {

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC5850 f76735 = EnumC5850.Format11x;

    /* JADX INFO: renamed from: ᩶ */
    public final int f76736;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " v" + mo4189();
    }

    public C24209(int i, EnumC3167 enumC3167) {
        super(enumC3167);
        C12981.m29763(i);
        this.f76736 = i;
    }

    @Override // p067l.InterfaceC4059
    /* JADX INFO: renamed from: ֫ */
    public final int mo4189() {
        return this.f76736;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f76735;
    }
}
