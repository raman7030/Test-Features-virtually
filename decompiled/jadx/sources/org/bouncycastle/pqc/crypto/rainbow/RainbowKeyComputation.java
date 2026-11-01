package org.bouncycastle.pqc.crypto.rainbow;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class RainbowKeyComputation {

    /* JADX INFO: renamed from: cf */
    public ComputeInField f81697cf;
    public short[][][] l1_F1;
    public short[][][] l1_F2;
    public short[][][] l1_Q1;
    public short[][][] l1_Q2;
    public short[][][] l1_Q3;
    public short[][][] l1_Q5;
    public short[][][] l1_Q6;
    public short[][][] l1_Q9;
    public short[][][] l2_F1;
    public short[][][] l2_F2;
    public short[][][] l2_F3;
    public short[][][] l2_F5;
    public short[][][] l2_F6;
    public short[][][] l2_Q1;
    public short[][][] l2_Q2;
    public short[][][] l2_Q3;
    public short[][][] l2_Q5;
    public short[][][] l2_Q6;
    public short[][][] l2_Q9;

    /* JADX INFO: renamed from: o1 */
    public int f81698o1;

    /* JADX INFO: renamed from: o2 */
    public int f81699o2;
    public byte[] pk_seed;
    public RainbowParameters rainbowParams;
    public SecureRandom random;

    /* JADX INFO: renamed from: s1 */
    public short[][] f81700s1;
    public byte[] sk_seed;

    /* JADX INFO: renamed from: t1 */
    public short[][] f81701t1;

    /* JADX INFO: renamed from: t2 */
    public short[][] f81702t2;

    /* JADX INFO: renamed from: t3 */
    public short[][] f81703t3;

    /* JADX INFO: renamed from: t4 */
    public short[][] f81704t4;

    /* JADX INFO: renamed from: v1 */
    public int f81705v1;
    public Version version;

    public RainbowKeyComputation(RainbowParameters rainbowParameters, SecureRandom secureRandom) {
        this.f81697cf = new ComputeInField();
        this.rainbowParams = rainbowParameters;
        this.random = secureRandom;
        this.version = rainbowParameters.getVersion();
        this.f81705v1 = this.rainbowParams.getV1();
        this.f81698o1 = this.rainbowParams.getO1();
        this.f81699o2 = this.rainbowParams.getO2();
    }

    public RainbowKeyComputation(RainbowParameters rainbowParameters, byte[] bArr, byte[] bArr2) {
        this.f81697cf = new ComputeInField();
        this.rainbowParams = rainbowParameters;
        this.random = null;
        this.version = rainbowParameters.getVersion();
        this.pk_seed = bArr;
        this.sk_seed = bArr2;
        this.f81705v1 = this.rainbowParams.getV1();
        this.f81698o1 = this.rainbowParams.getO1();
        this.f81699o2 = this.rainbowParams.getO2();
    }

    private void calculate_F_from_Q() {
        this.l1_F1 = RainbowUtil.cloneArray(this.l1_Q1);
        this.l1_F2 = new short[this.f81698o1][][];
        for (int i = 0; i < this.f81698o1; i++) {
            this.l1_F2[i] = this.f81697cf.addMatrixTranspose(this.l1_Q1[i]);
            short[][][] sArr = this.l1_F2;
            sArr[i] = this.f81697cf.multiplyMatrix(sArr[i], this.f81701t1);
            short[][][] sArr2 = this.l1_F2;
            sArr2[i] = this.f81697cf.addMatrix(sArr2[i], this.l1_Q2[i]);
        }
        int i2 = this.f81699o2;
        this.l2_F2 = new short[i2][][];
        this.l2_F3 = new short[i2][][];
        this.l2_F5 = new short[i2][][];
        this.l2_F6 = new short[i2][][];
        this.l2_F1 = RainbowUtil.cloneArray(this.l2_Q1);
        for (int i3 = 0; i3 < this.f81699o2; i3++) {
            short[][] sArrAddMatrixTranspose = this.f81697cf.addMatrixTranspose(this.l2_Q1[i3]);
            this.l2_F2[i3] = this.f81697cf.multiplyMatrix(sArrAddMatrixTranspose, this.f81701t1);
            short[][][] sArr3 = this.l2_F2;
            sArr3[i3] = this.f81697cf.addMatrix(sArr3[i3], this.l2_Q2[i3]);
            this.l2_F3[i3] = this.f81697cf.multiplyMatrix(sArrAddMatrixTranspose, this.f81704t4);
            short[][] sArrMultiplyMatrix = this.f81697cf.multiplyMatrix(this.l2_Q2[i3], this.f81703t3);
            short[][][] sArr4 = this.l2_F3;
            sArr4[i3] = this.f81697cf.addMatrix(sArr4[i3], sArrMultiplyMatrix);
            short[][][] sArr5 = this.l2_F3;
            sArr5[i3] = this.f81697cf.addMatrix(sArr5[i3], this.l2_Q3[i3]);
            short[][] sArrAddMatrix = this.f81697cf.addMatrix(this.f81697cf.multiplyMatrix(this.l2_Q1[i3], this.f81701t1), this.l2_Q2[i3]);
            short[][] sArrTranspose = this.f81697cf.transpose(this.f81701t1);
            this.l2_F5[i3] = this.f81697cf.multiplyMatrix(sArrTranspose, sArrAddMatrix);
            short[][][] sArr6 = this.l2_F5;
            sArr6[i3] = this.f81697cf.addMatrix(sArr6[i3], this.l2_Q5[i3]);
            short[][][] sArr7 = this.l2_F5;
            sArr7[i3] = this.f81697cf.to_UT(sArr7[i3]);
            this.l2_F6[i3] = this.f81697cf.multiplyMatrix(sArrTranspose, this.l2_F3[i3]);
            ComputeInField computeInField = this.f81697cf;
            short[][] sArrMultiplyMatrix2 = computeInField.multiplyMatrix(computeInField.transpose(this.l2_Q2[i3]), this.f81704t4);
            short[][][] sArr8 = this.l2_F6;
            sArr8[i3] = this.f81697cf.addMatrix(sArr8[i3], sArrMultiplyMatrix2);
            short[][] sArrMultiplyMatrix3 = this.f81697cf.multiplyMatrix(this.f81697cf.addMatrixTranspose(this.l2_Q5[i3]), this.f81703t3);
            short[][][] sArr9 = this.l2_F6;
            sArr9[i3] = this.f81697cf.addMatrix(sArr9[i3], sArrMultiplyMatrix3);
            short[][][] sArr10 = this.l2_F6;
            sArr10[i3] = this.f81697cf.addMatrix(sArr10[i3], this.l2_Q6[i3]);
        }
    }

    private void calculate_Q_from_F() {
        short[][] sArrTranspose = this.f81697cf.transpose(this.f81701t1);
        short[][] sArrTranspose2 = this.f81697cf.transpose(this.f81702t2);
        this.l1_Q1 = RainbowUtil.cloneArray(this.l1_F1);
        this.l1_Q2 = new short[this.f81698o1][][];
        for (int i = 0; i < this.f81698o1; i++) {
            this.l1_Q2[i] = this.f81697cf.addMatrixTranspose(this.l1_F1[i]);
            short[][][] sArr = this.l1_Q2;
            sArr[i] = this.f81697cf.multiplyMatrix(sArr[i], this.f81701t1);
            short[][][] sArr2 = this.l1_Q2;
            sArr2[i] = this.f81697cf.addMatrix(sArr2[i], this.l1_F2[i]);
        }
        calculate_l1_Q3569(sArrTranspose, sArrTranspose2);
        int i2 = this.f81699o2;
        this.l2_Q2 = new short[i2][][];
        this.l2_Q3 = new short[i2][][];
        this.l2_Q5 = new short[i2][][];
        this.l2_Q6 = new short[i2][][];
        this.l2_Q1 = RainbowUtil.cloneArray(this.l2_F1);
        for (int i3 = 0; i3 < this.f81699o2; i3++) {
            short[][] sArrAddMatrixTranspose = this.f81697cf.addMatrixTranspose(this.l2_F1[i3]);
            this.l2_Q2[i3] = this.f81697cf.multiplyMatrix(sArrAddMatrixTranspose, this.f81701t1);
            short[][][] sArr3 = this.l2_Q2;
            sArr3[i3] = this.f81697cf.addMatrix(sArr3[i3], this.l2_F2[i3]);
            this.l2_Q3[i3] = this.f81697cf.multiplyMatrix(sArrAddMatrixTranspose, this.f81702t2);
            short[][] sArrMultiplyMatrix = this.f81697cf.multiplyMatrix(this.l2_F2[i3], this.f81703t3);
            short[][][] sArr4 = this.l2_Q3;
            sArr4[i3] = this.f81697cf.addMatrix(sArr4[i3], sArrMultiplyMatrix);
            short[][][] sArr5 = this.l2_Q3;
            sArr5[i3] = this.f81697cf.addMatrix(sArr5[i3], this.l2_F3[i3]);
            this.l2_Q5[i3] = this.f81697cf.multiplyMatrix(sArrTranspose, this.f81697cf.addMatrix(this.f81697cf.multiplyMatrix(this.l2_F1[i3], this.f81701t1), this.l2_F2[i3]));
            short[][][] sArr6 = this.l2_Q5;
            sArr6[i3] = this.f81697cf.addMatrix(sArr6[i3], this.l2_F5[i3]);
            short[][][] sArr7 = this.l2_Q5;
            sArr7[i3] = this.f81697cf.to_UT(sArr7[i3]);
            this.l2_Q6[i3] = this.f81697cf.multiplyMatrix(sArrTranspose, this.l2_Q3[i3]);
            ComputeInField computeInField = this.f81697cf;
            short[][] sArrMultiplyMatrix2 = computeInField.multiplyMatrix(computeInField.transpose(this.l2_F2[i3]), this.f81702t2);
            short[][][] sArr8 = this.l2_Q6;
            sArr8[i3] = this.f81697cf.addMatrix(sArr8[i3], sArrMultiplyMatrix2);
            short[][] sArrMultiplyMatrix3 = this.f81697cf.multiplyMatrix(this.f81697cf.addMatrixTranspose(this.l2_F5[i3]), this.f81703t3);
            short[][][] sArr9 = this.l2_Q6;
            sArr9[i3] = this.f81697cf.addMatrix(sArr9[i3], sArrMultiplyMatrix3);
            short[][][] sArr10 = this.l2_Q6;
            sArr10[i3] = this.f81697cf.addMatrix(sArr10[i3], this.l2_F6[i3]);
        }
        calculate_l2_Q9(sArrTranspose2);
    }

    private void calculate_Q_from_F_cyclic() {
        short[][] sArrTranspose = this.f81697cf.transpose(this.f81701t1);
        short[][] sArrTranspose2 = this.f81697cf.transpose(this.f81702t2);
        calculate_l1_Q3569(sArrTranspose, sArrTranspose2);
        calculate_l2_Q9(sArrTranspose2);
    }

    private void calculate_l1_Q3569(short[][] sArr, short[][] sArr2) {
        int i = this.f81698o1;
        this.l1_Q3 = new short[i][][];
        this.l1_Q5 = new short[i][][];
        this.l1_Q6 = new short[i][][];
        this.l1_Q9 = new short[i][][];
        for (int i2 = 0; i2 < this.f81698o1; i2++) {
            short[][] sArrMultiplyMatrix = this.f81697cf.multiplyMatrix(this.l1_F2[i2], this.f81703t3);
            this.l1_Q3[i2] = this.f81697cf.addMatrixTranspose(this.l1_F1[i2]);
            short[][][] sArr3 = this.l1_Q3;
            sArr3[i2] = this.f81697cf.multiplyMatrix(sArr3[i2], this.f81702t2);
            short[][][] sArr4 = this.l1_Q3;
            sArr4[i2] = this.f81697cf.addMatrix(sArr4[i2], sArrMultiplyMatrix);
            this.l1_Q5[i2] = this.f81697cf.multiplyMatrix(this.l1_F1[i2], this.f81701t1);
            short[][][] sArr5 = this.l1_Q5;
            sArr5[i2] = this.f81697cf.addMatrix(sArr5[i2], this.l1_F2[i2]);
            short[][][] sArr6 = this.l1_Q5;
            sArr6[i2] = this.f81697cf.multiplyMatrix(sArr, sArr6[i2]);
            short[][][] sArr7 = this.l1_Q5;
            sArr7[i2] = this.f81697cf.to_UT(sArr7[i2]);
            ComputeInField computeInField = this.f81697cf;
            short[][] sArrMultiplyMatrix2 = computeInField.multiplyMatrix(computeInField.transpose(this.l1_F2[i2]), this.f81702t2);
            this.l1_Q6[i2] = this.f81697cf.multiplyMatrix(sArr, this.l1_Q3[i2]);
            short[][][] sArr8 = this.l1_Q6;
            sArr8[i2] = this.f81697cf.addMatrix(sArr8[i2], sArrMultiplyMatrix2);
            this.l1_Q9[i2] = this.f81697cf.addMatrix(this.f81697cf.multiplyMatrix(this.l1_F1[i2], this.f81702t2), sArrMultiplyMatrix);
            short[][][] sArr9 = this.l1_Q9;
            sArr9[i2] = this.f81697cf.multiplyMatrix(sArr2, sArr9[i2]);
            short[][][] sArr10 = this.l1_Q9;
            sArr10[i2] = this.f81697cf.to_UT(sArr10[i2]);
        }
    }

    private void calculate_l2_Q9(short[][] sArr) {
        this.l2_Q9 = new short[this.f81699o2][][];
        for (int i = 0; i < this.f81699o2; i++) {
            this.l2_Q9[i] = this.f81697cf.multiplyMatrix(this.l2_F1[i], this.f81702t2);
            short[][] sArrMultiplyMatrix = this.f81697cf.multiplyMatrix(this.l2_F2[i], this.f81703t3);
            short[][][] sArr2 = this.l2_Q9;
            sArr2[i] = this.f81697cf.addMatrix(sArr2[i], sArrMultiplyMatrix);
            short[][][] sArr3 = this.l2_Q9;
            sArr3[i] = this.f81697cf.addMatrix(sArr3[i], this.l2_F3[i]);
            short[][][] sArr4 = this.l2_Q9;
            sArr4[i] = this.f81697cf.multiplyMatrix(sArr, sArr4[i]);
            short[][] sArrAddMatrix = this.f81697cf.addMatrix(this.f81697cf.multiplyMatrix(this.l2_F5[i], this.f81703t3), this.l2_F6[i]);
            ComputeInField computeInField = this.f81697cf;
            short[][] sArrMultiplyMatrix2 = computeInField.multiplyMatrix(computeInField.transpose(this.f81703t3), sArrAddMatrix);
            short[][][] sArr5 = this.l2_Q9;
            sArr5[i] = this.f81697cf.addMatrix(sArr5[i], sArrMultiplyMatrix2);
            short[][][] sArr6 = this.l2_Q9;
            sArr6[i] = this.f81697cf.to_UT(sArr6[i]);
        }
    }

    private void calculate_t4() {
        this.f81704t4 = this.f81697cf.addMatrix(this.f81697cf.multiplyMatrix(this.f81701t1, this.f81703t3), this.f81702t2);
    }

    private void genKeyMaterial() {
        byte[] bArr = new byte[this.rainbowParams.getLen_skseed()];
        this.sk_seed = bArr;
        this.random.nextBytes(bArr);
        RainbowDRBG rainbowDRBG = new RainbowDRBG(this.sk_seed, this.rainbowParams.getHash_algo());
        generate_S_and_T(rainbowDRBG);
        int i = this.f81698o1;
        int i2 = this.f81705v1;
        this.l1_F1 = RainbowUtil.generate_random(rainbowDRBG, i, i2, i2, true);
        int i3 = this.f81698o1;
        this.l1_F2 = RainbowUtil.generate_random(rainbowDRBG, i3, this.f81705v1, i3, false);
        int i4 = this.f81699o2;
        int i5 = this.f81705v1;
        this.l2_F1 = RainbowUtil.generate_random(rainbowDRBG, i4, i5, i5, true);
        this.l2_F2 = RainbowUtil.generate_random(rainbowDRBG, this.f81699o2, this.f81705v1, this.f81698o1, false);
        int i6 = this.f81699o2;
        this.l2_F3 = RainbowUtil.generate_random(rainbowDRBG, i6, this.f81705v1, i6, false);
        int i7 = this.f81699o2;
        int i8 = this.f81698o1;
        this.l2_F5 = RainbowUtil.generate_random(rainbowDRBG, i7, i8, i8, true);
        int i9 = this.f81699o2;
        this.l2_F6 = RainbowUtil.generate_random(rainbowDRBG, i9, this.f81698o1, i9, false);
        calculate_Q_from_F();
        calculate_t4();
        this.l1_Q1 = this.f81697cf.obfuscate_l1_polys(this.f81700s1, this.l2_Q1, this.l1_Q1);
        this.l1_Q2 = this.f81697cf.obfuscate_l1_polys(this.f81700s1, this.l2_Q2, this.l1_Q2);
        this.l1_Q3 = this.f81697cf.obfuscate_l1_polys(this.f81700s1, this.l2_Q3, this.l1_Q3);
        this.l1_Q5 = this.f81697cf.obfuscate_l1_polys(this.f81700s1, this.l2_Q5, this.l1_Q5);
        this.l1_Q6 = this.f81697cf.obfuscate_l1_polys(this.f81700s1, this.l2_Q6, this.l1_Q6);
        this.l1_Q9 = this.f81697cf.obfuscate_l1_polys(this.f81700s1, this.l2_Q9, this.l1_Q9);
    }

    private void genKeyMaterial_cyclic() {
        byte[] bArr = new byte[this.rainbowParams.getLen_skseed()];
        this.sk_seed = bArr;
        this.random.nextBytes(bArr);
        byte[] bArr2 = new byte[this.rainbowParams.getLen_pkseed()];
        this.pk_seed = bArr2;
        this.random.nextBytes(bArr2);
        genPrivateKeyMaterial_cyclic();
        calculate_Q_from_F_cyclic();
        this.l1_Q3 = this.f81697cf.obfuscate_l1_polys(this.f81700s1, this.l2_Q3, this.l1_Q3);
        this.l1_Q5 = this.f81697cf.obfuscate_l1_polys(this.f81700s1, this.l2_Q5, this.l1_Q5);
        this.l1_Q6 = this.f81697cf.obfuscate_l1_polys(this.f81700s1, this.l2_Q6, this.l1_Q6);
        this.l1_Q9 = this.f81697cf.obfuscate_l1_polys(this.f81700s1, this.l2_Q9, this.l1_Q9);
    }

    private void genPrivateKeyMaterial_cyclic() {
        RainbowDRBG rainbowDRBG = new RainbowDRBG(this.sk_seed, this.rainbowParams.getHash_algo());
        RainbowDRBG rainbowDRBG2 = new RainbowDRBG(this.pk_seed, this.rainbowParams.getHash_algo());
        generate_S_and_T(rainbowDRBG);
        calculate_t4();
        generate_B1_and_B2(rainbowDRBG2);
        this.l1_Q1 = this.f81697cf.obfuscate_l1_polys(this.f81700s1, this.l2_Q1, this.l1_Q1);
        this.l1_Q2 = this.f81697cf.obfuscate_l1_polys(this.f81700s1, this.l2_Q2, this.l1_Q2);
        calculate_F_from_Q();
    }

    private void generate_B1_and_B2(SecureRandom secureRandom) {
        int i = this.f81698o1;
        int i2 = this.f81705v1;
        this.l1_Q1 = RainbowUtil.generate_random(secureRandom, i, i2, i2, true);
        int i3 = this.f81698o1;
        this.l1_Q2 = RainbowUtil.generate_random(secureRandom, i3, this.f81705v1, i3, false);
        int i4 = this.f81699o2;
        int i5 = this.f81705v1;
        this.l2_Q1 = RainbowUtil.generate_random(secureRandom, i4, i5, i5, true);
        this.l2_Q2 = RainbowUtil.generate_random(secureRandom, this.f81699o2, this.f81705v1, this.f81698o1, false);
        int i6 = this.f81699o2;
        this.l2_Q3 = RainbowUtil.generate_random(secureRandom, i6, this.f81705v1, i6, false);
        int i7 = this.f81699o2;
        int i8 = this.f81698o1;
        this.l2_Q5 = RainbowUtil.generate_random(secureRandom, i7, i8, i8, true);
        int i9 = this.f81699o2;
        this.l2_Q6 = RainbowUtil.generate_random(secureRandom, i9, this.f81698o1, i9, false);
    }

    private void generate_S_and_T(SecureRandom secureRandom) {
        this.f81700s1 = RainbowUtil.generate_random_2d(secureRandom, this.f81698o1, this.f81699o2);
        this.f81701t1 = RainbowUtil.generate_random_2d(secureRandom, this.f81705v1, this.f81698o1);
        this.f81702t2 = RainbowUtil.generate_random_2d(secureRandom, this.f81705v1, this.f81699o2);
        this.f81703t3 = RainbowUtil.generate_random_2d(secureRandom, this.f81698o1, this.f81699o2);
    }

    public AsymmetricCipherKeyPair genKeyPairCircumzenithal() {
        genKeyMaterial_cyclic();
        RainbowPublicKeyParameters rainbowPublicKeyParameters = new RainbowPublicKeyParameters(this.rainbowParams, this.pk_seed, this.l1_Q3, this.l1_Q5, this.l1_Q6, this.l1_Q9, this.l2_Q9);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) rainbowPublicKeyParameters, (AsymmetricKeyParameter) new RainbowPrivateKeyParameters(this.rainbowParams, this.sk_seed, this.f81700s1, this.f81701t1, this.f81703t3, this.f81704t4, this.l1_F1, this.l1_F2, this.l2_F1, this.l2_F2, this.l2_F3, this.l2_F5, this.l2_F6, rainbowPublicKeyParameters.getEncoded()));
    }

    public AsymmetricCipherKeyPair genKeyPairClassical() {
        genKeyMaterial();
        RainbowPublicKeyParameters rainbowPublicKeyParameters = new RainbowPublicKeyParameters(this.rainbowParams, this.l1_Q1, this.l1_Q2, this.l1_Q3, this.l1_Q5, this.l1_Q6, this.l1_Q9, this.l2_Q1, this.l2_Q2, this.l2_Q3, this.l2_Q5, this.l2_Q6, this.l2_Q9);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) rainbowPublicKeyParameters, (AsymmetricKeyParameter) new RainbowPrivateKeyParameters(this.rainbowParams, this.sk_seed, this.f81700s1, this.f81701t1, this.f81703t3, this.f81704t4, this.l1_F1, this.l1_F2, this.l2_F1, this.l2_F2, this.l2_F3, this.l2_F5, this.l2_F6, rainbowPublicKeyParameters.getEncoded()));
    }

    public AsymmetricCipherKeyPair genKeyPairCompressed() {
        genKeyMaterial_cyclic();
        RainbowPublicKeyParameters rainbowPublicKeyParameters = new RainbowPublicKeyParameters(this.rainbowParams, this.pk_seed, this.l1_Q3, this.l1_Q5, this.l1_Q6, this.l1_Q9, this.l2_Q9);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) rainbowPublicKeyParameters, (AsymmetricKeyParameter) new RainbowPrivateKeyParameters(this.rainbowParams, this.pk_seed, this.sk_seed, rainbowPublicKeyParameters.getEncoded()));
    }

    public RainbowPrivateKeyParameters generatePrivateKey() {
        this.sk_seed = Arrays.clone(this.sk_seed);
        this.pk_seed = Arrays.clone(this.pk_seed);
        genPrivateKeyMaterial_cyclic();
        return new RainbowPrivateKeyParameters(this.rainbowParams, this.sk_seed, this.f81700s1, this.f81701t1, this.f81703t3, this.f81704t4, this.l1_F1, this.l1_F2, this.l2_F1, this.l2_F2, this.l2_F3, this.l2_F5, this.l2_F6, null);
    }
}
