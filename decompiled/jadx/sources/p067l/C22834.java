package p067l;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩸ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9FM */
/* JADX INFO: loaded from: classes4.dex */
public final class C22834 {

    /* JADX INFO: renamed from: ۧ */
    public AtomicLong f71915 = new AtomicLong(0);

    /* JADX INFO: renamed from: ֫ */
    public Semaphore f71914 = new Semaphore(1);

    /* JADX INFO: renamed from: ۧ */
    public final long[] m51039(int i) {
        Semaphore semaphore = this.f71914;
        try {
            if (!semaphore.tryAcquire(i, 5000L, TimeUnit.MILLISECONDS)) {
                throw new C12776("Not enough credits (" + semaphore.availablePermits() + " available) to hand out " + i + " sequence numbers");
            }
            long j = i;
            long andAdd = this.f71915.getAndAdd(j);
            int i2 = (int) ((j + andAdd) - andAdd);
            long[] jArr = new long[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                jArr[i3] = ((long) i3) + andAdd;
            }
            return jArr;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            StringBuilder sbM34408 = C15033.m34408(i, "Got interrupted waiting for ", " to be available. Credits available at this moment: ");
            sbM34408.append(semaphore.availablePermits());
            throw new C12776(sbM34408.toString());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m51037() {
        return this.f71914.availablePermits();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51038(int i) {
        this.f71914.release(i);
    }
}
