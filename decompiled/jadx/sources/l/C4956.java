package l;

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
public final class C4956 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14398(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441) throws Throwable {
        if (C11003.equals(abstractC15440.mo23554(), abstractC15441.mo23554())) {
            throw new IOException("inputFile and outputFile must be different.");
        }
        boolean z = true;
        int iMax = Math.max(1, Runtime.getRuntime().availableProcessors());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i = 0; i < iMax; i++) {
            arrayList.add(abstractC15441.m36520(".part-" + i + ".tmp"));
        }
        try {
            C18090 c18090 = new C18090(abstractC15440);
            try {
                ArrayList arrayList2 = new ArrayList(c18090.m42207());
                for (C3545 c3545 : c18090.m42210()) {
                    if (c3545.m10808()) {
                        throw new IOException("Encrypted entry is not supported: " + c3545.getName());
                    }
                    arrayList2.add(c3545);
                }
                C6083.sort(arrayList2, new C21890(0));
                m14396(c18090, arrayList, arrayList2, iMax, abstractC15441, c18090.m42197());
                try {
                    c18090.close();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC15440) it.next()).mo23552();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (!z) {
                        abstractC15441.mo23552();
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((AbstractC15440) it2.next()).mo23552();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    c18090.close();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14396(C18090 c18090, final ArrayList arrayList, ArrayList arrayList2, int i, AbstractC15440 abstractC15440, String str) throws IOException {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(i);
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorServiceNewFixedThreadPool);
        final C14561 c14561 = new C14561(c18090);
        final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue(arrayList2);
        for (int i2 = 0; i2 < i; i2++) {
            final int i3 = i2;
            executorCompletionService.submit(new Callable(this) { // from class: l.᩹᩺ۡ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C14561 c14562 = c14561;
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                    AbstractC15440 abstractC15441 = (AbstractC15440) arrayList.get(i3);
                    C8918 c8918 = new C8918(abstractC15441);
                    try {
                        c8918.m23018(8);
                        c8918.m23009(10);
                        C18090 c18090M34753 = c14562.m34753();
                        int i4 = 0;
                        while (true) {
                            C3545 c3545 = (C3545) concurrentLinkedQueue2.poll();
                            if (c3545 == null) {
                                c8918.close();
                                return new C20479(abstractC15441, i4);
                            }
                            if (!c3545.isDirectory()) {
                                c8918.m23013(c3545);
                                InputStream inputStreamM42189 = c18090M34753.m42189(c3545);
                                try {
                                    c8918.m23011(inputStreamM42189);
                                    inputStreamM42189.close();
                                    i4++;
                                } catch (Throwable th) {
                                    try {
                                        inputStreamM42189.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            c8918.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            });
        }
        try {
            C8918 c8918 = new C8918(abstractC15440);
            try {
                c8918.m23019(str);
                for (int i4 = 0; i4 < i; i4++) {
                    m14397(m14395(executorCompletionService), c8918);
                }
                c8918.close();
                C1802.m5992(executorServiceNewFixedThreadPool);
            } catch (Throwable th) {
                try {
                    c8918.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            executorServiceNewFixedThreadPool.shutdownNow();
            C1802.m5992(executorServiceNewFixedThreadPool);
            if (th3 instanceof IOException) {
                throw th3;
            }
            throw new IOException(th3);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20479 m14395(ExecutorCompletionService executorCompletionService) throws IOException {
        try {
            try {
                return (C20479) executorCompletionService.take().get();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14397(C20479 c20479, C8918 c8918) {
        if (c20479.f66031 == 0) {
            return;
        }
        C18090 c18090 = new C18090(c20479.f66032);
        try {
            for (C3545 c3545 : c18090.m42210()) {
                if (!c3545.isDirectory() && c3545.m10793() >= c3545.getSize()) {
                    c8918.m23013(c3545);
                    InputStream inputStreamM42189 = c18090.m42189(c3545);
                    try {
                        c8918.m23011(inputStreamM42189);
                        inputStreamM42189.close();
                    } catch (Throwable th) {
                        try {
                            inputStreamM42189.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    c8918.m23014(c3545, c18090);
                }
            }
            c18090.close();
        } catch (Throwable th3) {
            try {
                c18090.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
