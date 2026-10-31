package l;

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

/* JADX INFO: renamed from: l.ۢ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: E55J */
/* JADX INFO: loaded from: classes3.dex */
public final class C9596 extends C19474 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Method f29124;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Method f29125;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Class f29126;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Constructor f29127;

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
        f29127 = constructor;
        f29126 = cls;
        f29124 = method2;
        f29125 = method;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24532() {
        return f29124 != null;
    }

    @Override // l.C19474
    /* JADX INFO: renamed from: ֫ */
    public final Typeface mo8053(Context context, C9308 c9308, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f29127.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (C8602 c8602 : c9308.m23893()) {
                int iM22349 = c8602.m22349();
                File fileM1946 = C0422.m1946(context);
                if (fileM1946 == null) {
                    map = null;
                } else {
                    try {
                        if (C0422.m1949(fileM1946, resources, iM22349)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileM1946);
                                try {
                                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C12084.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                                    map = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, fileChannelConvertMaybeLegacyFileChannelFromLibrary.size());
                                    fileInputStream.close();
                                    fileM1946.delete();
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
                            fileM1946.delete();
                            map = null;
                        }
                    } catch (Throwable th3) {
                        fileM1946.delete();
                        throw th3;
                    }
                }
                if (map != null && m24533(objNewInstance, map, c8602.m22351(), c8602.m22352(), c8602.m22350())) {
                }
            }
            return m24531(objNewInstance);
        }
        return null;
    }

    @Override // l.C19474
    /* JADX INFO: renamed from: ֫ */
    public final Typeface mo8054(Context context, C17275[] c17275Arr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = f29127.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            C3432 c3432 = new C3432();
            for (C17275 c17275 : c17275Arr) {
                Uri uriM40565 = c17275.m40565();
                ByteBuffer byteBufferM1947 = (ByteBuffer) c3432.getOrDefault(uriM40565, null);
                if (byteBufferM1947 == null) {
                    byteBufferM1947 = C0422.m1947(context, uriM40565);
                    c3432.put(uriM40565, byteBufferM1947);
                }
                if (byteBufferM1947 != null && m24533(objNewInstance, byteBufferM1947, c17275.m40564(), c17275.m40567(), c17275.m40566())) {
                }
            }
            Typeface typefaceM24531 = m24531(objNewInstance);
            if (typefaceM24531 != null) {
                return Typeface.create(typefaceM24531, i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24533(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f29124.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Typeface m24531(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f29126, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f29125.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
