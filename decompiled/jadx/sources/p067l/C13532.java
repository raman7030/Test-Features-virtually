package p067l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۨܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes3.dex */
public final class C13532 {

    /* JADX INFO: renamed from: ֫ */
    public volatile boolean f38054;

    /* JADX INFO: renamed from: ۧ */
    public final FileChannel f38055;

    /* JADX INFO: renamed from: ܳ */
    public volatile boolean f38056;

    /* JADX INFO: renamed from: ܽ */
    public final C18973 f38057;

    /* JADX INFO: renamed from: ܿ */
    public final long f38058;

    /* JADX INFO: renamed from: ᩳ */
    public final AtomicInteger f38059 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ܳ */
    private synchronized void m30790() {
        if (this.f38054) {
            return;
        }
        this.f38054 = true;
        try {
            this.f38055.close();
            this.f38057.close();
        } catch (Throwable th) {
            this.f38057.close();
            throw th;
        }
    }

    public C13532(FileChannel fileChannel, C18973 c18973) {
        this.f38055 = fileChannel;
        this.f38057 = c18973;
        this.f38058 = fileChannel.size();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m30796() {
        return this.f38058;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m30792() {
        return (this.f38056 || this.f38054 || !this.f38055.isOpen()) ? false : true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m30794() throws ClosedChannelException {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.f38059;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new ClosedChannelException();
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30791(long j, byte[] bArr, int i, int i2) throws IOException {
        if (this.f38056) {
            throw new C7614();
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            try {
                int i3 = this.f38055.read(byteBufferWrap, j);
                if (i3 < 0) {
                    throw new IOException("Unexpected end of hex checkpoint delta");
                }
                if (i3 == 0) {
                    Thread.yield();
                } else {
                    j += (long) i3;
                }
            } catch (ClosedChannelException e) {
                if (this.f38056) {
                    throw new C7614(e);
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m30795() {
        this.f38056 = true;
        m30790();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30793() {
        AtomicInteger atomicInteger = this.f38059;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        if (iDecrementAndGet > 0) {
            return;
        }
        if (iDecrementAndGet < 0) {
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("Hex restore delta channel already closed");
        }
        m30790();
    }
}
