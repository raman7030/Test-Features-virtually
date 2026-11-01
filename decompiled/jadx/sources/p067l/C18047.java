package p067l;

import android.os.SystemClock;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
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
public class C18047 extends AbstractC21614 {

    /* JADX INFO: renamed from: ܳۧ */
    public static final /* synthetic */ int f53871 = 0;

    /* JADX INFO: renamed from: ۨ֫ */
    public ExecutorService f53878;

    /* JADX INFO: renamed from: ۫֫ */
    public C16861 f53879;

    /* JADX INFO: renamed from: ۧۧ */
    public boolean f53877 = C7050.m16218();

    /* JADX INFO: renamed from: ܽۧ */
    public List f53882 = C18426.m41997();

    /* JADX INFO: renamed from: ۛ֫ */
    public AtomicReference f53874 = new AtomicReference();

    /* JADX INFO: renamed from: ۟֫ */
    public List f53875 = C18426.m41997();

    /* JADX INFO: renamed from: ᩳۧ */
    public C6455 f53884 = new C6455();

    /* JADX INFO: renamed from: ۗ֫ */
    public C23352 f53873 = new C23352();

    /* JADX INFO: renamed from: ֫ۧ */
    public ThreadLocal f53872 = new ThreadLocal();

    /* JADX INFO: renamed from: ۤ֫ */
    public C6727 f53876 = new C6727(true);

    /* JADX INFO: renamed from: ᩺֫ */
    public HashSet f53885 = new HashSet();

    /* JADX INFO: renamed from: ܰ֫ */
    public ReentrantLock f53881 = new ReentrantLock();

    /* JADX INFO: renamed from: ܿۧ */
    public InterfaceC23810 f53883 = new C3966(this);

    /* JADX INFO: renamed from: ۬֫ */
    public InterfaceC20887 f53880 = new C12684(this);

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public C18736 mo5125() throws Exception {
        String[] strArrM13494 = m13494("ARG_PATHS");
        String strM13471 = m13471("sourcePath");
        String strM13492 = m13492("targetPath");
        int i = C20278.f62659;
        C10890 c10890M45798 = C20278.m45798(new File(strM13492));
        if (c10890M45798 != null && !c10890M45798.m25090().f15595.isEmpty()) {
            this.f53878 = Executors.newSingleThreadExecutor();
        } else if (ApplicationC21448.f67650.getBoolean("optimize_external_storage_dt", true) && (C17810.m40426(strArrM13494) || C17810.m40426(strM13492))) {
            this.f53878 = Executors.newSingleThreadExecutor();
        } else {
            this.f53878 = Executors.newFixedThreadPool(3);
        }
        boolean z = this instanceof C20463;
        if (z) {
            C19210.m43749(strM13492, EnumC17868.MODIFY_DIRECTORY);
        } else {
            EnumC17868 enumC17868 = EnumC17868.MODIFY_DIRECTORY;
            C19210.m43751(C3787.m7403(strM13471, enumC17868), C3787.m7403(strM13492, enumC17868));
        }
        C18524.m42109(strM13492, new String[0]).m38666();
        C16861 c16861M38377 = C16861.m38377(strM13492, this.f53876, this.f53880);
        this.f53879 = c16861M38377;
        c16861M38377.m38399(strArrM13494);
        for (AbstractC3451 abstractC3451 : this.f53879.m38405()) {
            if (abstractC3451.m6134() != null) {
                this.f53875.add((String) abstractC3451.m6134());
                if (abstractC3451.m6129()) {
                    if (!z) {
                        C16114.m36693(abstractC3451.m6151());
                    }
                    m41085(abstractC3451.m6133());
                } else {
                    if (!z) {
                        C16114.m36694(abstractC3451.m6151());
                    }
                    C16114.m36688(abstractC3451.m6141(), true);
                }
            }
        }
        mo25204(this.f53879);
        m48822(true);
        this.f53873.m52010();
        this.f53884.m14742();
        Iterator it = this.f53879.m38409().iterator();
        while (it.hasNext()) {
            m41084((AbstractC3451) it.next());
        }
        C4081.m8189(this.f53878);
        if (mo3924()) {
            return C18736.m42768();
        }
        AtomicReference atomicReference = this.f53874;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        Iterator it2 = this.f53879.m38409().iterator();
        while (it2.hasNext()) {
            C19389.m44136((AbstractC3451) it2.next());
        }
        Iterator it3 = this.f53882.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        SystemClock.sleep(100L);
        return C18736.m42767();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79718;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, m13467("targetPath"));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public void mo5127() {
        m13472(R.string.MT_Protector);
        mo25203("...");
    }

