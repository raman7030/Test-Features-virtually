package l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ᩳۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8ZU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18027 implements Drawable.Callback {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Drawable.Callback f56203;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17321 f56204;

    public C18027(C17321 c17321, Drawable.Callback callback) {
        this.f56204 = c17321;
        this.f56203 = callback;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f56203.invalidateDrawable(this.f56204);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f56203.scheduleDrawable(this.f56204, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f56203.unscheduleDrawable(this.f56204, runnable);
    }
}
