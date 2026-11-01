package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.᩸ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C22688 extends AbstractC21491 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ActivityC17874 f71566;

    public C22688(ActivityC17874 activityC17874) {
        this.f71566 = activityC17874;
    }

    @Override // p067l.AbstractC21491, p067l.InterfaceC10091
    public final void onDrawerOpened(View view) {
        ActivityC17874 activityC17874 = this.f71566;
        if (activityC17874.f53407) {
            activityC17874.f53416.setVisibility(0);
            activityC17874.f53416.setAlpha(1.0f);
        }
    }

    @Override // p067l.AbstractC21491, p067l.InterfaceC10091
    public final void onDrawerClosed(View view) {
        ActivityC17874 activityC17874 = this.f71566;
        activityC17874.f53411.m41179(false);
        if (activityC17874.f53416.getVisibility() == 0) {
            activityC17874.f53416.setVisibility(8);
        }
    }

    @Override // p067l.AbstractC21491, p067l.InterfaceC10091
    public final void onDrawerSlide(View view, float f) {
        ActivityC17874 activityC17874 = this.f71566;
        if (activityC17874.f53407) {
            if (f == 0.0f) {
                if (activityC17874.f53416.getVisibility() == 0) {
                    activityC17874.f53416.setVisibility(8);
                }
            } else {
                if (activityC17874.f53416.getVisibility() != 0) {
                    activityC17874.f53416.setVisibility(0);
                }
                activityC17874.f53416.setAlpha(f);
            }
        }
    }

    @Override // p067l.AbstractC21491, p067l.InterfaceC10091
    public final void onDrawerStateChanged(int i) {
        if (i == 2 || i == 1) {
            View viewFindFocus = this.f71566.f53420.findFocus();
            if (viewFindFocus instanceof C14146) {
                C14146 c14146 = (C14146) viewFindFocus;
                c14146.m32451();
                c14146.m32507();
            }
        }
    }
}
