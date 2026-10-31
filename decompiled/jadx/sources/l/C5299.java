package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۚۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5299 extends AbstractC20121 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f16541;

    public C5299(ActivityC17169 activityC17169) {
        this.f16541 = activityC17169;
    }

    @Override // l.AbstractC20121, l.InterfaceC8126
    public final void onDrawerOpened(View view) {
        ActivityC17169 activityC17169 = this.f16541;
        if (activityC17169.f52601) {
            activityC17169.f52611.setVisibility(0);
            activityC17169.f52611.setAlpha(1.0f);
        }
    }

    @Override // l.AbstractC20121, l.InterfaceC8126
    public final void onDrawerClosed(View view) {
        ActivityC17169 activityC17169 = this.f16541;
        activityC17169.f52599.m38953(false);
        if (activityC17169.f52611.getVisibility() == 0) {
            activityC17169.f52611.setVisibility(8);
        }
    }

    @Override // l.AbstractC20121, l.InterfaceC8126
    public final void onDrawerSlide(View view, float f) {
        ActivityC17169 activityC17169 = this.f16541;
        if (activityC17169.f52601) {
            if (f == 0.0f) {
                if (activityC17169.f52611.getVisibility() == 0) {
                    activityC17169.f52611.setVisibility(8);
                }
            } else {
                if (activityC17169.f52611.getVisibility() != 0) {
                    activityC17169.f52611.setVisibility(0);
                }
                activityC17169.f52611.setAlpha(f);
            }
        }
    }

    @Override // l.AbstractC20121, l.InterfaceC8126
    public final void onDrawerStateChanged(int i) {
        if (i == 2 || i == 1) {
            View viewFindFocus = this.f16541.f52605.findFocus();
            if (viewFindFocus instanceof C12392) {
                C12392 c12392 = (C12392) viewFindFocus;
                c12392.m30387();
                c12392.m30443();
            }
        }
    }
}
