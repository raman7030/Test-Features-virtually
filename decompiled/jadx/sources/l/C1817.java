package l;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;

/* JADX INFO: renamed from: l.֫۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H8RW */
/* JADX INFO: loaded from: classes2.dex */
public final class C1817 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC14545 m6039(C18231 c18231) {
        int i = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        AbstractC20151 it = C18045.f56237.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (Build.VERSION.SDK_INT >= C3603.m10998(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), c18231.m42474().f51620)) {
                c1846.m16264(num);
            }
        }
        c1846.m16264(2);
        return c1846.m6131();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m6038(int i, int i2, C18231 c18231) {
        for (int i3 = 10; i3 > 0; i3--) {
            int iM11035 = C3603.m11035(i3);
            if (iM11035 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iM11035).build(), c18231.m42474().f51620)) {
                return i3;
            }
        }
        return 0;
    }
}
