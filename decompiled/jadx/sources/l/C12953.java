package l;

import com.github.luben.zstd.Zstd;
import com.github.luben.zstd.ZstdCompressCtx;
import com.github.luben.zstd.ZstdDecompressCtx;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.۬ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6WV */
/* JADX INFO: loaded from: classes3.dex */
public final class C12953 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C0225 f38852 = new C0225(3);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C0225 f38853 = new C0225(3);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f38855;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f38858;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f38859;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C0521 f38856 = new C0521();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final OutputStream f38857 = new C3076(this);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final byte[] f38860 = new byte[65536];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f38854 = new byte[0];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13533 m31519() {
        this.f38856.m2232();
        this.f38858 = 0;
        this.f38855 = 0;
        this.f38859 = false;
        return new C13533(new C2951(this.f38860, this.f38857));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m31520() {
        return this.f38859 || this.f38856.f2177 > 8388608;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m31512(C12953 c12953) {
        c12953.f38859 = true;
        C0521 c0521 = c12953.f38856;
        c0521.m2232();
        c0521.f2176 = new byte[0];
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static ZstdCompressCtx m31510() {
        ZstdCompressCtx zstdCompressCtx = (ZstdCompressCtx) f38852.m1479();
        if (zstdCompressCtx != null) {
            return zstdCompressCtx;
        }
        ZstdCompressCtx zstdCompressCtx2 = new ZstdCompressCtx();
        try {
            return zstdCompressCtx2.setLevel(3).setChecksum(true).setContentSize(true).loadDict(C12248.m29751());
        } catch (IOException | RuntimeException e) {
            C0349.m1793(zstdCompressCtx2);
            throw new IllegalStateException("Unable to initialize smali cache compressor", e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ZstdDecompressCtx m31513() {
        ZstdDecompressCtx zstdDecompressCtx = (ZstdDecompressCtx) f38853.m1479();
        if (zstdDecompressCtx != null) {
            return zstdDecompressCtx;
        }
        ZstdDecompressCtx zstdDecompressCtx2 = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx2.loadDict(C12248.m29751());
        } catch (IOException | RuntimeException e) {
            C0349.m1793(zstdDecompressCtx2);
            throw new IllegalStateException("Unable to initialize smali cache decompressor", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31508(C0225 c0225, AutoCloseable autoCloseable, boolean z) {
        if (autoCloseable != null) {
            if (z && c0225.m1477(autoCloseable)) {
                return;
            }
            C0349.m1793(autoCloseable);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31514() throws IOException {
        C0225 c0225 = f38852;
        C0521 c0521 = this.f38856;
        int i = c0521.f2177;
        this.f38858 = i;
        this.f38855 = 0;
        if (this.f38859 || i > 8388608) {
            throw new IOException("Smali cache content is too large");
        }
        try {
            try {
                long jCompressBound = Zstd.compressBound(i);
                if (jCompressBound < 0 || jCompressBound > 2147483639) {
                    throw new IOException("Smali cache compressed buffer is too large");
                }
                if (this.f38854.length < jCompressBound) {
                    this.f38854 = new byte[(int) jCompressBound];
                }
                ZstdCompressCtx zstdCompressCtxM31510 = m31510();
                byte[] bArr = this.f38854;
                int iCompressByteArray = zstdCompressCtxM31510.compressByteArray(bArr, 0, bArr.length, c0521.f2176, 0, this.f38858);
                this.f38855 = iCompressByteArray;
                byte[] bArr2 = this.f38854;
                if (!(iCompressByteArray >= 5 && (4 & bArr2[4]) != 0) || Zstd.getDictIdFromFrame(bArr2) != 1773473561 || Zstd.getFrameContentSize(this.f38854, 0, this.f38855) != this.f38858 || Zstd.findFrameCompressedSize(this.f38854, 0, this.f38855) != this.f38855) {
                    throw new IOException("Invalid compressed smali cache frame");
                }
                m31508(c0225, (AutoCloseable) zstdCompressCtxM31510, true);
            } catch (RuntimeException e) {
                throw new IOException("Failed to compress smali cache", e);
            }
        } catch (Throwable th) {
            m31508(c0225, (AutoCloseable) null, false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31515(int i, int i2, byte[] bArr) throws Throwable {
        C0225 c0225 = f38853;
        C0521 c0521 = this.f38856;
        c0521.m2232();
        this.f38858 = 0;
        this.f38859 = false;
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
                        if (c0521.f2176.length < i3) {
                            c0521.f2176 = new byte[i3];
                        }
                        ZstdDecompressCtx zstdDecompressCtxM31513 = m31513();
                        try {
                            if (zstdDecompressCtxM31513.decompressByteArray(c0521.f2176, 0, i3, bArr, i, i2) != i3) {
                                throw new IOException("Smali cache decompressed length is invalid");
                            }
                            this.f38858 = i3;
                            m31508(c0225, (AutoCloseable) zstdDecompressCtxM31513, true);
                            return;
                        } catch (RuntimeException e) {
                            e = e;
                            throw new IOException("Failed to decompress smali cache", e);
                        } catch (Throwable th) {
                            th = th;
                            zstdDecompressCtx = zstdDecompressCtxM31513;
                            m31508(c0225, (AutoCloseable) zstdDecompressCtx, false);
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

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m31517() {
        return this.f38856.f2176;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m31521() {
        return this.f38858;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m31516() {
        return this.f38854;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m31518() {
        return this.f38855;
    }
}
