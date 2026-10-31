package l;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: l.۬ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8WD */
/* JADX INFO: loaded from: classes3.dex */
public final class C12881 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final float[] f38660 = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f38661;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f38662;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f38663;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f38664;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f38665;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f38666;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f38667;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f38668;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f38669;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f38670;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float[] f38671;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f38672;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3004 m31313(Context context) {
        C21182 c21182 = new C21182(context.getResources().getDisplayMetrics().density);
        C3004 c3004 = new C3004();
        c3004.m9167(c21182.m48131(8));
        c3004.m9159(c21182.m48131(24));
        c3004.m9163(c21182.m48131(4));
        c3004.m9166(c21182.m48131(1));
        c3004.m9170(c21182.m48131(1));
        c3004.m9169(c21182.m48131(4));
        return c3004;
    }

    public C12881(C3004 c3004) {
        this.f38664 = c3004.f9459;
        this.f38661 = c3004.f9456;
        this.f38665 = c3004.f9460;
        this.f38668 = c3004.f9463;
        this.f38669 = c3004.f9464;
        this.f38666 = c3004.f9461;
        this.f38662 = c3004.f9457;
        this.f38672 = c3004.f9467;
        this.f38671 = c3004.f9466;
        this.f38663 = c3004.f9458;
        this.f38667 = c3004.f9462;
        this.f38670 = c3004.f9465;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31317(TextPaint textPaint) {
        if (this.f38664) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(textPaint.linkColor);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31320(Paint paint) {
        if (this.f38664) {
            paint.setUnderlineText(true);
        }
        if (paint instanceof TextPaint) {
            paint.setColor(((TextPaint) paint).linkColor);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m31314() {
        return this.f38661;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m31319() {
        int i = this.f38665;
        return i == 0 ? (int) ((this.f38661 * 0.25f) + 0.5f) : i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m31322(Paint paint) {
        paint.setColor(paint.getColor());
        int i = this.f38668;
        if (i != 0) {
            paint.setStrokeWidth(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m31315(int i) {
        int iMin = Math.min(this.f38661, i) / 2;
        int i2 = this.f38669;
        return (i2 == 0 || i2 > iMin) ? iMin : i2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m31321() {
        return this.f38670;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m31323() {
        return this.f38666;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31318(TextPaint textPaint, int i) {
        textPaint.setFakeBoldText(true);
        float[] fArr = this.f38671;
        if (fArr == null) {
            fArr = f38660;
        }
        if (fArr.length >= i) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i - 1]);
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalStateException("Supplied heading level: " + i + " is invalid, where configured heading sizes are: `" + Arrays.toString(fArr) + "`");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31316(Paint paint) {
        int iM19071 = this.f38672;
        if (iM19071 == 0) {
            iM19071 = AbstractC7070.m19071(paint.getColor(), 75);
        }
        paint.setColor(iM19071);
        paint.setStyle(Paint.Style.FILL);
        int i = this.f38662;
        if (i >= 0) {
            paint.setStrokeWidth(i);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m31324(Paint paint) {
        int iM19071 = this.f38663;
        if (iM19071 == 0) {
            iM19071 = AbstractC7070.m19071(paint.getColor(), 25);
        }
        paint.setColor(iM19071);
        paint.setStyle(Paint.Style.FILL);
        int i = this.f38667;
        if (i >= 0) {
            paint.setStrokeWidth(i);
        }
    }
}
