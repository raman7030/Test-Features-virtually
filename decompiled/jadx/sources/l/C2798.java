package l;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C420 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2798 extends C20749 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C6319 f8730;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20661 f8731;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5931 f8732;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC1191 f8733;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C7031 f8734;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumMap f8735;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC12669 f8736;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2798 m8639(C2903 c2903) {
        C2798 c2798 = (C2798) c2903.m8837(C2798.class);
        return c2798 == null ? new C2798(c2903) : c2798;
    }

    public C2798(C2903 c2903) {
        AbstractC15601 abstractC15601 = (AbstractC15601) C22364.m50099(c2903).m50125();
        this.f66802 = abstractC15601;
        abstractC15601.getConfiguration();
        this.f66801 = new C6637();
        this.f8736 = new C14791(this);
        this.f8733 = new C23964(this);
        abstractC15601.f48057 = new C9148(this);
        this.f8731 = C20661.m47250(c2903);
        this.f8732 = C5931.m16615(c2903);
        this.f8730 = C6319.m17456(c2903);
        C14602.m34851(c2903);
        this.f8735 = new EnumMap(EnumC16202.class);
        C11781 c11781M28823 = C11781.m28823(c2903);
        abstractC15601.getConfiguration();
        C9854 c9854 = new C9854();
        c9854.f29817 = abstractC15601 instanceof C17614 ? EnumSet.noneOf(EnumC21143.class) : EnumSet.of(EnumC21143.SIMPLE_NAMES, EnumC21143.WHERE_CLAUSES, EnumC21143.UNIQUE_TYPEVAR_NAMES);
        String strM28824 = c11781M28823.m28824("diags.formatterOptions");
        if (strM28824 != null) {
            for (String str : strM28824.split(",")) {
                if (str.equals("-where")) {
                    c9854.f29817.remove(EnumC21143.WHERE_CLAUSES);
                } else if (str.equals("where")) {
                    c9854.f29817.add(EnumC21143.WHERE_CLAUSES);
                }
                if (str.equals("-simpleNames")) {
                    c9854.f29817.remove(EnumC21143.SIMPLE_NAMES);
                } else if (str.equals("simpleNames")) {
                    c9854.f29817.add(EnumC21143.SIMPLE_NAMES);
                }
                if (str.equals("-disambiguateTvars")) {
                    c9854.f29817.remove(EnumC21143.UNIQUE_TYPEVAR_NAMES);
                } else if (str.equals("disambiguateTvars")) {
                    c9854.f29817.add(EnumC21143.UNIQUE_TYPEVAR_NAMES);
                }
            }
        }
        this.f66801 = c9854;
        for (EnumC16202 enumC16202 : EnumC16202.values()) {
            this.f8735.put(enumC16202, new LinkedHashMap());
        }
    }

    @Override // l.InterfaceC12816
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String mo8643(C16719 c16719, Locale locale) {
        EnumMap enumMap;
        AbstractC15601 abstractC15601 = this.f66802;
        StringBuilder sb = new StringBuilder();
        this.f8734 = new C7031();
        EnumC16202[] enumC16202ArrValues = EnumC16202.values();
        int length = enumC16202ArrValues.length;
        int i = 0;
        while (true) {
            enumMap = this.f8735;
            if (i >= length) {
                break;
            }
            ((Map) enumMap.get(enumC16202ArrValues[i])).clear();
            i++;
        }
        m8642(c16719);
        sb.append(abstractC15601.mo8643(c16719, locale));
        if (((C9854) this.f66801).f29817.contains(EnumC21143.WHERE_CLAUSES)) {
            C2609 c2609M8239 = C2609.m8239();
            for (EnumC16202 enumC16202 : EnumC16202.values()) {
                C2609 c2609M82310 = C2609.m8239();
                Iterator it = ((Map) enumMap.get(enumC16202)).entrySet().iterator();
                while (it.hasNext()) {
                    C16719 c167110 = (C16719) ((Map.Entry) it.next()).getValue();
                    c2609M82310.getClass();
                    c2609M82310 = new C2609(c167110, c2609M82310);
                }
                if (!c2609M82310.isEmpty()) {
                    String strM38157 = enumC16202.m38157();
                    if (c2609M82310.m8245() > 1) {
                        strM38157 = C16014.m37867(strM38157, ".1");
                    }
                    C22864 c22864 = new C22864(this.f8732.m16622(strM38157, ((Map) enumMap.get(enumC16202)).keySet()), c2609M82310.m8250());
                    c2609M8239.getClass();
                    c2609M8239 = new C2609(c22864, c2609M8239);
                }
            }
            C2609 c2609M8250 = c2609M8239.m8250();
            String strM36768 = abstractC15601 instanceof C17614 ? "" : AbstractC15601.m36768(2);
            Iterator it2 = c2609M8250.iterator();
            while (it2.hasNext()) {
                String strMo8643 = abstractC15601.mo8643((C16719) it2.next(), locale);
                if (strMo8643.length() > 0) {
                    sb.append("\n" + strM36768 + strMo8643);
                }
            }
        }
        return sb.toString();
    }

    @Override // l.InterfaceC12816
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo8640(C16719 c16719, Locale locale) {
        this.f8734 = new C7031();
        m8642(c16719);
        return this.f66802.mo8640(c16719, locale);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8642(C16719 c16719) {
        for (Object obj : c16719.m39354()) {
            if (obj != null) {
                m8641(obj);
            }
        }
        if (c16719 instanceof C22864) {
            Iterator it = c16719.mo39349().iterator();
            while (it.hasNext()) {
                m8642((C16719) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8641(Object obj) {
        if (!(obj instanceof AbstractC4308)) {
            if (!(obj instanceof AbstractC5698)) {
                if (obj instanceof C16719) {
                    m8642((C16719) obj);
                    return;
                }
                if (obj instanceof Iterable) {
                    Iterable iterable = (Iterable) obj;
                    if (obj instanceof InterfaceC20758) {
                        return;
                    }
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        m8641(it.next());
                    }
                    return;
                }
                return;
            }
            AbstractC1191 abstractC1191 = this.f8733;
            abstractC1191.getClass();
            ((AbstractC5698) obj).mo2899(abstractC1191, (Locale) null);
            return;
        }
        AbstractC12669 abstractC12669 = this.f8736;
        abstractC12669.getClass();
        ((AbstractC4308) obj).mo2962(abstractC12669, (Object) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m8638(C2798 c2798, AbstractC4308 abstractC4308, EnumC16202 enumC16202) {
        int i = 1;
        for (AbstractC4308 abstractC4309 : ((Map) c2798.f8735.get(enumC16202)).keySet()) {
            if (abstractC4309.f13890 == abstractC4308.f13890) {
                return i;
            }
            if (enumC16202 != EnumC16202.TYPEVAR || abstractC4309.toString().equals(abstractC4308.toString())) {
                i++;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC12816
    public final InterfaceC4350 getConfiguration() {
        return (C9854) this.f66801;
    }
}
