package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5U4 */
/* JADX INFO: loaded from: classes3.dex */
public class C9473 extends RatingBar {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6650 f28794;

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmapM18169 = this.f28794.m18169();
        if (bitmapM18169 != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapM18169.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public C9473(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C9473(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C12855.m31289(getContext(), this);
        C6650 c6650 = new C6650(this);
        this.f28794 = c6650;
        c6650.mo7844(attributeSet, i);
    }
}
