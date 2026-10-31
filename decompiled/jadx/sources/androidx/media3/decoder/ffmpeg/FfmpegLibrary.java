package androidx.media3.decoder.ffmpeg;

import com.umeng.analytics.pro.cb;
import l.AbstractC0199;
import l.C16840;
import l.C19956;
import l.C23253;
import l.C8353;

/* JADX INFO: loaded from: classes.dex */
public final class FfmpegLibrary {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC0199 f11;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int f12;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String f13;

    public static native int ffmpegGetInputBufferPaddingSize();

    public static native String ffmpegGetVersion();

    public static native boolean ffmpegHasDecoder(String str);

    static {
        C16840.m39615("media3.decoder.ffmpeg");
        f11 = new C23253("ffmpegJNI");
        f12 = -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m18() {
        if (!f11.m1360()) {
            return -1;
        }
        if (f12 == -1) {
            f12 = ffmpegGetInputBufferPaddingSize();
        }
        return f12;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m20() {
        if (!f11.m1360()) {
            return null;
        }
        if (f13 == null) {
            f13 = ffmpegGetVersion();
        }
        return f13;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m21(C8353 c8353) {
        String strM19;
        if (!f11.m1360() || (strM19 = m19(c8353)) == null) {
            return false;
        }
        if (ffmpegHasDecoder(strM19)) {
            return true;
        }
        C19956.m46037("No " + strM19 + " decoder available. Check the FFmpeg build configuration.");
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m22() {
        return f11.m1360();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m19(C8353 c8353) {
        String str = c8353.f25614;
        if (str == null) {
            return null;
        }
        byte b = -1;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    b = 0;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    b = 1;
                }
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    b = 2;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    b = 3;
                }
                break;
            case -1003765268:
                if (str.equals("audio/vorbis")) {
                    b = 4;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    b = 5;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    b = 6;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    b = 7;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    b = 8;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    b = 9;
                }
                break;
            case 1503095341:
                if (str.equals("audio/3gpp")) {
                    b = 10;
                }
                break;
            case 1504470054:
                if (str.equals("audio/alac")) {
                    b = 11;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    b = 12;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    b = cb.k;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    b = cb.f77931l;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    b = 15;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    b = 16;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    b = 17;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    b = 18;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    b = 19;
                }
                break;
        }
        switch (b) {
            case 0:
            case 12:
                return "eac3";
            case 1:
                return "hevc";
            case 2:
                return "amrwb";
            case 3:
            case 16:
                return "dca";
            case 4:
                return "vorbis";
            case 5:
            case 6:
            case 14:
                return "mp3";
            case 7:
                return "aac";
            case 8:
                return "ac3";
            case 9:
                return "h264";
            case 10:
                return "amrnb";
            case 11:
                return "alac";
            case 13:
                return "flac";
            case 15:
                return "opus";
            case 17:
                return "truehd";
            case 18:
                return "pcm_alaw";
            case 19:
                return "pcm_mulaw";
            default:
                return null;
        }
    }
}
