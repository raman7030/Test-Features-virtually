package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.ۡܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5RE */
/* JADX INFO: loaded from: classes3.dex */
public class C8981 extends View {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Path f27289;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Paint f27290;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f27291;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f27292;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f27293;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f27294;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23213(boolean z) {
        this.f27293 = z;
    }

    public C8981(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27292 = 0;
        this.f27291 = true;
        if (isInEditMode()) {
            return;
        }
        this.f27289 = new Path();
        Paint paint = new Paint();
        this.f27290 = paint;
        paint.setAntiAlias(true);
    }

    public C8981(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27292 = 0;
        this.f27291 = true;
        if (isInEditMode()) {
            return;
        }
        this.f27289 = new Path();
        Paint paint = new Paint();
        this.f27290 = paint;
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f27291) {
            this.f27289.reset();
            int measuredWidth = getMeasuredWidth();
            float f = this.f27294 / this.f27292;
            this.f27289.lineTo(0.0f, 0.0f);
            if (f < 0.5f) {
                i = this.f27294;
            } else {
                i = this.f27292 - this.f27294;
            }
            float f2 = measuredWidth;
            if (!this.f27293) {
                f = 1.0f - f;
            }
            this.f27289.quadTo(f * f2, i, f2, 0.0f);
            this.f27289.lineTo(f2, 0.0f);
            canvas.drawPath(this.f27289, this.f27290);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23214(int i) {
        this.f27292 = i * 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23212(int i) {
        this.f27294 = i;
    }
}
