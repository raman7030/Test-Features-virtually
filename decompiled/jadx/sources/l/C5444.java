package l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5QJ */
/* JADX INFO: loaded from: classes3.dex */
public class C5444 extends C14615 {
    public C5444(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C5444(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // l.C14615, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int lineCount;
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        setSingleLine(false);
        setMaxLines(2);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C3390.f10698, R.attr.textAppearanceMedium, R.style.TextAppearance.Medium);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
        super.onMeasure(i, i2);
    }
}
