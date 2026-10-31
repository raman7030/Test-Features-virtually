package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۨܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes3.dex */
public final class C11746 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f35055;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final FileChannel f35056;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f35057;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17471 f35058;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f35059;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f35060 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private synchronized void m28742() {
        if (this.f35055) {
            return;
        }
        this.f35055 = true;
        try {
            this.f35056.close();
            this.f35058.close();
        } catch (Throwable th) {
            this.f35058.close();
            throw th;
        }
    }

    public C11746(FileChannel fileChannel, C17471 c17471) {
        this.f35056 = fileChannel;
        this.f35058 = c17471;
        this.f35059 = fileChannel.size();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m28748() {
        return this.f35059;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m28744() {
        return (this.f35057 || this.f35055 || !this.f35056.isOpen()) ? false : true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m28746() throws ClosedChannelException {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.f35060;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new ClosedChannelException();
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28743(long j, byte[] bArr, int i, int i2) throws IOException {
        if (this.f35057) {
            throw new C5519();
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            try {
                int i3 = this.f35056.read(byteBufferWrap, j);
                if (i3 < 0) {
                    throw new IOException("Unexpected end of hex checkpoint delta");
                }
                if (i3 == 0) {
                    Thread.yield();
                } else {
                    j += (long) i3;
                }
            } catch (ClosedChannelException e) {
                if (this.f35057) {
                    throw new C5519(e);
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m28747() {
        this.f35057 = true;
        m28742();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28745() {
        AtomicInteger atomicInteger = this.f35060;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        if (iDecrementAndGet > 0) {
            return;
        }
        if (iDecrementAndGet < 0) {
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("Hex restore delta channel already closed");
        }
        m28742();
    }
}
