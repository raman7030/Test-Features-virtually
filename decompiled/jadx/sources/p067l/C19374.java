package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩳۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19374 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ActivityC8645 f57831;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19374(ActivityC8645 activityC8645, AbstractActivityC5549 abstractActivityC5549) {
        super(abstractActivityC5549, -1);
        this.f57831 = activityC8645;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        ActivityC8645 activityC8645 = this.f57831;
        if (strM33346.equals(activityC8645.f23213.f78314.mo20692())) {
            m33348();
            return;
        }
        try {
            C22999 c22999M51348 = C22999.m51348(strM33346, activityC8645.f23213.f78320.m48939().mo14712());
            if (c22999M51348.equals(activityC8645.f23213.f78314.mo20693())) {
                return;
            }
            for (InterfaceC9116 interfaceC9116 : activityC8645.f23213.f78320.mo5201()) {
                if (interfaceC9116 != activityC8645.f23213.f78314 && c22999M51348.equals(interfaceC9116.mo20693())) {
                    m33349(R.string.MT_Protector);
                    return;
                }
            }
            m33348();
            activityC8645.f23213.f78314.m10440(c22999M51348);
            activityC8645.f23216.notifyDataSetChanged();
            activityC8645.f23213.f78333 = true;
        } catch (Exception unused) {
            m33349(R.string.MT_Protector);
        }
    }
}
