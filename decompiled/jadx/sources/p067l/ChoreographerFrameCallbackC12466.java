package p067l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: renamed from: l.ۤ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68R4 */
/* JADX INFO: loaded from: classes3.dex */
public final class ChoreographerFrameCallbackC12466 implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: ۗ */
    public static final ChoreographerFrameCallbackC12466 f34877 = new ChoreographerFrameCallbackC12466();

    /* JADX INFO: renamed from: ۙ */
    public volatile long f34878 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩶ */
    public int f34879;

    /* JADX INFO: renamed from: ᩸ */
    public Choreographer f34880;

    /* JADX INFO: renamed from: ᩹ */
    public final Handler f34881;

    /* JADX INFO: renamed from: ܽ */
    public static ChoreographerFrameCallbackC12466 m28692() {
        return f34877;
    }

    public ChoreographerFrameCallbackC12466() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        String str = C5792.f14228;
        Handler handler = new Handler(looper, this);
        this.f34881 = handler;
        handler.sendEmptyMessage(1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28693() {
        this.f34881.sendEmptyMessage(2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m28694() {
        this.f34881.sendEmptyMessage(3);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f34878 = j;
        Choreographer choreographer = this.f34880;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                this.f34880 = Choreographer.getInstance();
                return true;
            } catch (RuntimeException e) {
                C21334.m48350("Vsync sampling disabled due to platform error", e);
                return true;
            }
        }
        if (i == 2) {
            Choreographer choreographer = this.f34880;
            if (choreographer != null) {
                int i2 = this.f34879 + 1;
                this.f34879 = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        } else {
            if (i != 3) {
                return false;
            }
            Choreographer choreographer2 = this.f34880;
            if (choreographer2 != null) {
                int i3 = this.f34879 - 1;
                this.f34879 = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f34878 = -9223372036854775807L;
                    return true;
                }
            }
        }
        return true;
    }
}
