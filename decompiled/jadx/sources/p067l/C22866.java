package p067l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩸ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DI */
/* JADX INFO: loaded from: classes4.dex */
public final class C22866 extends FilterOutputStream {

    /* JADX INFO: renamed from: ۤ */
    public static final EnumC3419[] f71995 = {EnumC3419.BLOCK_INDEPENDENCE};

    /* JADX INFO: renamed from: ۗ */
    public C16829 f71996;

    /* JADX INFO: renamed from: ۙ */
    public final AbstractC5208 f71997;

    /* JADX INFO: renamed from: ۫ */
    public final int f71998;

    /* JADX INFO: renamed from: ۬ */
    public final ByteBuffer f71999;

    /* JADX INFO: renamed from: ᩶ */
    public final byte[] f72000;

    /* JADX INFO: renamed from: ᩸ */
    public final ByteBuffer f72001;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC4406 f72002;

    public C22866(OutputStream outputStream, EnumC7443 enumC7443, long j, AbstractC5208 abstractC5208, AbstractC4406 abstractC4406, EnumC3419... enumC3419Arr) throws IOException {
        super(outputStream);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f71999 = byteBufferAllocate.order(byteOrder);
        this.f71996 = null;
        this.f71997 = abstractC5208;
        this.f72002 = abstractC4406;
        C16829 c16829 = new C16829(new C10125(enumC3419Arr), new C2748(enumC7443, 0));
        this.f71996 = c16829;
        int iM4285 = c16829.m38167().m4285();
        this.f71998 = iM4285;
        this.f72001 = ByteBuffer.allocate(iM4285).order(byteOrder);
        abstractC5208.getClass();
        if (iM4285 < 0) {
            throw new IllegalArgumentException(C20778.m46922(iM4285, "length must be >= 0, got "));
        }
        if (iM4285 >= 2113929216) {
            throw new IllegalArgumentException("length must be < 2113929216");
        }
        this.f72000 = new byte[(iM4285 / 255) + iM4285 + 16];
        C10125 c10125M38169 = c16829.m38169();
        EnumC3419 enumC3419 = EnumC3419.CONTENT_SIZE;
        if (c10125M38169.m23602(enumC3419) && j < 0) {
            throw new IllegalArgumentException("Known size must be greater than zero in order to use the known size feature");
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(15).order(byteOrder);
        byteBufferOrder.putInt(407708164);
        byteBufferOrder.put(c16829.m38169().m23601());
        byteBufferOrder.put(c16829.m38167().m4286());
        if (c16829.m38165(enumC3419)) {
            byteBufferOrder.putLong(j);
        }
        byteBufferOrder.put((byte) ((abstractC4406.mo9165(byteBufferOrder.array(), 4, byteBufferOrder.position() - 4) >> 8) & 255));
        ((FilterOutputStream) this).out.write(byteBufferOrder.array(), 0, byteBufferOrder.position());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C22866(OutputStream outputStream) {
        EnumC7443 enumC7443 = EnumC7443.SIZE_4MB;
        C20184.m45660().getClass();
        C18487.m42025();
        this(outputStream, enumC7443, -1L, C6772.f17537, C18487.m42026(), f71995);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C22866(OutputStream outputStream, int i, long j) {
        AbstractC5208 abstractC5208M45662;
        EnumC7443 enumC7443 = EnumC7443.SIZE_4MB;
        if (i == 1) {
            C20184.m45660().getClass();
            abstractC5208M45662 = C6772.f17537;
        } else {
            abstractC5208M45662 = C20184.m45660().m45662(i);
        }
        AbstractC5208 abstractC5208 = abstractC5208M45662;
        C18487.m42025();
        this(outputStream, enumC7443, j, abstractC5208, C18487.m42026(), j < 0 ? new EnumC3419[]{EnumC3419.BLOCK_INDEPENDENCE, EnumC3419.CONTENT_CHECKSUM} : new EnumC3419[]{EnumC3419.BLOCK_INDEPENDENCE, EnumC3419.CONTENT_CHECKSUM, EnumC3419.CONTENT_SIZE});
    }

    /* JADX INFO: renamed from: ֫ */
    private void m51072() throws IOException {
        int i;
        ByteBuffer byteBuffer = this.f72001;
        if (byteBuffer.position() == 0) {
            return;
        }
        byte[] bArrCopyOf = this.f72000;
        Arrays.fill(bArrCopyOf, (byte) 0);
        EnumC3419 enumC3419 = EnumC3419.CONTENT_CHECKSUM;
        C16829 c16829 = this.f71996;
        if (c16829.m38165(enumC3419)) {
            c16829.m38164(byteBuffer.position(), byteBuffer.array());
        }
        byte[] bArrArray = byteBuffer.array();
        int iPosition = byteBuffer.position();
        AbstractC5208 abstractC5208 = this.f71997;
        abstractC5208.getClass();
        int iMo11172 = abstractC5208.mo11172(iPosition, bArrCopyOf.length, bArrArray, bArrCopyOf);
        if (iMo11172 >= byteBuffer.position()) {
            iMo11172 = byteBuffer.position();
            bArrCopyOf = Arrays.copyOf(byteBuffer.array(), iMo11172);
            i = Integer.MIN_VALUE;
        } else {
            i = 0;
        }
        ByteBuffer byteBuffer2 = this.f71999;
        byteBuffer2.putInt(0, i | iMo11172);
        ((FilterOutputStream) this).out.write(byteBuffer2.array());
        ((FilterOutputStream) this).out.write(bArrCopyOf, 0, iMo11172);
        if (c16829.m38165(EnumC3419.BLOCK_CHECKSUM)) {
            byteBuffer2.putInt(0, this.f72002.mo9165(bArrCopyOf, 0, iMo11172));
            ((FilterOutputStream) this).out.write(byteBuffer2.array());
        }
        byteBuffer.rewind();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (this.f71996.m38168()) {
            throw new IllegalStateException("The stream is already closed");
        }
        while (true) {
            ByteBuffer byteBuffer = this.f72001;
            if (i2 > byteBuffer.remaining()) {
                int iRemaining = byteBuffer.remaining();
                byteBuffer.put(bArr, i, iRemaining);
                m51072();
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
        if (!this.f71996.m38168()) {
            m51072();
        }
        super.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        if (!this.f71996.m38168()) {
            ByteBuffer byteBuffer = this.f72001;
            if (byteBuffer.position() == this.f71998) {
                m51072();
            }
            byteBuffer.put((byte) i);
            return;
        }
        throw new IllegalStateException("The stream is already closed");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C16829 c16829 = this.f71996;
        if (!c16829.m38168()) {
            flush();
            ByteBuffer byteBuffer = this.f71999;
            byteBuffer.putInt(0, 0);
            ((FilterOutputStream) this).out.write(byteBuffer.array());
            if (c16829.m38165(EnumC3419.CONTENT_CHECKSUM)) {
                byteBuffer.putInt(0, c16829.m38163());
                ((FilterOutputStream) this).out.write(byteBuffer.array());
            }
            c16829.m38166();
        }
        super.close();
    }
}
