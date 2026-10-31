package l;

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
public final class C9559 implements InterfaceC21449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public CipherInputStream f28990;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f28991;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] f28992;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21449 f28993;

    public C9559(InterfaceC21449 interfaceC21449, byte[] bArr, byte[] bArr2) {
        this.f28993 = interfaceC21449;
        this.f28992 = bArr;
        this.f28991 = bArr2;
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.f28990.getClass();
        int i3 = this.f28990.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        return this.f28993.mo1621();
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final Map mo5936() {
        return this.f28993.mo5936();
    }

    @Override // l.InterfaceC21449
    public final void close() {
        if (this.f28990 != null) {
            this.f28990 = null;
            this.f28993.close();
        }
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f28992, "AES"), new IvParameterSpec(this.f28991));
                C20038 c20038 = new C20038(this.f28993, c3104);
                this.f28990 = new CipherInputStream(c20038, cipher);
                c20038.m46233();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final void mo5937(InterfaceC0486 interfaceC0486) {
        interfaceC0486.getClass();
        this.f28993.mo5937(interfaceC0486);
    }
}
