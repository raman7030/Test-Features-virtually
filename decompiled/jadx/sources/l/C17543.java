package l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B3YF */
/* JADX INFO: loaded from: classes5.dex */
public final class C17543 implements InterfaceC6960 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Drawable f53591;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14720 f53592;

    public C17543(C14720 c14720) {
        this.f53592 = c14720;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41022(Drawable drawable) {
        this.f53591 = drawable;
        this.f53592.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41021(int i, int i2, int i3, int i4) {
        C14720 c14720 = this.f53592;
        c14720.mShadowBounds.set(i, i2, i3, i4);
        Rect rect = c14720.mContentPadding;
        super/*android.widget.FrameLayout*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Drawable m41020() {
        return this.f53591;
    }
}
