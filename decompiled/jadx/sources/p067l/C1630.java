package p067l;

import android.media.session.PlaybackState;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ܺۧ */
/* JADX INFO: compiled from: E5FU */
/* JADX INFO: loaded from: classes4.dex */
public final class C1630 {
    /* JADX INFO: renamed from: ֫ */
    public static void m39792(PlaybackState.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bundle m39791(PlaybackState playbackState) {
        return playbackState.getExtras();
    }
}
