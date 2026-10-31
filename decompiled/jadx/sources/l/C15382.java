package l;

import android.os.Build;
import android.os.SystemClock;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ܶܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: OAIH */
/* JADX INFO: loaded from: classes5.dex */
public class C15382 extends AbstractC20250 {

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f47096 = 0;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public C21217 f47101;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public AbstractC3163 f47102;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public boolean f47103;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public C15249 f47104;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public boolean f47106 = C4925.m14321();

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public List f47100 = C16895.m39756();

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public AtomicReference f47099 = new AtomicReference();

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public List f47107 = C16895.m39756();

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public C4300 f47097 = new C4300(0);

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public C22079 f47098 = new C22079();

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public InterfaceC19485 f47105 = new C1272(this);

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76958;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(this.f47103 ? R.string.MT_Protector : R.string.MT_Protector, m11531("targetPath"));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        mo23259("...");
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() throws Exception {
        AtomicReference atomicReference;
        String[] strArrM11558 = m11558("ARG_PATHS");
        String strM11556 = m11556("targetPath");
        this.f47103 = m11552("moveMode");
        this.f47102 = (AbstractC3163) m11526();
        C17721.m41503(strM11556, EnumC16309.MODIFY_DIRECTORY);
        C16999.m39866(strM11556, new String[0]).m36508();
        C15249 c15249M36216 = C15249.m36216(strM11556, new C4586(false), this.f47105);
        this.f47104 = c15249M36216;
        if (!this.f47102.f9955.f11350) {
            c15249M36216.m36246();
        }
        this.f47104.m36242(strArrM11558, (AbstractC13921) this.f47102, false, true);
        if (Build.VERSION.SDK_INT >= 30) {
            C8055 c8055 = new C8055();
            Iterator it = this.f47104.m36248().iterator();
            while (it.hasNext()) {
                ((AbstractC1139) it.next()).m3883(c8055, true);
            }
            if (!c8055.m21437()) {
                cancel();
                return C17222.m40521();
            }
        }
        m11536(this.f47103 ? R.string.MT_Protector : R.string.MT_Protector);
        mo23260(this.f47104);
        m46501(true);
        this.f47098.m49672();
        this.f47097.m12878();
        this.f47101 = new C21217(this.f47102, new C8328(this));
        Iterator it2 = this.f47104.m36248().iterator();
        do {
            boolean zHasNext = it2.hasNext();
            atomicReference = this.f47099;
            if (!zHasNext) {
                break;
            }
            m36417((AbstractC1139) it2.next());
            if (mo1526()) {
                break;
            }
        } while (atomicReference.get() == null);
        if (mo1526()) {
            return C17222.m40521();
        }
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        this.f47101.m48166(new InterfaceC24038() { // from class: l.ۚܿ᩻
            @Override // l.InterfaceC24038
            /* JADX INFO: renamed from: ֫ */
            public final void mo3587(C2872 c2872, boolean z) {
                C15382 c15382 = this.f17060;
                AtomicReference atomicReference2 = c15382.f47099;
                if (!z) {
                    Exception exc = (Exception) c2872.f9162.get();
                    if (exc != null) {
                        while (!atomicReference2.compareAndSet(null, exc) && atomicReference2.get() == null) {
                        }
                        return;
                    }
                    return;
                }
                C17558 c17558 = c2872.f9147;
                AbstractC15440 abstractC15440 = c2872.f9150;
                if (c17558 != null) {
                    c17558.m41052(abstractC15440);
                }
                if (c15382.f47106 && abstractC15440.mo27912()) {
                    abstractC15440.mo18537(c2872.f9161);
                }
                C14463.m34554(abstractC15440.mo23554(), true);
                Object obj = c2872.f9144;
                if (obj != null) {
                    c15382.f47107.add((String) obj);
                }
                if (c15382.f47103 && !c15382.mo1526()) {
                    try {
                        c15382.f47102.m9697(c2872.f9148, false);
                    } catch (Exception e) {
                        while (!atomicReference2.compareAndSet(null, e) && atomicReference2.get() == null) {
                        }
                    }
                }
                c15382.f47104.m47715();
                c15382.mo23260(c15382.f47104);
                c15382.mo11538(c15382.f47104.m47712());
            }
        });
        this.f47101.m48169();
        if (mo1526()) {
            return C17222.m40521();
        }
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        if (this.f47103) {
            Iterator it3 = this.f47104.m36248().iterator();
            while (it3.hasNext()) {
                m36416((AbstractC1139) it3.next());
                if (mo1526()) {
                    return C17222.m40521();
                }
            }
        }
        Iterator it4 = this.f47100.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
            if (mo1526()) {
                return C17222.m40521();
            }
        }
        SystemClock.sleep(100L);
        return C17222.m40520();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m36417(AbstractC1139 abstractC1139) {
        C17558 c17558;
        String str;
        boolean zM3880;
        boolean z;
        AbstractC15440 abstractC15440M36492;
        if (mo1526() || this.f47099.get() != null) {
            return;
        }
        mo23259(abstractC1139.m3898());
        abstractC1139.m3899();
        try {
            boolean zM3888 = abstractC1139.m3888();
            C22079 c22079 = this.f47098;
            if (zM3888) {
                if (!abstractC1139.m3879()) {
                    AbstractC15440 abstractC15440M3892 = abstractC1139.m3892();
                    c22079.m49673(abstractC15440M3892, EnumC16309.MODIFY_FILE);
                    abstractC15440M3892.m36508();
                    C17558 c17558M3901 = abstractC1139.m3901();
                    if (c17558M3901 != null) {
                        c17558M3901.m41052(abstractC15440M3892);
                    }
                    if (this.f47106 && abstractC15440M3892.mo27912()) {
                        this.f47100.add(new RunnableC22293(2, abstractC15440M3892, abstractC1139));
                    }
                }
                abstractC1139.m3891();
                this.f47104.m47715();
                if (abstractC1139.m3893() != null) {
                    this.f47107.add((String) abstractC1139.m3893());
                }
                Iterator it = abstractC1139.mo1983().m1988().iterator();
                while (it.hasNext()) {
                    m36417((AbstractC1139) it.next());
                }
            } else {
                String strM3910 = abstractC1139.m3910();
                C17558 c17558M3902 = abstractC1139.m3901();
                String name = abstractC1139.m3893() != null ? (String) abstractC1139.m3893() : null;
                if (!abstractC1139.m3879()) {
                    abstractC15440M36492 = abstractC1139.m3892();
                    c22079.m49673(abstractC15440M36492, EnumC16309.MODIFY_FILE);
                } else {
                    if (!abstractC1139.m3908()) {
                        AbstractC15440 abstractC15440M3893 = abstractC1139.m3892();
                        c22079.m49673(abstractC15440M3893, EnumC16309.MODIFY_FILE);
                        C17558 c17559 = new C17558();
                        c17559.m41050(abstractC15440M3893);
                        c17558 = c17559;
                        str = name;
                        zM3880 = abstractC1139.m3880();
                        z = true;
                        abstractC15440M36492 = abstractC15440M3893;
                    } else {
                        abstractC15440M36492 = abstractC1139.m3892().m36492(true);
                        c22079.m49673(abstractC15440M36492, EnumC16309.MODIFY_FILE);
                        if (name != null) {
                            name = abstractC15440M36492.getName();
                            abstractC1139.m3907(name);
                        }
                    }
                    this.f47101.m48165(abstractC1139.m3898(), strM3910, abstractC15440M36492, abstractC1139.m3913(), abstractC1139.m3887(), str, c17558, z, zM3880);
                }
                c17558 = c17558M3902;
                str = name;
                z = false;
                zM3880 = false;
                this.f47101.m48165(abstractC1139.m3898(), strM3910, abstractC15440M36492, abstractC1139.m3913(), abstractC1139.m3887(), str, c17558, z, zM3880);
            }
        } finally {
            abstractC1139.m3891();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m36416(AbstractC1139 abstractC1139) {
        if (abstractC1139.m3888()) {
            C0433 c0433Mo1983 = abstractC1139.mo1983();
            if (c0433Mo1983.m1986()) {
                Iterator it = c0433Mo1983.m1988().iterator();
                while (it.hasNext()) {
                    m36416((AbstractC1139) it.next());
                }
            } else {
                m11536(R.string.MT_Protector);
                mo11520(abstractC1139.m3898());
                C10445.m26286(this.f47102, c0433Mo1983);
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
            if (this.f47103) {
                c16560.m39015();
            }
        }
        List list = this.f47107;
        if (list.isEmpty() || !m11525(c16561)) {
            return;
        }
        c16561.m39000((Collection) list);
        c16561.m39015();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C21217 c21217 = this.f47101;
        if (c21217 != null && !c21217.m48167()) {
            this.f47101.m48168();
        }
        this.f47097.m12879();
        C15528.m36596();
        if (this.f47103) {
            C15528.m36595(this.f47102.mo9688());
        }
    }
}
