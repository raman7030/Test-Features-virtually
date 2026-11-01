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

/* JADX INFO: renamed from: l.ۡ᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I254 */
/* JADX INFO: loaded from: classes4.dex */
public class C11106 extends AbstractC21614 {

    /* JADX INFO: renamed from: ᩻ۧ */
    public static final /* synthetic */ int f30790 = 0;

    /* JADX INFO: renamed from: ۨ֫ */
    public ExecutorService f30797;

    /* JADX INFO: renamed from: ۫֫ */
    public C16861 f30798;

    /* JADX INFO: renamed from: ܽۧ */
    public String f30802;

    /* JADX INFO: renamed from: ۧۧ */
    public boolean f30796 = C7050.m16218();

    /* JADX INFO: renamed from: ᩳۧ */
    public List f30804 = C18426.m41997();

    /* JADX INFO: renamed from: ۛ֫ */
    public AtomicReference f30793 = new AtomicReference();

    /* JADX INFO: renamed from: ۟֫ */
    public List f30794 = C18426.m41997();

    /* JADX INFO: renamed from: ܿۧ */
    public C6455 f30803 = new C6455();

    /* JADX INFO: renamed from: ۗ֫ */
    public C23352 f30792 = new C23352();

    /* JADX INFO: renamed from: ֫ۧ */
    public ThreadLocal f30791 = new ThreadLocal();

    /* JADX INFO: renamed from: ۤ֫ */
    public C6727 f30795 = new C6727(false);

    /* JADX INFO: renamed from: ᩺֫ */
    public HashSet f30805 = new HashSet();

    /* JADX INFO: renamed from: ܰ֫ */
    public ReentrantLock f30800 = new ReentrantLock();

    /* JADX INFO: renamed from: ܳۧ */
    public InterfaceC23810 f30801 = new C22506(this);

