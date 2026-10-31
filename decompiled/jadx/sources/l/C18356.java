package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩳ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes5.dex */
public final class C18356 extends AbstractC24000 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C3581 f57038;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public EnumMap f57039;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashSet f57040;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C2609 f57041;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C12048 f57042;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7067 f57043;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC12612 f57044;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 f57045;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18356(C7067 c7067, C14169 c14169) {
        super(c7067, c14169);
        this.f57043 = c7067;
        C11674 c11674 = (C11674) c7067.f21744.f8240;
        int[] iArr = C4618.f14693;
        AbstractC5144 abstractC5144 = c11674.f34784;
        int i = iArr[abstractC5144.mo989().ordinal()];
        if (i == 5) {
            C12048 c12048 = ((C9378) abstractC5144).f28489;
            this.f57042 = c12048;
            this.f57045 = c12048;
        } else if (i == 9) {
            this.f57042 = null;
            this.f57045 = C7260.m19472(((C21080) abstractC5144).f67987);
        } else {
            this.f57042 = null;
            this.f57045 = null;
        }
        AbstractC5698 abstractC5698 = this.f77787;
        if (abstractC5698.f17559 == EnumC1296.f4571) {
            this.f57038 = new C7440(this.f77787.m16071(), (C3581) abstractC5698.mo7177(abstractC5698.f17561));
        } else {
            this.f57038 = new C3581(4098L, null, null, abstractC5698.m16071());
        }
        EnumMap enumMap = new EnumMap(EnumC21179.class);
        this.f57039 = enumMap;
        enumMap.put(EnumC21179.PARAM, new LinkedHashMap());
        enumMap.put(EnumC21179.LOCAL_VAR, new LinkedHashMap());
        enumMap.put(EnumC21179.CAPTURED_VAR, new LinkedHashMap());
        enumMap.put(EnumC21179.CAPTURED_THIS, new LinkedHashMap());
        enumMap.put(EnumC21179.CAPTURED_OUTER_THIS, new LinkedHashMap());
        this.f57040 = new HashSet();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42781(AbstractC5698 abstractC5698, EnumC21179 enumC21179) {
        AbstractC5698 c2128;
        C14163 c14163M19064;
        C7067 c7067 = this.f57043;
        C9184 c9184 = c7067.f21747;
        if (enumC21179 == EnumC21179.CAPTURED_THIS && abstractC5698 != null && abstractC5698.f17559 == EnumC1296.f4582 && !c7067.f21741.isEmpty() && (c14163M19064 = c7067.m19064()) != null && c7067.f21741.contains(c14163M19064)) {
            C12171.m29642(abstractC5698 != c14163M19064);
            enumC21179 = EnumC21179.CAPTURED_OUTER_THIS;
        }
        Map mapM42778 = m42778(enumC21179);
        if (mapM42778.containsKey(abstractC5698)) {
            return;
        }
        int iOrdinal = enumC21179.ordinal();
        C3581 c3581 = this.f57038;
        if (iOrdinal == 0) {
            C12048 c12048 = new C12048((abstractC5698.mo16084() & 16) | 8589934592L, abstractC5698.f17562, c9184.f27821.m17519(abstractC5698.f17560), c3581);
            C12048 c12049 = (C12048) abstractC5698;
            c12048.f36040 = c12049.f36040;
            if (c12049.m29423()) {
                c12048.m29421(EnumC23258.EXCEPTION_PARAMETER);
            }
            c2128 = c12048;
        } else if (iOrdinal == 1) {
            C16944 c16944 = new C16944(abstractC5698.mo16084() & 16, abstractC5698.f17562, abstractC5698.f17560, c3581, abstractC5698);
            C12048 c120410 = (C12048) abstractC5698;
            c16944.f36040 = c120410.f36040;
            if (c120410.m29423()) {
                c16944.m29421(EnumC23258.EXCEPTION_PARAMETER);
            }
            c2128 = c16944;
        } else if (iOrdinal == 2) {
            c2128 = new C2128(abstractC5698.f17562, c9184.f27821.m17519(abstractC5698.f17560), c3581, abstractC5698);
        } else if (iOrdinal == 3) {
            c2128 = abstractC5698;
        } else if (iOrdinal == 4) {
            C6136 c6136 = c9184.f27819;
            String str = new String(abstractC5698.mo16083().toString().replace('.', '$') + ((Object) c9184.f27819.f18839));
            AbstractC12486 abstractC12486 = c6136.f18880;
            abstractC12486.getClass();
            char[] charArray = str.toCharArray();
            c2128 = new C11301(abstractC12486.mo15927(charArray, charArray.length), c9184.f27821.m17519(abstractC5698.f17560), c3581, abstractC5698);
        } else {
            C12171.m29640(enumC21179.name());
            throw null;
        }
        if (c2128 != abstractC5698 && enumC21179.m48128()) {
            c2128.m16086(abstractC5698.mo16068());
            c2128.m16074(abstractC5698.mo16081());
        }
        mapM42778.put(abstractC5698, c2128);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map m42778(EnumC21179 enumC21179) {
        Map map = (Map) this.f57039.get(enumC21179);
        C12171.m29637(map);
        return map;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m42780(final C7673 c7673) {
        C9184 c9184 = this.f57043.f21747;
        for (EnumC21179 enumC21179 : EnumC21179.values()) {
            Map mapM42778 = m42778(enumC21179);
            if (enumC21179.ordinal() != 4) {
                if (mapM42778.containsKey(c7673.f23697)) {
                    C7673 c7673M39914 = c9184.f27818.m39914((AbstractC5698) mapM42778.get(c7673.f23697));
                    c7673M39914.f16086 = c7673.f16086;
                    return c7673M39914;
                }
            } else {
                C16646 c16646Reduce = C5378.stream(mapM42778.keySet()).filter(new Predicate() { // from class: l.᩺ۨ֨
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19285.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo4928negate() {
                        return C19285.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19285.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C18356 c18356 = this.f73953;
                        c18356.getClass();
                        return c7673.f23697.m16067(((AbstractC5698) obj).f17560.f13890, c18356.f57043.f21747.f27821);
                    }
                }).reduce(new C13789());
                if (c16646Reduce.isPresent()) {
                    C7673 c7673M39915 = c9184.f27818.m39914((AbstractC5698) mapM42778.get(c16646Reduce.get()));
                    c7673M39915.f16086 = c7673.f23697.f17561.f17560;
                    C6262 c6262M39912 = c9184.f27818.m39912(c7673M39915, c7673.f23696);
                    c6262M39912.f16086 = c7673.f16086;
                    C7260.m19459(c7673.f23697, c6262M39912);
                    return c6262M39912;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7673 m42779(C6262 c6262) {
        AbstractC10370 abstractC10370 = c6262.f19395;
        C9184 c9184 = this.f57043.f21747;
        C12171.m29642(abstractC10370 == c9184.f27819.f18886);
        Map map = (Map) this.f57039.get(EnumC21179.CAPTURED_OUTER_THIS);
        if (!map.containsKey(c6262.f19396.f17561)) {
            return null;
        }
        C7673 c7673M39914 = c9184.f27818.m39914((AbstractC5698) map.get(c6262.f19396.f17561));
        c7673M39914.f16086 = c6262.f19396.f17561.f17560;
        return c7673M39914;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42782(C19110 c19110) {
        C12171.m29642(c19110.f60196.f16086.f13890.m16087() && c19110.f60199 == null);
        Map map = (Map) this.f57039.get(EnumC21179.CAPTURED_OUTER_THIS);
        AbstractC4308 abstractC4308Mo4958 = c19110.f60196.f16086.mo4958();
        if (map.containsKey(abstractC4308Mo4958.f13890)) {
            C7673 c7673M39914 = this.f57043.f21747.f27818.m39914((AbstractC5698) map.get(abstractC4308Mo4958.f13890));
            c7673M39914.f16086 = abstractC4308Mo4958;
            c19110.f60199 = c7673M39914;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m42783() {
        AbstractC10370 abstractC10370M26173;
        C7067 c7067 = this.f57043;
        C9184 c9184 = c7067.f21747;
        if (this.f57041 != null) {
            return;
        }
        C3581 c3581 = this.f57038;
        boolean zM16070 = c3581.f17561.m16070();
        boolean zIsEmpty = m42778(EnumC21179.CAPTURED_THIS).isEmpty();
        AbstractC5698 abstractC5698 = this.f77787;
        long j = (abstractC5698.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) | 562949953425408L | (ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX & abstractC5698.f17561.f17563) | 2;
        c3581.f17563 = (zIsEmpty ? 8L : zM16070 ? 8796093022208L : 0L) | j;
        C18837 c18837 = new C18837();
        C18837 c18838 = new C18837();
        Iterator it = m42778(EnumC21179.CAPTURED_VAR).values().iterator();
        while (it.hasNext()) {
            C12048 c12048 = (C12048) ((AbstractC5698) it.next());
            c18837.m43511(c9184.f27818.m39923(c12048, (AbstractC12612) null));
            c18838.m43511(c12048);
        }
        Iterator it2 = m42778(EnumC21179.CAPTURED_OUTER_THIS).values().iterator();
        while (it2.hasNext()) {
            C12048 c12049 = (C12048) ((AbstractC5698) it2.next());
            c18837.m43511(c9184.f27818.m39923(c12049, (AbstractC12612) null));
            c18838.m43511(c12049);
        }
        Iterator it3 = m42778(EnumC21179.PARAM).values().iterator();
        while (it3.hasNext()) {
            C12048 c120410 = (C12048) ((AbstractC5698) it3.next());
            c18837.m43511(c9184.f27818.m39923(c120410, (AbstractC12612) null));
            c18838.m43511(c120410);
        }
        this.f57041 = c18837.m43517();
        c3581.f11367 = c18838.m43517();
        boolean zM52836 = m52836();
        AbstractC23195 abstractC23195 = this.f77786;
        if (!zM52836) {
            AbstractC10370 abstractC10370 = c9184.f27819.f18806;
            C6136 c6136 = c9184.f27819;
            StringBuilder sb = new StringBuilder();
            sb.append(m52835());
            sb.append("$");
            int i = c7067.f21746;
            c7067.f21746 = i + 1;
            sb.append(i);
            abstractC10370M26173 = abstractC10370.m26173(c6136.f18880.m30652(sb.toString()));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) c9184.f27819.f18806);
            sb2.append(m52835());
            sb2.append('$');
            StringBuilder sb3 = new StringBuilder();
            C12171.m29642((abstractC5698.f17560 == null && c7067.m19061() == null) ? false : true);
            AbstractC4308 abstractC4308 = abstractC5698.f17560;
            if (abstractC4308 != null) {
                sb3.append(c9184.m23587(abstractC4308, true));
                sb3.append(":");
            }
            sb3.append((CharSequence) c9184.f27821.m17493(((C14169) abstractC23195).f16086.f13890).f17561.mo16083());
            sb3.append(" ");
            AbstractC5698 abstractC5699 = this.f57045;
            if (abstractC5699 != null) {
                sb3.append((CharSequence) abstractC5699.mo16083());
                sb3.append("=");
            }
            for (AbstractC5698 abstractC56910 : m42778(EnumC21179.CAPTURED_VAR).keySet()) {
                if (abstractC56910 != this.f57042) {
                    sb3.append(c9184.m23587(abstractC56910.f17560, true));
                    sb3.append(" ");
                    sb3.append((CharSequence) abstractC56910.mo16083());
                    sb3.append(",");
                }
            }
            sb2.append(Integer.toHexString(sb3.toString().hashCode()));
            sb2.append('$');
            sb2.append(c7067.f21743.m35234(sb2));
            abstractC10370M26173 = c9184.f27819.f18880.m30652(sb2.toString());
        }
        c3581.f17562 = abstractC10370M26173;
        c3581.f17560 = c9184.f27821.m17487(c9184.f27821.m17519(((C14169) abstractC23195).m51449(c9184.f27821)), C7260.m19434(this.f57041));
    }
}
