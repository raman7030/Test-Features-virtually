package p067l;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.os.Handler;

/* JADX INFO: renamed from: l.ܿ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18847 {
    /* JADX INFO: renamed from: ֫ */
    public static void m42921(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
        C4431.m9260(context).registerAudioDeviceCallback(audioDeviceCallback, handler);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42920(Context context, AudioDeviceCallback audioDeviceCallback) {
        C4431.m9260(context).unregisterAudioDeviceCallback(audioDeviceCallback);
    }
}
