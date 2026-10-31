package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.᩸֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61X7 */
/* JADX INFO: loaded from: classes4.dex */
public class C21224 implements Cloneable {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static Class[] f68397;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static Class[] f68398;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Class[] f68400;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f68401;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f68402;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f68404 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC7112 f68405;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1467 f68406;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Object[] f68407;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Method f68408;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Class f68409;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f68410;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f68411;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Method f68412;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Float f68413;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC21929 f68414;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final C9876 f68403 = new C9876();

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final C6554 f68399 = new C6554();

    static {
        Class cls = Float.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Integer.TYPE;
        f68398 = new Class[]{cls, Float.class, cls2, cls3, Double.class, Integer.class};
        f68397 = new Class[]{cls3, Integer.class, cls, cls2, Float.class, Double.class};
        f68400 = new Class[]{cls2, Double.class, cls, cls3, Float.class, Integer.class};
        f68402 = new HashMap();
        f68401 = new HashMap();
    }

    public C21224(String str) {
        this.f68408 = null;
        this.f68412 = null;
        this.f68406 = null;
        this.f68411 = new ReentrantReadWriteLock();
        this.f68407 = new Object[1];
        this.f68410 = str;
    }

    public C21224(AbstractC7112 abstractC7112) {
        this.f68408 = null;
        this.f68412 = null;
        this.f68406 = null;
        this.f68411 = new ReentrantReadWriteLock();
        this.f68407 = new Object[1];
        this.f68405 = abstractC7112;
        if (abstractC7112 != null) {
            this.f68410 = abstractC7112.m19129();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo35307(float... fArr) {
        this.f68409 = Float.TYPE;
        int length = fArr.length;
        C10640[] c10640Arr = new C10640[Math.max(length, 2)];
        if (length != 1) {
            c10640Arr[0] = new C10640(0.0f, fArr[0]);
            for (int i = 1; i < length; i++) {
                c10640Arr[i] = new C10640(i / (length - 1), fArr[i]);
            }
        } else {
            C10640 c10640 = new C10640();
            c10640.f50073 = 0.0f;
            c10640Arr[0] = c10640;
            c10640Arr[1] = new C10640(1.0f, fArr[0]);
        }
        this.f68406 = new C1467(c10640Arr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Method m48179(Class cls, Class cls2, String str) {
        Class<?>[] clsArr;
        String str2 = this.f68410;
        if (str2 != null && str2.length() != 0) {
            str = str + Character.toUpperCase(str2.charAt(0)) + str2.substring(1);
        }
        Method declaredMethod = null;
        if (cls2 == null) {
            try {
                return cls.getMethod(str, null);
            } catch (NoSuchMethodException e) {
                try {
                    declaredMethod = cls.getDeclaredMethod(str, null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (NoSuchMethodException unused) {
                    e.toString();
                    return declaredMethod;
                }
            }
        }
        if (this.f68409.equals(Float.class)) {
            clsArr = f68398;
        } else if (this.f68409.equals(Integer.class)) {
            clsArr = f68397;
        } else {
            clsArr = this.f68409.equals(Double.class) ? f68400 : new Class[]{this.f68409};
        }
        for (Class<?> cls3 : clsArr) {
            Class<?>[] clsArr2 = {cls3};
            try {
                try {
                    Method method = cls.getMethod(str, clsArr2);
                    this.f68409 = cls3;
                    return method;
                } catch (NoSuchMethodException unused2) {
                }
            } catch (NoSuchMethodException unused3) {
                declaredMethod = cls.getDeclaredMethod(str, clsArr2);
                declaredMethod.setAccessible(true);
                this.f68409 = cls3;
                return declaredMethod;
            }
        }
        C11003.toString(this.f68409);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Method m48180(Class cls, HashMap map, String str, Class cls2) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f68411;
        try {
            reentrantReadWriteLock.writeLock().lock();
            HashMap map2 = (HashMap) map.get(cls);
            Method methodM48179 = map2 != null ? (Method) map2.get(this.f68410) : null;
            if (methodM48179 == null) {
                methodM48179 = m48179(cls, cls2, str);
                if (map2 == null) {
                    map2 = new HashMap();
                    map.put(cls, map2);
                }
                map2.put(this.f68410, methodM48179);
            }
            return methodM48179;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo35305(Class cls) {
        this.f68408 = m48180(cls, f68402, "set", this.f68409);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48182(Object obj) {
        AbstractC7112 abstractC7112 = this.f68405;
        if (abstractC7112 != null) {
            try {
                abstractC7112.mo973(obj);
                for (AbstractC16283 abstractC16283 : this.f68406.f54156) {
                    if (!abstractC16283.f50074) {
                        abstractC16283.mo26697(this.f68405.mo973(obj));
                    }
                }
                return;
            } catch (ClassCastException unused) {
                this.f68405.getClass();
                C11003.toString(obj);
                this.f68405 = null;
            }
        }
        Class<?> cls = obj.getClass();
        if (this.f68408 == null) {
            mo35305((Class) cls);
        }
        for (AbstractC16283 abstractC16284 : this.f68406.f54156) {
            if (!abstractC16284.f50074) {
                if (this.f68412 == null) {
                    this.f68412 = m48180(cls, f68401, "get", null);
                }
                try {
                    abstractC16284.mo26697(this.f68412.invoke(obj, null));
                } catch (IllegalAccessException e) {
                    e.toString();
                } catch (InvocationTargetException e2) {
                    e2.toString();
                }
            }
        }
    }

    @Override // 
    public C21224 clone() {
        try {
            C21224 c21224 = (C21224) super.clone();
            c21224.f68410 = this.f68410;
            c21224.f68405 = this.f68405;
            c21224.f68406 = this.f68406.clone();
            c21224.f68414 = this.f68414;
            return c21224;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo35306(Object obj) {
        Object[] objArr = this.f68407;
        AbstractC7112 abstractC7112 = this.f68405;
        if (abstractC7112 != null) {
            abstractC7112.mo19130(obj, mo35303());
        }
        if (this.f68408 != null) {
            try {
                objArr[0] = mo35303();
                this.f68408.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                e.toString();
            } catch (InvocationTargetException e2) {
                e2.toString();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m48183() {
        InterfaceC21929 interfaceC21929;
        if (this.f68414 == null) {
            Class cls = this.f68409;
            if (cls == Integer.class) {
                interfaceC21929 = f68403;
            } else {
                interfaceC21929 = cls == Float.class ? f68399 : null;
            }
            this.f68414 = interfaceC21929;
        }
        InterfaceC21929 interfaceC219210 = this.f68414;
        if (interfaceC219210 != null) {
            this.f68406.f54154 = interfaceC219210;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48181(C23779 c23779) {
        this.f68414 = c23779;
        this.f68406.f54154 = c23779;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo35304(float f) {
        this.f68413 = Float.valueOf(this.f68406.m5019(f));
    }

    /* JADX INFO: renamed from: ֫ */
    public Float mo35303() {
        return this.f68413;
    }

    public final String toString() {
        return this.f68410 + ": " + this.f68406.toString();
    }
}
