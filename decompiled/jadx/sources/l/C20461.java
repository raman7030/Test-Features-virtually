package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.᩶᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5UO */
/* JADX INFO: loaded from: classes4.dex */
public class C20461 extends ImageView {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f65965;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f65966;

    public C20461(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C20461(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f65966 = Integer.MAX_VALUE;
        this.f65965 = Integer.MAX_VALUE;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9878.f29903, i, 0);
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE));
        setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView
    public final void setMaxWidth(int i) {
        this.f65966 = i;
        super.setMaxWidth(i);
    }

    @Override // android.widget.ImageView
    public final int getMaxWidth() {
        return this.f65966;
    }

    @Override // android.widget.ImageView
    public final void setMaxHeight(int i) {
        this.f65965 = i;
        super.setMaxHeight(i);
    }

    @Override // android.widget.ImageView
    public final int getMaxHeight() {
        return this.f65965;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.f65966;
            if (i3 != Integer.MAX_VALUE && (i3 < size || mode == 0)) {
                i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i2);
            int i4 = this.f65965;
            if (i4 != Integer.MAX_VALUE && (i4 < size2 || mode2 == 0)) {
                i2 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
    }
}
