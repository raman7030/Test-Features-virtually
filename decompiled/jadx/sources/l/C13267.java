package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W51Z */
/* JADX INFO: loaded from: classes3.dex */
public class C13267 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f39731;

    public C13267(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39731 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3390.f10708);
        this.f39731 = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public C13267(C13267 c13267) {
        super((ViewGroup.MarginLayoutParams) c13267);
        this.f39731 = 0;
        this.f39731 = c13267.f39731;
    }

    public C13267(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f39731 = 0;
    }
}
