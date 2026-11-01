package org.bouncycastle.crypto.engines;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0698cb;
import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;
import p067l.C10965;

/* JADX INFO: loaded from: classes.dex */
public class ElephantEngine extends AEADBaseEngine {

    /* JADX INFO: renamed from: ad */
    public byte[] f81020ad;
    public int adOff;
    public int adlen;
    public final byte[] buffer;
    public byte[] current_mask;
    public byte[] expanded_key;
    public final Permutation instance;
    public int nb_its;
    public byte[] next_mask;
    public byte[] npub;
    public byte[] previous_mask;
    public final byte[] previous_outputMessage;
    public final byte[] tag_buffer;

    public class Delirium implements Permutation {
        public static final int nRounds = 18;
        public final int[] KeccakRhoOffsets;
        public final byte[] KeccakRoundConstants;

        public Delirium() {
            this.KeccakRoundConstants = new byte[]{1, C0684bo.f2503h, -118, 0, -117, 1, -127, 9, -118, -120, 9, 10, -117, -117, -119, 3, 2, GCMSIVBlockCipher.MASK};
            this.KeccakRhoOffsets = new int[]{0, 1, 6, 4, 3, 4, 4, 6, 7, 4, 3, 2, 3, 1, 7, 1, 5, 7, 5, 0, 2, 2, 5, 0, 6};
        }

