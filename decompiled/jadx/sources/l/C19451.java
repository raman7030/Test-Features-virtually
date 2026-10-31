package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩵ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8DM */
/* JADX INFO: loaded from: classes5.dex */
public class C19451 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f62896;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC2821 f62897;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f62898;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f62899;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] f62900;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f62901;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15215 f62902;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f62903;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f62904;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f62905;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ByteBuffer f62906;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC2143 f62907;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public byte[] f62908;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        throw new UnsupportedOperationException("mark not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        throw new UnsupportedOperationException("reset not supported");
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19451(InputStream inputStream) {
        super(inputStream);
        AbstractC2821 abstractC2821M43394 = C18745.m43393().m43394();
        C16959.m39782();
        AbstractC2143 abstractC2143M39783 = C16959.m39783();
        byte[] bArr = new byte[15];
        this.f62900 = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f62898 = byteBufferWrap.order(byteOrder);
        this.f62904 = ByteBuffer.allocate(8).order(byteOrder);
        this.f62906 = null;
        this.f62908 = null;
        this.f62901 = -1;
        this.f62896 = -1L;
        this.f62899 = 0L;
        this.f62903 = false;
        this.f62902 = null;
        this.f62897 = abstractC2821M43394;
        this.f62907 = abstractC2143M39783;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m44788() throws IOException {
        while (true) {
            int i = 0;
            do {
                int i2 = ((FilterInputStream) this).in.read(this.f62904.array(), i, 4 - i);
                if (i2 < 0) {
                    if (!this.f62903) {
                        throw new IOException("Stream ended prematurely");
                    }
                    if (i <= 0) {
                        return false;
                    }
                    throw new IOException("Stream ended prematurely");
                }
                i += i2;
            } while (i < 4);
            int i3 = this.f62904.getInt(0);
            if (i3 == 407708164) {
                this.f62898.rewind();
                int i4 = ((FilterInputStream) this).in.read();
                if (i4 < 0) {
                    throw new IOException("Stream ended prematurely");
                }
                int i5 = ((FilterInputStream) this).in.read();
                if (i5 < 0) {
                    throw new IOException("Stream ended prematurely");
                }
                byte b = (byte) (i4 & 255);
                C8161 c8161M21630 = C8161.m21630(b);
                this.f62898.put(b);
                byte b2 = (byte) (i5 & 255);
                C0399 c0399M1892 = C0399.m1892(b2);
                this.f62898.put(b2);
                this.f62902 = new C15215(c8161M21630, c0399M1892);
                if (c8161M21630.m21633(EnumC1105.CONTENT_SIZE)) {
                    InputStream inputStream = ((FilterInputStream) this).in;
                    ByteBuffer byteBuffer = this.f62904;
                    int i6 = 0;
                    do {
                        int i7 = inputStream.read(byteBuffer.array(), i6, 8 - i6);
                        if (i7 < 0) {
                            throw new IOException("Stream ended prematurely");
                        }
                        i6 += i7;
                    } while (i6 < 8);
                    long j = byteBuffer.getLong(0);
                    this.f62896 = j;
                    this.f62898.putLong(j);
                }
                this.f62899 = 0L;
                byte bMo7070 = (byte) ((this.f62907.mo7070(this.f62900, 0, this.f62898.position()) >> 8) & 255);
                int i8 = ((FilterInputStream) this).in.read();
                if (i8 < 0) {
                    throw new IOException("Stream ended prematurely");
                }
                if (bMo7070 != ((byte) (i8 & 255))) {
                    throw new IOException("Stream frame descriptor corrupted");
                }
                int iM1893 = this.f62902.m36006().m1893();
                this.f62901 = iM1893;
                this.f62905 = new byte[iM1893];
                byte[] bArr = new byte[iM1893];
                this.f62908 = bArr;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                this.f62906 = byteBufferWrap;
                byteBufferWrap.limit(0);
                this.f62903 = true;
                return true;
            }
            if ((i3 >>> 4) != 25481893) {
                throw new IOException("Stream unsupported");
            }
            int iM44787 = m44787(((FilterInputStream) this).in);
            byte[] bArr2 = new byte[1024];
            while (iM44787 > 0) {
                int i9 = ((FilterInputStream) this).in.read(bArr2, 0, Math.min(iM44787, 1024));
                if (i9 < 0) {
                    throw new IOException("Stream ended prematurely");
                }
                iM44787 -= i9;
            }
            this.f62903 = true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m44787(InputStream inputStream) throws IOException {
        ByteBuffer byteBuffer;
        int i = 0;
        do {
            byteBuffer = this.f62904;
            int i2 = inputStream.read(byteBuffer.array(), i, 4 - i);
            if (i2 < 0) {
                throw new IOException("Stream ended prematurely");
            }
            i += i2;
        } while (i < 4);
        return byteBuffer.getInt(0);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m44789() throws IOException {
        int iM44787 = m44787(((FilterInputStream) this).in);
        boolean z = (Integer.MIN_VALUE & iM44787) == 0;
        int iMo8710 = iM44787 & Integer.MAX_VALUE;
        if (iMo8710 == 0) {
            if (this.f62902.m36004(EnumC1105.CONTENT_CHECKSUM) && m44787(((FilterInputStream) this).in) != this.f62902.m36002()) {
                throw new IOException("Content checksum mismatch");
            }
            if (!this.f62902.m36004(EnumC1105.CONTENT_SIZE) || this.f62896 == this.f62899) {
                this.f62902.m36005();
                return;
            }
            throw new IOException("Size check mismatch: " + this.f62896 + " != " + this.f62899);
        }
        byte[] bArr = z ? this.f62905 : this.f62908;
        if (iMo8710 > this.f62901) {
            Locale locale = Locale.ROOT;
            throw new IOException(C18307.m42646("Block size ", iMo8710, this.f62901, " exceeded max: "));
        }
        int i = 0;
        while (i < iMo8710) {
            int i2 = ((FilterInputStream) this).in.read(bArr, i, iMo8710 - i);
            if (i2 < 0) {
                throw new IOException("Stream ended prematurely");
            }
            i += i2;
        }
        if (this.f62902.m36004(EnumC1105.BLOCK_CHECKSUM) && m44787(((FilterInputStream) this).in) != this.f62907.mo7070(bArr, 0, iMo8710)) {
            throw new IOException("Block checksum mismatch");
        }
        if (z) {
            try {
                AbstractC2821 abstractC2821 = this.f62897;
                byte[] bArr2 = this.f62908;
                iMo8710 = abstractC2821.mo8710(iMo8710, bArr2.length, bArr, bArr2);
            } catch (C3928 e) {
                throw new IOException(e);
            }
        }
        if (this.f62902.m36004(EnumC1105.CONTENT_CHECKSUM)) {
            this.f62902.m36003(iMo8710, this.f62908);
        }
        this.f62899 += (long) iMo8710;
        this.f62906.limit(iMo8710);
        this.f62906.rewind();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        while (true) {
            if (!this.f62903 || this.f62906.remaining() == 0) {
                if ((!this.f62903 || this.f62902.m36007()) && !m44788()) {
                    return -1;
                }
                m44789();
            } else {
                return this.f62906.get() & 255;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        while (true) {
            if (!this.f62903 || this.f62906.remaining() == 0) {
                if ((!this.f62903 || this.f62902.m36007()) && !m44788()) {
                    return -1;
                }
                m44789();
            } else {
                int iMin = Math.min(i2, this.f62906.remaining());
                this.f62906.get(bArr, i, iMin);
                return iMin;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j > 0) {
            while (true) {
                if (!this.f62903 || this.f62906.remaining() == 0) {
                    if ((this.f62903 && !this.f62902.m36007()) || m44788()) {
                        m44789();
                    }
                } else {
                    long jMin = Math.min(j, this.f62906.remaining());
                    ByteBuffer byteBuffer = this.f62906;
                    byteBuffer.position(byteBuffer.position() + ((int) jMin));
                    return jMin;
                }
            }
        }
        return 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return this.f62906.remaining();
    }
}
