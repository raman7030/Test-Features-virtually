package l;

import android.media.MediaCodecInfo;
import android.os.Build;
import com.umeng.commonsdk.utils.c;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: I8QN */
/* JADX INFO: loaded from: classes3.dex */
public final class C14372 {
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m34339(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean z;
        int i3;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 >= supportedPerformancePoints.size()) {
                    i3 = 1;
                    break;
                }
                if (C9005.m23240((Object) supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                    i3 = 2;
                    break;
                }
                i4++;
            }
            if (i3 == 1 && C23545.f75600 == null) {
                if (Build.VERSION.SDK_INT >= 35) {
                    z = false;
                } else {
                    int iM34340 = m34340(false);
                    int iM34341 = m34340(true);
                    if (iM34340 != 0 && (iM34341 != 0 ? !(iM34340 != 2 || iM34341 != 2) : iM34340 == 2)) {
                        z = false;
                    }
                }
                C23545.f75600 = Boolean.valueOf(z);
                if (C23545.f75600.booleanValue()) {
                }
            }
            return i3;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m34340(boolean z) {
        List listM49731;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            C1297 c1297 = new C1297();
            c1297.m4465("video/avc");
            C8353 c8353M4440 = c1297.m4440();
            String str = c8353M4440.f25614;
            if (str != null) {
                List listM49732 = C22134.m49731(str, z, false);
                String strM49728 = C22134.m49728(c8353M4440);
                if (strM49728 == null) {
                    listM49731 = AbstractC14545.of();
                } else {
                    listM49731 = C22134.m49731(strM49728, z, false);
                }
                C1846 c1846 = new C1846();
                c1846.m16263(listM49732);
                c1846.m16263(listM49731);
                AbstractC14545 abstractC14545M6131 = c1846.m6131();
                for (int i = 0; i < abstractC14545M6131.size(); i++) {
                    if (((C17195) abstractC14545M6131.get(i)).f52723 != null && (videoCapabilities = ((C17195) abstractC14545M6131.get(i)).f52723.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, c.e, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (C9005.m23240((Object) supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (C5201 unused) {
        }
        return 0;
    }
}
