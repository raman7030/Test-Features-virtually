package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ܶ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17071 extends C7014 {

    /* JADX INFO: renamed from: ۜ */
    public final C7961 f50479;

    public C17071(EnumC21767 enumC21767, EnumC23778 enumC23778, C7961 c7961, C2017 c2017) {
        super(enumC21767, enumC23778, c7961.m18414(), c2017);
        this.f50479 = c7961;
    }

    @Override // p067l.C7014
    /* JADX INFO: renamed from: ۜ */
    public final void mo16139() {
        EnumC23778 enumC23778M16144 = m16144();
        EnumC23778 enumC23778 = EnumC23778.ADDING;
        C7961 c7961 = this.f50479;
        if (enumC23778M16144 == enumC23778) {
            ComponentCallbacksC11117 componentCallbacksC11117M18414 = c7961.m18414();
            View viewFindFocus = componentCallbacksC11117M18414.mView.findFocus();
            if (viewFindFocus != null) {
                componentCallbacksC11117M18414.setFocusedView(viewFindFocus);
                if (AbstractC7291.m16763(2)) {
                    viewFindFocus.toString();
                    componentCallbacksC11117M18414.toString();
                }
            }
            View viewRequireView = m16145().requireView();
            if (viewRequireView.getParent() == null) {
                c7961.m18401();
                viewRequireView.setAlpha(0.0f);
            }
            if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                viewRequireView.setVisibility(4);
            }
            viewRequireView.setAlpha(componentCallbacksC11117M18414.getPostOnViewCreatedAlpha());
            return;
        }
        if (m16144() == EnumC23778.REMOVING) {
            ComponentCallbacksC11117 componentCallbacksC11117M18415 = c7961.m18414();
            View viewRequireView2 = componentCallbacksC11117M18415.requireView();
            if (AbstractC7291.m16763(2)) {
                C12826.toString(viewRequireView2.findFocus());
                viewRequireView2.toString();
                componentCallbacksC11117M18415.toString();
            }
            viewRequireView2.clearFocus();
        }
    }

    @Override // p067l.C7014
    /* JADX INFO: renamed from: ۧ */
    public final void mo16140() {
        super.mo16140();
        this.f50479.m18407();
    }
}
