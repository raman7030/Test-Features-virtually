package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.ۙ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7HC */
/* JADX INFO: loaded from: classes2.dex */
public final class C7079 {
    /* JADX INFO: renamed from: ֫ */
    public final void m16301(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044) throws Throwable {
        if (C12826.equals(abstractC17043.mo25505(), abstractC17044.mo25505())) {
            throw new IOException("inputFile and outputFile must be different.");
        }
        boolean z = true;
        int iMax = Math.max(1, Runtime.getRuntime().availableProcessors());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i = 0; i < iMax; i++) {
            arrayList.add(abstractC17044.m38678(".part-" + i + ".tmp"));
        }
        try {
            C19561 c19561 = new C19561(abstractC17043);
            try {
                ArrayList arrayList2 = new ArrayList(c19561.m44466());
                for (C5738 c5738 : c19561.m44469()) {
                    if (c5738.m12789()) {
                        throw new IOException("Encrypted entry is not supported: " + c5738.getName());
                    }
                    arrayList2.add(c5738);
                }
                C8150.sort(arrayList2, new C23173(0));
                m16299(c19561, arrayList, arrayList2, iMax, abstractC17044, c19561.m44456());
                try {
                    c19561.close();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC17043) it.next()).mo25503();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (!z) {
                        abstractC17044.mo25503();
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((AbstractC17043) it2.next()).mo25503();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    c19561.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th = th4;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16299(C19561 c19561, final ArrayList arrayList, ArrayList arrayList2, int i, AbstractC17043 abstractC17043, String str) throws IOException {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(i);
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorServiceNewFixedThreadPool);
        final C16207 c16207 = new C16207(c19561);
        final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue(arrayList2);
        for (int i2 = 0; i2 < i; i2++) {
            final int i3 = i2;
            executorCompletionService.submit(new Callable(this) { // from class: l.᩹᩺ۡ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C16207 c16208 = c16207;
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                    AbstractC17043 abstractC17044 = (AbstractC17043) arrayList.get(i3);
                    C10844 c10844 = new C10844(abstractC17044);
                    try {
                        c10844.m24992(8);
                        c10844.m24983(10);
                        C19561 c19561M36902 = c16208.m36902();
                        int i4 = 0;
                        while (true) {
                            C5738 c5738 = (C5738) concurrentLinkedQueue2.poll();
                            if (c5738 == null) {
                                c10844.close();
                                return new C21832(abstractC17044, i4);
                            }
                            if (!c5738.isDirectory()) {
                                c10844.m24987(c5738);
                                InputStream inputStreamM44448 = c19561M36902.m44448(c5738);
                                try {
                                    c10844.m24985(inputStreamM44448);
                                    inputStreamM44448.close();
                                    i4++;
                                } catch (Throwable th) {
                                    try {
                                        inputStreamM44448.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            c10844.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            });
        }
        try {
            C10844 c10844 = new C10844(abstractC17043);
            try {
                c10844.m24993(str);
                for (int i4 = 0; i4 < i; i4++) {
                    m16300(m16298(executorCompletionService), c10844);
                }
                c10844.close();
                C4081.m8189(executorServiceNewFixedThreadPool);
            } catch (Throwable th) {
                try {
                    c10844.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            executorServiceNewFixedThreadPool.shutdownNow();
            C4081.m8189(executorServiceNewFixedThreadPool);
            if (th3 instanceof IOException) {
                throw th3;
            }
            throw new IOException(th3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21832 m16298(ExecutorCompletionService executorCompletionService) throws IOException {
        try {
            try {
                return (C21832) executorCompletionService.take().get();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IOException("Interrupted while reading partition result.", e);
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new IOException(cause);
            }
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            throw new IOException("Interrupted while waiting partition result.", e3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16300(C21832 c21832, C10844 c10844) {
        if (c21832.f68708 == 0) {
            return;
        }
        C19561 c19561 = new C19561(c21832.f68709);
        try {
            for (C5738 c5738 : c19561.m44469()) {
                if (!c5738.isDirectory() && c5738.m12774() >= c5738.getSize()) {
                    c10844.m24987(c5738);
                    InputStream inputStreamM44448 = c19561.m44448(c5738);
                    try {
                        c10844.m24985(inputStreamM44448);
                        inputStreamM44448.close();
                    } catch (Throwable th) {
                        try {
                            inputStreamM44448.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    c10844.m24988(c5738, c19561);
                }
            }
            c19561.close();
        } catch (Throwable th3) {
            try {
                c19561.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
