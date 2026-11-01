package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.۬ᩳ */
/* JADX INFO: compiled from: W51Z */
/* JADX INFO: loaded from: classes3.dex */
public class C1500 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ֫ */
    public int f42796;

    public C1500(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42796 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1010.f13515);
        this.f42796 = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public C1500(C1500 c1500) {
        super((ViewGroup.MarginLayoutParams) c1500);
        this.f42796 = 0;
        this.f42796 = c1500.f42796;
    }

    public C1500(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f42796 = 0;
    }
}
