package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.ۖܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J4EF */
/* JADX INFO: loaded from: classes2.dex */
public final class C2644 extends C18872 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Method f8341;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Class f8342;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Method f8343;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Method f8344;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Class f8345;

    public C2644(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f8343 = method;
        this.f8344 = method2;
        this.f8341 = method3;
        this.f8342 = cls;
        this.f8345 = cls2;
    }

    @Override // l.C18872
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8318(SSLSocket sSLSocket, String str, List list) {
        try {
            this.f8343.invoke(null, sSLSocket, Proxy.newProxyInstance(C18872.class.getClassLoader(), new Class[]{this.f8342, this.f8345}, new C16048(C18872.m43579(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C20032.m46170("unable to set alpn", (Exception) e);
        }
    }

    @Override // l.C18872
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8317(SSLSocket sSLSocket) {
        try {
            this.f8341.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C20032.m46170("unable to remove alpn", (Exception) e);
        }
    }

    @Override // l.C18872
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String mo8319(SSLSocket sSLSocket) {
        try {
            C16048 c16048 = (C16048) Proxy.getInvocationHandler(this.f8344.invoke(null, sSLSocket));
            boolean z = c16048.f49499;
            if (!z && c16048.f49501 == null) {
                C18872.m43580().mo43582(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            }
            if (z) {
                return null;
            }
            return c16048.f49501;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C20032.m46170("unable to get selected protocol", (Exception) e);
        }
    }
}
