package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.֫ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5S4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1724 implements InterfaceC0345 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5772(int i) {
        return m5773(i, 30257, 1);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m5774(int i) {
        return m5773(i, 20703, 2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m5775(int i) {
        return m5773(i, 204287, 3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5773(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(80);
        int i4 = (~i2) & i;
        int i5 = i & i2;
        if ((i5 & 1) != 0) {
            sb.append("|public");
        }
        if ((i5 & 2) != 0) {
            sb.append("|private");
        }
        if ((i5 & 4) != 0) {
            sb.append("|protected");
        }
        if ((i5 & 8) != 0) {
            sb.append("|static");
        }
        if ((i5 & 16) != 0) {
            sb.append("|final");
        }
        if ((i5 & 32) != 0) {
            if (i3 == 1) {
                sb.append("|super");
            } else {
                sb.append("|synchronized");
            }
        }
        if ((i5 & 64) != 0) {
            if (i3 == 3) {
                sb.append("|bridge");
            } else {
                sb.append("|volatile");
            }
        }
        if ((i5 & 128) != 0) {
            if (i3 == 3) {
                sb.append("|varargs");
            } else {
                sb.append("|transient");
            }
        }
        if ((i5 & 256) != 0) {
            sb.append("|native");
        }
        if ((i5 & 512) != 0) {
            sb.append("|interface");
        }
        if ((i5 & 1024) != 0) {
            sb.append("|abstract");
        }
        if ((i5 & 2048) != 0) {
            sb.append("|strictfp");
        }
        if ((i5 & 4096) != 0) {
            sb.append("|synthetic");
        }
        if ((i5 & 8192) != 0) {
            sb.append("|annotation");
        }
        if ((i5 & 16384) != 0) {
            sb.append("|enum");
        }
        if ((65536 & i5) != 0) {
            sb.append("|constructor");
        }
        if ((i5 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            sb.append("|declared_synchronized");
        }
        if (i4 != 0 || sb.length() == 0) {
            sb.append('|');
            sb.append(C14712.m35006(i4));
        }
        return sb.substring(1);
    }
}
