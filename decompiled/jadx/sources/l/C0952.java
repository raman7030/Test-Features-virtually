package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.֨ۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A91T */
/* JADX INFO: loaded from: classes2.dex */
public final class C0952 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC15062 f3580;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f3581;

    public C0952(ActivityC15062 activityC15062, boolean z) {
        this.f3580 = activityC15062;
        this.f3581 = z;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        ActivityC15062 activityC15062 = this.f3580;
        activityC15062.f45989.setVisibility(8);
        activityC15062.f45990.m29958(true);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f3580.f45986 = C13651.m32800(this.f3581);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f3580.f45987.getAdapter().notifyDataSetChanged();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f3580.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        ActivityC15062 activityC15062 = this.f3580;
        activityC15062.f45990.m29958(false);
        if (activityC15062.f45986.isEmpty()) {
            activityC15062.f45989.setVisibility(0);
        }
    }
}
