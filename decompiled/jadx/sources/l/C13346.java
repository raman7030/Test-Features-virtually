package l;

import java.io.IOException;
import java.io.UncheckedIOException;

/* JADX INFO: renamed from: l.۬᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56R4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13346 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3469 m32320(C12951 c12951, InterfaceC7765 interfaceC7765) {
        if (c12951.m31500() == -131647720) {
            c12951.skipBytes(4);
            if (c12951.m31498()) {
                if (interfaceC7765 == null) {
                    interfaceC7765 = InterfaceC7765.f24007;
                }
                try {
                    C16168 c16168M38102 = C16168.m38102(C6646.of(interfaceC7765.mo6269(c12951.m31504()).mo23554(), new String[0]), new C1143(1048576L));
                    try {
                        StringBuilder sb = new StringBuilder(c16168M38102.length());
                        char[] cArr = new char[8192];
                        while (true) {
                            int i = c16168M38102.read(cArr, 0, 8192);
                            if (i == -1) {
                                C3469 c3469 = new C3469(sb.toString(), c16168M38102.m38106());
                                c16168M38102.close();
                                return c3469;
                            }
                            sb.append(cArr, 0, i);
                            throw new UncheckedIOException(e);
                        }
                    } catch (Throwable th) {
                        try {
                            c16168M38102.close();
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
        String strM31504 = c12951.m31504();
        C22519 c22519 = new C22519();
        int iMin = Math.min(8192, strM31504.length());
        char[] cArr2 = new char[iMin];
        int i2 = 0;
        while (i2 < strM31504.length()) {
            int iMin2 = Math.min(iMin, strM31504.length() - i2);
            int i3 = i2 + iMin2;
            strM31504.getChars(i2, i3, cArr2, 0);
            c22519.m50494(cArr2, iMin2);
            i2 = i3;
        }
        return new C3469(strM31504, c22519.m50493(strM31504.length()));
    }
}
