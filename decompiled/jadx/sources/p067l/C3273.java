package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.֨ۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A91T */
/* JADX INFO: loaded from: classes2.dex */
public final class C3273 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC16683 f6357;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ boolean f6358;

    public C3273(ActivityC16683 activityC16683, boolean z) {
        this.f6357 = activityC16683;
        this.f6358 = z;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        ActivityC16683 activityC16683 = this.f6357;
        activityC16683.f49107.setVisibility(8);
        activityC16683.f49108.m32018(true);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f6357.f49104 = C15342.m34915(this.f6358);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f6357.f49105.getAdapter().notifyDataSetChanged();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f6357.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        ActivityC16683 activityC16683 = this.f6357;
        activityC16683.f49108.m32018(false);
        if (activityC16683.f49104.isEmpty()) {
            activityC16683.f49107.setVisibility(0);
        }
    }
}
