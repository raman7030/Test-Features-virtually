package p067l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.ۤ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N933 */
/* JADX INFO: loaded from: classes3.dex */
public class C12385 extends View {

    /* JADX INFO: renamed from: ֡֫ */
    public final Paint f34575;

    /* JADX INFO: renamed from: ֨֫ */
    public final int f34576;

    /* JADX INFO: renamed from: ֫֫ */
    public final Rect f34577;

    /* JADX INFO: renamed from: ۖ֫ */
    public final Paint f34578;

    /* JADX INFO: renamed from: ۗ */
    public final Rect f34579;

    /* JADX INFO: renamed from: ۘ֫ */
    public float f34580;

    /* JADX INFO: renamed from: ۙ */
    public final C5679 f34581;

    /* JADX INFO: renamed from: ۚ֫ */
    public boolean f34582;

    /* JADX INFO: renamed from: ۛ */
    public final float[] f34583;

    /* JADX INFO: renamed from: ۜ֫ */
    public final int f34584;

    /* JADX INFO: renamed from: ۟ */
    public final int f34585;

    /* JADX INFO: renamed from: ۠֫ */
    public final int f34586;

    /* JADX INFO: renamed from: ۡ֫ */
    public Path f34587;

    /* JADX INFO: renamed from: ۢ֫ */
    public final int f34588;

    /* JADX INFO: renamed from: ۤ */
    public final float f34589;

    /* JADX INFO: renamed from: ۧ֫ */
    public final int f34590;

    /* JADX INFO: renamed from: ۨ */
    public float f34591;

    /* JADX INFO: renamed from: ۫ */
    public final int f34592;

    /* JADX INFO: renamed from: ۬ */
    public int f34593;

    /* JADX INFO: renamed from: ܰ */
    public final C15066 f34594;

    /* JADX INFO: renamed from: ܳ֫ */
    public C22661 f34595;

    /* JADX INFO: renamed from: ܶ֫ */
    public Point f34596;

    /* JADX INFO: renamed from: ܺ֫ */
    public final int f34597;

    /* JADX INFO: renamed from: ܽ֫ */
    public final int f34598;

    /* JADX INFO: renamed from: ܿ֫ */
    public final Paint f34599;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final int f34600;

    /* JADX INFO: renamed from: ᩴ֫ */
    public final C14396 f34601;

    /* JADX INFO: renamed from: ᩵֫ */
    public final Rect f34602;

    /* JADX INFO: renamed from: ᩶ */
    public final C5679 f34603;

    /* JADX INFO: renamed from: ᩷֫ */
    public final Point f34604;

    /* JADX INFO: renamed from: ᩸ */
    public int f34605;

    /* JADX INFO: renamed from: ᩸֫ */
    public float f34606;

    /* JADX INFO: renamed from: ᩹ */
    public final C7020 f34607;

    /* JADX INFO: renamed from: ᩺ */
    public final Paint f34608;

    /* JADX INFO: renamed from: ᩻֫ */
    public final int f34609;

