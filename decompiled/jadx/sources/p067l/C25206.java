package p067l;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: renamed from: l.᩻᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8TR */
/* JADX INFO: loaded from: classes.dex */
public final class C25206 extends Surface {

    /* JADX INFO: renamed from: ۗ */
    public static boolean f80605;

    /* JADX INFO: renamed from: ۙ */
    public static int f80606;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f80607;

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f80608;

    /* JADX INFO: renamed from: ᩹ */
    public final HandlerThreadC16488 f80609;

    /* JADX INFO: renamed from: ֫ */
    public static synchronized boolean m55278(Context context) {
        int i;
        if (!f80605) {
            try {
                if (C5911.m13291(context)) {
                    i = C5911.m13294() ? 1 : 2;
                } else {
                    i = 0;
                }
            } catch (C4570 e) {
                C21334.m48347("Failed to determine secure mode due to GL error: " + e.getMessage());
            }
            f80606 = i;
            f80605 = true;
        }
        return f80606 != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C25206 m55277(Context context, boolean z) {
        C23877.m52960(!z || m55278(context));
        return new HandlerThreadC16488("ExoPlayer:PlaceholderSurface").m37411(z ? f80606 : 0);
    }

    public C25206(HandlerThreadC16488 handlerThreadC16488, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f80609 = handlerThreadC16488;
        this.f80608 = z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f80609) {
            if (!this.f80607) {
                this.f80609.m37412();
                this.f80607 = true;
            }
        }
    }
}
