package p067l;

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

/* JADX INFO: renamed from: l.֡۬ */
/* JADX INFO: compiled from: H4PP */
/* JADX INFO: loaded from: classes.dex */
public final class C0863 {

    /* JADX INFO: renamed from: ۠֡᩶, reason: not valid java name and contains not printable characters */
    public static int f81833;

    /* JADX INFO: renamed from: ֡ۖ֨, reason: not valid java name and contains not printable characters */
    public static void m55628(Object obj, Object obj2) {
        ((C3422) obj).m6072((AbstractC9476) obj2);
    }

    /* JADX INFO: renamed from: ֨ۙ֨, reason: not valid java name and contains not printable characters */
    public static StringBuilder m55629(Object obj, int i) {
        return ((StringBuilder) obj).append(i);
    }

    /* JADX INFO: renamed from: ֨۠ܺ, reason: not valid java name and contains not printable characters */
    public static boolean m55630(Object obj, Object obj2) {
        return ((String) obj).contains((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ֫᩺۫, reason: not valid java name and contains not printable characters */
    public static int m55631(Object obj) {
        return ((Integer) obj).intValue();
    }

    /* JADX INFO: renamed from: ۛ֡᩹, reason: not valid java name and contains not printable characters */
    public static void m55632(Object obj, int i, Object obj2) {
        ((C1502) obj).m34390(i, obj2);
    }

    /* JADX INFO: renamed from: ۠ۗۧ, reason: not valid java name and contains not printable characters */
    public static MenuItem m55633(Object obj, boolean z) {
        return ((MenuItem) obj).setVisible(z);
    }

    /* JADX INFO: renamed from: ۡۧܳ, reason: not valid java name and contains not printable characters */
    public static int m55634(Object obj) {
        return ((DataInputStream) obj).readInt();
    }

    /* JADX INFO: renamed from: ۢܳ᩸, reason: not valid java name and contains not printable characters */
    public static String m55635(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧ֫֫, reason: not valid java name and contains not printable characters */
    public static void m55636() {
        C17127.m38756();
    }

    /* JADX INFO: renamed from: ۬ܶۧ, reason: not valid java name and contains not printable characters */
    public static void m55637(Object obj, int i) {
        ((C10844) obj).m24992(i);
    }

    /* JADX INFO: renamed from: ܶ۟᩵, reason: not valid java name and contains not printable characters */
    public static String m55638(Object obj, int i) {
        return ((Context) obj).getString(i);
    }

    /* JADX INFO: renamed from: ܺܽۖ, reason: not valid java name and contains not printable characters */
    public static String m55639(Object obj) {
        return obj.toString();
    }

    /* JADX INFO: renamed from: ܿᩳۧ, reason: not valid java name and contains not printable characters */
    public static String m55640(Object obj) {
        return C17384.m39569((AbstractC17043) obj);
    }

    /* JADX INFO: renamed from: ᩴۗۨ, reason: not valid java name and contains not printable characters */
    public static void m55641(Object obj, Object obj2) {
        ((C10844) obj).m24986((String) obj2);
    }

    /* JADX INFO: renamed from: ᩶ᩳᩳ, reason: not valid java name and contains not printable characters */
    public static String m55642(int i) {
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: ᩻ܶܿ, reason: not valid java name and contains not printable characters */
    public static boolean m55643() {
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static File m4335(Context context) {
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

    /* JADX INFO: renamed from: ֫ */
    public static MappedByteBuffer m4336(Context context, Uri uri) {
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
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C13853.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
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

    /* JADX INFO: renamed from: ֫ */
    public static boolean m4339(File file, InputStream inputStream) throws Throwable {
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
                            m4337(fileOutputStream);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    fileOutputStream2 = fileOutputStream;
                    e.getMessage();
                    m4337(fileOutputStream2);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    m4337(fileOutputStream);
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

    /* JADX INFO: renamed from: ֫ */
    public static boolean m4338(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zM4339 = m4339(file, inputStreamOpenRawResource);
                m4337(inputStreamOpenRawResource);
                return zM4339;
            } catch (Throwable th) {
                th = th;
                m4337(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4337(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
