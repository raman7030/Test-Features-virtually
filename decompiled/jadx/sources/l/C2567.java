package l;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۖܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6K0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2567 extends MediaDataSource {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 f8111;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream f8112;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f8114;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16677 f8115;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC3163 f8116;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final MediaDataSource f8117;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21184 f8119;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f8120;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f8118 = SystemClock.elapsedRealtime() + 2500;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f8113 = X931RNG.BLOCK128_RESEED_MAX;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f8120) {
            return;
        }
        this.f8120 = true;
        try {
            MediaDataSource mediaDataSource = this.f8117;
            if (mediaDataSource != null) {
                mediaDataSource.close();
            }
            InputStream inputStream = this.f8112;
            if (inputStream != null) {
                inputStream.close();
            }
            C16677 c16677 = this.f8115;
            if (c16677 != null) {
                c16677.close();
            }
        } catch (Throwable th) {
            C16677 c16678 = this.f8115;
            if (c16678 != null) {
                c16678.close();
            }
            throw th;
        }
    }

    @Override // android.media.MediaDataSource
    public final synchronized int readAt(long j, byte[] bArr, int i, int i2) {
        int at;
        AbstractC22967.m51107(this.f8119);
        if (this.f8120 || this.f8113 <= 0 || SystemClock.elapsedRealtime() > this.f8118) {
            throw new IOException("Video poster read limit reached");
        }
        if (i2 == 0) {
            return 0;
        }
        int iMin = (int) Math.min(i2, this.f8113);
        MediaDataSource mediaDataSource = this.f8117;
        if (mediaDataSource != null) {
            at = mediaDataSource.readAt(j, bArr, i, iMin);
        } else {
            InputStream inputStream = this.f8112;
            if (inputStream == null || j != this.f8114) {
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f8112 = null;
                this.f8112 = this.f8116.mo9681(j, this.f8111.getPath());
                this.f8114 = j;
            }
            at = this.f8112.read(bArr, i, iMin);
            if (at > 0) {
                this.f8114 += (long) at;
            }
        }
        if (at > 0) {
            this.f8113 -= (long) at;
        }
        AbstractC22967.m51107(this.f8119);
        return at;
    }

    public C2567(C22907 c22907, C16677 c16677, InterfaceC17889 interfaceC17889, C21184 c21184) {
        this.f8117 = c22907;
        this.f8115 = c16677;
        this.f8116 = c16677 == null ? null : (AbstractC3163) c16677.f51187;
        this.f8111 = interfaceC17889;
        this.f8119 = c21184;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2567 m8112(MediaMetadataRetriever mediaMetadataRetriever, AbstractC15440 abstractC15440, C21184 c21184) {
        C2567 c2567 = new C2567(new C22907(abstractC15440), null, null, c21184);
        try {
            mediaMetadataRetriever.setDataSource(c2567);
            return c2567;
        } catch (RuntimeException e) {
            c2567.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2567 m8111(MediaMetadataRetriever mediaMetadataRetriever, AbstractC3163 abstractC3163, InterfaceC17889 interfaceC17889, C21184 c21184) {
        C2567 c2567 = new C2567(null, new C16677(abstractC3163), interfaceC17889, c21184);
        try {
            mediaMetadataRetriever.setDataSource(c2567);
            return c2567;
        } catch (RuntimeException e) {
            c2567.close();
            throw e;
        }
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        MediaDataSource mediaDataSource = this.f8117;
        return mediaDataSource != null ? mediaDataSource.getSize() : this.f8111.getSize();
    }
}
