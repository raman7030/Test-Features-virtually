package p067l;

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
public abstract class AbstractC16964 {

    /* JADX INFO: renamed from: ܽ */
    public static final HashMap f50193;

    /* JADX INFO: renamed from: ֫ */
    public byte[] f50194;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f50195;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo6337();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo6338(InterfaceC2903 interfaceC2903, InterfaceC2903 interfaceC2904, InterfaceC2903 interfaceC2905, InterfaceC18588 interfaceC18588);

    /* JADX INFO: renamed from: ۧ */
    public abstract String mo6339();

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo6340();

    /* JADX INFO: renamed from: ܿ */
    public abstract AlgorithmParameterSpec mo6341();

    /* JADX INFO: renamed from: ᩳ */
    public abstract String mo6342();

    static {
        HashMap map = new HashMap();
        f50193 = map;
        map.put(257, new C8919());
        map.put(258, new C22331());
        map.put(259, new C11602());
        map.put(260, new C10931());
        map.put(513, new C17635());
        map.put(514, new C4896());
        map.put(769, new C6237());
        map.put(1057, new C20319());
        map.put(1059, new C20990());
        map.put(1061, new C2883());
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC16964 m38556(int i) {
        Supplier supplier = (Supplier) f50193.get(Integer.valueOf(i));
        if (supplier != null) {
            return (AbstractC16964) supplier.get();
        }
        throw new RuntimeException(C1514.m34687(new StringBuilder("Unsupported signature algorithm id: 0x"), i));
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC16964 m38554(int i) {
        Supplier supplier = (Supplier) f50193.get(Integer.valueOf(i));
        if (supplier == null) {
            return null;
        }
        return (AbstractC16964) supplier.get();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38555(MessageDigest messageDigest, InterfaceC2903 interfaceC2903, OutputStream outputStream, InterfaceC18588 interfaceC18588) throws IOException {
        int size = (int) ((interfaceC2903.size() + 1048575) / 1048576);
        byte[] bArr = new byte[5];
        bArr[0] = -91;
        for (int i = 0; i < size; i++) {
            long jMo4680 = interfaceC2903.mo4680();
            int iMin = (int) (Math.min(jMo4680 + 1048576, interfaceC2903.size()) - jMo4680);
            C24185.m53469(iMin, 1, bArr);
            messageDigest.update(bArr);
            interfaceC2903.mo4683(messageDigest, iMin);
            outputStream.write(messageDigest.digest());
            if (interfaceC18588.mo3924()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m38553(long j) {
        return (int) ((j + 1048575) / 1048576);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38558(PublicKey publicKey, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        String strMo6342 = mo6342();
        AlgorithmParameterSpec algorithmParameterSpecMo6341 = mo6341();
        try {
            Signature signature = Signature.getInstance(strMo6342);
            signature.initVerify(publicKey);
            if (algorithmParameterSpecMo6341 != null) {
                signature.setParameter(algorithmParameterSpecMo6341);
            }
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            throw new SignatureException(C6988.m16053("Failed to verify generated ", strMo6342, " signature using public key from certificate"), e);
        } catch (InvalidKeyException e2) {
            throw new InvalidKeyException(C6988.m16053("Failed to verify generated ", strMo6342, " signature using public key from certificate"), e2);
        } catch (SignatureException e3) {
            e = e3;
            throw new SignatureException(C6988.m16053("Failed to verify generated ", strMo6342, " signature using public key from certificate"), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38557(PrivateKey privateKey, PublicKey publicKey, byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        String strMo6342 = mo6342();
        AlgorithmParameterSpec algorithmParameterSpecMo6341 = mo6341();
        try {
            Signature signature = Signature.getInstance(strMo6342);
            signature.initSign(privateKey);
            if (algorithmParameterSpecMo6341 != null) {
                signature.setParameter(algorithmParameterSpecMo6341);
            }
            signature.update(bArr);
            byte[] bArrSign = signature.sign();
            try {
                Signature signature2 = Signature.getInstance(strMo6342);
                signature2.initVerify(publicKey);
                if (algorithmParameterSpecMo6341 != null) {
                    signature2.setParameter(algorithmParameterSpecMo6341);
                }
                signature2.update(bArr);
                if (signature2.verify(bArrSign)) {
                    this.f50195 = bArrSign;
                    return;
                }
                throw new SignatureException("Failed to verify generated " + strMo6342 + " signature using public key from certificate");
            } catch (InvalidAlgorithmParameterException e) {
                e = e;
                throw new SignatureException(C6988.m16053("Failed to verify generated ", strMo6342, " signature using public key from certificate"), e);
            } catch (InvalidKeyException e2) {
                throw new InvalidKeyException(C6988.m16053("Failed to verify generated ", strMo6342, " signature using public key from certificate"), e2);
            } catch (SignatureException e3) {
                e = e3;
                throw new SignatureException(C6988.m16053("Failed to verify generated ", strMo6342, " signature using public key from certificate"), e);
            }
        } catch (InvalidAlgorithmParameterException e4) {
            e = e4;
            throw new SignatureException(C21466.m48631("Failed to sign using ", strMo6342), e);
        } catch (InvalidKeyException e5) {
            throw new InvalidKeyException(C21466.m48631("Failed to sign using ", strMo6342), e5);
        } catch (SignatureException e6) {
            e = e6;
            throw new SignatureException(C21466.m48631("Failed to sign using ", strMo6342), e);
        }
    }
}
