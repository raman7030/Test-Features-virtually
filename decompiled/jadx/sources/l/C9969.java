package l;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۤ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9969 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f30081 = C11321.m27961(C9969.class);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Charset f30080 = Charset.forName("UTF-16LE");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Charset f30079 = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m25127(String str) {
        return str == null ? new byte[0] : str.getBytes(f30079);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m25130(String str) {
        return str == null ? new byte[0] : str.getBytes(f30080);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m25128(String str, InterfaceC1023 interfaceC1023) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes(((C13722) interfaceC1023).m32996());
        } catch (UnsupportedEncodingException e) {
            throw new C13017("Unsupported OEM encoding " + ((C13722) interfaceC1023).m32996(), e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m25131(int i, int i2, byte[] bArr) {
        return new String(bArr, i, i2, f30080);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m25129(int i, int i2, byte[] bArr) {
        int i3 = 0;
        do {
            int i4 = i + i3;
            if (bArr[i4] == 0 && bArr[i4 + 1] == 0) {
                return i3;
            }
            i3 += 2;
        } while (i3 <= i2);
        InterfaceC2148 interfaceC2148 = f30081;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7104("Failed to find string termination with max length " + i2);
            interfaceC2148.mo7088(C12085.m29468(bArr, i, i3));
        }
        throw new C13017("zero termination not found");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m25126(byte[] bArr, int i, int i2, InterfaceC1023 interfaceC1023) {
        try {
            return new String(bArr, i, i2, ((C13722) interfaceC1023).m32996());
        } catch (UnsupportedEncodingException e) {
            throw new C13017("Unsupported OEM encoding " + ((C13722) interfaceC1023).m32996(), e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m25125(int i, int i2, byte[] bArr) {
        int i3 = 0;
        while (bArr[i + i3] != 0) {
            i3++;
            if (i3 > i2) {
                throw new C13017("zero termination not found");
            }
        }
        return i3;
    }
}
