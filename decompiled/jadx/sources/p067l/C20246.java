package p067l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ᩴܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20246 implements InterfaceC1562 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C10187 f62587;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ViewGroup f62588;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C7014 f62589;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ View f62590;

    public C20246(View view, ViewGroup viewGroup, C10187 c10187, C7014 c7014) {
        this.f62590 = view;
        this.f62588 = viewGroup;
        this.f62587 = c10187;
        this.f62589 = c7014;
    }

    @Override // p067l.InterfaceC1562
    /* JADX INFO: renamed from: ֫ */
    public final void mo26244() {
        View view = this.f62590;
        view.clearAnimation();
        this.f62588.endViewTransition(view);
        this.f62587.m38448();
        if (AbstractC7291.m16763(2)) {
            C12826.toString(this.f62589);
        }
    }
}
