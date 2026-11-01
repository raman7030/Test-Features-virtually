package p067l;

import bin.p000mt.plus.R;
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
public final class C13146 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC3343 f36914;

    /* JADX INFO: renamed from: ۖ */
    public AbstractC5375 f36915;

    /* JADX INFO: renamed from: ۡ */
    public AbstractC5375 f36918;

    /* JADX INFO: renamed from: ۢ */
    public InterfaceC23810 f36919;

    /* JADX INFO: renamed from: ۧ */
    public C15567 f36920;

    /* JADX INFO: renamed from: ܽ */
    public C16861 f36923;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC17043 f36925;

    /* JADX INFO: renamed from: ᩻ */
    public C21684 f36928;

    /* JADX INFO: renamed from: ܳ */
    public final List f36921 = C18426.m41997();

    /* JADX INFO: renamed from: ᩴ */
    public final List f36926 = C18426.m41997();

    /* JADX INFO: renamed from: ۜ */
    public final ThreadLocal f36917 = new ThreadLocal();

    /* JADX INFO: renamed from: ۘ */
    public final ThreadLocal f36916 = new ThreadLocal();

    /* JADX INFO: renamed from: ܿ */
    public final AtomicReference f36924 = new AtomicReference();

    /* JADX INFO: renamed from: ᩷ */
    public final List f36927 = C18426.m41997();

    /* JADX INFO: renamed from: ܺ */
    public int f36922 = 0;

    /* JADX INFO: renamed from: ֫ */
    public final void m30072(AbstractC5375 abstractC5375, AbstractC5375 abstractC5376, String str, String[] strArr, String str2, InterfaceC3343 interfaceC3343) throws Exception {
        this.f36915 = abstractC5375;
        this.f36918 = abstractC5376;
        this.f36914 = interfaceC3343;
        AbstractC17043 abstractC17043M42109 = C18524.m42109(str2, new String[0]);
        this.f36925 = abstractC17043M42109;
        abstractC17043M42109.mo25503();
        this.f36925.m38666();
        C9533 c9533 = new C9533(this, interfaceC3343);
        if (abstractC5376 == null) {
            C16861 c16861M38379 = C16861.m38379(c9533);
            this.f36923 = c16861M38379;
            if (!abstractC5375.f12758.f14155) {
                c16861M38379.m38407();
            }
            this.f36923.m38401(strArr, abstractC5375);
        } else {
            if (!str.endsWith("/")) {
                str = str.concat("/");
            }
            this.f36922 = str.length();
            C16861 c16861M38376 = C16861.m38376(str, abstractC5376, new C6727(false), c9533);
            this.f36923 = c16861M38376;
            if (!abstractC5375.f12758.f14155 || !abstractC5376.f12758.f14155) {
                c16861M38376.m38407();
            }
            this.f36923.m38402(strArr, abstractC5375, abstractC5376, interfaceC3343);
        }
        C21684 c21684 = this.f36928;
        if (c21684 != null) {
            this.f36923.m38398(c21684);
        }
        interfaceC3343.setTitle(R.string.MT_Protector);
        interfaceC3343.mo5837(this.f36923);
        interfaceC3343.mo5838();
        C6455 c6455 = new C6455(0);
        this.f36920 = new C15567(this, interfaceC3343);
        this.f36919 = new C4428(this, interfaceC3343, c6455);
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(abstractC5375.m11748());
        c6455.m14742();
        Iterator it = this.f36923.m38409().iterator();
        while (it.hasNext()) {
            m30066(executorServiceNewFixedThreadPool, (AbstractC3451) it.next());
        }
        C4081.m8189(executorServiceNewFixedThreadPool);
        c6455.m14743();
        Iterator it2 = this.f36926.iterator();
        while (it2.hasNext()) {
            C2700.m4192((C10844) it2.next());
        }
        Exception exc = (Exception) this.f36924.get();
        if (exc != null) {
            throw exc;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m30068(C13146 c13146, InterfaceC3343 interfaceC3343) {
        return interfaceC3343.mo3924() || c13146.f36924.get() != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30073(C21684 c21684) {
        this.f36928 = c21684;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m30066(ExecutorService executorService, AbstractC3451 abstractC3451) {
        executorService.submit(new RunnableC16765(1, this, abstractC3451));
        if (abstractC3451.m6129()) {
            Iterator it = abstractC3451.mo4359().m4364().iterator();
            while (it.hasNext()) {
                m30066(executorService, (AbstractC3451) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30067(C13146 c13146, AbstractC3451 abstractC3451) {
        ThreadLocal threadLocal = c13146.f36916;
        if (c13146.f36920.mo3924()) {
            return;
        }
        c13146.f36917.set(abstractC3451.m6139());
        c13146.f36914.setName(abstractC3451.m6139());
        try {
            C10844 c10844 = (C10844) threadLocal.get();
            if (c10844 == null) {
                AbstractC17043 abstractC17043M38693 = c13146.f36925.m38693(".zip");
                C10844 c10845 = new C10844(abstractC17043M38693);
                threadLocal.set(c10845);
                c13146.f36926.add(c10845);
                c13146.f36921.add(abstractC17043M38693);
                c10844 = c10845;
            }
            if (abstractC3451.m6129()) {
                C5738 c5738 = new C5738(abstractC3451.m6141().substring(c13146.f36922) + "/");
                c5738.setTime(abstractC3451.m6128());
                C20423.m46101(c5738, abstractC3451);
                c10844.m24987(c5738);
            } else {
                C5738 c5739 = (abstractC3451.m6120() && abstractC3451.m6149()) ? new C5738(c13146.f36918.mo11753(abstractC3451.m6141()).substring(c13146.f36922)) : new C5738(abstractC3451.m6141().substring(c13146.f36922));
                c5739.setTime(abstractC3451.m6128());
                C20423.m46101(c5739, abstractC3451);
                c10844.m24987(c5739);
                InterfaceC19370 interfaceC19370M35470 = c13146.f36915.m35470(abstractC3451.m6151());
                if (!abstractC3451.m6150()) {
                    AbstractC5375 abstractC5375 = c13146.f36915;
                    abstractC5375.getClass();
                    C17278 c17278 = (C17278) interfaceC19370M35470;
                    InputStream inputStreamMo11725 = abstractC5375.mo11725(0L, c17278.getPath());
                    try {
                        if (inputStreamMo11725 == null) {
                            c13146.f36914.mo5836();
                            if (inputStreamMo11725 != null) {
                                inputStreamMo11725.close();
                                return;
                            }
                            return;
                        }
                        C15841.m35957(inputStreamMo11725, c10844.m24981(), c17278.getSize(), c13146.f36919);
                        inputStreamMo11725.close();
                    } catch (Throwable th) {
                        if (inputStreamMo11725 != null) {
                            try {
                                inputStreamMo11725.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            }
            c13146.f36923.m50045();
            if (abstractC3451.m6134() != null) {
                c13146.f36927.add((String) abstractC3451.m6134());
            }
            c13146.f36914.mo5837(c13146.f36923);
            c13146.f36914.setProgress(c13146.f36923.m50042());
        } catch (Exception e) {
            AtomicReference atomicReference = c13146.f36924;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m30071() {
        return new ArrayList(this.f36921);
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m30074() {
        return this.f36927;
    }
}
