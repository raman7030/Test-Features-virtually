package p067l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7610 extends AbstractC15655 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C12955 f19914;

    /* JADX INFO: renamed from: ֫ */
    public AbstractC14355 mo17562(AbstractC14355 abstractC14355) {
        return abstractC14355;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7610(C12955 c12955, EnumC13844 enumC13844, AbstractC15655 abstractC15655) {
        super(c12955, enumC13844, abstractC15655);
        this.f19914 = c12955;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4036 m17561(C4036 c4036, C7650 c7650) {
        AbstractC15689 abstractC15689M35727 = AbstractC15689.m35727(c7650.f20027);
        for (AbstractC7783 abstractC7783 : ((C10545) c4036.f8852.f8849).f29201.mo22455((Predicate) null, EnumC3620.NON_RECURSIVE)) {
            if (abstractC7783.m17996()) {
                abstractC15689M35727.mo28415(abstractC7783);
            }
        }
        C4848 c4848 = c7650.f20026;
        if (c4848 != null) {
            while (c4848.m10293()) {
                abstractC15689M35727.mo28415(((C15973) c4848.f11034).f18925.f16705);
                c4848 = c4848.f11035;
            }
        }
        C4036 c4037 = c4036.f8852;
        C4036 c4036M8087 = c4037.m8087(c7650, ((C10545) c4037.f8849).m24327(abstractC15689M35727));
        c4036M8087.f8854 = true;
        c4036M8087.f8852 = c4037;
        ((C10545) c4036M8087.f8849).f29215 = false;
        return c4036M8087;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17563(C4036 c4036, C4036 c4037) {
        AbstractC6462 abstractC6462M25945;
        AbstractC6462 c6269;
        AbstractC14355 abstractC14355;
        C7650 c7650 = c4036.f8855;
        C15828 c15828 = c7650.f20027;
        C21333 c21333 = (C21333) c15828.f20406;
        AbstractC14355 abstractC14356 = c7650.f20025;
        C20271 c20271 = null;
        C12955 c12955 = this.f19914;
        if (abstractC14356 != null) {
            AbstractC14355 abstractC14355Mo17562 = mo17562(abstractC14356);
            c6269 = c12955.f36427.m25945(abstractC14355Mo17562, c4037, true, false, true);
            if (c6269 == c12955.f36440.f69171) {
                C23623 c23623 = c12955.f36430;
                AbstractC21195 abstractC21195 = c6269.f16705;
                C14040 c14040 = C8300.f21997;
                c23623.m9352(c7650, new C14040("compiler", "invalid.supertype.record", abstractC21195));
            }
            abstractC14355 = abstractC14355Mo17562;
        } else {
            if ((c7650.f20022.f9954 & 16384) != 0) {
                C11216 c11216 = c12955.f36427;
                int i = c7650.f18924;
                C18537 c18537 = c12955.f36425;
                c18537.f55352 = i;
                abstractC6462M25945 = c11216.m25945((AbstractC14355) c18537.m42203(c12955.f36425.m42197(c12955.f36440.f69209), C4848.m10276of((Object) c12955.f36425.m42208(c15828.f20406))), c4037, true, false, false);
            } else if (c15828.f45855 == c12955.f36438.f21745) {
                abstractC6462M25945 = AbstractC6462.f16700;
            } else {
                abstractC6462M25945 = c15828.m35942() ? c12955.f36440.f69171 : c12955.f36440.f69208;
            }
            c6269 = abstractC6462M25945;
            abstractC14355 = null;
        }
        if (c6269.m14777(EnumC11353.ERROR)) {
            c6269 = new C6269(this, c6269.mo14811(), c6269.f16705, c4037, false, abstractC14355);
        }
        c21333.f67259 = c6269;
        C20271 c20272 = new C20271();
        Iterator it = c7650.f20024.iterator();
        while (it.hasNext()) {
            AbstractC14355 abstractC14355Mo17563 = mo17562((AbstractC14355) it.next());
            AbstractC6462 abstractC6462M25946 = c12955.f36427.m25945(abstractC14355Mo17563, c4037, false, true, true);
            if (!abstractC6462M25946.m14777(EnumC11353.CLASS)) {
                if (c20271 == null) {
                    c20271 = new C20271();
                    c20271.m45779(c20272);
                }
                if (abstractC6462M25946.m14777(EnumC11353.ERROR)) {
                    abstractC6462M25946 = new C6269(this, abstractC6462M25946.mo14811(), abstractC6462M25946.f16705, c4037, true, abstractC14355Mo17563);
                }
                c20271.m45777(abstractC6462M25946);
            } else {
                c20272.m45777(abstractC6462M25946);
                if (c20271 != null) {
                    c20271.m45777(abstractC6462M25946);
                }
            }
        }
        C20271 c20273 = new C20271();
        Iterator it2 = c7650.f20023.iterator();
        while (it2.hasNext()) {
            c20273.m45777(c12955.f36427.m25945((AbstractC14355) it2.next(), c4037, false, false, false).f16705);
        }
        if ((c15828.f20409 & 8192) != 0) {
            C4848 c4848M10276of = C4848.m10276of((Object) c12955.f36440.f69167);
            c21333.f67261 = c4848M10276of;
            c21333.f67260 = c4848M10276of;
        } else {
            C4848 c4848M45783 = c20272.m45783();
            c21333.f67261 = c4848M45783;
            if (c20271 != null) {
                c4848M45783 = c20271.m45783();
            }
            c21333.f67260 = c4848M45783;
        }
        if (!c20273.isEmpty()) {
            c15828.f45853 = c20273.m45783();
        }
        c15828.f45852 = true ^ c20273.isEmpty();
    }
}
