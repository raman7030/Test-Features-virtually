package p067l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۨۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G90S */
/* JADX INFO: loaded from: classes4.dex */
public final class C13231 extends AbstractC23959 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Runnable f37179;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f37179.run();
    }

    public C13231(Runnable runnable) {
        this.f37179 = runnable;
    }
}
