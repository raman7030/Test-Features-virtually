package p067l;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.os.Build;

/* JADX INFO: renamed from: l.᩵ۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P79M */
/* JADX INFO: loaded from: classes4.dex */
public final class C20609 {
    /* JADX INFO: renamed from: ֫ */
    public static int m46565(Context context, AbstractC17043 abstractC17043) {
        int i;
        int i2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        C24139 c24139 = null;
        try {
            if (abstractC17043.m38646()) {
                mediaMetadataRetriever.setDataSource(abstractC17043.mo25495());
            } else if (abstractC17043.mo33653()) {
                mediaMetadataRetriever.setDataSource(context, abstractC17043.mo33652());
            } else if (Build.VERSION.SDK_INT >= 23) {
                C24139 c241310 = new C24139(abstractC17043);
                try {
                    mediaMetadataRetriever.setDataSource(c241310);
                    c24139 = c241310;
                } catch (Throwable unused) {
                    c24139 = c241310;
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Throwable unused2) {
                    }
                    C2700.m4192(c24139);
                    return -1;
                }
            } else {
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused3) {
                }
                return -1;
            }
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
            int i3 = 0;
            if (strExtractMetadata == null || strExtractMetadata.isEmpty()) {
                i = 0;
            } else {
                try {
                    i = Integer.parseInt(strExtractMetadata);
                } catch (NumberFormatException unused4) {
                    i = 0;
                }
            }
            int iMax = Math.max(i, 0);
            if (strExtractMetadata2 == null || strExtractMetadata2.isEmpty()) {
                i2 = 0;
            } else {
                try {
                    i2 = Integer.parseInt(strExtractMetadata2);
                } catch (NumberFormatException unused5) {
                    i2 = 0;
                }
            }
            int iMax2 = Math.max(i2, 0);
            if (strExtractMetadata3 != null && !strExtractMetadata3.isEmpty()) {
                try {
                    i3 = Integer.parseInt(strExtractMetadata3);
                } catch (NumberFormatException unused6) {
                }
            }
            int iM24944 = C10824.m24944(iMax, iMax2, i3, 1.0f);
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused7) {
            }
            C2700.m4192(c24139);
            return iM24944;
        } catch (Throwable unused8) {
        }
    }
}
