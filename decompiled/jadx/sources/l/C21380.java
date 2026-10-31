package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩸ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21380 extends AbstractC20121 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f68871;

    public C21380(ActivityC16315 activityC16315) {
        this.f68871 = activityC16315;
    }

    @Override // l.AbstractC20121, l.InterfaceC8126
    public final void onDrawerOpened(View view) {
        ActivityC16315 activityC16315 = this.f68871;
        if (activityC16315.f50240) {
            activityC16315.f50249.setVisibility(0);
            activityC16315.f50249.setAlpha(1.0f);
        }
    }

    @Override // l.AbstractC20121, l.InterfaceC8126
    public final void onDrawerClosed(View view) {
        ActivityC16315 activityC16315 = this.f68871;
        activityC16315.f50244.m38953(false);
        if (activityC16315.f50249.getVisibility() == 0) {
            activityC16315.f50249.setVisibility(8);
        }
    }

    @Override // l.AbstractC20121, l.InterfaceC8126
    public final void onDrawerSlide(View view, float f) {
        ActivityC16315 activityC16315 = this.f68871;
        if (activityC16315.f50240) {
            if (f == 0.0f) {
                if (activityC16315.f50249.getVisibility() == 0) {
                    activityC16315.f50249.setVisibility(8);
                }
            } else {
                if (activityC16315.f50249.getVisibility() != 0) {
                    activityC16315.f50249.setVisibility(0);
                }
                activityC16315.f50249.setAlpha(f);
            }
        }
    }

    @Override // l.AbstractC20121, l.InterfaceC8126
    public final void onDrawerStateChanged(int i) {
        if (i == 2 || i == 1) {
            View viewFindFocus = this.f68871.f50253.findFocus();
            if (viewFindFocus instanceof C12392) {
                C12392 c12392 = (C12392) viewFindFocus;
                c12392.m30387();
                c12392.m30443();
            }
        }
    }
}
