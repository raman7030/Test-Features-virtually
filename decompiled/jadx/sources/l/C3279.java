package l;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۗܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes2.dex */
public final class C3279 implements InterfaceC18883, InterfaceC4066, InterfaceC2655 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11746 f10315;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f10316;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f10318;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f10314 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f10317 = -1;

    public C3279(C11746 c11746, int i) throws ClosedChannelException {
        this.f10315 = c11746;
        this.f10316 = i;
        c11746.m28746();
    }

    @Override // l.InterfaceC18883
    public final int length() {
        return this.f10316;
    }

    @Override // l.InterfaceC4066
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo10083() {
        return this.f10315;
    }

    @Override // l.InterfaceC4066
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long mo10087() {
        return this.f10315.m28748();
    }

    @Override // l.InterfaceC18883
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean mo10086() {
        return this.f10315.m28744();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10085(long j) {
        if (this.f10314.get() <= 0 || j < 0) {
            throw new IllegalArgumentException("Invalid hex restore delta mapping");
        }
        this.f10317 = j;
        this.f10318 = true;
    }

    @Override // l.InterfaceC18883
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10084(int i, byte[] bArr, int i2, int i3) throws IOException {
        if (!this.f10318 || this.f10314.get() <= 0) {
            throw new ClosedChannelException();
        }
        C9005.m23246(this.f10316, i, i3);
        C9005.m23245(bArr.length, i2, i3);
        if (i3 == 0) {
            return;
        }
        this.f10315.m28743(this.f10317 + ((long) i), bArr, i2, i3);
    }

    @Override // l.InterfaceC18883
    /* JADX INFO: renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18883 mo10088() throws ClosedChannelException {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.f10314;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new ClosedChannelException();
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicInteger atomicInteger = this.f10314;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        if (iDecrementAndGet > 0) {
            return;
        }
        if (iDecrementAndGet < 0) {
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("Hex restore delta source already closed");
        }
        this.f10315.m28745();
    }
}
