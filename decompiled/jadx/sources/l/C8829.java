package l;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5FU */
/* JADX INFO: loaded from: classes3.dex */
public final class C8829 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PlaybackState.Builder m22803() {
        return new PlaybackState.Builder();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22808(PlaybackState.Builder builder, int i, long j, float f, long j2) {
        builder.setState(i, j, f, j2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m22820(PlaybackState.Builder builder, long j) {
        builder.setBufferedPosition(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22809(PlaybackState.Builder builder, long j) {
        builder.setActions(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22811(PlaybackState.Builder builder, CharSequence charSequence) {
        builder.setErrorMessage(charSequence);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22810(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
        builder.addCustomAction(customAction);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m22816(PlaybackState.Builder builder, long j) {
        builder.setActiveQueueItemId(j);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static List m22823(PlaybackState playbackState) {
        return playbackState.getCustomActions();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PlaybackState m22806(PlaybackState.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m22824(PlaybackState playbackState) {
        return playbackState.getState();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static long m22813(PlaybackState playbackState) {
        return playbackState.getPosition();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static long m22819(PlaybackState playbackState) {
        return playbackState.getBufferedPosition();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static float m22825(PlaybackState playbackState) {
        return playbackState.getPlaybackSpeed();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m22802(PlaybackState playbackState) {
        return playbackState.getActions();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static CharSequence m22821(PlaybackState playbackState) {
        return playbackState.getErrorMessage();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static long m22817(PlaybackState playbackState) {
        return playbackState.getLastPositionUpdateTime();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m22814(PlaybackState playbackState) {
        return playbackState.getActiveQueueItemId();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PlaybackState.CustomAction.Builder m22804(String str, CharSequence charSequence, int i) {
        return new PlaybackState.CustomAction.Builder(str, charSequence, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22812(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PlaybackState.CustomAction m22805(PlaybackState.CustomAction.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bundle m22815(PlaybackState.CustomAction customAction) {
        return customAction.getExtras();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m22807(PlaybackState.CustomAction customAction) {
        return customAction.getAction();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static CharSequence m22822(PlaybackState.CustomAction customAction) {
        return customAction.getName();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m22818(PlaybackState.CustomAction customAction) {
        return customAction.getIcon();
    }
}
