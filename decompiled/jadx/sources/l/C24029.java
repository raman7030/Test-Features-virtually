package l;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: renamed from: l.᩻᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8TR */
/* JADX INFO: loaded from: classes.dex */
public final class C24029 extends Surface {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static boolean f77853;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int f77854;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f77855;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f77856;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HandlerThreadC14856 f77857;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m52872(Context context) {
        int i;
        if (!f77853) {
            try {
                if (C3728.m11339(context)) {
                    i = C3728.m11342() ? 1 : 2;
                } else {
                    i = 0;
                }
            } catch (C2317 e) {
                C19956.m46033("Failed to determine secure mode due to GL error: " + e.getMessage());
            }
            f77854 = i;
            f77853 = true;
        }
        return f77854 != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C24029 m52871(Context context, boolean z) {
        C22632.m50634(!z || m52872(context));
        return new HandlerThreadC14856("ExoPlayer:PlaceholderSurface").m35255(z ? f77854 : 0);
    }

    public C24029(HandlerThreadC14856 handlerThreadC14856, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f77857 = handlerThreadC14856;
        this.f77856 = z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f77857) {
            if (!this.f77855) {
                this.f77857.m35256();
                this.f77855 = true;
            }
        }
    }
}
