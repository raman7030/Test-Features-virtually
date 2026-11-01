package p067l;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.֨ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3366 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C10072 f6654;

    /* JADX INFO: renamed from: ۧ */
    public final Handler f6653 = new Handler(Looper.myLooper());

    /* JADX INFO: renamed from: ֫ */
    public final AudioTrack.StreamEventCallback f6652 = new C7390(this);

    public C3366(C10072 c10072) {
        this.f6654 = c10072;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5889(AudioTrack audioTrack) {
        Handler handler = this.f6653;
        C12826.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new ExecutorC2695(handler), this.f6652);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m5890(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f6652);
        this.f6653.removeCallbacksAndMessages(null);
    }
}
