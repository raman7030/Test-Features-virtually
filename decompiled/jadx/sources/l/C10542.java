package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۤ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes4.dex */
public final class C10542 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public List f31650;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16891 f31651;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f31652;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f31653;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C10917 f31654;

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
    }

    public C10542(C16560 c16560, AbstractC16891 abstractC16891) {
        this.f31653 = c16560;
        this.f31651 = abstractC16891;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        if (this.f31651.f51877) {
            this.f31654 = this.f31653.m38992(false, (Runnable) null);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        AbstractC16891 abstractC16891 = this.f31651;
        abstractC16891.mo14824(false);
        List listMo6012 = abstractC16891.mo6012();
        this.f31650 = listMo6012;
        abstractC16891.f51877 = false;
        C16560 c16560 = this.f31653;
        C7489.m20120(c16560, listMo6012);
        this.f31652 = c16560.f50901 || C16560.m38972(this.f31650, c16560.f50902);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C10917 c10917 = this.f31654;
        C16560 c16560 = this.f31653;
        if (!(c10917 == null && c16560.m39040()) && c16560.f50900 == this.f31651 && this.f31652) {
            c16560.m38961(this.f31650, true);
            c16560.f50891.m29923();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C10917 c10917 = this.f31654;
        if (c10917 != null) {
            c10917.m27224();
        }
    }
}
