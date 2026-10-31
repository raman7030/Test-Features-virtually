package l;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Typeface;
import android.text.ClipboardManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: YALU */
/* JADX INFO: loaded from: classes3.dex */
public class C8864 extends View {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f26983;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ClipboardManager f26984;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Paint f26985;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float[] f26986;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f26987;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HandlerC9570 f26988;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f26989;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public TextView f26990;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Paint f26991;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f26992;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Path f26993;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public Paint f26994;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f26995;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f26996;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f26997;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f26998;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Bitmap f26999;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f27000;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Paint f27001;

    public C8864(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26993 = new Path();
        this.f26986 = new float[3];
        this.f26992 = "";
        this.f26987 = "";
        this.f26984 = (ClipboardManager) getContext().getApplicationContext().getSystemService("clipboard");
        float f = getResources().getDisplayMetrics().scaledDensity;
        this.f27001 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setStrokeWidth(1.0f);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f26991 = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(1.0f);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f26985 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setTypeface(Typeface.MONOSPACE);
        paint3.setTextSize(f * 12.0f);
        Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
        this.f26997 = (int) ((fontMetrics.bottom - fontMetrics.top) + 0.5f);
        this.f26996 = (int) (-fontMetrics.descent);
        this.f26994 = paint3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22902(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() != bitmap.getHeight()) {
            throw new IllegalArgumentException();
        }
        this.f26999 = bitmap;
        this.f26983 = i;
        this.f26989 = i2;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22901(float f, float f2) {
        float f3 = f - this.f27000;
        float f4 = f2 - this.f26998;
        int iSqrt = (int) Math.sqrt((f4 * f4) + (f3 * f3));
        float f5 = this.f26997 * 1.5f;
        float f6 = iSqrt;
        float f7 = this.f26995;
        if (f6 < f7 - f5 || f6 > f7 + f5) {
            return;
        }
        int iM22900 = m22900(f, f2);
        if (-70 <= iM22900 && iM22900 <= -5) {
            if (C13096.m31741()) {
                if (this.f26992.startsWith("#")) {
                    m22899(this.f26992.substring(1));
                    return;
                } else {
                    m22899(this.f26992.replaceAll("[RGB]", ""));
                    return;
                }
            }
            m22899(this.f26992);
            return;
        }
        if (5 <= iM22900 && iM22900 <= 70) {
            m22899(this.f26987);
        } else {
            if (160 > iM22900 || iM22900 > 200) {
                return;
            }
            C4925.m14335().stopService(new Intent(C4925.m14335(), (Class<?>) ServiceC3219.class));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m22904(float f, float f2) {
        int iM22900;
        float f3 = f - this.f27000;
        float f4 = f2 - this.f26998;
        int iSqrt = (int) Math.sqrt((f4 * f4) + (f3 * f3));
        float f5 = this.f26997 * 1.5f;
        float f6 = iSqrt;
        float f7 = this.f26995;
        if (f6 < f7 - f5 || f6 > f7 + f5 || -70 > (iM22900 = m22900(f, f2)) || iM22900 > -5) {
            return false;
        }
        C13096.m31740(!C13096.m31755());
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22899(String str) {
        String string;
        try {
            this.f26984.setText(str);
            string = C4925.m14306(R.string.MT_Protector, str);
        } catch (Exception e) {
            string = e.toString();
        }
        TextView textView = this.f26990;
        if (textView != null) {
            textView.setText(string);
            this.f26990.setVisibility(0);
            this.f26990.setAlpha(0.0f);
            this.f26988.removeMessages(0);
            this.f26988.sendEmptyMessageDelayed(0, 1500L);
            ObjectAnimator.ofFloat(this.f26990, "alpha", 0.0f, 1.0f).setDuration(150L).start();
            return;
        }
        C21374.m48459((CharSequence) string);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22903(TextView textView) {
        this.f26990 = textView;
        this.f26988 = textView == null ? null : new HandlerC9570(textView);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Paint.Style style = Paint.Style.FILL;
        Paint paint2 = this.f27001;
        paint2.setStyle(style);
        paint2.setStrokeWidth(1.0f);
        int i = this.f26995;
        int i2 = this.f27000;
        int i3 = this.f26998;
        Bitmap bitmap = this.f26999;
        int i4 = this.f26997;
        if (bitmap == null) {
            paint2.setColor(-1);
            float f = i2;
            float f2 = i3;
            canvas.drawCircle(f, f2, i, paint2);
            canvas.drawCircle(f, f2, i - i4, this.f26985);
            return;
        }
        int width = bitmap.getWidth();
        int i5 = (i - i4) * 2;
        int i6 = i5 / width;
        int i7 = (i6 * width) / 2;
        int i8 = i7 + i4;
        paint2.setColor(-16777216);
        float f3 = i2;
        float f4 = i3;
        int i9 = i8 - i4;
        float f5 = i9;
        canvas.drawCircle(f3, f4, f5, paint2);
        canvas.save();
        int i10 = -16777216;
        float f6 = f5;
        canvas.translate(i2 - i7, i3 - i7);
        int i11 = 0;
        while (true) {
            paint = this.f26991;
            if (i11 >= width) {
                break;
            }
            int i12 = i3;
            int i13 = 0;
            while (i13 < width) {
                int pixel = bitmap.getPixel(i11, i13);
                int i14 = i9;
                int i15 = pixel & i10;
                float f7 = f4;
                paint.setColor(i15 != -16777216 ? -4144960 : pixel);
                int i16 = i11 * i6;
                int i17 = i13 * i6;
                Paint paint3 = paint;
                canvas.drawRect(i16, i17, i16 + i6 + 1, i17 + i6 + 1, paint3);
                i13++;
                i8 = i8;
                f3 = f3;
                f4 = f7;
                i11 = i11;
                i9 = i14;
                f6 = f6;
                paint = paint3;
                i2 = i2;
                i10 = -16777216;
            }
            i11++;
            i3 = i12;
            f6 = f6;
            i2 = i2;
            i10 = -16777216;
        }
        int i18 = i9;
        float f8 = f4;
        int i19 = i8;
        int i20 = i2;
        int i21 = i3;
        float f9 = f6;
        float f10 = f3;
        if (C13096.m31754()) {
            paint.setColor(-986896);
            for (int i22 = 1; i22 < width; i22++) {
                float f11 = i22 * i6;
                float f12 = i5;
                canvas.drawLine(0.0f, f11, f12, f11, paint);
                canvas.drawLine(f11, 0.0f, f11, f12, paint);
            }
            paint.setColor(-6250336);
            for (int i23 = 1; i23 < width; i23++) {
                float f13 = (i23 * i6) + 1;
                float f14 = i5;
                canvas.drawLine(0.0f, f13, f14, f13, paint);
                canvas.drawLine(f13, 0.0f, f13, f14, paint);
            }
        }
        int i24 = width / 2;
        int pixel2 = bitmap.getPixel(i24, i24);
        float[] fArr = this.f26986;
        C7466.m20004(pixel2, fArr);
        float f15 = (fArr[2] * 0.7f) + ((1.0f - fArr[1]) * 0.3f);
        boolean z = f15 <= 0.5f;
        paint2.setColor(f15 <= 0.7f ? -1 : f15 < 0.9f ? -12303292 : -6710887);
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        paint2.setStrokeWidth(3.0f);
        int i25 = i24 * i6;
        float f16 = i25;
        float f17 = i25 + i6;
        canvas.drawRect(f16, f16, f17, f17, paint2);
        canvas.restore();
        float f18 = i4;
        paint2.setStrokeWidth(f18);
        paint2.setStyle(style2);
        paint2.setColor(pixel2);
        float f19 = i19;
        float f20 = f18 / 2.0f;
        canvas.drawCircle(f10, f8, (f19 - f20) - 1.0f, paint2);
        paint2.setStrokeWidth(1.0f);
        paint2.setColor(z ? -986896 : -6250336);
        canvas.drawCircle(f10, f8, f9, paint2);
        canvas.drawCircle(f10, f8, f19, paint2);
        paint2.setColor(z ? -6250336 : -986896);
        canvas.drawCircle(f10, f8, i18 + 1, paint2);
        canvas.drawCircle(f10, f8, i19 - 1, paint2);
        if (C13096.m31755()) {
            StringBuilder sb = new StringBuilder(7);
            sb.append('#');
            sb.append("0123456789ABCDEF".charAt((pixel2 >>> 20) & 15));
            sb.append("0123456789ABCDEF".charAt((pixel2 >>> 16) & 15));
            sb.append("0123456789ABCDEF".charAt((pixel2 >>> 12) & 15));
            sb.append("0123456789ABCDEF".charAt((pixel2 >>> 8) & 15));
            sb.append("0123456789ABCDEF".charAt((pixel2 >>> 4) & 15));
            sb.append("0123456789ABCDEF".charAt(pixel2 & 15));
            this.f26992 = sb.toString();
        } else {
            this.f26992 = "R" + ((pixel2 >> 16) & 255) + ",G" + ((pixel2 >> 8) & 255) + ",B" + (pixel2 & 255);
        }
        this.f26987 = (this.f26983 + 1) + "," + (this.f26989 + 1);
        int i26 = f15 <= 0.7f ? -1 : -16777216;
        Paint paint4 = this.f26994;
        paint4.setColor(i26);
        int i27 = i18 - this.f26996;
        Path path = this.f26993;
        path.reset();
        float f21 = i20 - i27;
        float f22 = i21 - i27;
        float f23 = i20 + i27;
        float f24 = i21 + i27;
        path.addArc(f21, f22, f23, f24, C13096.m31755() ? 165.0f : 180.0f, 90.0f);
        paint4.setTextAlign(Paint.Align.RIGHT);
        canvas.drawTextOnPath(this.f26992, path, 0.0f, 0.0f, paint4);
        path.reset();
        path.addArc(f21, f22, f23, f24, 285.0f, 90.0f);
        paint4.setTextAlign(Paint.Align.LEFT);
        canvas.drawTextOnPath(this.f26987, path, 0.0f, 0.0f, paint4);
        canvas.save();
        canvas.translate(f10, (i21 + i19) - f20);
        canvas.rotate(45.0f);
        float f25 = f20 * 0.7f;
        float f26 = f25 * 0.11f;
        float f27 = -f25;
        float f28 = -f26;
        canvas.drawRect(f27, f28, f25, f26, paint4);
        canvas.drawRect(f28, f27, f26, f25, paint4);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f26995 = (Math.min(i, i2) / 2) - 1;
        this.f27000 = i / 2;
        this.f26998 = i2 / 2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m22900(float f, float f2) {
        int i = this.f27000;
        float f3 = i;
        float f4 = i;
        float f5 = this.f26998;
        return (int) Math.toDegrees(Math.atan2(f2 - f5, f - f4) - Math.atan2(0.0f - f5, f3 - f4));
    }
}
