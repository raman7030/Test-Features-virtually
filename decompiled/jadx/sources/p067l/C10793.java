package p067l;

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
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۡۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: YALU */
/* JADX INFO: loaded from: classes3.dex */
public class C10793 extends View {

    /* JADX INFO: renamed from: ֫֫ */
    public int f29906;

    /* JADX INFO: renamed from: ۗ */
    public ClipboardManager f29907;

    /* JADX INFO: renamed from: ۙ */
    public Paint f29908;

    /* JADX INFO: renamed from: ۛ */
    public float[] f29909;

    /* JADX INFO: renamed from: ۟ */
    public String f29910;

    /* JADX INFO: renamed from: ۤ */
    public HandlerC11464 f29911;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f29912;

    /* JADX INFO: renamed from: ۨ */
    public TextView f29913;

    /* JADX INFO: renamed from: ۫ */
    public Paint f29914;

    /* JADX INFO: renamed from: ۬ */
    public String f29915;

    /* JADX INFO: renamed from: ܰ */
    public Path f29916;

    /* JADX INFO: renamed from: ܳ֫ */
    public Paint f29917;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f29918;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f29919;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f29920;

    /* JADX INFO: renamed from: ᩶ */
    public int f29921;

    /* JADX INFO: renamed from: ᩸ */
    public Bitmap f29922;

    /* JADX INFO: renamed from: ᩹ */
    public int f29923;

    /* JADX INFO: renamed from: ᩺ */
    public Paint f29924;

