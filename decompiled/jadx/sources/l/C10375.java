package l;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ۤܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes3.dex */
public final class C10375 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m26177(int i, String str) {
        if (i <= 1) {
            if (i >= 0) {
                return i == 0 ? "" : str;
            }
            throw new IllegalArgumentException(m26179("invalid count: %s", Integer.valueOf(i)));
        }
        int length = str.length();
        long j = ((long) length) * ((long) i);
        int i2 = (int) j;
        if (i2 != j) {
            throw new ArrayIndexOutOfBoundsException(C16014.m37865(j, "Required array size too large: "));
        }
        char[] cArr = new char[i2];
        str.getChars(0, length, cArr, 0);
        while (true) {
            int i3 = i2 - length;
            if (length >= i3) {
                System.arraycopy(cArr, 0, cArr, length, i3);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m26179(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i2)) != -1) {
            sb.append((CharSequence) strValueOf, i2, iIndexOf);
            sb.append(m26178(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i2, strValueOf.length());
        if (i < objArr.length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(m26178(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m26178(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e);
            StringBuilder sbM9834 = C3200.m9834("<", str, " threw ");
            sbM9834.append(e.getClass().getName());
            sbM9834.append(">");
            return sbM9834.toString();
        }
    }
}
