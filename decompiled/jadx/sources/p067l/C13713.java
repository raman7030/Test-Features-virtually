package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
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
import org.bouncycastle.math.p080ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.ۨ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6TW */
/* JADX INFO: loaded from: classes3.dex */
public final class C13713 extends Reader {

    /* JADX INFO: renamed from: ۗ */
    public boolean f38694;

    /* JADX INFO: renamed from: ۙ */
    public CharsetDecoder f38695;

    /* JADX INFO: renamed from: ۛ */
    public boolean f38696;

    /* JADX INFO: renamed from: ۟ */
    public final boolean f38697;

    /* JADX INFO: renamed from: ۤ */
    public ByteBuffer f38698;

    /* JADX INFO: renamed from: ۨ */
    public CharBuffer f38699;

    /* JADX INFO: renamed from: ۫ */
    public boolean f38700;

    /* JADX INFO: renamed from: ۬ */
    public boolean f38701;

    /* JADX INFO: renamed from: ܰ */
    public volatile InputStream f38702;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f38703;

    /* JADX INFO: renamed from: ᩸ */
    public long f38704;

    /* JADX INFO: renamed from: ᩹ */
    public final String f38705;

    /* JADX INFO: renamed from: ᩺ */
    public C7479 f38706;

    /* JADX INFO: renamed from: ֫ */
    public static C13713 m31173(InputStream inputStream, Charset charset, C3455 c3455) {
        return m31174(inputStream, charset, c3455, true, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13713 m31175(InputStream inputStream, C3455 c3455) {
        return m31174(inputStream, StandardCharsets.UTF_8, c3455, false, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13713 m31174(InputStream inputStream, Charset charset, C3455 c3455, boolean z, boolean z2) {
        C12826.requireNonNull(inputStream);
        if (z2) {
            try {
                if (c3455.m6171() - c3455.m6172() >= 33344) {
                    try {
                        return new C13713(inputStream, charset, c3455, 8192, 4096, z);
                    } catch (C6138 unused) {
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
        return new C13713(inputStream, charset, c3455, 1024, 512, z);
    }

    public C13713(InputStream inputStream, Charset charset, C3455 c3455, int i, int i2, boolean z) {
        if (i < 4 || i > 65536 || i2 < 2 || i2 > 32768) {
            throw new IllegalArgumentException("Invalid decoder buffer sizes");
        }
        C12826.requireNonNull(charset);
        this.f38705 = charset.name();
        this.f38697 = z;
        C7479 c7479M6162 = c3455.m6162(((((long) i) + 23) & (-8)) + 256 + (((((long) i2) * 2) + 23) & (-8)));
        try {
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.f38695 = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
            this.f38698 = byteBufferAllocate;
            byteBufferAllocate.limit(0);
            CharBuffer charBufferAllocate = CharBuffer.allocate(i2);
            this.f38699 = charBufferAllocate;
            charBufferAllocate.limit(0);
            this.f38702 = inputStream;
            this.f38706 = c7479M6162;
        } catch (Error | RuntimeException e) {
            c7479M6162.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m31179() {
        return this.f38704;
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m31178() throws IOException {
        int i;
        if (this.f38701) {
            return false;
        }
        if (!this.f38700) {
            byte[] bArrArray = this.f38698.array();
            int i2 = 0;
            while (true) {
                i = 4;
                if (i2 >= 4) {
                    break;
                }
                int iM31177 = m31177(i2, 4 - i2, bArrArray);
                if (iM31177 == -1) {
                    this.f38696 = true;
                    break;
                }
                i2 += iM31177;
            }
            this.f38698.limit(i2);
            String str = this.f38705;
            if (str.equalsIgnoreCase(C0233a.f1077D) && m31176(bArrArray, i2, 239, 187, 191)) {
                i = 3;
            } else if ((str.equalsIgnoreCase("UTF-16BE") && m31176(bArrArray, i2, Scalar25519.TARGET_LENGTH, 255)) || (str.equalsIgnoreCase("UTF-16LE") && m31176(bArrArray, i2, 255, Scalar25519.TARGET_LENGTH))) {
                i = 2;
            } else if ((!str.equalsIgnoreCase("UTF-32BE") || !m31176(bArrArray, i2, 0, 0, Scalar25519.TARGET_LENGTH, 255)) && (!str.equalsIgnoreCase("UTF-32LE") || !m31176(bArrArray, i2, 255, Scalar25519.TARGET_LENGTH, 0, 0))) {
                i = 0;
            }
            this.f38698.position(this.f38697 ? i : 0);
            this.f38700 = true;
        }
        this.f38699.clear();
        while (this.f38699.position() == 0 && !this.f38701) {
            if (this.f38694) {
                CoderResult coderResultFlush = this.f38695.flush(this.f38699);
                if (coderResultFlush.isError()) {
                    coderResultFlush.throwException();
                }
                if (coderResultFlush.isUnderflow()) {
                    this.f38701 = true;
                } else if (this.f38699.position() == 0) {
                    throw new IOException("Decoder flush made no progress");
                }
            } else {
                CoderResult coderResultDecode = this.f38695.decode(this.f38698, this.f38699, this.f38696);
                if (coderResultDecode.isError()) {
                    coderResultDecode.throwException();
                }
                if (coderResultDecode.isUnderflow()) {
                    if (this.f38696) {
                        this.f38694 = true;
                    } else if (this.f38699.position() == 0) {
                        this.f38698.compact();
                        int iRemaining = this.f38698.remaining();
                        if (iRemaining == 0) {
                            throw new IOException("Decoder input buffer is too small");
                        }
                        int iM31178 = m31177(this.f38698.position(), iRemaining, this.f38698.array());
                        if (iM31178 == -1) {
                            this.f38696 = true;
                        } else {
                            ByteBuffer byteBuffer = this.f38698;
                            byteBuffer.position(byteBuffer.position() + iM31178);
                        }
                        this.f38698.flip();
                    } else {
                        continue;
                    }
                } else if (this.f38699.position() == 0) {
                    throw new IOException("Decoder output buffer is too small");
                }
            }
        }
        this.f38699.flip();
        return this.f38699.hasRemaining();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m31176(byte[] bArr, int i, int... iArr) {
        if (i >= iArr.length) {
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if ((bArr[i2] & 255) == iArr[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ */
    private int m31177(int i, int i2, byte[] bArr) throws IOException {
        InputStream inputStream = this.f38702;
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
        long j = this.f38704;
        long j2 = i3;
        if (j > C14849.FOREVER_NS - j2) {
            throw new IOException("Source byte count exhausted");
        }
        this.f38704 = j + j2;
        return i3;
    }

    @Override // java.io.Reader
    public final int read() throws IOException {
        if (!this.f38703) {
            if (this.f38699.hasRemaining() || m31178()) {
                return this.f38699.get();
            }
            return -1;
        }
        throw new IOException("Text decoder is closed");
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        if (!this.f38703) {
            C15113.m34521(cArr, i, i2);
            if (i2 == 0) {
                return 0;
            }
            if (!this.f38699.hasRemaining() && !m31178()) {
                return -1;
            }
            int iMin = Math.min(i2, this.f38699.remaining());
            this.f38699.get(cArr, i, iMin);
            return iMin;
        }
        throw new IOException("Text decoder is closed");
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m31180() throws IOException {
        InputStream inputStream;
        synchronized (this) {
            inputStream = this.f38702;
            this.f38702 = null;
        }
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f38703) {
            return;
        }
        this.f38703 = true;
        try {
            m31180();
        } finally {
            this.f38698 = null;
            this.f38699 = null;
            this.f38695 = null;
            C7479 c7479 = this.f38706;
            this.f38706 = null;
            c7479.close();
        }
    }
}
