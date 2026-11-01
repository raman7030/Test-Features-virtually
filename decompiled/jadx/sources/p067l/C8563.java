package p067l;

/* JADX INFO: renamed from: l.ۜۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BFP */
/* JADX INFO: loaded from: classes3.dex */
public final class C8563 implements InterfaceC18621 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C21975 f23007;

    public C8563(C21975 c21975) {
        this.f23007 = c21975;
    }

    @Override // p067l.InterfaceC18621
    /* JADX INFO: renamed from: ֫ */
    public final void mo9599(C13889 c13889) {
        m19963((AbstractC15938) c13889);
    }

    @Override // p067l.InterfaceC18621
    /* JADX INFO: renamed from: ֫ */
    public final void mo9600(C15229 c15229) {
        m19963((AbstractC15938) c15229);
    }

    @Override // p067l.InterfaceC18621
    /* JADX INFO: renamed from: ۧ */
    public final void mo9602(C13889 c13889) {
        m19963((AbstractC15938) c13889);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m19963(AbstractC15938 abstractC15938) {
        C21442 c21442Mo31600 = abstractC15938.mo31600();
        int size = c21442Mo31600.size();
        for (int i = 0; i < size; i++) {
            this.f23007.f69048[c21442Mo31600.m56524get(i).m50989()].add(abstractC15938);
        }
    }
}
