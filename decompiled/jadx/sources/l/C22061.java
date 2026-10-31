package l;

/* JADX INFO: renamed from: l.᩹ۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: R61W */
/* JADX INFO: loaded from: classes.dex */
public final class C22061 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49621(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(C5368.m15337(obj2, "null key in entry: null="));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49620(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }
}
