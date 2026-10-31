package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: L541 */
/* JADX INFO: loaded from: classes5.dex */
public class C20885 extends C19474 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Method f67579;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Method f67580;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Class f67581;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean f67582;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Constructor f67583;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47717() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f67582) {
            return;
        }
        f67582 = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        f67583 = constructor;
        f67581 = cls;
        f67579 = method2;
        f67580 = method;
    }

    @Override // l.C19474
    /* JADX INFO: renamed from: ֫ */
    public Typeface mo8053(Context context, C9308 c9308, Resources resources, int i) throws NoSuchMethodException {
        m47717();
        try {
            Object objNewInstance = f67583.newInstance(null);
            for (C8602 c8602 : c9308.m23893()) {
                File fileM1946 = C0422.m1946(context);
                if (fileM1946 == null) {
                    return null;
                }
                try {
                    if (!C0422.m1949(fileM1946, resources, c8602.m22349())) {
                        return null;
                    }
                    if (!m47718(objNewInstance, fileM1946.getPath(), c8602.m22352(), c8602.m22350())) {
                        return null;
                    }
                    fileM1946.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileM1946.delete();
                }
            }
            m47717();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f67581, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f67580.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47718(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m47717();
        try {
            return ((Boolean) f67579.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.C19474
    /* JADX INFO: renamed from: ֫ */
    public Typeface mo8054(Context context, C17275[] c17275Arr, int i) {
        File file;
        if (c17275Arr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(mo8055(i, c17275Arr).m40565(), "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (ErrnoException unused) {
                        }
                        if (file != null && file.canRead()) {
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceCreateFromFile;
                        }
                        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        try {
                            Typeface typefaceMo8052 = mo8052(context, fileInputStream);
                            fileInputStream.close();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceMo8052;
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
