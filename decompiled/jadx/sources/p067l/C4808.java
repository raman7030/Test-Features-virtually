package p067l;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۖܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6K0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4808 extends MediaDataSource {

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC19370 f10901;

    /* JADX INFO: renamed from: ۙ */
    public InputStream f10902;

    /* JADX INFO: renamed from: ۤ */
    public long f10904;

    /* JADX INFO: renamed from: ۨ */
    public final C18218 f10905;

    /* JADX INFO: renamed from: ۫ */
    public final AbstractC5375 f10906;

    /* JADX INFO: renamed from: ۬ */
    public final MediaDataSource f10907;

    /* JADX INFO: renamed from: ᩸ */
    public final C22502 f10909;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f10910;

    /* JADX INFO: renamed from: ᩶ */
    public final long f10908 = SystemClock.elapsedRealtime() + 2500;

    /* JADX INFO: renamed from: ۛ */
    public long f10903 = X931RNG.BLOCK128_RESEED_MAX;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f10910) {
            return;
        }
        this.f10910 = true;
        try {
            MediaDataSource mediaDataSource = this.f10907;
            if (mediaDataSource != null) {
                mediaDataSource.close();
            }
            InputStream inputStream = this.f10902;
            if (inputStream != null) {
                inputStream.close();
            }
            C18218 c18218 = this.f10905;
            if (c18218 != null) {
                c18218.close();
            }
        } catch (Throwable th) {
            C18218 c18219 = this.f10905;
            if (c18219 != null) {
                c18219.close();
            }
            throw th;
        }
    }

    @Override // android.media.MediaDataSource
    public final synchronized int readAt(long j, byte[] bArr, int i, int i2) {
        int at;
        AbstractC24196.m53499(this.f10909);
        if (this.f10910 || this.f10903 <= 0 || SystemClock.elapsedRealtime() > this.f10908) {
            throw new IOException("Video poster read limit reached");
        }
        if (i2 == 0) {
            return 0;
        }
        int iMin = (int) Math.min(i2, this.f10903);
        MediaDataSource mediaDataSource = this.f10907;
        if (mediaDataSource != null) {
            at = mediaDataSource.readAt(j, bArr, i, iMin);
        } else {
            InputStream inputStream = this.f10902;
            if (inputStream == null || j != this.f10904) {
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f10902 = null;
                this.f10902 = this.f10906.mo11725(j, this.f10901.getPath());
                this.f10904 = j;
            }
            at = this.f10902.read(bArr, i, iMin);
            if (at > 0) {
                this.f10904 += (long) at;
            }
        }
        if (at > 0) {
            this.f10903 -= (long) at;
        }
        AbstractC24196.m53499(this.f10909);
        return at;
    }

    public C4808(C24139 c24139, C18218 c18218, InterfaceC19370 interfaceC19370, C22502 c22502) {
        this.f10907 = c24139;
        this.f10905 = c18218;
        this.f10906 = c18218 == null ? null : (AbstractC5375) c18218.f54372;
        this.f10901 = interfaceC19370;
        this.f10909 = c22502;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4808 m10145(MediaMetadataRetriever mediaMetadataRetriever, AbstractC17043 abstractC17043, C22502 c22502) {
        C4808 c4808 = new C4808(new C24139(abstractC17043), null, null, c22502);
        try {
            mediaMetadataRetriever.setDataSource(c4808);
            return c4808;
        } catch (RuntimeException e) {
            c4808.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4808 m10144(MediaMetadataRetriever mediaMetadataRetriever, AbstractC5375 abstractC5375, InterfaceC19370 interfaceC19370, C22502 c22502) {
        C4808 c4808 = new C4808(null, new C18218(abstractC5375), interfaceC19370, c22502);
        try {
            mediaMetadataRetriever.setDataSource(c4808);
            return c4808;
        } catch (RuntimeException e) {
            c4808.close();
            throw e;
        }
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        MediaDataSource mediaDataSource = this.f10907;
        return mediaDataSource != null ? mediaDataSource.getSize() : this.f10901.getSize();
    }
}
