package p067l;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: renamed from: l.֨ۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55K6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3255 implements TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        int i = rect.left;
        int i2 = i + ((int) ((rect2.left - i) * f));
        int i3 = rect.top;
        int i4 = i3 + ((int) ((rect2.top - i3) * f));
        int i5 = rect.right;
        int i6 = i5 + ((int) ((rect2.right - i5) * f));
        int i7 = rect.bottom;
        return new Rect(i2, i4, i6, i7 + ((int) ((rect2.bottom - i7) * f)));
    }
}
