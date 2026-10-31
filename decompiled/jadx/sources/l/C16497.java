package l;

import android.os.SystemClock;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܽ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E2B3 */
/* JADX INFO: loaded from: classes5.dex */
public class C16497 extends AbstractC20250 {

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f50694 = 0;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public ExecutorService f50701;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public C15249 f50702;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public boolean f50700 = C4925.m14321();

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public List f50705 = C16895.m39756();

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public AtomicReference f50697 = new AtomicReference();

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public List f50698 = C16895.m39756();

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C4300 f50707 = new C4300();

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public C22079 f50696 = new C22079();

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public ThreadLocal f50695 = new ThreadLocal();

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public C4586 f50699 = new C4586(true);

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public HashSet f50708 = new HashSet();

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public ReentrantLock f50704 = new ReentrantLock();

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC22560 f50706 = new C1681(this);

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public InterfaceC19485 f50703 = new C10854(this);

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public C17222 mo2780() throws Exception {
        String[] strArrM11558 = m11558("ARG_PATHS");
        String strM11535 = m11535("sourcePath");
        String strM11556 = m11556("targetPath");
        int i = C18844.f59431;
        C8966 c8966M43532 = C18844.m43532(new File(strM11556));
        if (c8966M43532 != null && !c8966M43532.m23116().f12780.isEmpty()) {
            this.f50701 = Executors.newSingleThreadExecutor();
        } else if (ApplicationC20075.f65010.getBoolean("optimize_external_storage_dt", true) && (C16247.m38212(strArrM11558) || C16247.m38212(strM11556))) {
            this.f50701 = Executors.newSingleThreadExecutor();
        } else {
            this.f50701 = Executors.newFixedThreadPool(3);
        }
        boolean z = this instanceof C19038;
        if (z) {
            C17721.m41503(strM11556, EnumC16309.MODIFY_DIRECTORY);
        } else {
            EnumC16309 enumC16309 = EnumC16309.MODIFY_DIRECTORY;
            C17721.m41505(C1493.m5161(strM11535, enumC16309), C1493.m5161(strM11556, enumC16309));
        }
        C16999.m39866(strM11556, new String[0]).m36508();
        C15249 c15249M36216 = C15249.m36216(strM11556, this.f50699, this.f50703);
        this.f50702 = c15249M36216;
        c15249M36216.m36238(strArrM11558);
        for (AbstractC1139 abstractC1139 : this.f50702.m36244()) {
            if (abstractC1139.m3893() != null) {
                this.f50698.add((String) abstractC1139.m3893());
                if (abstractC1139.m3888()) {
                    if (!z) {
                        C14463.m34559(abstractC1139.m3910());
                    }
                    m38859(abstractC1139.m3892());
                } else {
                    if (!z) {
                        C14463.m34560(abstractC1139.m3910());
                    }
                    C14463.m34554(abstractC1139.m3900(), true);
                }
            }
        }
        mo23260(this.f50702);
        m46501(true);
        this.f50696.m49672();
        this.f50707.m12878();
        Iterator it = this.f50702.m36248().iterator();
        while (it.hasNext()) {
            m38858((AbstractC1139) it.next());
        }
        C1802.m5992(this.f50701);
        if (mo1526()) {
            return C17222.m40521();
        }
        AtomicReference atomicReference = this.f50697;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        Iterator it2 = this.f50702.m36248().iterator();
        while (it2.hasNext()) {
            C17909.m41888((AbstractC1139) it2.next());
        }
        Iterator it3 = this.f50705.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        SystemClock.sleep(100L);
        return C17222.m40520();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76966;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector, m11531("targetPath"));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public void mo2782() {
        m11536(R.string.MT_Protector);
        mo23259("...");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m38858(final AbstractC1139 abstractC1139) {
        this.f50701.submit(new Runnable() { // from class: l.۟ܰܳ
            @Override // java.lang.Runnable
            public final void run() {
                C16497 c16497 = this.f23098;
                AtomicReference atomicReference = c16497.f50697;
                InterfaceC22560 interfaceC22560 = c16497.f50706;
                HashSet hashSet = c16497.f50708;
                C22079 c22079 = c16497.f50696;
                ReentrantLock reentrantLock = c16497.f50704;
                boolean zMo1526 = c16497.mo1526();
                AbstractC1139 abstractC11310 = abstractC1139;
                if (zMo1526 || atomicReference.get() != null) {
                    abstractC11310.m3891();
                    return;
                }
                c16497.f50695.set(abstractC11310.m3898());
                c16497.mo23259(abstractC11310.m3898());
                abstractC11310.m3899();
                try {
                    try {
                        if (abstractC11310.m3909()) {
                            AbstractC15440 abstractC15440M3890 = abstractC11310.m3890();
                            AbstractC15440 abstractC15440M3892 = abstractC11310.m3892();
                            c22079.m49674(abstractC15440M3890.m36514(), EnumC16309.MODIFY_DIRECTORY, abstractC15440M3892, EnumC16309.MODIFY_FILE);
                            if (abstractC11310.m3879()) {
                                abstractC15440M3892.mo27929();
                            }
                            if (!abstractC11310.m3889() || !abstractC15440M3890.mo23551(abstractC15440M3892)) {
                                C20402.m46727(abstractC15440M3890.mo27935(), abstractC15440M3892.mo23554());
                                if (c16497.mo1526()) {
                                    if (reentrantLock.isHeldByCurrentThread()) {
                                        reentrantLock.unlock();
                                    }
                                    abstractC11310.m3891();
                                    return;
                                }
                                abstractC15440M3890.mo27929();
                            }
                        } else if (abstractC11310.m3888()) {
                            if (!abstractC11310.m3879()) {
                                C17558 c17558 = new C17558();
                                c17558.m41050(abstractC11310.m3890());
                                AbstractC15440 abstractC15440M3893 = abstractC11310.m3892();
                                c22079.m49673(abstractC15440M3893, EnumC16309.MODIFY_FILE);
                                abstractC15440M3893.m36508();
                                c17558.m41052(abstractC15440M3893);
                                if (c16497.f50700 && abstractC15440M3893.mo27912()) {
                                    c16497.f50705.add(new RunnableC12086(2, abstractC15440M3893, abstractC11310));
                                }
                            }
                            c22079.m49673(abstractC11310.m3890().m36514(), EnumC16309.MODIFY_DIRECTORY);
                        } else {
                            AbstractC15440 abstractC15440M3891 = abstractC11310.m3890();
                            AbstractC15440 abstractC15440M3894 = abstractC11310.m3892();
                            reentrantLock.lock();
                            boolean z = false;
                            if (!abstractC11310.m3879() && (abstractC15440M3894.mo23120() || hashSet.contains(abstractC15440M3894.mo23554().toLowerCase()))) {
                                abstractC11310.m3903(true);
                                if (c16497.f50699.mo13496()) {
                                    try {
                                        c16497.f50699.mo13491(abstractC11310.m3898(), C22306.m50047(abstractC11310.m3913(), abstractC11310.m3887()), C22306.m50048(abstractC15440M3894), false);
                                    } catch (Exception e) {
                                        e = e;
                                        while (true) {
                                            AtomicReference atomicReference2 = atomicReference;
                                            if (atomicReference2.compareAndSet(null, e) || atomicReference2.get() != null) {
                                                break;
                                                break;
                                            }
                                            atomicReference = atomicReference2;
                                        }
                                        if (reentrantLock.isHeldByCurrentThread()) {
                                            reentrantLock.unlock();
                                        }
                                        abstractC11310.m3891();
                                        return;
                                    }
                                }
                                if (c16497.f50699.mo1526()) {
                                    c16497.cancel();
                                    if (reentrantLock.isHeldByCurrentThread()) {
                                        reentrantLock.unlock();
                                    }
                                    abstractC11310.m3891();
                                    return;
                                }
                                z = c16497.f50699.mo13493() == 1;
                                if (c16497.f50699.mo13493() == 2) {
                                    abstractC11310.m3911();
                                } else {
                                    C17558 c17559 = new C17558();
                                    c17559.m41050(abstractC15440M3894);
                                    abstractC11310.m3885(c17559.m41049());
                                }
                                if (c16497.f50699.mo13493() == 0 && c16497.f50699.mo13494() && abstractC15440M3894.mo29016()) {
                                    abstractC11310.m3897(true);
                                }
                            }
                            if (z) {
                                reentrantLock.unlock();
                            } else if (!abstractC11310.m3879()) {
                                c22079.m49674(abstractC15440M3891.m36514(), EnumC16309.MODIFY_DIRECTORY, abstractC15440M3894, EnumC16309.MODIFY_FILE);
                                hashSet.add(abstractC15440M3894.mo23554().toLowerCase());
                                reentrantLock.unlock();
                                abstractC15440M3891.m36500(abstractC15440M3894, new C17558(), interfaceC22560);
                                if (c16497.mo1526()) {
                                    if (reentrantLock.isHeldByCurrentThread()) {
                                        reentrantLock.unlock();
                                    }
                                    abstractC11310.m3891();
                                    return;
                                }
                                abstractC15440M3891.mo27929();
                            } else if (abstractC11310.m3908()) {
                                while (true) {
                                    abstractC15440M3894 = abstractC15440M3894.m36492(true);
                                    if (!abstractC15440M3894.mo23120() && !hashSet.contains(abstractC15440M3894.mo23554().toLowerCase())) {
                                        break;
                                    }
                                }
                                c22079.m49674(abstractC15440M3891.m36514(), EnumC16309.MODIFY_DIRECTORY, abstractC15440M3894, EnumC16309.MODIFY_FILE);
                                hashSet.add(abstractC15440M3894.mo23554().toLowerCase());
                                reentrantLock.unlock();
                                if (abstractC11310.m3889() && abstractC15440M3891.mo23551(abstractC15440M3894)) {
                                    c16497.f50702.m47708(abstractC11310.mo1987().m3913());
                                } else {
                                    abstractC15440M3891.m36500(abstractC15440M3894, new C17558(), interfaceC22560);
                                    if (c16497.mo1526()) {
                                        if (reentrantLock.isHeldByCurrentThread()) {
                                            reentrantLock.unlock();
                                        }
                                        abstractC11310.m3891();
                                        return;
                                    }
                                    abstractC15440M3891.mo27929();
                                }
                                if (abstractC11310.m3893() != null) {
                                    abstractC11310.m3907(abstractC15440M3894.getName());
                                }
                            } else {
                                c22079.m49674(abstractC15440M3891.m36514(), EnumC16309.MODIFY_DIRECTORY, abstractC15440M3894, EnumC16309.MODIFY_FILE);
                                C17558 c175510 = new C17558();
                                c175510.m41048(abstractC11310.m3904());
                                c175510.m41047();
                                hashSet.add(abstractC15440M3894.mo23554().toLowerCase());
                                reentrantLock.unlock();
                                if (abstractC11310.m3880()) {
                                    abstractC15440M3894.mo29017(c16497);
                                } else {
                                    abstractC15440M3894.mo27929();
                                }
                                if (abstractC11310.m3889() && abstractC15440M3891.mo23551(abstractC15440M3894)) {
                                    c16497.f50702.m47708(abstractC11310.mo1987().m3913());
                                    c175510.m41052(abstractC15440M3894);
                                } else {
                                    abstractC15440M3891.m36500(abstractC15440M3894, c175510, interfaceC22560);
                                    if (c16497.mo1526()) {
                                        if (reentrantLock.isHeldByCurrentThread()) {
                                            reentrantLock.unlock();
                                        }
                                        abstractC11310.m3891();
                                        return;
                                    }
                                    abstractC15440M3891.mo27929();
                                }
                            }
                        }
                        if (reentrantLock.isHeldByCurrentThread()) {
                            reentrantLock.unlock();
                        }
                        abstractC11310.m3891();
                        c16497.f50702.m47715();
                        if (!abstractC11310.m3888()) {
                            if (!(c16497 instanceof C19038)) {
                                C14463.m34560(abstractC11310.m3910());
                            }
                            C14463.m34554(abstractC11310.m3900(), true);
                        }
                        if (abstractC11310.m3893() != null) {
                            c16497.f50698.add((String) abstractC11310.m3893());
                        }
                        c16497.mo23260(c16497.f50702);
                        c16497.mo11538(c16497.f50702.m47712());
                    } catch (Throwable th) {
                        if (reentrantLock.isHeldByCurrentThread()) {
                            reentrantLock.unlock();
                        }
                        abstractC11310.m3891();
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        });
        if (abstractC1139.m3888()) {
            Iterator it = abstractC1139.mo1983().m1988().iterator();
            while (it.hasNext()) {
                m38858((AbstractC1139) it.next());
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
        }
        List list = this.f50698;
        if (list.isEmpty() || !m11525(c16561)) {
            return;
        }
        c16561.m39000((Collection) list);
        c16561.m39015();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m38859(AbstractC15440 abstractC15440) {
        for (AbstractC15440 abstractC15441 : abstractC15440.mo23549(true)) {
            if (abstractC15441.mo23113()) {
                m38859(abstractC15441);
            } else {
                C14463.m34554(abstractC15441.mo23554(), true);
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public void mo2781(C17222 c17222) {
        if (!this.f50701.isShutdown()) {
            this.f50701.shutdownNow();
        }
        this.f50707.m12879();
        C15528.m36596();
        C9068.m23429();
    }
}
