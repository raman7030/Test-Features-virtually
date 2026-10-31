package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܶ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15470 extends C4888 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C5885 f47348;

    public C15470(EnumC20411 enumC20411, EnumC22527 enumC22527, C5885 c5885, C23686 c23686) {
        super(enumC20411, enumC22527, c5885.m16488(), c23686);
        this.f47348 = c5885;
    }

    @Override // l.C4888
    /* JADX INFO: renamed from: ۜ */
    public final void mo14242() {
        EnumC22527 enumC22527M14247 = m14247();
        EnumC22527 enumC22527 = EnumC22527.ADDING;
        C5885 c5885 = this.f47348;
        if (enumC22527M14247 == enumC22527) {
            ComponentCallbacksC9205 componentCallbacksC9205M16488 = c5885.m16488();
            View viewFindFocus = componentCallbacksC9205M16488.mView.findFocus();
            if (viewFindFocus != null) {
                componentCallbacksC9205M16488.setFocusedView(viewFindFocus);
                if (AbstractC5180.m14853(2)) {
                    viewFindFocus.toString();
                    componentCallbacksC9205M16488.toString();
                }
            }
            View viewRequireView = m14248().requireView();
            if (viewRequireView.getParent() == null) {
                c5885.m16475();
                viewRequireView.setAlpha(0.0f);
            }
            if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                viewRequireView.setVisibility(4);
            }
            viewRequireView.setAlpha(componentCallbacksC9205M16488.getPostOnViewCreatedAlpha());
            return;
        }
        if (m14247() == EnumC22527.REMOVING) {
            ComponentCallbacksC9205 componentCallbacksC9205M16489 = c5885.m16488();
            View viewRequireView2 = componentCallbacksC9205M16489.requireView();
            if (AbstractC5180.m14853(2)) {
                C11003.toString(viewRequireView2.findFocus());
                viewRequireView2.toString();
                componentCallbacksC9205M16489.toString();
            }
            viewRequireView2.clearFocus();
        }
    }

    @Override // l.C4888
    /* JADX INFO: renamed from: ۧ */
    public final void mo14243() {
        super.mo14243();
        this.f47348.m16481();
    }
}
