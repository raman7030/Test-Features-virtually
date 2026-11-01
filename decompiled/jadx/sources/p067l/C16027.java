package p067l;

import android.media.MediaCodecInfo;
import android.os.Build;
import com.umeng.commonsdk.utils.C0831c;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: I8QN */
/* JADX INFO: loaded from: classes3.dex */
public final class C16027 {
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX INFO: renamed from: ֫ */
    public static int m36473(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
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
                if (C10927.m25184((Object) supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                    i3 = 2;
                    break;
                }
                i4++;
            }
            if (i3 == 1 && C24745.f78346 == null) {
                if (Build.VERSION.SDK_INT >= 35) {
                    z = false;
                } else {
                    int iM36474 = m36474(false);
                    int iM36475 = m36474(true);
                    if (iM36474 != 0 && (iM36475 != 0 ? !(iM36474 != 2 || iM36475 != 2) : iM36474 == 2)) {
                        z = false;
                    }
                }
                C24745.f78346 = Boolean.valueOf(z);
                if (C24745.f78346.booleanValue()) {
                }
            }
            return i3;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m36474(boolean z) {
        List listM52069;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            C3601 c3601 = new C3601();
            c3601.m6697("video/avc");
            C10307 c10307M6672 = c3601.m6672();
            String str = c10307M6672.f28528;
            if (str != null) {
                List listM520610 = C23404.m52069(str, z, false);
                String strM52066 = C23404.m52066(c10307M6672);
                if (strM52066 == null) {
                    listM52069 = AbstractC16192.m36872of();
                } else {
                    listM52069 = C23404.m52069(strM52066, z, false);
                }
                C4123 c4123 = new C4123();
                c4123.m18183(listM520610);
                c4123.m18183(listM52069);
                AbstractC16192 abstractC16192M8329 = c4123.m8329();
                for (int i = 0; i < abstractC16192M8329.size(); i++) {
                    if (((C18710) abstractC16192M8329.get(i)).f55904 != null && (videoCapabilities = ((C18710) abstractC16192M8329.get(i)).f55904.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, C0831c.f3580e, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (C10927.m25184((Object) supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (C7311 unused) {
        }
        return 0;
    }
}
