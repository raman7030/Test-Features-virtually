package l;

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
public final class C10990 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C9579 m27303(AudioManager audioManager, C18231 c18231) {
        audioManager.getClass();
        List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(c18231.m42474().f51620);
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return new C9579(C16895.m39754(audioDevicesForAttributes.get(0)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18045 m27302(AudioManager audioManager, C18231 c18231) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(c18231.m42474().f51620);
        HashMap map = new HashMap();
        map.put(2, new HashSet(C13426.m32448(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (C3603.m11034(format) || C18045.f56237.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(C13426.m32448(audioProfile.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(C13426.m32448(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        int i2 = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        for (Map.Entry entry : map.entrySet()) {
            c1846.m16264(new C16633(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new C18045(0, c1846.m6131());
    }
}
