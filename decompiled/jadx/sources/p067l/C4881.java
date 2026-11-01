package p067l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.ۖܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J4EF */
/* JADX INFO: loaded from: classes2.dex */
public final class C4881 extends C20304 {

    /* JADX INFO: renamed from: ܳ */
    public final Method f11135;

    /* JADX INFO: renamed from: ܽ */
    public final Class f11136;

    /* JADX INFO: renamed from: ܿ */
    public final Method f11137;

    /* JADX INFO: renamed from: ᩳ */
    public final Method f11138;

    /* JADX INFO: renamed from: ᩻ */
    public final Class f11139;

    public C4881(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f11137 = method;
        this.f11138 = method2;
        this.f11135 = method3;
        this.f11136 = cls;
        this.f11139 = cls2;
    }

    @Override // p067l.C20304
    /* JADX INFO: renamed from: ֫ */
    public final void mo10362(SSLSocket sSLSocket, String str, List list) {
        try {
            this.f11137.invoke(null, sSLSocket, Proxy.newProxyInstance(C20304.class.getClassLoader(), new Class[]{this.f11136, this.f11139}, new C17620(C20304.m45845(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C21407.m48486("unable to set alpn", (Exception) e);
        }
    }

    @Override // p067l.C20304
    /* JADX INFO: renamed from: ֫ */
    public final void mo10361(SSLSocket sSLSocket) {
        try {
            this.f11135.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C21407.m48486("unable to remove alpn", (Exception) e);
        }
    }

    @Override // p067l.C20304
    /* JADX INFO: renamed from: ۧ */
    public final String mo10363(SSLSocket sSLSocket) {
        try {
            C17620 c17620 = (C17620) Proxy.getInvocationHandler(this.f11138.invoke(null, sSLSocket));
            boolean z = c17620.f52662;
            if (!z && c17620.f52664 == null) {
                C20304.m45846().mo45848(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            }
            if (z) {
                return null;
            }
            return c17620.f52664;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C21407.m48486("unable to get selected protocol", (Exception) e);
        }
    }
}
