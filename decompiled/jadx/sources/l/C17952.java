package l;

/* JADX INFO: renamed from: l.ᩳۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BCD */
/* JADX INFO: loaded from: classes5.dex */
public final class C17952 implements InterfaceC8780 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f55975 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41950() {
        return this.f55975;
    }

    @Override // l.InterfaceC8780
    /* JADX INFO: renamed from: ֫ */
    public final void mo8212(C1018 c1018) {
        m41949((AbstractC15834) c1018);
    }

    @Override // l.InterfaceC8780
    /* JADX INFO: renamed from: ֫ */
    public final void mo8215(C5252 c5252) {
        m41949((AbstractC15834) c5252);
    }

    @Override // l.InterfaceC8780
    /* JADX INFO: renamed from: ֫ */
    public final void mo8216(C5957 c5957) {
        m41949((AbstractC15834) c5957);
    }

    @Override // l.InterfaceC8780
    /* JADX INFO: renamed from: ֫ */
    public final void mo8217(C11602 c11602) {
        m41949((AbstractC15834) c11602);
    }

    @Override // l.InterfaceC8780
    /* JADX INFO: renamed from: ֫ */
    public final void mo8220(C22890 c22890) {
        m41949((AbstractC15834) c22890);
    }

    @Override // l.InterfaceC8780
    /* JADX INFO: renamed from: ֫ */
    public final void mo8219(C20775 c20775) {
        m41949((AbstractC15834) c20775);
    }

    @Override // l.InterfaceC8780
    /* JADX INFO: renamed from: ֫ */
    public final void mo8213(C3841 c3841) {
        m41949((AbstractC15834) c3841);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41949(AbstractC15834 abstractC15834) {
        int iM48649;
        C21480 c21480M37483 = abstractC15834.m37483();
        if (c21480M37483 != null && (iM48649 = c21480M37483.m48649()) > this.f55975) {
            this.f55975 = iM48649;
        }
        C20069 c20069M37479 = abstractC15834.m37479();
        int size = c20069M37479.size();
        for (int i = 0; i < size; i++) {
            int iM486410 = c20069M37479.m41004get(i).m48649();
            if (iM486410 > this.f55975) {
                this.f55975 = iM486410;
            }
        }
    }
}
