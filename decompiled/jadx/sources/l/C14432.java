package l;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܳۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: VAGX */
/* JADX INFO: loaded from: classes3.dex */
public final class C14432 extends OutputStream implements WritableByteChannel {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WritableByteChannel f44237;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f44238 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f44240 = ByteBuffer.allocate(512);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f44239 = 512;

    public C14432(C7356 c7356) {
        this.f44237 = new C17255(c7356);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        WritableByteChannel writableByteChannel = this.f44237;
        if (this.f44238.compareAndSet(false, true)) {
            try {
                m34459();
            } finally {
                writableByteChannel.close();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34459() throws IOException {
        ByteBuffer byteBuffer = this.f44240;
        if (byteBuffer.position() != 0) {
            byteBuffer.order(ByteOrder.nativeOrder());
            int iRemaining = byteBuffer.remaining();
            if (iRemaining > 8) {
                int iPosition = byteBuffer.position() & 7;
                if (iPosition != 0) {
                    int i = 8 - iPosition;
                    for (int i2 = 0; i2 < i; i2++) {
                        byteBuffer.put((byte) 0);
                    }
                    iRemaining -= i;
                }
                while (iRemaining >= 8) {
                    byteBuffer.putLong(0L);
                    iRemaining -= 8;
                }
            }
            while (byteBuffer.hasRemaining()) {
                byteBuffer.put((byte) 0);
            }
            m34458();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        boolean zIsOpen = this.f44237.isOpen();
        AtomicBoolean atomicBoolean = this.f44238;
        if (!zIsOpen) {
            atomicBoolean.set(true);
        }
        return !atomicBoolean.get();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (!isOpen()) {
            throw new ClosedChannelException();
        }
        while (i2 > 0) {
            ByteBuffer byteBuffer = this.f44240;
            int iMin = Math.min(i2, byteBuffer.remaining());
            byteBuffer.put(bArr, i, iMin);
            if (!byteBuffer.hasRemaining()) {
                m34458();
            }
            i2 -= iMin;
            i += iMin;
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        int i;
        if (!isOpen()) {
            throw new ClosedChannelException();
        }
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.f44240;
        if (iRemaining < byteBuffer2.remaining()) {
            byteBuffer2.put(byteBuffer);
            return iRemaining;
        }
        int iLimit = byteBuffer.limit();
        if (byteBuffer2.position() != 0) {
            int iRemaining2 = byteBuffer2.remaining();
            byteBuffer.limit(byteBuffer.position() + iRemaining2);
            byteBuffer2.put(byteBuffer);
            m34458();
            i = iRemaining - iRemaining2;
        } else {
            i = iRemaining;
        }
        while (true) {
            int i2 = this.f44239;
            if (i >= i2) {
                byteBuffer.limit(byteBuffer.position() + i2);
                this.f44237.write(byteBuffer);
                i -= i2;
            } else {
                byteBuffer.limit(iLimit);
                byteBuffer2.put(byteBuffer);
                return iRemaining;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (!isOpen()) {
            throw new ClosedChannelException();
        }
        ByteBuffer byteBuffer = this.f44240;
        byteBuffer.put((byte) i);
        if (byteBuffer.hasRemaining()) {
            return;
        }
        m34458();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m34458() throws IOException {
        ByteBuffer byteBuffer = this.f44240;
        byteBuffer.flip();
        int iWrite = this.f44237.write(byteBuffer);
        boolean zHasRemaining = byteBuffer.hasRemaining();
        int i = this.f44239;
        if (iWrite != i || zHasRemaining) {
            throw new IOException(String.format("Failed to write %,d bytes atomically. Only wrote  %,d", Integer.valueOf(i), Integer.valueOf(iWrite)));
        }
        byteBuffer.clear();
    }
}
