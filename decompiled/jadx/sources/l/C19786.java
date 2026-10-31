package l;

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

/* JADX INFO: renamed from: l.᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I9N6 */
/* JADX INFO: loaded from: classes4.dex */
public class C19786 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63891 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Drawable f63892;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f63894;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f63895;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Rect f63896;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f63897;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC19080 f63898;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f63899;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C4263 f63900;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Runnable f63902;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Drawable f63903;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f63901 = 255;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f63893 = -1;

    /* JADX INFO: renamed from: ֫ */
    public AbstractC19080 mo38227() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f63892;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f63903;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f63898.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding;
        Rect rectM43977 = this.f63898.m43977();
        if (rectM43977 != null) {
            rect.set(rectM43977);
            padding = (rectM43977.right | ((rectM43977.left | rectM43977.top) | rectM43977.bottom)) != 0;
        } else {
            Drawable drawable = this.f63892;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (this.f63898.f60090 && C8184.m21687(this) == 1) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f63892;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f63894 && this.f63901 == i) {
            return;
        }
        this.f63894 = true;
        this.f63901 = i;
        Drawable drawable = this.f63892;
        if (drawable != null) {
            if (this.f63897 == 0) {
                drawable.setAlpha(i);
            } else {
                m45479(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f63901;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        AbstractC19080 abstractC19080 = this.f63898;
        if (abstractC19080.f60095 != z) {
            abstractC19080.f60095 = z;
            Drawable drawable = this.f63892;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC19080 abstractC19080 = this.f63898;
        abstractC19080.f60118 = true;
        if (abstractC19080.f60100 != colorFilter) {
            abstractC19080.f60100 = colorFilter;
            Drawable drawable = this.f63892;
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
        AbstractC19080 abstractC19080 = this.f63898;
        abstractC19080.f60115 = true;
        if (abstractC19080.f60103 != colorStateList) {
            abstractC19080.f60103 = colorStateList;
            C8184.m21676(this.f63892, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        AbstractC19080 abstractC19080 = this.f63898;
        abstractC19080.f60094 = true;
        if (abstractC19080.f60119 != mode) {
            abstractC19080.f60119 = mode;
            C8184.m21679(this.f63892, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f63903;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f63892;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        AbstractC19080 abstractC19080 = this.f63898;
        if (abstractC19080.f60090 != z) {
            abstractC19080.f60090 = z;
            Drawable drawable = this.f63892;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f63898.f60090;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f63903;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f63903 = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f63892;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f63894) {
                this.f63892.setAlpha(this.f63901);
            }
        }
        if (this.f63895 != 0) {
            this.f63895 = 0L;
            z = true;
        }
        if (this.f63897 != 0) {
            this.f63897 = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f63892;
        if (drawable != null) {
            C8184.m21674(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f63896;
        if (rect == null) {
            this.f63896 = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f63892;
        if (drawable != null) {
            C8184.m21675(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f63896;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f63903;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f63892;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        AbstractC19080 abstractC19080 = this.f63898;
        int i2 = this.f63893;
        int i3 = abstractC19080.f60105;
        Drawable[] drawableArr = abstractC19080.f60098;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean zM21681 = Build.VERSION.SDK_INT >= 23 ? C8184.m21681(drawable, i) : false;
                if (i4 == i2) {
                    z = zM21681;
                }
            }
        }
        abstractC19080.f60092 = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        AbstractC19080 abstractC19080 = this.f63898;
        if (!abstractC19080.f60113) {
            Drawable drawable = this.f63892;
            if (drawable != null) {
                return drawable.getIntrinsicWidth();
            }
            return -1;
        }
        if (!abstractC19080.f60112) {
            abstractC19080.m43976();
        }
        return abstractC19080.f60114;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        AbstractC19080 abstractC19080 = this.f63898;
        if (!abstractC19080.f60113) {
            Drawable drawable = this.f63892;
            if (drawable != null) {
                return drawable.getIntrinsicHeight();
            }
            return -1;
        }
        if (!abstractC19080.f60112) {
            abstractC19080.m43976();
        }
        return abstractC19080.f60099;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        AbstractC19080 abstractC19080 = this.f63898;
        if (!abstractC19080.f60113) {
            Drawable drawable = this.f63892;
            if (drawable != null) {
                return drawable.getMinimumWidth();
            }
            return 0;
        }
        if (!abstractC19080.f60112) {
            abstractC19080.m43976();
        }
        return abstractC19080.f60091;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        AbstractC19080 abstractC19080 = this.f63898;
        if (!abstractC19080.f60113) {
            Drawable drawable = this.f63892;
            if (drawable != null) {
                return drawable.getMinimumHeight();
            }
            return 0;
        }
        if (!abstractC19080.f60112) {
            abstractC19080.m43976();
        }
        return abstractC19080.f60109;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        AbstractC19080 abstractC19080 = this.f63898;
        if (abstractC19080 != null) {
            abstractC19080.f60107 = false;
            abstractC19080.f60097 = false;
        }
        if (drawable != this.f63892 || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f63892 || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f63892 || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f63903;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f63892;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f63892;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f63898.m43978();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m45481() {
        return this.f63893;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m45480(int i) {
        if (i == this.f63893) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f63898.f60117 > 0) {
            Drawable drawable = this.f63903;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f63892;
            if (drawable2 != null) {
                this.f63903 = drawable2;
                this.f63895 = ((long) this.f63898.f60117) + jUptimeMillis;
            } else {
                this.f63903 = null;
                this.f63895 = 0L;
            }
        } else {
            Drawable drawable3 = this.f63892;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            AbstractC19080 abstractC19080 = this.f63898;
            if (i < abstractC19080.f60105) {
                Drawable drawableM43973 = abstractC19080.m43973(i);
                this.f63892 = drawableM43973;
                this.f63893 = i;
                if (drawableM43973 != null) {
                    int i2 = this.f63898.f60108;
                    if (i2 > 0) {
                        this.f63897 = jUptimeMillis + ((long) i2);
                    }
                    m45477(drawableM43973);
                }
            } else {
                this.f63892 = null;
                this.f63893 = -1;
            }
        } else {
            this.f63892 = null;
            this.f63893 = -1;
        }
        if (this.f63897 != 0 || this.f63895 != 0) {
            Runnable runnable = this.f63902;
            if (runnable == null) {
                this.f63902 = new RunnableC2852((C8496) this);
            } else {
                unscheduleSelf(runnable);
            }
            m45479(true);
        }
        invalidateSelf();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45477(Drawable drawable) {
        if (this.f63900 == null) {
            this.f63900 = new C4263();
        }
        C4263 c4263 = this.f63900;
        c4263.m12829(drawable.getCallback());
        drawable.setCallback(c4263);
        try {
            if (this.f63898.f60108 <= 0 && this.f63894) {
                drawable.setAlpha(this.f63901);
            }
            AbstractC19080 abstractC19080 = this.f63898;
            if (abstractC19080.f60118) {
                drawable.setColorFilter(abstractC19080.f60100);
            } else {
                if (abstractC19080.f60115) {
                    C8184.m21676(drawable, abstractC19080.f60103);
                }
                AbstractC19080 abstractC19081 = this.f63898;
                if (abstractC19081.f60094) {
                    C8184.m21679(drawable, abstractC19081.f60119);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f63898.f60095);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                C8184.m21681(drawable, C8184.m21687(this));
            }
            drawable.setAutoMirrored(this.f63898.f60090);
            Rect rect = this.f63896;
            if (rect != null) {
                C8184.m21675(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f63900.m12828());
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45479(boolean z) {
        boolean z2;
        Drawable drawable;
        long j;
        boolean z3 = true;
        this.f63894 = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f63892;
        if (drawable2 != null) {
            long j2 = this.f63897;
            if (j2 != 0) {
                if (j2 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f63901);
                    this.f63897 = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j2 - jUptimeMillis) * 255)) / this.f63898.f60108)) * this.f63901) / 255);
                    z2 = true;
                }
            }
            drawable = this.f63903;
            if (drawable != null) {
                j = this.f63895;
                if (j == 0) {
                    if (j <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f63903 = null;
                        this.f63895 = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.f63898.f60117) * this.f63901) / 255);
                    }
                }
                if (z || !z3) {
                }
                scheduleSelf(this.f63902, jUptimeMillis + 16);
                return;
            }
            this.f63895 = 0L;
            z3 = z2;
            if (z) {
            }
        }
        this.f63897 = 0L;
        z2 = false;
        drawable = this.f63903;
        if (drawable != null) {
            j = this.f63895;
            if (j == 0) {
                if (j <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f63903 = null;
                    this.f63895 = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.f63898.f60117) * this.f63901) / 255);
                }
            }
            if (z) {
            }
        }
        this.f63895 = 0L;
        z3 = z2;
        if (z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f63892;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45478(Resources resources) {
        AbstractC19080 abstractC19080 = this.f63898;
        if (resources == null) {
            abstractC19080.getClass();
            return;
        }
        abstractC19080.f60096 = resources;
        int i = resources.getDisplayMetrics().densityDpi;
        if (i == 0) {
            i = DHParameters.DEFAULT_MINIMUM_LENGTH;
        }
        int i2 = abstractC19080.f60088;
        abstractC19080.f60088 = i;
        if (i2 != i) {
            abstractC19080.f60112 = false;
            abstractC19080.f60120 = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f63898.m43974(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f63898.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f63898.m43975()) {
            return null;
        }
        this.f63898.f60110 = getChangingConfigurations();
        return this.f63898;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f63899 && super.mutate() == this) {
            AbstractC19080 abstractC19080Mo38227 = mo38227();
            abstractC19080Mo38227.mo4949();
            mo22191(abstractC19080Mo38227);
            this.f63899 = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo22191(AbstractC19080 abstractC19080) {
        this.f63898 = abstractC19080;
        int i = this.f63893;
        if (i >= 0) {
            Drawable drawableM43973 = abstractC19080.m43973(i);
            this.f63892 = drawableM43973;
            if (drawableM43973 != null) {
                m45477(drawableM43973);
            }
        }
        this.f63903 = null;
    }
}
