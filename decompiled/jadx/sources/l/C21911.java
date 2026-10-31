package l;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.᩸᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A924 */
/* JADX INFO: loaded from: classes.dex */
public final class C21911 extends AbstractC12382 {
    @Override // l.AbstractC12382
    /* JADX INFO: renamed from: ֫ */
    public final C1093 mo19978(String str) {
        C9449 c9449 = new C9449();
        c9449.m24279(C20500.f66073);
        c9449.m24282(str);
        try {
            C18621 c18621Execute = C20500.f66074.m40469(c9449.m24274()).execute();
            AbstractC0275 abstractC0275M43170 = c18621Execute.m43170();
            String strSubstring = null;
            InputStream inputStreamM1611 = abstractC0275M43170 != null ? abstractC0275M43170.m1611() : null;
            if (inputStreamM1611 == null) {
                throw new IllegalStateException("Response does not contain body: ".concat(str));
            }
            String strM43169 = c18621Execute.m43169("Content-Type");
            if (strM43169 != null) {
                int iIndexOf = strM43169.indexOf(59);
                strSubstring = iIndexOf > -1 ? strM43169.substring(0, iIndexOf) : strM43169;
            }
            return AbstractC8149.m21620(inputStreamM1611, strSubstring);
        } catch (Throwable th) {
            throw new IllegalStateException("Exception obtaining network resource: ".concat(str), th);
        }
    }

    @Override // l.AbstractC12382
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo19977() {
        return Arrays.asList(a.s, b.a);
    }
}
