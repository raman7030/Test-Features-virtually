package l;

import com.google.android.material.motion.MotionUtils;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.᩶ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19949 extends C22065 {
    public static final ConcurrentMapC10942 i = new ConcurrentMapC10942();
    public final EnumC20655 e;
    public final boolean f;
    public final Map g;
    public final Map h;

    public C19949(EnumC20655 enumC20655, boolean z) {
        super(AbstractC5796.e, "ZoneText(" + enumC20655 + MotionUtils.EASING_TYPE_FORMAT_END);
        this.g = new HashMap();
        this.h = new HashMap();
        this.e = (EnumC20655) C11003.requireNonNull(enumC20655, "textStyle");
        this.f = z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.C22065, l.InterfaceC14303
    public final boolean l(C10071 c10071, StringBuilder sb) {
        ?? G;
        String[] strArr;
        AbstractC5650 abstractC5650 = (AbstractC5650) c10071.b(AbstractC5796.a);
        if (abstractC5650 == null) {
            return false;
        }
        String strK = abstractC5650.k();
        if (!(abstractC5650 instanceof C18078)) {
            InterfaceC2268 interfaceC2268 = c10071.a;
            String str = null;
            Map concurrentMapC10942 = null;
            if (this.f) {
                G = 2;
            } else if (interfaceC2268.e(EnumC18496.INSTANT_SECONDS)) {
                G = abstractC5650.W().g(C4239.W(interfaceC2268));
            } else {
                EnumC18496 enumC18496 = EnumC18496.EPOCH_DAY;
                if (interfaceC2268.e(enumC18496)) {
                    EnumC18496 enumC18497 = EnumC18496.NANO_OF_DAY;
                    if (interfaceC2268.e(enumC18497)) {
                        C22770 c22770Y = C22770.Y(C19056.i0(interfaceC2268.G(enumC18496)), C7248.a0(interfaceC2268.G(enumC18497)));
                        Object objE = abstractC5650.W().e(c22770Y);
                        if ((objE instanceof C6789 ? (C6789) objE : null) == null) {
                            C15960 c15960W = abstractC5650.W();
                            C1416 c1416W = C1416.W(c22770Y, abstractC5650, null);
                            G = c15960W.g(C4239.ofEpochSecond(c1416W.U(), c1416W.b().d));
                        } else {
                            G = 2;
                        }
                    } else {
                        G = 2;
                    }
                } else {
                    G = 2;
                }
            }
            Locale locale = c10071.b.b;
            EnumC20655 enumC20655 = EnumC20655.NARROW;
            EnumC20655 enumC20656 = this.e;
            if (enumC20656 != enumC20655) {
                ConcurrentMapC10942 concurrentMapC10943 = i;
                SoftReference softReference = (SoftReference) concurrentMapC10943.get(strK);
                if (softReference == null || (concurrentMapC10942 = (Map) softReference.get()) == null || (strArr = (String[]) concurrentMapC10942.get(locale)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(strK);
                    String[] strArr2 = {strK, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), strK, strK};
                    if (concurrentMapC10942 == null) {
                        concurrentMapC10942 = new ConcurrentMapC10942();
                    }
                    concurrentMapC10942.put(locale, strArr2);
                    concurrentMapC10943.put(strK, new SoftReference(concurrentMapC10942));
                    strArr = strArr2;
                }
                if (G == 0) {
                    str = strArr[enumC20656.a + 1];
                } else if (G == 1) {
                    str = strArr[enumC20656.a + 3];
                } else {
                    str = strArr[enumC20656.a + 5];
                }
            }
            if (str != null) {
                strK = str;
            }
        }
        sb.append(strK);
        return true;
    }

    @Override // l.C22065
    public final C0192 a(C3015 c3015) {
        C0192 c0192;
        if (this.e == EnumC20655.NARROW) {
            return super.a(c3015);
        }
        Locale locale = c3015.a.b;
        boolean z = c3015.b;
        Set set = C3967.d;
        int size = set.size();
        Map map = z ? this.g : this.h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (c0192 = (C0192) ((SoftReference) entry.getValue()).get()) != null) {
            return c0192;
        }
        C0192 c0193 = c3015.b ? new C0192("", null, null) : new C19244("", null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                c0193.a(str, str);
                HashMap map2 = (HashMap) AbstractC8660.d;
                String str2 = (String) map2.get(str);
                if (str2 == null) {
                    HashMap map3 = (HashMap) AbstractC8660.g;
                    if (map3.containsKey(str)) {
                        str = (String) map3.get(str);
                        str2 = (String) map2.get(str);
                    }
                }
                if (str2 != null) {
                    Map map4 = (Map) ((HashMap) AbstractC8660.f).get(str2);
                    str = (map4 == null || !map4.containsKey(locale.getCountry())) ? (String) ((HashMap) AbstractC8660.e).get(str2) : (String) map4.get(locale.getCountry());
                }
                HashMap map5 = (HashMap) AbstractC8660.g;
                if (map5.containsKey(str)) {
                    str = (String) map5.get(str);
                }
                for (int i2 = this.e == EnumC20655.FULL ? 1 : 2; i2 < strArr.length; i2 += 2) {
                    c0193.a(strArr[i2], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(c0193)));
        return c0193;
    }
}
