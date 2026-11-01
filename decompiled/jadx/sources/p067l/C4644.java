package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۖ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4644 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ViewOnClickListenerC20067 f10436;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4644(ViewOnClickListenerC20067 viewOnClickListenerC20067, AbstractActivityC5549 abstractActivityC5549) {
        super(abstractActivityC5549, R.string.MT_Protector);
        this.f10436 = viewOnClickListenerC20067;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        ViewOnClickListenerC20067 viewOnClickListenerC20067 = this.f10436;
        C20738 c20738 = viewOnClickListenerC20067.f60971;
        if (viewOnClickListenerC20067.f60972.m54426(strM33346)) {
            c20738.f63996 = true;
        } else {
            c20738.m46842();
        }
        c20738.m46841();
        c20738.f63997.notifyDataSetChanged();
        m33348();
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ۘ */
    public final void mo9819() {
        ViewOnClickListenerC20067 viewOnClickListenerC20067 = this.f10436;
        String strM54425 = viewOnClickListenerC20067.f60972.m54425();
        C20738 c20738 = viewOnClickListenerC20067.f60971;
        ActivityC18686 activityC18686 = (ActivityC18686) c20738.requireActivity();
        C24164 c24164 = new C24164(activityC18686);
        c24164.m53440(R.string.MT_Protector);
        c24164.m53431(C7050.m16203(R.string.MT_Protector, 0));
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        C17817.m40438(c20738.f63998, strM54425, "/", 0, 2, true, true, false, true, new C5985(viewOnClickListenerC20067, c24164, activityC18686), null);
    }
}
