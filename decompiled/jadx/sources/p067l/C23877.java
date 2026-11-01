package p067l;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: renamed from: l.᩺֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8D9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23877 {
    @Pure
    /* JADX INFO: renamed from: ֫ */
    public static void m52957(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    /* JADX INFO: renamed from: ֫ */
    public static void m52956(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    @Pure
    /* JADX INFO: renamed from: ֫ */
    public static void m52953(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Pure
    /* JADX INFO: renamed from: ۧ */
    public static void m52960(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @Pure
    /* JADX INFO: renamed from: ۧ */
    public static void m52959(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: ۧ */
    public static void m52958(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: ֫ */
    public static void m52954(Object obj) {
        obj.getClass();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: ֫ */
    public static void m52955(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
