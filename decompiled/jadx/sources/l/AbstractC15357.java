package l;

import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܶܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15357 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final HashMap f47068;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f47069;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f47070;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo4093();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo4094(InterfaceC0562 interfaceC0562, InterfaceC0562 interfaceC0563, InterfaceC0562 interfaceC0564, InterfaceC17066 interfaceC17066);

    /* JADX INFO: renamed from: ۧ */
    public abstract String mo4095();

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo4096();

    /* JADX INFO: renamed from: ܿ */
    public abstract AlgorithmParameterSpec mo4097();

    /* JADX INFO: renamed from: ᩳ */
    public abstract String mo4098();

    static {
        HashMap map = new HashMap();
        f47068 = map;
        map.put(257, new C6892());
        map.put(258, new C21004());
        map.put(259, new C9715());
        map.put(260, new C9009());
        map.put(513, new C16063());
        map.put(514, new C2659());
        map.put(769, new C4070());
        map.put(1057, new C18887());
        map.put(1059, new C19593());
        map.put(1061, new C0541());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15357 m36398(int i) {
        Supplier supplier = (Supplier) f47068.get(Integer.valueOf(i));
        if (supplier != null) {
            return (AbstractC15357) supplier.get();
        }
        throw new RuntimeException(C13540.m32584(new StringBuilder("Unsupported signature algorithm id: 0x"), i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15357 m36396(int i) {
        Supplier supplier = (Supplier) f47068.get(Integer.valueOf(i));
        if (supplier == null) {
            return null;
        }
        return (AbstractC15357) supplier.get();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36397(MessageDigest messageDigest, InterfaceC0562 interfaceC0562, OutputStream outputStream, InterfaceC17066 interfaceC17066) throws IOException {
        int size = (int) ((interfaceC0562.size() + 1048575) / 1048576);
        byte[] bArr = new byte[5];
        bArr[0] = -91;
        for (int i = 0; i < size; i++) {
            long jMo2312 = interfaceC0562.mo2312();
            int iMin = (int) (Math.min(jMo2312 + 1048576, interfaceC0562.size()) - jMo2312);
            C22955.m51078(iMin, 1, bArr);
            messageDigest.update(bArr);
            interfaceC0562.mo2315(messageDigest, iMin);
            outputStream.write(messageDigest.digest());
            if (interfaceC17066.mo1526()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m36395(long j) {
        return (int) ((j + 1048575) / 1048576);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36400(PublicKey publicKey, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        String strMo4098 = mo4098();
        AlgorithmParameterSpec algorithmParameterSpecMo4097 = mo4097();
        try {
            Signature signature = Signature.getInstance(strMo4098);
            signature.initVerify(publicKey);
            if (algorithmParameterSpecMo4097 != null) {
                signature.setParameter(algorithmParameterSpecMo4097);
            }
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            throw new SignatureException(C4860.m14172("Failed to verify generated ", strMo4098, " signature using public key from certificate"), e);
        } catch (InvalidKeyException e2) {
            throw new InvalidKeyException(C4860.m14172("Failed to verify generated ", strMo4098, " signature using public key from certificate"), e2);
        } catch (SignatureException e3) {
            e = e3;
            throw new SignatureException(C4860.m14172("Failed to verify generated ", strMo4098, " signature using public key from certificate"), e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36399(PrivateKey privateKey, PublicKey publicKey, byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        String strMo4098 = mo4098();
        AlgorithmParameterSpec algorithmParameterSpecMo4097 = mo4097();
        try {
            Signature signature = Signature.getInstance(strMo4098);
            signature.initSign(privateKey);
            if (algorithmParameterSpecMo4097 != null) {
                signature.setParameter(algorithmParameterSpecMo4097);
            }
            signature.update(bArr);
            byte[] bArrSign = signature.sign();
            try {
                Signature signature2 = Signature.getInstance(strMo4098);
                signature2.initVerify(publicKey);
                if (algorithmParameterSpecMo4097 != null) {
                    signature2.setParameter(algorithmParameterSpecMo4097);
                }
                signature2.update(bArr);
                if (signature2.verify(bArrSign)) {
                    this.f47070 = bArrSign;
                    return;
                }
                throw new SignatureException("Failed to verify generated " + strMo4098 + " signature using public key from certificate");
            } catch (InvalidAlgorithmParameterException e) {
                e = e;
                throw new SignatureException(C4860.m14172("Failed to verify generated ", strMo4098, " signature using public key from certificate"), e);
            } catch (InvalidKeyException e2) {
                throw new InvalidKeyException(C4860.m14172("Failed to verify generated ", strMo4098, " signature using public key from certificate"), e2);
            } catch (SignatureException e3) {
                e = e3;
                throw new SignatureException(C4860.m14172("Failed to verify generated ", strMo4098, " signature using public key from certificate"), e);
            }
        } catch (InvalidAlgorithmParameterException e4) {
            e = e4;
            throw new SignatureException(C20094.m46315("Failed to sign using ", strMo4098), e);
        } catch (InvalidKeyException e5) {
            throw new InvalidKeyException(C20094.m46315("Failed to sign using ", strMo4098), e5);
        } catch (SignatureException e6) {
            e = e6;
            throw new SignatureException(C20094.m46315("Failed to sign using ", strMo4098), e);
        }
    }
}
