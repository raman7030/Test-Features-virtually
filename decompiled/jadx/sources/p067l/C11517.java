package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۢܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes3.dex */
public class C11517 extends ViewGroup.LayoutParams {

    /* JADX INFO: renamed from: ֫ */
    public int f32124;

    /* JADX INFO: renamed from: ۧ */
    public boolean f32125;

    /* JADX INFO: renamed from: ܽ */
    public boolean f32126;

    /* JADX INFO: renamed from: ᩳ */
    public float f32127;

    public C11517() {
        super(-1, -1);
        this.f32127 = 0.0f;
    }

    public C11517(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32127 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2798.f4743);
        this.f32124 = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
    }
}
