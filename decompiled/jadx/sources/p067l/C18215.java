package p067l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܽܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9EH */
/* JADX INFO: loaded from: classes4.dex */
public final class C18215 {

    /* JADX INFO: renamed from: ֫ */
    public static final Charset f54371 = C10169.f28135;

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m41436(C4473 c4473, byte[] bArr, byte[]... bArr2) {
        try {
            c4473.getClass();
            InterfaceC7312 interfaceC7312M9473 = C4473.m9473("HMACT64");
            interfaceC7312M9473.init(bArr);
            for (byte[] bArr3 : bArr2) {
                interfaceC7312M9473.update(bArr3);
            }
            return interfaceC7312M9473.mo16885();
        } catch (C9994 e) {
            throw new C7075(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m41437(C4473 c4473, byte[]... bArr) {
        try {
            c4473.getClass();
            C17212 c17212M9472 = C4473.m9472("MD5");
            for (byte[] bArr2 : bArr) {
                c17212M9472.m38982(bArr2);
            }
            return c17212M9472.m38984();
        } catch (C9994 e) {
            throw new C7075(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m41435(C4473 c4473, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr2.length];
        try {
            c4473.getClass();
            InterfaceC20724 interfaceC20724M34950 = C15357.m34950();
            interfaceC20724M34950.mo30479(EnumC20053.ENCRYPT, bArr);
            interfaceC20724M34950.doFinal(bArr3, interfaceC20724M34950.mo30478(bArr2.length, bArr2, bArr3));
            return bArr3;
        } catch (C9994 e) {
            throw new C7075(e);
        }
    }
}
