package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۧ۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC10873 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32663;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f32664;

    public /* synthetic */ ViewOnClickListenerC10873(AbstractActivityC3346 abstractActivityC3346, int i) {
        this.f32663 = i;
        this.f32664 = abstractActivityC3346;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32663) {
            case 0:
                new ViewOnClickListenerC0059(this.f32664);
                break;
            default:
                ActivityC1748.m5851((ActivityC1748) this.f32664);
                break;
        }
    }
}
