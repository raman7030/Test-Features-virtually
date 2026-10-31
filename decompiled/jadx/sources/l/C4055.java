package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.ۘܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N4E9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4055 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f12879;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Class[] f12880;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Class f12881;

    public C4055(Class cls, String str, Class... clsArr) {
        this.f12881 = cls;
        this.f12879 = str;
        this.f12880 = clsArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12177(SSLSocket sSLSocket) {
        return m12174(sSLSocket.getClass()) != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12176(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method methodM12174 = m12174(sSLSocket.getClass());
            if (methodM12174 == null) {
                return;
            }
            try {
                methodM12174.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m12175(Object obj, Object... objArr) {
        Method methodM12174 = m12174(obj.getClass());
        if (methodM12174 == null) {
            throw new AssertionError("Method " + this.f12879 + " not supported for object " + obj);
        }
        try {
            return methodM12174.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodM12174);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Method m12174(Class cls) {
        Method method;
        Class cls2;
        try {
            method = cls.getMethod(this.f12879, this.f12880);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    method = null;
                }
            } catch (NoSuchMethodException unused) {
            }
        } catch (NoSuchMethodException unused2) {
        }
        if (method == null || (cls2 = this.f12881) == null || cls2.isAssignableFrom(method.getReturnType())) {
            return method;
        }
        return null;
    }
}
