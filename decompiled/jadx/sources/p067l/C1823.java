package p067l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.᩵᩻ */
/* JADX INFO: compiled from: I9N6 */
/* JADX INFO: loaded from: classes4.dex */
public class C1823 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: ۟ */
    public static final /* synthetic */ int f66528 = 0;

    /* JADX INFO: renamed from: ۗ */
    public Drawable f66529;

    /* JADX INFO: renamed from: ۛ */
    public boolean f66531;

    /* JADX INFO: renamed from: ۤ */
    public long f66532;

    /* JADX INFO: renamed from: ۨ */
    public Rect f66533;

    /* JADX INFO: renamed from: ۫ */
    public long f66534;

    /* JADX INFO: renamed from: ۬ */
    public AbstractC1788 f66535;

    /* JADX INFO: renamed from: ܰ */
    public boolean f66536;

    /* JADX INFO: renamed from: ᩶ */
    public C1053 f66537;

    /* JADX INFO: renamed from: ᩹ */
    public Runnable f66539;

    /* JADX INFO: renamed from: ᩺ */
    public Drawable f66540;

    /* JADX INFO: renamed from: ᩸ */
    public int f66538 = 255;

    /* JADX INFO: renamed from: ۙ */
    public int f66530 = -1;

    /* JADX INFO: renamed from: ֫ */
    public AbstractC1788 mo40441() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f66529;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f66540;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f66535.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding;
        Rect rectM46271 = this.f66535.m46271();
        if (rectM46271 != null) {
            rect.set(rectM46271);
            padding = (rectM46271.right | ((rectM46271.left | rectM46271.top) | rectM46271.bottom)) != 0;
        } else {
            Drawable drawable = this.f66529;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (this.f66535.f63324 && C1248.m23656(this) == 1) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f66529;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f66531 && this.f66538 == i) {
            return;
        }
        this.f66531 = true;
        this.f66538 = i;
        Drawable drawable = this.f66529;
        if (drawable != null) {
            if (this.f66534 == 0) {
                drawable.setAlpha(i);
            } else {
                m47790(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f66538;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        AbstractC1788 abstractC1788 = this.f66535;
        if (abstractC1788.f63329 != z) {
            abstractC1788.f63329 = z;
            Drawable drawable = this.f66529;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC1788 abstractC1788 = this.f66535;
        abstractC1788.f63352 = true;
        if (abstractC1788.f63334 != colorFilter) {
            abstractC1788.f63334 = colorFilter;
            Drawable drawable = this.f66529;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        AbstractC1788 abstractC1788 = this.f66535;
        abstractC1788.f63349 = true;
        if (abstractC1788.f63337 != colorStateList) {
            abstractC1788.f63337 = colorStateList;
            C1248.m23645(this.f66529, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        AbstractC1788 abstractC1788 = this.f66535;
        abstractC1788.f63328 = true;
        if (abstractC1788.f63353 != mode) {
            abstractC1788.f63353 = mode;
            C1248.m23648(this.f66529, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f66540;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f66529;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        AbstractC1788 abstractC1788 = this.f66535;
        if (abstractC1788.f63324 != z) {
            abstractC1788.f63324 = z;
            Drawable drawable = this.f66529;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f66535.f63324;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f66540;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f66540 = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f66529;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f66531) {
                this.f66529.setAlpha(this.f66538);
            }
        }
        if (this.f66532 != 0) {
            this.f66532 = 0L;
            z = true;
        }
        if (this.f66534 != 0) {
            this.f66534 = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f66529;
        if (drawable != null) {
            C1248.m23643(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f66533;
        if (rect == null) {
            this.f66533 = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f66529;
        if (drawable != null) {
            C1248.m23644(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f66533;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f66540;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f66529;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        AbstractC1788 abstractC1788 = this.f66535;
        int i2 = this.f66530;
        int i3 = abstractC1788.f63339;
        Drawable[] drawableArr = abstractC1788.f63332;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean zM23650 = Build.VERSION.SDK_INT >= 23 ? C1248.m23650(drawable, i) : false;
                if (i4 == i2) {
                    z = zM23650;
                }
            }
        }
        abstractC1788.f63326 = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        AbstractC1788 abstractC1788 = this.f66535;
        if (!abstractC1788.f63347) {
            Drawable drawable = this.f66529;
            if (drawable != null) {
                return drawable.getIntrinsicWidth();
            }
            return -1;
        }
        if (!abstractC1788.f63346) {
            abstractC1788.m46270();
        }
        return abstractC1788.f63348;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        AbstractC1788 abstractC1788 = this.f66535;
        if (!abstractC1788.f63347) {
            Drawable drawable = this.f66529;
            if (drawable != null) {
                return drawable.getIntrinsicHeight();
            }
            return -1;
        }
        if (!abstractC1788.f63346) {
            abstractC1788.m46270();
        }
        return abstractC1788.f63333;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        AbstractC1788 abstractC1788 = this.f66535;
        if (!abstractC1788.f63347) {
            Drawable drawable = this.f66529;
            if (drawable != null) {
                return drawable.getMinimumWidth();
            }
            return 0;
        }
        if (!abstractC1788.f63346) {
            abstractC1788.m46270();
        }
        return abstractC1788.f63325;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        AbstractC1788 abstractC1788 = this.f66535;
        if (!abstractC1788.f63347) {
            Drawable drawable = this.f66529;
            if (drawable != null) {
                return drawable.getMinimumHeight();
            }
            return 0;
        }
        if (!abstractC1788.f63346) {
            abstractC1788.m46270();
        }
        return abstractC1788.f63343;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        AbstractC1788 abstractC1788 = this.f66535;
        if (abstractC1788 != null) {
            abstractC1788.f63341 = false;
            abstractC1788.f63331 = false;
        }
        if (drawable != this.f66529 || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f66529 || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f66529 || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f66540;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f66529;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f66529;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f66535.m46272();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m47792() {
        return this.f66530;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m47791(int i) {
        if (i == this.f66530) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f66535.f63351 > 0) {
            Drawable drawable = this.f66540;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f66529;
            if (drawable2 != null) {
                this.f66540 = drawable2;
                this.f66532 = ((long) this.f66535.f63351) + jUptimeMillis;
            } else {
                this.f66540 = null;
                this.f66532 = 0L;
            }
        } else {
            Drawable drawable3 = this.f66529;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            AbstractC1788 abstractC1788 = this.f66535;
            if (i < abstractC1788.f63339) {
                Drawable drawableM46267 = abstractC1788.m46267(i);
                this.f66529 = drawableM46267;
                this.f66530 = i;
                if (drawableM46267 != null) {
                    int i2 = this.f66535.f63342;
                    if (i2 > 0) {
                        this.f66534 = jUptimeMillis + ((long) i2);
                    }
                    m47788(drawableM46267);
                }
            } else {
                this.f66529 = null;
                this.f66530 = -1;
            }
        } else {
            this.f66529 = null;
            this.f66530 = -1;
        }
        if (this.f66534 != 0 || this.f66532 != 0) {
            Runnable runnable = this.f66539;
            if (runnable == null) {
                this.f66539 = new RunnableC0983((C1263) this);
            } else {
                unscheduleSelf(runnable);
            }
            m47790(true);
        }
        invalidateSelf();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m47788(Drawable drawable) {
        if (this.f66537 == null) {
            this.f66537 = new C1053();
        }
        C1053 c1053 = this.f66537;
        c1053.m14693(drawable.getCallback());
        drawable.setCallback(c1053);
        try {
            if (this.f66535.f63342 <= 0 && this.f66531) {
                drawable.setAlpha(this.f66538);
            }
            AbstractC1788 abstractC1788 = this.f66535;
            if (abstractC1788.f63352) {
                drawable.setColorFilter(abstractC1788.f63334);
            } else {
                if (abstractC1788.f63349) {
                    C1248.m23645(drawable, abstractC1788.f63337);
                }
                AbstractC1788 abstractC1789 = this.f66535;
                if (abstractC1789.f63328) {
                    C1248.m23648(drawable, abstractC1789.f63353);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f66535.f63329);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                C1248.m23650(drawable, C1248.m23656(this));
            }
            drawable.setAutoMirrored(this.f66535.f63324);
            Rect rect = this.f66533;
            if (rect != null) {
                C1248.m23644(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f66537.m14692());
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final void m47790(boolean z) {
        boolean z2;
        Drawable drawable;
        long j;
        boolean z3 = true;
        this.f66531 = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f66529;
        if (drawable2 != null) {
            long j2 = this.f66534;
            if (j2 != 0) {
                if (j2 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f66538);
                    this.f66534 = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j2 - jUptimeMillis) * 255)) / this.f66535.f63342)) * this.f66538) / 255);
                    z2 = true;
                }
            }
            drawable = this.f66540;
            if (drawable != null) {
                j = this.f66532;
                if (j == 0) {
                    if (j <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f66540 = null;
                        this.f66532 = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.f66535.f63351) * this.f66538) / 255);
                    }
                }
                if (z || !z3) {
                }
                scheduleSelf(this.f66539, jUptimeMillis + 16);
                return;
            }
            this.f66532 = 0L;
            z3 = z2;
            if (z) {
            }
        }
        this.f66534 = 0L;
        z2 = false;
        drawable = this.f66540;
        if (drawable != null) {
            j = this.f66532;
            if (j == 0) {
                if (j <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f66540 = null;
                    this.f66532 = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.f66535.f63351) * this.f66538) / 255);
                }
            }
            if (z) {
            }
        }
        this.f66532 = 0L;
        z3 = z2;
        if (z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f66529;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47789(Resources resources) {
        AbstractC1788 abstractC1788 = this.f66535;
        if (resources == null) {
            abstractC1788.getClass();
            return;
        }
        abstractC1788.f63330 = resources;
        int i = resources.getDisplayMetrics().densityDpi;
        if (i == 0) {
            i = DHParameters.DEFAULT_MINIMUM_LENGTH;
        }
        int i2 = abstractC1788.f63322;
        abstractC1788.f63322 = i;
        if (i2 != i) {
            abstractC1788.f63346 = false;
            abstractC1788.f63354 = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f66535.m46268(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f66535.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f66535.m46269()) {
            return null;
        }
        this.f66535.f63344 = getChangingConfigurations();
        return this.f66535;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f66536 && super.mutate() == this) {
            AbstractC1788 abstractC1788Mo40441 = mo40441();
            abstractC1788Mo40441.mo7192();
            mo24159(abstractC1788Mo40441);
            this.f66536 = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo24159(AbstractC1788 abstractC1788) {
        this.f66535 = abstractC1788;
        int i = this.f66530;
        if (i >= 0) {
            Drawable drawableM46267 = abstractC1788.m46267(i);
            this.f66529 = drawableM46267;
            if (drawableM46267 != null) {
                m47788(drawableM46267);
            }
        }
        this.f66540 = null;
    }
}
