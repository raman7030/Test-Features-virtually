package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N3Y7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18682 extends Drawable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f59076;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f59077;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public View f59078;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f59079;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f59080;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ColorFilter f59081;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Drawable f59082;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Drawable f59083;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f59084;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f59085;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C18682(View view) {
        Drawable drawableM48345 = C21311.m48345(view.getContext(), R.drawable.MT_Protector);
        C11003.requireNonNull(drawableM48345);
        Drawable drawableM48346 = C21311.m48345(view.getContext(), R.drawable.MT_Protector);
        C11003.requireNonNull(drawableM48346);
        this.f59076 = 255;
        this.f59079 = 1.0f;
        this.f59084 = 0;
        this.f59078 = view;
        this.f59083 = drawableM48345;
        this.f59082 = drawableM48346;
        this.f59085 = Math.max(drawableM48345.getIntrinsicWidth(), drawableM48346.getIntrinsicWidth());
        this.f59080 = Math.max(drawableM48345.getIntrinsicHeight(), drawableM48346.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f59083.setBounds(rect);
        this.f59082.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = this.f59079 * 255.0f;
        int i = (int) f;
        int i2 = (int) (f * 0.4f);
        int i3 = this.f59084;
        Drawable drawable = this.f59082;
        Drawable drawable2 = this.f59083;
        boolean z = false;
        if (i3 == 0) {
            drawable2.setAlpha(i);
            drawable.setAlpha(i2);
        } else if (i3 == 1) {
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.f59077);
            if (iCurrentTimeMillis < 0 || iCurrentTimeMillis >= 200) {
                this.f59084 = 0;
                drawable2.setAlpha(i);
                drawable.setAlpha(i2);
            } else {
                int i4 = (int) ((iCurrentTimeMillis / 200.0f) * (i - i2));
                drawable2.setAlpha(i2 + i4);
                drawable.setAlpha(i - i4);
                z = true;
            }
        } else if (i3 == 2) {
            drawable2.setAlpha(i2);
            drawable.setAlpha(i);
        } else if (i3 == 3) {
            int iCurrentTimeMillis2 = (int) (System.currentTimeMillis() - this.f59077);
            if (iCurrentTimeMillis2 < 0 || iCurrentTimeMillis2 >= 200) {
                this.f59084 = 2;
                drawable2.setAlpha(i2);
                drawable.setAlpha(i);
            } else {
                int i5 = (int) ((iCurrentTimeMillis2 / 200.0f) * (i - i2));
                drawable2.setAlpha(i - i5);
                drawable.setAlpha(i2 + i5);
                z = true;
            }
        }
        drawable2.draw(canvas);
        drawable.draw(canvas);
        if (z) {
            this.f59078.invalidate();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43296(boolean z) {
        if (z) {
            int i = this.f59084;
            if (i == 0 || i == 1) {
                return;
            } else {
                this.f59084 = 1;
            }
        } else {
            int i2 = this.f59084;
            if (i2 == 2 || i2 == 3) {
                return;
            } else {
                this.f59084 = 3;
            }
        }
        this.f59077 = System.currentTimeMillis();
        this.f59078.invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f59076 = i;
        this.f59079 = i / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f59076;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f59081 = colorFilter;
        this.f59083.setColorFilter(colorFilter);
        this.f59082.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f59081;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f59085;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f59080;
    }
}
