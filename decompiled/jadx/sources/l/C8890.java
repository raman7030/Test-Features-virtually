package l;

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

/* JADX INFO: renamed from: l.ۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 14P2 */
/* JADX INFO: loaded from: classes4.dex */
public class C8890 extends C20885 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Method f27049;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Constructor f27050;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Class f27051;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Method f27052;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Method f27053;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Method f27054;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Method f27055;

    public C8890() throws NoSuchMethodException {
        Method methodMo22965;
        Constructor<?> constructor;
        Method methodM22962;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM22962 = m22962((Class) cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo22965 = mo22965((Class) cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            methodMo22965 = null;
            constructor = null;
            methodM22962 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f27051 = cls;
        this.f27050 = constructor;
        this.f27055 = methodM22962;
        this.f27049 = method;
        this.f27053 = method2;
        this.f27052 = method3;
        this.f27054 = methodMo22965;
    }

    @Override // l.C19474
    /* JADX INFO: renamed from: ֫ */
    public final Typeface mo8051(Context context, Resources resources, int i, String str, int i2) {
        Object objNewInstance;
        if (this.f27055 != null) {
            try {
                objNewInstance = this.f27050.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!m22961(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.f27052.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (m22963(objNewInstance)) {
                    return mo22964(objNewInstance);
                }
            }
            return null;
        }
        return super.mo8051(context, resources, i, str, i2);
    }

    @Override // l.C20885, l.C19474
    /* JADX INFO: renamed from: ֫ */
    public final Typeface mo8053(Context context, C9308 c9308, Resources resources, int i) {
        Object objNewInstance;
        if (this.f27055 != null) {
            try {
                objNewInstance = this.f27050.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                for (C8602 c8602 : c9308.m23893()) {
                    if (!m22961(context, objNewInstance, c8602.m22348(), c8602.m22351(), c8602.m22352(), c8602.m22350() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c8602.m22353()))) {
                        try {
                            this.f27052.invoke(objNewInstance, null);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                }
                if (m22963(objNewInstance)) {
                    return mo22964(objNewInstance);
                }
            }
            return null;
        }
        return super.mo8053(context, c9308, resources, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m22961(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f27055.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Typeface mo22964(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f27051, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f27054.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m22963(Object obj) {
        try {
            return ((Boolean) this.f27053.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.C20885, l.C19474
    /* JADX INFO: renamed from: ֫ */
    public final Typeface mo8054(Context context, C17275[] c17275Arr, int i) {
        Object objNewInstance;
        Typeface typefaceMo22964;
        boolean zBooleanValue;
        Object[] objArr = null;
        if (c17275Arr.length >= 1) {
            if (this.f27055 != null) {
                HashMap map = new HashMap();
                for (C17275 c17275 : c17275Arr) {
                    if (c17275.m40563() == 0) {
                        Uri uriM40565 = c17275.m40565();
                        if (!map.containsKey(uriM40565)) {
                            map.put(uriM40565, C0422.m1947(context, uriM40565));
                        }
                    }
                }
                Map mapUnmodifiableMap = C20195.unmodifiableMap(map);
                try {
                    objNewInstance = this.f27050.newInstance(null);
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                    objNewInstance = null;
                }
                if (objNewInstance != null) {
                    int length = c17275Arr.length;
                    int i2 = 0;
                    boolean z = false;
                    while (true) {
                        Method method = this.f27052;
                        if (i2 < length) {
                            C17275 c17276 = c17275Arr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c17276.m40565());
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.f27049.invoke(objNewInstance, byteBuffer, Integer.valueOf(c17276.m40564()), null, Integer.valueOf(c17276.m40567()), Integer.valueOf(c17276.m40566() ? 1 : 0))).booleanValue();
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
                        } else if (m22963(objNewInstance) && (typefaceMo22964 = mo22964(objNewInstance)) != null) {
                            return Typeface.create(typefaceMo22964, i);
                        }
                    }
                }
            } else {
                C17275 c17275Mo8055 = mo8055(i, c17275Arr);
                try {
                    try {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c17275Mo8055.m40565(), "r", null);
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            try {
                                Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c17275Mo8055.m40567()).setItalic(c17275Mo8055.m40566()).build();
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Method m22962(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Method mo22965(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
