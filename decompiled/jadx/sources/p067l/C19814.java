package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩳ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes5.dex */
public final class C19814 extends AbstractC25178 {

    /* JADX INFO: renamed from: ۖ */
    public C5771 f60258;

    /* JADX INFO: renamed from: ۘ */
    public EnumMap f60259;

    /* JADX INFO: renamed from: ۜ */
    public final HashSet f60260;

    /* JADX INFO: renamed from: ۡ */
    public C4848 f60261;

    /* JADX INFO: renamed from: ۢ */
    public final C13818 f60262;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ C9085 f60263;

    /* JADX INFO: renamed from: ᩷ */
    public AbstractC14355 f60264;

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC7783 f60265;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19814(C9085 c9085, C15834 c15834) {
        super(c9085, c15834);
        this.f60263 = c9085;
        C13463 c13463 = (C13463) c9085.f24625.f11034;
        int[] iArr = C6757.f17521;
        AbstractC7257 abstractC7257 = c13463.f37783;
        int i = iArr[abstractC7257.mo3383().ordinal()];
        if (i == 5) {
            C13818 c13818 = ((C11281) abstractC7257).f31438;
            this.f60262 = c13818;
            this.f60265 = c13818;
        } else if (i == 9) {
            this.f60262 = null;
            this.f60265 = C9268.m21438(((C22403) abstractC7257).f70670);
        } else {
            this.f60262 = null;
            this.f60265 = null;
        }
        AbstractC7783 abstractC7783 = this.f80539;
        if (abstractC7783.f20405 == EnumC3600.f7343) {
            this.f60258 = new C9439(this.f80539.m17990(), (C5771) abstractC7783.mo9256(abstractC7783.f20407));
        } else {
            this.f60258 = new C5771(4098L, null, null, abstractC7783.m17990());
        }
        EnumMap enumMap = new EnumMap(EnumC22497.class);
        this.f60259 = enumMap;
        enumMap.put(EnumC22497.PARAM, new LinkedHashMap());
        enumMap.put(EnumC22497.LOCAL_VAR, new LinkedHashMap());
        enumMap.put(EnumC22497.CAPTURED_VAR, new LinkedHashMap());
        enumMap.put(EnumC22497.CAPTURED_THIS, new LinkedHashMap());
        enumMap.put(EnumC22497.CAPTURED_OUTER_THIS, new LinkedHashMap());
        this.f60260 = new HashSet();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45053(AbstractC7783 abstractC7783, EnumC22497 enumC22497) {
        AbstractC7783 c4391;
        C15828 c15828M21022;
        C9085 c9085 = this.f60263;
        C11097 c11097 = c9085.f24628;
        if (enumC22497 == EnumC22497.CAPTURED_THIS && abstractC7783 != null && abstractC7783.f20405 == EnumC3600.f7354 && !c9085.f24622.isEmpty() && (c15828M21022 = c9085.m21022()) != null && c9085.f24622.contains(c15828M21022)) {
            C1446.m31704(abstractC7783 != c15828M21022);
            enumC22497 = EnumC22497.CAPTURED_OUTER_THIS;
        }
        Map mapM45050 = m45050(enumC22497);
        if (mapM45050.containsKey(abstractC7783)) {
            return;
        }
        int iOrdinal = enumC22497.ordinal();
        C5771 c5771 = this.f60258;
        if (iOrdinal == 0) {
            C13818 c13818 = new C13818((abstractC7783.mo18003() & 16) | 8589934592L, abstractC7783.f20408, c11097.f30760.m19459(abstractC7783.f20406), c5771);
            C13818 c13819 = (C13818) abstractC7783;
            c13818.f39051 = c13819.f39051;
            if (c13819.m31485()) {
                c13818.m31483(EnumC24473.EXCEPTION_PARAMETER);
            }
            c4391 = c13818;
        } else if (iOrdinal == 1) {
            C18472 c18472 = new C18472(abstractC7783.mo18003() & 16, abstractC7783.f20408, abstractC7783.f20406, c5771, abstractC7783);
            C13818 c138110 = (C13818) abstractC7783;
            c18472.f39051 = c138110.f39051;
            if (c138110.m31485()) {
                c18472.m31483(EnumC24473.EXCEPTION_PARAMETER);
            }
            c4391 = c18472;
        } else if (iOrdinal == 2) {
            c4391 = new C4391(abstractC7783.f20408, c11097.f30760.m19459(abstractC7783.f20406), c5771, abstractC7783);
        } else if (iOrdinal == 3) {
            c4391 = abstractC7783;
        } else if (iOrdinal == 4) {
            C8200 c8200 = c11097.f30758;
            String str = new String(abstractC7783.mo18002().toString().replace('.', '$') + ((Object) c11097.f30758.f21697));
            AbstractC14235 abstractC14235 = c8200.f21738;
            abstractC14235.getClass();
            char[] charArray = str.toCharArray();
            c4391 = new C13109(abstractC14235.mo17848(charArray, charArray.length), c11097.f30760.m19459(abstractC7783.f20406), c5771, abstractC7783);
        } else {
            C1446.m31702(enumC22497.name());
            throw null;
        }
        if (c4391 != abstractC7783 && enumC22497.m50458()) {
            c4391.m18005(abstractC7783.mo17987());
            c4391.m17993(abstractC7783.mo18000());
        }
        mapM45050.put(abstractC7783, c4391);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Map m45050(EnumC22497 enumC22497) {
        Map map = (Map) this.f60259.get(enumC22497);
        C1446.m31699(map);
        return map;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 m45052(final C9661 c9661) {
        C11097 c11097 = this.f60263.f24628;
        for (EnumC22497 enumC22497 : EnumC22497.values()) {
            Map mapM45050 = m45050(enumC22497);
            if (enumC22497.ordinal() != 4) {
                if (mapM45050.containsKey(c9661.f26611)) {
                    C9661 c9661M42157 = c11097.f30757.m42157((AbstractC7783) mapM45050.get(c9661.f26611));
                    c9661M42157.f18925 = c9661.f18925;
                    return c9661M42157;
                }
            } else {
                C18189 c18189Reduce = C7480.stream(mapM45050.keySet()).filter(new Predicate() { // from class: l.᩺ۨ֨
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C20697.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo55838negate() {
                        return C20697.$default$negate(this);
                    }

                    /* JADX INFO: renamed from: or */
                    public /* synthetic */ Predicate m53488or(Predicate predicate) {
                        return C20697.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C19814 c19814 = this.f76684;
                        c19814.getClass();
                        return c9661.f26611.m17986(((AbstractC7783) obj).f20406.f16705, c19814.f60263.f24628.f30760);
                    }
                }).reduce(new C15473());
                if (c18189Reduce.isPresent()) {
                    C9661 c9661M42158 = c11097.f30757.m42157((AbstractC7783) mapM45050.get(c18189Reduce.get()));
                    c9661M42158.f18925 = c9661.f26611.f20407.f20406;
                    C8320 c8320M42155 = c11097.f30757.m42155(c9661M42158, c9661.f26610);
                    c8320M42155.f18925 = c9661.f18925;
                    C9268.m21425(c9661.f26611, c8320M42155);
                    return c8320M42155;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9661 m45051(C8320 c8320) {
        AbstractC12224 abstractC12224 = c8320.f22259;
        C11097 c11097 = this.f60263.f24628;
        C1446.m31704(abstractC12224 == c11097.f30758.f21744);
        Map map = (Map) this.f60259.get(EnumC22497.CAPTURED_OUTER_THIS);
        if (!map.containsKey(c8320.f22260.f20407)) {
            return null;
        }
        C9661 c9661M42157 = c11097.f30757.m42157((AbstractC7783) map.get(c8320.f22260.f20407));
        c9661M42157.f18925 = c8320.f22260.f20407.f20406;
        return c9661M42157;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45054(C20530 c20530) {
        C1446.m31704(c20530.f63429.f18925.f16705.m18006() && c20530.f63432 == null);
        Map map = (Map) this.f60259.get(EnumC22497.CAPTURED_OUTER_THIS);
        AbstractC6462 abstractC6462Mo7201 = c20530.f63429.f18925.mo7201();
        if (map.containsKey(abstractC6462Mo7201.f16705)) {
            C9661 c9661M42157 = this.f60263.f24628.f30757.m42157((AbstractC7783) map.get(abstractC6462Mo7201.f16705));
            c9661M42157.f18925 = abstractC6462Mo7201;
            c20530.f63432 = c9661M42157;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m45055() {
        AbstractC12224 abstractC12224M28202;
        C9085 c9085 = this.f60263;
        C11097 c11097 = c9085.f24628;
        if (this.f60261 != null) {
            return;
        }
        C5771 c5771 = this.f60258;
        boolean zM17989 = c5771.f20407.m17989();
        boolean zIsEmpty = m45050(EnumC22497.CAPTURED_THIS).isEmpty();
        AbstractC7783 abstractC7783 = this.f80539;
        long j = (abstractC7783.f20409 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) | 562949953425408L | (ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX & abstractC7783.f20407.f20409) | 2;
        c5771.f20409 = (zIsEmpty ? 8L : zM17989 ? 8796093022208L : 0L) | j;
        C20271 c20271 = new C20271();
        C20271 c20272 = new C20271();
        Iterator it = m45050(EnumC22497.CAPTURED_VAR).values().iterator();
        while (it.hasNext()) {
            C13818 c13818 = (C13818) ((AbstractC7783) it.next());
            c20271.m45777(c11097.f30757.m42166(c13818, (AbstractC14355) null));
            c20272.m45777(c13818);
        }
        Iterator it2 = m45050(EnumC22497.CAPTURED_OUTER_THIS).values().iterator();
        while (it2.hasNext()) {
            C13818 c13819 = (C13818) ((AbstractC7783) it2.next());
            c20271.m45777(c11097.f30757.m42166(c13819, (AbstractC14355) null));
            c20272.m45777(c13819);
        }
        Iterator it3 = m45050(EnumC22497.PARAM).values().iterator();
        while (it3.hasNext()) {
            C13818 c138110 = (C13818) ((AbstractC7783) it3.next());
            c20271.m45777(c11097.f30757.m42166(c138110, (AbstractC14355) null));
            c20272.m45777(c138110);
        }
        this.f60261 = c20271.m45783();
        c5771.f14172 = c20272.m45783();
        boolean zM55242 = m55242();
        AbstractC24413 abstractC24413 = this.f80538;
        if (!zM55242) {
            AbstractC12224 abstractC12224 = c11097.f30758.f21664;
            C8200 c8200 = c11097.f30758;
            StringBuilder sb = new StringBuilder();
            sb.append(m55241());
            sb.append("$");
            int i = c9085.f24627;
            c9085.f24627 = i + 1;
            sb.append(i);
            abstractC12224M28202 = abstractC12224.m28202(c8200.f21738.m32717(sb.toString()));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) c11097.f30758.f21664);
            sb2.append(m55241());
            sb2.append('$');
            StringBuilder sb3 = new StringBuilder();
            C1446.m31704((abstractC7783.f20406 == null && c9085.m21019() == null) ? false : true);
            AbstractC6462 abstractC6462 = abstractC7783.f20406;
            if (abstractC6462 != null) {
                sb3.append(c11097.m25539(abstractC6462, true));
                sb3.append(":");
            }
            sb3.append((CharSequence) c11097.f30760.m19433(((C15834) abstractC24413).f18925.f16705).f20407.mo18002());
            sb3.append(" ");
            AbstractC7783 abstractC7784 = this.f60265;
            if (abstractC7784 != null) {
                sb3.append((CharSequence) abstractC7784.mo18002());
                sb3.append("=");
            }
            for (AbstractC7783 abstractC7785 : m45050(EnumC22497.CAPTURED_VAR).keySet()) {
                if (abstractC7785 != this.f60262) {
                    sb3.append(c11097.m25539(abstractC7785.f20406, true));
                    sb3.append(" ");
                    sb3.append((CharSequence) abstractC7785.mo18002());
                    sb3.append(",");
                }
            }
            sb2.append(Integer.toHexString(sb3.toString().hashCode()));
            sb2.append('$');
            sb2.append(c9085.f24624.m37389(sb2));
            abstractC12224M28202 = c11097.f30758.f21738.m32717(sb2.toString());
        }
        c5771.f20408 = abstractC12224M28202;
        c5771.f20406 = c11097.f30760.m19427(c11097.f30760.m19459(((C15834) abstractC24413).m53845(c11097.f30760)), C9268.m21400(this.f60261));
    }
}
