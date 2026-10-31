package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18843 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8259 f59430;

    public C18843(ActivityC8259 activityC8259) {
        this.f59430 = activityC8259;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f59430);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f59430.f25415.f4340.m35982(new C12534(), ActivityC16315.m38430());
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        ActivityC8259 activityC8259 = this.f59430;
        activityC8259.f25415.f4348 = activityC8259.f25415.f4340.m35992();
        if (activityC8259.f25415.f4348 == null) {
            activityC8259.f25415.f4348 = "Error";
            String strM35991 = activityC8259.f25415.f4340.m35991();
            if (!strM35991.contains(activityC8259.getString(R.string.MT_Protector)) && !strM35991.contains(activityC8259.getString(R.string.MT_Protector))) {
                C21374.m48459((CharSequence) strM35991);
                return;
            } else {
                activityC8259.m10221(strM35991, false);
                return;
            }
        }
        ActivityC14946.m35399(activityC8259, activityC8259.f25415.f4348, activityC8259.f25415.f4346, null, null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f59430.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
