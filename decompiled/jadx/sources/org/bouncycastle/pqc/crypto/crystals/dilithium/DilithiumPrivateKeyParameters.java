package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class DilithiumPrivateKeyParameters extends DilithiumKeyParameters {

    /* JADX INFO: renamed from: k */
    public final byte[] f81586k;
    public final byte[] rho;

    /* JADX INFO: renamed from: s1 */
    public final byte[] f81587s1;

    /* JADX INFO: renamed from: s2 */
    public final byte[] f81588s2;

    /* JADX INFO: renamed from: t0 */
    public final byte[] f81589t0;

    /* JADX INFO: renamed from: t1 */
    public final byte[] f81590t1;

    /* JADX INFO: renamed from: tr */
    public final byte[] f81591tr;

    public DilithiumPrivateKeyParameters(DilithiumParameters dilithiumParameters, byte[] bArr, DilithiumPublicKeyParameters dilithiumPublicKeyParameters) {
        super(true, dilithiumParameters);
        DilithiumEngine engine = dilithiumParameters.getEngine(null);
        this.rho = Arrays.copyOfRange(bArr, 0, 32);
        this.f81586k = Arrays.copyOfRange(bArr, 32, 64);
        this.f81591tr = Arrays.copyOfRange(bArr, 64, 128);
        int dilithiumL = (engine.getDilithiumL() * engine.getDilithiumPolyEtaPackedBytes()) + 128;
        this.f81587s1 = Arrays.copyOfRange(bArr, 128, dilithiumL);
        int dilithiumK = (engine.getDilithiumK() * engine.getDilithiumPolyEtaPackedBytes()) + dilithiumL;
        this.f81588s2 = Arrays.copyOfRange(bArr, dilithiumL, dilithiumK);
        this.f81589t0 = Arrays.copyOfRange(bArr, dilithiumK, (engine.getDilithiumK() * 416) + dilithiumK);
        if (dilithiumPublicKeyParameters != null) {
            this.f81590t1 = dilithiumPublicKeyParameters.getT1();
        } else {
            this.f81590t1 = null;
        }
    }

    public DilithiumPrivateKeyParameters(DilithiumParameters dilithiumParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super(true, dilithiumParameters);
        this.rho = Arrays.clone(bArr);
        this.f81586k = Arrays.clone(bArr2);
        this.f81591tr = Arrays.clone(bArr3);
        this.f81587s1 = Arrays.clone(bArr4);
        this.f81588s2 = Arrays.clone(bArr5);
        this.f81589t0 = Arrays.clone(bArr6);
        this.f81590t1 = Arrays.clone(bArr7);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(new byte[][]{this.rho, this.f81586k, this.f81591tr, this.f81587s1, this.f81588s2, this.f81589t0});
    }

    public byte[] getK() {
        return Arrays.clone(this.f81586k);
    }

    @Deprecated
    public byte[] getPrivateKey() {
        return getEncoded();
    }

    public byte[] getPublicKey() {
        return DilithiumPublicKeyParameters.getEncoded(this.rho, this.f81590t1);
    }

    public DilithiumPublicKeyParameters getPublicKeyParameters() {
        return new DilithiumPublicKeyParameters(getParameters(), this.rho, this.f81590t1);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getS1() {
        return Arrays.clone(this.f81587s1);
    }

    public byte[] getS2() {
        return Arrays.clone(this.f81588s2);
    }

    public byte[] getT0() {
        return Arrays.clone(this.f81589t0);
    }

    public byte[] getT1() {
        return Arrays.clone(this.f81590t1);
    }

    public byte[] getTr() {
        return Arrays.clone(this.f81591tr);
    }
}
