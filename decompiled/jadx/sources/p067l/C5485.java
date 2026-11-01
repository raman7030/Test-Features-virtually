package p067l;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۗܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes2.dex */
public final class C5485 implements InterfaceC20315, InterfaceC6233, InterfaceC4892 {

    /* JADX INFO: renamed from: ۙ */
    public final C13532 f13122;

    /* JADX INFO: renamed from: ᩶ */
    public final int f13123;

    /* JADX INFO: renamed from: ᩹ */
    public volatile boolean f13125;

    /* JADX INFO: renamed from: ۗ */
    public final AtomicInteger f13121 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ᩸ */
    public long f13124 = -1;

    public C5485(C13532 c13532, int i) throws ClosedChannelException {
        this.f13122 = c13532;
        this.f13123 = i;
        c13532.m30794();
    }

    @Override // p067l.InterfaceC20315
    public final int length() {
        return this.f13123;
    }

    @Override // p067l.InterfaceC6233
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12116() {
        return this.f13122;
    }

    @Override // p067l.InterfaceC6233
    /* JADX INFO: renamed from: ܽ */
    public final long mo12120() {
        return this.f13122.m30796();
    }

    @Override // p067l.InterfaceC20315
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo12119() {
        return this.f13122.m30792();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12118(long j) {
        if (this.f13121.get() <= 0 || j < 0) {
            throw new IllegalArgumentException("Invalid hex restore delta mapping");
        }
        this.f13124 = j;
        this.f13125 = true;
    }

    @Override // p067l.InterfaceC20315
    /* JADX INFO: renamed from: ֫ */
    public final void mo12117(int i, byte[] bArr, int i2, int i3) throws IOException {
        if (!this.f13125 || this.f13121.get() <= 0) {
            throw new ClosedChannelException();
        }
        C10927.m25190(this.f13123, i, i3);
        C10927.m25189(bArr.length, i2, i3);
        if (i3 == 0) {
            return;
        }
        this.f13122.m30791(this.f13124 + ((long) i), bArr, i2, i3);
    }

    @Override // p067l.InterfaceC20315
    /* JADX INFO: renamed from: ᩺ۧ */
    public final InterfaceC20315 mo12121() throws ClosedChannelException {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.f13121;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new ClosedChannelException();
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicInteger atomicInteger = this.f13121;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        if (iDecrementAndGet > 0) {
            return;
        }
        if (iDecrementAndGet < 0) {
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("Hex restore delta source already closed");
        }
        this.f13122.m30793();
    }
}
