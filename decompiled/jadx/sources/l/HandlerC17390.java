package l;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܿܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC17390 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f53226;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final WeakReference f53227;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f53228 = false;

    public HandlerC17390(C6807 c6807) {
        this.f53227 = new WeakReference(c6807);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40745() {
        this.f53226 = false;
        removeMessages(0);
        sendEmptyMessageDelayed(0, 500L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40744() {
        removeMessages(0);
        this.f53226 = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C6807 c6807 = (C6807) this.f53227.get();
        if (c6807 == null) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            if (this.f53226) {
                return;
            }
            if (c6807.f21118.m13757()) {
                c6807.invalidate();
            }
            sendEmptyMessageDelayed(0, 500L);
            return;
        }
        if (i == 2) {
            C6807.m18467(c6807);
            return;
        }
        if (i != 3) {
            return;
        }
        int iUptimeMillis = (int) ((SystemClock.uptimeMillis() - c6807.f21108) - 1500);
        if (iUptimeMillis < 0) {
            int i2 = -iUptimeMillis;
            if (i2 < 1500) {
                removeMessages(3);
                sendEmptyMessageDelayed(3, i2);
            }
            this.f53228 = true;
            return;
        }
        if (iUptimeMillis < 300) {
            this.f53228 = true;
            c6807.invalidate();
            removeMessages(3);
            sendEmptyMessage(3);
            return;
        }
        if (this.f53228) {
            this.f53228 = false;
            c6807.invalidate();
        }
    }
}
