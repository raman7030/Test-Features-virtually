package l;

import java.io.IOException;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۚ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5XS */
/* JADX INFO: loaded from: classes2.dex */
public final class C5584 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m15861(C13889 c13889, long j) {
        C4160 c4160 = c13889.f41404;
        if (c4160 != null) {
            for (C6339 c6339 : c4160.f13573) {
                switch (C19696.f63626[c6339.mo2742().ordinal()]) {
                    case 1:
                        if (((C2791) c6339).mo6990() == j) {
                            return true;
                        }
                        break;
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        if (((InterfaceC18271) c6339).mo6990() == j) {
                            return true;
                        }
                        break;
                        break;
                    case 6:
                        if (((C10552) c6339).mo6990() == j) {
                            return true;
                        }
                        break;
                        break;
                    case 7:
                        if (((C2106) c6339).mo6990() == j) {
                            return true;
                        }
                        break;
                        break;
                    case 8:
                        Iterator itM33712 = ((C14099) c6339).m33712();
                        while (itM33712.hasNext()) {
                            if (j == ((C23272) itM33712.next()).f74748) {
                                return true;
                            }
                        }
                        break;
                    case 9:
                        Iterator itM35169 = ((C14784) c6339).m35169();
                        while (itM35169.hasNext()) {
                            C17607 c17607 = (C17607) itM35169.next();
                            int i = (c17607.f53796 + c17607.f53797) - 1;
                            long j2 = 0;
                            int i2 = 0;
                            while (i >= c17607.f53796) {
                                j2 = (j2 << (i2 * 8)) | ((long) (c17607.f53795[i] & 255));
                                i--;
                                i2++;
                            }
                            if (j2 == j) {
                                return true;
                            }
                        }
                        break;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m15862(C13889 c13889, String str) {
        if (c13889.f41402.f70681.m28273().toLowerCase().contains(str)) {
            return true;
        }
        C4160 c4160 = c13889.f41404;
        if (c4160 != null) {
            for (AbstractC2043 abstractC2043 : c4160.f13573) {
                switch (C19696.f63626[abstractC2043.mo2742().ordinal()]) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        EnumC6982 enumC6982 = abstractC2043.f6840.f77584;
                        if (enumC6982 == EnumC6982.string) {
                            if (((C11467) ((AbstractC16859) abstractC2043).m39631()).m28273().toLowerCase().contains(str)) {
                                return true;
                            }
                        } else if (enumC6982 == EnumC6982.method) {
                            C22050 c22050 = (C22050) ((AbstractC16859) abstractC2043).m39631();
                            if (c22050.f70681.m28273().toLowerCase().contains(str) || c22050.f70678.m50835().toLowerCase().contains(str) || c22050.f70680.m31312().toLowerCase().contains(str)) {
                                return true;
                            }
                        } else if (enumC6982 != EnumC6982.field) {
                            continue;
                        } else {
                            C18522 c18522 = (C18522) ((AbstractC16859) abstractC2043).m39631();
                            if (c18522.f57398.m28273().toLowerCase().contains(str) || c18522.f57394.m50835().toLowerCase().contains(str) || c18522.f57397.m50835().toLowerCase().contains(str)) {
                                return true;
                            }
                        }
                        break;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m15863(C13889 c13889, Pattern pattern) {
        C12639 c12639 = new C12639(c13889.f41404);
        StringBuilder sb = new StringBuilder(4096);
        try {
            c12639.m30910(new C4849(sb));
            return pattern.matcher(sb.toString()).find();
        } catch (IOException unused) {
            return false;
        }
    }
}
