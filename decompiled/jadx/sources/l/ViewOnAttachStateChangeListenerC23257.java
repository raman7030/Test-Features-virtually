package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩺᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC23257 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5242 f74701;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13379 f74702;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f74703;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4913 f74704;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12674 f74705;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2112 f74706;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18340 f74707;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21282[] f74708;

    public ViewOnAttachStateChangeListenerC23257(C18340 c18340, C13379 c13379, C5242 c5242, C12674 c12674, C4913 c4913, Runnable runnable, C21282[] c21282Arr, C2112 c2112) {
        this.f74707 = c18340;
        this.f74702 = c13379;
        this.f74701 = c5242;
        this.f74705 = c12674;
        this.f74704 = c4913;
        this.f74703 = runnable;
        this.f74708 = c21282Arr;
        this.f74706 = c2112;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f74707.f56998.add(this.f74702);
        this.f74701.m1665((InterfaceC1008) this.f74705);
        C21805.m49154(this.f74704);
        ((RunnableC11969) this.f74703).run();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C21282[] c21282Arr = this.f74708;
        C21282 c21282 = c21282Arr[0];
        if (c21282 != null) {
            c21282.m48299();
            c21282Arr[0] = null;
        }
        C2112 c2112 = this.f74706;
        AbstractDialogInterfaceOnClickListenerC12849 abstractDialogInterfaceOnClickListenerC12849 = c2112.f7046;
        c2112.f7046 = null;
        if (abstractDialogInterfaceOnClickListenerC12849 != null) {
            abstractDialogInterfaceOnClickListenerC12849.m31262();
        }
        this.f74707.f56998.remove(this.f74702);
        this.f74701.m1670((InterfaceC1008) this.f74705);
        C21805.m49156(this.f74704);
        C4925.m14324().removeCallbacks(this.f74703);
    }
}
