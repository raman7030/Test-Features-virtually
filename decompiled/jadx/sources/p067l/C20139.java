package p067l;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ᩴۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57TP */
/* JADX INFO: loaded from: classes4.dex */
public final class C20139 {

    /* JADX INFO: renamed from: ֫ */
    public final C20622 f62351;

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f62352 = new ConcurrentMapC12768();

    public C20139(AbstractC5160 abstractC5160, C8192 c8192) {
        this.f62351 = new C20622(abstractC5160, c8192);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m45582(final Object obj) {
        C12826.toString(obj);
        Thread.currentThread().getName();
        final C4716 c4716 = (C4716) C19473.computeIfAbsent(this.f62352, obj, new C11422());
        if (c4716.isEmpty()) {
            C20622 c20622 = this.f62351;
            if (c20622.m46584(obj) > 0) {
                try {
                    return c20622.m46581(obj);
                } catch (Exception unused) {
                }
            }
        }
        final C6057 c6057 = new C6057(0);
        c4716.offer(c6057);
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ExecutorService executorService = C4081.f8987;
        executorService.submit(new Callable() { // from class: l.ۡۤܳ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C20139.m45580(this.f29808, obj, atomicReference, c6057, countDownLatch, c4716, atomicReference2);
                return null;
            }
        });
        Future futureSubmit = executorService.submit(new Callable() { // from class: l.ܺۤܳ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C20139.m45581(this.f52190, c6057, obj, atomicReference, countDownLatch, c4716);
                return null;
            }
        });
        try {
            countDownLatch.await();
            Exception exc = (Exception) atomicReference2.get();
            if (exc != null) {
                throw exc;
            }
            Object obj2 = atomicReference.get();
            if (obj2 == null) {
                throw new RuntimeException("Failed to get object");
            }
            c4716.remove(c6057);
            c6057.m13646();
            if (!futureSubmit.isDone()) {
                futureSubmit.cancel(true);
            }
            return obj2;
        } catch (Throwable th) {
            c4716.remove(c6057);
            c6057.m13646();
            if (!futureSubmit.isDone()) {
                futureSubmit.cancel(true);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m45580(C20139 c20139, Object obj, AtomicReference atomicReference, C6057 c6057, CountDownLatch countDownLatch, C4716 c4716, AtomicReference atomicReference2) {
        try {
            Object objM46581 = c20139.f62351.m46581(obj);
            C12826.toString(objM46581);
            C12826.toString(obj);
            while (!atomicReference.compareAndSet(null, objM46581)) {
                if (atomicReference.get() != null) {
                    c20139.m45579(obj, objM46581, c4716);
                    return;
                }
            }
            c6057.m13648();
            countDownLatch.countDown();
        } catch (Exception e) {
            C12826.toString(obj);
            while (!atomicReference2.compareAndSet(null, e) && atomicReference2.get() == null) {
            }
            c6057.m13648();
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m45581(C20139 c20139, C6057 c6057, Object obj, AtomicReference atomicReference, CountDownLatch countDownLatch, C4716 c4716) {
        try {
            Object objM13649 = c6057.m13649();
            if (objM13649 != null) {
                objM13649.toString();
                C12826.toString(obj);
                while (!atomicReference.compareAndSet(null, objM13649)) {
                    if (atomicReference.get() != null) {
                        c20139.m45579(obj, objM13649, c4716);
                        return;
                    }
                }
                c6057.m13648();
                countDownLatch.countDown();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45579(Object obj, Object obj2, C4716 c4716) {
        C6057 c6057;
        do {
            c6057 = (C6057) c4716.poll();
            if (c6057 == null) {
                this.f62351.m46582(obj, obj2);
                C12826.toString(obj2);
                C12826.toString(obj);
                return;
            }
        } while (!c6057.m13647(obj2));
        C12826.toString(obj2);
        C12826.toString(obj);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m45585(Object obj, Object obj2) {
        C6057 c6057;
        C12826.toString(obj);
        C12826.toString(obj2);
        Thread.currentThread().getName();
        C4716 c4716 = (C4716) this.f62352.get(obj);
        if (c4716 != null) {
            do {
                c6057 = (C6057) c4716.poll();
                if (c6057 != null) {
                }
            } while (!c6057.m13647(obj2));
            return;
        }
        this.f62351.m46582(obj, obj2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m45584(Object obj) {
        this.f62351.m46583(obj);
        C4716 c4716 = (C4716) this.f62352.remove(obj);
        if (c4716 == null) {
            return;
        }
        while (true) {
            C6057 c6057 = (C6057) c4716.poll();
            if (c6057 == null) {
                return;
            } else {
                c6057.m13646();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45583(Object obj, Object obj2) {
        C20622 c20622 = this.f62351;
        c20622.getClass();
        EnumC13877 enumC13877 = EnumC13877.NORMAL;
        c20622.m46579(obj, obj2);
    }
}
