package p067l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܿ᩵ */
/* JADX INFO: compiled from: B3YF */
/* JADX INFO: loaded from: classes5.dex */
public final class C1712 implements InterfaceC1187 {

    /* JADX INFO: renamed from: ֫ */
    public Drawable f56781;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C1572 f56782;

    public C1712(C1572 c1572) {
        this.f56782 = c1572;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43267(Drawable drawable) {
        this.f56781 = drawable;
        this.f56782.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43266(int i, int i2, int i3, int i4) {
        C1572 c1572 = this.f56782;
        c1572.mShadowBounds.set(i, i2, i3, i4);
        Rect rect = c1572.mContentPadding;
        super/*android.widget.FrameLayout*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Drawable m43265() {
        return this.f56781;
    }
}
