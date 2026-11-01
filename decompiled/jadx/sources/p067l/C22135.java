package p067l;

/* JADX INFO: renamed from: l.᩷ۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6VB */
/* JADX INFO: loaded from: classes4.dex */
public final class C22135 {

    /* JADX INFO: renamed from: ֫ */
    public final C24460 f70015;

    /* JADX INFO: renamed from: ۧ */
    public final int f70016;

    /* JADX INFO: renamed from: ܽ */
    public final C24320 f70017;

    /* JADX INFO: renamed from: ܿ */
    public final int f70018;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC21800 f70019;

    public C22135(C24320 c24320, InterfaceC21800 interfaceC21800, int i, int i2, int i3) {
        C12826.requireNonNull(c24320);
        this.f70017 = c24320;
        C12826.requireNonNull(interfaceC21800);
        this.f70019 = interfaceC21800;
        this.f70016 = i;
        this.f70018 = i2;
        this.f70015 = new C24460(i2, i3);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m49921() {
        InterfaceC21800 interfaceC21800 = this.f70019;
        try {
            int iMo28581 = interfaceC21800.mo28581();
            int i = this.f70016;
            return iMo28581 == i && interfaceC21800.length() == this.f70018 && interfaceC21800.mo28581() == i;
        } catch (IllegalStateException unused) {
            return false;
        }
    }
}
