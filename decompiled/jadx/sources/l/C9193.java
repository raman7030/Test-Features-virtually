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

/* JADX INFO: renamed from: l.ۡ᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I254 */
/* JADX INFO: loaded from: classes4.dex */
public class C9193 extends AbstractC20250 {

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f27851 = 0;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public ExecutorService f27858;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public C15249 f27859;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public String f27863;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public boolean f27857 = C4925.m14321();

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public List f27865 = C16895.m39756();

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public AtomicReference f27854 = new AtomicReference();

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public List f27855 = C16895.m39756();

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C4300 f27864 = new C4300();

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public C22079 f27853 = new C22079();

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public ThreadLocal f27852 = new ThreadLocal();

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public C4586 f27856 = new C4586(false);

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public HashSet f27866 = new HashSet();

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public ReentrantLock f27861 = new ReentrantLock();

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC22560 f27862 = new C21188(this);

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public InterfaceC19485 f27860 = new C9899(this);

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public C17222 mo2780() throws Exception {
        String[] strArrM11558 = m11558("ARG_PATHS");
        String strM11556 = m11556("targetPath");
        int i = C18844.f59431;
        C8966 c8966M43532 = C18844.m43532(new File(strM11556));
        this.f27863 = m11535("replacedName");
        if (c8966M43532 != null && !c8966M43532.m23116().f12780.isEmpty()) {
            this.f27858 = Executors.newSingleThreadExecutor();
        } else if (ApplicationC20075.f65010.getBoolean("optimize_external_storage_dt", true) && (C16247.m38212(strArrM11558) || C16247.m38212(strM11556))) {
            this.f27858 = Executors.newSingleThreadExecutor();
        } else {
            this.f27858 = Executors.newFixedThreadPool(3);
        }
        C17721.m41503(strM11556, EnumC16309.MODIFY_DIRECTORY);
        C16999.m39866(strM11556, new String[0]).m36508();
        C15249 c15249M36216 = C15249.m36216(strM11556, this.f27856, this.f27860);
        this.f27859 = c15249M36216;
        c15249M36216.m36236(this.f27863);
        this.f27859.m36242(strArrM11558, (AbstractC13921) C2499.f7958, false, true);
        if (!this.f27859.m36243(true)) {
            cancel();
            return C17222.m40521();
        }
        m11536(R.string.MT_Protector);
        mo23260(this.f27859);
        m46501(true);
        this.f27853.m49672();
        this.f27864.m12878();
        Iterator it = this.f27859.m36248().iterator();
        while (it.hasNext()) {
            m23626((AbstractC1139) it.next());
        }
        C1802.m5992(this.f27858);
        if (mo1526()) {
            return C17222.m40521();
        }
        AtomicReference atomicReference = this.f27854;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        Iterator it2 = this.f27865.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        SystemClock.sleep(100L);
        return C17222.m40520();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76967;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        String str = this.f27863;
        return str != null ? C4925.m14306(R.string.MT_Protector, str) : C4925.m14306(R.string.MT_Protector, m11531("targetPath"));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public void mo2782() {
        m11536(R.string.MT_Protector);
        mo23259("...");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m23626(final AbstractC1139 abstractC1139) {
        this.f27858.submit(new Runnable() { // from class: l.ۜ᩺ܳ
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
                C9193 c9193 = this.f21770;
                AtomicReference atomicReference = c9193.f27854;
                InterfaceC22560 interfaceC22560 = c9193.f27862;
                HashSet hashSet = c9193.f27866;
                C22079 c22079 = c9193.f27853;
                ReentrantLock reentrantLock = c9193.f27861;
                boolean zMo1526 = c9193.mo1526();
                AbstractC1139 abstractC11310 = abstractC1139;
                if (zMo1526 || atomicReference.get() != null) {
                    abstractC11310.m3891();
                    return;
                }
                String strM3898 = abstractC11310.m3898();
                String str = c9193.f27863;
                if (str != null && strM3898.startsWith(str.concat("/"))) {
                    strM3898 = strM3898.substring(str.length() + 1);
                }
                c9193.f27852.set(strM3898);
                c9193.mo23259(strM3898);
                abstractC11310.m3899();
                try {
                    try {
                        if (abstractC11310.m3909()) {
                            AbstractC15440 abstractC15440M3890 = abstractC11310.m3890();
                            AbstractC15440 abstractC15440M3892 = abstractC11310.m3892();
                            c22079.m49673(abstractC15440M3892, EnumC16309.MODIFY_FILE);
                            C20402.m46727(abstractC15440M3890.mo27935(), abstractC15440M3892.mo23554());
                        } else if (!abstractC11310.m3888()) {
                            AbstractC15440 abstractC15440M3891 = abstractC11310.m3890();
                            AbstractC15440 abstractC15440M3893 = abstractC11310.m3892();
                            reentrantLock.lock();
                            boolean z = false;
                            if (!abstractC11310.m3879() && (abstractC15440M3893.mo23120() || hashSet.contains(abstractC15440M3893.mo23554()))) {
                                abstractC11310.m3903(true);
                                if (c9193.f27856.mo13496()) {
                                    try {
                                        c9193.f27856.mo13491(abstractC11310.m3898(), C22306.m50047(abstractC11310.m3913(), abstractC11310.m3887()), C22306.m50048(abstractC15440M3893), abstractC15440M3893.mo29016());
                                    } catch (Exception e) {
                                        e = e;
                                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                                        }
                                        if (reentrantLock.isHeldByCurrentThread()) {
                                            reentrantLock.unlock();
                                        }
                                        abstractC11310.m3891();
                                        return;
                                    }
                                }
                                if (c9193.f27856.mo1526()) {
                                    c9193.cancel();
                                    if (reentrantLock.isHeldByCurrentThread()) {
                                        reentrantLock.unlock();
                                    }
                                    abstractC11310.m3891();
                                    return;
                                }
                                z = c9193.f27856.mo13493() == 1;
                                if (c9193.f27856.mo13493() == 2) {
                                    abstractC11310.m3911();
                                } else {
                                    C17558 c17558 = new C17558();
                                    c17558.m41050(abstractC15440M3893);
                                    abstractC11310.m3885(c17558.m41049());
                                }
                                if (c9193.f27856.mo13493() == 0 && c9193.f27856.mo13494() && abstractC15440M3893.mo29016()) {
                                    abstractC11310.m3897(true);
                                }
                            }
                            if (z || (!abstractC11310.m3908() && C16999.m39878(abstractC15440M3891.mo23554(), abstractC15440M3893.mo23554()))) {
                                reentrantLock.unlock();
                            } else if (!abstractC11310.m3879()) {
                                c22079.m49673(abstractC15440M3893, EnumC16309.MODIFY_FILE);
                                hashSet.add(abstractC15440M3893.mo23554());
                                reentrantLock.unlock();
                                abstractC15440M3891.m36500(abstractC15440M3893, abstractC11310.m3901(), interfaceC22560);
                            } else if (abstractC11310.m3908()) {
                                while (true) {
                                    abstractC15440M3893 = abstractC15440M3893.m36492(true);
                                    if (!abstractC15440M3893.mo23120() && !hashSet.contains(abstractC15440M3893.mo23554())) {
                                        break;
                                    }
                                }
                                c22079.m49673(abstractC15440M3893, EnumC16309.MODIFY_FILE);
                                hashSet.add(abstractC15440M3893.mo23554());
                                reentrantLock.unlock();
                                abstractC15440M3891.m36500(abstractC15440M3893, abstractC11310.m3901(), interfaceC22560);
                                if (abstractC11310.m3893() != null) {
                                    abstractC11310.m3907(abstractC15440M3893.getName());
                                }
                            } else {
                                c22079.m49673(abstractC15440M3893, EnumC16309.MODIFY_FILE);
                                if (abstractC11310.m3880()) {
                                    abstractC15440M3893.mo29017(c9193);
                                }
                                hashSet.add(abstractC15440M3893.mo23554());
                                reentrantLock.unlock();
                                abstractC15440M3891.m36500(abstractC15440M3893, (C17558) null, interfaceC22560);
                                C17558 c17558M3901 = abstractC11310.m3901();
                                if (c17558M3901 != null) {
                                    c17558M3901.m41052(abstractC15440M3893);
                                }
                            }
                        } else if (!abstractC11310.m3879()) {
                            AbstractC15440 abstractC15440M3894 = abstractC11310.m3892();
                            c22079.m49673(abstractC15440M3894, EnumC16309.MODIFY_FILE);
                            abstractC15440M3894.m36508();
                            C17558 c17558M3902 = abstractC11310.m3901();
                            if (c17558M3902 != null) {
                                c17558M3902.m41052(abstractC15440M3894);
                            }
                            if (c9193.f27857 && abstractC15440M3894.mo27912()) {
                                c9193.f27865.add(new RunnableC16203(2, abstractC15440M3894, abstractC11310));
                            }
                        }
                        if (reentrantLock.isHeldByCurrentThread()) {
                            reentrantLock.unlock();
                        }
                        abstractC11310.m3891();
                        c9193.f27859.m47715();
                        if (!abstractC11310.m3888()) {
                            C14463.m34554(abstractC11310.m3900(), true);
                        }
                        if (abstractC11310.m3893() != null) {
                            c9193.f27855.add((String) abstractC11310.m3893());
                        }
                        c9193.mo23260(c9193.f27859);
                        c9193.mo11538(c9193.f27859.m47712());
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th) {
                    if (reentrantLock.isHeldByCurrentThread()) {
                        reentrantLock.unlock();
                    }
                    abstractC11310.m3891();
                    throw th;
                }
            }
        });
        if (abstractC1139.m3888()) {
            Iterator it = abstractC1139.mo1983().m1988().iterator();
            while (it.hasNext()) {
                m23626((AbstractC1139) it.next());
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
        }
        List list = this.f27855;
        if (list.isEmpty() || !m11525(c16561)) {
            return;
        }
        c16561.m39000((Collection) list);
        c16561.m39015();
        if (this.f27863 != null) {
            c16560.m39000((Collection) list);
            c16560.m39015();
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public void mo2781(C17222 c17222) {
        if (!this.f27858.isShutdown()) {
            this.f27858.shutdownNow();
        }
        this.f27864.m12879();
        C15528.m36596();
    }
}
