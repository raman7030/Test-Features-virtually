package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܰᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 140K */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13995 implements InterfaceC21242, InterfaceC9932 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2609 f41721 = C2609.m8239();

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo23526(Locale locale, String str, Object... objArr);

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo23531(C15014 c15014);

    @Override // l.InterfaceC9932
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4019(C0758 c0758, Object obj) {
        return mo23524((C3581) c0758, (Locale) obj);
    }

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12688(C0779 c0779, Object obj) {
        Locale locale = (Locale) obj;
        if (c0779.m2971() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(m33476((AbstractC4308) c0779, false));
            return C9045.m23341(sb, (String) c0779.f14167.mo2962(this, locale), "?");
        }
        return m33476((AbstractC4308) c0779, false) + ((String) c0779.m2971().mo2962(this, locale));
    }

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        Locale locale = (Locale) obj;
        StringBuilder sb = new StringBuilder();
        AbstractC4308 abstractC4308 = c5138;
        while (abstractC4308.m12913(EnumC9454.ARRAY)) {
            abstractC4308 = ((C5138) abstractC4308).f16077;
        }
        sb.append((String) abstractC4308.mo2962(this, locale));
        for (AbstractC4308 abstractC4309 = c5138; abstractC4309.m12913(EnumC9454.ARRAY); abstractC4309 = ((C5138) abstractC4309).f16077) {
            sb.append(m33476(abstractC4309, true));
            sb.append("[]");
        }
        return sb.toString();
    }

    @Override // l.InterfaceC9932
    /* JADX INFO: renamed from: ֫ */
    public final Object mo25039(AbstractC5698 abstractC5698, Object obj) {
        return abstractC5698.f17562.toString();
    }

    @Override // l.InterfaceC9932
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4020(C7814 c7814, Object obj) {
        Locale locale = (Locale) obj;
        if (c7814.m20880()) {
            return mo23526(locale, "compiler.misc.unnamed.package", new Object[0]);
        }
        return c7814.f24143.toString();
    }

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2744(C10077 c10077, Object obj) {
        Locale locale = (Locale) obj;
        return m33476((AbstractC4308) c10077, false) + "<" + m33477(c10077.f30362, locale) + ">" + ((String) c10077.f14167.mo2962(this, locale));
    }

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7394(C10658 c10658, Object obj) {
        Locale locale = (Locale) obj;
        return MotionUtils.EASING_TYPE_FORMAT_START + m33477(c10658.f32059, locale) + MotionUtils.EASING_TYPE_FORMAT_END + ((String) c10658.f32060.mo2962(this, locale));
    }

    @Override // l.InterfaceC9932
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4021(C12048 c12048, Object obj) {
        return c12048.f17562.toString();
    }

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9465(C12193 c12193, Object obj) {
        return mo2140((AbstractC4308) c12193, (Locale) obj);
    }

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo21835(C16301 c16301, Object obj) {
        return mo2140((AbstractC4308) c16301, (Locale) obj);
    }

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo21836(C17713 c17713, Object obj) {
        return c17713.f13890.mo16076().toString();
    }

    @Override // l.InterfaceC9932
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4022(AbstractC19810 abstractC19810, Object obj) {
        return abstractC19810.f17562.toString();
    }

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2144(C19831 c19831, Object obj) {
        Locale locale = (Locale) obj;
        StringBuilder sb = new StringBuilder();
        EnumC15678 enumC15678 = c19831.f64065;
        sb.append(enumC15678);
        if (enumC15678 != EnumC15678.UNBOUND) {
            sb.append(m33476((AbstractC4308) c19831, false));
            sb.append((String) c19831.f64066.mo2962(this, locale));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m33477(C2609 c2609, Locale locale) {
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            c18837.m43511((String) ((AbstractC4308) it.next()).mo2962(this, locale));
        }
        return c18837.m43517().m8241(",");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m33479(C15014 c15014, Locale locale) {
        if (this.f41721.contains(c15014)) {
            return m33476((AbstractC4308) c15014, false) + mo23526(locale, "compiler.misc.type.captureof.1", mo23531(c15014));
        }
        try {
            this.f41721 = this.f41721.m8246(c15014);
            return m33476((AbstractC4308) c15014, false) + mo23526(locale, "compiler.misc.type.captureof", mo23531(c15014), (String) c15014.f45790.mo2962(this, locale));
        } finally {
            this.f41721 = this.f41721.f8241;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33476(AbstractC4308 abstractC4308, boolean z) {
        StringBuilder sb = new StringBuilder();
        C2609 c2609M12931 = abstractC4308.m12931();
        if (!c2609M12931.isEmpty()) {
            if (z) {
                sb.append(' ');
            }
            sb.append(c2609M12931);
            sb.append(' ');
        }
        return sb.toString();
    }

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public String mo2145(C19955 c19955, Locale locale) {
        StringBuilder sb = new StringBuilder();
        if (c19955.mo4958().m12913(EnumC9454.CLASS) && c19955.f13890.f17561.f17559 == EnumC1296.f4582) {
            sb.append((String) c19955.mo4958().mo2962(this, locale));
            sb.append('.');
            sb.append(m33476((AbstractC4308) c19955, false));
            sb.append(mo23533(c19955, false, locale));
        } else {
            sb.append(m33476((AbstractC4308) c19955, false));
            sb.append(mo23533(c19955, true, locale));
        }
        if (c19955.mo12938().m8249()) {
            sb.append('<');
            sb.append(m33477(c19955.mo12938(), locale));
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public String mo2142(C8541 c8541, Locale locale) {
        return mo2140((AbstractC4308) c8541, locale);
    }

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public String mo2140(AbstractC4308 abstractC4308, Locale locale) {
        AbstractC10370 abstractC10370;
        AbstractC19810 abstractC19810 = abstractC4308.f13890;
        if (abstractC19810 == null || (abstractC10370 = abstractC19810.f17562) == null) {
            return mo23526(locale, "compiler.misc.type.none", new Object[0]);
        }
        return abstractC10370.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public String mo23533(C19955 c19955, boolean z, Locale locale) {
        AbstractC19810 abstractC19810 = c19955.f13890;
        if (abstractC19810.f17562.length() != 0 || (abstractC19810.mo16084() & 16777216) == 0) {
            if (abstractC19810.f17562.length() != 0) {
                return z ? abstractC19810.mo16076().toString() : abstractC19810.f17562.toString();
            }
            C19955 c19956 = (C19955) c19955.f13890.f17560;
            if (c19956 == null) {
                return mo23526(locale, "compiler.misc.anonymous.class", null);
            }
            C2609 c2609 = c19956.f64620;
            return (c2609 == null || !c2609.m8249()) ? mo23526(locale, "compiler.misc.anonymous.class", (String) c19956.f64618.mo2962(this, locale)) : mo23526(locale, "compiler.misc.anonymous.class", (String) ((AbstractC4308) c19956.f64620.f8240).mo2962(this, locale));
        }
        StringBuilder sb = new StringBuilder((String) c19955.f64618.mo2962(this, locale));
        for (C2609 c26010 = c19955.f64620; c26010.m8249(); c26010 = c26010.f8241) {
            sb.append('&');
            sb.append((String) ((AbstractC4308) c26010.f8240).mo2962(this, locale));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m33478(C2609 c2609, boolean z, Locale locale) {
        if (!z) {
            return m33477(c2609, locale);
        }
        StringBuilder sb = new StringBuilder();
        while (c2609.f8241.m8249()) {
            sb.append((String) ((AbstractC4308) c2609.f8240).mo2962(this, locale));
            c2609 = c2609.f8241;
            sb.append(',');
        }
        if (((AbstractC4308) c2609.f8240).m12913(EnumC9454.ARRAY)) {
            sb.append((String) ((C5138) c2609.f8240).f16077.mo2962(this, locale));
            if (((AbstractC4308) c2609.f8240).m12931().m8249()) {
                sb.append(' ');
                sb.append(((AbstractC4308) c2609.f8240).m12931());
                sb.append(' ');
            }
            sb.append("...");
        } else {
            sb.append((String) ((AbstractC4308) c2609.f8240).mo2962(this, locale));
        }
        return sb.toString();
    }

    @Override // l.InterfaceC9932
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public String mo23525(C14163 c14163, Locale locale) {
        return c14163.f17562.isEmpty() ? mo23526(locale, "compiler.misc.anonymous.class", c14163.f42771) : c14163.f42767.toString();
    }

    @Override // l.InterfaceC9932
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public String mo23524(C3581 c3581, Locale locale) {
        if (c3581.m10966()) {
            return c3581.f17561.f17562.toString();
        }
        AbstractC10370 abstractC10370 = c3581.f17562;
        String string = abstractC10370 == abstractC10370.f31203.f37517.f18879 ? c3581.f17561.f17562.toString() : abstractC10370.toString();
        AbstractC4308 abstractC4308 = c3581.f17560;
        if (abstractC4308 == null) {
            return string;
        }
        if (abstractC4308.m12913(EnumC9454.FORALL)) {
            string = "<" + m33477(c3581.f17560.mo12938(), locale) + ">" + string;
        }
        return C9045.m23341(C7166.m19190(string, MotionUtils.EASING_TYPE_FORMAT_START), m33478(c3581.f17560.mo12933(), (c3581.f17563 & 17179869184L) != 0, locale), MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
