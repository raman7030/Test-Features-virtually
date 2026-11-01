package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ۖܿ */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes2.dex */
public class C0974 extends C11400 {

    /* JADX INFO: renamed from: ֡֫ */
    public final int f11163;

    /* JADX INFO: renamed from: ᩵֫ */
    public final int f11164;

    public C0974(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1010.f13528);
        this.f11164 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f11163 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        setFastScrollEnabled(true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10394(boolean z, boolean z2) {
        if (z2 && z) {
            return;
        }
        setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f11163, getPaddingRight(), z2 ? getPaddingBottom() : this.f11164);
    }
}
