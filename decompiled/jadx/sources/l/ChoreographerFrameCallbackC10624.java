package l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: renamed from: l.ۤ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68R4 */
/* JADX INFO: loaded from: classes3.dex */
public final class ChoreographerFrameCallbackC10624 implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final ChoreographerFrameCallbackC10624 f31905 = new ChoreographerFrameCallbackC10624();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile long f31906 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f31907;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Choreographer f31908;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Handler f31909;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static ChoreographerFrameCallbackC10624 m26652() {
        return f31905;
    }

    public ChoreographerFrameCallbackC10624() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        String str = C3603.f11424;
        Handler handler = new Handler(looper, this);
        this.f31909 = handler;
        handler.sendEmptyMessage(1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26653() {
        this.f31909.sendEmptyMessage(2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26654() {
        this.f31909.sendEmptyMessage(3);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f31906 = j;
        Choreographer choreographer = this.f31908;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                this.f31908 = Choreographer.getInstance();
                return true;
            } catch (RuntimeException e) {
                C19956.m46036("Vsync sampling disabled due to platform error", e);
                return true;
            }
        }
        if (i == 2) {
            Choreographer choreographer = this.f31908;
            if (choreographer != null) {
                int i2 = this.f31907 + 1;
                this.f31907 = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        } else {
            if (i != 3) {
                return false;
            }
            Choreographer choreographer2 = this.f31908;
            if (choreographer2 != null) {
                int i3 = this.f31907 - 1;
                this.f31907 = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f31906 = -9223372036854775807L;
                    return true;
                }
            }
        }
        return true;
    }
}
