package p067l;

import java.security.AccessController;
import java.security.SecureRandom;

/* JADX INFO: renamed from: l.֫᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4366 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC22097 f9815a;

    /* JADX INFO: renamed from: b */
    public static final boolean f9816b;

    /* JADX INFO: renamed from: c */
    public static final SecureRandom f9817c;

    /* JADX INFO: renamed from: a */
    public static InterfaceC22097 m9099a(String str, String str2, InterfaceC22097 interfaceC22097) {
        String str3;
        long jNextLong = f9817c.nextLong();
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
        InterfaceC22097 path = interfaceC22097.getFileSystem().getPath(str + str3 + str2, new String[0]);
        if (path.getParent() == null) {
            return interfaceC22097.resolve(path);
        }
        throw new IllegalArgumentException("Invalid prefix or suffix");
    }

    static {
        String property;
        if (System.getSecurityManager() != null) {
            C11763 c11763 = new C11763();
            c11763.f32883b = "java.io.tmpdir";
            property = (String) AccessController.doPrivileged(c11763);
        } else {
            property = System.getProperty("java.io.tmpdir");
        }
        f9815a = C8685.m20115of(property, new String[0]);
        f9816b = C3991.getDefault().supportedFileAttributeViews().contains("posix");
        f9817c = new SecureRandom();
    }
}
