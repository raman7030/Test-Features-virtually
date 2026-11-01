package p067l;

import com.alipay.sdk.p010m.p041p.C0187d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: l.ܳܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16279 extends AbstractC3539 {

    /* JADX INFO: renamed from: ֫ */
    public final Method f47860;

    /* JADX INFO: renamed from: ۧ */
    public final Object f47861;

    public final int hashCode() {
        return 0;
    }

    public C16279(Object obj, Method method) {
        this.f47861 = obj;
        this.f47860 = method;
    }

    @Override // p067l.AbstractC3539
    /* JADX INFO: renamed from: ֫ */
    public final List mo4611(String str, List list) throws SSLPeerUnverifiedException {
        try {
            return (List) this.f47860.invoke(this.f47861, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), C0187d.f883a, str);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof C16279;
    }
}
