package p067l;

/* JADX INFO: renamed from: l.᩹ۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: R61W */
/* JADX INFO: loaded from: classes.dex */
public final class C23335 {
    /* JADX INFO: renamed from: ֫ */
    public static void m51957(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(C7470.m17246(obj2, "null key in entry: null="));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51956(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }
}
