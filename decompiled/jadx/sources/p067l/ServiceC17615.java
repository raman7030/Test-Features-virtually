package p067l;

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
public class ServiceC17615 extends Service {

    /* JADX INFO: renamed from: ۟ */
    public static C21545 f52635;

    /* JADX INFO: renamed from: ۨ */
    public static final ExecutorService f52636 = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: ܰ */
    public static C21545 f52637;

    /* JADX INFO: renamed from: ᩺ */
    @SuppressLint({"HandlerLeak"})
    public static Handler f52638;

    /* JADX INFO: renamed from: ۗ */
    public Application f52639;

    /* JADX INFO: renamed from: ۛ */
    public boolean f52641;

    /* JADX INFO: renamed from: ۬ */
    public Throwable f52644;

    /* JADX INFO: renamed from: ᩶ */
    public C8053 f52645;

    /* JADX INFO: renamed from: ᩹ */
    public C13418 f52647;

    /* JADX INFO: renamed from: ۫ */
    public ConcurrentMapC12768 f52643 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ۙ */
    public Set f52640 = Collections.newSetFromMap(new ConcurrentMapC12768());

    /* JADX INFO: renamed from: ۤ */
    public int f52642 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractBinderC6217 f52646 = new BinderC8899(this);

    /* JADX INFO: renamed from: ֫ */
    public static Object m40114(ServiceC17615 serviceC17615, InterfaceC11582 interfaceC11582) {
        serviceC17615.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
        C13418 c13418 = serviceC17615.f52647;
        if (c13418 != null) {
            threadCurrentThread.setContextClassLoader(c13418);
        }
        try {
            return interfaceC11582.call();
        } finally {
            threadCurrentThread.setContextClassLoader(contextClassLoader);
        }
    }

