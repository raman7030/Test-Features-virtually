package l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩷ۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8ZV */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20850 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9561 f67504;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17321 f67505;

    public RunnableC20850(C9561 c9561, C17321 c17321) {
        this.f67504 = c9561;
        this.f67505 = c17321;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Rect bounds;
        C9561 c9561 = this.f67504;
        C17321 c17321 = this.f67505;
        String strM40639 = c17321.m40639();
        Drawable drawableMo15264 = null;
        try {
            String scheme = Uri.parse(strM40639).getScheme();
            if (scheme == null || scheme.length() == 0) {
                throw new IllegalStateException("No scheme is found: " + strM40639);
            }
            AbstractC12382 abstractC12382 = (AbstractC12382) ((HashMap) c9561.f29013).get(scheme);
            if (abstractC12382 != null) {
                C1093 c1093Mo19978 = abstractC12382.mo19978(strM40639);
                try {
                    AbstractC13087 abstractC13087 = (AbstractC13087) ((HashMap) c9561.f29016).get(c1093Mo19978.m3763());
                    if (abstractC13087 == null) {
                        abstractC13087 = c9561.f29011;
                    }
                    if (abstractC13087 != null) {
                        drawableMo15264 = abstractC13087.mo15264(c1093Mo19978.m3764());
                        c1093Mo19978.m3764().close();
                    } else {
                        throw new IllegalStateException("No media-decoder is found: " + strM40639);
                    }
                } catch (Throwable th) {
                    try {
                        c1093Mo19978.m3764().close();
                    } catch (IOException unused) {
                    }
                    throw th;
                }
            } else {
                throw new IllegalStateException("No scheme-handler is found: " + strM40639);
            }
        } catch (Throwable unused2) {
        }
        if (drawableMo15264 != null && ((bounds = drawableMo15264.getBounds()) == null || bounds.isEmpty())) {
            drawableMo15264.setBounds(new Rect(0, 0, drawableMo15264.getIntrinsicWidth(), drawableMo15264.getIntrinsicHeight()));
        }
        c9561.f29014.postAtTime(new RunnableC6738(this, drawableMo15264), c17321, SystemClock.uptimeMillis());
    }
}
