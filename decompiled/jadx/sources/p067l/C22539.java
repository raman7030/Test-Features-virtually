package p067l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.᩸֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61X7 */
/* JADX INFO: loaded from: classes4.dex */
public class C22539 implements Cloneable {

    /* JADX INFO: renamed from: ֫֫ */
    public static Class[] f71080;

    /* JADX INFO: renamed from: ۟ */
    public static Class[] f71081;

    /* JADX INFO: renamed from: ܰ */
    public static Class[] f71083;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final HashMap f71084;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final HashMap f71085;

    /* JADX INFO: renamed from: ᩺ */
    public static final /* synthetic */ int f71087 = 0;

    /* JADX INFO: renamed from: ۗ */
    public AbstractC9127 f71088;

    /* JADX INFO: renamed from: ۙ */
    public C3762 f71089;

    /* JADX INFO: renamed from: ۛ */
    public final Object[] f71090;

    /* JADX INFO: renamed from: ۤ */
    public Method f71091;

    /* JADX INFO: renamed from: ۨ */
    public Class f71092;

    /* JADX INFO: renamed from: ۫ */
    public String f71093;

    /* JADX INFO: renamed from: ۬ */
    public final ReentrantReadWriteLock f71094;

    /* JADX INFO: renamed from: ᩶ */
    public Method f71095;

    /* JADX INFO: renamed from: ᩸ */
    public Float f71096;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC23209 f71097;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final C11755 f71086 = new C11755();

    /* JADX INFO: renamed from: ۧ֫ */
    public static final C8597 f71082 = new C8597();

    static {
        Class cls = Float.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Integer.TYPE;
        f71081 = new Class[]{cls, Float.class, cls2, cls3, Double.class, Integer.class};
        f71080 = new Class[]{cls3, Integer.class, cls, cls2, Float.class, Double.class};
        f71083 = new Class[]{cls2, Double.class, cls, cls3, Float.class, Integer.class};
        f71085 = new HashMap();
        f71084 = new HashMap();
    }

    public C22539(String str) {
        this.f71091 = null;
        this.f71095 = null;
        this.f71089 = null;
        this.f71094 = new ReentrantReadWriteLock();
        this.f71090 = new Object[1];
        this.f71093 = str;
    }

