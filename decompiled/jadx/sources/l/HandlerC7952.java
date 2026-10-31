package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.۠ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC7952 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f24589;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f24590;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f24591;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final WeakReference f24592;

    public HandlerC7952(C3013 c3013) {
        super(Looper.getMainLooper());
        this.f24592 = new WeakReference(c3013);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C3013 c3013 = (C3013) this.f24592.get();
        if (c3013 != null) {
            c3013.m9227();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21259(long j) {
        this.f24591 = j;
        this.f24589 = true;
        removeMessages(0);
        if (this.f24590) {
            return;
        }
        sendEmptyMessageDelayed(0, j);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m21261() {
        if (!this.f24589 || this.f24590) {
            return;
        }
        removeMessages(0);
        sendEmptyMessageDelayed(0, this.f24591);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21260() {
        this.f24590 = true;
        removeMessages(0);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m21262() {
        if (this.f24590) {
            this.f24590 = false;
            if (this.f24589) {
                removeMessages(0);
                sendEmptyMessageDelayed(0, this.f24591);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21258() {
        this.f24589 = false;
        this.f24590 = false;
        removeMessages(0);
    }
}
