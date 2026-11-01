package p067l;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ۢۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 47LW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11453 implements InterfaceC22753 {

    /* JADX INFO: renamed from: ֫ */
    public CipherInputStream f31937;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f31938;

    /* JADX INFO: renamed from: ܽ */
    public final byte[] f31939;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC22753 f31940;

    public C11453(InterfaceC22753 interfaceC22753, byte[] bArr, byte[] bArr2) {
        this.f31940 = interfaceC22753;
        this.f31939 = bArr;
        this.f31938 = bArr2;
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.f31937.getClass();
        int i3 = this.f31937.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        return this.f31940.mo4021();
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final Map mo8131() {
        return this.f31940.mo8131();
    }

    @Override // p067l.InterfaceC22753
    public final void close() {
        if (this.f31937 != null) {
            this.f31937 = null;
            this.f31940.close();
        }
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f31939, "AES"), new IvParameterSpec(this.f31938));
                C21412 c21412 = new C21412(this.f31940, c5318);
                this.f31937 = new CipherInputStream(c21412, cipher);
                c21412.m48549();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final void mo8132(InterfaceC2830 interfaceC2830) {
        interfaceC2830.getClass();
        this.f31940.mo8132(interfaceC2830);
    }
}
