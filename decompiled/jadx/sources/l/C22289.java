package l;

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
public class C22289 extends View {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final long f72282;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final long f72283;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f72284;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f72285;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Paint f72286;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float f72287;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f72288;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f72289;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Paint f72290;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f72291;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final RectF f72292;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f72293;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f72283 = timeUnit.toMillis(15L);
        f72282 = timeUnit.toMillis(7L);
    }

    public C22289(Context context, AttributeSet attributeSet) {
        int iM3228;
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f72286 = paint;
        Paint paint2 = new Paint(1);
        this.f72290 = paint2;
        this.f72292 = new RectF();
        this.f72289 = 1.0f;
        float f = getResources().getDisplayMetrics().density;
        float f2 = 1.6f * f;
        this.f72287 = f2;
        this.f72291 = Math.round(f * 14.0f);
        int i = C21943.f70257;
        this.f72285 = i;
        this.f72293 = C21943.f70263;
        this.f72288 = C21943.f70293;
        this.f72284 = i;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                iM3228 = C0881.m3228(context, i2);
            } else {
                iM3228 = typedValue.data;
            }
        } else {
            iM3228 = -7829368;
        }
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(f2);
        paint.setColor(iM3228);
        paint.setAlpha(44);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(f2);
        paint2.setColor(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50009(long j, long j2) {
        int i;
        float fMax = Math.max(0.0f, Math.min(1.0f, j2 > 0 ? j / j2 : 0.0f));
        if (j > 0 && j < f72282) {
            i = this.f72288;
        } else if (j > 0 && j <= f72283) {
            i = this.f72293;
        } else {
            i = this.f72285;
        }
        if (this.f72289 == fMax && this.f72284 == i) {
            return;
        }
        this.f72289 = fMax;
        this.f72284 = i;
        this.f72290.setColor(i);
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f72291;
        setMeasuredDimension(View.resolveSize(i3, i), View.resolveSize(i3, i2));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f72287 / 2.0f;
        float width = getWidth() - f;
        float height = getHeight() - f;
        RectF rectF = this.f72292;
        rectF.set(f, f, width, height);
        canvas.drawOval(rectF, this.f72286);
        canvas.drawArc(rectF, -90.0f, this.f72289 * 360.0f, false, this.f72290);
    }
}
