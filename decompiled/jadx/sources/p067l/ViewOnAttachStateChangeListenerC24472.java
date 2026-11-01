package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.᩺᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC24472 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C7350 f77444;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C15084 f77445;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ Runnable f77446;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C7038 f77447;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C14414 f77448;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C4376 f77449;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C19799 f77450;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C1898[] f77451;

    public ViewOnAttachStateChangeListenerC24472(C19799 c19799, C15084 c15084, C7350 c7350, C14414 c14414, C7038 c7038, Runnable runnable, C1898[] c1898Arr, C4376 c4376) {
        this.f77450 = c19799;
        this.f77445 = c15084;
        this.f77444 = c7350;
        this.f77448 = c14414;
        this.f77447 = c7038;
        this.f77446 = runnable;
        this.f77451 = c1898Arr;
        this.f77449 = c4376;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f77450.f60216.add(this.f77445);
        this.f77444.m4063((InterfaceC3326) this.f77448);
        C23092.m51505(this.f77447);
        ((RunnableC13744) this.f77446).run();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C1898[] c1898Arr = this.f77451;
        C1898 c1898 = c1898Arr[0];
        if (c1898 != null) {
            c1898.m50633();
            c1898Arr[0] = null;
        }
        C4376 c4376 = this.f77449;
        AbstractDialogInterfaceOnClickListenerC14580 abstractDialogInterfaceOnClickListenerC14580 = c4376.f9831;
        c4376.f9831 = null;
        if (abstractDialogInterfaceOnClickListenerC14580 != null) {
            abstractDialogInterfaceOnClickListenerC14580.m33348();
        }
        this.f77450.f60216.remove(this.f77445);
        this.f77444.m4068((InterfaceC3326) this.f77448);
        C23092.m51507(this.f77447);
        C7050.m16221().removeCallbacks(this.f77446);
    }
}
