package p067l;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡ۬ */
/* JADX INFO: compiled from: 14P2 */
/* JADX INFO: loaded from: classes4.dex */
public class C1283 extends C1878 {

    /* JADX INFO: renamed from: ۜ */
    public final Method f29973;

    /* JADX INFO: renamed from: ۡ */
    public final Constructor f29974;

    /* JADX INFO: renamed from: ۢ */
    public final Class f29975;

    /* JADX INFO: renamed from: ܳ */
    public final Method f29976;

    /* JADX INFO: renamed from: ܺ */
    public final Method f29977;

    /* JADX INFO: renamed from: ᩷ */
    public final Method f29978;

    /* JADX INFO: renamed from: ᩻ */
    public final Method f29979;

    public C1283() throws NoSuchMethodException {
        Method methodMo24936;
        Constructor<?> constructor;
        Method methodM24933;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM24933 = m24933((Class) cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo24936 = mo24936((Class) cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            methodMo24936 = null;
            constructor = null;
            methodM24933 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f29975 = cls;
        this.f29974 = constructor;
        this.f29979 = methodM24933;
        this.f29973 = method;
        this.f29977 = method2;
        this.f29976 = method3;
        this.f29978 = methodMo24936;
    }

    @Override // p067l.C1808
    /* JADX INFO: renamed from: ֫ */
    public final Typeface mo10082(Context context, Resources resources, int i, String str, int i2) {
        Object objNewInstance;
        if (this.f29979 != null) {
            try {
                objNewInstance = this.f29974.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!m24932(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.f29976.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (m24934(objNewInstance)) {
                    return mo24935(objNewInstance);
                }
            }
            return null;
        }
        return super.mo10082(context, resources, i, str, i2);
    }

    @Override // p067l.C1878, p067l.C1808
    /* JADX INFO: renamed from: ֫ */
    public final Typeface mo10084(Context context, C1304 c1304, Resources resources, int i) {
        Object objNewInstance;
        if (this.f29979 != null) {
            try {
                objNewInstance = this.f29974.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                for (C1269 c1269 : c1304.m25902()) {
                    if (!m24932(context, objNewInstance, c1269.m24317(), c1269.m24320(), c1269.m24321(), c1269.m24319() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c1269.m24322()))) {
                        try {
                            this.f29976.invoke(objNewInstance, null);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                }
                if (m24934(objNewInstance)) {
                    return mo24935(objNewInstance);
                }
            }
            return null;
        }
        return super.mo10084(context, c1304, resources, i);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m24932(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f29979.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public Typeface mo24935(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f29975, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f29978.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m24934(Object obj) {
        try {
            return ((Boolean) this.f29977.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.C1878, p067l.C1808
    /* JADX INFO: renamed from: ֫ */
    public final Typeface mo10085(Context context, C1699[] c1699Arr, int i) {
        Object objNewInstance;
        Typeface typefaceMo24935;
        boolean zBooleanValue;
        Object[] objArr = null;
        if (c1699Arr.length >= 1) {
            if (this.f29979 != null) {
                HashMap map = new HashMap();
                for (C1699 c1699 : c1699Arr) {
                    if (c1699.m42812() == 0) {
                        Uri uriM42814 = c1699.m42814();
                        if (!map.containsKey(uriM42814)) {
                            map.put(uriM42814, C0863.m4336(context, uriM42814));
                        }
                    }
                }
                Map mapUnmodifiableMap = C21562.unmodifiableMap(map);
                try {
                    objNewInstance = this.f29974.newInstance(null);
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                    objNewInstance = null;
                }
                if (objNewInstance != null) {
                    int length = c1699Arr.length;
                    int i2 = 0;
                    boolean z = false;
                    while (true) {
                        Method method = this.f29976;
                        if (i2 < length) {
                            C1699 c16910 = c1699Arr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c16910.m42814());
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.f29973.invoke(objNewInstance, byteBuffer, Integer.valueOf(c16910.m42813()), null, Integer.valueOf(c16910.m42816()), Integer.valueOf(c16910.m42815() ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    objArr = null;
                                    method.invoke(objNewInstance, null);
                                    break;
                                }
                                objArr = null;
                                z = true;
                            }
                            try {
                                i2++;
                            } catch (IllegalAccessException | InvocationTargetException unused3) {
                            }
                        } else if (!z) {
                            method.invoke(objNewInstance, objArr);
                        } else if (m24934(objNewInstance) && (typefaceMo24935 = mo24935(objNewInstance)) != null) {
                            return Typeface.create(typefaceMo24935, i);
                        }
                    }
                }
            } else {
                C1699 c1699Mo10086 = mo10086(i, c1699Arr);
                try {
                    try {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c1699Mo10086.m42814(), "r", null);
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            try {
                                Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c1699Mo10086.m42816()).setItalic(c1699Mo10086.m42815()).build();
                                parcelFileDescriptorOpenFileDescriptor.close();
                                return typefaceBuild;
                            } catch (Throwable th) {
                                try {
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return null;
                        }
                    } catch (IOException unused4) {
                    }
                    return null;
                } catch (IOException unused5) {
                }
            }
            return null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public static Method m24933(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: ֫ */
    public Method mo24936(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
