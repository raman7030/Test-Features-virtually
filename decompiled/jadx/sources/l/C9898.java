package l;

import android.animation.TypeEvaluator;

/* JADX INFO: renamed from: l.ۢ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84NK */
/* JADX INFO: loaded from: classes3.dex */
public final class C9898 implements TypeEvaluator {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17356[] f29947;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        C17356[] c17356Arr = (C17356[]) obj;
        C17356[] c17356Arr2 = (C17356[]) obj2;
        if (!C14533.m34677(c17356Arr, c17356Arr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!C14533.m34677(this.f29947, c17356Arr)) {
            this.f29947 = C14533.m34680(c17356Arr);
        }
        for (int i = 0; i < c17356Arr.length; i++) {
            this.f29947[i].m40686(c17356Arr[i], c17356Arr2[i], f);
        }
        return this.f29947;
    }
}
