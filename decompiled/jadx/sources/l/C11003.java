package l;

import java.util.Arrays;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۧ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11003 {
    public static boolean nonNull(Object obj) {
        return obj != null;
    }

    public static int checkIndex(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw AbstractC22791.U("checkIndex", Integer.valueOf(i), Integer.valueOf(i2));
        }
        return i;
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int checkFromToIndex(int i, int i2, int i3) {
        if (i < 0 || i > i2 || i2 > i3) {
            throw AbstractC22791.U("checkFromToIndex", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
        return i;
    }

    public static int checkFromIndexSize(int i, int i2, int i3) {
        if ((i3 | i | i2) < 0 || i2 > i3 - i) {
            throw AbstractC22791.U("checkFromIndexSize", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
        return i;
    }

    public static int hashCode(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static String toString(Object obj) {
        return String.valueOf(obj);
    }

    public static String toString(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }

    public static Object requireNonNull(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object requireNonNull(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static Object requireNonNullElse(Object obj, Object obj2) {
        return obj != null ? obj : requireNonNull(obj2, "defaultObj");
    }

    public static Object requireNonNullElseGet(Object obj, Supplier supplier) {
        return obj != null ? obj : requireNonNull(((Supplier) requireNonNull(supplier, "supplier")).get(), "supplier.get()");
    }

    public static Object requireNonNull(Object obj, Supplier supplier) {
        if (obj == null) {
            throw new NullPointerException(supplier == null ? null : (String) supplier.get());
        }
        return obj;
    }
}
