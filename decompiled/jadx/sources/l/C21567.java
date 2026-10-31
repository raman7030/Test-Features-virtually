package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩸ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DI */
/* JADX INFO: loaded from: classes4.dex */
public final class C21567 extends FilterOutputStream {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC1105[] f69293 = {EnumC1105.BLOCK_INDEPENDENCE};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C15215 f69294;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC2988 f69295;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f69296;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f69297;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f69298;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f69299;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC2143 f69300;

    public C21567(OutputStream outputStream, EnumC5339 enumC5339, long j, AbstractC2988 abstractC2988, AbstractC2143 abstractC2143, EnumC1105... enumC1105Arr) throws IOException {
        super(outputStream);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f69297 = byteBufferAllocate.order(byteOrder);
        this.f69294 = null;
        this.f69295 = abstractC2988;
        this.f69300 = abstractC2143;
        C15215 c15215 = new C15215(new C8161(enumC1105Arr), new C0399(enumC5339, 0));
        this.f69294 = c15215;
        int iM1893 = c15215.m36006().m1893();
        this.f69296 = iM1893;
        this.f69299 = ByteBuffer.allocate(iM1893).order(byteOrder);
        abstractC2988.getClass();
        if (iM1893 < 0) {
            throw new IllegalArgumentException(C19370.m44628(iM1893, "length must be >= 0, got "));
        }
        if (iM1893 >= 2113929216) {
            throw new IllegalArgumentException("length must be < 2113929216");
        }
        this.f69298 = new byte[(iM1893 / 255) + iM1893 + 16];
        C8161 c8161M36008 = c15215.m36008();
        EnumC1105 enumC1105 = EnumC1105.CONTENT_SIZE;
        if (c8161M36008.m21633(enumC1105) && j < 0) {
            throw new IllegalArgumentException("Known size must be greater than zero in order to use the known size feature");
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(15).order(byteOrder);
        byteBufferOrder.putInt(407708164);
        byteBufferOrder.put(c15215.m36008().m21632());
        byteBufferOrder.put(c15215.m36006().m1894());
        if (c15215.m36004(enumC1105)) {
            byteBufferOrder.putLong(j);
        }
        byteBufferOrder.put((byte) ((abstractC2143.mo7070(byteBufferOrder.array(), 4, byteBufferOrder.position() - 4) >> 8) & 255));
        ((FilterOutputStream) this).out.write(byteBufferOrder.array(), 0, byteBufferOrder.position());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21567(OutputStream outputStream) {
        EnumC5339 enumC5339 = EnumC5339.SIZE_4MB;
        C18745.m43393().getClass();
        C16959.m39782();
        this(outputStream, enumC5339, -1L, C4633.f14709, C16959.m39783(), f69293);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21567(OutputStream outputStream, int i, long j) {
        AbstractC2988 abstractC2988M43395;
        EnumC5339 enumC5339 = EnumC5339.SIZE_4MB;
        if (i == 1) {
            C18745.m43393().getClass();
            abstractC2988M43395 = C4633.f14709;
        } else {
            abstractC2988M43395 = C18745.m43393().m43395(i);
        }
        AbstractC2988 abstractC2988 = abstractC2988M43395;
        C16959.m39782();
        this(outputStream, enumC5339, j, abstractC2988, C16959.m39783(), j < 0 ? new EnumC1105[]{EnumC1105.BLOCK_INDEPENDENCE, EnumC1105.CONTENT_CHECKSUM} : new EnumC1105[]{EnumC1105.BLOCK_INDEPENDENCE, EnumC1105.CONTENT_CHECKSUM, EnumC1105.CONTENT_SIZE});
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48726() throws IOException {
        int i;
        ByteBuffer byteBuffer = this.f69299;
        if (byteBuffer.position() == 0) {
            return;
        }
        byte[] bArrCopyOf = this.f69298;
        Arrays.fill(bArrCopyOf, (byte) 0);
        EnumC1105 enumC1105 = EnumC1105.CONTENT_CHECKSUM;
        C15215 c15215 = this.f69294;
        if (c15215.m36004(enumC1105)) {
            c15215.m36003(byteBuffer.position(), byteBuffer.array());
        }
        byte[] bArrArray = byteBuffer.array();
        int iPosition = byteBuffer.position();
        AbstractC2988 abstractC2988 = this.f69295;
        abstractC2988.getClass();
        int iMo9121 = abstractC2988.mo9121(iPosition, bArrCopyOf.length, bArrArray, bArrCopyOf);
        if (iMo9121 >= byteBuffer.position()) {
            iMo9121 = byteBuffer.position();
            bArrCopyOf = Arrays.copyOf(byteBuffer.array(), iMo9121);
            i = Integer.MIN_VALUE;
        } else {
            i = 0;
        }
        ByteBuffer byteBuffer2 = this.f69297;
        byteBuffer2.putInt(0, i | iMo9121);
        ((FilterOutputStream) this).out.write(byteBuffer2.array());
        ((FilterOutputStream) this).out.write(bArrCopyOf, 0, iMo9121);
        if (c15215.m36004(EnumC1105.BLOCK_CHECKSUM)) {
            byteBuffer2.putInt(0, this.f69300.mo7070(bArrCopyOf, 0, iMo9121));
            ((FilterOutputStream) this).out.write(byteBuffer2.array());
        }
        byteBuffer.rewind();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (this.f69294.m36007()) {
            throw new IllegalStateException("The stream is already closed");
        }
        while (true) {
            ByteBuffer byteBuffer = this.f69299;
            if (i2 > byteBuffer.remaining()) {
                int iRemaining = byteBuffer.remaining();
                byteBuffer.put(bArr, i, iRemaining);
                m48726();
                i += iRemaining;
                i2 -= iRemaining;
            } else {
                byteBuffer.put(bArr, i, i2);
                return;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        if (!this.f69294.m36007()) {
            m48726();
        }
        super.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        if (!this.f69294.m36007()) {
            ByteBuffer byteBuffer = this.f69299;
            if (byteBuffer.position() == this.f69296) {
                m48726();
            }
            byteBuffer.put((byte) i);
            return;
        }
        throw new IllegalStateException("The stream is already closed");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C15215 c15215 = this.f69294;
        if (!c15215.m36007()) {
            flush();
            ByteBuffer byteBuffer = this.f69297;
            byteBuffer.putInt(0, 0);
            ((FilterOutputStream) this).out.write(byteBuffer.array());
            if (c15215.m36004(EnumC1105.CONTENT_CHECKSUM)) {
                byteBuffer.putInt(0, c15215.m36002());
                ((FilterOutputStream) this).out.write(byteBuffer.array());
            }
            c15215.m36005();
        }
        super.close();
    }
}
