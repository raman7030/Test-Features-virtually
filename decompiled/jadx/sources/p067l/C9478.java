package p067l;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: renamed from: l.۟۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H8RW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9478 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m22079(AudioManager audioManager, C11472 c11472) {
        AudioDeviceInfo[] devices;
        if (c11472 == null) {
            audioManager.getClass();
            devices = audioManager.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[]{c11472.f31988};
        }
        C14181 c14181 = new C14181();
        c14181.mo32662((Object[]) new Integer[]{8, 7});
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            c14181.mo32662((Object[]) new Integer[]{26, 27});
        }
        if (i >= 33) {
            c14181.mo8328((Object) 30);
        }
        AbstractC8146 abstractC8146Mo32660 = c14181.mo32660();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (abstractC8146Mo32660.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
