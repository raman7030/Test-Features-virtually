package l;

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
public class C6747 extends View {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Paint f20950;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f20951;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f20952;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f20953;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f20954;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f20955;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Paint f20956;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f20957;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f20958;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f20959;

    public C6747(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20952 = getResources().getDisplayMetrics().density * 2.0f;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f20956 = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f20950 = paint2;
        m18365(C13096.m31738());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18365(int i) {
        this.f20955 = i;
        this.f20954 = i + 1 + this.f20952;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m18364() {
        return this.f20955;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18366(int i, int i2) {
        this.f20957 = i;
        this.f20951 = i2;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f20956;
        paint.setColor(-2135180357);
        canvas.drawCircle(this.f20958, this.f20959, this.f20953, paint);
        paint.setColor(Integer.MIN_VALUE);
        canvas.drawCircle(this.f20958, this.f20959, this.f20953 - this.f20952, paint);
        float f = this.f20958 + this.f20957;
        float f2 = this.f20959 + this.f20951;
        float f3 = this.f20954 + this.f20952;
        Paint paint2 = this.f20950;
        canvas.drawCircle(f, f2, f3, paint2);
        paint.setColor(-2138535800);
        canvas.drawCircle(f, f2, this.f20954 + this.f20952, paint);
        canvas.drawCircle(f, f2, (this.f20952 / 2.0f) + this.f20954, paint2);
        paint.setColor(-2131824914);
        canvas.drawCircle(f, f2, (this.f20952 / 2.0f) + this.f20954, paint);
        canvas.drawCircle(f, f2, this.f20954, paint2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f20953 = Math.min(i, i2) / 2.0f;
        this.f20958 = i / 2.0f;
        this.f20959 = i2 / 2.0f;
    }
}
