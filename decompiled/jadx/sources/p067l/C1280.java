package p067l;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۧ */
/* JADX INFO: compiled from: E5FU */
/* JADX INFO: loaded from: classes3.dex */
public final class C1280 {
    /* JADX INFO: renamed from: ֫ */
    public static PlaybackState.Builder m24773() {
        return new PlaybackState.Builder();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24778(PlaybackState.Builder builder, int i, long j, float f, long j2) {
        builder.setState(i, j, f, j2);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m24790(PlaybackState.Builder builder, long j) {
        builder.setBufferedPosition(j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24779(PlaybackState.Builder builder, long j) {
        builder.setActions(j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24781(PlaybackState.Builder builder, CharSequence charSequence) {
        builder.setErrorMessage(charSequence);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24780(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
        builder.addCustomAction(customAction);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m24786(PlaybackState.Builder builder, long j) {
        builder.setActiveQueueItemId(j);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static List m24793(PlaybackState playbackState) {
        return playbackState.getCustomActions();
    }

    /* JADX INFO: renamed from: ֫ */
    public static PlaybackState m24776(PlaybackState.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: ᩷ */
    public static int m24794(PlaybackState playbackState) {
        return playbackState.getState();
    }

    /* JADX INFO: renamed from: ۜ */
    public static long m24783(PlaybackState playbackState) {
        return playbackState.getPosition();
    }

    /* JADX INFO: renamed from: ܽ */
    public static long m24789(PlaybackState playbackState) {
        return playbackState.getBufferedPosition();
    }

    /* JADX INFO: renamed from: ᩻ */
    public static float m24795(PlaybackState playbackState) {
        return playbackState.getPlaybackSpeed();
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m24772(PlaybackState playbackState) {
        return playbackState.getActions();
    }

    /* JADX INFO: renamed from: ܿ */
    public static CharSequence m24791(PlaybackState playbackState) {
        return playbackState.getErrorMessage();
    }

    /* JADX INFO: renamed from: ܳ */
    public static long m24787(PlaybackState playbackState) {
        return playbackState.getLastPositionUpdateTime();
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m24784(PlaybackState playbackState) {
        return playbackState.getActiveQueueItemId();
    }

    /* JADX INFO: renamed from: ֫ */
    public static PlaybackState.CustomAction.Builder m24774(String str, CharSequence charSequence, int i) {
        return new PlaybackState.CustomAction.Builder(str, charSequence, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24782(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* JADX INFO: renamed from: ֫ */
    public static PlaybackState.CustomAction m24775(PlaybackState.CustomAction.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: ۧ */
    public static Bundle m24785(PlaybackState.CustomAction customAction) {
        return customAction.getExtras();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m24777(PlaybackState.CustomAction customAction) {
        return customAction.getAction();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static CharSequence m24792(PlaybackState.CustomAction customAction) {
        return customAction.getName();
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m24788(PlaybackState.CustomAction customAction) {
        return customAction.getIcon();
    }
}
