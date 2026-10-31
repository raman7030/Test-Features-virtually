package l;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.os.Build;

/* JADX INFO: renamed from: l.᩵ۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P79M */
/* JADX INFO: loaded from: classes4.dex */
public final class C19193 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m44270(Context context, AbstractC15440 abstractC15440) {
        int i;
        int i2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        C22907 c22907 = null;
        try {
            if (abstractC15440.m36488()) {
                mediaMetadataRetriever.setDataSource(abstractC15440.mo23544());
            } else if (abstractC15440.mo31568()) {
                mediaMetadataRetriever.setDataSource(context, abstractC15440.mo31567());
            } else if (Build.VERSION.SDK_INT >= 23) {
                C22907 c22908 = new C22907(abstractC15440);
                try {
                    mediaMetadataRetriever.setDataSource(c22908);
                    c22907 = c22908;
                } catch (Throwable unused) {
                    c22907 = c22908;
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Throwable unused2) {
                    }
                    C0349.m1793(c22907);
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
            int iM22973 = C8897.m22973(iMax, iMax2, i3, 1.0f);
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused7) {
            }
            C0349.m1793(c22907);
            return iM22973;
        } catch (Throwable unused8) {
        }
    }
}
