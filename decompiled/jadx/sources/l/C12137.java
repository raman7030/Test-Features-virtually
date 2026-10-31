package l;

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
public final class C12137 implements InterfaceC12842 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Closeable f36239;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final MediaMetadataRetriever f36240;

    @Override // l.InterfaceC12842
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo9070() {
        return false;
    }

    @Override // l.InterfaceC12842
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo9071() {
    }

    @Override // l.InterfaceC12842
    /* JADX INFO: renamed from: ֫ */
    public final Bitmap mo9068(long j, int i, int i2, InterfaceC19899 interfaceC19899) {
        interfaceC19899.mo21195();
        return m29565(this.f36240, j, i, i2);
    }

    public C12137(MediaMetadataRetriever mediaMetadataRetriever, Closeable closeable) {
        this.f36240 = mediaMetadataRetriever;
        this.f36239 = closeable;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC12842 m29563(Context context, C12053 c12053) {
        IOException th;
        MediaDataSource c22907;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                C2965 c2965M9066 = C2965.m9066(c12053);
                if (c2965M9066 != null) {
                    return c2965M9066;
                }
            } catch (IOException unused) {
            }
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        Closeable closeable = null;
        closeable = null;
        try {
            if (c12053.m29439()) {
                AbstractC15440 abstractC15440M29431 = c12053.m29431();
                if (abstractC15440M29431 == null) {
                    throw new IOException("Missing local preview file");
                }
                if (abstractC15440M29431.m36488()) {
                    mediaMetadataRetriever.setDataSource(abstractC15440M29431.mo23544());
                } else if (abstractC15440M29431.mo31568()) {
                    mediaMetadataRetriever.setDataSource(context, abstractC15440M29431.mo31567());
                } else if (Build.VERSION.SDK_INT >= 23) {
                    c22907 = new C22907(abstractC15440M29431);
                    try {
                        mediaMetadataRetriever.setDataSource(c22907);
                        closeable = c22907;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Throwable unused2) {
                        }
                        C0349.m1793(c22907);
                        if (th instanceof IOException) {
                            throw th;
                        }
                        throw new IOException("Failed to open video preview data source", th);
                    }
                } else {
                    throw new IOException("Unsupported video preview data source");
                }
                return new C12137(mediaMetadataRetriever, closeable);
            }
            if (c12053.m29436() && Build.VERSION.SDK_INT >= 23) {
                C22636 c22636M29434 = c12053.m29434();
                if (c22636M29434 == null) {
                    throw new IOException("Missing network preview descriptor");
                }
                C13463 c13463M50640 = c22636M29434.m50640();
                c13463M50640.m32483(mediaMetadataRetriever);
                closeable = c13463M50640;
            } else if (c12053.m29441() && Build.VERSION.SDK_INT >= 23) {
                InterfaceC7505 interfaceC7505M29433 = c12053.m29433();
                if (interfaceC7505M29433 == null) {
                    throw new IOException("Missing paged preview handle");
                }
                C6282 c6282 = new C6282(interfaceC7505M29433);
                try {
                    mediaMetadataRetriever.setDataSource(c6282);
                    c6282.m17327();
                    closeable = c6282;
                } catch (Throwable th3) {
                    th = th3;
                    c22907 = c6282;
                    mediaMetadataRetriever.release();
                    C0349.m1793(c22907);
                    if (th instanceof IOException) {
                        throw th;
                    }
                    throw new IOException("Failed to open video preview data source", th);
                }
            } else {
                throw new IOException("Unsupported video preview data source");
            }
            return new C12137(mediaMetadataRetriever, closeable);
        } catch (Throwable th4) {
            th = th4;
            c22907 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bitmap m29565(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2) {
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

    @Override // l.InterfaceC12842
    /* JADX INFO: renamed from: ᩳ */
    public final C13547 mo9072() {
        return m29566(this.f36240);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13547 m29566(MediaMetadataRetriever mediaMetadataRetriever) {
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
        return C1841.m6125(iMax, iMax2, i3, 1.0f);
    }

    @Override // l.InterfaceC12842
    /* JADX INFO: renamed from: ֫ */
    public final void mo9069() {
        try {
            this.f36240.release();
        } catch (Throwable unused) {
        }
        C0349.m1793(this.f36239);
    }
}
