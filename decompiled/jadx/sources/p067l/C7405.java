package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ۚۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7405 extends AbstractC21491 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ActivityC18686 f19378;

    public C7405(ActivityC18686 activityC18686) {
        this.f19378 = activityC18686;
    }

    @Override // p067l.AbstractC21491, p067l.InterfaceC10091
    public final void onDrawerOpened(View view) {
        ActivityC18686 activityC18686 = this.f19378;
        if (activityC18686.f55782) {
            activityC18686.f55792.setVisibility(0);
            activityC18686.f55792.setAlpha(1.0f);
        }
    }

    @Override // p067l.AbstractC21491, p067l.InterfaceC10091
    public final void onDrawerClosed(View view) {
        ActivityC18686 activityC18686 = this.f19378;
        activityC18686.f55780.m41179(false);
        if (activityC18686.f55792.getVisibility() == 0) {
            activityC18686.f55792.setVisibility(8);
        }
    }

    @Override // p067l.AbstractC21491, p067l.InterfaceC10091
    public final void onDrawerSlide(View view, float f) {
        ActivityC18686 activityC18686 = this.f19378;
        if (activityC18686.f55782) {
            if (f == 0.0f) {
                if (activityC18686.f55792.getVisibility() == 0) {
                    activityC18686.f55792.setVisibility(8);
                }
            } else {
                if (activityC18686.f55792.getVisibility() != 0) {
                    activityC18686.f55792.setVisibility(0);
                }
                activityC18686.f55792.setAlpha(f);
            }
        }
    }

    @Override // p067l.AbstractC21491, p067l.InterfaceC10091
    public final void onDrawerStateChanged(int i) {
        if (i == 2 || i == 1) {
            View viewFindFocus = this.f19378.f55786.findFocus();
            if (viewFindFocus instanceof C14146) {
                C14146 c14146 = (C14146) viewFindFocus;
                c14146.m32451();
                c14146.m32507();
            }
        }
    }
}
