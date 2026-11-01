package p067l;

import bin.p000mt.plus.R;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7298 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ViewOnClickListenerC9980 f19103;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7298(ViewOnClickListenerC9980 viewOnClickListenerC9980, AbstractActivityC5549 abstractActivityC5549) {
        super(abstractActivityC5549, R.string.MT_Protector);
        this.f19103 = viewOnClickListenerC9980;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        ViewOnClickListenerC9980 viewOnClickListenerC9980 = this.f19103;
        C16684 c16684 = viewOnClickListenerC9980.f27648;
        if (viewOnClickListenerC9980.f27649.m39355(strM33346)) {
            c16684.f49118 = true;
        } else {
            c16684.m37789();
        }
        c16684.m37788();
        c16684.f49117.notifyDataSetChanged();
        m33348();
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ۘ */
    public final void mo9819() {
        ViewOnClickListenerC9980 viewOnClickListenerC9980 = this.f19103;
        String strM39354 = viewOnClickListenerC9980.f27649.m39354();
        C16684 c16684 = viewOnClickListenerC9980.f27648;
        ActivityC18686 activityC18686 = (ActivityC18686) c16684.requireActivity();
        C24164 c24164 = new C24164(activityC18686);
        c24164.m53440(R.string.MT_Protector);
        c24164.m53431(C7050.m16203(R.string.MT_Protector, 0));
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        C8242.m19020(c16684.f49110, strM39354, "/", 0L, 4, true, true, false, true, (InterfaceC6616) new C3274(viewOnClickListenerC9980, c24164, activityC18686), (Predicate) null);
    }
}
