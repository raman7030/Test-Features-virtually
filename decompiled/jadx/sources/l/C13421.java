package l;

import android.os.Looper;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.۬᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13421 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3544 m32437(ArrayList arrayList, C6841 c6841) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Image export must run in the background");
        }
        File file = new File(C16293.f50111.mo23554());
        ExecutorService executorService = C1802.f6208;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C11003.requireNonNull(executorService);
            ArrayList arrayList2 = new ArrayList(arrayList);
            if (arrayList2.isEmpty()) {
                throw new IllegalArgumentException("No images selected for export");
            }
            File fileM32439 = null;
            try {
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int i = 0;
                long j = 0;
                while (i < arrayList2.size()) {
                    AbstractC22967.m51107(c6841);
                    AbstractC22967 abstractC22967 = (AbstractC22967) arrayList2.get(i);
                    C11003.requireNonNull(abstractC22967);
                    if (abstractC22967 instanceof C6366) {
                        throw new IOException("Sharing requires the original image source");
                    }
                    C11679 c11679Mo6179 = abstractC22967.mo6179();
                    File fileMo12024 = abstractC22967.mo12024();
                    if (fileMo12024 != null && fileMo12024.isFile() && fileMo12024.canRead()) {
                        abstractC22967.m51108(c11679Mo6179);
                        String str = C11914.f35616;
                        arrayList3.add(C11914.m29045(fileMo12024.getPath()));
                    } else {
                        long j2 = c11679Mo6179.f34804;
                        long j3 = 536870912 - j;
                        if (j2 <= 268435456 && j2 <= j3) {
                            if (fileM32439 == null) {
                                fileM32439 = m32439(file);
                            }
                            File file2 = new File(fileM32439, Integer.toString(i));
                            if (!file2.mkdir()) {
                                throw new IOException("Cannot create image export directory");
                            }
                            File file3 = new File(file2, ".partial");
                            C4955 c4955 = new C4955(file3, Math.min(268435456L, j3), c6841);
                            try {
                                abstractC22967.mo6173((OutputStream) c4955, true, (InterfaceC17066) c6841);
                                AbstractC22967.m51107(c6841);
                                long j4 = c4955.f15618;
                                c4955.close();
                                abstractC22967.m51108(c11679Mo6179);
                                long j5 = c11679Mo6179.f34804;
                                if (j5 >= 0 && j4 != j5) {
                                    throw new C6034("Image export size differs from source snapshot");
                                }
                                File file4 = new File(file2, m32436(abstractC22967.mo6177()));
                                if (!file3.renameTo(file4)) {
                                    throw new IOException("Cannot publish image export file");
                                }
                                j += j4;
                                String str2 = C11914.f35616;
                                arrayList3.add(C11914.m29045(file4.getPath()));
                            } catch (Throwable th) {
                                try {
                                    c4955.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } else {
                            throw new IOException("Image export exceeds byte limit");
                        }
                    }
                    i++;
                    executorService = executorService;
                    arrayList2 = arrayList2;
                }
                ExecutorService executorService2 = executorService;
                AbstractC22967.m51107(c6841);
                if (fileM32439 != null && !fileM32439.setLastModified(System.currentTimeMillis())) {
                    throw new IOException("Cannot timestamp image export directory");
                }
                return new C3544(arrayList3, fileM32439, executorService2);
            } catch (Throwable th3) {
                m32440(fileM32439);
                throw th3;
            }
        }
        throw new IllegalStateException("Image export must run in the background");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static File m32439(File file) throws IOException {
        if (!file.isDirectory() && !file.mkdirs()) {
            throw new IOException("Cannot create image export parent");
        }
        for (int i = 0; i < 8; i++) {
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            File file2 = new File(file, "temp_" + Integer.toString(Math.abs(new Random().nextInt() + 1817260513), 36) + "_" + Integer.toString(iCurrentTimeMillis, 36));
            if (file2.mkdir()) {
                return file2;
            }
        }
        throw new IOException("Cannot create unique image export batch");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m32436(String str) {
        String strSubstring;
        int i;
        if (str != null && !str.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int iCharCount = 0;
            while (iCharCount < str.length()) {
                int iCodePointAt = str.codePointAt(iCharCount);
                iCharCount += Character.charCount(iCodePointAt);
                if (iCodePointAt == 47 || iCodePointAt == 92 || Character.isISOControl(iCodePointAt)) {
                    iCodePointAt = 95;
                }
                sb.appendCodePoint(iCodePointAt);
            }
            String string = sb.toString();
            if (!string.equals(".") && !string.equals("..")) {
                int iLastIndexOf = string.lastIndexOf(46);
                if (string.endsWith(".9.png")) {
                    iLastIndexOf = string.length() - 6;
                }
                if (iLastIndexOf <= 0 || string.length() - iLastIndexOf > 20) {
                    strSubstring = "";
                } else {
                    strSubstring = string.substring(iLastIndexOf);
                    string = string.substring(0, iLastIndexOf);
                }
                int iCharCount2 = 0;
                int i2 = 0;
                while (iCharCount2 < string.length()) {
                    int iCodePointAt2 = string.codePointAt(iCharCount2);
                    if (iCodePointAt2 < 128) {
                        i = 1;
                    } else if (iCodePointAt2 < 2048) {
                        i = 2;
                    } else {
                        i = iCodePointAt2 < 65536 ? 3 : 4;
                    }
                    i2 += i;
                    if (i2 > 160) {
                        break;
                    }
                    iCharCount2 += Character.charCount(iCodePointAt2);
                }
                return string.substring(0, iCharCount2) + strSubstring;
            }
        }
        return "image";
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m32440(File file) {
        if (file == null) {
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                File[] fileArrListFiles2 = file2.listFiles();
                if (fileArrListFiles2 != null) {
                    for (File file3 : fileArrListFiles2) {
                        file3.delete();
                    }
                }
                file2.delete();
            }
        }
        file.delete();
    }
}
