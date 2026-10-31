package l;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: renamed from: l.۫ۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C8TC */
/* JADX INFO: loaded from: classes3.dex */
public final class C12133 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f36230 = new Object();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Looper f36231 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HandlerThread f36229 = null;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f36232 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Looper m29552() {
        Looper looper;
        synchronized (this.f36230) {
            if (this.f36231 == null) {
                C22632.m50634(this.f36232 == 0 && this.f36229 == null);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.f36229 = handlerThread;
                handlerThread.start();
                this.f36231 = this.f36229.getLooper();
            }
            this.f36232++;
            looper = this.f36231;
        }
        return looper;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29553() {
        HandlerThread handlerThread;
        synchronized (this.f36230) {
            C22632.m50634(this.f36232 > 0);
            int i = this.f36232 - 1;
            this.f36232 = i;
            if (i == 0 && (handlerThread = this.f36229) != null) {
                handlerThread.quit();
                this.f36229 = null;
                this.f36231 = null;
            }
        }
    }
}
