package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۨۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C13392 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ViewOnClickListenerC15402 f37579;

    public C13392(ViewOnClickListenerC15402 viewOnClickListenerC15402) {
        this.f37579 = viewOnClickListenerC15402;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f37579.f44003, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C3924 {
        C18280 c18280 = this.f37579.f44000;
        C4199.m8512();
        C19701 c19701M44739 = C19701.m44739(4168);
        c19701M44739.m44749(c18280.f54571);
        C25065 c25065M44755 = c19701M44739.m44755();
        if (!c25065M44755.m55016()) {
            throw new C3924(C3865.m7621(c25065M44755, R.string.MT_Protector));
        }
        c18280.f54575 = 0;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        ViewOnClickListenerC15402 viewOnClickListenerC15402 = this.f37579;
        ActivityC9368 activityC9368 = viewOnClickListenerC15402.f44003;
        new RunnableC20769(activityC9368);
        ActivityC9368.m21772(activityC9368, viewOnClickListenerC15402.f44000, viewOnClickListenerC15402.f44001);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f37579.f44003.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
