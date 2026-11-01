package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩴܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20277 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC10218 f62658;

    public C20277(ActivityC10218 activityC10218) {
        this.f62658 = activityC10218;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22242(this.f62658);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f62658.f28325.f7109.m38142(new C14281(), ActivityC17874.m40645());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        ActivityC10218 activityC10218 = this.f62658;
        activityC10218.f28325.f7117 = activityC10218.f28325.f7109.m38152();
        if (activityC10218.f28325.f7117 == null) {
            activityC10218.f28325.f7117 = "Error";
            String strM38151 = activityC10218.f28325.f7109.m38151();
            if (!strM38151.contains(activityC10218.getString(R.string.MT_Protector)) && !strM38151.contains(activityC10218.getString(R.string.MT_Protector))) {
                C22682.m50795((CharSequence) strM38151);
                return;
            } else {
                activityC10218.m12257(strM38151, false);
                return;
            }
        }
        ActivityC16573.m37551(activityC10218, activityC10218.f28325.f7117, activityC10218.f28325.f7115, null, null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f62658.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
