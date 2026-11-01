package p067l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩴۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N3Y7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20124 extends Drawable {

    /* JADX INFO: renamed from: ֫ */
    public int f62299;

    /* JADX INFO: renamed from: ۜ */
    public long f62300;

    /* JADX INFO: renamed from: ۢ */
    public View f62301;

    /* JADX INFO: renamed from: ۧ */
    public float f62302;

    /* JADX INFO: renamed from: ܳ */
    public int f62303;

    /* JADX INFO: renamed from: ܽ */
    public ColorFilter f62304;

    /* JADX INFO: renamed from: ܿ */
    public Drawable f62305;

    /* JADX INFO: renamed from: ᩳ */
    public Drawable f62306;

    /* JADX INFO: renamed from: ᩷ */
    public int f62307;

    /* JADX INFO: renamed from: ᩻ */
    public int f62308;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C20124(View view) {
        Drawable drawableM50680 = C22622.m50680(view.getContext(), R.drawable.MT_Protector);
        C12826.requireNonNull(drawableM50680);
        Drawable drawableM50681 = C22622.m50680(view.getContext(), R.drawable.MT_Protector);
        C12826.requireNonNull(drawableM50681);
        this.f62299 = 255;
        this.f62302 = 1.0f;
        this.f62307 = 0;
        this.f62301 = view;
        this.f62306 = drawableM50680;
        this.f62305 = drawableM50681;
        this.f62308 = Math.max(drawableM50680.getIntrinsicWidth(), drawableM50681.getIntrinsicWidth());
        this.f62303 = Math.max(drawableM50680.getIntrinsicHeight(), drawableM50681.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f62306.setBounds(rect);
        this.f62305.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = this.f62302 * 255.0f;
        int i = (int) f;
        int i2 = (int) (f * 0.4f);
        int i3 = this.f62307;
        Drawable drawable = this.f62305;
        Drawable drawable2 = this.f62306;
        boolean z = false;
        if (i3 == 0) {
            drawable2.setAlpha(i);
            drawable.setAlpha(i2);
        } else if (i3 == 1) {
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.f62300);
            if (iCurrentTimeMillis < 0 || iCurrentTimeMillis >= 200) {
                this.f62307 = 0;
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
            int iCurrentTimeMillis2 = (int) (System.currentTimeMillis() - this.f62300);
            if (iCurrentTimeMillis2 < 0 || iCurrentTimeMillis2 >= 200) {
                this.f62307 = 2;
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
            this.f62301.invalidate();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45562(boolean z) {
        if (z) {
            int i = this.f62307;
            if (i == 0 || i == 1) {
                return;
            } else {
                this.f62307 = 1;
            }
        } else {
            int i2 = this.f62307;
            if (i2 == 2 || i2 == 3) {
                return;
            } else {
                this.f62307 = 3;
            }
        }
        this.f62300 = System.currentTimeMillis();
        this.f62301.invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f62299 = i;
        this.f62302 = i / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f62299;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f62304 = colorFilter;
        this.f62306.setColorFilter(colorFilter);
        this.f62305.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f62304;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f62308;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f62303;
    }
}
