package p067l;

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
public class C20855 extends FilterInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۗ */
    public long f65513;

    /* JADX INFO: renamed from: ۙ */
    public final AbstractC5050 f65514;

    /* JADX INFO: renamed from: ۛ */
    public final ByteBuffer f65515;

    /* JADX INFO: renamed from: ۟ */
    public long f65516;

    /* JADX INFO: renamed from: ۤ */
    public final byte[] f65517;

    /* JADX INFO: renamed from: ۨ */
    public int f65518;

    /* JADX INFO: renamed from: ۫ */
    public C16829 f65519;

    /* JADX INFO: renamed from: ۬ */
    public boolean f65520;

    /* JADX INFO: renamed from: ܰ */
    public final ByteBuffer f65521;

    /* JADX INFO: renamed from: ᩶ */
    public byte[] f65522;

    /* JADX INFO: renamed from: ᩸ */
    public ByteBuffer f65523;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC4406 f65524;

    /* JADX INFO: renamed from: ᩺ */
    public byte[] f65525;

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

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20855(InputStream inputStream) {
        super(inputStream);
        AbstractC5050 abstractC5050M45661 = C20184.m45660().m45661();
        C18487.m42025();
        AbstractC4406 abstractC4406M42026 = C18487.m42026();
        byte[] bArr = new byte[15];
        this.f65517 = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f65515 = byteBufferWrap.order(byteOrder);
        this.f65521 = ByteBuffer.allocate(8).order(byteOrder);
        this.f65523 = null;
        this.f65525 = null;
        this.f65518 = -1;
        this.f65513 = -1L;
        this.f65516 = 0L;
        this.f65520 = false;
        this.f65519 = null;
        this.f65514 = abstractC5050M45661;
        this.f65524 = abstractC4406M42026;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m47084() throws IOException {
        while (true) {
            int i = 0;
            do {
                int i2 = ((FilterInputStream) this).in.read(this.f65521.array(), i, 4 - i);
                if (i2 < 0) {
                    if (!this.f65520) {
                        throw new IOException("Stream ended prematurely");
                    }
                    if (i <= 0) {
                        return false;
                    }
                    throw new IOException("Stream ended prematurely");
                }
                i += i2;
            } while (i < 4);
            int i3 = this.f65521.getInt(0);
            if (i3 == 407708164) {
                this.f65515.rewind();
                int i4 = ((FilterInputStream) this).in.read();
                if (i4 < 0) {
                    throw new IOException("Stream ended prematurely");
                }
                int i5 = ((FilterInputStream) this).in.read();
                if (i5 < 0) {
                    throw new IOException("Stream ended prematurely");
                }
                byte b = (byte) (i4 & 255);
                C10125 c10125M23599 = C10125.m23599(b);
                this.f65515.put(b);
                byte b2 = (byte) (i5 & 255);
                C2748 c2748M4284 = C2748.m4284(b2);
                this.f65515.put(b2);
                this.f65519 = new C16829(c10125M23599, c2748M4284);
                if (c10125M23599.m23602(EnumC3419.CONTENT_SIZE)) {
                    InputStream inputStream = ((FilterInputStream) this).in;
                    ByteBuffer byteBuffer = this.f65521;
                    int i6 = 0;
                    do {
                        int i7 = inputStream.read(byteBuffer.array(), i6, 8 - i6);
                        if (i7 < 0) {
                            throw new IOException("Stream ended prematurely");
                        }
                        i6 += i7;
                    } while (i6 < 8);
                    long j = byteBuffer.getLong(0);
                    this.f65513 = j;
                    this.f65515.putLong(j);
                }
                this.f65516 = 0L;
                byte bMo9165 = (byte) ((this.f65524.mo9165(this.f65517, 0, this.f65515.position()) >> 8) & 255);
                int i8 = ((FilterInputStream) this).in.read();
                if (i8 < 0) {
                    throw new IOException("Stream ended prematurely");
                }
                if (bMo9165 != ((byte) (i8 & 255))) {
                    throw new IOException("Stream frame descriptor corrupted");
                }
                int iM4285 = this.f65519.m38167().m4285();
                this.f65518 = iM4285;
                this.f65522 = new byte[iM4285];
                byte[] bArr = new byte[iM4285];
                this.f65525 = bArr;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                this.f65523 = byteBufferWrap;
                byteBufferWrap.limit(0);
                this.f65520 = true;
                return true;
            }
            if ((i3 >>> 4) != 25481893) {
                throw new IOException("Stream unsupported");
            }
            int iM47083 = m47083(((FilterInputStream) this).in);
            byte[] bArr2 = new byte[1024];
            while (iM47083 > 0) {
                int i9 = ((FilterInputStream) this).in.read(bArr2, 0, Math.min(iM47083, 1024));
                if (i9 < 0) {
                    throw new IOException("Stream ended prematurely");
                }
                iM47083 -= i9;
            }
            this.f65520 = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m47083(InputStream inputStream) throws IOException {
        ByteBuffer byteBuffer;
        int i = 0;
        do {
            byteBuffer = this.f65521;
            int i2 = inputStream.read(byteBuffer.array(), i, 4 - i);
            if (i2 < 0) {
                throw new IOException("Stream ended prematurely");
            }
            i += i2;
        } while (i < 4);
        return byteBuffer.getInt(0);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m47085() throws IOException {
        int iM47083 = m47083(((FilterInputStream) this).in);
        boolean z = (Integer.MIN_VALUE & iM47083) == 0;
        int iMo10771 = iM47083 & Integer.MAX_VALUE;
        if (iMo10771 == 0) {
            if (this.f65519.m38165(EnumC3419.CONTENT_CHECKSUM) && m47083(((FilterInputStream) this).in) != this.f65519.m38163()) {
                throw new IOException("Content checksum mismatch");
            }
            if (!this.f65519.m38165(EnumC3419.CONTENT_SIZE) || this.f65513 == this.f65516) {
                this.f65519.m38166();
                return;
            }
            throw new IOException("Size check mismatch: " + this.f65513 + " != " + this.f65516);
        }
        byte[] bArr = z ? this.f65522 : this.f65525;
        if (iMo10771 > this.f65518) {
            Locale locale = Locale.ROOT;
            throw new IOException(C19768.m44907("Block size ", iMo10771, this.f65518, " exceeded max: "));
        }
        int i = 0;
        while (i < iMo10771) {
            int i2 = ((FilterInputStream) this).in.read(bArr, i, iMo10771 - i);
            if (i2 < 0) {
                throw new IOException("Stream ended prematurely");
            }
            i += i2;
        }
        if (this.f65519.m38165(EnumC3419.BLOCK_CHECKSUM) && m47083(((FilterInputStream) this).in) != this.f65524.mo9165(bArr, 0, iMo10771)) {
            throw new IOException("Block checksum mismatch");
        }
        if (z) {
            try {
                AbstractC5050 abstractC5050 = this.f65514;
                byte[] bArr2 = this.f65525;
                iMo10771 = abstractC5050.mo10771(iMo10771, bArr2.length, bArr, bArr2);
            } catch (C6102 e) {
                throw new IOException(e);
            }
        }
        if (this.f65519.m38165(EnumC3419.CONTENT_CHECKSUM)) {
            this.f65519.m38164(iMo10771, this.f65525);
        }
        this.f65516 += (long) iMo10771;
        this.f65523.limit(iMo10771);
        this.f65523.rewind();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        while (true) {
            if (!this.f65520 || this.f65523.remaining() == 0) {
                if ((!this.f65520 || this.f65519.m38168()) && !m47084()) {
                    return -1;
                }
                m47085();
            } else {
                return this.f65523.get() & 255;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        while (true) {
            if (!this.f65520 || this.f65523.remaining() == 0) {
                if ((!this.f65520 || this.f65519.m38168()) && !m47084()) {
                    return -1;
                }
                m47085();
            } else {
                int iMin = Math.min(i2, this.f65523.remaining());
                this.f65523.get(bArr, i, iMin);
                return iMin;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j > 0) {
            while (true) {
                if (!this.f65520 || this.f65523.remaining() == 0) {
                    if ((this.f65520 && !this.f65519.m38168()) || m47084()) {
                        m47085();
                    }
                } else {
                    long jMin = Math.min(j, this.f65523.remaining());
                    ByteBuffer byteBuffer = this.f65523;
                    byteBuffer.position(byteBuffer.position() + ((int) jMin));
                    return jMin;
                }
            }
        }
        return 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return this.f65523.remaining();
    }
}
