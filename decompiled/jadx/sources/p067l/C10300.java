package p067l;

import java.math.BigInteger;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۠ᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB8H */
/* JADX INFO: loaded from: classes3.dex */
public final class C10300 {
    /* JADX INFO: renamed from: ֫ */
    public static Object m23913(EnumC4245 enumC4245, C18997 c18997, Class cls) throws C23711 {
        if (ByteBuffer.class.equals(cls)) {
            return c18997.m43139();
        }
        if (byte[].class.equals(cls)) {
            ByteBuffer byteBufferM43139 = c18997.m43139();
            if (!byteBufferM43139.hasRemaining()) {
                return C7747.f20313;
            }
            byte[] bArr = new byte[byteBufferM43139.remaining()];
            byteBufferM43139.get(bArr);
            return bArr;
        }
        if (C24381.class.equals(cls)) {
            return new C24381(c18997.m43138());
        }
        ByteBuffer byteBufferM431310 = c18997.m43139();
        int i = C2923.f5082[enumC4245.ordinal()];
        if (i == 1) {
            InterfaceC23041 interfaceC23041 = (InterfaceC23041) C19668.m44678(cls);
            if (interfaceC23041 != null && interfaceC23041.type() == EnumC4245.CHOICE) {
                return C17004.m38606(c18997, cls);
            }
        } else if (i != 2) {
            switch (i) {
                case 6:
                    if (Integer.TYPE.equals(cls) || Integer.class.equals(cls)) {
                        return Integer.valueOf(C17004.m38599(byteBufferM431310));
                    }
                    if (Long.TYPE.equals(cls) || Long.class.equals(cls)) {
                        return Long.valueOf(C17004.m38603(byteBufferM431310));
                    }
                    if (BigInteger.class.equals(cls)) {
                        return C17004.m38601(byteBufferM431310);
                    }
                    break;
                case 7:
                    if (String.class.equals(cls)) {
                        return C17004.m38608(byteBufferM431310);
                    }
                    break;
                case 8:
                case 9:
                    if (String.class.equals(cls)) {
                        byte[] bArr2 = new byte[byteBufferM431310.remaining()];
                        byteBufferM431310.get(bArr2);
                        return new String(bArr2);
                    }
                    break;
                case 10:
                    if (Boolean.TYPE.equals(cls)) {
                        if (byteBufferM431310.remaining() != 1) {
                            throw new C23711("Incorrect encoded size of boolean value: " + byteBufferM431310.remaining());
                        }
                        return new Boolean(byteBufferM431310.get() != 0);
                    }
                    break;
            }
        } else {
            InterfaceC23041 interfaceC23042 = (InterfaceC23041) C19668.m44678(cls);
            if (interfaceC23042 != null && interfaceC23042.type() == EnumC4245.SEQUENCE) {
                return C17004.m38600(c18997, cls);
            }
        }
        throw new C23711("Unsupported conversion: ASN.1 " + enumC4245 + " to " + cls.getName());
    }
}
