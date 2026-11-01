package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.zip.Deflater;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.engio.mbassy.listener.MessageHandler;
import p067l.C13853;

/* JADX INFO: renamed from: com.umeng.commonsdk.stateless.d */
/* JADX INFO: compiled from: P466 */
/* JADX INFO: loaded from: classes.dex */
public class C0793d {

    /* JADX INFO: renamed from: a */
    public static int f3335a;

    /* JADX INFO: renamed from: b */
    public static Object f3336b = new Object();

    /* JADX INFO: renamed from: a */
    public static boolean m2905a(long j, long j2) {
        return j > j2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2906a(File file) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            for (String str : file.list()) {
                if (!m2906a(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* JADX INFO: renamed from: a */
    public static int m2900a(Context context, String str, String str2, byte[] bArr) {
        if (context == null) {
            return 101;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                synchronized (f3336b) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append(context.getFilesDir());
                        String str3 = File.separator;
                        sb.append(str3);
                        sb.append(str);
                        File file = new File(sb.toString());
                        if (!file.isDirectory()) {
                            file.mkdir();
                        }
                        FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file.getPath() + str3 + str2));
                        try {
                            fileOutputStream2.write(bArr);
                            fileOutputStream2.close();
                            return 0;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th3;
            }
        } catch (IOException e) {
            UMCrashManager.reportCrash(context, e);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused2) {
                    return 101;
                }
            }
            return 101;
        } catch (Throwable th4) {
            UMCrashManager.reportCrash(context, th4);
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return 101;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ad */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2912b(Context context, String str, String str2, byte[] bArr) {
        boolean z;
        if (context == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                synchronized (f3336b) {
                    try {
                        ULog.m2986i("walle", "[stateless] begin write envelope, thread is " + Thread.currentThread());
                        File file = new File(context.getFilesDir() + "/stateless");
                        if (!file.isDirectory()) {
                            file.mkdir();
                        }
                        File file2 = new File(file.getPath() + "/" + str);
                        if (!file2.isDirectory()) {
                            file2.mkdir();
                        }
                        File file3 = new File(file2.getPath() + "/" + str2);
                        if (!file3.exists()) {
                            file3.createNewFile();
                        }
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                        try {
                            fileOutputStream2.write(bArr);
                            fileOutputStream2.close();
                            try {
                                return true;
                            } catch (Throwable th) {
                                th = th;
                                z = true;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (IOException e) {
                                        e = e;
                                        ULog.m2986i("walle", "[stateless] write envelope, e is " + e.getMessage());
                                        UMCrashManager.reportCrash(context, e);
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException unused) {
                                                return z;
                                            }
                                        }
                                        return z;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        ULog.m2986i("walle", "[stateless] write envelope, e is " + th.getMessage());
                                        UMCrashManager.reportCrash(context, th);
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        return z;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream = fileOutputStream2;
                            z = false;
                            while (true) {
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            } catch (Throwable th5) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th5;
            }
        } catch (IOException e2) {
            e = e2;
            z = false;
        } catch (Throwable th6) {
            th = th6;
            z = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m2907a(String str) {
        byte[] bArr;
        synchronized (f3336b) {
            FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = null;
            try {
                try {
                    fileChannelConvertMaybeLegacyFileChannelFromLibrary = C13853.convertMaybeLegacyFileChannelFromLibrary(new RandomAccessFile(str, "r").getChannel());
                    MappedByteBuffer mappedByteBufferLoad = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, fileChannelConvertMaybeLegacyFileChannelFromLibrary.size()).load();
                    bArr = new byte[(int) fileChannelConvertMaybeLegacyFileChannelFromLibrary.size()];
                    if (mappedByteBufferLoad.remaining() > 0) {
                        mappedByteBufferLoad.get(bArr, 0, mappedByteBufferLoad.remaining());
                    }
                    try {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                    } catch (Throwable unused) {
                    }
                } catch (IOException e) {
                    ULog.m2986i("walle", "[stateless] write envelope, e is " + e.getMessage());
                    throw e;
                }
            } catch (Throwable th) {
                if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                    try {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static File m2901a(Context context) {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        File file = null;
        try {
            synchronized (f3336b) {
                ULog.m2986i("walle", "get last envelope begin, thread is " + Thread.currentThread());
                if (context != null && context.getApplicationContext() != null) {
                    String str = context.getApplicationContext().getFilesDir() + File.separator + C0790a.f3312e;
                    if (!TextUtils.isEmpty(str)) {
                        File file2 = new File(str);
                        if (file2.isDirectory() && (fileArrListFiles = file2.listFiles()) != null && fileArrListFiles.length > 0) {
                            for (File file3 : fileArrListFiles) {
                                if (file3 != null && file3.isDirectory() && (fileArrListFiles2 = file3.listFiles()) != null && fileArrListFiles2.length > 0) {
                                    Arrays.sort(fileArrListFiles2, new Comparator() { // from class: com.umeng.commonsdk.stateless.d.1
                                        @Override // java.util.Comparator
                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public int compare(File file4, File file5) {
                                            long jLastModified = file4.lastModified() - file5.lastModified();
                                            if (jLastModified > 0) {
                                                return 1;
                                            }
                                            return jLastModified == 0 ? 0 : -1;
                                        }
                                    });
                                    File file4 = fileArrListFiles2[0];
                                    if (file4 != null && (file == null || file.lastModified() > file4.lastModified())) {
                                        file = file4;
                                    }
                                }
                            }
                        }
                    }
                }
                ULog.m2986i("walle", "get last envelope end, thread is " + Thread.currentThread());
            }
            return file;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return file;
        }
    }

    /* JADX INFO: renamed from: b */
    public static File m2910b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            synchronized (f3336b) {
                String str = context.getApplicationContext().getFilesDir() + File.separator + C0790a.f3313f;
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                File file = new File(str);
                synchronized (f3336b) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                        Arrays.sort(fileArrListFiles, new Comparator() { // from class: com.umeng.commonsdk.stateless.d.2
                            @Override // java.util.Comparator
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public int compare(File file2, File file3) {
                                long jLastModified = file2.lastModified() - file3.lastModified();
                                if (jLastModified > 0) {
                                    return 1;
                                }
                                return jLastModified == 0 ? 0 : -1;
                            }
                        });
                        return fileArrListFiles[0];
                    }
                    return null;
                }
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m2902a(Context context, boolean z) {
        if (context == null) {
            return null;
        }
        try {
            if (z) {
                return context.getApplicationContext().getFilesDir() + File.separator + C0790a.f3312e;
            }
            return context.getApplicationContext().getFilesDir() + File.separator + C0790a.f3313f;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static File[] m2916c(Context context) {
        if (context == null) {
            return null;
        }
        try {
            synchronized (f3336b) {
                String str = context.getApplicationContext().getFilesDir() + File.separator + C0790a.f3313f;
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                File file = new File(str);
                synchronized (f3336b) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                        Arrays.sort(fileArrListFiles, new Comparator() { // from class: com.umeng.commonsdk.stateless.d.3
                            @Override // java.util.Comparator
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public int compare(File file2, File file3) {
                                long jLastModified = file2.lastModified() - file3.lastModified();
                                if (jLastModified > 0) {
                                    return 1;
                                }
                                return jLastModified == 0 ? 0 : -1;
                            }
                        });
                        return fileArrListFiles;
                    }
                    return null;
                }
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2903a(Context context, String str, int i) {
        try {
            if (str == null) {
                ULog.m2986i("AmapLBS", "[lbs-build] fileDir not exist, thread is " + Thread.currentThread());
                return;
            }
            File file = new File(str);
            if (!file.isDirectory()) {
                ULog.m2986i("AmapLBS", "[lbs-build] fileDir not exist, thread is " + Thread.currentThread());
                return;
            }
            synchronized (f3336b) {
                File[] fileArrListFiles = file.listFiles();
                ULog.m2986i("AmapLBS", "[lbs-build] delete file begin " + fileArrListFiles.length + ", thread is " + Thread.currentThread());
                if (fileArrListFiles.length >= i) {
                    ULog.m2986i("AmapLBS", "[lbs-build] file size >= max");
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : fileArrListFiles) {
                        if (file2 != null) {
                            arrayList.add(file2);
                        }
                    }
                    if (arrayList.size() >= i) {
                        Collections.sort(arrayList, new Comparator() { // from class: com.umeng.commonsdk.stateless.d.4
                            @Override // java.util.Comparator
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public int compare(File file3, File file4) {
                                if (file3 == null || file4 == null || file3.lastModified() >= file4.lastModified()) {
                                    return (file3 == null || file4 == null || file3.lastModified() != file4.lastModified()) ? 1 : 0;
                                }
                                return -1;
                            }
                        });
                        if (ULog.DEBUG) {
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                ULog.m2986i("AmapLBS", "[lbs-build] overrun native file is " + ((File) arrayList.get(i2)).getPath());
                            }
                        }
                        for (int i3 = 0; i3 <= arrayList.size() - i; i3++) {
                            if (arrayList.get(i3) != null) {
                                ULog.m2986i("AmapLBS", "[lbs-build] overrun remove file is " + ((File) arrayList.get(i3)).getPath());
                                try {
                                    ((File) arrayList.get(i3)).delete();
                                    arrayList.remove(i3);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                } else {
                    ULog.m2986i("AmapLBS", "[lbs-build] file size < max");
                }
                ULog.m2986i("AmapLBS", "[lbs-build] delete file end " + fileArrListFiles.length + ", thread is " + Thread.currentThread());
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2904a(Context context, String str, final String str2, int i) {
        if (str == null) {
            return;
        }
        try {
            File file = new File(str);
            if (file.isDirectory()) {
                synchronized (f3336b) {
                    try {
                        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.umeng.commonsdk.stateless.d.5
                            @Override // java.io.FilenameFilter
                            public boolean accept(File file2, String str3) {
                                return str3.startsWith(str2);
                            }
                        });
                        if (fileArrListFiles != null && fileArrListFiles.length >= i) {
                            ULog.m2986i("AmapLBS", "[lbs-build] file size >= max");
                            ArrayList arrayList = new ArrayList();
                            for (File file2 : fileArrListFiles) {
                                if (file2 != null) {
                                    arrayList.add(file2);
                                }
                            }
                            if (arrayList.size() >= i) {
                                Collections.sort(arrayList, new Comparator() { // from class: com.umeng.commonsdk.stateless.d.6
                                    @Override // java.util.Comparator
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public int compare(File file3, File file4) {
                                        if (file3 == null || file4 == null || file3.lastModified() >= file4.lastModified()) {
                                            return (file3 == null || file4 == null || file3.lastModified() != file4.lastModified()) ? 1 : 0;
                                        }
                                        return -1;
                                    }
                                });
                                if (ULog.DEBUG) {
                                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                        ULog.m2986i("AmapLBS", "[lbs-build] overrun native file is " + ((File) arrayList.get(i2)).getPath());
                                    }
                                }
                                for (int i3 = 0; i3 <= arrayList.size() - i; i3++) {
                                    if (arrayList.get(i3) != null) {
                                        ULog.m2986i("AmapLBS", "[lbs-build] overrun remove file is " + ((File) arrayList.get(i3)).getPath());
                                        try {
                                            ((File) arrayList.get(i3)).delete();
                                            arrayList.remove(i3);
                                        } catch (Exception unused) {
                                        }
                                    }
                                }
                            }
                        } else {
                            ULog.m2986i("AmapLBS", "[lbs-build] file size < max");
                        }
                        ULog.m2986i("AmapLBS", "[lbs-build] delete file end " + fileArrListFiles.length + ", thread is " + Thread.currentThread());
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(context, th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m2908a(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[8192];
        f3335a = 0;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            while (!deflater.finished()) {
                try {
                    int iDeflate = deflater.deflate(bArr2);
                    f3335a += iDeflate;
                    byteArrayOutputStream2.write(bArr2, 0, iDeflate);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            }
            deflater.end();
            byteArrayOutputStream2.close();
            return byteArrayOutputStream2.toByteArray();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m2909a(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(UMUtils.genIv()));
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m2913b(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m2915c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append(String.format("%02X", Byte.valueOf(b)));
        }
        return stringBuffer.toString().toLowerCase(Locale.US);
    }

    /* JADX INFO: renamed from: b */
    public static String m2911b(String str) {
        try {
            return Base64.encodeToString(str.getBytes(), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m2914c(String str) {
        try {
            return new String(Base64.decode(str, 0));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m2917d(String str) {
        int iLastIndexOf;
        int iLastIndexOf2;
        return (!TextUtils.isEmpty(str) && str.indexOf(MessageHandler.Properties.Enveloped) < 0 && (iLastIndexOf = str.lastIndexOf("_")) >= 0 && (iLastIndexOf2 = str.lastIndexOf(".")) >= 0) ? str.substring(iLastIndexOf + 1, iLastIndexOf2) : "";
    }
}
