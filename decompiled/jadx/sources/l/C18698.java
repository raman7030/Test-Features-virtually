package l;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ᩴۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57TP */
/* JADX INFO: loaded from: classes4.dex */
public final class C18698 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19207 f59128;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f59129 = new ConcurrentMapC10942();

    public C18698(AbstractC2938 abstractC2938, C6127 c6127) {
        this.f59128 = new C19207(abstractC2938, c6127);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m43316(final Object obj) {
        C11003.toString(obj);
        Thread.currentThread().getName();
        final C2470 c2470 = (C2470) C17997.computeIfAbsent(this.f59129, obj, new C9526());
        if (c2470.isEmpty()) {
            C19207 c19207 = this.f59128;
            if (c19207.m44289(obj) > 0) {
                try {
                    return c19207.m44286(obj);
                } catch (Exception unused) {
                }
            }
        }
        final C3881 c3881 = new C3881(0);
        c2470.offer(c3881);
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ExecutorService executorService = C1802.f6208;
        executorService.submit(new Callable() { // from class: l.ۡۤܳ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C18698.m43314(this.f26883, obj, atomicReference, c3881, countDownLatch, c2470, atomicReference2);
                return null;
            }
        });
        Future futureSubmit = executorService.submit(new Callable() { // from class: l.ܺۤܳ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C18698.m43315(this.f49052, c3881, obj, atomicReference, countDownLatch, c2470);
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
            c2470.remove(c3881);
            c3881.m11710();
            if (!futureSubmit.isDone()) {
                futureSubmit.cancel(true);
            }
            return obj2;
        } catch (Throwable th) {
            c2470.remove(c3881);
            c3881.m11710();
            if (!futureSubmit.isDone()) {
                futureSubmit.cancel(true);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43314(C18698 c18698, Object obj, AtomicReference atomicReference, C3881 c3881, CountDownLatch countDownLatch, C2470 c2470, AtomicReference atomicReference2) {
        try {
            Object objM44286 = c18698.f59128.m44286(obj);
            C11003.toString(objM44286);
            C11003.toString(obj);
            while (!atomicReference.compareAndSet(null, objM44286)) {
                if (atomicReference.get() != null) {
                    c18698.m43313(obj, objM44286, c2470);
                    return;
                }
            }
            c3881.m11712();
            countDownLatch.countDown();
        } catch (Exception e) {
            C11003.toString(obj);
            while (!atomicReference2.compareAndSet(null, e) && atomicReference2.get() == null) {
            }
            c3881.m11712();
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43315(C18698 c18698, C3881 c3881, Object obj, AtomicReference atomicReference, CountDownLatch countDownLatch, C2470 c2470) {
        try {
            Object objM11713 = c3881.m11713();
            if (objM11713 != null) {
                objM11713.toString();
                C11003.toString(obj);
                while (!atomicReference.compareAndSet(null, objM11713)) {
                    if (atomicReference.get() != null) {
                        c18698.m43313(obj, objM11713, c2470);
                        return;
                    }
                }
                c3881.m11712();
                countDownLatch.countDown();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43313(Object obj, Object obj2, C2470 c2470) {
        C3881 c3881;
        do {
            c3881 = (C3881) c2470.poll();
            if (c3881 == null) {
                this.f59128.m44287(obj, obj2);
                C11003.toString(obj2);
                C11003.toString(obj);
                return;
            }
        } while (!c3881.m11711(obj2));
        C11003.toString(obj2);
        C11003.toString(obj);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43319(Object obj, Object obj2) {
        C3881 c3881;
        C11003.toString(obj);
        C11003.toString(obj2);
        Thread.currentThread().getName();
        C2470 c2470 = (C2470) this.f59129.get(obj);
        if (c2470 != null) {
            do {
                c3881 = (C3881) c2470.poll();
                if (c3881 != null) {
                }
            } while (!c3881.m11711(obj2));
            return;
        }
        this.f59128.m44287(obj, obj2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43318(Object obj) {
        this.f59128.m44288(obj);
        C2470 c2470 = (C2470) this.f59129.remove(obj);
        if (c2470 == null) {
            return;
        }
        while (true) {
            C3881 c3881 = (C3881) c2470.poll();
            if (c3881 == null) {
                return;
            } else {
                c3881.m11710();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43317(Object obj, Object obj2) {
        C19207 c19207 = this.f59128;
        c19207.getClass();
        EnumC12110 enumC12110 = EnumC12110.NORMAL;
        c19207.m44284(obj, obj2);
    }
}
