package l;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: l.ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N5R1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3621 extends MediaController.Callback {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f11471;

    public C3621(AbstractC19144 abstractC19144) {
        this.f11471 = new WeakReference(abstractC19144);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        C23645.m52135(bundle);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        if (((AbstractC19144) this.f11471.get()) != null) {
            C10677.m26785(mediaMetadata);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        if (((AbstractC19144) this.f11471.get()) != null) {
            C10946.m27264(list);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        C23645.m52135(bundle);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        if (((AbstractC19144) this.f11471.get()) != null) {
            playbackInfo.getPlaybackType();
            playbackInfo.getAudioAttributes();
            int i = C3645.f11501;
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
        }
    }
}
