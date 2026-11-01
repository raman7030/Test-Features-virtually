package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ܿܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC18928 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f56471;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractActivityC5549 f56472;

    public /* synthetic */ ViewOnClickListenerC18928(AbstractActivityC5549 abstractActivityC5549, int i) {
        this.f56471 = i;
        this.f56472 = abstractActivityC5549;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f56471) {
            case 0:
                ActivityC17586.m40034((ActivityC17586) this.f56472);
                break;
            default:
                ActivityC12088.m27860((ActivityC12088) this.f56472);
                break;
        }
    }
}
