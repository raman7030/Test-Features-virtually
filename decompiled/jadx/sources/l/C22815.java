package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GW */
/* JADX INFO: loaded from: classes.dex */
public final class C22815 extends FrameLayout implements InterfaceC13434 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CollapsibleActionView f73663;

    /* JADX WARN: Multi-variable type inference failed */
    public C22815(View view) {
        super(view.getContext());
        this.f73663 = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // l.InterfaceC13434
    /* JADX INFO: renamed from: ֫ */
    public final void mo32460() {
        this.f73663.onActionViewExpanded();
    }

    @Override // l.InterfaceC13434
    /* JADX INFO: renamed from: ۧ */
    public final void mo32461() {
        this.f73663.onActionViewCollapsed();
    }
}
