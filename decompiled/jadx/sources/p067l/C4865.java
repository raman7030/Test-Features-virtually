package p067l;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۖܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7X2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4865 implements InterfaceC4019 {

    /* JADX INFO: renamed from: ֫ */
    public C17604 f11060;

    /* JADX INFO: renamed from: ۧ */
    public int f11061;

    /* JADX INFO: renamed from: ܽ */
    public byte[] f11062;

    @Override // p067l.InterfaceC4019
    /* JADX INFO: renamed from: ֫ */
    public final void mo8020(HashMap map) throws C14392 {
        throw new C14392("initWithPPKv3Header() not supported");
    }

    @Override // p067l.InterfaceC4019
    /* JADX INFO: renamed from: ֫ */
    public final void mo8021(byte[] bArr) {
        C17823 c17823 = new C17823(bArr);
        this.f11062 = c17823.m40471();
        this.f11061 = c17823.m40464();
        this.f11060 = new C17604();
    }

    @Override // p067l.InterfaceC4019
    /* JADX INFO: renamed from: ۧ */
    public final void mo8023(byte[] bArr) throws C14392 {
        throw new C14392("initWithASN1() not supported");
    }

    @Override // p067l.InterfaceC4019
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo8022(int i, byte[] bArr) {
        byte[] bArr2 = new byte[i];
        C17604 c17604 = this.f11060;
        byte[] bArr3 = this.f11062;
        int i2 = this.f11061;
        c17604.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_512);
            int i3 = (i + 31) / 32;
            byte[] bArrDigest = messageDigest.digest(bArr);
            byte[] bArr4 = new byte[64];
            byte[] bArr5 = new byte[32];
            byte[] bArr6 = new byte[32];
            int i4 = 1;
            while (i4 <= i3) {
                byte[] bArr7 = bArr2;
                messageDigest.reset();
                messageDigest.update(bArr3);
                messageDigest.update(new byte[]{(byte) ((i4 >> 24) & 255), (byte) ((i4 >> 16) & 255), (byte) ((i4 >> 8) & 255), (byte) (i4 & 255)});
                messageDigest.digest(bArr4, 0, 64);
                c17604.m40086(bArrDigest, bArr4, bArr5);
                System.arraycopy(bArr5, 0, bArr6, 0, 32);
                for (int i5 = 1; i5 < i2; i5++) {
                    messageDigest.reset();
                    messageDigest.update(bArr6);
                    messageDigest.digest(bArr4, 0, 64);
                    c17604.m40086(bArrDigest, bArr4, bArr6);
                    for (int i6 = 0; i6 < 32; i6++) {
                        bArr5[i6] = (byte) (bArr5[i6] ^ bArr6[i6]);
                    }
                }
                for (int i7 = 0; i7 < 32; i7++) {
                    int i8 = (i4 - 1) + (i7 * i3);
                    if (i8 < i) {
                        bArr7[i8] = bArr5[i7];
                    }
                }
                i4++;
                bArr2 = bArr7;
            }
            return bArr2;
        } catch (DigestException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
