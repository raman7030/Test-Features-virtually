package l;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ۚܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5382 extends C0442 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C21610 f16736 = C21610.m48814(null, WindowInsets.CONSUMED);

    @Override // l.C3971, l.C1148
    /* JADX INFO: renamed from: ֫ */
    public final void mo3934(View view) {
    }

    public C5382(C21610 c21610, WindowInsets windowInsets) {
        super(c21610, windowInsets);
    }

    @Override // l.C3971, l.C1148
    /* JADX INFO: renamed from: ֫ */
    public C11007 mo3932(int i) {
        return C11007.m27342(this.f12605.getInsets(C15258.m36269(i)));
    }

    @Override // l.C3971, l.C1148
    /* JADX INFO: renamed from: ۧ */
    public C11007 mo3940(int i) {
        return C11007.m27342(this.f12605.getInsetsIgnoringVisibility(C15258.m36269(i)));
    }

    @Override // l.C3971, l.C1148
    /* JADX INFO: renamed from: ܽ */
    public boolean mo3944(int i) {
        return this.f12605.isVisible(C15258.m36269(i));
    }
}
