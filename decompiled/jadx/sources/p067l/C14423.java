package p067l;

import android.text.Selection;

/* JADX INFO: renamed from: l.۫᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: CB2D */
/* JADX INFO: loaded from: classes4.dex */
public final class C14423 implements InterfaceC9689 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C12412 f41227;

    public C14423(C12412 c12412) {
        this.f41227 = c12412;
    }

    @Override // p067l.InterfaceC9689
    /* JADX INFO: renamed from: ֫ */
    public final void mo22598(C7205 c7205) {
        C12412 c12412 = this.f41227;
        c12412.getClass();
        if (c7205.m16550() >= 0 && c7205.m16548() >= 0) {
            c12412.setSelection(c7205.m16550(), c7205.m16548());
            return;
        }
        if (c7205.m16550() < 0) {
            c12412.removeSpan(Selection.SELECTION_START);
        } else {
            c12412.setSpan(Selection.SELECTION_START, Math.min(c7205.m16550(), c12412.length()), Math.min(c7205.m16550(), c12412.length()), 34);
        }
        if (c7205.m16548() < 0) {
            c12412.removeSpan(Selection.SELECTION_END);
        } else {
            c12412.setSpan(Selection.SELECTION_END, Math.min(c7205.m16548(), c12412.length()), Math.min(c7205.m16548(), c12412.length()), 34);
        }
    }

    @Override // p067l.InterfaceC9689
    /* JADX INFO: renamed from: ֫ */
    public final void mo22599(C12610 c12610, int i, int i2, C15113 c15113) {
        this.f41227.m28573(i, i2, c15113, 0, c15113.length(), c12610);
    }
}
