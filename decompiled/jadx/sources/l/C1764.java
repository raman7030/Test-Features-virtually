package l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.֫ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 713E */
/* JADX INFO: loaded from: classes2.dex */
public final class C1764 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f6119 = new AtomicLong(0);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f6121 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f6120 = new AtomicLong(0);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f6118 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f6117 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f6122 = new AtomicInteger();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5892(String[] strArr, final boolean z, final InterfaceC13818 interfaceC13818) {
        AtomicInteger atomicInteger = this.f6122;
        if (atomicInteger.get() != 0) {
            throw new RuntimeException();
        }
        ExecutorService executorServiceNewSingleThreadExecutor = null;
        for (String str : strArr) {
            if (interfaceC13818.mo1526()) {
                break;
            }
            AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
            final C7469 c7469 = new C7469(abstractC15440M39866, abstractC15440M39866.getName());
            if (z) {
                c7469.m20013();
            }
            m5891(c7469);
            if (c7469.f23002 && !c7469.f23001) {
                atomicInteger.incrementAndGet();
                if (executorServiceNewSingleThreadExecutor == null) {
                    executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                }
                final ExecutorService executorService = executorServiceNewSingleThreadExecutor;
                executorService.submit(new Runnable() { // from class: l.ۨ۫ܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorService executorService2 = executorService;
                        InterfaceC13818 interfaceC13819 = interfaceC13818;
                        C1764 c1764 = this.f34907;
                        C7469 c74610 = c7469;
                        c1764.m5887(c74610.f22994, C9045.m23341(new StringBuilder(), c74610.f22995, "/"), z, executorService2, interfaceC13819);
                    }
                });
                executorServiceNewSingleThreadExecutor = executorService;
            }
        }
        while (atomicInteger.get() != 0) {
            SystemClock.sleep(1L);
        }
        if (executorServiceNewSingleThreadExecutor != null) {
            C1802.m5992(executorServiceNewSingleThreadExecutor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m5887(AbstractC15440 abstractC15440, String str, final boolean z, final ExecutorService executorService, final InterfaceC13818 interfaceC13818) {
        boolean zMo1526 = interfaceC13818.mo1526();
        AtomicInteger atomicInteger = this.f6122;
        if (zMo1526) {
            atomicInteger.decrementAndGet();
            return;
        }
        for (AbstractC15440 abstractC15441 : abstractC15440.mo23549(true)) {
            if (interfaceC13818.mo1526()) {
                atomicInteger.decrementAndGet();
                return;
            }
            StringBuilder sbM15339 = C5368.m15339(str);
            sbM15339.append(abstractC15441.getName());
            final C7469 c7469 = new C7469(abstractC15441, sbM15339.toString());
            if (z) {
                c7469.m20013();
            }
            m5891(c7469);
            if (c7469.f23002 && !c7469.f23001) {
                atomicInteger.incrementAndGet();
                executorService.submit(new Runnable() { // from class: l.᩺۫ܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorService executorService2 = executorService;
                        InterfaceC13818 interfaceC13819 = interfaceC13818;
                        C1764 c1764 = this.f74027;
                        C7469 c74610 = c7469;
                        c1764.m5887(c74610.f22994, C9045.m23341(new StringBuilder(), c74610.f22995, "/"), z, executorService2, interfaceC13819);
                    }
                });
            }
        }
        atomicInteger.decrementAndGet();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5891(C7469 c7469) {
        synchronized (this.f6117) {
            this.f6117.add(c7469);
        }
        if (!c7469.f23002) {
            this.f6119.addAndGet(c7469.f23003);
        }
        this.f6121.incrementAndGet();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m5896() {
        return this.f6119.get();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m5893() {
        return this.f6120.get();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m5894() {
        return this.f6121.get();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m5889() {
        return this.f6118.get();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5890(long j) {
        this.f6120.addAndGet(j);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m5895() {
        this.f6118.incrementAndGet();
    }
}
