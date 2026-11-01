package p067l;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩹۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7AX */
/* JADX INFO: loaded from: classes.dex */
public class C23552 extends View {

    /* JADX INFO: renamed from: ܰ */
    public static final long f75005;

    /* JADX INFO: renamed from: ᩺ */
    public static final long f75006;

    /* JADX INFO: renamed from: ۗ */
    public int f75007;

    /* JADX INFO: renamed from: ۙ */
    public final int f75008;

    /* JADX INFO: renamed from: ۛ */
    public final Paint f75009;

    /* JADX INFO: renamed from: ۤ */
    public final float f75010;

    /* JADX INFO: renamed from: ۨ */
    public final int f75011;

    /* JADX INFO: renamed from: ۫ */
    public float f75012;

    /* JADX INFO: renamed from: ۬ */
    public final Paint f75013;

    /* JADX INFO: renamed from: ᩶ */
    public final int f75014;

    /* JADX INFO: renamed from: ᩸ */
    public final RectF f75015;

    /* JADX INFO: renamed from: ᩹ */
    public final int f75016;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f75006 = timeUnit.toMillis(15L);
        f75005 = timeUnit.toMillis(7L);
    }

    public C23552(Context context, AttributeSet attributeSet) {
        int iM5542;
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f75009 = paint;
        Paint paint2 = new Paint(1);
        this.f75013 = paint2;
        this.f75015 = new RectF();
        this.f75012 = 1.0f;
        float f = getResources().getDisplayMetrics().density;
        float f2 = 1.6f * f;
        this.f75010 = f2;
        this.f75014 = Math.round(f * 14.0f);
        int i = C23223.f72969;
        this.f75008 = i;
        this.f75016 = C23223.f72975;
        this.f75011 = C23223.f73004;
        this.f75007 = i;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                iM5542 = C0886.m5542(context, i2);
            } else {
                iM5542 = typedValue.data;
            }
        } else {
            iM5542 = -7829368;
        }
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(f2);
        paint.setColor(iM5542);
        paint.setAlpha(44);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(f2);
        paint2.setColor(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52337(long j, long j2) {
        int i;
        float fMax = Math.max(0.0f, Math.min(1.0f, j2 > 0 ? j / j2 : 0.0f));
        if (j > 0 && j < f75005) {
            i = this.f75011;
        } else if (j > 0 && j <= f75006) {
            i = this.f75016;
        } else {
            i = this.f75008;
        }
        if (this.f75012 == fMax && this.f75007 == i) {
            return;
        }
        this.f75012 = fMax;
        this.f75007 = i;
        this.f75013.setColor(i);
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f75014;
        setMeasuredDimension(View.resolveSize(i3, i), View.resolveSize(i3, i2));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f75010 / 2.0f;
        float width = getWidth() - f;
        float height = getHeight() - f;
        RectF rectF = this.f75015;
        rectF.set(f, f, width, height);
        canvas.drawOval(rectF, this.f75009);
        canvas.drawArc(rectF, -90.0f, this.f75012 * 360.0f, false, this.f75013);
    }
}