        private void KeccakP200Round(byte[] bArr, int i) {
            byte[] bArr2 = new byte[25];
            for (int i2 = 0; i2 < 5; i2++) {
                for (int i3 = 0; i3 < 5; i3++) {
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[index(i2, i3)]);
                }
            }
            int i4 = 0;
            while (i4 < 5) {
                int i5 = i4 + 1;
                bArr2[i4 + 5] = (byte) (bArr2[(i4 + 4) % 5] ^ ROL8(bArr2[i5 % 5], 1));
                i4 = i5;
            }
            for (int i6 = 0; i6 < 5; i6++) {
                for (int i7 = 0; i7 < 5; i7++) {
                    int iIndex = index(i6, i7);
                    bArr[iIndex] = (byte) (bArr[iIndex] ^ bArr2[i6 + 5]);
                }
            }
            for (int i8 = 0; i8 < 5; i8++) {
                for (int i9 = 0; i9 < 5; i9++) {
                    bArr2[index(i8, i9)] = ROL8(bArr[index(i8, i9)], this.KeccakRhoOffsets[index(i8, i9)]);
                }
            }
            for (int i10 = 0; i10 < 5; i10++) {
                for (int i11 = 0; i11 < 5; i11++) {
                    bArr[index(i11, ((i11 * 3) + (i10 * 2)) % 5)] = bArr2[index(i10, i11)];
                }
            }
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = 0;
                while (i13 < 5) {
                    int i14 = i13 + 1;
                    bArr2[i13] = (byte) (bArr[index(i13, i12)] ^ ((~bArr[index(i14 % 5, i12)]) & bArr[index((i13 + 2) % 5, i12)]));
                    i13 = i14;
                }
                for (int i15 = 0; i15 < 5; i15++) {
                    bArr[index(i15, i12)] = bArr2[i15];
                }
            }
            bArr[0] = (byte) (this.KeccakRoundConstants[i] ^ bArr[0]);
        }

        private byte ROL8(byte b, int i) {
            return (byte) (((b & 255) >>> (8 - i)) | (b << i));
        }

        private int index(int i, int i2) {
            return (i2 * 5) + i;
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void lfsr_step() {
            byte[] bArr = ElephantEngine.this.next_mask;
            ElephantEngine elephantEngine = ElephantEngine.this;
            int i = elephantEngine.BlockSize - 1;
            byte bRotl = elephantEngine.rotl(elephantEngine.current_mask[0]);
            ElephantEngine elephantEngine2 = ElephantEngine.this;
            bArr[i] = (byte) ((bRotl ^ elephantEngine2.rotl(elephantEngine2.current_mask[2])) ^ (ElephantEngine.this.current_mask[13] << 1));
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void permutation(byte[] bArr) {
            for (int i = 0; i < 18; i++) {
                KeccakP200Round(bArr, i);
            }
        }
    }

    public class Dumbo extends Spongent {
        public Dumbo() {
            super(DHParameters.DEFAULT_MINIMUM_LENGTH, 20, 80, (byte) 117);
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void lfsr_step() {
            byte[] bArr = ElephantEngine.this.next_mask;
            ElephantEngine elephantEngine = ElephantEngine.this;
            bArr[elephantEngine.BlockSize - 1] = (byte) (((((elephantEngine.current_mask[0] & 255) << 3) | ((ElephantEngine.this.current_mask[0] & 255) >>> 5)) ^ ((ElephantEngine.this.current_mask[3] & 255) << 7)) ^ ((ElephantEngine.this.current_mask[13] & 255) >>> 7));
        }
    }

    public enum ElephantParameters {
        elephant160,
        elephant176,
        elephant200
    }

    public class Jumbo extends Spongent {
        public Jumbo() {
            super(PicnicEngine.MAX_AUX_BYTES, 22, 90, (byte) 69);
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void lfsr_step() {
            byte[] bArr = ElephantEngine.this.next_mask;
            ElephantEngine elephantEngine = ElephantEngine.this;
            bArr[elephantEngine.BlockSize - 1] = (byte) ((elephantEngine.rotl(elephantEngine.current_mask[0]) ^ ((ElephantEngine.this.current_mask[3] & 255) << 7)) ^ ((ElephantEngine.this.current_mask[19] & 255) >>> 7));
        }
    }

    public interface Permutation {
        void lfsr_step();

        void permutation(byte[] bArr);
    }

    public abstract class Spongent implements Permutation {
        public final byte lfsrIV;
        public final int nBits;
        public final int nRounds;
        public final int nSBox;
        public final byte[] sBoxLayer = {-18, -19, -21, C0684bo.f2506k, -30, GCMSIVBlockCipher.ADD, -28, -17, -25, -22, -24, -27, -23, -20, -29, -26, -34, -35, -37, -48, -46, -47, -44, -33, -41, -38, -40, -43, -39, -36, -45, -42, -66, -67, -69, -80, -78, -79, -76, -65, -73, -70, -72, -75, -71, PSSSigner.TRAILER_IMPLICIT, -77, -74, C0698cb.f2570l, C0698cb.f2569k, 11, 0, 2, 1, 4, 15, 7, 10, 8, 5, 9, 12, 3, 6, 46, 45, 43, UTF8.S_CS3, 34, PublicSuffixDatabase.EXCEPTION_MARKER, 36, 47, 39, 42, 40, 37, 41, 44, 35, 38, 30, 29, 27, 16, 18, 17, 20, C0684bo.f2505j, 23, 26, 24, 21, 25, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, 19, 22, 78, 77, 75, 64, 66, 65, 68, 79, 71, 74, 72, 69, 73, 76, 67, 70, -2, -3, -5, -16, -14, -15, -12, -1, -9, -6, -8, -11, -7, -4, -13, -10, 126, 125, 123, KeyFactorySpi.Ed25519_type, 114, KeyFactorySpi.Ed448_type, 116, ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, 119, 122, 120, 117, 121, 124, 115, 118, -82, -83, -85, -96, -94, -95, -92, -81, -89, -86, -88, -91, -87, -84, -93, -90, -114, -115, -117, GCMSIVBlockCipher.MASK, C0684bo.f2503h, -127, -124, -113, -121, -118, -120, -123, -119, -116, -125, -122, 94, 93, 91, UTF8.S_P4A, 82, 81, 84, 95, 87, 90, 88, 85, 89, 92, 83, 86, -98, -99, -101, -112, -110, -111, -108, -97, -105, -102, -104, -107, -103, -100, -109, -106, -50, -51, -53, -64, -62, -63, -60, -49, -57, -54, -56, -59, -55, -52, -61, -58, 62, Base32Encoder.DEFAULT_PADDING, 59, UTF8.S_P3A, 50, 49, 52, 63, 55, 58, 56, 53, 57, 60, 51, 54, KeyFactorySpi.x25519_type, 109, 107, UTF8.S_P4B, 98, 97, 100, KeyFactorySpi.x448_type, 103, 106, 104, 101, 105, 108, 99, 102};

        public Spongent(int i, int i2, int i3, byte b) {
            this.nRounds = i3;
            this.nSBox = i2;
            this.lfsrIV = b;
            this.nBits = i;
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void permutation(byte[] bArr) {
            int i;
            byte b = this.lfsrIV;
            byte[] bArr2 = new byte[this.nSBox];
            for (int i2 = 0; i2 < this.nRounds; i2++) {
                bArr[0] = (byte) (bArr[0] ^ b);
                int i3 = this.nSBox - 1;
                byte b2 = bArr[i3];
                int i4 = b & UTF8.S_CS3;
                int i5 = b & 64;
                bArr[i3] = (byte) (b2 ^ ((byte) (((((((((b & 1) << 7) | ((b & 2) << 5)) | ((b & 4) << 3)) | ((b & 8) << 1)) | ((b & 16) >>> 1)) | (i4 >>> 3)) | (i5 >>> 5)) | ((b & GCMSIVBlockCipher.MASK) >>> 7))));
                b = (byte) (((b << 1) | ((i5 >>> 6) ^ (i4 >>> 5))) & 127);
                for (int i6 = 0; i6 < this.nSBox; i6++) {
                    bArr[i6] = this.sBoxLayer[bArr[i6] & 255];
                }
                Arrays.fill(bArr2, (byte) 0);
                int i7 = 0;
                while (true) {
                    i = this.nSBox;
                    if (i7 < i) {
                        for (int i8 = 0; i8 < 8; i8++) {
                            int i9 = (i7 << 3) + i8;
                            int i10 = this.nBits;
                            if (i9 != i10 - 1) {
                                i9 = ((i9 * i10) >> 2) % (i10 - 1);
                            }
                            int i11 = i9 >>> 3;
                            bArr2[i11] = (byte) (((((bArr[i7] & 255) >>> i8) & 1) << (i9 & 7)) ^ bArr2[i11]);
                        }
                        i7++;
                    }
                }
                System.arraycopy(bArr2, 0, bArr, 0, i);
            }
        }
    }

    public ElephantEngine(ElephantParameters elephantParameters) {
        this.KEY_SIZE = 16;
        this.IV_SIZE = 12;
        int iOrdinal = elephantParameters.ordinal();
        if (iOrdinal == 0) {
            this.BlockSize = 20;
            this.instance = new Dumbo();
            this.MAC_SIZE = 8;
            this.algorithmName = "Elephant 160 AEAD";
        } else if (iOrdinal == 1) {
            this.BlockSize = 22;
            this.instance = new Jumbo();
            this.algorithmName = "Elephant 176 AEAD";
            this.MAC_SIZE = 8;
        } else {
            if (iOrdinal != 2) {
                throw new IllegalArgumentException("Invalid parameter settings for Elephant");
            }
            this.BlockSize = 25;
            this.instance = new Delirium();
            this.algorithmName = "Elephant 200 AEAD";
            this.MAC_SIZE = 16;
        }
        int i = this.BlockSize;
        this.tag_buffer = new byte[i];
        this.previous_mask = new byte[i];
        this.current_mask = new byte[i];
        this.next_mask = new byte[i];
        this.buffer = new byte[i];
        this.previous_outputMessage = new byte[i];
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.Stream, AEADBaseEngine.DataOperatorType.Counter);
    }

    private void absorbAAD() {
        processAADBytes(this.buffer);
        Bytes.xorTo(this.BlockSize, this.next_mask, this.buffer);
        this.instance.permutation(this.buffer);
        Bytes.xorTo(this.BlockSize, this.next_mask, this.buffer);
        Bytes.xorTo(this.BlockSize, this.buffer, this.tag_buffer);
    }

    private void absorbCiphertext() {
        xorTo(this.BlockSize, this.previous_mask, this.next_mask, this.buffer);
        this.instance.permutation(this.buffer);
        xorTo(this.BlockSize, this.previous_mask, this.next_mask, this.buffer);
        Bytes.xorTo(this.BlockSize, this.buffer, this.tag_buffer);
    }

    private void computeCipherBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        System.arraycopy(this.npub, 0, this.buffer, 0, this.IV_SIZE);
        Arrays.fill(this.buffer, this.IV_SIZE, this.BlockSize, (byte) 0);
        xorTo(this.BlockSize, this.current_mask, this.next_mask, this.buffer);
        this.instance.permutation(this.buffer);
        xorTo(this.BlockSize, this.current_mask, this.next_mask, this.buffer);
        Bytes.xorTo(i2, bArr, i, this.buffer);
        System.arraycopy(this.buffer, 0, bArr2, i3, i2);
    }

    private void lfsr_step() {
        this.instance.lfsr_step();
        System.arraycopy(this.current_mask, 1, this.next_mask, 0, this.BlockSize - 1);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    private void processAADBytes(byte[] bArr) {
        int i;
        AEADBaseEngine.State state;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.m_state.ord;
        if (i6 != 1) {
            if (i6 == 2) {
                if (this.adOff == this.adlen) {
                    Arrays.fill(bArr, 0, this.BlockSize, (byte) 0);
                    bArr[0] = 1;
                    return;
                }
            } else if (i6 == 5) {
                System.arraycopy(this.expanded_key, 0, this.current_mask, 0, this.BlockSize);
                System.arraycopy(this.npub, 0, bArr, 0, this.IV_SIZE);
                i = this.IV_SIZE;
                state = AEADBaseEngine.State.DecAad;
            } else if (i6 == 6) {
                if (this.adOff == this.adlen) {
                    Arrays.fill(bArr, 0, this.BlockSize, (byte) 0);
                    bArr[0] = 1;
                    return;
                }
            }
            i = 0;
            i2 = this.BlockSize - i;
            int i7 = this.adlen;
            i3 = this.adOff;
            i4 = i7 - i3;
            if (i2 <= i4) {
                System.arraycopy(this.f81020ad, i3, bArr, i, i2);
                this.adOff += i2;
                return;
            }
            if (i4 > 0) {
                System.arraycopy(this.f81020ad, i3, bArr, i, i4);
                this.adOff += i4;
            }
            int i8 = i4 + i;
            Arrays.fill(bArr, i8, i + i2, (byte) 0);
            bArr[i8] = 1;
            i5 = this.m_state.ord;
            if (i5 != 2) {
                this.m_state = AEADBaseEngine.State.EncData;
            } else {
                if (i5 != 6) {
                    return;
                }
                this.m_state = AEADBaseEngine.State.DecData;
            }
        }
        System.arraycopy(this.expanded_key, 0, this.current_mask, 0, this.BlockSize);
        System.arraycopy(this.npub, 0, bArr, 0, this.IV_SIZE);
        i = this.IV_SIZE;
        state = AEADBaseEngine.State.EncAad;
        this.m_state = state;
        i2 = this.BlockSize - i;
        int i9 = this.adlen;
        i3 = this.adOff;
        i4 = i9 - i3;
        if (i2 <= i4) {
            System.arraycopy(this.f81020ad, i3, bArr, i, i2);
            this.adOff += i2;
            return;
        }
        if (i4 > 0) {
            System.arraycopy(this.f81020ad, i3, bArr, i, i4);
            this.adOff += i4;
        }
        int i10 = i4 + i;
        Arrays.fill(bArr, i10, i + i2, (byte) 0);
        bArr[i10] = 1;
        i5 = this.m_state.ord;
        if (i5 != 2) {
            this.m_state = AEADBaseEngine.State.EncData;
        } else {
            if (i5 != 6) {
                return;
            }
            this.m_state = AEADBaseEngine.State.DecData;
        }
    }

    private void processBuffer(byte[] bArr, int i, byte[] bArr2, int i2, AEADBaseEngine.State state) {
        AEADBaseEngine.State state2 = this.m_state;
        if (state2 == AEADBaseEngine.State.DecInit || state2 == AEADBaseEngine.State.EncInit) {
            processFinalAAD();
        }
        lfsr_step();
        computeCipherBlock(bArr, i, this.BlockSize, bArr2, i2);
        if (this.nb_its > 0) {
            System.arraycopy(this.previous_outputMessage, 0, this.buffer, 0, this.BlockSize);
            absorbCiphertext();
        }
        if (this.m_state != state) {
            absorbAAD();
        }
        swapMasks();
        this.nb_its++;
    }

    private void processBytes(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, int i5, int i6) {
        byte[] bArr3 = new byte[this.BlockSize];
        int i7 = i;
        int i8 = this.nb_its;
        int i9 = 0;
        while (i8 < i2) {
            int i10 = i8 == i3 + (-1) ? i5 - (this.BlockSize * i8) : this.BlockSize;
            lfsr_step();
            if (i8 < i3) {
                computeCipherBlock(bArr, i9, i10, bArr2, i7);
                if (this.forEncryption) {
                    System.arraycopy(this.buffer, 0, bArr3, 0, i10);
                } else {
                    System.arraycopy(bArr, i9, bArr3, 0, i10);
                }
                i7 += i10;
                i9 += i10;
            }
            if (i8 > 0 && i8 <= i4) {
                int i11 = this.BlockSize;
                int i12 = (i8 - 1) * i11;
                if (i12 == i5) {
                    Arrays.fill(this.buffer, 1, i11, (byte) 0);
                    this.buffer[0] = 1;
                } else {
                    int i13 = i5 - i12;
                    if (i11 <= i13) {
                        System.arraycopy(this.previous_outputMessage, 0, this.buffer, 0, i11);
                    } else if (i13 > 0) {
                        System.arraycopy(this.previous_outputMessage, 0, this.buffer, 0, i13);
                        Arrays.fill(this.buffer, i13, this.BlockSize, (byte) 0);
                        this.buffer[i13] = 1;
                    }
                }
                absorbCiphertext();
            }
            i8++;
            if (i8 < i6) {
                absorbAAD();
            }
            swapMasks();
            System.arraycopy(bArr3, 0, this.previous_outputMessage, 0, this.BlockSize);
        }
        this.nb_its = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte rotl(byte b) {
        return (byte) (((b & 255) >>> 7) | (b << 1));
    }

    private void swapMasks() {
        byte[] bArr = this.previous_mask;
        this.previous_mask = this.current_mask;
        this.current_mask = this.next_mask;
        this.next_mask = bArr;
    }

    public static void xorTo(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr3[i2] = (byte) (bArr3[i2] ^ (bArr[i2] ^ bArr2[i2]));
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public boolean checkData(boolean z) {
        switch (this.m_state.ord) {
            case 1:
            case 2:
            case 3:
                return true;
            case 4:
                throw new IllegalStateException(getAlgorithmName() + " cannot be reused for encryption");
            case 5:
            case 6:
            case 7:
                return false;
            default:
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) {
        return super.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void finishAAD(AEADBaseEngine.State state, boolean z) {
        finishAAD2(state);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getIVBytesSize() {
        return super.getIVBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getKeyBytesSize() {
        return super.getKeyBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ byte[] getMac() {
        return super.getMac();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z, CipherParameters cipherParameters) {
        super.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void init(byte[] bArr, byte[] bArr2) {
        this.npub = bArr2;
        byte[] bArr3 = new byte[this.BlockSize];
        this.expanded_key = bArr3;
        System.arraycopy(bArr, 0, bArr3, 0, this.KEY_SIZE);
        this.instance.permutation(this.expanded_key);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b) {
        super.processAADByte(b);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i, int i2) {
        super.processAADBytes(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferAAD(byte[] bArr, int i) {
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        processBuffer(bArr, i, bArr2, i2, AEADBaseEngine.State.DecData);
        System.arraycopy(bArr, i, this.previous_outputMessage, 0, this.BlockSize);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        processBuffer(bArr, i, bArr2, i2, AEADBaseEngine.State.EncData);
        System.arraycopy(bArr2, i2, this.previous_outputMessage, 0, this.BlockSize);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processByte(byte b, byte[] bArr, int i) {
        return super.processByte(b, bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return super.processBytes(bArr, i, i2, bArr2, i3);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalAAD() {
        if (this.adOff == -1) {
            this.f81020ad = ((AEADBaseEngine.StreamAADOperator) this.aadOperator).getBytes();
            this.adOff = 0;
            this.adlen = this.aadOperator.getLen();
            this.aadOperator.reset();
        }
        int i = this.m_state.ord;
        if (i == 1 || i == 5) {
            processAADBytes(this.tag_buffer);
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i) {
        int len = this.dataOperator.getLen() - (this.forEncryption ? 0 : this.MAC_SIZE);
        processFinalAAD();
        int i2 = this.BlockSize;
        int i3 = len / i2;
        int i4 = i3 + 1;
        int i5 = len % i2 != 0 ? i4 : i3;
        int i6 = (this.IV_SIZE + this.adlen) / i2;
        processBytes(this.m_buf, bArr, i, Math.max(i3 + 2, i6), i5, i4, len, i6 + 1);
        Bytes.xorTo(this.BlockSize, this.expanded_key, this.tag_buffer);
        this.instance.permutation(this.tag_buffer);
        Bytes.xorTo(this.BlockSize, this.expanded_key, this.tag_buffer);
        System.arraycopy(this.tag_buffer, 0, this.mac, 0, this.MAC_SIZE);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z) {
        super.reset(z);
        Arrays.fill(this.tag_buffer, (byte) 0);
        Arrays.fill(this.previous_outputMessage, (byte) 0);
        this.nb_its = 0;
        this.adOff = -1;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void checkAAD() {
        int i = this.m_state.ord;
        if (i == 3) {
            throw new IllegalArgumentException(C10965.m25286(new StringBuilder(), this.algorithmName, " cannot process AAD when the length of the ciphertext to be processed exceeds the a block size"));
        }
        if (i == 4) {
            throw new IllegalArgumentException(C10965.m25286(new StringBuilder(), this.algorithmName, " cannot be reused for encryption"));
        }
        if (i == 7) {
            throw new IllegalArgumentException(C10965.m25286(new StringBuilder(), this.algorithmName, " cannot process AAD when the length of the plaintext to be processed exceeds the a block size"));
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        int i2 = this.m_state.ord;
        if (i2 == 0) {
            throw new IllegalArgumentException(C10965.m25286(new StringBuilder(), this.algorithmName, " needs call init function before getUpdateOutputSize"));
        }
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return i + this.m_bufPos + this.MAC_SIZE;
        }
        if (i2 == 4 || i2 == 8) {
            return 0;
        }
        return Math.max(0, (i + this.m_bufPos) - this.MAC_SIZE);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        switch (this.m_state.ord) {
            case 0:
                throw new IllegalArgumentException(C10965.m25286(new StringBuilder(), this.algorithmName, " needs call init function before getUpdateOutputSize"));
            case 1:
            case 2:
            case 3:
                int i2 = this.m_bufPos + i;
                return i2 - (i2 % this.BlockSize);
            case 4:
            case 8:
                return 0;
            case 5:
            case 6:
            case 7:
                int iMax = Math.max(0, (this.m_bufPos + i) - this.MAC_SIZE);
                return iMax - (iMax % this.BlockSize);
            default:
                return Math.max(0, (i + this.m_bufPos) - this.MAC_SIZE);
        }
    }
}
