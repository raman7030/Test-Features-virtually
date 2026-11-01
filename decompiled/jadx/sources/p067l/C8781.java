package p067l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.ۜۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: SAKT */
/* JADX INFO: loaded from: classes2.dex */
public class C8781 extends View {

    /* JADX INFO: renamed from: ۗ */
    public Paint f23824;

    /* JADX INFO: renamed from: ۙ */
    public int f23825;

    /* JADX INFO: renamed from: ۛ */
    public float f23826;

    /* JADX INFO: renamed from: ۤ */
    public float f23827;

    /* JADX INFO: renamed from: ۨ */
    public float f23828;

    /* JADX INFO: renamed from: ۫ */
    public int f23829;

    /* JADX INFO: renamed from: ۬ */
    public Paint f23830;

    /* JADX INFO: renamed from: ᩶ */
    public int f23831;

    /* JADX INFO: renamed from: ᩸ */
    public float f23832;

    /* JADX INFO: renamed from: ᩹ */
    public float f23833;

    public C8781(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23826 = getResources().getDisplayMetrics().density * 2.0f;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f23830 = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f23824 = paint2;
        m20313(C14815.m33828());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20313(int i) {
        this.f23829 = i;
        this.f23828 = i + 1 + this.f23826;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m20312() {
        return this.f23829;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20314(int i, int i2) {
        this.f23831 = i;
        this.f23825 = i2;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f23830;
        paint.setColor(-2135180357);
        canvas.drawCircle(this.f23832, this.f23833, this.f23827, paint);
        paint.setColor(Integer.MIN_VALUE);
        canvas.drawCircle(this.f23832, this.f23833, this.f23827 - this.f23826, paint);
        float f = this.f23832 + this.f23831;
        float f2 = this.f23833 + this.f23825;
        float f3 = this.f23828 + this.f23826;
        Paint paint2 = this.f23824;
        canvas.drawCircle(f, f2, f3, paint2);
        paint.setColor(-2138535800);
        canvas.drawCircle(f, f2, this.f23828 + this.f23826, paint);
        canvas.drawCircle(f, f2, (this.f23826 / 2.0f) + this.f23828, paint2);
        paint.setColor(-2131824914);
        canvas.drawCircle(f, f2, (this.f23826 / 2.0f) + this.f23828, paint);
        canvas.drawCircle(f, f2, this.f23828, paint2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f23827 = Math.min(i, i2) / 2.0f;
        this.f23832 = i / 2.0f;
        this.f23833 = i2 / 2.0f;
    }
}
