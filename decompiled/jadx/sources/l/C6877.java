package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۜܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6877 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Method f21250;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Method f21251;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Method f21252;

    public C6877(Method method, Method method2, Method method3) {
        this.f21250 = method;
        this.f21251 = method2;
        this.f21252 = method3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m18618() {
        Method method = this.f21250;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                this.f21251.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18619(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            this.f21252.invoke(obj, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
