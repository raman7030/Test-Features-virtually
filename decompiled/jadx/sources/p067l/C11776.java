package p067l;

import android.animation.TypeEvaluator;

/* JADX INFO: renamed from: l.ۢ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84NK */
/* JADX INFO: loaded from: classes3.dex */
public final class C11776 implements TypeEvaluator {

    /* JADX INFO: renamed from: ֫ */
    public C1703[] f32905;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        C1703[] c1703Arr = (C1703[]) obj;
        C1703[] c1703Arr2 = (C1703[]) obj2;
        if (!C1563.m36820(c1703Arr, c1703Arr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!C1563.m36820(this.f32905, c1703Arr)) {
            this.f32905 = C1563.m36823(c1703Arr);
        }
        for (int i = 0; i < c1703Arr.length; i++) {
            this.f32905[i].m42937(c1703Arr[i], c1703Arr2[i], f);
        }
        return this.f32905;
    }
}
