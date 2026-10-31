package l;

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
public class C10539 extends View {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final Paint f31611;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final int f31612;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final Rect f31613;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final Paint f31614;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Rect f31615;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public float f31616;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3483 f31617;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public boolean f31618;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final float[] f31619;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final int f31620;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f31621;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final int f31622;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public Path f31623;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final int f31624;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float f31625;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final int f31626;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f31627;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f31628;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f31629;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13360 f31630;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C21352 f31631;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public Point f31632;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final int f31633;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final int f31634;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final Paint f31635;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final int f31636;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final C12655 f31637;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final Rect f31638;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3483 f31639;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final Point f31640;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f31641;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public float f31642;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4894 f31643;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Paint f31644;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final int f31645;

    public C10539(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C10539(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31635 = new Paint();
        Paint paint = new Paint();
        this.f31611 = paint;
        Paint paint2 = new Paint();
        this.f31644 = paint2;
        Paint paint3 = new Paint();
        this.f31614 = paint3;
        this.f31637 = new C12655();
        this.f31630 = new C13360();
        this.f31643 = new C4894();
        this.f31641 = 255;
        this.f31627 = 360.0f;
        this.f31616 = 0.0f;
        this.f31642 = 0.0f;
        this.f31618 = true;
        this.f31629 = -9539986;
        this.f31638 = new Rect();
        this.f31613 = new Rect();
        this.f31615 = new Rect();
        this.f31640 = new Point();
        this.f31619 = new float[3];
        this.f31632 = null;
        this.f31625 = context.getResources().getDisplayMetrics().density;
        this.f31621 = m26463(180.0f);
        int iM26463 = m26463(25.0f);
        this.f31645 = iM26463;
        int iM26464 = m26463(12.0f);
        this.f31620 = iM26464;
        int iM26465 = m26463(4.0f);
        this.f31628 = iM26465;
        int iM26466 = m26463(4.0f);
        this.f31622 = iM26466;
        int iM26467 = m26463(2.0f);
        this.f31612 = iM26467;
        this.f31633 = (iM26464 / 2) + iM26463;
        this.f31624 = m26463(2.0f);
        this.f31636 = m26463(24.0f);
        this.f31634 = m26463(1.0f);
        this.f31626 = Math.max(iM26465, Math.max(iM26466 / 2, iM26467));
        int i2 = (iM26463 / 5) + 1;
        this.f31639 = new C3483(i2);
        this.f31617 = new C3483(i2);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(m26463(1.0f));
        paint.setAntiAlias(true);
        paint2.setColor(-4342339);
        paint2.setStyle(style);
        paint2.setStrokeWidth(m26463(2.0f));
        paint2.setAntiAlias(true);
        paint3.setShadowLayer(m26463(1.0f), 0.0f, 0.0f, -7829368);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("alpha", this.f31641);
        bundle.putFloat("hue", this.f31627);
        bundle.putFloat("sat", this.f31616);
        bundle.putFloat("val", this.f31642);
        bundle.putBoolean("show_alpha", this.f31618);
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f31641 = bundle.getInt("alpha");
            this.f31627 = bundle.getFloat("hue");
            this.f31616 = bundle.getFloat("sat");
            this.f31642 = bundle.getFloat("val");
            this.f31618 = bundle.getBoolean("show_alpha");
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = this.f31629;
        Paint paint = this.f31635;
        paint.setColor(i);
        Rect rect = this.f31638;
        canvas.drawRect(rect.left - 1, rect.top - 1, rect.right + 1, rect.bottom + 1, paint);
        float f = this.f31627;
        C12655 c12655 = this.f31637;
        c12655.m30934(rect, f);
        c12655.m30933(canvas);
        float f2 = this.f31616;
        float f3 = this.f31642;
        float fHeight = rect.height();
        int iWidth = (int) ((f2 * rect.width()) + rect.left);
        Point point = this.f31640;
        point.x = iWidth;
        point.y = (int) (((1.0f - f3) * fHeight) + rect.top);
        Paint paint2 = this.f31611;
        paint2.setColor(-12303292);
        float f4 = point.x;
        float f5 = point.y;
        int iM26463 = m26463(1.0f);
        int i2 = this.f31628;
        canvas.drawCircle(f4, f5, i2 - iM26463, paint2);
        paint2.setColor(-2236963);
        canvas.drawCircle(point.x, point.y, i2, paint2);
        C13360 c13360 = this.f31630;
        Rect rect2 = this.f31613;
        c13360.m32370(rect2);
        c13360.m32369(canvas);
        int iWidth2 = (int) (((this.f31627 * rect2.width()) / 360.0f) + rect2.left);
        point.x = iWidth2;
        int i3 = rect2.top;
        point.y = i3;
        int i4 = this.f31612;
        float f6 = rect2.bottom + i4;
        float f7 = iWidth2;
        float f8 = this.f31622 / 2.0f;
        Paint paint3 = this.f31644;
        canvas.drawRoundRect(f7 - f8, i3 - i4, f7 + f8, f6, 2.0f, 2.0f, paint3);
        if (this.f31618) {
            this.f31639.draw(canvas);
            int iM26465 = m26465();
            C4894 c4894 = this.f31643;
            Rect rect3 = this.f31615;
            c4894.m14254(iM26465, rect3);
            c4894.m14255(canvas);
            int iWidth3 = (int) (((this.f31641 * rect3.width()) / 255.0f) + rect3.left);
            point.x = iWidth3;
            int i5 = rect3.top;
            point.y = i5;
            float f9 = iWidth3;
            canvas.drawRoundRect(f9 - f8, i5 - i4, f8 + f9, rect3.bottom + i4, 2.0f, 2.0f, paint3);
        }
        Path path = this.f31623;
        if (path != null) {
            Paint paint4 = this.f31614;
            paint4.setColor(0);
            canvas.drawPath(path, paint4);
            canvas.save();
            canvas.clipPath(path);
            this.f31617.draw(canvas);
            canvas.restore();
            paint.setColor(m26465());
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM26464;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.f31632 = null;
            } else if (action == 2) {
                zM26464 = m26464(motionEvent);
            }
            zM26464 = false;
        } else {
            if (!isFocused()) {
                requestFocus();
            }
            this.f31632 = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            zM26464 = m26464(motionEvent);
        }
        if (zM26464) {
            C21352 c21352 = this.f31631;
            if (c21352 != null) {
                DialogInterfaceOnClickListenerC3677.m11191((DialogInterfaceOnClickListenerC3677) c21352.f68790, Color.HSVToColor(this.f31641, new float[]{this.f31627, this.f31616, this.f31642}));
            }
            invalidate();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m26464(MotionEvent motionEvent) {
        float f;
        Point point = this.f31632;
        int i = 0;
        if (point != null) {
            int i2 = point.x;
            int i3 = point.y;
            Rect rect = this.f31638;
            int i4 = rect.bottom;
            int i5 = this.f31620 / 2;
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
                this.f31616 = fArr[0];
                this.f31642 = fArr[1];
                return true;
            }
            if (i2 > this.f31633 * 2) {
                Rect rect2 = this.f31613;
                if (i3 < i5 + rect2.bottom) {
                    float x2 = motionEvent.getX();
                    float fWidth2 = rect2.width();
                    float f5 = rect2.left;
                    if (x2 >= f5) {
                        f2 = x2 > ((float) rect2.right) ? fWidth2 : x2 - f5;
                    }
                    this.f31627 = (f2 * 360.0f) / fWidth2;
                    return true;
                }
                if (this.f31618) {
                    int x3 = (int) motionEvent.getX();
                    Rect rect3 = this.f31615;
                    int iWidth = rect3.width();
                    int i6 = rect3.left;
                    if (x3 >= i6) {
                        i = x3 > rect3.right ? iWidth : x3 - i6;
                    }
                    this.f31641 = (i * 255) / iWidth;
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
        boolean z = this.f31618;
        int i3 = this.f31620;
        int i4 = this.f31621;
        if (z) {
            int paddingTop2 = getPaddingTop() + 1 + i4 + 1 + i3;
            int i5 = this.f31645;
            paddingBottom = C19373.m44633(paddingTop2, i5, i3, i5);
            paddingTop = getPaddingBottom();
        } else {
            paddingTop = ((this.f31636 * 2) + ((((getPaddingTop() + 1) + i4) + 1) + i3)) - this.f31634;
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
        boolean z2 = this.f31618;
        int i6 = paddingTop + 1;
        int i7 = this.f31621 + i6;
        Rect rect = this.f31638;
        rect.set(paddingLeft + 1, i6, width - 1, i7);
        int i8 = this.f31636;
        int i9 = this.f31633;
        int i10 = z2 ? i9 : i8;
        int i11 = z2 ? this.f31624 : this.f31634;
        Path path = new Path();
        this.f31623 = path;
        int i12 = rect.left;
        int i13 = rect.bottom + 1;
        int i14 = this.f31620;
        int i15 = i13 + i14;
        int i16 = i10 * 2;
        int i17 = i15 + i16;
        path.addCircle(i12 + i10, i15 + i10, i10 - i11, Path.Direction.CCW);
        this.f31617.setBounds(i12 + i11, i15 + i11, (i12 + i16) - i11, i17 - i11);
        Rect rect2 = this.f31613;
        int i18 = this.f31645;
        if (z2) {
            int iM51496 = C23202.m51496(i9, 2, paddingLeft, i14);
            int i19 = rect.bottom + 1 + i14;
            i5 = width;
            rect2.set(iM51496, i19, i5, i19 + i18);
        } else {
            i5 = width;
            int i20 = (int) (i18 * 1.2f);
            int i21 = ((i15 + i17) / 2) - (i20 / 2);
            rect2.set(C23202.m51496(i8, 2, paddingLeft, i14), i21, i5, i20 + i21);
        }
        if (z2) {
            int iM51497 = C23202.m51496(i9, 2, paddingLeft, i14);
            int i22 = rect2.bottom + i14;
            Rect rect3 = this.f31615;
            rect3.set(iM51497, i22, i5, i18 + i22);
            this.f31639.setBounds(rect3);
        }
    }

    @Override // android.view.View
    public final int getPaddingTop() {
        return Math.max(super.getPaddingTop(), this.f31626);
    }

    @Override // android.view.View
    public final int getPaddingBottom() {
        return Math.max(super.getPaddingBottom(), this.f31626);
    }

    @Override // android.view.View
    public final int getPaddingLeft() {
        return Math.max(super.getPaddingLeft(), this.f31626);
    }

    @Override // android.view.View
    public final int getPaddingRight() {
        return Math.max(super.getPaddingRight(), this.f31626);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26467(C21352 c21352) {
        this.f31631 = c21352;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m26465() {
        float f = this.f31627;
        float[] fArr = this.f31619;
        fArr[0] = f;
        fArr[1] = this.f31616;
        fArr[2] = this.f31642;
        return Color.HSVToColor(this.f31641, fArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26466(int i) {
        float[] fArr = this.f31619;
        C7466.m20004(i, fArr);
        this.f31627 = fArr[0];
        this.f31616 = fArr[1];
        this.f31642 = fArr[2];
        if (this.f31618) {
            this.f31641 = Color.alpha(i);
        } else {
            this.f31641 = 255;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26468() {
        if (this.f31618) {
            this.f31618 = false;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m26463(float f) {
        return (int) ((f * this.f31625) + 0.5f);
    }
}
