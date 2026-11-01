package p067l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.ۡܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5RE */
/* JADX INFO: loaded from: classes3.dex */
public class C10904 extends View {

    /* JADX INFO: renamed from: ۗ */
    public Path f30224;

    /* JADX INFO: renamed from: ۙ */
    public Paint f30225;

    /* JADX INFO: renamed from: ۬ */
    public boolean f30226;

    /* JADX INFO: renamed from: ᩶ */
    public int f30227;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f30228;

    /* JADX INFO: renamed from: ᩹ */
    public int f30229;

    /* JADX INFO: renamed from: ֫ */
    public final void m25157(boolean z) {
        this.f30228 = z;
    }

    public C10904(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30227 = 0;
        this.f30226 = true;
        if (isInEditMode()) {
            return;
        }
        this.f30224 = new Path();
        Paint paint = new Paint();
        this.f30225 = paint;
        paint.setAntiAlias(true);
    }

    public C10904(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30227 = 0;
        this.f30226 = true;
        if (isInEditMode()) {
            return;
        }
        this.f30224 = new Path();
        Paint paint = new Paint();
        this.f30225 = paint;
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f30226) {
            this.f30224.reset();
            int measuredWidth = getMeasuredWidth();
            float f = this.f30229 / this.f30227;
            this.f30224.lineTo(0.0f, 0.0f);
            if (f < 0.5f) {
                i = this.f30229;
            } else {
                i = this.f30227 - this.f30229;
            }
            float f2 = measuredWidth;
            if (!this.f30228) {
                f = 1.0f - f;
            }
            this.f30224.quadTo(f * f2, i, f2, 0.0f);
            this.f30224.lineTo(f2, 0.0f);
            canvas.drawPath(this.f30224, this.f30225);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m25158(int i) {
        this.f30227 = i * 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25156(int i) {
        this.f30229 = i;
    }
}
