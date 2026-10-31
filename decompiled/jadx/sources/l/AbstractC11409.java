package l;

import com.alipay.sdk.m.p.d;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ۨۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77V1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11409 implements InterfaceC6655 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public KeyFactory f34107;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Signature f34108;

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo5387();

    @Override // l.InterfaceC17944
    public void init() {
        String str;
        String strMo5387 = mo5387();
        if (strMo5387.equals("rsa-sha2-256") || strMo5387.equals("ssh-rsa-sha256@ssh.com")) {
            str = "SHA256withRSA";
        } else if (strMo5387.equals("rsa-sha2-512") || strMo5387.equals("ssh-rsa-sha512@ssh.com")) {
            str = "SHA512withRSA";
        } else if (strMo5387.equals("ssh-rsa-sha384@ssh.com")) {
            str = "SHA384withRSA";
        } else {
            str = strMo5387.equals("ssh-rsa-sha224@ssh.com") ? "SHA224withRSA" : "SHA1withRSA";
        }
        this.f34108 = Signature.getInstance(str);
        this.f34107 = KeyFactory.getInstance(d.a);
    }

    @Override // l.InterfaceC6655
    /* JADX INFO: renamed from: ֫ */
    public void mo18181(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, InvalidKeyException {
        this.f34108.initVerify(this.f34107.generatePublic(new RSAPublicKeySpec(new BigInteger(bArr2), new BigInteger(bArr))));
    }

    @Override // l.InterfaceC6655
    /* JADX INFO: renamed from: ۧ */
    public void mo18182(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, InvalidKeyException {
        this.f34108.initSign(this.f34107.generatePrivate(new RSAPrivateKeySpec(new BigInteger(bArr2), new BigInteger(bArr))));
    }

    @Override // l.InterfaceC17944
    public void update(byte[] bArr) throws SignatureException {
        this.f34108.update(bArr);
    }

    @Override // l.InterfaceC17944
    public boolean verify(byte[] bArr) {
        C16261 c16261 = new C16261(bArr);
        String str = new String(c16261.m38257(), StandardCharsets.UTF_8);
        if (str.equals(OpenSSHPublicKeyUtil.RSA) || str.equals("rsa-sha2-256") || str.equals("rsa-sha2-512") || str.equals("ssh-rsa-sha224@ssh.com") || str.equals("ssh-rsa-sha256@ssh.com") || str.equals("ssh-rsa-sha384@ssh.com") || str.equals("ssh-rsa-sha512@ssh.com")) {
            if (!str.equals(mo5387())) {
                return false;
            }
            int iM38250 = c16261.m38250();
            byte[] bArr2 = new byte[iM38250];
            System.arraycopy(bArr, c16261.m38258(), bArr2, 0, iM38250);
            bArr = bArr2;
        }
        return this.f34108.verify(bArr);
    }
}
