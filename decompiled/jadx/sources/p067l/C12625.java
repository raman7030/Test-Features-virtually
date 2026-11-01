package p067l;

/* JADX INFO: renamed from: l.ۧۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8S5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12625 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f35430;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC17178 f35431;

    /* JADX INFO: renamed from: ܳ */
    public long f35432;

    /* JADX INFO: renamed from: ܽ */
    public final C17861 f35433 = new C17861(new byte[64], 64);

    /* JADX INFO: renamed from: ܿ */
    public boolean f35434;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f35435;

    /* JADX INFO: renamed from: ᩻ */
    public final C11157 f35436;

    public C12625(InterfaceC17178 interfaceC17178, C11157 c11157) {
        this.f35431 = interfaceC17178;
        this.f35436 = c11157;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29034() {
        this.f35434 = false;
        this.f35431.mo3395();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29035(C19203 c19203) {
        C17861 c17861 = this.f35433;
        c19203.m43707(0, 3, c17861.f53313);
        c17861.m40569(0);
        c17861.m40566(8);
        this.f35435 = c17861.m40567();
        this.f35430 = c17861.m40567();
        c17861.m40566(6);
        c19203.m43707(0, c17861.m40558(8), c17861.f53313);
        c17861.m40569(0);
        this.f35432 = 0L;
        if (this.f35435) {
            c17861.m40566(4);
            long jM40558 = ((long) c17861.m40558(3)) << 30;
            c17861.m40566(1);
            long jM40559 = jM40558 | ((long) (c17861.m40558(15) << 15));
            c17861.m40566(1);
            long jM405510 = jM40559 | ((long) c17861.m40558(15));
            c17861.m40566(1);
            boolean z = this.f35434;
            C11157 c11157 = this.f35436;
            if (!z && this.f35430) {
                c17861.m40566(4);
                long jM405511 = ((long) c17861.m40558(3)) << 30;
                c17861.m40566(1);
                long jM405512 = jM405511 | ((long) (c17861.m40558(15) << 15));
                c17861.m40566(1);
                long jM405513 = ((long) c17861.m40558(15)) | jM405512;
                c17861.m40566(1);
                c11157.m25735(jM405513);
                this.f35434 = true;
            }
            this.f35432 = c11157.m25735(jM405510);
        }
        long j = this.f35432;
        InterfaceC17178 interfaceC17178 = this.f35431;
        interfaceC17178.mo3396(4, j);
        interfaceC17178.mo3397(c19203);
        interfaceC17178.mo3399(false);
    }
}
