package p067l;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.KeyAgreement;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

/* JADX INFO: renamed from: l.۫ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7XJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14252 implements InterfaceC5952 {

    /* JADX INFO: renamed from: ֫ */
    public BigInteger f40583;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f40584;

    /* JADX INFO: renamed from: ܳ */
    public KeyPairGenerator f40585;

    /* JADX INFO: renamed from: ܽ */
    public BigInteger f40586;

    /* JADX INFO: renamed from: ܿ */
    public KeyAgreement f40587;

    /* JADX INFO: renamed from: ᩳ */
    public BigInteger f40588;

    /* JADX INFO: renamed from: ᩻ */
    public BigInteger f40589;

    @Override // p067l.InterfaceC5952
    public final void init() {
        this.f40585 = KeyPairGenerator.getInstance("DH");
        this.f40587 = KeyAgreement.getInstance("DH");
    }

    @Override // p067l.InterfaceC5952
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo13362() throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (this.f40583 == null) {
            this.f40585.initialize(new DHParameterSpec(this.f40589, this.f40588));
            KeyPair keyPairGenerateKeyPair = this.f40585.generateKeyPair();
            this.f40587.init(keyPairGenerateKeyPair.getPrivate());
            BigInteger y = ((DHPublicKey) keyPairGenerateKeyPair.getPublic()).getY();
            this.f40583 = y;
            this.f40584 = y.toByteArray();
        }
        return this.f40584;
    }

    @Override // p067l.InterfaceC5952
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo13364() throws InvalidKeySpecException, InvalidKeyException {
        this.f40587.doPhase(KeyFactory.getInstance("DH").generatePublic(new DHPublicKeySpec(this.f40586, this.f40589, this.f40588)), true);
        return this.f40587.generateSecret();
    }

    @Override // p067l.InterfaceC5952
    /* JADX INFO: renamed from: ܽ */
    public final void mo13365(byte[] bArr) {
        this.f40589 = new BigInteger(1, bArr);
    }

    @Override // p067l.InterfaceC5952
    /* JADX INFO: renamed from: ֫ */
    public final void mo13361(byte[] bArr) {
        this.f40588 = new BigInteger(1, bArr);
    }

    @Override // p067l.InterfaceC5952
    /* JADX INFO: renamed from: ۧ */
    public final void mo13363(byte[] bArr) {
        this.f40586 = new BigInteger(1, bArr);
    }
}
