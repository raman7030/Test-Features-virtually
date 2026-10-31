package l;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.֨ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes2.dex */
public final class C1050 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8106 f3883;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Handler f3882 = new Handler(Looper.myLooper());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AudioTrack.StreamEventCallback f3881 = new C5284(this);

    public C1050(C8106 c8106) {
        this.f3883 = c8106;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3618(AudioTrack audioTrack) {
        Handler handler = this.f3882;
        C11003.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new ExecutorC0344(handler), this.f3881);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3619(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f3881);
        this.f3882.removeCallbacksAndMessages(null);
    }
}
