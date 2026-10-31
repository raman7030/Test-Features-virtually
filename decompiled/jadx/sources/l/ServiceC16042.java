package l;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.ܺܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1X4 */
/* JADX INFO: loaded from: classes4.dex */
public class ServiceC16042 extends Service {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static C20177 f49471;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f49472 = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C20177 f49473;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    @SuppressLint({"HandlerLeak"})
    public static Handler f49474;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Application f49475;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f49477;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Throwable f49480;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C5981 f49481;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C11626 f49483;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ConcurrentMapC10942 f49479 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Set f49476 = Collections.newSetFromMap(new ConcurrentMapC10942());

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f49478 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractBinderC4049 f49482 = new BinderC6871(this);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m37927(ServiceC16042 serviceC16042, InterfaceC9694 interfaceC9694) {
        serviceC16042.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
        C11626 c11626 = serviceC16042.f49483;
        if (c11626 != null) {
            threadCurrentThread.setContextClassLoader(c11626);
        }
        try {
            return interfaceC9694.call();
        } finally {
            threadCurrentThread.setContextClassLoader(contextClassLoader);
        }
    }

    static {
        C20177 c20177 = new C20177();
        C20177 c20178 = new C20177();
        f49473 = c20177;
        f49471 = c20178;
        f49474 = new HandlerC20983(Looper.getMainLooper());
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f49482;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37935(ServiceC16042 serviceC16042, boolean z) {
        String str = serviceC16042.f49481.getApplicationInfo().className;
        Application application = new Application();
        serviceC16042.f49475 = application;
        serviceC16042.f49481.m16793(application);
        try {
            Method declaredMethod = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(serviceC16042.f49475, serviceC16042.f49481);
        } catch (Throwable unused) {
        }
        serviceC16042.m37948();
        if (!z || Application.class.getName().equals(serviceC16042.f49481.getApplicationInfo().className)) {
            return;
        }
        try {
            String str2 = serviceC16042.f49481.getApplicationInfo().className;
            if (!TextUtils.isEmpty(serviceC16042.f49481.getApplicationInfo().className)) {
                serviceC16042.f49475 = (Application) serviceC16042.f49483.loadClass(serviceC16042.f49481.getApplicationInfo().className).newInstance();
            } else {
                serviceC16042.f49475 = (Application) Application.class.newInstance();
            }
            serviceC16042.f49481.m16793(serviceC16042.f49475);
            serviceC16042.m37948();
            Method declaredMethod2 = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(serviceC16042.f49475, serviceC16042.f49481);
            serviceC16042.f49475.onCreate();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m37948() {
        try {
            Object objInvoke = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null).invoke(null, null);
            ApplicationInfo applicationInfo = this.f49481.getApplicationInfo();
            Object objM37924 = m37924(objInvoke, applicationInfo, this.f49481.getDataDir(), this.f49481.m16794(), this.f49481.m16792());
            m37940("mInitialApplication", objInvoke, this.f49475);
            try {
                List list = (List) m37925(objInvoke, "mAllApplications");
                list.clear();
                list.add(this.f49475);
            } catch (Exception unused) {
            }
            try {
                Object objM37925 = m37925(objInvoke, "mBoundApplication");
                m37940("appInfo", objM37925, applicationInfo);
                m37940("processName", objM37925, this.f49481.getPackageName());
                m37945("info", objM37925, objM37924);
                List list2 = (List) m37925(objM37925, "providers");
                if (list2 != null) {
                    list2.clear();
                }
            } catch (Exception unused2) {
            }
            try {
                m37930("mPackages", objInvoke, objM37924);
                m37930("mResourcePackages", objInvoke, objM37924);
            } catch (Exception unused3) {
            }
            try {
                Map map = (Map) m37925(objInvoke, "mServices");
                if (map != null && !map.isEmpty()) {
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if ((next instanceof Map.Entry) && ((Map.Entry) next).getValue() == this) {
                            it.remove();
                        }
                    }
                }
            } catch (Exception unused4) {
            }
            try {
                ((Map) m37925(objInvoke, "mActivities")).clear();
            } catch (Exception unused5) {
            }
            Field declaredField = Application.class.getDeclaredField("mLoadedApk");
            declaredField.setAccessible(true);
            declaredField.set(this.f49475, objM37924);
        } catch (Exception unused6) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m37924(Object obj, ApplicationInfo applicationInfo, File file, File file2, File file3) {
        try {
            Object objM37923 = m37923(obj, applicationInfo);
            if (objM37923 != null) {
                m37945("mActivityThread", objM37923, null);
                m37940("mPackageName", objM37923, this.f49481.getPackageName());
                m37940("mApplicationInfo", objM37923, applicationInfo);
                m37940("mAppDir", objM37923, this.f49481.getPackageResourcePath());
                m37940("mResDir", objM37923, this.f49481.getPackageResourcePath());
                m37940("mDataDir", objM37923, file.getPath());
                m37940("mLibDir", objM37923, applicationInfo.nativeLibraryDir);
                m37940("mDataDirFile", objM37923, file);
                m37940("mBaseClassLoader", objM37923, this.f49483);
                m37940("mResources", objM37923, this.f49481.getResources());
                m37940("mApplication", objM37923, this.f49475);
                m37940("mClassLoader", objM37923, this.f49483);
                m37945("mDefaultClassLoader", objM37923, this.f49483);
                m37945("mSecurityViolation", objM37923, Boolean.FALSE);
                m37945("mIncludeCode", objM37923, Boolean.TRUE);
                m37945("mDeviceProtectedDataDirFile", objM37923, file2);
                m37945("mCredentialProtectedDataDirFile", objM37923, file3);
                m37945("mDeviceProtectedDataDir", objM37923, file2.getPath());
                m37945("mCredentialProtectedDataDir", objM37923, file3.getPath());
                return objM37923;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m37923(Object obj, ApplicationInfo applicationInfo) {
        Object obj2;
        Object obj3 = obj;
        try {
            Class<?> cls = Class.forName("android.app.LoadedApk");
            Class<?> cls2 = Class.forName("android.app.ActivityThread");
            Class<?> cls3 = Class.forName("android.content.res.CompatibilityInfo");
            try {
                Field field = cls3.getField("DEFAULT_COMPATIBILITY_INFO");
                field.setAccessible(true);
                obj2 = field.get(null);
            } catch (Throwable unused) {
                obj2 = null;
            }
            try {
                try {
                    Class<?> cls4 = Boolean.TYPE;
                    Constructor<?> declaredConstructor = cls.getDeclaredConstructor(cls2, ApplicationInfo.class, cls3, ClassLoader.class, cls4, cls4, cls4);
                    declaredConstructor.setAccessible(true);
                    ApplicationInfo applicationInfo2 = new ApplicationInfo(applicationInfo);
                    C11626 c11626 = this.f49483;
                    Boolean bool = Boolean.FALSE;
                    return declaredConstructor.newInstance(obj3, applicationInfo2, obj2, c11626, bool, Boolean.TRUE, bool);
                } catch (Throwable unused2) {
                    for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                        Object[] objArrM37936 = m37936(constructor.getParameterTypes(), obj3, new ApplicationInfo(applicationInfo), obj2);
                        if (objArrM37936 != null) {
                            try {
                                constructor.setAccessible(true);
                                return constructor.newInstance(objArrM37936);
                            } catch (Throwable unused3) {
                                continue;
                            }
                        }
                    }
                    return null;
                }
            } catch (Throwable unused4) {
                Constructor<?> declaredConstructor2 = cls.getDeclaredConstructor(cls2);
                declaredConstructor2.setAccessible(true);
                return declaredConstructor2.newInstance(obj3);
            }
        } catch (Throwable unused5) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37930(String str, Object obj, Object obj2) {
        try {
            Map map = (Map) m37925(obj, str);
            if (map == null) {
                return;
            }
            WeakReference weakReference = obj2 == null ? null : new WeakReference(obj2);
            String packageName = getPackageName();
            String packageName2 = this.f49481.getPackageName();
            if (weakReference == null) {
                map.remove(packageName);
                map.remove(packageName2);
            } else {
                map.put(packageName, weakReference);
                map.put(packageName2, weakReference);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object[] m37936(Class[] clsArr, Object obj, ApplicationInfo applicationInfo, Object obj2) {
        Object[] objArr = new Object[clsArr.length];
        int i = 0;
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            Class cls = clsArr[i2];
            String name = cls.getName();
            if ("android.app.ActivityThread".equals(name)) {
                objArr[i2] = obj;
            } else if (cls == ApplicationInfo.class) {
                objArr[i2] = new ApplicationInfo(applicationInfo);
            } else if ("android.content.res.CompatibilityInfo".equals(name)) {
                objArr[i2] = obj2;
            } else if (cls == ClassLoader.class) {
                objArr[i2] = this.f49483;
            } else if (cls == Boolean.TYPE) {
                int i3 = i + 1;
                objArr[i2] = Boolean.valueOf(i == 1);
                i = i3;
            } else if (cls == Integer.TYPE) {
                objArr[i2] = 0;
            } else if (cls == Long.TYPE) {
                objArr[i2] = 0L;
            } else if (cls == Float.TYPE) {
                objArr[i2] = Float.valueOf(0.0f);
            } else if (cls == Double.TYPE) {
                objArr[i2] = Double.valueOf(0.0d);
            } else if (cls == Byte.TYPE) {
                objArr[i2] = (byte) 0;
            } else if (cls == Short.TYPE) {
                objArr[i2] = (short) 0;
            } else if (cls == Character.TYPE) {
                objArr[i2] = (char) 0;
            } else if (cls == String.class) {
                objArr[i2] = this.f49481.getPackageName();
            } else {
                if (cls.isPrimitive()) {
                    return null;
                }
                objArr[i2] = null;
            }
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37940(String str, Object obj, Object obj2) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m37945(String str, Object obj, Object obj2) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m37925(Object obj, String str) throws NoSuchFieldException {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37931(ServiceC16042 serviceC16042, int i) {
        serviceC16042.f49478 = i;
        if (i == 0) {
            C1080.m3666(i);
            return;
        }
        C1080.m3666(i);
        throw new IllegalStateException("Seccomp fatal: " + C1080.m3666(i));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m37951(ServiceC16042 serviceC16042) {
        serviceC16042.f49478 = 1;
        C1080.m3666(1);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m37946(ServiceC16042 serviceC16042, boolean z) {
        serviceC16042.f49483 = null;
        serviceC16042.f49475 = null;
        serviceC16042.f49481 = null;
        serviceC16042.f49479 = new ConcurrentMapC10942();
        serviceC16042.f49476 = Collections.newSetFromMap(new ConcurrentMapC10942());
        serviceC16042.f49477 = false;
        if (z) {
            serviceC16042.f49478 = Integer.MIN_VALUE;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37941(ServiceC16042 serviceC16042, boolean z) {
        Thread threadCurrentThread = Thread.currentThread();
        ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
        C11626 c11626 = serviceC16042.f49483;
        if (c11626 != null) {
            threadCurrentThread.setContextClassLoader(c11626);
        }
        try {
            m37935(serviceC16042, z);
        } finally {
            threadCurrentThread.setContextClassLoader(contextClassLoader);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m37926(InterfaceC9694 interfaceC9694) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return interfaceC9694.call();
        }
        return new C8988(interfaceC9694).m23229();
    }
}
