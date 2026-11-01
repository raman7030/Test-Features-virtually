package p067l;

import com.github.luben.zstd.Zstd;
import com.github.luben.zstd.ZstdCompressCtx;
import com.github.luben.zstd.ZstdDecompressCtx;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.۬ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6WV */
/* JADX INFO: loaded from: classes3.dex */
public final class C14679 {

    /* JADX INFO: renamed from: ۜ */
    public static final C2582 f41896 = new C2582(3);

    /* JADX INFO: renamed from: ᩷ */
    public static final C2582 f41897 = new C2582(3);

    /* JADX INFO: renamed from: ۧ */
    public int f41899;

    /* JADX INFO: renamed from: ܿ */
    public int f41902;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f41903;

    /* JADX INFO: renamed from: ܳ */
    public final C2864 f41900 = new C2864();

    /* JADX INFO: renamed from: ܽ */
    public final OutputStream f41901 = new C5292(this);

    /* JADX INFO: renamed from: ᩻ */
    public final byte[] f41904 = new byte[65536];

    /* JADX INFO: renamed from: ֫ */
    public byte[] f41898 = new byte[0];

    /* JADX INFO: renamed from: ܿ */
    public final C15230 m33606() {
        this.f41900.m4599();
        this.f41902 = 0;
        this.f41899 = 0;
        this.f41903 = false;
        return new C15230(new C5173(this.f41904, this.f41901));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m33607() {
        return this.f41903 || this.f41900.f4950 > 8388608;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m33599(C14679 c14679) {
        c14679.f41903 = true;
        C2864 c2864 = c14679.f41900;
        c2864.m4599();
        c2864.f4949 = new byte[0];
    }

    /* JADX INFO: renamed from: ۜ */
    public static ZstdCompressCtx m33597() {
        ZstdCompressCtx zstdCompressCtx = (ZstdCompressCtx) f41896.m3892();
        if (zstdCompressCtx != null) {
            return zstdCompressCtx;
        }
        ZstdCompressCtx zstdCompressCtx2 = new ZstdCompressCtx();
        try {
            return zstdCompressCtx2.setLevel(3).setChecksum(true).setContentSize(true).loadDict(C14009.m31813());
        } catch (IOException | RuntimeException e) {
            C2700.m4192(zstdCompressCtx2);
            throw new IllegalStateException("Unable to initialize smali cache compressor", e);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public static ZstdDecompressCtx m33600() {
        ZstdDecompressCtx zstdDecompressCtx = (ZstdDecompressCtx) f41897.m3892();
        if (zstdDecompressCtx != null) {
            return zstdDecompressCtx;
        }
        ZstdDecompressCtx zstdDecompressCtx2 = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx2.loadDict(C14009.m31813());
        } catch (IOException | RuntimeException e) {
            C2700.m4192(zstdDecompressCtx2);
            throw new IllegalStateException("Unable to initialize smali cache decompressor", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33595(C2582 c2582, AutoCloseable autoCloseable, boolean z) {
        if (autoCloseable != null) {
            if (z && c2582.m3890(autoCloseable)) {
                return;
            }
            C2700.m4192(autoCloseable);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33601() throws IOException {
        C2582 c2582 = f41896;
        C2864 c2864 = this.f41900;
        int i = c2864.f4950;
        this.f41902 = i;
        this.f41899 = 0;
        if (this.f41903 || i > 8388608) {
            throw new IOException("Smali cache content is too large");
        }
        try {
            try {
                long jCompressBound = Zstd.compressBound(i);
                if (jCompressBound < 0 || jCompressBound > 2147483639) {
                    throw new IOException("Smali cache compressed buffer is too large");
                }
                if (this.f41898.length < jCompressBound) {
                    this.f41898 = new byte[(int) jCompressBound];
                }
                ZstdCompressCtx zstdCompressCtxM33597 = m33597();
                byte[] bArr = this.f41898;
                int iCompressByteArray = zstdCompressCtxM33597.compressByteArray(bArr, 0, bArr.length, c2864.f4949, 0, this.f41902);
                this.f41899 = iCompressByteArray;
                byte[] bArr2 = this.f41898;
                if (!(iCompressByteArray >= 5 && (4 & bArr2[4]) != 0) || Zstd.getDictIdFromFrame(bArr2) != 1773473561 || Zstd.getFrameContentSize(this.f41898, 0, this.f41899) != this.f41902 || Zstd.findFrameCompressedSize(this.f41898, 0, this.f41899) != this.f41899) {
                    throw new IOException("Invalid compressed smali cache frame");
                }
                m33595(c2582, (AutoCloseable) zstdCompressCtxM33597, true);
            } catch (RuntimeException e) {
                throw new IOException("Failed to compress smali cache", e);
            }
        } catch (Throwable th) {
            m33595(c2582, (AutoCloseable) null, false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33602(int i, int i2, byte[] bArr) throws Throwable {
        C2582 c2582 = f41897;
        C2864 c2864 = this.f41900;
        c2864.m4599();
        this.f41902 = 0;
        this.f41903 = false;
        if (i >= 0 && i2 > 0) {
            long j = i2;
            if (((long) i) + j <= bArr.length) {
                if (i2 < 5 || (bArr[i + 4] & 4) == 0) {
                    throw new IOException("Smali cache frame checksum is missing");
                }
                ZstdDecompressCtx zstdDecompressCtx = null;
                try {
                    try {
                        long jFindFrameCompressedSize = Zstd.findFrameCompressedSize(bArr, i, i2);
                        if (Zstd.isError(jFindFrameCompressedSize) || jFindFrameCompressedSize != j) {
                            throw new IOException("Smali cache frame length is invalid");
                        }
                        long frameContentSize = Zstd.getFrameContentSize(bArr, i, i2);
                        if (frameContentSize < 0 || frameContentSize > X931RNG.BLOCK128_RESEED_MAX) {
                            throw new IOException("Smali cache content size is invalid");
                        }
                        int i3 = (int) frameContentSize;
                        if (c2864.f4949.length < i3) {
                            c2864.f4949 = new byte[i3];
                        }
                        ZstdDecompressCtx zstdDecompressCtxM33600 = m33600();
                        try {
                            if (zstdDecompressCtxM33600.decompressByteArray(c2864.f4949, 0, i3, bArr, i, i2) != i3) {
                                throw new IOException("Smali cache decompressed length is invalid");
                            }
                            this.f41902 = i3;
                            m33595(c2582, (AutoCloseable) zstdDecompressCtxM33600, true);
                            return;
                        } catch (RuntimeException e) {
                            e = e;
                            throw new IOException("Failed to decompress smali cache", e);
                        } catch (Throwable th) {
                            th = th;
                            zstdDecompressCtx = zstdDecompressCtxM33600;
                            m33595(c2582, (AutoCloseable) zstdDecompressCtx, false);
                            throw th;
                        }
                    } catch (RuntimeException e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        throw new IOException("Smali cache frame range is invalid");
    }

    /* JADX INFO: renamed from: ܳ */
    public final byte[] m33604() {
        return this.f41900.f4949;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m33608() {
        return this.f41902;
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte[] m33603() {
        return this.f41898;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m33605() {
        return this.f41899;
    }
}
