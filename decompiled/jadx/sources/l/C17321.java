package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܿۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8ZU */
/* JADX INFO: loaded from: classes4.dex */
public final class C17321 extends Drawable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Drawable.Callback f53038;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Drawable f53039;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f53040 = false;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f53041;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f53042;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC14498 f53043;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f53044;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC2821 f53045;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22260 f53046;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f53047;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Drawable f53048;

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C17321(String str, AbstractC14498 abstractC14498, AbstractC2821 abstractC2821, C22260 c22260) {
        this.f53044 = str;
        this.f53043 = abstractC14498;
        this.f53045 = abstractC2821;
        this.f53046 = c22260;
        abstractC14498.getClass();
        this.f53048 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m40639() {
        return this.f53044;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m40643() {
        return this.f53039 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40641(Drawable.Callback callback) {
        this.f53038 = callback == null ? null : new C18027(this, callback);
        setCallback(callback);
        Drawable.Callback callback2 = this.f53038;
        AbstractC14498 abstractC14498 = this.f53043;
        if (callback2 != null) {
            Drawable drawable = this.f53039;
            if (drawable != null && drawable.getCallback() == null) {
                this.f53039.setCallback(this.f53038);
            }
            Drawable drawable2 = this.f53039;
            boolean z = drawable2 == null || drawable2 == this.f53048;
            if (drawable2 != null) {
                drawable2.setCallback(this.f53038);
                Object obj = this.f53039;
                if ((obj instanceof Animatable) && this.f53040) {
                    ((Animatable) obj).start();
                }
            }
            if (z) {
                abstractC14498.mo22881(this);
                return;
            }
            return;
        }
        Drawable drawable3 = this.f53039;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            Object obj2 = this.f53039;
            if (obj2 instanceof Animatable) {
                Animatable animatable = (Animatable) obj2;
                boolean zIsRunning = animatable.isRunning();
                this.f53040 = zIsRunning;
                if (zIsRunning) {
                    animatable.stop();
                }
            }
        }
        abstractC14498.mo22880(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40642(Drawable drawable) {
        this.f53040 = false;
        Drawable drawable2 = this.f53039;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f53039 = drawable;
        m40638();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m40638() {
        Rect rect;
        int iMo15998;
        Rect rect2;
        if (this.f53042 == 0) {
            this.f53041 = true;
            Drawable drawable = this.f53039;
            if (drawable != null) {
                rect2 = drawable.getBounds();
                if (rect2.isEmpty()) {
                    rect2 = new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    if (rect2.isEmpty()) {
                        rect2 = new Rect(0, 0, 1, 1);
                    }
                }
            } else {
                rect2 = new Rect(0, 0, 1, 1);
            }
            setBounds(rect2);
            return;
        }
        this.f53041 = false;
        C20144 c20144 = (C20144) this.f53045;
        c20144.getClass();
        Rect bounds = this.f53039.getBounds();
        int i = this.f53042;
        float f = this.f53047;
        C22260 c22260 = this.f53046;
        if (c22260 == null) {
            int iWidth = bounds.width();
            if (iWidth > i) {
                bounds = new Rect(0, 0, i, (int) ((bounds.height() / (iWidth / i)) + 0.5f));
            }
        } else {
            C21555 c21555 = c22260.f72232;
            C21555 c21556 = c22260.f72231;
            int iWidth2 = bounds.width();
            int iHeight = bounds.height();
            float f2 = iWidth2 / iHeight;
            if (c21555 != null) {
                if ("%".equals(c21555.f69251)) {
                    iMo15998 = (int) (((c21555.f69252 / 100.0f) * i) + 0.5f);
                } else {
                    iMo15998 = c20144.mo15998(c21555, iWidth2, f);
                }
                rect = new Rect(0, 0, iMo15998, (c21556 == null || "%".equals(c21556.f69251)) ? (int) ((iMo15998 / f2) + 0.5f) : c20144.mo15998(c21556, iHeight, f));
            } else if (c21556 != null && !"%".equals(c21556.f69251)) {
                int iMo15999 = c20144.mo15998(c21556, iHeight, f);
                rect = new Rect(0, 0, (int) ((iMo15999 * f2) + 0.5f), iMo15999);
            }
            bounds = rect;
        }
        this.f53039.setBounds(bounds);
        this.f53039.setCallback(this.f53038);
        setBounds(bounds);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40640(float f, int i) {
        this.f53042 = i;
        this.f53047 = f;
        if (this.f53041) {
            m40638();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (m40643()) {
            this.f53039.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (m40643()) {
            return this.f53039.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (m40643()) {
            return this.f53039.getIntrinsicWidth();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (m40643()) {
            return this.f53039.getIntrinsicHeight();
        }
        return 1;
    }

    public final String toString() {
        return "AsyncDrawable{destination='" + this.f53044 + "', imageSize=" + this.f53046 + ", result=" + this.f53039 + ", canvasWidth=" + this.f53042 + ", textSize=" + this.f53047 + ", waitingForDimensions=" + this.f53041 + '}';
    }
}
