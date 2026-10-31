package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.ۡܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4CG */
/* JADX INFO: loaded from: classes3.dex */
public final class C8994 extends C18872 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Method f27326;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Method f27327;

    public C8994(Method method, Method method2) {
        this.f27327 = method;
        this.f27326 = method2;
    }

    @Override // l.C18872
    /* JADX INFO: renamed from: ֫ */
    public final void mo8318(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayListM43579 = C18872.m43579(list);
            this.f27327.invoke(sSLParameters, arrayListM43579.toArray(new String[arrayListM43579.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C20032.m46170("unable to set ssl parameters", (Exception) e);
        }
    }

    @Override // l.C18872
    /* JADX INFO: renamed from: ۧ */
    public final String mo8319(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f27326.invoke(sSLSocket, null);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException e) {
            throw C20032.m46170("failed to get ALPN selected protocol", (Exception) e);
        } catch (InvocationTargetException e2) {
            if (!(e2.getCause() instanceof UnsupportedOperationException)) {
                throw C20032.m46170("failed to get ALPN selected protocol", (Exception) e2);
            }
        }
    }
}
