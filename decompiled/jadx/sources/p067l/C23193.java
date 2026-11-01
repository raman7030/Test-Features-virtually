package p067l;

import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.᩸᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A924 */
/* JADX INFO: loaded from: classes.dex */
public final class C23193 extends AbstractC14136 {
    @Override // p067l.AbstractC14136
    /* JADX INFO: renamed from: ֫ */
    public final C3407 mo21953(String str) {
        C11349 c11349 = new C11349();
        c11349.m26289(C21852.f68752);
        c11349.m26292(str);
        try {
            C20066 c20066Execute = C21852.f68753.m42716(c11349.m26284()).execute();
            AbstractC2630 abstractC2630M45436 = c20066Execute.m45436();
            String strSubstring = null;
            InputStream inputStreamM4011 = abstractC2630M45436 != null ? abstractC2630M45436.m4011() : null;
            if (inputStreamM4011 == null) {
                throw new IllegalStateException("Response does not contain body: ".concat(str));
            }
            String strM45435 = c20066Execute.m45435("Content-Type");
            if (strM45435 != null) {
                int iIndexOf = strM45435.indexOf(59);
                strSubstring = iIndexOf > -1 ? strM45435.substring(0, iIndexOf) : strM45435;
            }
            return AbstractC10113.m23588(inputStreamM4011, strSubstring);
        } catch (Throwable th) {
            throw new IllegalStateException("Exception obtaining network resource: ".concat(str), th);
        }
    }

    @Override // p067l.AbstractC14136
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo21952() {
        return Arrays.asList(C0170a.f680s, C0171b.f688a);
    }
}
