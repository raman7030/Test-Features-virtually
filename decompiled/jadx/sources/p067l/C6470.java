package p067l;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۙ֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9B2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6470 implements InterfaceC8340 {

    /* JADX INFO: renamed from: ֫ */
    public final CountDownLatch f16718 = new CountDownLatch(1);

    /* JADX INFO: renamed from: ۧ */
    public volatile int f16719 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ܽ */
    public final int f16720 = 21320;

    @Override // p067l.InterfaceC8340
    /* JADX INFO: renamed from: ֫ */
    public final void mo14834(int i, int i2) {
        if (this.f16720 != i) {
            return;
        }
        this.f16719 = i2;
        this.f16718.countDown();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m14836(long j) {
        CountDownLatch countDownLatch = this.f16718;
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

    /* JADX INFO: renamed from: ۧ */
    public final boolean m14837() {
        return this.f16719 == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m14835() {
        return this.f16719 == -1;
    }
}