    public C22539(AbstractC9127 abstractC9127) {
        this.f71091 = null;
        this.f71095 = null;
        this.f71089 = null;
        this.f71094 = new ReentrantReadWriteLock();
        this.f71090 = new Object[1];
        this.f71088 = abstractC9127;
        if (abstractC9127 != null) {
            this.f71093 = abstractC9127.m21072();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo37460(float... fArr) {
        this.f71092 = Float.TYPE;
        int length = fArr.length;
        C12480[] c12480Arr = new C12480[Math.max(length, 2)];
        if (length != 1) {
            c12480Arr[0] = new C12480(0.0f, fArr[0]);
            for (int i = 1; i < length; i++) {
                c12480Arr[i] = new C12480(i / (length - 1), fArr[i]);
            }
        } else {
            C12480 c12480 = new C12480();
            c12480.f53240 = 0.0f;
            c12480Arr[0] = c12480;
            c12480Arr[1] = new C12480(1.0f, fArr[0]);
        }
        this.f71089 = new C3762(c12480Arr);
    }

    /* JADX INFO: renamed from: ֫ */
    private Method m50510(Class cls, Class cls2, String str) {
        Class<?>[] clsArr;
        String str2 = this.f71093;
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
        if (this.f71092.equals(Float.class)) {
            clsArr = f71081;
        } else if (this.f71092.equals(Integer.class)) {
            clsArr = f71080;
        } else {
            clsArr = this.f71092.equals(Double.class) ? f71083 : new Class[]{this.f71092};
        }
        for (Class<?> cls3 : clsArr) {
            Class<?>[] clsArr2 = {cls3};
            try {
                try {
                    Method method = cls.getMethod(str, clsArr2);
                    this.f71092 = cls3;
                    return method;
                } catch (NoSuchMethodException unused2) {
                }
            } catch (NoSuchMethodException unused3) {
                declaredMethod = cls.getDeclaredMethod(str, clsArr2);
                declaredMethod.setAccessible(true);
                this.f71092 = cls3;
                return declaredMethod;
            }
        }
        C12826.toString(this.f71092);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ֫ */
    private Method m50511(Class cls, HashMap map, String str, Class cls2) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f71094;
        try {
            reentrantReadWriteLock.writeLock().lock();
            HashMap map2 = (HashMap) map.get(cls);
            Method methodM50510 = map2 != null ? (Method) map2.get(this.f71093) : null;
            if (methodM50510 == null) {
                methodM50510 = m50510(cls, cls2, str);
                if (map2 == null) {
                    map2 = new HashMap();
                    map.put(cls, map2);
                }
                map2.put(this.f71093, methodM50510);
            }
            return methodM50510;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo37458(Class cls) {
        this.f71091 = m50511(cls, f71085, "set", this.f71092);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50513(Object obj) {
        AbstractC9127 abstractC9127 = this.f71088;
        if (abstractC9127 != null) {
            try {
                abstractC9127.mo3368(obj);
                for (AbstractC17843 abstractC17843 : this.f71089.f57348) {
                    if (!abstractC17843.f53241) {
                        abstractC17843.mo28737(this.f71088.mo3368(obj));
                    }
                }
                return;
            } catch (ClassCastException unused) {
                this.f71088.getClass();
                C12826.toString(obj);
                this.f71088 = null;
            }
        }
        Class<?> cls = obj.getClass();
        if (this.f71091 == null) {
            mo37458((Class) cls);
        }
        for (AbstractC17843 abstractC17844 : this.f71089.f57348) {
            if (!abstractC17844.f53241) {
                if (this.f71095 == null) {
                    this.f71095 = m50511(cls, f71084, "get", null);
                }
                try {
                    abstractC17844.mo28737(this.f71095.invoke(obj, null));
                } catch (IllegalAccessException e) {
                    e.toString();
                } catch (InvocationTargetException e2) {
                    e2.toString();
                }
            }
        }
    }

    @Override // 
    public C22539 clone() {
        try {
            C22539 c22539 = (C22539) super.clone();
            c22539.f71093 = this.f71093;
            c22539.f71088 = this.f71088;
            c22539.f71089 = this.f71089.clone();
            c22539.f71097 = this.f71097;
            return c22539;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo37459(Object obj) {
        Object[] objArr = this.f71090;
        AbstractC9127 abstractC9127 = this.f71088;
        if (abstractC9127 != null) {
            abstractC9127.mo21073(obj, mo37456());
        }
        if (this.f71091 != null) {
            try {
                objArr[0] = mo37456();
                this.f71091.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                e.toString();
            } catch (InvocationTargetException e2) {
                e2.toString();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m50514() {
        InterfaceC23209 interfaceC23209;
        if (this.f71097 == null) {
            Class cls = this.f71092;
            if (cls == Integer.class) {
                interfaceC23209 = f71086;
            } else {
                interfaceC23209 = cls == Float.class ? f71082 : null;
            }
            this.f71097 = interfaceC23209;
        }
        InterfaceC23209 interfaceC232010 = this.f71097;
        if (interfaceC232010 != null) {
            this.f71089.f57346 = interfaceC232010;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50512(C24968 c24968) {
        this.f71097 = c24968;
        this.f71089.f57346 = c24968;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo37457(float f) {
        this.f71096 = Float.valueOf(this.f71089.m7262(f));
    }

    /* JADX INFO: renamed from: ֫ */
    public Float mo37456() {
        return this.f71096;
    }

    public final String toString() {
        return this.f71093 + ": " + this.f71089.toString();
    }
}
