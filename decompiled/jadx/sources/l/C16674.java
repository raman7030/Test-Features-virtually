package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܽܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9EH */
/* JADX INFO: loaded from: classes4.dex */
public final class C16674 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Charset f51186 = C8208.f25225;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m39201(C2215 c2215, byte[] bArr, byte[]... bArr2) {
        try {
            c2215.getClass();
            InterfaceC5202 interfaceC5202M7390 = C2215.m7390("HMACT64");
            interfaceC5202M7390.init(bArr);
            for (byte[] bArr3 : bArr2) {
                interfaceC5202M7390.update(bArr3);
            }
            return interfaceC5202M7390.mo14975();
        } catch (C8024 e) {
            throw new C4952(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m39202(C2215 c2215, byte[]... bArr) {
        try {
            c2215.getClass();
            C15619 c15619M7389 = C2215.m7389("MD5");
            for (byte[] bArr2 : bArr) {
                c15619M7389.m36816(bArr2);
            }
            return c15619M7389.m36818();
        } catch (C8024 e) {
            throw new C4952(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m39200(C2215 c2215, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr2.length];
        try {
            c2215.getClass();
            InterfaceC19314 interfaceC19314M32835 = C13667.m32835();
            interfaceC19314M32835.mo28433(EnumC18608.ENCRYPT, bArr);
            interfaceC19314M32835.doFinal(bArr3, interfaceC19314M32835.mo28432(bArr2.length, bArr2, bArr3));
            return bArr3;
        } catch (C8024 e) {
            throw new C4952(e);
        }
    }
}
