package p067l;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۤ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11843 {

    /* JADX INFO: renamed from: ܽ */
    public static final InterfaceC4410 f33040 = C13128.m30022(C11843.class);

    /* JADX INFO: renamed from: ۧ */
    public static final Charset f33039 = Charset.forName("UTF-16LE");

    /* JADX INFO: renamed from: ֫ */
    public static final Charset f33038 = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m27144(String str) {
        return str == null ? new byte[0] : str.getBytes(f33038);
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m27147(String str) {
        return str == null ? new byte[0] : str.getBytes(f33039);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m27145(String str, InterfaceC3341 interfaceC3341) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes(((C15410) interfaceC3341).m35110());
        } catch (UnsupportedEncodingException e) {
            throw new C14740("Unsupported OEM encoding " + ((C15410) interfaceC3341).m35110(), e);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m27148(int i, int i2, byte[] bArr) {
        return new String(bArr, i, i2, f33039);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m27146(int i, int i2, byte[] bArr) {
        int i3 = 0;
        do {
            int i4 = i + i3;
            if (bArr[i4] == 0 && bArr[i4 + 1] == 0) {
                return i3;
            }
            i3 += 2;
        } while (i3 <= i2);
        InterfaceC4410 interfaceC4410 = f33040;
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9199("Failed to find string termination with max length " + i2);
            interfaceC4410.mo9183(C13854.m31530(bArr, i, i3));
        }
        throw new C14740("zero termination not found");
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m27143(byte[] bArr, int i, int i2, InterfaceC3341 interfaceC3341) {
        try {
            return new String(bArr, i, i2, ((C15410) interfaceC3341).m35110());
        } catch (UnsupportedEncodingException e) {
            throw new C14740("Unsupported OEM encoding " + ((C15410) interfaceC3341).m35110(), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m27142(int i, int i2, byte[] bArr) {
        int i3 = 0;
        while (bArr[i + i3] != 0) {
            i3++;
            if (i3 > i2) {
                throw new C14740("zero termination not found");
            }
        }
        return i3;
    }
}
