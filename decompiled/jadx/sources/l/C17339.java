package l;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.os.Handler;

/* JADX INFO: renamed from: l.ܿ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17339 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40670(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
        C2171.m7181(context).registerAudioDeviceCallback(audioDeviceCallback, handler);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40669(Context context, AudioDeviceCallback audioDeviceCallback) {
        C2171.m7181(context).unregisterAudioDeviceCallback(audioDeviceCallback);
    }
}
