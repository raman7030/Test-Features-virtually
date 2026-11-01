package p067l;

import android.media.MediaFormat;
import android.os.Build;
import android.util.Pair;
import com.umeng.analytics.pro.C0655am;

/* JADX INFO: renamed from: l.֫ۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H74H */
/* JADX INFO: loaded from: classes2.dex */
public final class C3840 {

    /* JADX INFO: renamed from: ֫ */
    public final String f8241;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f8242;

    /* JADX INFO: renamed from: ܽ */
    public final C9244 f8243;

    public C3840(C9244 c9244, boolean z, String str) {
        this.f8243 = c9244;
        this.f8242 = z;
        this.f8241 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final MediaFormat m7536(C5221 c5221, C23128 c23128) {
        int i;
        c5221.m11196();
        this.f8243.m14116(c5221, c23128, 2, false);
        C10307 c10307 = c5221.f12253;
        c10307.getClass();
        c5221.m11196();
        MediaFormat mediaFormat = new MediaFormat();
        C14627.m33423(mediaFormat, "bitrate", c10307.f28541);
        C14627.m33423(mediaFormat, "max-bitrate", c10307.f28529);
        C14627.m33423(mediaFormat, "channel-count", c10307.f28539);
        C14627.m33425(mediaFormat, c10307.f28551);
        String str = c10307.f28528;
        if (str != null) {
            mediaFormat.setString("mime", str);
        }
        String str2 = c10307.f28533;
        if (str2 != null) {
            mediaFormat.setString("codecs-string", str2);
        }
        float f = c10307.f28510;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        C14627.m33423(mediaFormat, "width", c10307.f28547);
        C14627.m33423(mediaFormat, "height", c10307.f28523);
        C14627.m33424(mediaFormat, c10307.f28548);
        int i2 = c10307.f28519;
        if (i2 != -1) {
            C14627.m33423(mediaFormat, "exo-pcm-encoding-int", i2);
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
        String str3 = c10307.f28517;
        if (str3 != null) {
            mediaFormat.setString(C0655am.f2259N, str3);
        }
        C14627.m33423(mediaFormat, "max-input-size", c10307.f28515);
        C14627.m33423(mediaFormat, "sample-rate", c10307.f28538);
        C14627.m33423(mediaFormat, "caption-service-number", c10307.f28512);
        mediaFormat.setInteger("rotation-degrees", c10307.f28513);
        int i3 = c10307.f28542;
        int i4 = 1;
        mediaFormat.setInteger("is-autoselect", (i3 & 4) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-default", (i3 & 1) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-forced-subtitle", (i3 & 2) != 0 ? 1 : 0);
        mediaFormat.setInteger("encoder-delay", c10307.f28543);
        mediaFormat.setInteger("encoder-padding", c10307.f28544);
        float f2 = c10307.f28550;
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
        String str4 = c10307.f28535;
        if (str4 != null) {
            try {
                mediaFormat.setInteger("track-id", Integer.parseInt(str4));
            } catch (NumberFormatException unused) {
            }
        }
        String str5 = this.f8241;
        if (str5 != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaFormat.removeKey("codecs-string");
            }
            mediaFormat.setString("mime", str5);
        }
        Pair pairM44014 = C19322.m44014(c10307);
        if (pairM44014 != null && Build.VERSION.SDK_INT >= 23) {
            mediaFormat.setInteger("profile", ((Integer) pairM44014.first).intValue());
            mediaFormat.setInteger("level", ((Integer) pairM44014.second).intValue());
        }
        return mediaFormat;
    }

    public final String toString() {
        return "MediaExtractorSampleQueue: " + this.f8243 + ", isCompatibilityTrack: " + this.f8242 + ", compatibilityTrackMimeType: " + this.f8241;
    }
}
