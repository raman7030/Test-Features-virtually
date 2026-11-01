package p067l;

import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۢ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: GAZ9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11681 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashSet f32574;

    static {
        HashSet hashSetM37743 = C16667.m37743(25);
        Collections.addAll(hashSetM37743, ".hwbk", ".jpeg", ".jpg", ".bmp", ".gif", ".png", ".webp", ".3gp", ".asf", ".avi", ".mp4", ".mpe", ".mpeg", ".mpg", ".mpg4", ".m4u", ".m4v", ".mov", ".rmvb", ".wmv", ".3gpp", ".flv", ".ogv", ".mkv", ".dv");
        f32574 = hashSetM37743;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m26844(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    m26844(file2);
                }
            }
            return file.delete();
        }
        return m26845(file);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m26845(File file) {
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (f32574.contains(iLastIndexOf == -1 ? "" : name.substring(iLastIndexOf).toLowerCase(Locale.ROOT)) && file.isFile()) {
            File file2 = new File(file.getPath() + ".mt_force_delete");
            return file.renameTo(file2) && file2.delete();
        }
        return file.delete();
    }
}
