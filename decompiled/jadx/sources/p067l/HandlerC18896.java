package p067l;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܿܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC18896 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public boolean f56411;

    /* JADX INFO: renamed from: ۧ */
    public final WeakReference f56412;

    /* JADX INFO: renamed from: ܽ */
    public boolean f56413 = false;

    public HandlerC18896(C8838 c8838) {
        this.f56412 = new WeakReference(c8838);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42999() {
        this.f56411 = false;
        removeMessages(0);
        sendEmptyMessageDelayed(0, 500L);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42998() {
        removeMessages(0);
        this.f56411 = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C8838 c8838 = (C8838) this.f56412.get();
        if (c8838 == null) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            if (this.f56411) {
                return;
            }
            if (c8838.f23995.m15632()) {
                c8838.invalidate();
            }
            sendEmptyMessageDelayed(0, 500L);
            return;
        }
        if (i == 2) {
            C8838.m20416(c8838);
            return;
        }
        if (i != 3) {
            return;
        }
        int iUptimeMillis = (int) ((SystemClock.uptimeMillis() - c8838.f23985) - 1500);
        if (iUptimeMillis < 0) {
            int i2 = -iUptimeMillis;
            if (i2 < 1500) {
                removeMessages(3);
                sendEmptyMessageDelayed(3, i2);
            }
            this.f56413 = true;
            return;
        }
        if (iUptimeMillis < 300) {
            this.f56413 = true;
            c8838.invalidate();
            removeMessages(3);
            sendEmptyMessage(3);
            return;
        }
        if (this.f56413) {
            this.f56413 = false;
            c8838.invalidate();
        }
    }
}
