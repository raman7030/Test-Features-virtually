package l;

import java.util.function.Predicate;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ܿۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C17055 extends EnumC0121 {
    public /* synthetic */ C17055(EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this("MODULE_SOURCE_PATH", 13, "--module-source-path", "opt.arg.mspath", "opt.modulesourcepath", enumC18467, enumC3650);
    }

    public C17055(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        super(str, i, str2, str3, str4, enumC18467, enumC3650, 0);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1179(AbstractC0827 abstractC0827, String str, String str2) throws C2239 {
        if (str2.isEmpty()) {
            throw abstractC0827.m3074(C6241.m17181(str));
        }
        final Pattern patternMo1186 = mo1186();
        String strMo3073 = abstractC0827.mo3073(EnumC0121.f1173);
        if (strMo3073 == null) {
            super.mo1179(abstractC0827, str, str2);
            return;
        }
        if (patternMo1186.matcher(str2).matches()) {
            final String strSubstring = str2.substring(0, str2.indexOf(61));
            if (C22311.stream(strMo3073.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)).filter(new Predicate() { // from class: l.֫ۖ۠
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
                    return C17055.m40026(patternMo1186, (String) obj);
                }
            }).map(new C10706()).anyMatch(new Predicate() { // from class: l.ܽۖ۠
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
                    return C17055.m40024(strSubstring, (String) obj);
                }
            })) {
                C12281 c12281 = C6241.f19132;
                throw abstractC0827.m3074(new C12281("compiler", "repeated.value.for.module.source.path", strSubstring));
            }
            super.mo1179(abstractC0827, str, strMo3073 + (char) 0 + str2);
            return;
        }
        if (C22311.stream(strMo3073.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)).anyMatch(new Predicate() { // from class: l.ᩳۖ۠
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
                return C17055.m40029(patternMo1186, (String) obj);
            }
        })) {
            throw abstractC0827.m3074(C6241.f19232);
        }
        super.mo1179(abstractC0827, str, strMo3073 + (char) 0 + str2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m40026(Pattern pattern, String str) {
        return pattern.matcher(str).matches();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m40027(String str) {
        return str.substring(0, str.indexOf(61));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m40024(String str, String str2) {
        return str2.equals(str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m40029(Pattern pattern, String str) {
        return !pattern.matcher(str).matches();
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ܿ */
    public Pattern mo1186() {
        return Pattern.compile("([\\p{Alnum}$_.]+)=(.*)");
    }
}
