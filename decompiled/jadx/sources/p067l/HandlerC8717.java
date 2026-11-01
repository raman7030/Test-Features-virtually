package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۜۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5HS */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC8717 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final WeakReference f23638;

    /* JADX INFO: renamed from: ۧ */
    public boolean f23639;

    public HandlerC8717(C11400 c11400) {
        super(Looper.getMainLooper());
        this.f23639 = false;
        this.f23638 = new WeakReference(c11400);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C11400 c11400 = (C11400) this.f23638.get();
        if (c11400 == null) {
            return;
        }
        if (c11400.m26357()) {
            c11400.f31816 = SystemClock.uptimeMillis();
            removeMessages(0);
            sendEmptyMessageDelayed(0, 1500L);
            return;
        }
        int iUptimeMillis = (int) ((SystemClock.uptimeMillis() - c11400.f31816) - 1500);
        if (iUptimeMillis < 0) {
            int i = -iUptimeMillis;
            if (i < 1500) {
                removeMessages(0);
                sendEmptyMessageDelayed(0, i);
            }
            this.f23639 = true;
            return;
        }
        if (iUptimeMillis < 300) {
            this.f23639 = true;
            c11400.invalidate();
            removeMessages(0);
            sendEmptyMessage(0);
            return;
        }
        if (this.f23639) {
            this.f23639 = false;
            c11400.invalidate();
        }
    }
}
