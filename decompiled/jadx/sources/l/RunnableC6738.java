package l;

import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: l.ۜۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8ZV */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6738 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC20850 f20941;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Drawable f20942;

    public RunnableC6738(RunnableC20850 runnableC20850, Drawable drawable) {
        this.f20941 = runnableC20850;
        this.f20942 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable drawable;
        RunnableC20850 runnableC20850 = this.f20941;
        HashMap map = runnableC20850.f67504.f29015;
        C17321 c17321 = runnableC20850.f67505;
        if (((Future) map.remove(c17321)) == null || (drawable = this.f20942) == null || c17321.getCallback() == null) {
            return;
        }
        c17321.m40642(drawable);
    }
}
