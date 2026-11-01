package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.۠ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC9926 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public boolean f27502;

    /* JADX INFO: renamed from: ۧ */
    public boolean f27503;

    /* JADX INFO: renamed from: ܽ */
    public long f27504;

    /* JADX INFO: renamed from: ᩳ */
    public final WeakReference f27505;

    public HandlerC9926(C5232 c5232) {
        super(Looper.getMainLooper());
        this.f27505 = new WeakReference(c5232);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C5232 c5232 = (C5232) this.f27505.get();
        if (c5232 != null) {
            c5232.m11278();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23225(long j) {
        this.f27504 = j;
        this.f27502 = true;
        removeMessages(0);
        if (this.f27503) {
            return;
        }
        sendEmptyMessageDelayed(0, j);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m23227() {
        if (!this.f27502 || this.f27503) {
            return;
        }
        removeMessages(0);
        sendEmptyMessageDelayed(0, this.f27504);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m23226() {
        this.f27503 = true;
        removeMessages(0);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m23228() {
        if (this.f27503) {
            this.f27503 = false;
            if (this.f27502) {
                removeMessages(0);
                sendEmptyMessageDelayed(0, this.f27504);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23224() {
        this.f27502 = false;
        this.f27503 = false;
        removeMessages(0);
    }
}
