package p067l;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: l.ۘ֫ */
/* JADX INFO: compiled from: N5R1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1022 extends MediaController.Callback {

    /* JADX INFO: renamed from: ֫ */
    public final WeakReference f14276;

    public C1022(AbstractC1792 abstractC1792) {
        this.f14276 = new WeakReference(abstractC1792);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        C2015.m54538(bundle);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        if (((AbstractC1792) this.f14276.get()) != null) {
            C1372.m28824(mediaMetadata);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        if (((AbstractC1792) this.f14276.get()) != null) {
            C1385.m29324(list);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        C2015.m54538(bundle);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        if (((AbstractC1792) this.f14276.get()) != null) {
            playbackInfo.getPlaybackType();
            playbackInfo.getAudioAttributes();
            int i = C5832.f14307;
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
        }
    }
}