    public C12385(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C12385(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34599 = new Paint();
        Paint paint = new Paint();
        this.f34575 = paint;
        Paint paint2 = new Paint();
        this.f34608 = paint2;
        Paint paint3 = new Paint();
        this.f34578 = paint3;
        this.f34601 = new C14396();
        this.f34594 = new C15066();
        this.f34607 = new C7020();
        this.f34605 = 255;
        this.f34591 = 360.0f;
        this.f34580 = 0.0f;
        this.f34606 = 0.0f;
        this.f34582 = true;
        this.f34593 = -9539986;
        this.f34602 = new Rect();
        this.f34577 = new Rect();
        this.f34579 = new Rect();
        this.f34604 = new Point();
        this.f34583 = new float[3];
        this.f34596 = null;
        this.f34589 = context.getResources().getDisplayMetrics().density;
        this.f34585 = m28496(180.0f);
        int iM28496 = m28496(25.0f);
        this.f34609 = iM28496;
        int iM28497 = m28496(12.0f);
        this.f34584 = iM28497;
        int iM28498 = m28496(4.0f);
        this.f34592 = iM28498;
        int iM28499 = m28496(4.0f);
        this.f34586 = iM28499;
        int iM284910 = m28496(2.0f);
        this.f34576 = iM284910;
        this.f34597 = (iM28497 / 2) + iM28496;
        this.f34588 = m28496(2.0f);
        this.f34600 = m28496(24.0f);
        this.f34598 = m28496(1.0f);
        this.f34590 = Math.max(iM28498, Math.max(iM28499 / 2, iM284910));
        int i2 = (iM28496 / 5) + 1;
        this.f34603 = new C5679(i2);
        this.f34581 = new C5679(i2);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(m28496(1.0f));
        paint.setAntiAlias(true);
        paint2.setColor(-4342339);
        paint2.setStyle(style);
        paint2.setStrokeWidth(m28496(2.0f));
        paint2.setAntiAlias(true);
        paint3.setShadowLayer(m28496(1.0f), 0.0f, 0.0f, -7829368);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("alpha", this.f34605);
        bundle.putFloat("hue", this.f34591);
        bundle.putFloat("sat", this.f34580);
        bundle.putFloat("val", this.f34606);
        bundle.putBoolean("show_alpha", this.f34582);
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f34605 = bundle.getInt("alpha");
            this.f34591 = bundle.getFloat("hue");
            this.f34580 = bundle.getFloat("sat");
            this.f34606 = bundle.getFloat("val");
            this.f34582 = bundle.getBoolean("show_alpha");
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = this.f34593;
        Paint paint = this.f34599;
        paint.setColor(i);
        Rect rect = this.f34602;
        canvas.drawRect(rect.left - 1, rect.top - 1, rect.right + 1, rect.bottom + 1, paint);
        float f = this.f34591;
        C14396 c14396 = this.f34601;
        c14396.m33012(rect, f);
        c14396.m33011(canvas);
        float f2 = this.f34580;
        float f3 = this.f34606;
        float fHeight = rect.height();
        int iWidth = (int) ((f2 * rect.width()) + rect.left);
        Point point = this.f34604;
        point.x = iWidth;
        point.y = (int) (((1.0f - f3) * fHeight) + rect.top);
        Paint paint2 = this.f34575;
        paint2.setColor(-12303292);
        float f4 = point.x;
        float f5 = point.y;
        int iM28496 = m28496(1.0f);
        int i2 = this.f34592;
        canvas.drawCircle(f4, f5, i2 - iM28496, paint2);
        paint2.setColor(-2236963);
        canvas.drawCircle(point.x, point.y, i2, paint2);
        C15066 c15066 = this.f34594;
        Rect rect2 = this.f34577;
        c15066.m34471(rect2);
        c15066.m34470(canvas);
        int iWidth2 = (int) (((this.f34591 * rect2.width()) / 360.0f) + rect2.left);
        point.x = iWidth2;
        int i3 = rect2.top;
        point.y = i3;
        int i4 = this.f34576;
        float f6 = rect2.bottom + i4;
        float f7 = iWidth2;
        float f8 = this.f34586 / 2.0f;
        Paint paint3 = this.f34608;
        canvas.drawRoundRect(f7 - f8, i3 - i4, f7 + f8, f6, 2.0f, 2.0f, paint3);
        if (this.f34582) {
            this.f34603.draw(canvas);
            int iM28498 = m28498();
            C7020 c7020 = this.f34607;
            Rect rect3 = this.f34579;
            c7020.m16151(iM28498, rect3);
            c7020.m16152(canvas);
            int iWidth3 = (int) (((this.f34605 * rect3.width()) / 255.0f) + rect3.left);
            point.x = iWidth3;
            int i5 = rect3.top;
            point.y = i5;
            float f9 = iWidth3;
            canvas.drawRoundRect(f9 - f8, i5 - i4, f8 + f9, rect3.bottom + i4, 2.0f, 2.0f, paint3);
        }
        Path path = this.f34587;
        if (path != null) {
            Paint paint4 = this.f34578;
            paint4.setColor(0);
            canvas.drawPath(path, paint4);
            canvas.save();
            canvas.clipPath(path);
            this.f34581.draw(canvas);
            canvas.restore();
            paint.setColor(m28498());
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM28497;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.f34596 = null;
            } else if (action == 2) {
                zM28497 = m28497(motionEvent);
            }
            zM28497 = false;
        } else {
            if (!isFocused()) {
                requestFocus();
            }
            this.f34596 = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            zM28497 = m28497(motionEvent);
        }
        if (zM28497) {
            C22661 c22661 = this.f34595;
            if (c22661 != null) {
                DialogInterfaceOnClickListenerC5863.m13151((DialogInterfaceOnClickListenerC5863) c22661.f71484, Color.HSVToColor(this.f34605, new float[]{this.f34591, this.f34580, this.f34606}));
            }
            invalidate();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m28497(MotionEvent motionEvent) {
        float f;
        Point point = this.f34596;
        int i = 0;
        if (point != null) {
            int i2 = point.x;
            int i3 = point.y;
            Rect rect = this.f34602;
            int i4 = rect.bottom;
            int i5 = this.f34584 / 2;
            float f2 = 0.0f;
            if (i3 < i4 + i5) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float fWidth = rect.width();
                float fHeight = rect.height();
                float f3 = rect.left;
                if (x < f3) {
                    f = 0.0f;
                } else {
                    f = x > ((float) rect.right) ? fWidth : x - f3;
                }
                float f4 = rect.top;
                if (y >= f4) {
                    f2 = y > ((float) rect.bottom) ? fHeight : y - f4;
                }
                float[] fArr = {(1.0f / fWidth) * f, 1.0f - ((1.0f / fHeight) * f2)};
                this.f34580 = fArr[0];
                this.f34606 = fArr[1];
                return true;
            }
            if (i2 > this.f34597 * 2) {
                Rect rect2 = this.f34577;
                if (i3 < i5 + rect2.bottom) {
                    float x2 = motionEvent.getX();
                    float fWidth2 = rect2.width();
                    float f5 = rect2.left;
                    if (x2 >= f5) {
                        f2 = x2 > ((float) rect2.right) ? fWidth2 : x2 - f5;
                    }
                    this.f34591 = (f2 * 360.0f) / fWidth2;
                    return true;
                }
                if (this.f34582) {
                    int x3 = (int) motionEvent.getX();
                    Rect rect3 = this.f34579;
                    int iWidth = rect3.width();
                    int i6 = rect3.left;
                    if (x3 >= i6) {
                        i = x3 > rect3.right ? iWidth : x3 - i6;
                    }
                    this.f34605 = (i * 255) / iWidth;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingTop;
        int paddingBottom;
        int size = View.MeasureSpec.getSize(i);
        boolean z = this.f34582;
        int i3 = this.f34584;
        int i4 = this.f34585;
        if (z) {
            int paddingTop2 = getPaddingTop() + 1 + i4 + 1 + i3;
            int i5 = this.f34609;
            paddingBottom = C20780.m46927(paddingTop2, i5, i3, i5);
            paddingTop = getPaddingBottom();
        } else {
            paddingTop = ((this.f34600 * 2) + ((((getPaddingTop() + 1) + i4) + 1) + i3)) - this.f34598;
            paddingBottom = getPaddingBottom();
        }
        setMeasuredDimension(size, paddingTop + paddingBottom);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        boolean z2 = this.f34582;
        int i6 = paddingTop + 1;
        int i7 = this.f34585 + i6;
        Rect rect = this.f34602;
        rect.set(paddingLeft + 1, i6, width - 1, i7);
        int i8 = this.f34600;
        int i9 = this.f34597;
        int i10 = z2 ? i9 : i8;
        int i11 = z2 ? this.f34588 : this.f34598;
        Path path = new Path();
        this.f34587 = path;
        int i12 = rect.left;
        int i13 = rect.bottom + 1;
        int i14 = this.f34584;
        int i15 = i13 + i14;
        int i16 = i10 * 2;
        int i17 = i15 + i16;
        path.addCircle(i12 + i10, i15 + i10, i10 - i11, Path.Direction.CCW);
        this.f34581.setBounds(i12 + i11, i15 + i11, (i12 + i16) - i11, i17 - i11);
        Rect rect2 = this.f34577;
        int i18 = this.f34609;
        if (z2) {
            int iM53892 = C24420.m53892(i9, 2, paddingLeft, i14);
            int i19 = rect.bottom + 1 + i14;
            i5 = width;
            rect2.set(iM53892, i19, i5, i19 + i18);
        } else {
            i5 = width;
            int i20 = (int) (i18 * 1.2f);
            int i21 = ((i15 + i17) / 2) - (i20 / 2);
            rect2.set(C24420.m53892(i8, 2, paddingLeft, i14), i21, i5, i20 + i21);
        }
        if (z2) {
            int iM53893 = C24420.m53892(i9, 2, paddingLeft, i14);
            int i22 = rect2.bottom + i14;
            Rect rect3 = this.f34579;
            rect3.set(iM53893, i22, i5, i18 + i22);
            this.f34603.setBounds(rect3);
        }
    }

    @Override // android.view.View
    public final int getPaddingTop() {
        return Math.max(super.getPaddingTop(), this.f34590);
    }

    @Override // android.view.View
    public final int getPaddingBottom() {
        return Math.max(super.getPaddingBottom(), this.f34590);
    }

    @Override // android.view.View
    public final int getPaddingLeft() {
        return Math.max(super.getPaddingLeft(), this.f34590);
    }

    @Override // android.view.View
    public final int getPaddingRight() {
        return Math.max(super.getPaddingRight(), this.f34590);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28500(C22661 c22661) {
        this.f34595 = c22661;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m28498() {
        float f = this.f34591;
        float[] fArr = this.f34583;
        fArr[0] = f;
        fArr[1] = this.f34580;
        fArr[2] = this.f34606;
        return Color.HSVToColor(this.f34605, fArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28499(int i) {
        float[] fArr = this.f34583;
        C9464.m21979(i, fArr);
        this.f34591 = fArr[0];
        this.f34580 = fArr[1];
        this.f34606 = fArr[2];
        if (this.f34582) {
            this.f34605 = Color.alpha(i);
        } else {
            this.f34605 = 255;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m28501() {
        if (this.f34582) {
            this.f34582 = false;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m28496(float f) {
        return (int) ((f * this.f34589) + 0.5f);
    }
}