    public C10793(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29916 = new Path();
        this.f29909 = new float[3];
        this.f29915 = "";
        this.f29910 = "";
        this.f29907 = (ClipboardManager) getContext().getApplicationContext().getSystemService("clipboard");
        float f = getResources().getDisplayMetrics().scaledDensity;
        this.f29924 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setStrokeWidth(1.0f);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f29914 = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(1.0f);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f29908 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setTypeface(Typeface.MONOSPACE);
        paint3.setTextSize(f * 12.0f);
        Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
        this.f29920 = (int) ((fontMetrics.bottom - fontMetrics.top) + 0.5f);
        this.f29919 = (int) (-fontMetrics.descent);
        this.f29917 = paint3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24873(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() != bitmap.getHeight()) {
            throw new IllegalArgumentException();
        }
        this.f29922 = bitmap;
        this.f29906 = i;
        this.f29912 = i2;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24872(float f, float f2) {
        float f3 = f - this.f29923;
        float f4 = f2 - this.f29921;
        int iSqrt = (int) Math.sqrt((f4 * f4) + (f3 * f3));
        float f5 = this.f29920 * 1.5f;
        float f6 = iSqrt;
        float f7 = this.f29918;
        if (f6 < f7 - f5 || f6 > f7 + f5) {
            return;
        }
        int iM24871 = m24871(f, f2);
        if (-70 <= iM24871 && iM24871 <= -5) {
            if (C14815.m33831()) {
                if (this.f29915.startsWith("#")) {
                    m24870(this.f29915.substring(1));
                    return;
                } else {
                    m24870(this.f29915.replaceAll("[RGB]", ""));
                    return;
                }
            }
            m24870(this.f29915);
            return;
        }
        if (5 <= iM24871 && iM24871 <= 70) {
            m24870(this.f29910);
        } else {
            if (160 > iM24871 || iM24871 > 200) {
                return;
            }
            C7050.m16232().stopService(new Intent(C7050.m16232(), (Class<?>) ServiceC5428.class));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m24875(float f, float f2) {
        int iM24871;
        float f3 = f - this.f29923;
        float f4 = f2 - this.f29921;
        int iSqrt = (int) Math.sqrt((f4 * f4) + (f3 * f3));
        float f5 = this.f29920 * 1.5f;
        float f6 = iSqrt;
        float f7 = this.f29918;
        if (f6 < f7 - f5 || f6 > f7 + f5 || -70 > (iM24871 = m24871(f, f2)) || iM24871 > -5) {
            return false;
        }
        C14815.m33830(!C14815.m33845());
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m24870(String str) {
        String string;
        try {
            this.f29907.setText(str);
            string = C7050.m16203(R.string.MT_Protector, str);
        } catch (Exception e) {
            string = e.toString();
        }
        TextView textView = this.f29913;
        if (textView != null) {
            textView.setText(string);
            this.f29913.setVisibility(0);
            this.f29913.setAlpha(0.0f);
            this.f29911.removeMessages(0);
            this.f29911.sendEmptyMessageDelayed(0, 1500L);
            ObjectAnimator.ofFloat(this.f29913, "alpha", 0.0f, 1.0f).setDuration(150L).start();
            return;
        }
        C22682.m50795((CharSequence) string);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24874(TextView textView) {
        this.f29913 = textView;
        this.f29911 = textView == null ? null : new HandlerC11464(textView);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Paint.Style style = Paint.Style.FILL;
        Paint paint2 = this.f29924;
        paint2.setStyle(style);
        paint2.setStrokeWidth(1.0f);
        int i = this.f29918;
        int i2 = this.f29923;
        int i3 = this.f29921;
        Bitmap bitmap = this.f29922;
        int i4 = this.f29920;
        if (bitmap == null) {
            paint2.setColor(-1);
            float f = i2;
            float f2 = i3;
            canvas.drawCircle(f, f2, i, paint2);
            canvas.drawCircle(f, f2, i - i4, this.f29908);
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
            paint = this.f29914;
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
        if (C14815.m33844()) {
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
        float[] fArr = this.f29909;
        C9464.m21979(pixel2, fArr);
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
        if (C14815.m33845()) {
            StringBuilder sb = new StringBuilder(7);
            sb.append('#');
            sb.append("0123456789ABCDEF".charAt((pixel2 >>> 20) & 15));
            sb.append("0123456789ABCDEF".charAt((pixel2 >>> 16) & 15));
            sb.append("0123456789ABCDEF".charAt((pixel2 >>> 12) & 15));
            sb.append("0123456789ABCDEF".charAt((pixel2 >>> 8) & 15));
            sb.append("0123456789ABCDEF".charAt((pixel2 >>> 4) & 15));
            sb.append("0123456789ABCDEF".charAt(pixel2 & 15));
            this.f29915 = sb.toString();
        } else {
            this.f29915 = "R" + ((pixel2 >> 16) & 255) + ",G" + ((pixel2 >> 8) & 255) + ",B" + (pixel2 & 255);
        }
        this.f29910 = (this.f29906 + 1) + "," + (this.f29912 + 1);
        int i26 = f15 <= 0.7f ? -1 : -16777216;
        Paint paint4 = this.f29917;
        paint4.setColor(i26);
        int i27 = i18 - this.f29919;
        Path path = this.f29916;
        path.reset();
        float f21 = i20 - i27;
        float f22 = i21 - i27;
        float f23 = i20 + i27;
        float f24 = i21 + i27;
        path.addArc(f21, f22, f23, f24, C14815.m33845() ? 165.0f : 180.0f, 90.0f);
        paint4.setTextAlign(Paint.Align.RIGHT);
        canvas.drawTextOnPath(this.f29915, path, 0.0f, 0.0f, paint4);
        path.reset();
        path.addArc(f21, f22, f23, f24, 285.0f, 90.0f);
        paint4.setTextAlign(Paint.Align.LEFT);
        canvas.drawTextOnPath(this.f29910, path, 0.0f, 0.0f, paint4);
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
        this.f29918 = (Math.min(i, i2) / 2) - 1;
        this.f29923 = i / 2;
        this.f29921 = i2 / 2;
    }

    /* JADX INFO: renamed from: ܽ */
    private int m24871(float f, float f2) {
        int i = this.f29923;
        float f3 = i;
        float f4 = i;
        float f5 = this.f29921;
        return (int) Math.toDegrees(Math.atan2(f2 - f5, f - f4) - Math.atan2(0.0f - f5, f3 - f4));
    }
}
