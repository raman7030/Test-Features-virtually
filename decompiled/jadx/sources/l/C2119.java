package l;

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
public final class C2119 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21149 f7075;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4860 f7076;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C10565 f7077;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f7078;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20177 f7079;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C9092 f7080;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9860 f7081;

    public C2119(C21149 c21149, C9092 c9092, C9860 c9860, AtomicReference atomicReference) {
        C4860 c4860 = new C4860();
        C20177 c20177 = new C20177();
        C10565 c10565 = new C10565();
        this.f7075 = c21149;
        this.f7080 = c9092;
        this.f7081 = c9860;
        this.f7078 = atomicReference;
        this.f7076 = c4860;
        this.f7079 = c20177;
        this.f7077 = c10565;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7022(List list) throws Exception {
        this.f7076.getClass();
        ExecutorService executorService = C1802.f6211;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C17615.f53826);
        this.f7079.getClass();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AtomicInteger atomicInteger = new AtomicInteger();
        C10565 c10565 = this.f7077;
        AtomicReference atomicReference = this.f7078;
        try {
            if (m7019(list, executorServiceNewFixedThreadPool, new C7742(executorServiceNewSingleThreadExecutor, atomicInteger, atomicReference, c10565)) | m7020(executorServiceNewFixedThreadPool) | m7020(executorServiceNewSingleThreadExecutor)) {
                Thread.currentThread().interrupt();
            }
            Exception exc = (Exception) atomicReference.get();
            if (exc != null) {
                throw exc;
            }
        } catch (Throwable th) {
            if (m7020(executorServiceNewFixedThreadPool) | m7020(executorServiceNewSingleThreadExecutor)) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m7019(List list, ExecutorService executorService, C7742 c7742) throws Throwable {
        C21149 c21149 = this.f7075;
        AtomicReference atomicReference = this.f7078;
        boolean z = false;
        C13902 c13902 = null;
        try {
            Iterator it = list.iterator();
            z = false;
            boolean zM7021 = false;
            C13902 c13903 = null;
            while (it.hasNext()) {
                try {
                    C23075 c23075 = (C23075) it.next();
                    if (((C19032) c21149.f68189).mo1526() || atomicReference.get() != null) {
                        break;
                    }
                    try {
                        if (c23075.f74217 != c13903) {
                            if (z) {
                                c13903.m33312();
                            }
                            c13903 = c23075.f74217;
                            c13903.m33311();
                            z = true;
                        }
                        zM7021 |= m7021(c23075, executorService, c7742);
                    } catch (Exception e) {
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                    if (((C19032) c21149.f68189).mo1526() || atomicReference.get() != null) {
                        break;
                    }
                } catch (Throwable th) {
                    th = th;
                    c13902 = c13903;
                    if (z) {
                        c13902.m33312();
                    }
                    throw th;
                }
            }
            if (z) {
                c13903.m33312();
            }
            return zM7021;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m7021(C23075 c23075, ExecutorService executorService, C7742 c7742) {
        C13902 c13902 = c23075.f74218;
        boolean z = false;
        if (c13902 != null) {
            try {
                if (c13902 != c23075.f74217) {
                    c13902.m33311();
                    z = true;
                }
            } finally {
                if (z) {
                    c13902.m33312();
                }
            }
        }
        return m7018(c23075.f74216, executorService, c7742);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m7018(ArrayList arrayList, ExecutorService executorService, final C7742 c7742) {
        AtomicReference atomicReference;
        ArrayList<Future> arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            atomicReference = this.f7078;
            if (!zHasNext) {
                break;
            }
            final C11787 c11787 = (C11787) it.next();
            if (((C19032) this.f7075.f68189).mo1526() || atomicReference.get() != null) {
                break;
            }
            arrayList2.add(executorService.submit(new Callable() { // from class: l.ۛ᩸ܽ
                @Override // java.util.concurrent.Callable
                public final Object call() throws Throwable {
                    C2119.m7017(this.f19625, c11787, c7742);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7017(C2119 c2119, C11787 c11787, C7742 c7742) throws Throwable {
        if (((C19032) c2119.f7075.f68189).mo1526() || c2119.f7078.get() != null) {
            return;
        }
        ((C19277) c2119.f7080.f27558).m44460(1);
        C9860 c9860 = c2119.f7081;
        C19032.m43880(c9860.f29825, c9860.f29826, c9860.f29828, c9860.f29830, c9860.f29829, c9860.f29827, c9860.f29831, c11787, c7742);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m7020(ExecutorService executorService) {
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
