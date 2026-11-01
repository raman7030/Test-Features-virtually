package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۬ۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14672 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ int f41884;

    /* JADX INFO: renamed from: ܳ */
    public C1349 f41885;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C14002 f41886;

    public C14672(C14002 c14002, int i) {
        this.f41886 = c14002;
        this.f41884 = i;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22242(this.f41886.f39510);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C22682.m50795((CharSequence) this.f41885.f33659);
        if (((Boolean) this.f41885.f33658).booleanValue()) {
            C14002 c14002 = this.f41886;
            ActivityC13332 activityC13332 = c14002.f39510;
            C6724 c6724 = ActivityC13332.f37438;
            new C11991(activityC13332, true).m22250();
            c14002.m33348();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f41886.f39510.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C20807 {
        C19701 c19701M44739 = C19701.m44739(4210);
        c19701M44739.m44753(this.f41884);
        C25065 c25065M44755 = C24414.m53856() ? c19701M44739.m44755() : c19701M44739.m44756();
        if (c25065M44755.m55016()) {
            this.f41885 = new C1349(Boolean.valueOf(c25065M44755.m55024()), c25065M44755.m55011());
            return;
        }
        throw new C20807(C3865.m7621(c25065M44755, R.string.MT_Protector));
    }
}
