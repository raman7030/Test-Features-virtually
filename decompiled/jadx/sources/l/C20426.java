package l;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩶᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G9ZA */
/* JADX INFO: loaded from: classes4.dex */
public final class C20426 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f65892 = C11321.m27962(C20426.class.getName());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f65893;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f65894 = new ConcurrentMapC10942(50);

    public C20426(String str) {
        this.f65893 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46831(long j) {
        Thread threadCurrentThread = Thread.currentThread();
        ConcurrentMapC10942 concurrentMapC10942 = this.f65894;
        if (((Semaphore) concurrentMapC10942.get(threadCurrentThread)) == null) {
            Semaphore semaphore = new Semaphore(1, true);
            semaphore.drainPermits();
            concurrentMapC10942.putIfAbsent(threadCurrentThread, semaphore);
        }
        try {
            ((Semaphore) concurrentMapC10942.get(threadCurrentThread)).tryAcquire(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            f65892.mo7081("Exception ", (Exception) e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46830() {
        Collection<Semaphore> collectionValues = this.f65894.values();
        for (Semaphore semaphore : collectionValues) {
            semaphore.release();
            collectionValues.remove(semaphore);
        }
    }

    public final String toString() {
        StringBuilder sbM32307 = C13325.m32307(1000, "Semaphore: ");
        sbM32307.append(this.f65893);
        ConcurrentMapC10942 concurrentMapC10942 = this.f65894;
        if (concurrentMapC10942.size() == 0) {
            sbM32307.append(" no semaphores.");
        } else {
            sbM32307.append(" semaphores:\n");
            for (Map.Entry entry : concurrentMapC10942.entrySet()) {
                sbM32307.append("\tThread: ");
                sbM32307.append(((Thread) entry.getKey()).getName());
                sbM32307.append(' ');
                sbM32307.append(entry.getValue());
                sbM32307.append('\n');
            }
        }
        return sbM32307.toString();
    }
}
