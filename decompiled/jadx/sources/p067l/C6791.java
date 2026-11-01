package p067l;

/* JADX INFO: renamed from: l.ۙ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 3ANU */
/* JADX INFO: loaded from: classes3.dex */
public final class C6791 extends AbstractC24838 {

    /* JADX INFO: renamed from: ۗ */
    public final C21544 f17585;

    /* JADX INFO: renamed from: ۙ */
    public final C8548 f17586;

    @Override // p067l.AbstractC24838
    /* JADX INFO: renamed from: ֫ */
    public final void mo15497(C19474 c19474) {
        C8548 c8548 = this.f17586;
        if (c8548.m19948() != null) {
            this.f17585.m48727(c19474);
            c8548.m19956();
        }
    }

    public C6791(C21544 c21544, C8548 c8548) {
        this.f17585 = c21544;
        this.f17586 = c8548;
    }

    @Override // p067l.InterfaceC8745
    /* JADX INFO: renamed from: ֫ */
    public final void mo15496(C18975 c18975) {
        this.f17585.m48727(c18975);
        this.f17586.m19956();
    }

    @Override // p067l.InterfaceC8745
    /* JADX INFO: renamed from: ۧ */
    public final C16672 mo15498(C18975 c18975) {
        AbstractC14167 abstractC14167 = this.f17585.f67952;
        if (this.f17586.m19954((InterfaceC17797) null) == null) {
            return null;
        }
        return C21960.f69014;
    }

    @Override // p067l.C22039
    public final String toString() {
        return "ReceiveHasNext@" + C12846.m29416(this);
    }
}
