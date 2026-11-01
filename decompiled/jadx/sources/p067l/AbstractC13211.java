package p067l;

import com.alipay.sdk.p010m.p041p.C0187d;
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
public abstract class AbstractC13211 implements InterfaceC8693 {

    /* JADX INFO: renamed from: ֫ */
    public KeyFactory f37104;

    /* JADX INFO: renamed from: ۧ */
    public Signature f37105;

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo7616();

    @Override // p067l.InterfaceC19422
    public void init() {
        String str;
        String strMo7616 = mo7616();
        if (strMo7616.equals("rsa-sha2-256") || strMo7616.equals("ssh-rsa-sha256@ssh.com")) {
            str = "SHA256withRSA";
        } else if (strMo7616.equals("rsa-sha2-512") || strMo7616.equals("ssh-rsa-sha512@ssh.com")) {
            str = "SHA512withRSA";
        } else if (strMo7616.equals("ssh-rsa-sha384@ssh.com")) {
            str = "SHA384withRSA";
        } else {
            str = strMo7616.equals("ssh-rsa-sha224@ssh.com") ? "SHA224withRSA" : "SHA1withRSA";
        }
        this.f37105 = Signature.getInstance(str);
        this.f37104 = KeyFactory.getInstance(C0187d.f883a);
    }

    @Override // p067l.InterfaceC8693
    /* JADX INFO: renamed from: ֫ */
    public void mo20129(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, InvalidKeyException {
        this.f37105.initVerify(this.f37104.generatePublic(new RSAPublicKeySpec(new BigInteger(bArr2), new BigInteger(bArr))));
    }

    @Override // p067l.InterfaceC8693
    /* JADX INFO: renamed from: ۧ */
    public void mo20130(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, InvalidKeyException {
        this.f37105.initSign(this.f37104.generatePrivate(new RSAPrivateKeySpec(new BigInteger(bArr2), new BigInteger(bArr))));
    }

    @Override // p067l.InterfaceC19422
    public void update(byte[] bArr) throws SignatureException {
        this.f37105.update(bArr);
    }

    @Override // p067l.InterfaceC19422
    public boolean verify(byte[] bArr) {
        C17823 c17823 = new C17823(bArr);
        String str = new String(c17823.m40471(), StandardCharsets.UTF_8);
        if (str.equals(OpenSSHPublicKeyUtil.RSA) || str.equals("rsa-sha2-256") || str.equals("rsa-sha2-512") || str.equals("ssh-rsa-sha224@ssh.com") || str.equals("ssh-rsa-sha256@ssh.com") || str.equals("ssh-rsa-sha384@ssh.com") || str.equals("ssh-rsa-sha512@ssh.com")) {
            if (!str.equals(mo7616())) {
                return false;
            }
            int iM40464 = c17823.m40464();
            byte[] bArr2 = new byte[iM40464];
            System.arraycopy(bArr, c17823.m40472(), bArr2, 0, iM40464);
            bArr = bArr2;
        }
        return this.f37105.verify(bArr);
    }
}
