package p067l;

import java.io.IOException;
import java.p066io.UncheckedIOException;

/* JADX INFO: renamed from: l.۬᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56R4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15053 {
    /* JADX INFO: renamed from: ֫ */
    public static C5666 m34421(C14677 c14677, InterfaceC9749 interfaceC9749) {
        if (c14677.m33587() == -131647720) {
            c14677.skipBytes(4);
            if (c14677.m33585()) {
                if (interfaceC9749 == null) {
                    interfaceC9749 = InterfaceC9749.f26921;
                }
                try {
                    C17735 c17735M40294 = C17735.m40294(C8685.m20115of(interfaceC9749.mo8471(c14677.m33591()).mo25505(), new String[0]), new C3455(1048576L));
                    try {
                        StringBuilder sb = new StringBuilder(c17735M40294.length());
                        char[] cArr = new char[8192];
                        while (true) {
                            int i = c17735M40294.read(cArr, 0, 8192);
                            if (i == -1) {
                                C5666 c5666 = new C5666(sb.toString(), c17735M40294.m40298());
                                c17735M40294.close();
                                return c5666;
                            }
                            sb.append(cArr, 0, i);
                            throw new UncheckedIOException(e);
                        }
                    } catch (Throwable th) {
                        try {
                            c17735M40294.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
        }
        String strM33591 = c14677.m33591();
        C23771 c23771 = new C23771();
        int iMin = Math.min(8192, strM33591.length());
        char[] cArr2 = new char[iMin];
        int i2 = 0;
        while (i2 < strM33591.length()) {
            int iMin2 = Math.min(iMin, strM33591.length() - i2);
            int i3 = i2 + iMin2;
            strM33591.getChars(i2, i3, cArr2, 0);
            c23771.m52836(cArr2, iMin2);
            i2 = i3;
        }
        return new C5666(strM33591, c23771.m52835(strM33591.length()));
    }
}
