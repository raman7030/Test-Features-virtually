package p067l;

import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: l.ۜۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8ZV */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC8772 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ RunnableC22184 f23815;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Drawable f23816;

    public RunnableC8772(RunnableC22184 runnableC22184, Drawable drawable) {
        this.f23815 = runnableC22184;
        this.f23816 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable drawable;
        RunnableC22184 runnableC22184 = this.f23815;
        HashMap map = runnableC22184.f70186.f31962;
        C18830 c18830 = runnableC22184.f70187;
        if (((Future) map.remove(c18830)) == null || (drawable = this.f23816) == null || c18830.getCallback() == null) {
            return;
        }
        c18830.m42893(drawable);
    }
}
