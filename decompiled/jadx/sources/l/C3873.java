package l;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.ۘۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3873 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AudioTrack f12388;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20868 f12389;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2462 f12390 = new AudioRouting.OnRoutingChangedListener() { // from class: l.ۖۤ֫
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            C3873.m11695(this.f7860, audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ۖۤ֫] */
    public C3873(AudioTrack audioTrack, C20868 c20868) {
        this.f12388 = audioTrack;
        this.f12389 = c20868;
        audioTrack.addOnRoutingChangedListener(this.f12390, new Handler(Looper.myLooper()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11696() {
        C2462 c2462 = this.f12390;
        c2462.getClass();
        this.f12388.removeOnRoutingChangedListener(c2462);
        this.f12390 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11695(C3873 c3873, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (c3873.f12390 == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
            return;
        }
        c3873.f12389.m47690(routedDevice);
    }
}
