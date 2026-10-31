package l;

import bin.mt.plus.R;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۧ᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 28AQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11339 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC1025 f33915;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC3163 f33916;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public AbstractC3163 f33919;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC22560 f33920;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C13887 f33921;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15249 f33924;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f33926;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C20323 f33929;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f33922 = C16895.m39756();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List f33927 = C16895.m39756();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f33918 = new ThreadLocal();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f33917 = new ThreadLocal();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f33925 = new AtomicReference();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f33928 = C16895.m39756();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f33923 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28011(AbstractC3163 abstractC3163, AbstractC3163 abstractC3164, String str, String[] strArr, String str2, InterfaceC1025 interfaceC1025) throws Exception {
        this.f33916 = abstractC3163;
        this.f33919 = abstractC3164;
        this.f33915 = interfaceC1025;
        AbstractC15440 abstractC15440M39866 = C16999.m39866(str2, new String[0]);
        this.f33926 = abstractC15440M39866;
        abstractC15440M39866.mo23552();
        this.f33926.m36508();
        C7538 c7538 = new C7538(this, interfaceC1025);
        if (abstractC3164 == null) {
            C15249 c15249M36218 = C15249.m36218(c7538);
            this.f33924 = c15249M36218;
            if (!abstractC3163.f9955.f11350) {
                c15249M36218.m36246();
            }
            this.f33924.m36240(strArr, abstractC3163);
        } else {
            if (!str.endsWith("/")) {
                str = str.concat("/");
            }
            this.f33923 = str.length();
            C15249 c15249M36215 = C15249.m36215(str, abstractC3164, new C4586(false), c7538);
            this.f33924 = c15249M36215;
            if (!abstractC3163.f9955.f11350 || !abstractC3164.f9955.f11350) {
                c15249M36215.m36246();
            }
            this.f33924.m36241(strArr, abstractC3163, abstractC3164, interfaceC1025);
        }
        C20323 c20323 = this.f33929;
        if (c20323 != null) {
            this.f33924.m36237(c20323);
        }
        interfaceC1025.setTitle(R.string.MT_Protector);
        interfaceC1025.mo3550(this.f33924);
        interfaceC1025.mo3551();
        C4300 c4300 = new C4300(0);
        this.f33921 = new C13887(this, interfaceC1025);
        this.f33920 = new C2166(this, interfaceC1025, c4300);
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(abstractC3163.m9704());
        c4300.m12878();
        Iterator it = this.f33924.m36248().iterator();
        while (it.hasNext()) {
            m28005(executorServiceNewFixedThreadPool, (AbstractC1139) it.next());
        }
        C1802.m5992(executorServiceNewFixedThreadPool);
        c4300.m12879();
        Iterator it2 = this.f33927.iterator();
        while (it2.hasNext()) {
            C0349.m1793((C8918) it2.next());
        }
        Exception exc = (Exception) this.f33925.get();
        if (exc != null) {
            throw exc;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m28007(C11339 c11339, InterfaceC1025 interfaceC1025) {
        return interfaceC1025.mo1526() || c11339.f33925.get() != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28012(C20323 c20323) {
        this.f33929 = c20323;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28005(ExecutorService executorService, AbstractC1139 abstractC1139) {
        executorService.submit(new RunnableC15148(1, this, abstractC1139));
        if (abstractC1139.m3888()) {
            Iterator it = abstractC1139.mo1983().m1988().iterator();
            while (it.hasNext()) {
                m28005(executorService, (AbstractC1139) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28006(C11339 c11339, AbstractC1139 abstractC1139) {
        ThreadLocal threadLocal = c11339.f33917;
        if (c11339.f33921.mo1526()) {
            return;
        }
        c11339.f33918.set(abstractC1139.m3898());
        c11339.f33915.setName(abstractC1139.m3898());
        try {
            C8918 c8918 = (C8918) threadLocal.get();
            if (c8918 == null) {
                AbstractC15440 abstractC15440M36535 = c11339.f33926.m36535(".zip");
                C8918 c8919 = new C8918(abstractC15440M36535);
                threadLocal.set(c8919);
                c11339.f33927.add(c8919);
                c11339.f33922.add(abstractC15440M36535);
                c8918 = c8919;
            }
            if (abstractC1139.m3888()) {
                C3545 c3545 = new C3545(abstractC1139.m3900().substring(c11339.f33923) + "/");
                c3545.setTime(abstractC1139.m3887());
                C18996.m43833(c3545, abstractC1139);
                c8918.m23013(c3545);
            } else {
                C3545 c3546 = (abstractC1139.m3879() && abstractC1139.m3908()) ? new C3545(c11339.f33919.mo9709(abstractC1139.m3900()).substring(c11339.f33923)) : new C3545(abstractC1139.m3900().substring(c11339.f33923));
                c3546.setTime(abstractC1139.m3887());
                C18996.m43833(c3546, abstractC1139);
                c8918.m23013(c3546);
                InterfaceC17889 interfaceC17889M33351 = c11339.f33916.m33351(abstractC1139.m3910());
                if (!abstractC1139.m3909()) {
                    AbstractC3163 abstractC3163 = c11339.f33916;
                    abstractC3163.getClass();
                    C15688 c15688 = (C15688) interfaceC17889M33351;
                    InputStream inputStreamMo9681 = abstractC3163.mo9681(0L, c15688.getPath());
                    try {
                        if (inputStreamMo9681 == null) {
                            c11339.f33915.mo3549();
                            if (inputStreamMo9681 != null) {
                                inputStreamMo9681.close();
                                return;
                            }
                            return;
                        }
                        C14176.m33825(inputStreamMo9681, c8918.m23007(), c15688.getSize(), c11339.f33920);
                        inputStreamMo9681.close();
                    } catch (Throwable th) {
                        if (inputStreamMo9681 != null) {
                            try {
                                inputStreamMo9681.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            }
            c11339.f33924.m47715();
            if (abstractC1139.m3893() != null) {
                c11339.f33928.add((String) abstractC1139.m3893());
            }
            c11339.f33915.mo3550(c11339.f33924);
            c11339.f33915.setProgress(c11339.f33924.m47712());
        } catch (Exception e) {
            AtomicReference atomicReference = c11339.f33925;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m28010() {
        return new ArrayList(this.f33922);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m28013() {
        return this.f33928;
    }
}
