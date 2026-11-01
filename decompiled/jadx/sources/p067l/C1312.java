package p067l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۢۡ */
/* JADX INFO: compiled from: O5U4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1312 extends RatingBar {

    /* JADX INFO: renamed from: ᩸ */
    public final C1172 f31743;

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmapM20117 = this.f31743.m20117();
        if (bitmapM20117 != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapM20117.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public C1312(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C1312(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1480.m33375(getContext(), this);
        C1172 c1172 = new C1172(this);
        this.f31743 = c1172;
        c1172.mo9892(attributeSet, i);
    }
}
