package p067l;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Collection;

/* JADX INFO: renamed from: l.۫ᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B7K */
/* JADX INFO: loaded from: classes3.dex */
public final class C14323 {
    /* JADX INFO: renamed from: ֫ */
    public static byte[] m32893(Object obj, EnumC4245 enumC4245, EnumC4245 enumC4246) throws C8288 {
        byte[] bArr;
        Class<?> cls = obj.getClass();
        if (C24381.class.equals(cls)) {
            ByteBuffer byteBufferM53736 = ((C24381) obj).m53736();
            byte[] bArr2 = new byte[byteBufferM53736.remaining()];
            byteBufferM53736.get(bArr2);
            return bArr2;
        }
        if (enumC4245 == null || enumC4245 == EnumC4245.ANY) {
            return C12312.m28371(obj);
        }
        switch (C6947.f18074[enumC4245.ordinal()]) {
            case 1:
                InterfaceC23041 interfaceC23041 = (InterfaceC23041) C19668.m44678(cls);
                if (interfaceC23041 != null && interfaceC23041.type() == EnumC4245.CHOICE) {
                    return C12312.m28372(obj);
                }
                break;
            case 2:
                InterfaceC23041 interfaceC23042 = (InterfaceC23041) C19668.m44678(cls);
                if (interfaceC23042 != null && interfaceC23042.type() == EnumC4245.SEQUENCE) {
                    return C12312.m28369(obj);
                }
                break;
            case 4:
            case 5:
                if (obj instanceof ByteBuffer) {
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.slice().get(bArr);
                } else {
                    bArr = obj instanceof byte[] ? (byte[]) obj : null;
                }
                if (bArr != null) {
                    return C12312.m28368(0, false, AbstractC18326.m41760(enumC4245), bArr);
                }
                break;
            case 6:
                if (obj instanceof Integer) {
                    return C12312.m28357(((Integer) obj).intValue());
                }
                if (obj instanceof Long) {
                    return C12312.m28359(((Long) obj).longValue());
                }
                if (obj instanceof BigInteger) {
                    return C12312.m28363((BigInteger) obj);
                }
                break;
            case 7:
                if (obj instanceof Boolean) {
                    return C12312.m28366(((Boolean) obj).booleanValue());
                }
                break;
            case 8:
            case 9:
                if (obj instanceof String) {
                    return C12312.m28368(0, false, AbstractC18326.m41760(enumC4245), ((String) obj).getBytes());
                }
                break;
            case 10:
                if (obj instanceof String) {
                    return C12312.m28362((String) obj);
                }
                break;
            case 11:
                return C12312.m28370((Collection) obj, enumC4246);
            case 12:
                return C12312.m28364((Collection) obj, enumC4246);
        }
        throw new C8288("Unsupported conversion: " + cls.getName() + " to ASN.1 " + enumC4245);
    }
}
