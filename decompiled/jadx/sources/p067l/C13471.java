package p067l;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: l.ۨۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1N9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13471 extends C8106 {
    @Override // p067l.C21518
    /* JADX INFO: renamed from: ֫ */
    public final void mo30613(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p067l.C21518
    /* JADX INFO: renamed from: ֫ */
    public final float mo30612(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p067l.C8106, p067l.C21518
    /* JADX INFO: renamed from: ֫ */
    public final void mo18801(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p067l.C14141, p067l.C21518
    /* JADX INFO: renamed from: ֫ */
    public final void mo30614(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p067l.C5424
    /* JADX INFO: renamed from: ֫ */
    public final void mo11904(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p067l.C5424
    /* JADX INFO: renamed from: ۧ */
    public final void mo11905(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
