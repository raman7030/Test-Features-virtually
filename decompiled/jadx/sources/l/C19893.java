package l;

import android.net.Uri;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩶ۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 95KK */
/* JADX INFO: loaded from: classes4.dex */
public final class C19893 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45747(int i) {
        switch (i) {
            case 35:
                return 23;
            case 36:
            default:
                return -1;
            case 37:
                return 25;
            case 38:
                return 27;
            case 39:
                return 29;
            case 40:
                return 34;
            case 41:
                return 35;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m45757(ByteBuffer byteBuffer, boolean z) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m45758() {
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m45759(ByteBuffer byteBuffer) {
        throw null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m45756(int i, int i2, int i3) {
        m45750(i, i2, i3);
        return i3 >= 5 ? i2 : i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m45754(int i, int i2, int i3) {
        m45750(i, i2, i3);
        return i3 >= 5 ? i : i2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x000f. Please report as an issue. */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45751(int i, int i2, int i3, float[] fArr) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        m45750(i, i2, i3);
        if (fArr == null || fArr.length < 9) {
            throw new IllegalArgumentException("Matrix output must contain at least 9 elements");
        }
        float f6 = -1.0f;
        switch (i3) {
            case 2:
                f = 0.0f;
                f2 = i;
                f3 = 0.0f;
                f4 = 0.0f;
                f5 = 1.0f;
                break;
            case 3:
                float f7 = i2;
                f = 0.0f;
                f2 = i;
                f3 = f7;
                f4 = 0.0f;
                f5 = -1.0f;
                break;
            case 4:
                f3 = i2;
                f2 = 0.0f;
                f = 0.0f;
                f6 = 1.0f;
                f4 = 0.0f;
                f5 = -1.0f;
                break;
            case 5:
                f3 = 0.0f;
                f2 = 0.0f;
                f = 1.0f;
                f6 = 0.0f;
                f4 = 1.0f;
                f5 = 0.0f;
                break;
            case 6:
                f = -1.0f;
                f2 = i2;
                f3 = 0.0f;
                f6 = 0.0f;
                f4 = 1.0f;
                f5 = 0.0f;
                break;
            case 7:
                f2 = i2;
                f3 = i;
                f = -1.0f;
                f6 = 0.0f;
                f4 = -1.0f;
                f5 = 0.0f;
                break;
            case 8:
                f3 = i;
                f2 = 0.0f;
                f = 1.0f;
                f6 = 0.0f;
                f4 = -1.0f;
                f5 = 0.0f;
                break;
            default:
                f3 = 0.0f;
                f2 = 0.0f;
                f = 0.0f;
                f6 = 1.0f;
                f4 = 0.0f;
                f5 = 1.0f;
                break;
        }
        fArr[0] = f6;
        fArr[1] = f;
        fArr[2] = f2;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f3;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m45753(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m45755(C18241 c18241, int i, long j) {
        int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        int i2 = (iNumberOfLeadingZeros + 7) >> 3;
        c18241.m42517(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            c18241.m42517((byte) j);
            j >>= 8;
            i2--;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45750(int i, int i2, int i3) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Image dimensions must be positive");
        }
        if (i3 < 1 || i3 > 8) {
            throw new IllegalArgumentException("EXIF orientation must be between 1 and 8");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45752(C18241 c18241, int i, long j) {
        int iNumberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j);
        if (iNumberOfTrailingZeros == 0) {
            iNumberOfTrailingZeros = 1;
        }
        int i2 = (iNumberOfTrailingZeros + 7) >> 3;
        long j2 = j >> (64 - (i2 * 8));
        c18241.m42517(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            c18241.m42517((byte) j2);
            j2 >>= 8;
            i2--;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:136:0x01e6  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45749(String str) {
        byte b;
        if (str == null) {
            return -1;
        }
        String strM24800 = C9786.m24800(str);
        strM24800.getClass();
        switch (strM24800.hashCode()) {
            case -2123537834:
                if (!strM24800.equals("audio/eac3-joc")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1662384011:
                if (!strM24800.equals("video/mp2p")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -1662384007:
                if (!strM24800.equals("video/mp2t")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1662095187:
                if (!strM24800.equals("video/webm")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -1606874997:
                if (!strM24800.equals("audio/amr-wb")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case -1487656890:
                if (!strM24800.equals("image/avif")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case -1487464693:
                if (!strM24800.equals("image/heic")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case -1487464690:
                if (!strM24800.equals("image/heif")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case -1487394660:
                if (!strM24800.equals("image/jpeg")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case -1487018032:
                if (!strM24800.equals("image/webp")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case -1248337486:
                if (!strM24800.equals("application/mp4")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -1079884372:
                if (!strM24800.equals("video/x-msvideo")) {
                    b = -1;
                } else {
                    b = 11;
                }
                break;
            case -1004728940:
                if (!strM24800.equals("text/vtt")) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case -879272239:
                if (!strM24800.equals("image/bmp")) {
                    b = -1;
                } else {
                    b = cb.k;
                }
                break;
            case -879258763:
                if (!strM24800.equals("image/png")) {
                    b = -1;
                } else {
                    b = cb.f77931l;
                }
                break;
            case -387023398:
                if (!strM24800.equals("audio/x-matroska")) {
                    b = -1;
                } else {
                    b = 15;
                }
                break;
            case -43467528:
                if (!strM24800.equals("application/webm")) {
                    b = -1;
                } else {
                    b = 16;
                }
                break;
            case 13915911:
                if (!strM24800.equals("video/x-flv")) {
                    b = -1;
                } else {
                    b = 17;
                }
                break;
            case 187078296:
                if (!strM24800.equals("audio/ac3")) {
                    b = -1;
                } else {
                    b = 18;
                }
                break;
            case 187078297:
                if (!strM24800.equals("audio/ac4")) {
                    b = -1;
                } else {
                    b = 19;
                }
                break;
            case 187078669:
                if (!strM24800.equals("audio/amr")) {
                    b = -1;
                } else {
                    b = 20;
                }
                break;
            case 187090232:
                if (!strM24800.equals("audio/mp4")) {
                    b = -1;
                } else {
                    b = 21;
                }
                break;
            case 187091926:
                if (!strM24800.equals("audio/ogg")) {
                    b = -1;
                } else {
                    b = 22;
                }
                break;
            case 187099443:
                if (!strM24800.equals("audio/wav")) {
                    b = -1;
                } else {
                    b = 23;
                }
                break;
            case 1331848029:
                if (!strM24800.equals("video/mp4")) {
                    b = -1;
                } else {
                    b = 24;
                }
                break;
            case 1503095341:
                if (!strM24800.equals("audio/3gpp")) {
                    b = -1;
                } else {
                    b = 25;
                }
                break;
            case 1504578661:
                if (!strM24800.equals("audio/eac3")) {
                    b = -1;
                } else {
                    b = 26;
                }
                break;
            case 1504619009:
                if (!strM24800.equals("audio/flac")) {
                    b = -1;
                } else {
                    b = 27;
                }
                break;
            case 1504824762:
                if (!strM24800.equals("audio/midi")) {
                    b = -1;
                } else {
                    b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                }
                break;
            case 1504831518:
                if (!strM24800.equals("audio/mpeg")) {
                    b = -1;
                } else {
                    b = 29;
                }
                break;
            case 1505118770:
                if (!strM24800.equals("audio/webm")) {
                    b = -1;
                } else {
                    b = 30;
                }
                break;
            case 2039520277:
                if (!strM24800.equals("video/x-matroska")) {
                    b = -1;
                } else {
                    b = bo.j;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 18:
            case 26:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case 15:
            case 16:
            case 30:
            case 31:
                return 6;
            case 4:
            case 20:
            case 25:
                return 3;
            case 5:
                return 21;
            case 6:
            case 7:
                return 20;
            case 8:
                return 14;
            case 9:
                return 18;
            case 10:
            case 21:
            case 24:
                return 8;
            case 11:
                return 16;
            case 12:
                return 13;
            case 13:
                return 19;
            case 14:
                return 17;
            case 17:
                return 5;
            case 19:
                return 1;
            case 22:
                return 9;
            case 23:
                return 12;
            case 27:
                return 4;
            case 28:
                return 15;
            case 29:
                return 7;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45748(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }
}
