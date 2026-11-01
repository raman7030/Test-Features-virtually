package p067l;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩶᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G9ZA */
/* JADX INFO: loaded from: classes4.dex */
public final class C21782 {

    /* JADX INFO: renamed from: ܽ */
    public static InterfaceC4410 f68567 = C13128.m30023(C21782.class.getName());

    /* JADX INFO: renamed from: ֫ */
    public final String f68568;

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f68569 = new ConcurrentMapC12768(50);

    public C21782(String str) {
        this.f68568 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49154(long j) {
        Thread threadCurrentThread = Thread.currentThread();
        ConcurrentMapC12768 concurrentMapC12768 = this.f68569;
        if (((Semaphore) concurrentMapC12768.get(threadCurrentThread)) == null) {
            Semaphore semaphore = new Semaphore(1, true);
            semaphore.drainPermits();
            concurrentMapC12768.putIfAbsent(threadCurrentThread, semaphore);
        }
        try {
            ((Semaphore) concurrentMapC12768.get(threadCurrentThread)).tryAcquire(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            f68567.mo9176("Exception ", (Exception) e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49153() {
        Collection<Semaphore> collectionValues = this.f68569.values();
        for (Semaphore semaphore : collectionValues) {
            semaphore.release();
            collectionValues.remove(semaphore);
        }
    }

    public final String toString() {
        StringBuilder sbM34407 = C15033.m34407(1000, "Semaphore: ");
        sbM34407.append(this.f68568);
        ConcurrentMapC12768 concurrentMapC12768 = this.f68569;
        if (concurrentMapC12768.size() == 0) {
            sbM34407.append(" no semaphores.");
        } else {
            sbM34407.append(" semaphores:\n");
            for (Map.Entry entry : concurrentMapC12768.entrySet()) {
                sbM34407.append("\tThread: ");
                sbM34407.append(((Thread) entry.getKey()).getName());
                sbM34407.append(' ');
                sbM34407.append(entry.getValue());
                sbM34407.append('\n');
            }
        }
        return sbM34407.toString();
    }
}
