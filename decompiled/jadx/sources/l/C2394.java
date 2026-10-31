package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2394 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC18622 f7644;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2394(ViewOnClickListenerC18622 viewOnClickListenerC18622, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346, R.string.MT_Protector);
        this.f7644 = viewOnClickListenerC18622;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strM31260 = m31260();
        ViewOnClickListenerC18622 viewOnClickListenerC18622 = this.f7644;
        C19328 c19328 = viewOnClickListenerC18622.f57748;
        if (viewOnClickListenerC18622.f57749.m52024(strM31260)) {
            c19328.f60764 = true;
        } else {
            c19328.m44548();
        }
        c19328.m44547();
        c19328.f60765.notifyDataSetChanged();
        m31262();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void mo7756() {
        ViewOnClickListenerC18622 viewOnClickListenerC18622 = this.f7644;
        String strM52023 = viewOnClickListenerC18622.f57749.m52023();
        C19328 c19328 = viewOnClickListenerC18622.f57748;
        ActivityC17169 activityC17169 = (ActivityC17169) c19328.requireActivity();
        C22933 c22933 = new C22933(activityC17169);
        c22933.m51049(R.string.MT_Protector);
        c22933.m51040(C4925.m14306(R.string.MT_Protector, 0));
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        C16254.m38224(c19328.f60766, strM52023, "/", 0, 2, true, true, false, true, new C3805(viewOnClickListenerC18622, c22933, activityC17169), null);
    }
}
