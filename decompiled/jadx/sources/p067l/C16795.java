package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܶۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes4.dex */
public class C16795 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ֫ */
    public int f49496;

    /* JADX INFO: renamed from: ۧ */
    public boolean f49497;

    /* JADX INFO: renamed from: ܽ */
    public float f49498;

    /* JADX INFO: renamed from: ᩳ */
    public int f49499;

    public C16795(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49496 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14784.f42151);
        this.f49496 = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
