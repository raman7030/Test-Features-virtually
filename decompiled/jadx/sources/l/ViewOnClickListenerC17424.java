package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܿܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC17424 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53283;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f53284;

    public /* synthetic */ ViewOnClickListenerC17424(AbstractActivityC3346 abstractActivityC3346, int i) {
        this.f53283 = i;
        this.f53284 = abstractActivityC3346;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f53283) {
            case 0:
                ActivityC16012.m37848((ActivityC16012) this.f53284);
                break;
            default:
                ActivityC10227.m25838((ActivityC10227) this.f53284);
                break;
        }
    }
}