    /* JADX INFO: renamed from: ۧ */
    private void m41084(final AbstractC3451 abstractC3451) {
        this.f53878.submit(new Runnable() { // from class: l.۟ܰܳ
            @Override // java.lang.Runnable
            public final void run() {
                C18047 c18047 = this.f26010;
                AtomicReference atomicReference = c18047.f53874;
                InterfaceC23810 interfaceC23810 = c18047.f53883;
                HashSet hashSet = c18047.f53885;
                C23352 c23352 = c18047.f53873;
                ReentrantLock reentrantLock = c18047.f53881;
                boolean zMo3924 = c18047.mo3924();
                AbstractC3451 abstractC3452 = abstractC3451;
                if (zMo3924 || atomicReference.get() != null) {
                    abstractC3452.m6132();
                    return;
                }
                c18047.f53872.set(abstractC3452.m6139());
                c18047.mo25203(abstractC3452.m6139());
                abstractC3452.m6140();
                try {
                    try {
                        if (abstractC3452.m6150()) {
                            AbstractC17043 abstractC17043M6131 = abstractC3452.m6131();
                            AbstractC17043 abstractC17043M6133 = abstractC3452.m6133();
                            c23352.m52012(abstractC17043M6131.m38672(), EnumC17868.MODIFY_DIRECTORY, abstractC17043M6133, EnumC17868.MODIFY_FILE);
                            if (abstractC3452.m6120()) {
                                abstractC17043M6133.mo29990();
                            }
                            if (!abstractC3452.m6130() || !abstractC17043M6131.mo25502(abstractC17043M6133)) {
                                C21759.m49050(abstractC17043M6131.mo29996(), abstractC17043M6133.mo25505());
                                if (c18047.mo3924()) {
                                    if (reentrantLock.isHeldByCurrentThread()) {
                                        reentrantLock.unlock();
                                    }
                                    abstractC3452.m6132();
                                    return;
                                }
                                abstractC17043M6131.mo29990();
                            }
                        } else if (abstractC3452.m6129()) {
                            if (!abstractC3452.m6120()) {
                                C19056 c19056 = new C19056();
                                c19056.m43296(abstractC3452.m6131());
                                AbstractC17043 abstractC17043M6134 = abstractC3452.m6133();
                                c23352.m52011(abstractC17043M6134, EnumC17868.MODIFY_FILE);
                                abstractC17043M6134.m38666();
                                c19056.m43298(abstractC17043M6134);
                                if (c18047.f53877 && abstractC17043M6134.mo29973()) {
                                    c18047.f53882.add(new RunnableC13855(2, abstractC17043M6134, abstractC3452));
                                }
                            }
                            c23352.m52011(abstractC3452.m6131().m38672(), EnumC17868.MODIFY_DIRECTORY);
                        } else {
                            AbstractC17043 abstractC17043M6132 = abstractC3452.m6131();
                            AbstractC17043 abstractC17043M6135 = abstractC3452.m6133();
                            reentrantLock.lock();
                            boolean z = false;
                            if (!abstractC3452.m6120() && (abstractC17043M6135.mo25094() || hashSet.contains(abstractC17043M6135.mo25505().toLowerCase()))) {
                                abstractC3452.m6144(true);
                                if (c18047.f53876.mo15385()) {
                                    try {
                                        c18047.f53876.mo15380(abstractC3452.m6139(), C23568.m52377(abstractC3452.m6154(), abstractC3452.m6128()), C23568.m52378(abstractC17043M6135), false);
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
                                        abstractC3452.m6132();
                                        return;
                                    }
                                }
                                if (c18047.f53876.mo3924()) {
                                    c18047.cancel();
                                    if (reentrantLock.isHeldByCurrentThread()) {
                                        reentrantLock.unlock();
                                    }
                                    abstractC3452.m6132();
                                    return;
                                }
                                z = c18047.f53876.mo15382() == 1;
                                if (c18047.f53876.mo15382() == 2) {
                                    abstractC3452.m6152();
                                } else {
                                    C19056 c19057 = new C19056();
                                    c19057.m43296(abstractC17043M6135);
                                    abstractC3452.m6126(c19057.m43295());
                                }
                                if (c18047.f53876.mo15382() == 0 && c18047.f53876.mo15383() && abstractC17043M6135.mo31068()) {
                                    abstractC3452.m6138(true);
                                }
                            }
                            if (z) {
                                reentrantLock.unlock();
                            } else if (!abstractC3452.m6120()) {
                                c23352.m52012(abstractC17043M6132.m38672(), EnumC17868.MODIFY_DIRECTORY, abstractC17043M6135, EnumC17868.MODIFY_FILE);
                                hashSet.add(abstractC17043M6135.mo25505().toLowerCase());
                                reentrantLock.unlock();
                                abstractC17043M6132.m38658(abstractC17043M6135, new C19056(), interfaceC23810);
                                if (c18047.mo3924()) {
                                    if (reentrantLock.isHeldByCurrentThread()) {
                                        reentrantLock.unlock();
                                    }
                                    abstractC3452.m6132();
                                    return;
                                }
                                abstractC17043M6132.mo29990();
                            } else if (abstractC3452.m6149()) {
                                while (true) {
                                    abstractC17043M6135 = abstractC17043M6135.m38650(true);
                                    if (!abstractC17043M6135.mo25094() && !hashSet.contains(abstractC17043M6135.mo25505().toLowerCase())) {
                                        break;
                                    }
                                }
                                c23352.m52012(abstractC17043M6132.m38672(), EnumC17868.MODIFY_DIRECTORY, abstractC17043M6135, EnumC17868.MODIFY_FILE);
                                hashSet.add(abstractC17043M6135.mo25505().toLowerCase());
                                reentrantLock.unlock();
                                if (abstractC3452.m6130() && abstractC17043M6132.mo25502(abstractC17043M6135)) {
                                    c18047.f53879.m50038(abstractC3452.mo4363().m6154());
                                } else {
                                    abstractC17043M6132.m38658(abstractC17043M6135, new C19056(), interfaceC23810);
                                    if (c18047.mo3924()) {
                                        if (reentrantLock.isHeldByCurrentThread()) {
                                            reentrantLock.unlock();
                                        }
                                        abstractC3452.m6132();
                                        return;
                                    }
                                    abstractC17043M6132.mo29990();
                                }
                                if (abstractC3452.m6134() != null) {
                                    abstractC3452.m6148(abstractC17043M6135.getName());
                                }
                            } else {
                                c23352.m52012(abstractC17043M6132.m38672(), EnumC17868.MODIFY_DIRECTORY, abstractC17043M6135, EnumC17868.MODIFY_FILE);
                                C19056 c19058 = new C19056();
                                c19058.m43294(abstractC3452.m6145());
                                c19058.m43293();
                                hashSet.add(abstractC17043M6135.mo25505().toLowerCase());
                                reentrantLock.unlock();
                                if (abstractC3452.m6121()) {
                                    abstractC17043M6135.mo31069(c18047);
                                } else {
                                    abstractC17043M6135.mo29990();
                                }
                                if (abstractC3452.m6130() && abstractC17043M6132.mo25502(abstractC17043M6135)) {
                                    c18047.f53879.m50038(abstractC3452.mo4363().m6154());
                                    c19058.m43298(abstractC17043M6135);
                                } else {
                                    abstractC17043M6132.m38658(abstractC17043M6135, c19058, interfaceC23810);
                                    if (c18047.mo3924()) {
                                        if (reentrantLock.isHeldByCurrentThread()) {
                                            reentrantLock.unlock();
                                        }
                                        abstractC3452.m6132();
                                        return;
                                    }
                                    abstractC17043M6132.mo29990();
                                }
                            }
                        }
                        if (reentrantLock.isHeldByCurrentThread()) {
                            reentrantLock.unlock();
                        }
                        abstractC3452.m6132();
                        c18047.f53879.m50045();
                        if (!abstractC3452.m6129()) {
                            if (!(c18047 instanceof C20463)) {
                                C16114.m36694(abstractC3452.m6151());
                            }
                            C16114.m36688(abstractC3452.m6141(), true);
                        }
                        if (abstractC3452.m6134() != null) {
                            c18047.f53875.add((String) abstractC3452.m6134());
                        }
                        c18047.mo25204(c18047.f53879);
                        c18047.mo13474(c18047.f53879.m50042());
                    } catch (Throwable th) {
                        if (reentrantLock.isHeldByCurrentThread()) {
                            reentrantLock.unlock();
                        }
                        abstractC3452.m6132();
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        });
        if (abstractC3451.m6129()) {
            Iterator it = abstractC3451.mo4359().m4364().iterator();
            while (it.hasNext()) {
                m41084((AbstractC3451) it.next());
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773() && m13478(c18107)) {
            c18107.m41267();
        }
        List list = this.f53875;
        if (list.isEmpty() || !m13461(c18108)) {
            return;
        }
        c18108.m41226((Collection) list);
        c18108.m41241();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m41085(AbstractC17043 abstractC17043) {
        for (AbstractC17043 abstractC17044 : abstractC17043.mo25500(true)) {
            if (abstractC17044.mo25087()) {
                m41085(abstractC17044);
            } else {
                C16114.m36688(abstractC17044.mo25505(), true);
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public void mo5126(C18736 c18736) {
        if (!this.f53878.isShutdown()) {
            this.f53878.shutdownNow();
        }
        this.f53884.m14743();
        C17127.m38756();
        C10987.m25375();
    }
}