    /* JADX INFO: renamed from: ۬֫ */
    public InterfaceC20887 f30799 = new C11777(this);

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public C18736 mo5125() throws Exception {
        String[] strArrM13494 = m13494("ARG_PATHS");
        String strM13492 = m13492("targetPath");
        int i = C20278.f62659;
        C10890 c10890M45798 = C20278.m45798(new File(strM13492));
        this.f30802 = m13471("replacedName");
        if (c10890M45798 != null && !c10890M45798.m25090().f15595.isEmpty()) {
            this.f30797 = Executors.newSingleThreadExecutor();
        } else if (ApplicationC21448.f67650.getBoolean("optimize_external_storage_dt", true) && (C17810.m40426(strArrM13494) || C17810.m40426(strM13492))) {
            this.f30797 = Executors.newSingleThreadExecutor();
        } else {
            this.f30797 = Executors.newFixedThreadPool(3);
        }
        C19210.m43749(strM13492, EnumC17868.MODIFY_DIRECTORY);
        C18524.m42109(strM13492, new String[0]).m38666();
        C16861 c16861M38377 = C16861.m38377(strM13492, this.f30795, this.f30799);
        this.f30798 = c16861M38377;
        c16861M38377.m38397(this.f30802);
        this.f30798.m38403(strArrM13494, (AbstractC15599) C4744.f10749, false, true);
        if (!this.f30798.m38404(true)) {
            cancel();
            return C18736.m42768();
        }
        m13472(R.string.MT_Protector);
        mo25204(this.f30798);
        m48822(true);
        this.f30792.m52010();
        this.f30803.m14742();
        Iterator it = this.f30798.m38409().iterator();
        while (it.hasNext()) {
            m25579((AbstractC3451) it.next());
        }
        C4081.m8189(this.f30797);
        if (mo3924()) {
            return C18736.m42768();
        }
        AtomicReference atomicReference = this.f30793;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        Iterator it2 = this.f30804.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        SystemClock.sleep(100L);
        return C18736.m42767();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79719;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        String str = this.f30802;
        return str != null ? C7050.m16203(R.string.MT_Protector, str) : C7050.m16203(R.string.MT_Protector, m13467("targetPath"));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public void mo5127() {
        m13472(R.string.MT_Protector);
        mo25203("...");
    }

    /* JADX INFO: renamed from: ۧ */
    private void m25579(final AbstractC3451 abstractC3451) {
        this.f30797.submit(new Runnable() { // from class: l.ۜ᩺ܳ
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public final void run() {
                C11106 c11106 = this.f24651;
                AtomicReference atomicReference = c11106.f30793;
                InterfaceC23810 interfaceC23810 = c11106.f30801;
                HashSet hashSet = c11106.f30805;
                C23352 c23352 = c11106.f30792;
                ReentrantLock reentrantLock = c11106.f30800;
                boolean zMo3924 = c11106.mo3924();
                AbstractC3451 abstractC3452 = abstractC3451;
                if (zMo3924 || atomicReference.get() != null) {
                    abstractC3452.m6132();
                    return;
                }
                String strM6139 = abstractC3452.m6139();
                String str = c11106.f30802;
                if (str != null && strM6139.startsWith(str.concat("/"))) {
                    strM6139 = strM6139.substring(str.length() + 1);
                }
                c11106.f30791.set(strM6139);
                c11106.mo25203(strM6139);
                abstractC3452.m6140();
                try {
                    try {
                        if (abstractC3452.m6150()) {
                            AbstractC17043 abstractC17043M6131 = abstractC3452.m6131();
                            AbstractC17043 abstractC17043M6133 = abstractC3452.m6133();
                            c23352.m52011(abstractC17043M6133, EnumC17868.MODIFY_FILE);
                            C21759.m49050(abstractC17043M6131.mo29996(), abstractC17043M6133.mo25505());
                        } else if (!abstractC3452.m6129()) {
                            AbstractC17043 abstractC17043M6132 = abstractC3452.m6131();
                            AbstractC17043 abstractC17043M6134 = abstractC3452.m6133();
                            reentrantLock.lock();
                            boolean z = false;
                            if (!abstractC3452.m6120() && (abstractC17043M6134.mo25094() || hashSet.contains(abstractC17043M6134.mo25505()))) {
                                abstractC3452.m6144(true);
                                if (c11106.f30795.mo15385()) {
                                    try {
                                        c11106.f30795.mo15380(abstractC3452.m6139(), C23568.m52377(abstractC3452.m6154(), abstractC3452.m6128()), C23568.m52378(abstractC17043M6134), abstractC17043M6134.mo31068());
                                    } catch (Exception e) {
                                        e = e;
                                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                                        }
                                        if (reentrantLock.isHeldByCurrentThread()) {
                                            reentrantLock.unlock();
                                        }
                                        abstractC3452.m6132();
                                        return;
                                    }
                                }
                                if (c11106.f30795.mo3924()) {
                                    c11106.cancel();
                                    if (reentrantLock.isHeldByCurrentThread()) {
                                        reentrantLock.unlock();
                                    }
                                    abstractC3452.m6132();
                                    return;
                                }
                                z = c11106.f30795.mo15382() == 1;
                                if (c11106.f30795.mo15382() == 2) {
                                    abstractC3452.m6152();
                                } else {
                                    C19056 c19056 = new C19056();
                                    c19056.m43296(abstractC17043M6134);
                                    abstractC3452.m6126(c19056.m43295());
                                }
                                if (c11106.f30795.mo15382() == 0 && c11106.f30795.mo15383() && abstractC17043M6134.mo31068()) {
                                    abstractC3452.m6138(true);
                                }
                            }
                            if (z || (!abstractC3452.m6149() && C18524.m42121(abstractC17043M6132.mo25505(), abstractC17043M6134.mo25505()))) {
                                reentrantLock.unlock();
                            } else if (!abstractC3452.m6120()) {
                                c23352.m52011(abstractC17043M6134, EnumC17868.MODIFY_FILE);
                                hashSet.add(abstractC17043M6134.mo25505());
                                reentrantLock.unlock();
                                abstractC17043M6132.m38658(abstractC17043M6134, abstractC3452.m6142(), interfaceC23810);
                            } else if (abstractC3452.m6149()) {
                                while (true) {
                                    abstractC17043M6134 = abstractC17043M6134.m38650(true);
                                    if (!abstractC17043M6134.mo25094() && !hashSet.contains(abstractC17043M6134.mo25505())) {
                                        break;
                                    }
                                }
                                c23352.m52011(abstractC17043M6134, EnumC17868.MODIFY_FILE);
                                hashSet.add(abstractC17043M6134.mo25505());
                                reentrantLock.unlock();
                                abstractC17043M6132.m38658(abstractC17043M6134, abstractC3452.m6142(), interfaceC23810);
                                if (abstractC3452.m6134() != null) {
                                    abstractC3452.m6148(abstractC17043M6134.getName());
                                }
                            } else {
                                c23352.m52011(abstractC17043M6134, EnumC17868.MODIFY_FILE);
                                if (abstractC3452.m6121()) {
                                    abstractC17043M6134.mo31069(c11106);
                                }
                                hashSet.add(abstractC17043M6134.mo25505());
                                reentrantLock.unlock();
                                abstractC17043M6132.m38658(abstractC17043M6134, (C19056) null, interfaceC23810);
                                C19056 c19056M6142 = abstractC3452.m6142();
                                if (c19056M6142 != null) {
                                    c19056M6142.m43298(abstractC17043M6134);
                                }
                            }
                        } else if (!abstractC3452.m6120()) {
                            AbstractC17043 abstractC17043M6135 = abstractC3452.m6133();
                            c23352.m52011(abstractC17043M6135, EnumC17868.MODIFY_FILE);
                            abstractC17043M6135.m38666();
                            C19056 c19056M6143 = abstractC3452.m6142();
                            if (c19056M6143 != null) {
                                c19056M6143.m43298(abstractC17043M6135);
                            }
                            if (c11106.f30796 && abstractC17043M6135.mo29973()) {
                                c11106.f30804.add(new RunnableC17768(2, abstractC17043M6135, abstractC3452));
                            }
                        }
                        if (reentrantLock.isHeldByCurrentThread()) {
                            reentrantLock.unlock();
                        }
                        abstractC3452.m6132();
                        c11106.f30798.m50045();
                        if (!abstractC3452.m6129()) {
                            C16114.m36688(abstractC3452.m6141(), true);
                        }
                        if (abstractC3452.m6134() != null) {
                            c11106.f30794.add((String) abstractC3452.m6134());
                        }
                        c11106.mo25204(c11106.f30798);
                        c11106.mo13474(c11106.f30798.m50042());
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th) {
                    if (reentrantLock.isHeldByCurrentThread()) {
                        reentrantLock.unlock();
                    }
                    abstractC3452.m6132();
                    throw th;
                }
            }
        });
        if (abstractC3451.m6129()) {
            Iterator it = abstractC3451.mo4359().m4364().iterator();
            while (it.hasNext()) {
                m25579((AbstractC3451) it.next());
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773() && m13478(c18107)) {
            c18107.m41267();
        }
        List list = this.f30794;
        if (list.isEmpty() || !m13461(c18108)) {
            return;
        }
        c18108.m41226((Collection) list);
        c18108.m41241();
        if (this.f30802 != null) {
            c18107.m41226((Collection) list);
            c18107.m41241();
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public void mo5126(C18736 c18736) {
        if (!this.f30797.isShutdown()) {
            this.f30797.shutdownNow();
        }
        this.f30803.m14743();
        C17127.m38756();
    }
}
