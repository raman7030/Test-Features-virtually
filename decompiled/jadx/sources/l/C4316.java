package l;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۙ֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9B2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4316 implements InterfaceC6283 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f13903 = new CountDownLatch(1);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile int f13904 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f13905 = 21320;

    @Override // l.InterfaceC6283
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12970(int i, int i2) {
        if (this.f13905 != i) {
            return;
        }
        this.f13904 = i2;
        this.f13903.countDown();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12972(long j) {
        CountDownLatch countDownLatch = this.f13903;
        try {
            if (j > 0) {
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
                return true;
            }
            countDownLatch.await();
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m12973() {
        return this.f13904 == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12971() {
        return this.f13904 == -1;
    }
}
