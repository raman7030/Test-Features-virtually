package p067l;

/* JADX INFO: renamed from: l.ܿ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M283 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18515 {
    /* JADX INFO: renamed from: ֫ */
    public static void m42065(Object obj) {
        if (obj == null) {
            throw new C15832("Object must not be null");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42068(boolean z) {
        if (!z) {
            throw new C15832("Must be true");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42066(String str) {
        if (str == null || str.length() == 0) {
            throw new C15832("String must not be empty");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42067(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new C15832(str2);
        }
    }
}
