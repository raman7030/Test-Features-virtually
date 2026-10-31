package l;

import com.alipay.sdk.m.b0.a;
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
public abstract class AbstractC21677 implements InterfaceC23526 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Cipher f69534;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f69535;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f69536;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f69537;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public SecretKeySpec f69538;

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2202(int i) {
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean mo2209() {
        return false;
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ֫ */
    public void mo2204(int i, byte[] bArr, byte[] bArr2) throws Exception {
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
        this.f69537 = i == 0 ? 1 : 2;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
        this.f69536 = byteBufferWrap;
        this.f69535 = byteBufferWrap.getLong(4);
        try {
            this.f69538 = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance(a.f);
            this.f69534 = cipher;
            cipher.init(this.f69537, this.f69538, new GCMParameterSpec(128, bArr2));
        } catch (Exception e) {
            this.f69534 = null;
            this.f69538 = null;
            this.f69536 = null;
            throw e;
        }
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ֫ */
    public void mo2203(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        this.f69534.update(bArr, i, i2, bArr2, i3);
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ֫ */
    public void mo2205(byte[] bArr) {
        this.f69534.updateAAD(bArr, 0, 4);
    }

    @Override // l.InterfaceC23526
    /* JADX INFO: renamed from: ۧ */
    public void mo2208(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, ShortBufferException, InvalidAlgorithmParameterException {
        this.f69534.doFinal(bArr, i, i2, bArr2, i3);
        long j = this.f69536.getLong(4) + 1;
        if (j == this.f69535) {
            throw new IllegalStateException("GCM IV would be reused");
        }
        this.f69536.putLong(4, j);
        this.f69534.init(this.f69537, this.f69538, new GCMParameterSpec(128, this.f69536.array()));
    }
}
