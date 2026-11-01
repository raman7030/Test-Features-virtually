package p067l;

import android.content.DialogInterface;
import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܽۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18094 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC8707 f54021;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ View f54022;

    public C18094(ActivityC8707 activityC8707, View view) {
        this.f54021 = activityC8707;
        this.f54022 = view;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f54021, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C20671 c20671BuildDialog = this.f54021.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46710(R.string.MT_Protector);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        C10884.m25069(c20671BuildDialog.m46732());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f54022.setEnabled(true);
        this.f54021.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C20807 {
        C25065 c25065M44755 = C19701.m44739(4213).m44755();
        if (!c25065M44755.m55016()) {
            throw new C20807(C3865.m7621(c25065M44755, R.string.MT_Protector));
        }
    }
}
