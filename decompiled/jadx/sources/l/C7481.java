package l;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: renamed from: l.۟۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H8RW */
/* JADX INFO: loaded from: classes3.dex */
public final class C7481 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m20103(AudioManager audioManager, C9579 c9579) {
        AudioDeviceInfo[] devices;
        if (c9579 == null) {
            audioManager.getClass();
            devices = audioManager.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[]{c9579.f29041};
        }
        C12429 c12429 = new C12429();
        c12429.mo30597((Object[]) new Integer[]{8, 7});
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            c12429.mo30597((Object[]) new Integer[]{26, 27});
        }
        if (i >= 33) {
            c12429.mo6130((Object) 30);
        }
        AbstractC6079 abstractC6079Mo30595 = c12429.mo30595();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (abstractC6079Mo30595.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
