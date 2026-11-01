package p067l;

import java.util.function.Predicate;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ܿۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C18577 extends EnumC2483 {
    public /* synthetic */ C18577(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("MODULE_SOURCE_PATH", 13, "--module-source-path", "opt.arg.mspath", "opt.modulesourcepath", enumC19919, enumC5837);
    }

    public C18577(String str, int i, String str2, String str3, String str4, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, str4, enumC19919, enumC5837, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3580(AbstractC3154 abstractC3154, String str, String str2) throws C4496 {
        if (str2.isEmpty()) {
            throw abstractC3154.m5388(C8300.m19119(str));
        }
        final Pattern patternMo3587 = mo3587();
        String strMo5387 = abstractC3154.mo5387(EnumC2483.f3949);
        if (strMo5387 == null) {
            super.mo3580(abstractC3154, str, str2);
            return;
        }
        if (patternMo3587.matcher(str2).matches()) {
            final String strSubstring = str2.substring(0, str2.indexOf(61));
            if (C23573.stream(strMo5387.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)).filter(new Predicate() { // from class: l.֫ۖ۠
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
                public /* synthetic */ Predicate m7471or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C18577.m42271(patternMo3587, (String) obj);
                }
            }).map(new C12543()).anyMatch(new Predicate() { // from class: l.ܽۖ۠
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
                public /* synthetic */ Predicate m40712or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C18577.m42269(strSubstring, (String) obj);
                }
            })) {
                C14040 c14040 = C8300.f21997;
                throw abstractC3154.m5388(new C14040("compiler", "repeated.value.for.module.source.path", strSubstring));
            }
            super.mo3580(abstractC3154, str, strMo5387 + (char) 0 + str2);
            return;
        }
        if (C23573.stream(strMo5387.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)).anyMatch(new Predicate() { // from class: l.ᩳۖ۠
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
            public /* synthetic */ Predicate m43859or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C18577.m42274(patternMo3587, (String) obj);
            }
        })) {
            throw abstractC3154.m5388(C8300.f22097);
        }
        super.mo3580(abstractC3154, str, strMo5387 + (char) 0 + str2);
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ boolean m42271(Pattern pattern, String str) {
        return pattern.matcher(str).matches();
    }

    /* JADX INFO: renamed from: ܿ */
    public static /* synthetic */ String m42272(String str) {
        return str.substring(0, str.indexOf(61));
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ boolean m42269(String str, String str2) {
        return str2.equals(str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static /* synthetic */ boolean m42274(Pattern pattern, String str) {
        return !pattern.matcher(str).matches();
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ܿ */
    public Pattern mo3587() {
        return Pattern.compile("([\\p{Alnum}$_.]+)=(.*)");
    }
}
