package p067l;

/* JADX INFO: renamed from: l.ᩳۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BCD */
/* JADX INFO: loaded from: classes5.dex */
public final class C19430 implements InterfaceC10713 {

    /* JADX INFO: renamed from: ֫ */
    public int f59172 = 0;

    /* JADX INFO: renamed from: ֫ */
    public final int m44199() {
        return this.f59172;
    }

    @Override // p067l.InterfaceC10713
    /* JADX INFO: renamed from: ֫ */
    public final void mo10251(C3336 c3336) {
        m44198((AbstractC17417) c3336);
    }

    @Override // p067l.InterfaceC10713
    /* JADX INFO: renamed from: ֫ */
    public final void mo10254(C7360 c7360) {
        m44198((AbstractC17417) c7360);
    }

    @Override // p067l.InterfaceC10713
    /* JADX INFO: renamed from: ֫ */
    public final void mo10255(C8030 c8030) {
        m44198((AbstractC17417) c8030);
    }

    @Override // p067l.InterfaceC10713
    /* JADX INFO: renamed from: ֫ */
    public final void mo10256(C13395 c13395) {
        m44198((AbstractC17417) c13395);
    }

    @Override // p067l.InterfaceC10713
    /* JADX INFO: renamed from: ֫ */
    public final void mo10259(C24123 c24123) {
        m44198((AbstractC17417) c24123);
    }

    @Override // p067l.InterfaceC10713
    /* JADX INFO: renamed from: ֫ */
    public final void mo10258(C22113 c22113) {
        m44198((AbstractC17417) c22113);
    }

    @Override // p067l.InterfaceC10713
    /* JADX INFO: renamed from: ֫ */
    public final void mo10252(C6019 c6019) {
        m44198((AbstractC17417) c6019);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m44198(AbstractC17417 abstractC17417) {
        int iM50986;
        C22783 c22783M39655 = abstractC17417.m39655();
        if (c22783M39655 != null && (iM50986 = c22783M39655.m50986()) > this.f59172) {
            this.f59172 = iM50986;
        }
        C21442 c21442M39651 = abstractC17417.m39651();
        int size = c21442M39651.size();
        for (int i = 0; i < size; i++) {
            int iM50987 = c21442M39651.m56524get(i).m50986();
            if (iM50987 > this.f59172) {
                this.f59172 = iM50987;
            }
        }
    }
}
