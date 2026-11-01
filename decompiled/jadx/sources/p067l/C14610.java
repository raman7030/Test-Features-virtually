package p067l;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: l.۬ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8WD */
/* JADX INFO: loaded from: classes3.dex */
public final class C14610 {

    /* JADX INFO: renamed from: ۖ */
    public static final float[] f41703 = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};

    /* JADX INFO: renamed from: ֫ */
    public final int f41704;

    /* JADX INFO: renamed from: ۜ */
    public final int f41705;

    /* JADX INFO: renamed from: ۡ */
    public final int f41706;

    /* JADX INFO: renamed from: ۢ */
    public final boolean f41707;

    /* JADX INFO: renamed from: ۧ */
    public final int f41708;

    /* JADX INFO: renamed from: ܳ */
    public final int f41709;

    /* JADX INFO: renamed from: ܺ */
    public final int f41710;

    /* JADX INFO: renamed from: ܽ */
    public final int f41711;

    /* JADX INFO: renamed from: ܿ */
    public final int f41712;

    /* JADX INFO: renamed from: ᩳ */
    public final int f41713;

    /* JADX INFO: renamed from: ᩷ */
    public final float[] f41714;

    /* JADX INFO: renamed from: ᩻ */
    public final int f41715;

    /* JADX INFO: renamed from: ֫ */
    public static C5223 m33399(Context context) {
        C22500 c22500 = new C22500(context.getResources().getDisplayMetrics().density);
        C5223 c5223 = new C5223();
        c5223.m11218(c22500.m50461(8));
        c5223.m11210(c22500.m50461(24));
        c5223.m11214(c22500.m50461(4));
        c5223.m11217(c22500.m50461(1));
        c5223.m11221(c22500.m50461(1));
        c5223.m11220(c22500.m50461(4));
        return c5223;
    }

    public C14610(C5223 c5223) {
        this.f41707 = c5223.f12257;
        this.f41704 = c5223.f12254;
        this.f41708 = c5223.f12258;
        this.f41711 = c5223.f12261;
        this.f41712 = c5223.f12262;
        this.f41709 = c5223.f12259;
        this.f41705 = c5223.f12255;
        this.f41715 = c5223.f12265;
        this.f41714 = c5223.f12264;
        this.f41706 = c5223.f12256;
        this.f41710 = c5223.f12260;
        this.f41713 = c5223.f12263;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33403(TextPaint textPaint) {
        if (this.f41707) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(textPaint.linkColor);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33406(Paint paint) {
        if (this.f41707) {
            paint.setUnderlineText(true);
        }
        if (paint instanceof TextPaint) {
            paint.setColor(((TextPaint) paint).linkColor);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m33400() {
        return this.f41704;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m33405() {
        int i = this.f41708;
        return i == 0 ? (int) ((this.f41704 * 0.25f) + 0.5f) : i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m33408(Paint paint) {
        paint.setColor(paint.getColor());
        int i = this.f41711;
        if (i != 0) {
            paint.setStrokeWidth(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m33401(int i) {
        int iMin = Math.min(this.f41704, i) / 2;
        int i2 = this.f41712;
        return (i2 == 0 || i2 > iMin) ? iMin : i2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m33407() {
        return this.f41713;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m33409() {
        return this.f41709;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33404(TextPaint textPaint, int i) {
        textPaint.setFakeBoldText(true);
        float[] fArr = this.f41714;
        if (fArr == null) {
            fArr = f41703;
        }
        if (fArr.length >= i) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i - 1]);
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalStateException("Supplied heading level: " + i + " is invalid, where configured heading sizes are: `" + Arrays.toString(fArr) + "`");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33402(Paint paint) {
        int iM21029 = this.f41715;
        if (iM21029 == 0) {
            iM21029 = AbstractC9088.m21029(paint.getColor(), 75);
        }
        paint.setColor(iM21029);
        paint.setStyle(Paint.Style.FILL);
        int i = this.f41705;
        if (i >= 0) {
            paint.setStrokeWidth(i);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m33410(Paint paint) {
        int iM21029 = this.f41706;
        if (iM21029 == 0) {
            iM21029 = AbstractC9088.m21029(paint.getColor(), 25);
        }
        paint.setColor(iM21029);
        paint.setStyle(Paint.Style.FILL);
        int i = this.f41710;
        if (i >= 0) {
            paint.setStrokeWidth(i);
        }
    }
}
