package l;

import android.media.MediaFormat;
import android.os.Build;
import android.util.Pair;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.֫ۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H74H */
/* JADX INFO: loaded from: classes2.dex */
public final class C1549 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f5460;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f5461;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7235 f5462;

    public C1549(C7235 c7235, boolean z, String str) {
        this.f5462 = c7235;
        this.f5461 = z;
        this.f5460 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MediaFormat m5307(C3002 c3002, C21843 c21843) {
        int i;
        c3002.m9145();
        this.f5462.m12195(c3002, c21843, 2, false);
        C8353 c8353 = c3002.f9455;
        c8353.getClass();
        c3002.m9145();
        MediaFormat mediaFormat = new MediaFormat();
        C12899.m31337(mediaFormat, "bitrate", c8353.f25627);
        C12899.m31337(mediaFormat, "max-bitrate", c8353.f25615);
        C12899.m31337(mediaFormat, "channel-count", c8353.f25625);
        C12899.m31339(mediaFormat, c8353.f25637);
        String str = c8353.f25614;
        if (str != null) {
            mediaFormat.setString("mime", str);
        }
        String str2 = c8353.f25619;
        if (str2 != null) {
            mediaFormat.setString("codecs-string", str2);
        }
        float f = c8353.f25596;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        C12899.m31337(mediaFormat, "width", c8353.f25633);
        C12899.m31337(mediaFormat, "height", c8353.f25609);
        C12899.m31338(mediaFormat, c8353.f25634);
        int i2 = c8353.f25605;
        if (i2 != -1) {
            C12899.m31337(mediaFormat, "exo-pcm-encoding-int", i2);
            if (i2 == 0) {
                i = 0;
            } else if (i2 != 2) {
                i = 3;
                if (i2 != 3) {
                    i = 4;
                    if (i2 != 4) {
                        i = 21;
                        if (i2 != 21) {
                            i = 22;
                            if (i2 == 22) {
                            }
                        }
                    }
                }
            } else {
                i = 2;
            }
            mediaFormat.setInteger("pcm-encoding", i);
        }
        String str3 = c8353.f25603;
        if (str3 != null) {
            mediaFormat.setString(am.N, str3);
        }
        C12899.m31337(mediaFormat, "max-input-size", c8353.f25601);
        C12899.m31337(mediaFormat, "sample-rate", c8353.f25624);
        C12899.m31337(mediaFormat, "caption-service-number", c8353.f25598);
        mediaFormat.setInteger("rotation-degrees", c8353.f25599);
        int i3 = c8353.f25628;
        int i4 = 1;
        mediaFormat.setInteger("is-autoselect", (i3 & 4) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-default", (i3 & 1) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-forced-subtitle", (i3 & 2) != 0 ? 1 : 0);
        mediaFormat.setInteger("encoder-delay", c8353.f25629);
        mediaFormat.setInteger("encoder-padding", c8353.f25630);
        float f2 = c8353.f25636;
        mediaFormat.setFloat("exo-pixel-width-height-ratio-float", f2);
        int i5 = 1073741824;
        if (f2 < 1.0f) {
            i4 = (int) (f2 * 1073741824);
        } else if (f2 > 1.0f) {
            i5 = (int) (1073741824 / f2);
            i4 = 1073741824;
        } else {
            i5 = 1;
        }
        mediaFormat.setInteger("sar-width", i4);
        mediaFormat.setInteger("sar-height", i5);
        String str4 = c8353.f25621;
        if (str4 != null) {
            try {
                mediaFormat.setInteger("track-id", Integer.parseInt(str4));
            } catch (NumberFormatException unused) {
            }
        }
        String str5 = this.f5460;
        if (str5 != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaFormat.removeKey("codecs-string");
            }
            mediaFormat.setString("mime", str5);
        }
        Pair pairM41768 = C17839.m41768(c8353);
        if (pairM41768 != null && Build.VERSION.SDK_INT >= 23) {
            mediaFormat.setInteger("profile", ((Integer) pairM41768.first).intValue());
            mediaFormat.setInteger("level", ((Integer) pairM41768.second).intValue());
        }
        return mediaFormat;
    }

    public final String toString() {
        return "MediaExtractorSampleQueue: " + this.f5462 + ", isCompatibilityTrack: " + this.f5461 + ", compatibilityTrackMimeType: " + this.f5460;
    }
}
