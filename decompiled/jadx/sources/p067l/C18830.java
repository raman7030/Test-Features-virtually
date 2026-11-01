package p067l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܿۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8ZU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18830 extends Drawable {

    /* JADX INFO: renamed from: ֫ */
    public Drawable.Callback f56220;

    /* JADX INFO: renamed from: ۜ */
    public Drawable f56221;

    /* JADX INFO: renamed from: ۡ */
    public boolean f56222 = false;

    /* JADX INFO: renamed from: ۢ */
    public boolean f56223;

    /* JADX INFO: renamed from: ۧ */
    public int f56224;

    /* JADX INFO: renamed from: ܳ */
    public final AbstractC16147 f56225;

    /* JADX INFO: renamed from: ܽ */
    public final String f56226;

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC5050 f56227;

    /* JADX INFO: renamed from: ᩳ */
    public final C23524 f56228;

    /* JADX INFO: renamed from: ᩷ */
    public float f56229;

    /* JADX INFO: renamed from: ᩻ */
    public final Drawable f56230;

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C18830(String str, AbstractC16147 abstractC16147, AbstractC5050 abstractC5050, C23524 c23524) {
        this.f56226 = str;
        this.f56225 = abstractC16147;
        this.f56227 = abstractC5050;
        this.f56228 = c23524;
        abstractC16147.getClass();
        this.f56230 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m42890() {
        return this.f56226;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m42894() {
        return this.f56221 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42892(Drawable.Callback callback) {
        this.f56220 = callback == null ? null : new C19501(this, callback);
        setCallback(callback);
        Drawable.Callback callback2 = this.f56220;
        AbstractC16147 abstractC16147 = this.f56225;
        if (callback2 != null) {
            Drawable drawable = this.f56221;
            if (drawable != null && drawable.getCallback() == null) {
                this.f56221.setCallback(this.f56220);
            }
            Drawable drawable2 = this.f56221;
            boolean z = drawable2 == null || drawable2 == this.f56230;
            if (drawable2 != null) {
                drawable2.setCallback(this.f56220);
                Object obj = this.f56221;
                if ((obj instanceof Animatable) && this.f56222) {
                    ((Animatable) obj).start();
                }
            }
            if (z) {
                abstractC16147.mo24852(this);
                return;
            }
            return;
        }
        Drawable drawable3 = this.f56221;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            Object obj2 = this.f56221;
            if (obj2 instanceof Animatable) {
                Animatable animatable = (Animatable) obj2;
                boolean zIsRunning = animatable.isRunning();
                this.f56222 = zIsRunning;
                if (zIsRunning) {
                    animatable.stop();
                }
            }
        }
        abstractC16147.mo24851(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42893(Drawable drawable) {
        this.f56222 = false;
        Drawable drawable2 = this.f56221;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f56221 = drawable;
        m42889();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX INFO: renamed from: ܽ */
    private void m42889() {
        Rect rect;
        int iMo17933;
        Rect rect2;
        if (this.f56224 == 0) {
            this.f56223 = true;
            Drawable drawable = this.f56221;
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
        this.f56223 = false;
        C21513 c21513 = (C21513) this.f56227;
        c21513.getClass();
        Rect bounds = this.f56221.getBounds();
        int i = this.f56224;
        float f = this.f56229;
        C23524 c23524 = this.f56228;
        if (c23524 == null) {
            int iWidth = bounds.width();
            if (iWidth > i) {
                bounds = new Rect(0, 0, i, (int) ((bounds.height() / (iWidth / i)) + 0.5f));
            }
        } else {
            C22854 c22854 = c23524.f74956;
            C22854 c22855 = c23524.f74955;
            int iWidth2 = bounds.width();
            int iHeight = bounds.height();
            float f2 = iWidth2 / iHeight;
            if (c22854 != null) {
                if ("%".equals(c22854.f71953)) {
                    iMo17933 = (int) (((c22854.f71954 / 100.0f) * i) + 0.5f);
                } else {
                    iMo17933 = c21513.mo17933(c22854, iWidth2, f);
                }
                rect = new Rect(0, 0, iMo17933, (c22855 == null || "%".equals(c22855.f71953)) ? (int) ((iMo17933 / f2) + 0.5f) : c21513.mo17933(c22855, iHeight, f));
            } else if (c22855 != null && !"%".equals(c22855.f71953)) {
                int iMo17934 = c21513.mo17933(c22855, iHeight, f);
                rect = new Rect(0, 0, (int) ((iMo17934 * f2) + 0.5f), iMo17934);
            }
            bounds = rect;
        }
        this.f56221.setBounds(bounds);
        this.f56221.setCallback(this.f56220);
        setBounds(bounds);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42891(float f, int i) {
        this.f56224 = i;
        this.f56229 = f;
        if (this.f56223) {
            m42889();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (m42894()) {
            this.f56221.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (m42894()) {
            return this.f56221.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (m42894()) {
            return this.f56221.getIntrinsicWidth();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (m42894()) {
            return this.f56221.getIntrinsicHeight();
        }
        return 1;
    }

    public final String toString() {
        return "AsyncDrawable{destination='" + this.f56226 + "', imageSize=" + this.f56228 + ", result=" + this.f56221 + ", canvasWidth=" + this.f56224 + ", textSize=" + this.f56229 + ", waitingForDimensions=" + this.f56223 + '}';
    }
}
