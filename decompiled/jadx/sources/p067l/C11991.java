package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۤۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11991 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC13332 f33432;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ boolean f33433;

    public C11991(ActivityC13332 activityC13332, boolean z) {
        this.f33432 = activityC13332;
        this.f33433 = z;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        ActivityC13332 activityC13332 = this.f33432;
        activityC13332.f37442.setVisibility(8);
        activityC13332.f37439.m32018(true);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f33432.f37440 = C15342.m34919(this.f33433);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f33432.f37443.getAdapter().notifyDataSetChanged();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f33432.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        ActivityC13332 activityC13332 = this.f33432;
        activityC13332.f37439.m32018(false);
        if (activityC13332.f37440.isEmpty()) {
            activityC13332.f37442.setVisibility(0);
        }
    }
}
