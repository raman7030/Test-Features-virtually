package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩷ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XA43 */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC22109 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public long f69962;

    /* JADX INFO: renamed from: ۧ */
    public final WeakReference f69963;

    public HandlerC22109(C11380 c11380) {
        super(Looper.getMainLooper());
        this.f69962 = 1000L;
        this.f69963 = new WeakReference(c11380);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C11380 c11380 = (C11380) this.f69963.get();
        if (c11380 == null || c11380.getChildCount() == 0 || c11380.getVisibility() != 0) {
            return;
        }
        View childAt = c11380.getChildAt(0);
        int width = childAt.getWidth();
        int width2 = c11380.getWidth();
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
            this.f69962 = 1000L;
        } else {
            if (childAt.getScrollX() > width) {
                childAt.scrollTo(-width, 0);
                sendMessageDelayed(obtainMessage(0, 1, 0), this.f69962);
                long j = this.f69962;
                if (j < 32000) {
                    this.f69962 = j * 2;
                    return;
                }
                return;
            }
            childAt.scrollBy(1, 0);
            sendMessageDelayed(obtainMessage(0, 1, 0), 8L);
        }
    }
}
