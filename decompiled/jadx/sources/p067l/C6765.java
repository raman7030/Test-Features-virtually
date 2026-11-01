package p067l;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: l.ۙۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X62V */
/* JADX INFO: loaded from: classes2.dex */
public final class C6765 {
    /* JADX INFO: renamed from: ۧ */
    public static void m15451(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m15452(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15450(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }
}