    static {
        C21545 c21545 = new C21545();
        C21545 c21546 = new C21545();
        f52637 = c21545;
        f52635 = c21546;
        f52638 = new HandlerC22311(Looper.getMainLooper());
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f52646;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m40122(ServiceC17615 serviceC17615, boolean z) {
        String str = serviceC17615.f52645.getApplicationInfo().className;
        Application application = new Application();
        serviceC17615.f52639 = application;
        serviceC17615.f52645.m18719(application);
        try {
            Method declaredMethod = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(serviceC17615.f52639, serviceC17615.f52645);
        } catch (Throwable unused) {
        }
        serviceC17615.m40135();
        if (!z || Application.class.getName().equals(serviceC17615.f52645.getApplicationInfo().className)) {
            return;
        }
        try {
            String str2 = serviceC17615.f52645.getApplicationInfo().className;
            if (!TextUtils.isEmpty(serviceC17615.f52645.getApplicationInfo().className)) {
                serviceC17615.f52639 = (Application) serviceC17615.f52647.loadClass(serviceC17615.f52645.getApplicationInfo().className).newInstance();
            } else {
                serviceC17615.f52639 = (Application) Application.class.newInstance();
            }
            serviceC17615.f52645.m18719(serviceC17615.f52639);
            serviceC17615.m40135();
            Method declaredMethod2 = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(serviceC17615.f52639, serviceC17615.f52645);
            serviceC17615.f52639.onCreate();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m40135() {
        try {
            Object objInvoke = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null).invoke(null, null);
            ApplicationInfo applicationInfo = this.f52645.getApplicationInfo();
            Object objM40111 = m40111(objInvoke, applicationInfo, this.f52645.getDataDir(), this.f52645.m18720(), this.f52645.m18718());
            m40127("mInitialApplication", objInvoke, this.f52639);
            try {
                List list = (List) m40112(objInvoke, "mAllApplications");
                list.clear();
                list.add(this.f52639);
            } catch (Exception unused) {
            }
            try {
                Object objM40112 = m40112(objInvoke, "mBoundApplication");
                m40127("appInfo", objM40112, applicationInfo);
                m40127("processName", objM40112, this.f52645.getPackageName());
                m40132("info", objM40112, objM40111);
                List list2 = (List) m40112(objM40112, "providers");
                if (list2 != null) {
                    list2.clear();
                }
            } catch (Exception unused2) {
            }
            try {
                m40117("mPackages", objInvoke, objM40111);
                m40117("mResourcePackages", objInvoke, objM40111);
            } catch (Exception unused3) {
            }
            try {
                Map map = (Map) m40112(objInvoke, "mServices");
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
                ((Map) m40112(objInvoke, "mActivities")).clear();
            } catch (Exception unused5) {
            }
            Field declaredField = Application.class.getDeclaredField("mLoadedApk");
            declaredField.setAccessible(true);
            declaredField.set(this.f52639, objM40111);
        } catch (Exception unused6) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private Object m40111(Object obj, ApplicationInfo applicationInfo, File file, File file2, File file3) {
        try {
            Object objM40110 = m40110(obj, applicationInfo);
            if (objM40110 != null) {
                m40132("mActivityThread", objM40110, null);
                m40127("mPackageName", objM40110, this.f52645.getPackageName());
                m40127("mApplicationInfo", objM40110, applicationInfo);
                m40127("mAppDir", objM40110, this.f52645.getPackageResourcePath());
                m40127("mResDir", objM40110, this.f52645.getPackageResourcePath());
                m40127("mDataDir", objM40110, file.getPath());
                m40127("mLibDir", objM40110, applicationInfo.nativeLibraryDir);
                m40127("mDataDirFile", objM40110, file);
                m40127("mBaseClassLoader", objM40110, this.f52647);
                m40127("mResources", objM40110, this.f52645.getResources());
                m40127("mApplication", objM40110, this.f52639);
                m40127("mClassLoader", objM40110, this.f52647);
                m40132("mDefaultClassLoader", objM40110, this.f52647);
                m40132("mSecurityViolation", objM40110, Boolean.FALSE);
                m40132("mIncludeCode", objM40110, Boolean.TRUE);
                m40132("mDeviceProtectedDataDirFile", objM40110, file2);
                m40132("mCredentialProtectedDataDirFile", objM40110, file3);
                m40132("mDeviceProtectedDataDir", objM40110, file2.getPath());
                m40132("mCredentialProtectedDataDir", objM40110, file3.getPath());
                return objM40110;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    private Object m40110(Object obj, ApplicationInfo applicationInfo) {
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
                    C13418 c13418 = this.f52647;
                    Boolean bool = Boolean.FALSE;
                    return declaredConstructor.newInstance(obj3, applicationInfo2, obj2, c13418, bool, Boolean.TRUE, bool);
                } catch (Throwable unused2) {
                    for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                        Object[] objArrM40123 = m40123(constructor.getParameterTypes(), obj3, new ApplicationInfo(applicationInfo), obj2);
                        if (objArrM40123 != null) {
                            try {
                                constructor.setAccessible(true);
                                return constructor.newInstance(objArrM40123);
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

    /* JADX INFO: renamed from: ֫ */
    private void m40117(String str, Object obj, Object obj2) {
        try {
            Map map = (Map) m40112(obj, str);
            if (map == null) {
                return;
            }
            WeakReference weakReference = obj2 == null ? null : new WeakReference(obj2);
            String packageName = getPackageName();
            String packageName2 = this.f52645.getPackageName();
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

    /* JADX INFO: renamed from: ֫ */
    private Object[] m40123(Class[] clsArr, Object obj, ApplicationInfo applicationInfo, Object obj2) {
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
                objArr[i2] = this.f52647;
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
                objArr[i2] = this.f52645.getPackageName();
            } else {
                if (cls.isPrimitive()) {
                    return null;
                }
                objArr[i2] = null;
            }
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m40127(String str, Object obj, Object obj2) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m40132(String str, Object obj, Object obj2) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m40112(Object obj, String str) throws NoSuchFieldException {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40118(ServiceC17615 serviceC17615, int i) {
        serviceC17615.f52642 = i;
        if (i == 0) {
            C3395.m5937(i);
            return;
        }
        C3395.m5937(i);
        throw new IllegalStateException("Seccomp fatal: " + C3395.m5937(i));
    }

    /* JADX INFO: renamed from: ᩷ */
    public static void m40138(ServiceC17615 serviceC17615) {
        serviceC17615.f52642 = 1;
        C3395.m5937(1);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m40133(ServiceC17615 serviceC17615, boolean z) {
        serviceC17615.f52647 = null;
        serviceC17615.f52639 = null;
        serviceC17615.f52645 = null;
        serviceC17615.f52643 = new ConcurrentMapC12768();
        serviceC17615.f52640 = Collections.newSetFromMap(new ConcurrentMapC12768());
        serviceC17615.f52641 = false;
        if (z) {
            serviceC17615.f52642 = Integer.MIN_VALUE;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m40128(ServiceC17615 serviceC17615, boolean z) {
        Thread threadCurrentThread = Thread.currentThread();
        ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
        C13418 c13418 = serviceC17615.f52647;
        if (c13418 != null) {
            threadCurrentThread.setContextClassLoader(c13418);
        }
        try {
            m40122(serviceC17615, z);
        } finally {
            threadCurrentThread.setContextClassLoader(contextClassLoader);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m40113(InterfaceC11582 interfaceC11582) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return interfaceC11582.call();
        }
        return new C10911(interfaceC11582).m25173();
    }
}
