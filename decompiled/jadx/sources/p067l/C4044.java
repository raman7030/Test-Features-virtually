package p067l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.֫ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BG */
/* JADX INFO: loaded from: classes2.dex */
public class C4044 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ᩳ */
    public static final int[] f8889 = {R.attr.layout_weight};

    /* JADX INFO: renamed from: ֫ */
    public boolean f8890;

    /* JADX INFO: renamed from: ۧ */
    public boolean f8891;

    /* JADX INFO: renamed from: ܽ */
    public float f8892;

    public C4044() {
        super(-1, -1);
        this.f8892 = 0.0f;
    }

    public C4044(int i) {
        super(i, -1);
        this.f8892 = 0.0f;
    }

    public C4044(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8892 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8889);
        this.f8892 = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
