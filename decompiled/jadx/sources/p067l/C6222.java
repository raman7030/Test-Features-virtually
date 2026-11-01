package p067l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.ۘܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N4E9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6222 {

    /* JADX INFO: renamed from: ֫ */
    public final String f15693;

    /* JADX INFO: renamed from: ۧ */
    public final Class[] f15694;

    /* JADX INFO: renamed from: ܽ */
    public final Class f15695;

    public C6222(Class cls, String str, Class... clsArr) {
        this.f15695 = cls;
        this.f15693 = str;
        this.f15694 = clsArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m14098(SSLSocket sSLSocket) {
        return m14095(sSLSocket.getClass()) != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14097(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method methodM14095 = m14095(sSLSocket.getClass());
            if (methodM14095 == null) {
                return;
            }
            try {
                methodM14095.invoke(sSLSocket, objArr);
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

    /* JADX INFO: renamed from: ֫ */
    public final Object m14096(Object obj, Object... objArr) {
        Method methodM14095 = m14095(obj.getClass());
        if (methodM14095 == null) {
            throw new AssertionError("Method " + this.f15693 + " not supported for object " + obj);
        }
        try {
            return methodM14095.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodM14095);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private Method m14095(Class cls) {
        Method method;
        Class cls2;
        try {
            method = cls.getMethod(this.f15693, this.f15694);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    method = null;
                }
            } catch (NoSuchMethodException unused) {
            }
        } catch (NoSuchMethodException unused2) {
        }
        if (method == null || (cls2 = this.f15695) == null || cls2.isAssignableFrom(method.getReturnType())) {
            return method;
        }
        return null;
    }
}
