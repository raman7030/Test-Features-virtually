package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Locale;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩶֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19810 extends AbstractC5698 {
    /* JADX INFO: renamed from: ᩶֫ */
    public boolean mo33814() {
        return false;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ۜ */
    public InterfaceC11970 mo7176() {
        return this.f17561;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ᩴ */
    public AbstractC10370 mo960() {
        return this.f17562;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ᩷ */
    public /* bridge */ /* synthetic */ C2609 mo7180() {
        return super.mo7180();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC10370 m45553(AbstractC10370 abstractC10370, AbstractC5698 abstractC5698) {
        if (abstractC5698 == null) {
            return abstractC10370;
        }
        EnumC1296 enumC1296 = abstractC5698.f17559;
        if (enumC1296 != EnumC1296.f4581) {
            if (enumC1296.m4391(C15406.f47185)) {
                return abstractC10370;
            }
            if (abstractC5698.f17559 == EnumC1296.f4582 && abstractC5698.f17560.m12913(EnumC9454.TYPEVAR)) {
                return abstractC10370;
            }
        }
        AbstractC10370 abstractC10370Mo16076 = abstractC5698.mo16076();
        return (abstractC10370Mo16076 == null || abstractC10370Mo16076 == abstractC10370Mo16076.f31203.f37517.f18867) ? abstractC10370 : abstractC10370Mo16076.m26171('.', abstractC10370);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC10370 m45552(AbstractC10370 abstractC10370, AbstractC5698 abstractC5698) {
        if (abstractC5698 == null || abstractC5698.f17559.m4391(C15406.f47185)) {
            return abstractC10370;
        }
        EnumC1296 enumC1296 = abstractC5698.f17559;
        EnumC1296 enumC1297 = EnumC1296.f4582;
        if (enumC1296 == enumC1297 && abstractC5698.f17560.m12913(EnumC9454.TYPEVAR)) {
            return abstractC10370;
        }
        char c = abstractC5698.f17559 == enumC1297 ? '$' : '.';
        AbstractC10370 abstractC10370Mo16083 = abstractC5698.mo16083();
        return (abstractC10370Mo16083 == null || abstractC10370Mo16083 == abstractC10370Mo16083.f31203.f37517.f18867) ? abstractC10370 : abstractC10370Mo16083.m26171(c, abstractC10370);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m45554(AbstractC19810 abstractC19810, C6319 c6319) {
        if (this == abstractC19810) {
            return false;
        }
        if (this.f17560.m12913(abstractC19810.f17560.mo3258())) {
            if (this.f17560.m12913(EnumC9454.CLASS)) {
                if (c6319.m17517(abstractC19810.f17560) >= c6319.m17517(this.f17560)) {
                    if (c6319.m17517(abstractC19810.f17560) != c6319.m17517(this.f17560)) {
                        return false;
                    }
                    AbstractC10370 abstractC10370Mo16076 = abstractC19810.mo16076();
                    AbstractC10370 abstractC10370Mo16077 = mo16076();
                    abstractC10370Mo16076.getClass();
                    if (abstractC10370Mo16077.mo2760() - abstractC10370Mo16076.mo2760() >= 0) {
                        return false;
                    }
                }
                return true;
            }
            if (this.f17560.m12913(EnumC9454.TYPEVAR)) {
                return c6319.m17546(this.f17560, abstractC19810.f17560, true);
            }
        }
        return this.f17560.m12913(EnumC9454.TYPEVAR);
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ܺ */
    public C2609 mo958() {
        C2609 c2609M8239 = C2609.m8239();
        if (this.f17559 == EnumC1296.f4582 && this.f17560.m12913(EnumC9454.TYPEVAR)) {
            return c2609M8239;
        }
        m16103();
        for (AbstractC5698 abstractC5698 : mo16064().mo20475((Predicate) null, EnumC1317.NON_RECURSIVE)) {
            abstractC5698.m16103();
            if ((abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 && abstractC5698.f17561 == this && abstractC5698.f17559 != EnumC1296.f4581) {
                c2609M8239 = c2609M8239.m8246(abstractC5698);
            }
        }
        return c2609M8239;
    }

    /* JADX INFO: renamed from: ᩹֫ */
    public C21863 mo33816() {
        C12171.m29640("Only on ClassSymbol");
        throw null;
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ֫ */
    public Object mo2899(InterfaceC9932 interfaceC9932, Locale locale) {
        return interfaceC9932.mo4022(this, (Object) locale);
    }
}
