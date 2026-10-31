package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩷ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XA43 */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC20771 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f67278;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final WeakReference f67279;

    public HandlerC20771(C9482 c9482) {
        super(Looper.getMainLooper());
        this.f67278 = 1000L;
        this.f67279 = new WeakReference(c9482);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C9482 c9482 = (C9482) this.f67279.get();
        if (c9482 == null || c9482.getChildCount() == 0 || c9482.getVisibility() != 0) {
            return;
        }
        View childAt = c9482.getChildAt(0);
        int width = childAt.getWidth();
        int width2 = c9482.getWidth();
        if (width2 == 0 || width == 0) {
            sendMessageDelayed(obtainMessage(0, message.arg1, 0), 10L);
            return;
        }
        if (width < width2) {
            return;
        }
        if (message.arg1 == 0) {
            childAt.scrollTo(-width, 0);
            sendMessageDelayed(obtainMessage(0, 1, 0), 8L);
            this.f67278 = 1000L;
        } else {
            if (childAt.getScrollX() > width) {
                childAt.scrollTo(-width, 0);
                sendMessageDelayed(obtainMessage(0, 1, 0), this.f67278);
                long j = this.f67278;
                if (j < 32000) {
                    this.f67278 = j * 2;
                    return;
                }
                return;
            }
            childAt.scrollBy(1, 0);
            sendMessageDelayed(obtainMessage(0, 1, 0), 8L);
        }
    }
}
