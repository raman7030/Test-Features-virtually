package l;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: l.ۨۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1N9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11682 extends C6037 {
    @Override // l.C20149
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28565(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // l.C20149
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float mo28564(View view) {
        return view.getTransitionAlpha();
    }

    @Override // l.C6037, l.C20149
    /* JADX INFO: renamed from: ֫ */
    public final void mo16873(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // l.C12387, l.C20149
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28566(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // l.C3215
    /* JADX INFO: renamed from: ֫ */
    public final void mo9857(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // l.C3215
    /* JADX INFO: renamed from: ۧ */
    public final void mo9858(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
