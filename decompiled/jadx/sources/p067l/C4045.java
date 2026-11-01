package p067l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.֫ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 713E */
/* JADX INFO: loaded from: classes2.dex */
public final class C4045 {

    /* JADX INFO: renamed from: ܳ */
    public final AtomicLong f8895 = new AtomicLong(0);

    /* JADX INFO: renamed from: ܿ */
    public final AtomicInteger f8897 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ܽ */
    public final AtomicLong f8896 = new AtomicLong(0);

    /* JADX INFO: renamed from: ۧ */
    public final AtomicInteger f8894 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f8893 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ */
    public final AtomicInteger f8898 = new AtomicInteger();

    /* JADX INFO: renamed from: ֫ */
    public final void m8102(String[] strArr, final boolean z, final InterfaceC15501 interfaceC15501) {
        AtomicInteger atomicInteger = this.f8898;
        if (atomicInteger.get() != 0) {
            throw new RuntimeException();
        }
        ExecutorService executorServiceNewSingleThreadExecutor = null;
        for (String str : strArr) {
            if (interfaceC15501.mo3924()) {
                break;
            }
            AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
            final C9467 c9467 = new C9467(abstractC17043M42109, abstractC17043M42109.getName());
            if (z) {
                c9467.m21988();
            }
            m8101(c9467);
            if (c9467.f25915 && !c9467.f25914) {
                atomicInteger.incrementAndGet();
                if (executorServiceNewSingleThreadExecutor == null) {
                    executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                }
                final ExecutorService executorService = executorServiceNewSingleThreadExecutor;
                executorService.submit(new Runnable() { // from class: l.ۨ۫ܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorService executorService2 = executorService;
                        InterfaceC15501 interfaceC15502 = interfaceC15501;
                        C4045 c4045 = this.f37906;
                        C9467 c9468 = c9467;
                        c4045.m8097(c9468.f25907, C10965.m25286(new StringBuilder(), c9468.f25908, "/"), z, executorService2, interfaceC15502);
                    }
                });
                executorServiceNewSingleThreadExecutor = executorService;
            }
        }
        while (atomicInteger.get() != 0) {
            SystemClock.sleep(1L);
        }
        if (executorServiceNewSingleThreadExecutor != null) {
            C4081.m8189(executorServiceNewSingleThreadExecutor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m8097(AbstractC17043 abstractC17043, String str, final boolean z, final ExecutorService executorService, final InterfaceC15501 interfaceC15501) {
        boolean zMo3924 = interfaceC15501.mo3924();
        AtomicInteger atomicInteger = this.f8898;
        if (zMo3924) {
            atomicInteger.decrementAndGet();
            return;
        }
        for (AbstractC17043 abstractC17044 : abstractC17043.mo25500(true)) {
            if (interfaceC15501.mo3924()) {
                atomicInteger.decrementAndGet();
                return;
            }
            StringBuilder sbM17248 = C7470.m17248(str);
            sbM17248.append(abstractC17044.getName());
            final C9467 c9467 = new C9467(abstractC17044, sbM17248.toString());
            if (z) {
                c9467.m21988();
            }
            m8101(c9467);
            if (c9467.f25915 && !c9467.f25914) {
                atomicInteger.incrementAndGet();
                executorService.submit(new Runnable() { // from class: l.᩺۫ܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorService executorService2 = executorService;
                        InterfaceC15501 interfaceC15502 = interfaceC15501;
                        C4045 c4045 = this.f76762;
                        C9467 c9468 = c9467;
                        c4045.m8097(c9468.f25907, C10965.m25286(new StringBuilder(), c9468.f25908, "/"), z, executorService2, interfaceC15502);
                    }
                });
            }
        }
        atomicInteger.decrementAndGet();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8101(C9467 c9467) {
        synchronized (this.f8893) {
            this.f8893.add(c9467);
        }
        if (!c9467.f25915) {
            this.f8895.addAndGet(c9467.f25916);
        }
        this.f8897.incrementAndGet();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m8106() {
        return this.f8895.get();
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m8103() {
        return this.f8896.get();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m8104() {
        return this.f8897.get();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m8099() {
        return this.f8894.get();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8100(long j) {
        this.f8896.addAndGet(j);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m8105() {
        this.f8894.incrementAndGet();
    }
}
