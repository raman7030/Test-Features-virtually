package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27TW */
/* JADX INFO: loaded from: classes2.dex */
public final class C7852 {
    /* JADX INFO: renamed from: ֫ */
    public static String m18146(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((C21973) it.next()).f69033.f46112.f28528;
            if (C11669.m26816(str2)) {
                return "video/mp4";
            }
            if (C11669.m26825(str2)) {
                z = true;
            } else if (C11669.m26814(str2)) {
                if (C12826.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (C12826.equals(str2, "image/avif")) {
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
