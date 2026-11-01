package p067l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܿۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: VAGX */
/* JADX INFO: loaded from: classes4.dex */
public final class C18767 implements WritableByteChannel {

    /* JADX INFO: renamed from: ᩸ */
    public final AtomicBoolean f56085 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩹ */
    public final C9359 f56086;

    public C18767(C9359 c9359) {
        this.f56086 = c9359;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f56085.compareAndSet(false, true)) {
            this.f56086.close();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f56085.get();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        if (!isOpen()) {
            throw new ClosedChannelException();
        }
        if (!byteBuffer.hasArray()) {
            throw new IOException("Direct buffer somehow written to BufferAtATimeOutputChannel");
        }
        try {
            int iPosition = byteBuffer.position();
            int iLimit = byteBuffer.limit() - iPosition;
            this.f56086.write(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, iLimit);
            byteBuffer.position(byteBuffer.limit());
            return iLimit;
        } catch (IOException e) {
            try {
                close();
            } catch (IOException unused) {
            }
            throw e;
        }
    }
}
