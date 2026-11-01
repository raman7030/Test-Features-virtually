package p067l;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes2.dex */
public final class C6289 implements Iterator {

    /* JADX INFO: renamed from: ۙ */
    public ClassLoader f15894;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC23133 f15895;

    /* JADX INFO: renamed from: ᩸ */
    public C23623 f15896;

    /* JADX INFO: renamed from: ᩹ */
    public Iterator f15897;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it = this.f15897;
        if (this.f15895 != null) {
            return true;
        }
        if (it.hasNext()) {
            String str = (String) it.next();
            C23623 c23623 = this.f15896;
            InterfaceC23133 interfaceC23133 = null;
            try {
                try {
                    try {
                        try {
                            Class<?> clsLoadClass = this.f15894.loadClass(str);
                            m14292(clsLoadClass);
                            interfaceC23133 = (InterfaceC23133) clsLoadClass.getConstructor(null).newInstance(null);
                        } catch (ClassCastException unused) {
                            C14040 c14040 = C8300.f21997;
                            c23623.m9355(new C14040("compiler", "proc.processor.wrong.type", str));
                        }
                    } catch (ClassNotFoundException unused2) {
                        C14040 c14041 = C8300.f21997;
                        c23623.m9355(new C14040("compiler", "proc.processor.not.found", str));
                    }
                } catch (Exception unused3) {
                    C14040 c14042 = C8300.f21997;
                    c23623.m9355(new C14040("compiler", "proc.processor.cant.instantiate", str));
                }
                if (interfaceC23133 != null) {
                    this.f15895 = interfaceC23133;
                    return true;
                }
            } catch (Throwable th) {
                throw new C12995(th);
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            InterfaceC23133 interfaceC23133 = this.f15895;
            this.f15895 = null;
            return interfaceC23133;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14292(Class cls) {
        try {
            Method method = Class.class.getMethod("getModule", null);
            Object objInvoke = method.invoke(C6289.class, null);
            Object objInvoke2 = method.invoke(cls, null);
            Class<?> returnType = method.getReturnType();
            returnType.getMethod("addReads", returnType).invoke(objInvoke, objInvoke2);
        } catch (NoSuchMethodException unused) {
        } catch (Exception e) {
            throw new C9854(e);
        }
    }
}
