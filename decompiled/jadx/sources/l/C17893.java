package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17893 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6604 f54634;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17893(ActivityC6604 activityC6604, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346, -1);
        this.f54634 = activityC6604;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strM31260 = m31260();
        ActivityC6604 activityC6604 = this.f54634;
        if (strM31260.equals(activityC6604.f20336.f75568.mo18742())) {
            m31262();
            return;
        }
        try {
            C21707 c21707M48999 = C21707.m48999(strM31260, activityC6604.f20336.f75574.m46616().mo12848());
            if (c21707M48999.equals(activityC6604.f20336.f75568.mo18743())) {
                return;
            }
            for (InterfaceC7099 interfaceC7099 : activityC6604.f20336.f75574.mo2872()) {
                if (interfaceC7099 != activityC6604.f20336.f75568 && c21707M48999.equals(interfaceC7099.mo18743())) {
                    m31263(R.string.MT_Protector);
                    return;
                }
            }
            m31262();
            activityC6604.f20336.f75568.m8394(c21707M48999);
            activityC6604.f20339.notifyDataSetChanged();
            activityC6604.f20336.f75587 = true;
        } catch (Exception unused) {
            m31263(R.string.MT_Protector);
        }
    }
}
