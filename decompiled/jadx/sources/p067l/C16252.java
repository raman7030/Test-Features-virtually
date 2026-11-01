package p067l;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q151 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16252 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m37012(InputStream inputStream, C13929 c13929, boolean z, C14281 c14281) throws Throwable {
        boolean z2;
        try {
            C16820 c16820M38130 = C16820.m38130(inputStream);
            Iterator it = c16820M38130.f49796.m50187().iterator();
            while (it.hasNext()) {
                c13929.m56473reset((CharSequence) ((InterfaceC5763) it.next()).getValue());
                if (z) {
                    if (c13929.matches()) {
                        return true;
                    }
                } else if (c13929.find()) {
                    return true;
                }
            }
            XmlResourceParserC12128 xmlResourceParserC12128M38154 = c16820M38130.m38154();
            do {
                try {
                    int next = xmlResourceParserC12128M38154.next();
                    if (next == 1) {
                        xmlResourceParserC12128M38154.close();
                        return false;
                    }
                    z2 = false;
                    if (next == 2) {
                        int attributeCount = xmlResourceParserC12128M38154.getAttributeCount();
                        for (int i = 0; i != attributeCount; i++) {
                            int iM28045 = xmlResourceParserC12128M38154.m28045(i);
                            if (iM28045 == 2 || iM28045 == 1) {
                                c13929.m56473reset((CharSequence) C21466.m48631(iM28045 == 2 ? "?" : "@", c14281.m32848(xmlResourceParserC12128M38154.m28042(i)).toLowerCase()));
                                if (!z) {
                                    if (c13929.find()) {
                                        z2 = true;
                                        break;
                                        break;
                                    }
                                } else {
                                    if (c13929.matches()) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    try {
                        xmlResourceParserC12128M38154.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } while (!z2);
            xmlResourceParserC12128M38154.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m37014(InputStream inputStream, C13929 c13929, boolean z, boolean z2, String str, C23380 c23380) throws Throwable {
        try {
            C16820 c16820M38130 = C16820.m38130(inputStream);
            ArrayList arrayList = new ArrayList(1);
            boolean z3 = false;
            for (C5584 c5584 : c16820M38130.f49796.m50189()) {
                String strM11398 = C5275.m11398(c5584.getValue(), str, c13929, z, z2, c23380, arrayList);
                if (strM11398 != null) {
                    c5584.m12357(strM11398);
                    z3 = true;
                }
            }
            if (z3) {
                return c16820M38130.m38145();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static byte[] m37017(InputStream inputStream, final int i, final int i2, C23380 c23380) {
        try {
            return m37015(C16820.m38130(inputStream), c23380, new InterfaceC18935() { // from class: l.ۧܶܽ
                @Override // p067l.InterfaceC18935
                /* JADX INFO: renamed from: ֫ */
                public final int mo8465(int i3, int i4) {
                    return ((i3 == 2 || i3 == 1) && i4 == i) ? i2 : i4;
                }
            });
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m37013(InputStream inputStream, final int i, final int i2, C23380 c23380) {
        try {
            return m37015(C16820.m38130(inputStream), c23380, new InterfaceC18935() { // from class: l.ܽܶܽ
                @Override // p067l.InterfaceC18935
                /* JADX INFO: renamed from: ֫ */
                public final int mo8465(int i3, int i4) {
                    return (i3 < 28 || i3 > 31 || i4 != i) ? i4 : i2;
                }
            });
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m37016(InputStream inputStream, final int i, final int i2, C23380 c23380) {
        try {
            return m37015(C16820.m38130(inputStream), c23380, new InterfaceC18935() { // from class: l.ᩳܶܽ
                @Override // p067l.InterfaceC18935
                /* JADX INFO: renamed from: ֫ */
                public final int mo8465(int i3, int i4) {
                    return (i3 < 16 || i3 > 31 || i4 != i) ? i4 : i2;
                }
            });
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37011(C16820 c16820, InterfaceC18935 interfaceC18935) {
        m37015(c16820, null, new C4183(interfaceC18935));
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m37015(C16820 c16820, C23380 c23380, InterfaceC18935 interfaceC18935) {
        try {
            XmlResourceParserC12128 xmlResourceParserC12128M38154 = c16820.m38154();
            int i = 0;
            while (true) {
                int next = xmlResourceParserC12128M38154.next();
                if (next == 1) {
                    break;
                }
                if (next == 2) {
                    int attributeCount = xmlResourceParserC12128M38154.getAttributeCount();
                    for (int i2 = 0; i2 != attributeCount; i2++) {
                        int iM28045 = xmlResourceParserC12128M38154.m28045(i2);
                        int iM28042 = xmlResourceParserC12128M38154.m28042(i2);
                        int iMo8465 = interfaceC18935.mo8465(iM28045, iM28042);
                        if (iMo8465 != iM28042) {
                            C17548.m39930((((i2 * 5) + 4) * 4) + c16820.m38153() + xmlResourceParserC12128M38154.f33903, iMo8465, c16820.m38149());
                            i++;
                            break;
                        }
                    }
                }
            }
            xmlResourceParserC12128M38154.close();
            if (i <= 0) {
                return null;
            }
            if (c23380 != null) {
                c23380.m52023(i);
            }
            return c16820.m38149();
        } catch (Exception unused) {
            return null;
        }
    }
}
