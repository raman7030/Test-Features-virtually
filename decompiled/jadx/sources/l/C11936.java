package l;

import com.alipay.sdk.m.w.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.ۨ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6TW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11936 extends Reader {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f35685;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CharsetDecoder f35686;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f35687;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f35688;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f35689;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public CharBuffer f35690;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f35691;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f35692;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile InputStream f35693;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f35694;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f35695;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f35696;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C5377 f35697;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11936 m29120(InputStream inputStream, Charset charset, C1143 c1143) {
        return m29121(inputStream, charset, c1143, true, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11936 m29122(InputStream inputStream, C1143 c1143) {
        return m29121(inputStream, StandardCharsets.UTF_8, c1143, false, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11936 m29121(InputStream inputStream, Charset charset, C1143 c1143, boolean z, boolean z2) {
        C11003.requireNonNull(inputStream);
        if (z2) {
            try {
                if (c1143.m3930() - c1143.m3931() >= 33344) {
                    try {
                        return new C11936(inputStream, charset, c1143, 8192, 4096, z);
                    } catch (C3966 unused) {
                    }
                }
            } catch (Error | RuntimeException e) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
                throw e;
            }
        }
        return new C11936(inputStream, charset, c1143, 1024, 512, z);
    }

    public C11936(InputStream inputStream, Charset charset, C1143 c1143, int i, int i2, boolean z) {
        if (i < 4 || i > 65536 || i2 < 2 || i2 > 32768) {
            throw new IllegalArgumentException("Invalid decoder buffer sizes");
        }
        C11003.requireNonNull(charset);
        this.f35696 = charset.name();
        this.f35688 = z;
        C5377 c5377M3921 = c1143.m3921(((((long) i) + 23) & (-8)) + 256 + (((((long) i2) * 2) + 23) & (-8)));
        try {
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.f35686 = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
            this.f35689 = byteBufferAllocate;
            byteBufferAllocate.limit(0);
            CharBuffer charBufferAllocate = CharBuffer.allocate(i2);
            this.f35690 = charBufferAllocate;
            charBufferAllocate.limit(0);
            this.f35693 = inputStream;
            this.f35697 = c5377M3921;
        } catch (Error | RuntimeException e) {
            c5377M3921.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m29126() {
        return this.f35695;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m29125() throws IOException {
        int i;
        if (this.f35692) {
            return false;
        }
        if (!this.f35691) {
            byte[] bArrArray = this.f35689.array();
            int i2 = 0;
            while (true) {
                i = 4;
                if (i2 >= 4) {
                    break;
                }
                int iM29124 = m29124(i2, 4 - i2, bArrArray);
                if (iM29124 == -1) {
                    this.f35687 = true;
                    break;
                }
                i2 += iM29124;
            }
            this.f35689.limit(i2);
            String str = this.f35696;
            if (str.equalsIgnoreCase(a.D) && m29123(bArrArray, i2, 239, 187, 191)) {
                i = 3;
            } else if ((str.equalsIgnoreCase("UTF-16BE") && m29123(bArrArray, i2, Scalar25519.TARGET_LENGTH, 255)) || (str.equalsIgnoreCase("UTF-16LE") && m29123(bArrArray, i2, 255, Scalar25519.TARGET_LENGTH))) {
                i = 2;
            } else if ((!str.equalsIgnoreCase("UTF-32BE") || !m29123(bArrArray, i2, 0, 0, Scalar25519.TARGET_LENGTH, 255)) && (!str.equalsIgnoreCase("UTF-32LE") || !m29123(bArrArray, i2, 255, Scalar25519.TARGET_LENGTH, 0, 0))) {
                i = 0;
            }
            this.f35689.position(this.f35688 ? i : 0);
            this.f35691 = true;
        }
        this.f35690.clear();
        while (this.f35690.position() == 0 && !this.f35692) {
            if (this.f35685) {
                CoderResult coderResultFlush = this.f35686.flush(this.f35690);
                if (coderResultFlush.isError()) {
                    coderResultFlush.throwException();
                }
                if (coderResultFlush.isUnderflow()) {
                    this.f35692 = true;
                } else if (this.f35690.position() == 0) {
                    throw new IOException("Decoder flush made no progress");
                }
            } else {
                CoderResult coderResultDecode = this.f35686.decode(this.f35689, this.f35690, this.f35687);
                if (coderResultDecode.isError()) {
                    coderResultDecode.throwException();
                }
                if (coderResultDecode.isUnderflow()) {
                    if (this.f35687) {
                        this.f35685 = true;
                    } else if (this.f35690.position() == 0) {
                        this.f35689.compact();
                        int iRemaining = this.f35689.remaining();
                        if (iRemaining == 0) {
                            throw new IOException("Decoder input buffer is too small");
                        }
                        int iM29125 = m29124(this.f35689.position(), iRemaining, this.f35689.array());
                        if (iM29125 == -1) {
                            this.f35687 = true;
                        } else {
                            ByteBuffer byteBuffer = this.f35689;
                            byteBuffer.position(byteBuffer.position() + iM29125);
                        }
                        this.f35689.flip();
                    } else {
                        continue;
                    }
                } else if (this.f35690.position() == 0) {
                    throw new IOException("Decoder output buffer is too small");
                }
            }
        }
        this.f35690.flip();
        return this.f35690.hasRemaining();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m29123(byte[] bArr, int i, int... iArr) {
        if (i >= iArr.length) {
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if ((bArr[i2] & 255) == iArr[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m29124(int i, int i2, byte[] bArr) throws IOException {
        InputStream inputStream = this.f35693;
        if (inputStream == null) {
            throw new IOException("Text input is canceled or closed");
        }
        int i3 = inputStream.read(bArr, i, i2);
        if (i3 == 0 || i3 < -1 || i3 > i2) {
            throw new IOException("Text input made invalid progress");
        }
        if (i3 <= 0) {
            return i3;
        }
        long j = this.f35695;
        long j2 = i3;
        if (j > C13132.FOREVER_NS - j2) {
            throw new IOException("Source byte count exhausted");
        }
        this.f35695 = j + j2;
        return i3;
    }

    @Override // java.io.Reader
    public final int read() throws IOException {
        if (!this.f35694) {
            if (this.f35690.hasRemaining() || m29125()) {
                return this.f35690.get();
            }
            return -1;
        }
        throw new IOException("Text decoder is closed");
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        if (!this.f35694) {
            C13409.m32419(cArr, i, i2);
            if (i2 == 0) {
                return 0;
            }
            if (!this.f35690.hasRemaining() && !m29125()) {
                return -1;
            }
            int iMin = Math.min(i2, this.f35690.remaining());
            this.f35690.get(cArr, i, iMin);
            return iMin;
        }
        throw new IOException("Text decoder is closed");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m29127() throws IOException {
        InputStream inputStream;
        synchronized (this) {
            inputStream = this.f35693;
            this.f35693 = null;
        }
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f35694) {
            return;
        }
        this.f35694 = true;
        try {
            m29127();
        } finally {
            this.f35689 = null;
            this.f35690 = null;
            this.f35686 = null;
            C5377 c5377 = this.f35697;
            this.f35697 = null;
            c5377.close();
        }
    }
}
