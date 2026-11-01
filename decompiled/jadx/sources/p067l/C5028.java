package p067l;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C420 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5028 extends C22088 {

    /* JADX INFO: renamed from: ۜ */
    public final C8374 f11524;

    /* JADX INFO: renamed from: ܳ */
    public final C22004 f11525;

    /* JADX INFO: renamed from: ܽ */
    public final C8005 f11526;

    /* JADX INFO: renamed from: ܿ */
    public AbstractC3500 f11527;

    /* JADX INFO: renamed from: ᩳ */
    public C9051 f11528;

    /* JADX INFO: renamed from: ᩷ */
    public EnumMap f11529;

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC14409 f11530;

    /* JADX INFO: renamed from: ֫ */
    public static C5028 m10699(C5127 c5127) {
        C5028 c5028 = (C5028) c5127.m10904(C5028.class);
        return c5028 == null ? new C5028(c5127) : c5028;
    }

    public C5028(C5127 c5127) {
        AbstractC17195 abstractC17195 = (AbstractC17195) C23623.m52439(c5127).m52465();
        this.f69486 = abstractC17195;
        abstractC17195.getConfiguration();
        this.f69485 = new C8676();
        this.f11530 = new C16426(this);
        this.f11527 = new C25144(this);
        abstractC17195.f51189 = new C11063(this);
        this.f11525 = C22004.m49577(c5127);
        this.f11526 = C8005.m18541(c5127);
        this.f11524 = C8374.m19396(c5127);
        C16246.m37002(c5127);
        this.f11529 = new EnumMap(EnumC17767.class);
        C13565 c13565M30871 = C13565.m30871(c5127);
        abstractC17195.getConfiguration();
        C11734 c11734 = new C11734();
        c11734.f32770 = abstractC17195 instanceof C19109 ? EnumSet.noneOf(EnumC22463.class) : EnumSet.of(EnumC22463.SIMPLE_NAMES, EnumC22463.WHERE_CLAUSES, EnumC22463.UNIQUE_TYPEVAR_NAMES);
        String strM30872 = c13565M30871.m30872("diags.formatterOptions");
        if (strM30872 != null) {
            for (String str : strM30872.split(",")) {
                if (str.equals("-where")) {
                    c11734.f32770.remove(EnumC22463.WHERE_CLAUSES);
                } else if (str.equals("where")) {
                    c11734.f32770.add(EnumC22463.WHERE_CLAUSES);
                }
                if (str.equals("-simpleNames")) {
                    c11734.f32770.remove(EnumC22463.SIMPLE_NAMES);
                } else if (str.equals("simpleNames")) {
                    c11734.f32770.add(EnumC22463.SIMPLE_NAMES);
                }
                if (str.equals("-disambiguateTvars")) {
                    c11734.f32770.remove(EnumC22463.UNIQUE_TYPEVAR_NAMES);
                } else if (str.equals("disambiguateTvars")) {
                    c11734.f32770.add(EnumC22463.UNIQUE_TYPEVAR_NAMES);
                }
            }
        }
        this.f69485 = c11734;
        for (EnumC17767 enumC17767 : EnumC17767.values()) {
            this.f11529.put(enumC17767, new LinkedHashMap());
        }
    }

    @Override // p067l.InterfaceC14548
    /* JADX INFO: renamed from: ۧ */
    public final String mo10703(C18258 c18258, Locale locale) {
        EnumMap enumMap;
        AbstractC17195 abstractC17195 = this.f69486;
        StringBuilder sb = new StringBuilder();
        this.f11528 = new C9051();
        EnumC17767[] enumC17767ArrValues = EnumC17767.values();
        int length = enumC17767ArrValues.length;
        int i = 0;
        while (true) {
            enumMap = this.f11529;
            if (i >= length) {
                break;
            }
            ((Map) enumMap.get(enumC17767ArrValues[i])).clear();
            i++;
        }
        m10702(c18258);
        sb.append(abstractC17195.mo10703(c18258, locale));
        if (((C11734) this.f69485).f32770.contains(EnumC22463.WHERE_CLAUSES)) {
            C4848 c4848M10283 = C4848.m10283();
            for (EnumC17767 enumC17767 : EnumC17767.values()) {
                C4848 c4848M10284 = C4848.m10283();
                Iterator it = ((Map) enumMap.get(enumC17767)).entrySet().iterator();
                while (it.hasNext()) {
                    C18258 c18259 = (C18258) ((Map.Entry) it.next()).getValue();
                    c4848M10284.getClass();
                    c4848M10284 = new C4848(c18259, c4848M10284);
                }
                if (!c4848M10284.isEmpty()) {
                    String strM40369 = enumC17767.m40369();
                    if (c4848M10284.m10289() > 1) {
                        strM40369 = C17588.m40053(strM40369, ".1");
                    }
                    C24098 c24098 = new C24098(this.f11526.m18548(strM40369, ((Map) enumMap.get(enumC17767)).keySet()), c4848M10284.m10294());
                    c4848M10283.getClass();
                    c4848M10283 = new C4848(c24098, c4848M10283);
                }
            }
            C4848 c4848M10294 = c4848M10283.m10294();
            String strM38929 = abstractC17195 instanceof C19109 ? "" : AbstractC17195.m38929(2);
            Iterator it2 = c4848M10294.iterator();
            while (it2.hasNext()) {
                String strMo10703 = abstractC17195.mo10703((C18258) it2.next(), locale);
                if (strMo10703.length() > 0) {
                    sb.append("\n" + strM38929 + strMo10703);
                }
            }
        }
        return sb.toString();
    }

    @Override // p067l.InterfaceC14548
    /* JADX INFO: renamed from: ֫ */
    public final String mo10700(C18258 c18258, Locale locale) {
        this.f11528 = new C9051();
        m10702(c18258);
        return this.f69486.mo10700(c18258, locale);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10702(C18258 c18258) {
        for (Object obj : c18258.m41590()) {
            if (obj != null) {
                m10701(obj);
            }
        }
        if (c18258 instanceof C24098) {
            Iterator it = c18258.mo41585().iterator();
            while (it.hasNext()) {
                m10702((C18258) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10701(Object obj) {
        if (!(obj instanceof AbstractC6462)) {
            if (!(obj instanceof AbstractC7783)) {
                if (obj instanceof C18258) {
                    m10702((C18258) obj);
                    return;
                }
                if (obj instanceof Iterable) {
                    Iterable iterable = (Iterable) obj;
                    if (obj instanceof InterfaceC22097) {
                        return;
                    }
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        m10701(it.next());
                    }
                    return;
                }
                return;
            }
            AbstractC3500 abstractC3500 = this.f11527;
            abstractC3500.getClass();
            ((AbstractC7783) obj).mo5228(abstractC3500, (Locale) null);
            return;
        }
        AbstractC14409 abstractC14409 = this.f11530;
        abstractC14409.getClass();
        ((AbstractC6462) obj).mo5291(abstractC14409, (Object) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m10698(C5028 c5028, AbstractC6462 abstractC6462, EnumC17767 enumC17767) {
        int i = 1;
        for (AbstractC6462 abstractC6463 : ((Map) c5028.f11529.get(enumC17767)).keySet()) {
            if (abstractC6463.f16705 == abstractC6462.f16705) {
                return i;
            }
            if (enumC17767 != EnumC17767.TYPEVAR || abstractC6463.toString().equals(abstractC6462.toString())) {
                i++;
            }
        }
        return -1;
    }

    @Override // p067l.InterfaceC14548
    public final InterfaceC6502 getConfiguration() {
        return (C11734) this.f69485;
    }
}
