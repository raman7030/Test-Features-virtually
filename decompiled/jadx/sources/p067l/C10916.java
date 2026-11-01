package p067l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.ۡܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4CG */
/* JADX INFO: loaded from: classes3.dex */
public final class C10916 extends C20304 {

    /* JADX INFO: renamed from: ܽ */
    public final Method f30260;

    /* JADX INFO: renamed from: ᩳ */
    public final Method f30261;

    public C10916(Method method, Method method2) {
        this.f30261 = method;
        this.f30260 = method2;
    }

    @Override // p067l.C20304
    /* JADX INFO: renamed from: ֫ */
    public final void mo10362(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayListM45845 = C20304.m45845(list);
            this.f30261.invoke(sSLParameters, arrayListM45845.toArray(new String[arrayListM45845.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C21407.m48486("unable to set ssl parameters", (Exception) e);
        }
    }

    @Override // p067l.C20304
    /* JADX INFO: renamed from: ۧ */
    public final String mo10363(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f30260.invoke(sSLSocket, null);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException e) {
            throw C21407.m48486("failed to get ALPN selected protocol", (Exception) e);
        } catch (InvocationTargetException e2) {
            if (!(e2.getCause() instanceof UnsupportedOperationException)) {
                throw C21407.m48486("failed to get ALPN selected protocol", (Exception) e2);
            }
        }
    }
}
