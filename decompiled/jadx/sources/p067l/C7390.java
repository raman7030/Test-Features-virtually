package p067l;

import android.media.AudioTrack;

/* JADX INFO: renamed from: l.ۚۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes2.dex */
public final class C7390 extends AudioTrack.StreamEventCallback {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C3366 f19357;

    public C7390(C3366 c3366) {
        this.f19357 = c3366;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        if (audioTrack.equals(this.f19357.f6654.f27925) && this.f19357.f6654.f27905 != null && this.f19357.f6654.f27911) {
            this.f19357.f6654.f27905.mo48671();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f19357.f6654.f27925)) {
            this.f19357.f6654.f27933 = true;
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f19357.f6654.f27925) && this.f19357.f6654.f27905 != null && this.f19357.f6654.f27911) {
            this.f19357.f6654.f27905.mo48671();
        }
    }
}
