package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵ۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20817 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC18686 f65411;

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
    }

    public C20817(ActivityC18686 activityC18686) {
        this.f65411 = activityC18686;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f65411, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        ActivityC18686 activityC18686 = this.f65411;
        if (activityC18686.f55787 != null) {
            activityC18686.f55787.m32136();
        }
        activityC18686.f55789.m31796();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        Bundle bundle = new Bundle();
        ActivityC18686 activityC18686 = this.f65411;
        activityC18686.onSaveInstanceState(bundle);
        Intent intent = new Intent(activityC18686, (Class<?>) ActivityC18686.class);
        intent.putExtra("bundle", bundle);
        activityC18686.startActivity(intent);
        super/*android.app.Activity*/.finish();
        activityC18686.overridePendingTransition(0, 0);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f65411.m12259(exc, (DialogInterface.OnDismissListener) null);
    }
}
