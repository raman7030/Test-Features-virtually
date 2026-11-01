package org.bouncycastle.pqc.crypto.frodo;

import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.KEMParameters;

/* JADX INFO: loaded from: classes2.dex */
public class FrodoParameters implements KEMParameters {
    public static final short[] cdf_table1344;
    public static final short[] cdf_table640;
    public static final short[] cdf_table976;
    public static final FrodoParameters frodokem1344aes;
    public static final FrodoParameters frodokem1344shake;
    public static final FrodoParameters frodokem640aes;
    public static final FrodoParameters frodokem640shake;
    public static final FrodoParameters frodokem976aes;
    public static final FrodoParameters frodokem976shake;

    /* JADX INFO: renamed from: B */
    public final int f81618B;

    /* JADX INFO: renamed from: D */
    public final int f81619D;
    public final int defaultKeySize;
    public final FrodoEngine engine;

    /* JADX INFO: renamed from: n */
    public final int f81620n;
    public final String name;

    static {
        short[] sArr = {4643, 13363, 20579, 25843, 29227, 31145, 32103, 32525, 32689, 32745, 32762, 32766, Short.MAX_VALUE};
        cdf_table640 = sArr;
        short[] sArr2 = {5638, 15915, 23689, 28571, 31116, 32217, 32613, 32731, 32760, 32766, Short.MAX_VALUE};
        cdf_table976 = sArr2;
        short[] sArr3 = {9142, 23462, 30338, 32361, 32725, 32765, Short.MAX_VALUE};
        cdf_table1344 = sArr3;
        frodokem640aes = new FrodoParameters("frodokem640aes", 640, 15, 2, sArr, new SHAKEDigest(128), new FrodoMatrixGenerator.Aes128MatrixGenerator(640, 32768));
        frodokem640shake = new FrodoParameters("frodokem640shake", 640, 15, 2, sArr, new SHAKEDigest(128), new FrodoMatrixGenerator.Shake128MatrixGenerator(640, 32768));
        frodokem976aes = new FrodoParameters("frodokem976aes", 976, 16, 3, sArr2, new SHAKEDigest(256), new FrodoMatrixGenerator.Aes128MatrixGenerator(976, 65536));
        frodokem976shake = new FrodoParameters("frodokem976shake", 976, 16, 3, sArr2, new SHAKEDigest(256), new FrodoMatrixGenerator.Shake128MatrixGenerator(976, 65536));
        frodokem1344aes = new FrodoParameters("frodokem1344aes", 1344, 16, 4, sArr3, new SHAKEDigest(256), new FrodoMatrixGenerator.Aes128MatrixGenerator(1344, 65536));
        frodokem1344shake = new FrodoParameters("frodokem1344shake", 1344, 16, 4, sArr3, new SHAKEDigest(256), new FrodoMatrixGenerator.Shake128MatrixGenerator(1344, 65536));
    }

    public FrodoParameters(String str, int i, int i2, int i3, short[] sArr, Xof xof, FrodoMatrixGenerator frodoMatrixGenerator) {
        this.name = str;
        this.f81620n = i;
        this.f81619D = i2;
        this.f81618B = i3;
        this.defaultKeySize = i3 * 64;
        this.engine = new FrodoEngine(i, i2, i3, sArr, xof, frodoMatrixGenerator);
    }

    public int getB() {
        return this.f81618B;
    }

    public int getD() {
        return this.f81619D;
    }

    public FrodoEngine getEngine() {
        return this.engine;
    }

    public int getN() {
        return this.f81620n;
    }

    public String getName() {
        return this.name;
    }

    public int getSessionKeySize() {
        return this.defaultKeySize;
    }
}
