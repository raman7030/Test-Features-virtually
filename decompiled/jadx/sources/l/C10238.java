package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۤۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10238 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f30859;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f30860;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16688 f30861;

    public C10238(ActivityC17169 activityC17169, AbstractC15440 abstractC15440, C16688 c16688) {
        this.f30860 = activityC17169;
        this.f30859 = abstractC15440;
        this.f30861 = c16688;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f30860);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C19401 {
        ActivityC17169 activityC17169 = this.f30860;
        C12395.m30552(this.f30859, activityC17169.f52620.m27340());
        activityC17169.f52610 = true;
        activityC17169.m40322(false);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        int iIndexOf;
        ActivityC17169 activityC17169 = this.f30860;
        AbstractC5180 abstractC5180M2843 = activityC17169.m2843();
        if (abstractC5180M2843.m14886() || (iIndexOf = activityC17169.f52616.indexOf(this.f30861)) == -1) {
            return;
        }
        C4966 c4966 = new C4966();
        AbstractC14346 abstractC14346 = (AbstractC14346) activityC17169.f52616.set(iIndexOf, c4966);
        AbstractC16882 abstractC16882M14900 = abstractC5180M2843.m14900();
        abstractC16882M14900.m39678(0, 0);
        abstractC16882M14900.mo39690(abstractC14346);
        abstractC16882M14900.m39682(c4966, "000000-0000-0000-0000-000000000001");
        abstractC16882M14900.mo39689();
        activityC17169.f52603.remove("000000-0000-0000-0000-000000000002");
        if (activityC17169.f52613 != null) {
            activityC17169.f52613.notifyItemChanged(iIndexOf);
        }
        C11005 c11005M40356 = activityC17169.m40356();
        abstractC14346.m34233(c11005M40356).m27333();
        C5753.m16200(abstractC14346.m34236(c11005M40356).m27340()).m10915((InterfaceC21423) new C12354());
        abstractC14346.m34226(c11005M40356).m27333();
        activityC17169.m40331();
        ActivityC17169.m40337(activityC17169);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f30860.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f30860.f52598 = false;
        m20273();
    }
}
