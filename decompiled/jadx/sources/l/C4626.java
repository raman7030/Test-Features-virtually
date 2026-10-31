package l;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: l.ۙۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X62V */
/* JADX INFO: loaded from: classes2.dex */
public final class C4626 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m13576(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m13577(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13575(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }
}
