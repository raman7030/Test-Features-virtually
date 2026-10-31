package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public final class C14163 extends AbstractC19810 implements InterfaceC9169 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public AbstractC14016 f42762;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C21863 f42763;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f42764;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C2609 f42765;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC18278 f42766;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC10370 f42767;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C2609 f42768;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public C2609 f42769;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC18278 f42770;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC10370 f42771;

    public C14163(long j, AbstractC10370 abstractC10370, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698) {
        super(EnumC1296.f4582, j, abstractC10370, abstractC4308, abstractC5698);
        this.f42768 = C2609.m8239();
        this.f42764 = false;
        this.f42762 = null;
        this.f42767 = AbstractC19810.m45553(abstractC10370, abstractC5698);
        this.f42771 = AbstractC19810.m45552(abstractC10370, abstractC5698);
        this.f42770 = null;
        this.f42766 = null;
        this.f42763 = C21863.m49251();
        this.f42765 = C2609.m8239();
    }

    public C14163(long j, AbstractC10370 abstractC10370, AbstractC5698 abstractC5698) {
        this(j, abstractC10370, new C19955(null, AbstractC4308.f13885, null), abstractC5698);
        this.f17560.f13890 = this;
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ۬ */
    public final long mo16084() {
        mo16101();
        return this.f17563;
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ֨֫ */
    public final AbstractC14016 mo16064() {
        mo16101();
        return this.f42762;
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ֫֫ */
    public final C2609 mo16068() {
        mo16101();
        return super.mo16068();
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ۧ֫ */
    public final C2609 mo16081() {
        mo16101();
        return super.mo16081();
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC4308 mo16091(C6319 c6319) {
        if (this.f17565 == null) {
            this.f17565 = new C19955(c6319.m17519(this.f17560.mo4958()), C2609.m8239(), this, this.f17560.f13889);
        }
        return this.f17565;
    }

    @Override // l.AbstractC5698
    public final String toString() {
        if (this.f17562.isEmpty()) {
            return C22364.m50106("anonymous.class", this.f42771);
        }
        return this.f42767.toString();
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ۟ */
    public final AbstractC10370 mo16076() {
        return this.f42767;
    }

    @Override // l.InterfaceC9169, l.InterfaceC21164
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC10370 mo957() {
        return this.f42767;
    }

    @Override // l.AbstractC19810, l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ܺ */
    public final C2609 mo958() {
        C2609 c2609Mo958 = super.mo958();
        if (!this.f42768.isEmpty()) {
            Iterator it = this.f42768.m8250().iterator();
            while (it.hasNext()) {
                c2609Mo958 = c2609Mo958.m8246((C21221) it.next());
            }
        }
        return c2609Mo958;
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ۫ */
    public final AbstractC10370 mo16083() {
        return this.f42771;
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo16080(AbstractC5698 abstractC5698, C6319 c6319) {
        if (this == abstractC5698) {
            return true;
        }
        if ((abstractC5698.mo16084() & 512) != 0) {
            AbstractC4308 abstractC4308M17562 = this.f17560;
            while (abstractC4308M17562.m12913(EnumC9454.CLASS)) {
                for (C2609 c2609M17510 = c6319.m17510(abstractC4308M17562); c2609M17510.m8249(); c2609M17510 = c2609M17510.f8241) {
                    if (((AbstractC4308) c2609M17510.f8240).f13890.mo16080(abstractC5698, c6319)) {
                        return true;
                    }
                }
                abstractC4308M17562 = c6319.m17562(abstractC4308M17562);
            }
            return false;
        }
        AbstractC4308 abstractC4308M17563 = this.f17560;
        while (abstractC4308M17563.m12913(EnumC9454.CLASS)) {
            if (abstractC4308M17563.f13890 == abstractC5698) {
                return true;
            }
            abstractC4308M17563 = c6319.m17562(abstractC4308M17563);
        }
        return false;
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ᩶ */
    public final void mo16101() {
        InterfaceC6403 interfaceC6403 = this.f17564;
        try {
            super.mo16101();
        } catch (C20515 e) {
            e.f66104.m6535(this, interfaceC6403);
            this.f17563 |= 9;
            this.f17560 = new C12193(this, AbstractC4308.f13885);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m33806() {
        m16103();
        AbstractC4308 abstractC4308 = this.f17560;
        if (abstractC4308 instanceof C19955) {
            C19955 c19955 = (C19955) abstractC4308;
            if (c19955.f64620 == null) {
                c19955.f64620 = C2609.m8239();
            }
            C2609 c2609 = c19955.f64619;
            if (c2609 != null) {
                C18837 c18837 = new C18837();
                Iterator it = c2609.iterator();
                while (it.hasNext()) {
                    c18837.m43511(((AbstractC4308) it.next()).mo12330());
                }
                return c18837.m43517();
            }
            return c19955.f64620;
        }
        return C2609.m8239();
    }

    @Override // l.InterfaceC9169
    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC4308 mo23577() {
        m16103();
        AbstractC4308 abstractC4308 = this.f17560;
        if (abstractC4308 instanceof C19955) {
            C19955 c19955 = (C19955) abstractC4308;
            if (c19955.f64618 == null) {
                c19955.f64618 = AbstractC4308.f13885;
            }
            if (c19955.mo12925()) {
                return AbstractC4308.f13885;
            }
            return c19955.f64618.mo12330();
        }
        return AbstractC4308.f13885;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ֫ */
    public final EnumC23258 mo952() {
        m16103();
        mo16101();
        long j = this.f17563;
        if ((8192 & j) != 0) {
            return EnumC23258.ANNOTATION_TYPE;
        }
        if ((512 & j) != 0) {
            return EnumC23258.INTERFACE;
        }
        if ((16384 & j) != 0) {
            return EnumC23258.ENUM;
        }
        if ((j & 2305843009213693952L) != 0) {
            return EnumC23258.RECORD;
        }
        return EnumC23258.CLASS;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ܳ */
    public final Set mo10965() {
        m16103();
        mo16101();
        return C19642.m45151(this.f17563 & (-8796093022209L));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21221 m33803(C12048 c12048) {
        for (C21221 c21221 : this.f42768) {
            if (c21221.f17562 == c12048.f17562) {
                return c21221;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21221 m33802(C9378 c9378) {
        C21221 c21221 = null;
        for (C21221 c21222 : this.f42768) {
            if (c21222.f17562 == c9378.f28484 && c9378.f16085 == c21222.f68392) {
                c21221 = c21222;
            }
        }
        return c21221;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33804(C21221 c21221, C9378 c9378, C2609 c2609) {
        boolean z;
        if (c21221 != null) {
            C2609 c2609M8237 = C2609.m8237(c21221, this.f42768);
            this.f42768 = c2609M8237;
            this.f42768 = c2609M8237.m8242(new C21221(c9378.f28489, c21221.f68390, c21221.f68388));
            return;
        }
        C2609 c26010 = this.f42768;
        C12048 c12048 = c9378.f28489;
        if (c12048.f17560.m12913(EnumC9454.ARRAY)) {
            C5138 c5138 = (C5138) c12048.f17560;
            c5138.getClass();
            if (c5138 instanceof C0198) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f42768 = c26010.m8242(new C21221(c12048, c2609, z));
    }

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m33809() {
        return this.f42768;
    }

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final C2609 m33811() {
        return this.f42768;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m33815(C2609 c2609) {
        this.f42768 = c2609;
    }

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final EnumC23985 m33812() {
        m16103();
        if (this.f17561.f17559 == EnumC1296.f4579) {
            return EnumC23985.TOP_LEVEL;
        }
        if (this.f17562.isEmpty()) {
            return EnumC23985.ANONYMOUS;
        }
        if (this.f17561.f17559 == EnumC1296.f4571) {
            return EnumC23985.LOCAL;
        }
        return EnumC23985.MEMBER;
    }

    @Override // l.InterfaceC11970
    /* JADX INFO: renamed from: ֫ */
    public final Object mo951(AbstractC8463 abstractC8463, Object obj) {
        return abstractC8463.mo10392(this, obj);
    }

    @Override // l.AbstractC19810, l.AbstractC5698
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2899(InterfaceC9932 interfaceC9932, Locale locale) {
        return interfaceC9932.mo23525(this, (Object) locale);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m33813(C6319 c6319) {
        if (c6319.f19569.m33123(this) != null) {
            mo16101();
            if ((this.f17563 & 16384) == 0 || c6319.m17562(this.f17560).f13890 != c6319.f19609.f66527) {
                return;
            }
            mo16101();
            if ((this.f17563 & 1040) != 0 || c6319.m17486(this) == null) {
                return;
            }
            this.f17563 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        }
    }

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public final void m33817() {
        this.f17559 = EnumC1296.f4582;
        this.f17565 = null;
        this.f42762 = null;
        this.f17563 = 0L;
        AbstractC4308 abstractC4308 = this.f17560;
        if (abstractC4308 instanceof C19955) {
            C19955 c19955 = (C19955) abstractC4308;
            c19955.mo4959(AbstractC4308.f13885);
            c19955.f64621 = -1;
            c19955.f64616 = null;
            c19955.f64617 = null;
            c19955.f64618 = null;
            c19955.f64620 = null;
            c19955.f64619 = null;
        }
        m33807();
    }

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final void m33807() {
        this.f17558 = null;
        this.f42763 = C21863.m49251();
    }

    @Override // l.AbstractC19810
    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public final C21863 mo33816() {
        return this.f42763;
    }

    @Override // l.AbstractC19810
    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public final boolean mo33814() {
        return (this.f17563 & 8192) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33805(C21863 c21863) {
        C12171.m29642(!this.f42763.m49254());
        this.f42763 = c21863;
    }

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33810() {
        return (this.f17563 & 2305843009213693952L) != 0;
    }
}
