package l;

import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.᩻ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes.dex */
public final enum C23405 extends EnumC0121 {
    public /* synthetic */ C23405(EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this("PATCH_MODULE", 17, "--patch-module", "opt.arg.patch", "opt.patch", enumC18467, enumC3650);
    }

    public C23405(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        super(str, i, str2, str3, str4, enumC18467, enumC3650, 0);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1179(AbstractC0827 abstractC0827, String str, String str2) throws C2239 {
        if (str2.isEmpty()) {
            throw abstractC0827.m3074(C6241.m17181(str));
        }
        if (mo1186().matcher(str2).matches()) {
            String strMo3073 = abstractC0827.mo3073(EnumC0121.f1187);
            if (strMo3073 == null) {
                super.mo1179(abstractC0827, str, str2);
                return;
            }
            String strSubstring = str2.substring(0, str2.indexOf(61));
            if (((Set) C22311.stream(strMo3073.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)).map(new C14232()).collect(C22976.toSet())).contains(strSubstring)) {
                C12281 c12281 = C6241.f19132;
                throw abstractC0827.m3074(new C12281("compiler", "repeated.value.for.patch.module", strSubstring));
            }
            super.mo1179(abstractC0827, str, strMo3073 + (char) 0 + str2);
            return;
        }
        throw abstractC0827.m3074(C6241.m17182(str, str2));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m51851(String str) {
        return str.substring(0, str.indexOf(61));
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ܿ */
    public Pattern mo1186() {
        return Pattern.compile("([^/]+)=(,*[^,].*)");
    }
}
