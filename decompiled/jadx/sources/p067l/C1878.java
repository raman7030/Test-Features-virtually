package p067l;

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

/* JADX INFO: renamed from: l.᩷۬ */
/* JADX INFO: compiled from: L541 */
/* JADX INFO: loaded from: classes5.dex */
public class C1878 extends C1808 {

    /* JADX INFO: renamed from: ֫ */
    public static Method f70265;

    /* JADX INFO: renamed from: ۧ */
    public static Method f70266;

    /* JADX INFO: renamed from: ܽ */
    public static Class f70267;

    /* JADX INFO: renamed from: ܿ */
    public static boolean f70268;

    /* JADX INFO: renamed from: ᩳ */
    public static Constructor f70269;

    /* JADX INFO: renamed from: ֫ */
    public static void m50047() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f70268) {
            return;
        }
        f70268 = true;
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
        f70269 = constructor;
        f70267 = cls;
        f70265 = method2;
        f70266 = method;
    }

    @Override // p067l.C1808
    /* JADX INFO: renamed from: ֫ */
    public Typeface mo10084(Context context, C1304 c1304, Resources resources, int i) throws NoSuchMethodException {
        m50047();
        try {
            Object objNewInstance = f70269.newInstance(null);
            for (C1269 c1269 : c1304.m25902()) {
                File fileM4335 = C0863.m4335(context);
                if (fileM4335 == null) {
                    return null;
                }
                try {
                    if (!C0863.m4338(fileM4335, resources, c1269.m24318())) {
                        return null;
                    }
                    if (!m50048(objNewInstance, fileM4335.getPath(), c1269.m24321(), c1269.m24319())) {
                        return null;
                    }
                    fileM4335.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileM4335.delete();
                }
            }
            m50047();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f70267, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f70266.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m50048(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        m50047();
        try {
            return ((Boolean) f70265.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p067l.C1808
    /* JADX INFO: renamed from: ֫ */
    public Typeface mo10085(Context context, C1699[] c1699Arr, int i) {
        File file;
        if (c1699Arr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(mo10086(i, c1699Arr).m42814(), "r", null);
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
                            Typeface typefaceMo10083 = mo10083(context, fileInputStream);
                            fileInputStream.close();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceMo10083;
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
