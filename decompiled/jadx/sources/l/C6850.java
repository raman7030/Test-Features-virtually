package l;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۜܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final class C6850 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9170 f21192;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f21193;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f21194;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7744 f21195;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f21196;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f21197;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C21434 f21198;

    public C6850(C22372 c22372, ActivityC16315 activityC16315, String str, AbstractC15440 abstractC15440) {
        this.f21197 = c22372;
        this.f21194 = activityC16315;
        this.f21196 = str;
        this.f21193 = abstractC15440;
        this.f21192 = C9170.m23579(c22372.getViewLifecycleOwner());
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        this.f21195 = this.f21197.f72517.m30436().mo26562();
        m20270(this.f21194, this.f21192);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C7744 c7744 = this.f21195;
        try {
            C21434 c21434M16580 = C5916.m16580(c7744);
            this.f21198 = c21434M16580;
            c21434M16580.m48549("<--id-c5skl23kjndf-->", this.f21196);
            this.f21193.m36510(this.f21198.mo14987());
            if (c7744 != null) {
                c7744.close();
            }
        } catch (Throwable th) {
            if (c7744 != null) {
                try {
                    c7744.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f21192.m23581()) {
            long jMo23117 = this.f21193.mo23117();
            C22372 c22372 = this.f21197;
            c22372.f72490 = jMo23117;
            c22372.startActivity(new Intent(c22372.getContext(), (Class<?>) ActivityC13676.class));
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        int iM38634;
        if (this.f21192.m23581()) {
            this.f21194.m10223(exc, (DialogInterface.OnDismissListener) null);
            if (!(exc instanceof C1580) || (iM38634 = ((C1580) exc).m5400().m38634()) == -1) {
                return;
            }
            this.f21197.f72517.m30372(iM38634 - 1);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C7744 c7744 = this.f21195;
        if (c7744 != null) {
            c7744.close();
        }
        m20273();
    }
}
