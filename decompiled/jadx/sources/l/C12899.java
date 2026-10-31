package l;

import android.media.MediaFormat;
import android.os.Build;
import com.umeng.analytics.pro.am;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.۬ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C8IJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12899 {
    /* JADX WARN: Code duplicated, block: B:153:0x025e  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8353 m31336(MediaFormat mediaFormat) {
        String string;
        int i;
        int i2;
        float integer;
        C21054 c21054M18751;
        byte[] bArr;
        C1297 c1297 = new C1297();
        c1297.m4465(mediaFormat.getString("mime"));
        c1297.m4471(mediaFormat.getString(am.N));
        c1297.m4438(mediaFormat.containsKey("max-bitrate") ? mediaFormat.getInteger("max-bitrate") : -1);
        c1297.m4468(mediaFormat.containsKey("bitrate") ? mediaFormat.getInteger("bitrate") : -1);
        int i3 = 0;
        if (C11003.equals(mediaFormat.getString("mime"), "video/3gpp") && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) {
            int integer2 = mediaFormat.getInteger("profile");
            int integer3 = mediaFormat.getInteger("level");
            int i4 = C17839.f54488;
            String str = C3603.f11424;
            Locale locale = Locale.US;
            string = C18307.m42646("s263.", integer2, integer3, ".");
        } else if (C11003.equals(mediaFormat.getString("mime"), "video/dolby-vision") && mediaFormat.containsKey("profile") && mediaFormat.containsKey("level")) {
            int integer4 = mediaFormat.getInteger("profile");
            int i5 = C17839.f54488;
            if (integer4 == 1) {
                i = 0;
            } else if (integer4 == 2) {
                i = 1;
            } else if (integer4 == 4) {
                i = 2;
            } else if (integer4 == 8) {
                i = 3;
            } else if (integer4 == 16) {
                i = 4;
            } else if (integer4 == 32) {
                i = 5;
            } else if (integer4 == 64) {
                i = 6;
            } else if (integer4 == 128) {
                i = 7;
            } else if (integer4 == 256) {
                i = 8;
            } else if (integer4 == 512) {
                i = 9;
            } else {
                if (integer4 != 1024) {
                    throw new IllegalArgumentException(C19370.m44628(integer4, "Unknown Dolby Vision profile: "));
                }
                i = 10;
            }
            int integer5 = mediaFormat.getInteger("level");
            if (integer5 == 1) {
                i2 = 1;
            } else if (integer5 != 2) {
                switch (integer5) {
                    case 4:
                        i2 = 3;
                        break;
                    case 8:
                        i2 = 4;
                        break;
                    case 16:
                        i2 = 5;
                        break;
                    case 32:
                        i2 = 6;
                        break;
                    case 64:
                        i2 = 7;
                        break;
                    case 128:
                        i2 = 8;
                        break;
                    case 256:
                        i2 = 9;
                        break;
                    case 512:
                        i2 = 10;
                        break;
                    case 1024:
                        i2 = 11;
                        break;
                    case 2048:
                        i2 = 12;
                        break;
                    case 4096:
                        i2 = 13;
                        break;
                    default:
                        throw new IllegalArgumentException(C19370.m44628(integer5, "Unknown Dolby Vision level: "));
                }
            } else {
                i2 = 2;
            }
            if (i > 9) {
                Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str2 = C3603.f11424;
                string = String.format(Locale.US, "dvh1.%02d.%02d", objArr);
            } else if (i > 8) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str3 = C3603.f11424;
                string = String.format(Locale.US, "dvav.%02d.%02d", objArr2);
            } else {
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
                String str4 = C3603.f11424;
                string = String.format(Locale.US, "dvhe.%02d.%02d", objArr3);
            }
        } else {
            string = mediaFormat.containsKey("codecs-string") ? mediaFormat.getString("codecs-string") : null;
        }
        c1297.m4445(string);
        if (mediaFormat.containsKey("frame-rate")) {
            try {
                integer = mediaFormat.getFloat("frame-rate");
            } catch (ClassCastException unused) {
                integer = mediaFormat.getInteger("frame-rate");
            }
        } else {
            integer = -1.0f;
        }
        c1297.m4441(integer);
        c1297.m4453(mediaFormat.containsKey("width") ? mediaFormat.getInteger("width") : -1);
        c1297.m4457(mediaFormat.containsKey("height") ? mediaFormat.getInteger("height") : -1);
        c1297.m4460((mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) ? mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height") : 1.0f);
        c1297.m4451(mediaFormat.containsKey("max-input-size") ? mediaFormat.getInteger("max-input-size") : -1);
        c1297.m4439(mediaFormat.containsKey("rotation-degrees") ? mediaFormat.getInteger("rotation-degrees") : 0);
        if (Build.VERSION.SDK_INT >= 24) {
            int integer6 = mediaFormat.containsKey("color-standard") ? mediaFormat.getInteger("color-standard") : -1;
            int integer7 = mediaFormat.containsKey("color-range") ? mediaFormat.getInteger("color-range") : -1;
            int integer8 = mediaFormat.containsKey("color-transfer") ? mediaFormat.getInteger("color-transfer") : -1;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            if (byteBuffer != null) {
                bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
            } else {
                bArr = null;
            }
            if (integer6 != 2 && integer6 != 1 && integer6 != 6 && integer6 != -1) {
                integer6 = -1;
            }
            if (integer7 != 2 && integer7 != 1 && integer7 != -1) {
                integer7 = -1;
            }
            if (integer8 != 1 && integer8 != 3 && integer8 != 6 && integer8 != 7 && integer8 != -1) {
                integer8 = -1;
            }
            if (integer6 == -1 && integer7 == -1 && integer8 == -1 && bArr == null) {
                c21054M18751 = null;
            } else {
                C6942 c6942 = new C6942();
                c6942.m18755(integer6);
                c6942.m18754(integer7);
                c6942.m18757(integer8);
                c6942.m18753(bArr);
                c21054M18751 = c6942.m18751();
            }
        } else {
            c21054M18751 = null;
        }
        c1297.m4448(c21054M18751);
        c1297.m4456(mediaFormat.containsKey("sample-rate") ? mediaFormat.getInteger("sample-rate") : -1);
        c1297.m4472(mediaFormat.containsKey("channel-count") ? mediaFormat.getInteger("channel-count") : -1);
        c1297.m4475(mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : -1);
        C1846 c1846 = new C1846();
        while (true) {
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-" + i3);
            if (byteBuffer2 == null) {
                c1297.m4446((List) c1846.m6131());
                if (mediaFormat.containsKey("track-id")) {
                    c1297.m4467(mediaFormat.getInteger("track-id"));
                }
                return c1297.m4440();
            }
            byte[] bArr2 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr2);
            byteBuffer2.rewind();
            c1846.m16264(bArr2);
            i3++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31338(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(C19370.m44628(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31337(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31339(MediaFormat mediaFormat, C21054 c21054) {
        if (c21054 != null) {
            m31337(mediaFormat, "color-transfer", c21054.f67919);
            m31337(mediaFormat, "color-standard", c21054.f67917);
            m31337(mediaFormat, "color-range", c21054.f67915);
            byte[] bArr = c21054.f67916;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }
}
