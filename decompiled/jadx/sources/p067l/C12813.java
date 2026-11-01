package p067l;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۧ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H8RW */
/* JADX INFO: loaded from: classes3.dex */
public final class C12813 {
    /* JADX INFO: renamed from: ۧ */
    public static C11472 m29365(AudioManager audioManager, C19695 c19695) {
        audioManager.getClass();
        List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(c19695.m44733().f54801);
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return new C11472(C18426.m41995(audioDevicesForAttributes.get(0)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19518 m29364(AudioManager audioManager, C19695 c19695) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(c19695.m44733().f54801);
        HashMap map = new HashMap();
        map.put(2, new HashSet(C15129.m34550(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (C5792.m13010(format) || C19518.f59439.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(C15129.m34550(audioProfile.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(C15129.m34550(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        int i2 = AbstractC16192.f47662;
        C4123 c4123 = new C4123();
        for (Map.Entry entry : map.entrySet()) {
            c4123.m18184(new C18176(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new C19518(0, c4123.m8329());
    }
}
