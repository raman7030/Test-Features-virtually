package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27TW */
/* JADX INFO: loaded from: classes2.dex */
public final class C5770 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m16227(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((C20628) it.next()).f66352.f43020.f25614;
            if (C9786.m24801(str2)) {
                return "video/mp4";
            }
            if (C9786.m24810(str2)) {
                z = true;
            } else if (C9786.m24799(str2)) {
                if (C11003.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (C11003.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }
}
