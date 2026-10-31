package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵ۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19411 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f62798;

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
    }

    public C19411(ActivityC17169 activityC17169) {
        this.f62798 = activityC17169;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f62798, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        ActivityC17169 activityC17169 = this.f62798;
        if (activityC17169.f52606 != null) {
            activityC17169.f52606.m30075();
        }
        activityC17169.f52608.m29734();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        Bundle bundle = new Bundle();
        ActivityC17169 activityC17169 = this.f62798;
        activityC17169.onSaveInstanceState(bundle);
        Intent intent = new Intent(activityC17169, (Class<?>) ActivityC17169.class);
        intent.putExtra("bundle", bundle);
        activityC17169.startActivity(intent);
        super/*android.app.Activity*/.finish();
        activityC17169.overridePendingTransition(0, 0);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f62798.m10223(exc, (DialogInterface.OnDismissListener) null);
    }
}
