package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes2.dex */
public class C2664 extends C9503 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final int f8368;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final int f8369;

    public C2664(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3390.f10721);
        this.f8369 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f8368 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        setFastScrollEnabled(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8348(boolean z, boolean z2) {
        if (z2 && z) {
            return;
        }
        setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f8368, getPaddingRight(), z2 ? getPaddingBottom() : this.f8369);
    }
}
