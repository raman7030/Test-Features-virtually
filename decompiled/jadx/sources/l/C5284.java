package l;

import android.media.AudioTrack;

/* JADX INFO: renamed from: l.ۚۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes2.dex */
public final class C5284 extends AudioTrack.StreamEventCallback {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1050 f16520;

    public C5284(C1050 c1050) {
        this.f16520 = c1050;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        if (audioTrack.equals(this.f16520.f3883.f25016) && this.f16520.f3883.f24996 != null && this.f16520.f3883.f25002) {
            this.f16520.f3883.f24996.mo46355();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f16520.f3883.f25016)) {
            this.f16520.f3883.f25024 = true;
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f16520.f3883.f25016) && this.f16520.f3883.f24996 != null && this.f16520.f3883.f25002) {
            this.f16520.f3883.f24996.mo46355();
        }
    }
}
