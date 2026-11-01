package p067l;

import com.alipay.sdk.p010m.p014b0.C0087a;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.᩸ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7XL */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC22970 implements InterfaceC24727 {

    /* JADX INFO: renamed from: ֫ */
    public Cipher f72239;

    /* JADX INFO: renamed from: ۧ */
    public long f72240;

    /* JADX INFO: renamed from: ܽ */
    public ByteBuffer f72241;

    /* JADX INFO: renamed from: ܿ */
    public int f72242;

    /* JADX INFO: renamed from: ᩳ */
    public SecretKeySpec f72243;

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4569(int i) {
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean mo4576() {
        return false;
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public void mo4571(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr2.length > 12) {
            byte[] bArr3 = new byte[12];
            System.arraycopy(bArr2, 0, bArr3, 0, 12);
            bArr2 = bArr3;
        }
        int blockSize = getBlockSize();
        if (bArr.length > blockSize) {
            byte[] bArr4 = new byte[blockSize];
            System.arraycopy(bArr, 0, bArr4, 0, blockSize);
            bArr = bArr4;
        }
        this.f72242 = i == 0 ? 1 : 2;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
        this.f72241 = byteBufferWrap;
        this.f72240 = byteBufferWrap.getLong(4);
        try {
            this.f72243 = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance(C0087a.f317f);
            this.f72239 = cipher;
            cipher.init(this.f72242, this.f72243, new GCMParameterSpec(128, bArr2));
        } catch (Exception e) {
            this.f72239 = null;
            this.f72243 = null;
            this.f72241 = null;
            throw e;
        }
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public void mo4570(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        this.f72239.update(bArr, i, i2, bArr2, i3);
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ֫ */
    public void mo4572(byte[] bArr) {
        this.f72239.updateAAD(bArr, 0, 4);
    }

    @Override // p067l.InterfaceC24727
    /* JADX INFO: renamed from: ۧ */
    public void mo4575(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, ShortBufferException, InvalidAlgorithmParameterException {
        this.f72239.doFinal(bArr, i, i2, bArr2, i3);
        long j = this.f72241.getLong(4) + 1;
        if (j == this.f72240) {
            throw new IllegalStateException("GCM IV would be reused");
        }
        this.f72241.putLong(4, j);
        this.f72239.init(this.f72242, this.f72243, new GCMParameterSpec(128, this.f72241.array()));
    }
}
