package l;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.view.MenuItem;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H4PP */
/* JADX INFO: loaded from: classes.dex */
public final class C0422 {

    /* JADX INFO: renamed from: ۠֡᩶, reason: not valid java name and contains not printable characters */
    public static int f1886;

    /* JADX INFO: renamed from: ֡ۖ֨, reason: not valid java name and contains not printable characters */
    public static void m1943(Object obj, Object obj2) {
        ((C1109) obj).m3815((AbstractC7479) obj2);
    }

    /* JADX INFO: renamed from: ֨ۙ֨, reason: not valid java name and contains not printable characters */
    public static StringBuilder m1944(Object obj, int i) {
        return ((StringBuilder) obj).append(i);
    }

    /* JADX INFO: renamed from: ֨۠ܺ, reason: not valid java name and contains not printable characters */
    public static boolean m1945(Object obj, Object obj2) {
        return ((String) obj).contains((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ֫᩺۫, reason: not valid java name and contains not printable characters */
    public static int m1951(Object obj) {
        return ((Integer) obj).intValue();
    }

    /* JADX INFO: renamed from: ۛ֡᩹, reason: not valid java name and contains not printable characters */
    public static void m1952(Object obj, int i, Object obj2) {
        ((C13309) obj).m32289(i, obj2);
    }

    /* JADX INFO: renamed from: ۠ۗۧ, reason: not valid java name and contains not printable characters */
    public static MenuItem m1953(Object obj, boolean z) {
        return ((MenuItem) obj).setVisible(z);
    }

    /* JADX INFO: renamed from: ۡۧܳ, reason: not valid java name and contains not printable characters */
    public static int m1954(Object obj) {
        return ((DataInputStream) obj).readInt();
    }

    /* JADX INFO: renamed from: ۢܳ᩸, reason: not valid java name and contains not printable characters */
    public static String m1955(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧ֫֫, reason: not valid java name and contains not printable characters */
    public static void m1956() {
        C15528.m36596();
    }

    /* JADX INFO: renamed from: ۬ܶۧ, reason: not valid java name and contains not printable characters */
    public static void m1957(Object obj, int i) {
        ((C8918) obj).m23018(i);
    }

    /* JADX INFO: renamed from: ܶ۟᩵, reason: not valid java name and contains not printable characters */
    public static String m1958(Object obj, int i) {
        return ((Context) obj).getString(i);
    }

    /* JADX INFO: renamed from: ܺܽۖ, reason: not valid java name and contains not printable characters */
    public static String m1959(Object obj) {
        return obj.toString();
    }

    /* JADX INFO: renamed from: ܿᩳۧ, reason: not valid java name and contains not printable characters */
    public static String m1960(Object obj) {
        return C15799.m37398((AbstractC15440) obj);
    }

    /* JADX INFO: renamed from: ᩴۗۨ, reason: not valid java name and contains not printable characters */
    public static void m1961(Object obj, Object obj2) {
        ((C8918) obj).m23012((String) obj2);
    }

    /* JADX INFO: renamed from: ᩶ᩳᩳ, reason: not valid java name and contains not printable characters */
    public static String m1962(int i) {
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: ᩻ܶܿ, reason: not valid java name and contains not printable characters */
    public static boolean m1963() {
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static File m1946(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MappedByteBuffer m1947(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C12084.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                    MappedByteBuffer map = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, fileChannelConvertMaybeLegacyFileChannelFromLibrary.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
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
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m1950(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i != -1) {
                            fileOutputStream.write(bArr, 0, i);
                        } else {
                            m1948(fileOutputStream);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    fileOutputStream2 = fileOutputStream;
                    e.getMessage();
                    m1948(fileOutputStream2);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    m1948(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m1949(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zM1950 = m1950(file, inputStreamOpenRawResource);
                m1948(inputStreamOpenRawResource);
                return zM1950;
            } catch (Throwable th) {
                th = th;
                m1948(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1948(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
