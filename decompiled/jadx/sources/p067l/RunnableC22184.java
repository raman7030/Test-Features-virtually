package p067l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩷ۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8ZV */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC22184 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C11455 f70186;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C18830 f70187;

    public RunnableC22184(C11455 c11455, C18830 c18830) {
        this.f70186 = c11455;
        this.f70187 = c18830;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Rect bounds;
        C11455 c11455 = this.f70186;
        C18830 c18830 = this.f70187;
        String strM42890 = c18830.m42890();
        Drawable drawableMo17170 = null;
        try {
            String scheme = Uri.parse(strM42890).getScheme();
            if (scheme == null || scheme.length() == 0) {
                throw new IllegalStateException("No scheme is found: " + strM42890);
            }
            AbstractC14136 abstractC14136 = (AbstractC14136) ((HashMap) c11455.f31960).get(scheme);
            if (abstractC14136 != null) {
                C3407 c3407Mo21953 = abstractC14136.mo21953(strM42890);
                try {
                    AbstractC14806 abstractC14806 = (AbstractC14806) ((HashMap) c11455.f31963).get(c3407Mo21953.m6035());
                    if (abstractC14806 == null) {
                        abstractC14806 = c11455.f31958;
                    }
                    if (abstractC14806 != null) {
                        drawableMo17170 = abstractC14806.mo17170(c3407Mo21953.m6036());
                        c3407Mo21953.m6036().close();
                    } else {
                        throw new IllegalStateException("No media-decoder is found: " + strM42890);
                    }
                } catch (Throwable th) {
                    try {
                        c3407Mo21953.m6036().close();
                    } catch (IOException unused) {
                    }
                    throw th;
                }
            } else {
                throw new IllegalStateException("No scheme-handler is found: " + strM42890);
            }
        } catch (Throwable unused2) {
        }
        if (drawableMo17170 != null && ((bounds = drawableMo17170.getBounds()) == null || bounds.isEmpty())) {
            drawableMo17170.setBounds(new Rect(0, 0, drawableMo17170.getIntrinsicWidth(), drawableMo17170.getIntrinsicHeight()));
        }
        c11455.f31961.postAtTime(new RunnableC8772(this, drawableMo17170), c18830, SystemClock.uptimeMillis());
    }
}
