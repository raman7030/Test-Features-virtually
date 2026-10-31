package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16481 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6604 f50669;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16481(ActivityC6604 activityC6604, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346, -1);
        this.f50669 = activityC6604;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        ActivityC6604 activityC6604 = this.f50669;
        try {
            C21707 c21707M48999 = C21707.m48999(m31260(), activityC6604.f20336.f75574.m46616().mo12848());
            Iterator it = activityC6604.f20336.f75574.mo2872().iterator();
            while (it.hasNext()) {
                if (((InterfaceC7099) it.next()).mo18743().equals(c21707M48999)) {
                    m31263(R.string.MT_Protector);
                    return;
                }
            }
            m31262();
            try {
                C23537 c23537 = activityC6604.f20336;
                c23537.f75574.m46613(c23537.f75568, c21707M48999);
                activityC6604.f20339.notifyDataSetChanged();
                activityC6604.f20336.f75587 = true;
            } catch (Exception e) {
                activityC6604.m10223(e, (DialogInterface.OnDismissListener) null);
            }
        } catch (Exception e2) {
            activityC6604.m10223(e2, (DialogInterface.OnDismissListener) null);
        }
    }
}
