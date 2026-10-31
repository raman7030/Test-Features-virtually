package l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.֫ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BG */
/* JADX INFO: loaded from: classes2.dex */
public class C1763 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f6113 = {R.attr.layout_weight};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f6114;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f6115;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f6116;

    public C1763() {
        super(-1, -1);
        this.f6116 = 0.0f;
    }

    public C1763(int i) {
        super(i, -1);
        this.f6116 = 0.0f;
    }

    public C1763(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6116 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6113);
        this.f6116 = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
