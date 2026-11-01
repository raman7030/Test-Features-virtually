package p067l;

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
public final class C15124 {
    /* JADX INFO: renamed from: ֫ */
    public static C5737 m34539(ArrayList arrayList, C8870 c8870) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Image export must run in the background");
        }
        File file = new File(C17853.f53278.mo25505());
        ExecutorService executorService = C4081.f8987;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C12826.requireNonNull(executorService);
            ArrayList arrayList2 = new ArrayList(arrayList);
            if (arrayList2.isEmpty()) {
                throw new IllegalArgumentException("No images selected for export");
            }
            File fileM34541 = null;
            try {
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int i = 0;
                long j = 0;
                while (i < arrayList2.size()) {
                    AbstractC24196.m53499(c8870);
                    AbstractC24196 abstractC24196 = (AbstractC24196) arrayList2.get(i);
                    C12826.requireNonNull(abstractC24196);
                    if (abstractC24196 instanceof C8419) {
                        throw new IOException("Sharing requires the original image source");
                    }
                    C13468 c13468Mo8381 = abstractC24196.mo8381();
                    File fileMo13948 = abstractC24196.mo13948();
                    if (fileMo13948 != null && fileMo13948.isFile() && fileMo13948.canRead()) {
                        abstractC24196.m53500(c13468Mo8381);
                        String str = C13692.f38625;
                        arrayList3.add(C13692.m31097(fileMo13948.getPath()));
                    } else {
                        long j2 = c13468Mo8381.f37803;
                        long j3 = 536870912 - j;
                        if (j2 <= 268435456 && j2 <= j3) {
                            if (fileM34541 == null) {
                                fileM34541 = m34541(file);
                            }
                            File file2 = new File(fileM34541, Integer.toString(i));
                            if (!file2.mkdir()) {
                                throw new IOException("Cannot create image export directory");
                            }
                            File file3 = new File(file2, ".partial");
                            C7078 c7078 = new C7078(file3, Math.min(268435456L, j3), c8870);
                            try {
                                abstractC24196.mo8375((OutputStream) c7078, true, (InterfaceC18588) c8870);
                                AbstractC24196.m53499(c8870);
                                long j4 = c7078.f18452;
                                c7078.close();
                                abstractC24196.m53500(c13468Mo8381);
                                long j5 = c13468Mo8381.f37803;
                                if (j5 >= 0 && j4 != j5) {
                                    throw new C8103("Image export size differs from source snapshot");
                                }
                                File file4 = new File(file2, m34538(abstractC24196.mo8379()));
                                if (!file3.renameTo(file4)) {
                                    throw new IOException("Cannot publish image export file");
                                }
                                j += j4;
                                String str2 = C13692.f38625;
                                arrayList3.add(C13692.m31097(file4.getPath()));
                            } catch (Throwable th) {
                                try {
                                    c7078.close();
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
                AbstractC24196.m53499(c8870);
                if (fileM34541 != null && !fileM34541.setLastModified(System.currentTimeMillis())) {
                    throw new IOException("Cannot timestamp image export directory");
                }
                return new C5737(arrayList3, fileM34541, executorService2);
            } catch (Throwable th3) {
                m34542(fileM34541);
                throw th3;
            }
        }
        throw new IllegalStateException("Image export must run in the background");
    }

    /* JADX INFO: renamed from: ۧ */
    public static File m34541(File file) throws IOException {
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

    /* JADX INFO: renamed from: ֫ */
    public static String m34538(String str) {
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

    /* JADX INFO: renamed from: ܽ */
    public static void m34542(File file) {
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
