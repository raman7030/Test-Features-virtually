package p067l;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.۫ۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13903 implements InterfaceC14573 {

    /* JADX INFO: renamed from: ֫ */
    public final Closeable f39251;

    /* JADX INFO: renamed from: ۧ */
    public final MediaMetadataRetriever f39252;

    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo11122() {
        return false;
    }

    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo11123() {
    }

    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ֫ */
    public final Bitmap mo11120(long j, int i, int i2, InterfaceC21280 interfaceC21280) {
        interfaceC21280.mo23161();
        return m31630(this.f39252, j, i, i2);
    }

    public C13903(MediaMetadataRetriever mediaMetadataRetriever, Closeable closeable) {
        this.f39252 = mediaMetadataRetriever;
        this.f39251 = closeable;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC14573 m31628(Context context, C13823 c13823) {
        IOException th;
        MediaDataSource c24139;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                C5186 c5186M11118 = C5186.m11118(c13823);
                if (c5186M11118 != null) {
                    return c5186M11118;
                }
            } catch (IOException unused) {
            }
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        Closeable closeable = null;
        closeable = null;
        try {
            if (c13823.m31501()) {
                AbstractC17043 abstractC17043M31493 = c13823.m31493();
                if (abstractC17043M31493 == null) {
                    throw new IOException("Missing local preview file");
                }
                if (abstractC17043M31493.m38646()) {
                    mediaMetadataRetriever.setDataSource(abstractC17043M31493.mo25495());
                } else if (abstractC17043M31493.mo33653()) {
                    mediaMetadataRetriever.setDataSource(context, abstractC17043M31493.mo33652());
                } else if (Build.VERSION.SDK_INT >= 23) {
                    c24139 = new C24139(abstractC17043M31493);
                    try {
                        mediaMetadataRetriever.setDataSource(c24139);
                        closeable = c24139;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Throwable unused2) {
                        }
                        C2700.m4192(c24139);
                        if (th instanceof IOException) {
                            throw th;
                        }
                        throw new IOException("Failed to open video preview data source", th);
                    }
                } else {
                    throw new IOException("Unsupported video preview data source");
                }
                return new C13903(mediaMetadataRetriever, closeable);
            }
            if (c13823.m31498() && Build.VERSION.SDK_INT >= 23) {
                C23881 c23881M31496 = c13823.m31496();
                if (c23881M31496 == null) {
                    throw new IOException("Missing network preview descriptor");
                }
                C15163 c15163M52966 = c23881M31496.m52966();
                c15163M52966.m34585(mediaMetadataRetriever);
                closeable = c15163M52966;
            } else if (c13823.m31503() && Build.VERSION.SDK_INT >= 23) {
                InterfaceC9501 interfaceC9501M31495 = c13823.m31495();
                if (interfaceC9501M31495 == null) {
                    throw new IOException("Missing paged preview handle");
                }
                C8339 c8339 = new C8339(interfaceC9501M31495);
                try {
                    mediaMetadataRetriever.setDataSource(c8339);
                    c8339.m19266();
                    closeable = c8339;
                } catch (Throwable th3) {
                    th = th3;
                    c24139 = c8339;
                    mediaMetadataRetriever.release();
                    C2700.m4192(c24139);
                    if (th instanceof IOException) {
                        throw th;
                    }
                    throw new IOException("Failed to open video preview data source", th);
                }
            } else {
                throw new IOException("Unsupported video preview data source");
            }
            return new C13903(mediaMetadataRetriever, closeable);
        } catch (Throwable th4) {
            th = th4;
            c24139 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static Bitmap m31630(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 27) {
            return mediaMetadataRetriever.getScaledFrameAtTime(j, 2, Math.max(1, i), Math.max(1, i2));
        }
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 2);
        if (frameAtTime == null) {
            return null;
        }
        int iMax = Math.max(1, i);
        int iMax2 = Math.max(1, i2);
        if (frameAtTime.getWidth() <= iMax && frameAtTime.getHeight() <= iMax2) {
            return frameAtTime;
        }
        float fMin = Math.min(iMax / frameAtTime.getWidth(), iMax2 / frameAtTime.getHeight());
        return Bitmap.createScaledBitmap(frameAtTime, Math.max(1, Math.round(frameAtTime.getWidth() * fMin)), Math.max(1, Math.round(frameAtTime.getHeight() * fMin)), true);
    }

    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ᩳ */
    public final C15243 mo11124() {
        return m31631(this.f39252);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C15243 m31631(MediaMetadataRetriever mediaMetadataRetriever) {
        int i;
        int i2;
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
        int i3 = 0;
        if (strExtractMetadata == null || strExtractMetadata.isEmpty()) {
            i = 0;
        } else {
            try {
                i = Integer.parseInt(strExtractMetadata);
            } catch (NumberFormatException unused) {
                i = 0;
            }
        }
        int iMax = Math.max(0, i);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
        if (strExtractMetadata2 == null || strExtractMetadata2.isEmpty()) {
            i2 = 0;
        } else {
            try {
                i2 = Integer.parseInt(strExtractMetadata2);
            } catch (NumberFormatException unused2) {
                i2 = 0;
            }
        }
        int iMax2 = Math.max(0, i2);
        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
        if (strExtractMetadata3 != null && !strExtractMetadata3.isEmpty()) {
            try {
                i3 = Integer.parseInt(strExtractMetadata3);
            } catch (NumberFormatException unused3) {
            }
        }
        return C4118.m8323(iMax, iMax2, i3, 1.0f);
    }

    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ֫ */
    public final void mo11121() {
        try {
            this.f39252.release();
        } catch (Throwable unused) {
        }
        C2700.m4192(this.f39251);
    }
}
