package l;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩸ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9FM */
/* JADX INFO: loaded from: classes4.dex */
public final class C21534 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AtomicLong f69215 = new AtomicLong(0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Semaphore f69214 = new Semaphore(1);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long[] m48694(int i) {
        Semaphore semaphore = this.f69214;
        try {
            if (!semaphore.tryAcquire(i, 5000L, TimeUnit.MILLISECONDS)) {
                throw new C10951("Not enough credits (" + semaphore.availablePermits() + " available) to hand out " + i + " sequence numbers");
            }
            long j = i;
            long andAdd = this.f69215.getAndAdd(j);
            int i2 = (int) ((j + andAdd) - andAdd);
            long[] jArr = new long[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                jArr[i3] = ((long) i3) + andAdd;
            }
            return jArr;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            StringBuilder sbM32308 = C13325.m32308(i, "Got interrupted waiting for ", " to be available. Credits available at this moment: ");
            sbM32308.append(semaphore.availablePermits());
            throw new C10951(sbM32308.toString());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m48692() {
        return this.f69214.availablePermits();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48693(int i) {
        this.f69214.release(i);
    }
}
