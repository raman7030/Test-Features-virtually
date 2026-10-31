package l;

import java.io.File;

/* JADX INFO: renamed from: l.ۗ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9LL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3527 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10722(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return false;
            }
            boolean z = true;
            for (File file2 : fileArrListFiles) {
                z = m10722(file2) && z;
            }
            return z;
        }
        file.delete();
        return true;
    }
}
