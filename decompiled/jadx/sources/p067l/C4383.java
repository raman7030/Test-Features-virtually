package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֫᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F77E */
/* JADX INFO: loaded from: classes2.dex */
public final class C4383 {

    /* JADX INFO: renamed from: ֫ */
    public final C22469 f9860;

    /* JADX INFO: renamed from: ۧ */
    public final C6988 f9861;

    /* JADX INFO: renamed from: ܳ */
    public final C12410 f9862;

    /* JADX INFO: renamed from: ܽ */
    public final AtomicReference f9863;

    /* JADX INFO: renamed from: ܿ */
    public final C21545 f9864;

    /* JADX INFO: renamed from: ᩳ */
    public final C11010 f9865;

    /* JADX INFO: renamed from: ᩻ */
    public final C11740 f9866;

    public C4383(C22469 c22469, C11010 c11010, C11740 c11740, AtomicReference atomicReference) {
        C6988 c6988 = new C6988();
        C21545 c21545 = new C21545();
        C12410 c12410 = new C12410();
        this.f9860 = c22469;
        this.f9865 = c11010;
        this.f9866 = c11740;
        this.f9863 = atomicReference;
        this.f9861 = c6988;
        this.f9864 = c21545;
        this.f9862 = c12410;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9133(List list) throws Exception {
        this.f9861.getClass();
        ExecutorService executorService = C4081.f8990;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C19110.f57020);
        this.f9864.getClass();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AtomicInteger atomicInteger = new AtomicInteger();
        C12410 c12410 = this.f9862;
        AtomicReference atomicReference = this.f9863;
        try {
            if (m9130(list, executorServiceNewFixedThreadPool, new C9727(executorServiceNewSingleThreadExecutor, atomicInteger, atomicReference, c12410)) | m9131(executorServiceNewFixedThreadPool) | m9131(executorServiceNewSingleThreadExecutor)) {
                Thread.currentThread().interrupt();
            }
            Exception exc = (Exception) atomicReference.get();
            if (exc != null) {
                throw exc;
            }
        } catch (Throwable th) {
            if (m9131(executorServiceNewFixedThreadPool) | m9131(executorServiceNewSingleThreadExecutor)) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m9130(List list, ExecutorService executorService, C9727 c9727) throws Throwable {
        C22469 c22469 = this.f9860;
        AtomicReference atomicReference = this.f9863;
        boolean z = false;
        C15581 c15581 = null;
        try {
            Iterator it = list.iterator();
            z = false;
            boolean zM9132 = false;
            C15581 c15582 = null;
            while (it.hasNext()) {
                try {
                    C24299 c24299 = (C24299) it.next();
                    if (((C20457) c22469.f70871).mo3924() || atomicReference.get() != null) {
                        break;
                    }
                    try {
                        if (c24299.f76962 != c15582) {
                            if (z) {
                                c15582.m35431();
                            }
                            c15582 = c24299.f76962;
                            c15582.m35430();
                            z = true;
                        }
                        zM9132 |= m9132(c24299, executorService, c9727);
                    } catch (Exception e) {
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                    if (((C20457) c22469.f70871).mo3924() || atomicReference.get() != null) {
                        break;
                    }
                } catch (Throwable th) {
                    th = th;
                    c15581 = c15582;
                    if (z) {
                        c15581.m35431();
                    }
                    throw th;
                }
            }
            if (z) {
                c15582.m35431();
            }
            return zM9132;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m9132(C24299 c24299, ExecutorService executorService, C9727 c9727) {
        C15581 c15581 = c24299.f76963;
        boolean z = false;
        if (c15581 != null) {
            try {
                if (c15581 != c24299.f76962) {
                    c15581.m35430();
                    z = true;
                }
            } finally {
                if (z) {
                    c15581.m35431();
                }
            }
        }
        return m9129(c24299.f76961, executorService, c9727);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m9129(ArrayList arrayList, ExecutorService executorService, final C9727 c9727) {
        AtomicReference atomicReference;
        ArrayList<Future> arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            atomicReference = this.f9863;
            if (!zHasNext) {
                break;
            }
            final C13571 c13571 = (C13571) it.next();
            if (((C20457) this.f9860.f70871).mo3924() || atomicReference.get() != null) {
                break;
            }
            arrayList2.add(executorService.submit(new Callable() { // from class: l.ۛ᩸ܽ
                @Override // java.util.concurrent.Callable
                public final Object call() throws Throwable {
                    C4383.m9128(this.f22496, c13571, c9727);
                    return null;
                }
            }));
        }
        boolean z = false;
        for (Future future : arrayList2) {
            boolean z2 = false;
            while (!z2) {
                try {
                    future.get();
                } catch (InterruptedException e) {
                    while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                    }
                    z = true;
                } catch (CancellationException unused) {
                } catch (ExecutionException e2) {
                    Throwable cause = e2.getCause();
                    Exception runtimeException = cause instanceof Exception ? (Exception) cause : new RuntimeException(cause);
                    while (!atomicReference.compareAndSet(null, runtimeException) && atomicReference.get() == null) {
                    }
                }
                z2 = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9128(C4383 c4383, C13571 c13571, C9727 c9727) throws Throwable {
        if (((C20457) c4383.f9860.f70871).mo3924() || c4383.f9863.get() != null) {
            return;
        }
        ((C20689) c4383.f9865.f30495).m46754(1);
        C11740 c11740 = c4383.f9866;
        C20457.m46148(c11740.f32778, c11740.f32779, c11740.f32781, c11740.f32783, c11740.f32782, c11740.f32780, c11740.f32784, c13571, c9727);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m9131(ExecutorService executorService) {
        executorService.shutdown();
        boolean z = false;
        while (!executorService.awaitTermination(1L, TimeUnit.DAYS)) {
            try {
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        return z;
    }
}
