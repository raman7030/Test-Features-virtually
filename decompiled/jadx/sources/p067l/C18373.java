package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ܽ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R8MQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18373 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashSet f54874 = new HashSet();

    /* JADX INFO: renamed from: ۧ */
    public static String f54875 = "media3.common";

    /* JADX INFO: renamed from: ֫ */
    public static synchronized String m41850() {
        return f54875;
    }

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m41851(String str) {
        if (f54874.add(str)) {
            f54875 += ", " + str;
        }
    }
}
