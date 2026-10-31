package l;

import java.security.AccessController;
import java.security.SecureRandom;

/* JADX INFO: renamed from: l.֫᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2101 {
    public static final InterfaceC20758 a;
    public static final boolean b;
    public static final SecureRandom c;

    public static InterfaceC20758 a(String str, String str2, InterfaceC20758 interfaceC20758) {
        String str3;
        long jNextLong = c.nextLong();
        if (jNextLong == 0) {
            str3 = "0";
        } else if (jNextLong > 0) {
            str3 = Long.toString(jNextLong, 10);
        } else {
            char[] cArr = new char[64];
            long j = (jNextLong >>> 1) / ((long) 5);
            long j2 = 10;
            int i = 63;
            cArr[63] = Character.forDigit((int) (jNextLong - (j * j2)), 10);
            while (j > 0) {
                i--;
                cArr[i] = Character.forDigit((int) (j % j2), 10);
                j /= j2;
            }
            str3 = new String(cArr, i, 64 - i);
        }
        InterfaceC20758 path = interfaceC20758.getFileSystem().getPath(str + str3 + str2, new String[0]);
        if (path.getParent() == null) {
            return interfaceC20758.resolve(path);
        }
        throw new IllegalArgumentException("Invalid prefix or suffix");
    }

    static {
        String property;
        if (System.getSecurityManager() != null) {
            C9884 c9884 = new C9884();
            c9884.b = "java.io.tmpdir";
            property = (String) AccessController.doPrivileged(c9884);
        } else {
            property = System.getProperty("java.io.tmpdir");
        }
        a = C6646.of(property, new String[0]);
        b = C1707.getDefault().supportedFileAttributeViews().contains("posix");
        c = new SecureRandom();
    }
}
