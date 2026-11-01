package p067l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.᩺ۜ */
/* JADX INFO: compiled from: E5GW */
/* JADX INFO: loaded from: classes.dex */
public final class C1974 extends FrameLayout implements InterfaceC1508 {

    /* JADX INFO: renamed from: ᩸ */
    public final CollapsibleActionView f76395;

    /* JADX WARN: Multi-variable type inference failed */
    public C1974(View view) {
        super(view.getContext());
        this.f76395 = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // p067l.InterfaceC1508
    /* JADX INFO: renamed from: ֫ */
    public final void mo34562() {
        this.f76395.onActionViewExpanded();
    }

    @Override // p067l.InterfaceC1508
    /* JADX INFO: renamed from: ۧ */
    public final void mo34563() {
        this.f76395.onActionViewCollapsed();
    }
}
