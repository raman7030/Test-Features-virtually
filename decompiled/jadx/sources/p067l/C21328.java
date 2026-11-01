package p067l;

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
public final class C21328 extends C23339 {

    /* JADX INFO: renamed from: i */
    public static final ConcurrentMapC12768 f67245i = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: e */
    public final EnumC21999 f67246e;

    /* JADX INFO: renamed from: f */
    public final boolean f67247f;

    /* JADX INFO: renamed from: g */
    public final Map f67248g;

    /* JADX INFO: renamed from: h */
    public final Map f67249h;

    public C21328(EnumC21999 enumC21999, boolean z) {
        super(AbstractC7877.f20683e, "ZoneText(" + enumC21999 + MotionUtils.EASING_TYPE_FORMAT_END);
        this.f67248g = new HashMap();
        this.f67249h = new HashMap();
        this.f67246e = (EnumC21999) C12826.requireNonNull(enumC21999, "textStyle");
        this.f67247f = z;
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
    @Override // p067l.C23339, p067l.InterfaceC15962
    /* JADX INFO: renamed from: l */
    public final boolean mo9636l(C11940 c11940, StringBuilder sb) {
        ?? M39919g;
        String[] strArr;
        AbstractC7739 abstractC7739 = (AbstractC7739) c11940.m27303b(AbstractC7877.f20679a);
        if (abstractC7739 == null) {
            return false;
        }
        String strMo17866k = abstractC7739.mo17866k();
        if (!(abstractC7739 instanceof C19550)) {
            InterfaceC4524 interfaceC4524 = c11940.f33253a;
            String str = null;
            Map concurrentMapC12768 = null;
            if (this.f67247f) {
                M39919g = 2;
            } else if (interfaceC4524.mo6951e(EnumC19947.INSTANT_SECONDS)) {
                M39919g = abstractC7739.mo17864W().m39919g(C6398.m14641W(interfaceC4524));
            } else {
                EnumC19947 enumC19947 = EnumC19947.EPOCH_DAY;
                if (interfaceC4524.mo6951e(enumC19947)) {
                    EnumC19947 enumC19948 = EnumC19947.NANO_OF_DAY;
                    if (interfaceC4524.mo6951e(enumC19948)) {
                        C24009 c24009M53182Y = C24009.m53182Y(C20480.m46188i0(interfaceC4524.mo6949G(enumC19947)), C9257.m21347a0(interfaceC4524.mo6949G(enumC19948)));
                        Object objM39917e = abstractC7739.mo17864W().m39917e(c24009M53182Y);
                        if ((objM39917e instanceof C8821 ? (C8821) objM39917e : null) == null) {
                            C17537 c17537Mo17864W = abstractC7739.mo17864W();
                            C3715 c3715M7142W = C3715.m7142W(c24009M53182Y, abstractC7739, null);
                            M39919g = c17537Mo17864W.m39919g(C6398.ofEpochSecond(c3715M7142W.mo7147U(), c3715M7142W.mo7151b().f25136d));
                        } else {
                            M39919g = 2;
                        }
                    } else {
                        M39919g = 2;
                    }
                } else {
                    M39919g = 2;
                }
            }
            Locale locale = c11940.f33254b.f22322b;
            EnumC21999 enumC21999 = EnumC21999.NARROW;
            EnumC21999 enumC219910 = this.f67246e;
            if (enumC219910 != enumC21999) {
                ConcurrentMapC12768 concurrentMapC12769 = f67245i;
                SoftReference softReference = (SoftReference) concurrentMapC12769.get(strMo17866k);
                if (softReference == null || (concurrentMapC12768 = (Map) softReference.get()) == null || (strArr = (String[]) concurrentMapC12768.get(locale)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(strMo17866k);
                    String[] strArr2 = {strMo17866k, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), strMo17866k, strMo17866k};
                    if (concurrentMapC12768 == null) {
                        concurrentMapC12768 = new ConcurrentMapC12768();
                    }
                    concurrentMapC12768.put(locale, strArr2);
                    concurrentMapC12769.put(strMo17866k, new SoftReference(concurrentMapC12768));
                    strArr = strArr2;
                }
                if (M39919g == 0) {
                    str = strArr[enumC219910.f69113a + 1];
                } else if (M39919g == 1) {
                    str = strArr[enumC219910.f69113a + 3];
                } else {
                    str = strArr[enumC219910.f69113a + 5];
                }
            }
            if (str != null) {
                strMo17866k = str;
            }
        }
        sb.append(strMo17866k);
        return true;
    }

    @Override // p067l.C23339
    /* JADX INFO: renamed from: a */
    public final C2551 mo48335a(C5234 c5234) {
        C2551 c2551;
        if (this.f67246e == EnumC21999.NARROW) {
            return super.mo48335a(c5234);
        }
        Locale locale = c5234.f12334a.f22322b;
        boolean z = c5234.f12335b;
        Set set = C6139.f15402d;
        int size = set.size();
        Map map = z ? this.f67248g : this.f67249h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (c2551 = (C2551) ((SoftReference) entry.getValue()).get()) != null) {
            return c2551;
        }
        C2551 c2552 = c5234.f12335b ? new C2551("", null, null) : new C20658("", null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                c2552.m3742a(str, str);
                HashMap map2 = (HashMap) AbstractC10599.f29349d;
                String str2 = (String) map2.get(str);
                if (str2 == null) {
                    HashMap map3 = (HashMap) AbstractC10599.f29352g;
                    if (map3.containsKey(str)) {
                        str = (String) map3.get(str);
                        str2 = (String) map2.get(str);
                    }
                }
                if (str2 != null) {
                    Map map4 = (Map) ((HashMap) AbstractC10599.f29351f).get(str2);
                    str = (map4 == null || !map4.containsKey(locale.getCountry())) ? (String) ((HashMap) AbstractC10599.f29350e).get(str2) : (String) map4.get(locale.getCountry());
                }
                HashMap map5 = (HashMap) AbstractC10599.f29352g;
                if (map5.containsKey(str)) {
                    str = (String) map5.get(str);
                }
                for (int i = this.f67246e == EnumC21999.FULL ? 1 : 2; i < strArr.length; i += 2) {
                    c2552.m3742a(strArr[i], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(c2552)));
        return c2552;
    }
}
