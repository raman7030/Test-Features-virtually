package p067l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ۬ */
/* JADX INFO: compiled from: E55J */
/* JADX INFO: loaded from: classes3.dex */
public final class C1318 extends C1808 {

    /* JADX INFO: renamed from: ֫ */
    public static final Method f32071;

    /* JADX INFO: renamed from: ۧ */
    public static final Method f32072;

    /* JADX INFO: renamed from: ܽ */
    public static final Class f32073;

    /* JADX INFO: renamed from: ᩳ */
    public static final Constructor f32074;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        f32074 = constructor;
        f32073 = cls;
        f32071 = method2;
        f32072 = method;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m26544() {
        return f32071 != null;
    }

    @Override // p067l.C1808
    /* JADX INFO: renamed from: ֫ */
    public final Typeface mo10084(Context context, C1304 c1304, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f32074.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (C1269 c1269 : c1304.m25902()) {
                int iM24318 = c1269.m24318();
                File fileM4335 = C0863.m4335(context);
                if (fileM4335 == null) {
                    map = null;
                } else {
                    try {
                        if (C0863.m4338(fileM4335, resources, iM24318)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileM4335);
                                try {
                                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C13853.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                                    map = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, fileChannelConvertMaybeLegacyFileChannelFromLibrary.size());
                                    fileInputStream.close();
                                    fileM4335.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileM4335.delete();
                            map = null;
                        }
                    } catch (Throwable th3) {
                        fileM4335.delete();
                        throw th3;
                    }
                }
                if (map != null && m26545(objNewInstance, map, c1269.m24320(), c1269.m24321(), c1269.m24319())) {
                }
            }
            return m26543(objNewInstance);
        }
        return null;
    }

    @Override // p067l.C1808
    /* JADX INFO: renamed from: ֫ */
    public final Typeface mo10085(Context context, C1699[] c1699Arr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = f32074.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            C1012 c1012 = new C1012();
            for (C1699 c1699 : c1699Arr) {
                Uri uriM42814 = c1699.m42814();
                ByteBuffer byteBufferM4336 = (ByteBuffer) c1012.getOrDefault(uriM42814, null);
                if (byteBufferM4336 == null) {
                    byteBufferM4336 = C0863.m4336(context, uriM42814);
                    c1012.put(uriM42814, byteBufferM4336);
                }
                if (byteBufferM4336 != null && m26545(objNewInstance, byteBufferM4336, c1699.m42813(), c1699.m42816(), c1699.m42815())) {
                }
            }
            Typeface typefaceM26543 = m26543(objNewInstance);
            if (typefaceM26543 != null) {
                return Typeface.create(typefaceM26543, i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m26545(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f32071.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Typeface m26543(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f32073, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f32072.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
