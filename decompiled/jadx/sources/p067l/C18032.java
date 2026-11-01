package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18032 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ActivityC8645 f53846;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18032(ActivityC8645 activityC8645, AbstractActivityC5549 abstractActivityC5549) {
        super(abstractActivityC5549, -1);
        this.f53846 = activityC8645;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        ActivityC8645 activityC8645 = this.f53846;
        try {
            C22999 c22999M51348 = C22999.m51348(m33346(), activityC8645.f23213.f78320.m48939().mo14712());
            Iterator it = activityC8645.f23213.f78320.mo5201().iterator();
            while (it.hasNext()) {
                if (((InterfaceC9116) it.next()).mo20693().equals(c22999M51348)) {
                    m33349(R.string.MT_Protector);
                    return;
                }
            }
            m33348();
            try {
                C24738 c24738 = activityC8645.f23213;
                c24738.f78320.m48936(c24738.f78314, c22999M51348);
                activityC8645.f23216.notifyDataSetChanged();
                activityC8645.f23213.f78333 = true;
            } catch (Exception e) {
                activityC8645.m12259(e, (DialogInterface.OnDismissListener) null);
            }
        } catch (Exception e2) {
            activityC8645.m12259(e2, (DialogInterface.OnDismissListener) null);
        }
    }
}
