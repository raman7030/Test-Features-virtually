package l;

import java.io.IOException;
import java.util.Locale;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ᩳۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 54EI */
/* JADX INFO: loaded from: classes4.dex */
public final class C18002 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C11816 f56150 = C11816.m28900("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String[] f56152 = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final String[] f56151 = new String[64];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f56149 = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f56149;
            if (i2 >= strArr.length) {
                break;
            }
            Object[] objArr = {Integer.toBinaryString(i2)};
            byte[] bArr = C20032.f64884;
            strArr[i2] = String.format(Locale.US, "%8s", objArr).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f56151;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = C9045.m23341(new StringBuilder(), strArr2[i3], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr3 = f56151;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i6]);
            sb.append('|');
            strArr3[i7 | 8] = C9045.m23341(sb, strArr3[i5], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f56151;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = f56149[i];
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42039(String str, Object... objArr) {
        byte[] bArr = C20032.f64884;
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m42040(String str, Object... objArr) throws IOException {
        byte[] bArr = C20032.f64884;
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m42038(boolean z, int i, int i2, byte b, byte b2) {
        String str;
        String strReplace;
        String[] strArr = f56152;
        if (b < strArr.length) {
            str = strArr[b];
        } else {
            Object[] objArr = {Byte.valueOf(b)};
            byte[] bArr = C20032.f64884;
            str = String.format(Locale.US, "0x%02x", objArr);
        }
        if (b2 == 0) {
            strReplace = "";
        } else {
            String[] strArr2 = f56149;
            if (b == 2 || b == 3) {
                strReplace = strArr2[b2];
            } else if (b == 4 || b == 6) {
                strReplace = b2 == 1 ? "ACK" : strArr2[b2];
            } else if (b == 7 || b == 8) {
                strReplace = strArr2[b2];
            } else {
                String[] strArr3 = f56151;
                String str2 = b2 < strArr3.length ? strArr3[b2] : strArr2[b2];
                if (b == 5 && (b2 & 4) != 0) {
                    strReplace = str2.replace("HEADERS", "PUSH_PROMISE");
                } else {
                    strReplace = (b != 0 || (b2 & UTF8.S_CS3) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED");
                }
            }
        }
        Object[] objArr2 = {z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), str, strReplace};
        byte[] bArr2 = C20032.f64884;
        return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", objArr2);
    }
}
