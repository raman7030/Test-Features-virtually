package p067l;

import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.᩻ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes.dex */
public final enum C24612 extends EnumC2483 {
    public /* synthetic */ C24612(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("PATCH_MODULE", 17, "--patch-module", "opt.arg.patch", "opt.patch", enumC19919, enumC5837);
    }

    public C24612(String str, int i, String str2, String str3, String str4, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, str4, enumC19919, enumC5837, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3580(AbstractC3154 abstractC3154, String str, String str2) throws C4496 {
        if (str2.isEmpty()) {
            throw abstractC3154.m5388(C8300.m19119(str));
        }
        if (mo3587().matcher(str2).matches()) {
            String strMo5387 = abstractC3154.mo5387(EnumC2483.f3963);
            if (strMo5387 == null) {
                super.mo3580(abstractC3154, str, str2);
                return;
            }
            String strSubstring = str2.substring(0, str2.indexOf(61));
            if (((Set) C23573.stream(strMo5387.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)).map(new C15894()).collect(C24205.toSet())).contains(strSubstring)) {
                C14040 c14040 = C8300.f21997;
                throw abstractC3154.m5388(new C14040("compiler", "repeated.value.for.patch.module", strSubstring));
            }
            super.mo3580(abstractC3154, str, strMo5387 + (char) 0 + str2);
            return;
        }
        throw abstractC3154.m5388(C8300.m19120(str, str2));
    }

    /* JADX INFO: renamed from: ܿ */
    public static /* synthetic */ String m54249(String str) {
        return str.substring(0, str.indexOf(61));
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ܿ */
    public Pattern mo3587() {
        return Pattern.compile("([^/]+)=(,*[^,].*)");
    }
}
