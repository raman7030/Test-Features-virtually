package l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۨۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G90S */
/* JADX INFO: loaded from: classes4.dex */
public final class C11430 extends AbstractC22718 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f34183;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f34183.run();
    }

    public C11430(Runnable runnable) {
        this.f34183 = runnable;
    }
}
