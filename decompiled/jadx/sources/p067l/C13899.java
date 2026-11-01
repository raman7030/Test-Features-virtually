package p067l;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: renamed from: l.۫ۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C8TC */
/* JADX INFO: loaded from: classes3.dex */
public final class C13899 {

    /* JADX INFO: renamed from: ۧ */
    public final Object f39242 = new Object();

    /* JADX INFO: renamed from: ܽ */
    public Looper f39243 = null;

    /* JADX INFO: renamed from: ֫ */
    public HandlerThread f39241 = null;

    /* JADX INFO: renamed from: ᩳ */
    public int f39244 = 0;

    /* JADX INFO: renamed from: ֫ */
    public final Looper m31617() {
        Looper looper;
        synchronized (this.f39242) {
            if (this.f39243 == null) {
                C23877.m52960(this.f39244 == 0 && this.f39241 == null);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.f39241 = handlerThread;
                handlerThread.start();
                this.f39243 = this.f39241.getLooper();
            }
            this.f39244++;
            looper = this.f39243;
        }
        return looper;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31618() {
        HandlerThread handlerThread;
        synchronized (this.f39242) {
            C23877.m52960(this.f39244 > 0);
            int i = this.f39244 - 1;
            this.f39244 = i;
            if (i == 0 && (handlerThread = this.f39241) != null) {
                handlerThread.quit();
                this.f39241 = null;
                this.f39243 = null;
            }
        }
    }
}
