package p067l;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.ۘۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes2.dex */
public final class C6049 {

    /* JADX INFO: renamed from: ֫ */
    public final AudioTrack f15195;

    /* JADX INFO: renamed from: ۧ */
    public final C22201 f15196;

    /* JADX INFO: renamed from: ܽ */
    public C4708 f15197 = new AudioRouting.OnRoutingChangedListener() { // from class: l.ۖۤ֫
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            C6049.m13631(this.f10648, audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ۖۤ֫] */
    public C6049(AudioTrack audioTrack, C22201 c22201) {
        this.f15195 = audioTrack;
        this.f15196 = c22201;
        audioTrack.addOnRoutingChangedListener(this.f15197, new Handler(Looper.myLooper()));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13632() {
        C4708 c4708 = this.f15197;
        c4708.getClass();
        this.f15195.removeOnRoutingChangedListener(c4708);
        this.f15197 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13631(C6049 c6049, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (c6049.f15197 == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
            return;
        }
        c6049.f15196.m50020(routedDevice);
    }
}
