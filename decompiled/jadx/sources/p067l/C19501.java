package p067l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ᩳۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8ZU */
/* JADX INFO: loaded from: classes4.dex */
public final class C19501 implements Drawable.Callback {

    /* JADX INFO: renamed from: ᩸ */
    public final Drawable.Callback f59401;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C18830 f59402;

    public C19501(C18830 c18830, Drawable.Callback callback) {
        this.f59402 = c18830;
        this.f59401 = callback;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f59401.invalidateDrawable(this.f59402);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f59401.scheduleDrawable(this.f59402, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f59401.unscheduleDrawable(this.f59402, runnable);
    }
}
