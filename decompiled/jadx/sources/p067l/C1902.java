package p067l;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩸ۚ */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes4.dex */
public final class C1902 {

    /* JADX INFO: renamed from: ۖ */
    public Paint f71511;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ C1342 f71512;

    /* JADX INFO: renamed from: ۜ */
    public Path f71513;

    /* JADX INFO: renamed from: ۡ */
    public float[] f71514;

    /* JADX INFO: renamed from: ۢ */
    public float[] f71515;

    /* JADX INFO: renamed from: ۧ */
    public Paint f71516;

    /* JADX INFO: renamed from: ܳ */
    public Paint f71517;

    /* JADX INFO: renamed from: ܽ */
    public int f71519;

    /* JADX INFO: renamed from: ܿ */
    public Paint f71520;

    /* JADX INFO: renamed from: ᩳ */
    public float[] f71521;

    /* JADX INFO: renamed from: ᩷ */
    public int[] f71522;

    /* JADX INFO: renamed from: ᩻ */
    public Paint f71523;

    /* JADX INFO: renamed from: ֫ */
    public Rect f71510 = new Rect();

    /* JADX INFO: renamed from: ܺ */
    public int f71518 = 1;

    public C1902(C1342 c1342) {
        this.f71512 = c1342;
        Paint paint = new Paint();
        this.f71520 = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f71523 = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f71517 = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f71511 = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(c1342.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.f71514 = new float[8];
        Paint paint5 = new Paint();
        this.f71516 = paint5;
        paint5.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        this.f71521 = new float[100];
        this.f71522 = new int[50];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50748(Canvas canvas, HashMap map, int i, int i2) {
        if (map == null || map.size() == 0) {
            return;
        }
        canvas.save();
        C1342 c1342 = this.f71512;
        boolean zIsInEditMode = c1342.isInEditMode();
        Paint paint = this.f71520;
        if (!zIsInEditMode && (i2 & 1) == 2) {
            String str = c1342.getContext().getResources().getResourceName(c1342.f33287) + ":" + c1342.f33304;
            canvas.drawText(str, 10.0f, c1342.getHeight() - 30, this.f71511);
            canvas.drawText(str, 11.0f, c1342.getHeight() - 29, paint);
        }
        for (C1797 c1797 : map.values()) {
            int iM46692 = c1797.m46692();
            if (i2 > 0 && iM46692 == 0) {
                iM46692 = 1;
            }
            if (iM46692 != 0) {
                this.f71519 = c1797.m46693(this.f71521, this.f71522);
                if (iM46692 >= 1) {
                    int i3 = i / 16;
                    float[] fArr = this.f71515;
                    if (fArr == null || fArr.length != i3 * 2) {
                        this.f71515 = new float[i3 * 2];
                        this.f71513 = new Path();
                    }
                    int i4 = this.f71518;
                    float f = i4;
                    canvas.translate(f, f);
                    paint.setColor(1996488704);
                    Paint paint2 = this.f71516;
                    paint2.setColor(1996488704);
                    Paint paint3 = this.f71523;
                    paint3.setColor(1996488704);
                    Paint paint4 = this.f71517;
                    paint4.setColor(1996488704);
                    c1797.m46699(i3, this.f71515);
                    m50747(canvas, iM46692, this.f71519, c1797);
                    paint.setColor(-21965);
                    paint3.setColor(-2067046);
                    paint2.setColor(-2067046);
                    paint4.setColor(-13391360);
                    float f2 = -i4;
                    canvas.translate(f2, f2);
                    m50747(canvas, iM46692, this.f71519, c1797);
                    if (iM46692 == 5) {
                        this.f71513.reset();
                        for (int i5 = 0; i5 <= 50; i5++) {
                            float[] fArr2 = this.f71514;
                            c1797.m46696(i5 / 50, fArr2);
                            this.f71513.moveTo(fArr2[0], fArr2[1]);
                            this.f71513.lineTo(fArr2[2], fArr2[3]);
                            this.f71513.lineTo(fArr2[4], fArr2[5]);
                            this.f71513.lineTo(fArr2[6], fArr2[7]);
                            this.f71513.close();
                        }
                        paint.setColor(1140850688);
                        canvas.translate(2.0f, 2.0f);
                        canvas.drawPath(this.f71513, paint);
                        canvas.translate(-2.0f, -2.0f);
                        paint.setColor(-65536);
                        canvas.drawPath(this.f71513, paint);
                    }
                }
            }
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50747(Canvas canvas, int i, int i2, C1797 c1797) {
        int width;
        int height;
        Paint paint = this.f71517;
        int[] iArr = this.f71522;
        int i3 = 1;
        if (i == 4) {
            boolean z = false;
            boolean z2 = false;
            for (int i4 = 0; i4 < this.f71519; i4++) {
                int i5 = iArr[i4];
                if (i5 == 1) {
                    z = true;
                }
                if (i5 == 2) {
                    z2 = true;
                }
            }
            if (z) {
                float[] fArr = this.f71515;
                canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
            }
            if (z2) {
                m50743(canvas);
            }
        }
        if (i == 2) {
            float[] fArr2 = this.f71515;
            canvas.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], paint);
        }
        if (i == 3) {
            m50743(canvas);
        }
        canvas.drawLines(this.f71515, this.f71520);
        View view = c1797.f63819;
        if (view != null) {
            width = view.getWidth();
            height = c1797.f63819.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        int i6 = 4;
        int i7 = 1;
        while (i7 < i2 - 1) {
            if (i != i6 || iArr[i7 - 1] != 0) {
                int i8 = i7 * 2;
                float[] fArr3 = this.f71521;
                float f = fArr3[i8];
                float f2 = fArr3[i8 + i3];
                this.f71513.reset();
                this.f71513.moveTo(f, f2 + 10.0f);
                this.f71513.lineTo(f + 10.0f, f2);
                this.f71513.lineTo(f, f2 - 10.0f);
                this.f71513.lineTo(f - 10.0f, f2);
                this.f71513.close();
                int i9 = i7 - 1;
                c1797.m46697(i9);
                Paint paint2 = this.f71516;
                if (i == i6) {
                    int i10 = iArr[i9];
                    if (i10 == i3) {
                        m50746(canvas, f - 0.0f, f2 - 0.0f);
                    } else if (i10 == 2) {
                        m50744(canvas, f - 0.0f, f2 - 0.0f);
                    } else {
                        if (i10 == 3) {
                            m50745(canvas, f - 0.0f, f2 - 0.0f, width, height);
                        }
                        canvas.drawPath(this.f71513, paint2);
                    }
                    canvas.drawPath(this.f71513, paint2);
                } else {
                    paint2 = paint2;
                    f2 = f2;
                    f = f;
                }
                if (i == 2) {
                    m50746(canvas, f - 0.0f, f2 - 0.0f);
                }
                if (i == 3) {
                    m50744(canvas, f - 0.0f, f2 - 0.0f);
                }
                if (i == 6) {
                    m50745(canvas, f - 0.0f, f2 - 0.0f, width, height);
                }
                canvas.drawPath(this.f71513, paint2);
            }
            i7++;
            i6 = 4;
            i3 = 1;
        }
        float[] fArr4 = this.f71515;
        if (fArr4.length > 1) {
            float f3 = fArr4[0];
            float f4 = fArr4[1];
            Paint paint3 = this.f71523;
            canvas.drawCircle(f3, f4, 8.0f, paint3);
            float[] fArr5 = this.f71515;
            canvas.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m50746(Canvas canvas, float f, float f2) {
        float[] fArr = this.f71515;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float fHypot = (float) Math.hypot(f3 - f5, f4 - f6);
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        float f9 = (((f2 - f4) * f8) + ((f - f3) * f7)) / (fHypot * fHypot);
        float f10 = f3 + (f7 * f9);
        float f11 = f4 + (f9 * f8);
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f10, f11);
        float fHypot2 = (float) Math.hypot(f10 - f, f11 - f2);
        String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
        int length = str.length();
        Paint paint = this.f71511;
        Rect rect = this.f71510;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (rect.width() / 2), -20.0f, paint);
        canvas.drawLine(f, f2, f10, f11, this.f71517);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m50743(Canvas canvas) {
        float[] fArr = this.f71515;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[fArr.length - 2];
        float f4 = fArr[fArr.length - 1];
        float fMin = Math.min(f, f3);
        float fMax = Math.max(f2, f4);
        float fMax2 = Math.max(f, f3);
        float fMax3 = Math.max(f2, f4);
        Paint paint = this.f71517;
        canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
        canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), paint);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m50744(Canvas canvas, float f, float f2) {
        float[] fArr = this.f71515;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float fMin = Math.min(f3, f5);
        float fMax = Math.max(f4, f6);
        float fMin2 = f - Math.min(f3, f5);
        float fMax2 = Math.max(f4, f6) - f2;
        String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d)) / 100.0f);
        int length = str.length();
        Paint paint = this.f71511;
        Rect rect = this.f71510;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f2 - 20.0f, paint);
        float fMin3 = Math.min(f3, f5);
        Paint paint2 = this.f71517;
        canvas.drawLine(f, f2, fMin3, f2, paint2);
        String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str2, 0, str2.length(), rect);
        canvas.drawText(str2, f + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f, f2, f, Math.max(f4, f6), paint2);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m50745(Canvas canvas, float f, float f2, int i, int i2) {
        StringBuilder sb = new StringBuilder("");
        C1342 c1342 = this.f71512;
        sb.append(((int) (((double) (((f - (i / 2)) * 100.0f) / (c1342.getWidth() - i))) + 0.5d)) / 100.0f);
        String string = sb.toString();
        int length = string.length();
        Paint paint = this.f71511;
        Rect rect = this.f71510;
        paint.getTextBounds(string, 0, length, rect);
        canvas.drawText(string, ((f / 2.0f) - (rect.width() / 2)) + 0.0f, f2 - 20.0f, paint);
        float fMin = Math.min(0.0f, 1.0f);
        Paint paint2 = this.f71517;
        canvas.drawLine(f, f2, fMin, f2, paint2);
        String str = "" + (((int) (((double) (((f2 - (i2 / 2)) * 100.0f) / (c1342.getHeight() - i2))) + 0.5d)) / 100.0f);
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, f + 5.0f, 0.0f - ((f2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), paint2);
    }
}
