package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۜ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC7080 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f21775;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21776;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21777;

    public /* synthetic */ ViewOnClickListenerC7080(int i, AbstractActivityC3346 abstractActivityC3346, Object obj) {
        this.f21776 = i;
        this.f21777 = obj;
        this.f21775 = abstractActivityC3346;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f21776) {
            case 0:
                C15545.m36653((C15545) this.f21777, this.f21775, view);
                break;
            default:
                C8177.m21662((C8177) this.f21777, this.f21775);
                break;
        }
    }
}
