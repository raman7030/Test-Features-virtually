package l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5515 extends AbstractC13980 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11139 f17073;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC12612 mo15647(AbstractC12612 abstractC12612) {
        return abstractC12612;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5515(C11139 c11139, EnumC12075 enumC12075, AbstractC13980 abstractC13980) {
        super(c11139, enumC12075, abstractC13980);
        this.f17073 = c11139;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1755 m15646(C1755 c1755, C5557 c5557) {
        AbstractC14016 abstractC14016M33607 = AbstractC14016.m33607(c5557.f17186);
        for (AbstractC5698 abstractC5698 : ((C8604) c1755.f6076.f6073).f26285.mo20475((Predicate) null, EnumC1317.NON_RECURSIVE)) {
            if (abstractC5698.m16077()) {
                abstractC14016M33607.mo26382(abstractC5698);
            }
        }
        C2609 c2609 = c5557.f17185;
        if (c2609 != null) {
            while (c2609.m8249()) {
                abstractC14016M33607.mo26382(((C14315) c2609.f8240).f16086.f13890);
                c2609 = c2609.f8241;
            }
        }
        C1755 c1756 = c1755.f6076;
        C1755 c1755M5877 = c1756.m5877(c5557, ((C8604) c1756.f6073).m22358(abstractC14016M33607));
        c1755M5877.f6078 = true;
        c1755M5877.f6076 = c1756;
        ((C8604) c1755M5877.f6073).f26299 = false;
        return c1755M5877;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15648(C1755 c1755, C1755 c1756) {
        AbstractC4308 abstractC4308M23936;
        AbstractC4308 c4104;
        AbstractC12612 abstractC12612;
        C5557 c5557 = c1755.f6079;
        C14163 c14163 = c5557.f17186;
        C19955 c19955 = (C19955) c14163.f17560;
        AbstractC12612 abstractC12613 = c5557.f17184;
        C18837 c18837 = null;
        C11139 c11139 = this.f17073;
        if (abstractC12613 != null) {
            AbstractC12612 abstractC12612Mo15647 = mo15647(abstractC12613);
            c4104 = c11139.f33427.m23936(abstractC12612Mo15647, c1756, true, false, true);
            if (c4104 == c11139.f33440.f66489) {
                C22364 c22364 = c11139.f33430;
                AbstractC19810 abstractC19810 = c4104.f13890;
                C12281 c12281 = C6241.f19132;
                c22364.m7273(c5557, new C12281("compiler", "invalid.supertype.record", abstractC19810));
            }
            abstractC12612 = abstractC12612Mo15647;
        } else {
            if ((c5557.f17181.f7169 & 16384) != 0) {
                C9310 c9310 = c11139.f33427;
                int i = c5557.f16085;
                C17013 c17013 = c11139.f33425;
                c17013.f52172 = i;
                abstractC4308M23936 = c9310.m23936((AbstractC12612) c17013.m39960(c11139.f33425.m39954(c11139.f33440.f66527), C2609.of((Object) c11139.f33425.m39965(c14163.f17560))), c1756, true, false, false);
            } else if (c14163.f42767 == c11139.f33438.f18887) {
                abstractC4308M23936 = AbstractC4308.f13885;
            } else {
                abstractC4308M23936 = c14163.m33810() ? c11139.f33440.f66489 : c11139.f33440.f66526;
            }
            c4104 = abstractC4308M23936;
            abstractC12612 = null;
        }
        if (c4104.m12913(EnumC9454.ERROR)) {
            c4104 = new C4104(this, c4104.mo12947(), c4104.f13890, c1756, false, abstractC12612);
        }
        c19955.f64618 = c4104;
        C18837 c18838 = new C18837();
        Iterator it = c5557.f17183.iterator();
        while (it.hasNext()) {
            AbstractC12612 abstractC12612Mo15648 = mo15647((AbstractC12612) it.next());
            AbstractC4308 abstractC4308M23937 = c11139.f33427.m23936(abstractC12612Mo15648, c1756, false, true, true);
            if (!abstractC4308M23937.m12913(EnumC9454.CLASS)) {
                if (c18837 == null) {
                    c18837 = new C18837();
                    c18837.m43513(c18838);
                }
                if (abstractC4308M23937.m12913(EnumC9454.ERROR)) {
                    abstractC4308M23937 = new C4104(this, abstractC4308M23937.mo12947(), abstractC4308M23937.f13890, c1756, true, abstractC12612Mo15648);
                }
                c18837.m43511(abstractC4308M23937);
            } else {
                c18838.m43511(abstractC4308M23937);
                if (c18837 != null) {
                    c18837.m43511(abstractC4308M23937);
                }
            }
        }
        C18837 c18839 = new C18837();
        Iterator it2 = c5557.f17182.iterator();
        while (it2.hasNext()) {
            c18839.m43511(c11139.f33427.m23936((AbstractC12612) it2.next(), c1756, false, false, false).f13890);
        }
        if ((c14163.f17563 & 8192) != 0) {
            C2609 c2609Of = C2609.of((Object) c11139.f33440.f66485);
            c19955.f64620 = c2609Of;
            c19955.f64619 = c2609Of;
        } else {
            C2609 c2609M43517 = c18838.m43517();
            c19955.f64620 = c2609M43517;
            if (c18837 != null) {
                c2609M43517 = c18837.m43517();
            }
            c19955.f64619 = c2609M43517;
        }
        if (!c18839.isEmpty()) {
            c14163.f42765 = c18839.m43517();
        }
        c14163.f42764 = true ^ c18839.isEmpty();
    }
}
