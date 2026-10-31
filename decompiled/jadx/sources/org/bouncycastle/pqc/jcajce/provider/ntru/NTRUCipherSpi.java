package org.bouncycastle.pqc.jcajce.provider.ntru;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;
import l.C20094;
import l.C4860;
import l.C9045;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.jcajce.spec.KEMParameterSpec;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.pqc.crypto.ntru.NTRUKEMExtractor;
import org.bouncycastle.pqc.crypto.ntru.NTRUKEMGenerator;
import org.bouncycastle.pqc.jcajce.provider.util.WrapUtil;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;

/* JADX INFO: loaded from: classes2.dex */
public class NTRUCipherSpi extends CipherSpi {
    public final String algorithmName;
    public AlgorithmParameters engineParams;
    public NTRUKEMGenerator kemGen;
    public KTSParameterSpec kemParameterSpec;
    public BCNTRUPrivateKey unwrapKey;
    public BCNTRUPublicKey wrapKey;

    public class Base extends NTRUCipherSpi {
        public Base() {
            super("NTRU");
        }
    }

    public NTRUCipherSpi(String str) {
        this.algorithmName = str;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return 2048;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(this.algorithmName, "BCPQC");
                this.engineParams = algorithmParameters;
                algorithmParameters.init(this.kemParameterSpec);
            } catch (Exception e) {
                throw Exceptions.illegalStateException(e.toString(), e);
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(KEMParameterSpec.class);
            } catch (Exception unused) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        } else {
            parameterSpec = null;
        }
        engineInit(i, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw Exceptions.illegalArgumentException(e.getMessage(), e);
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        KTSParameterSpec kEMParameterSpec;
        if (algorithmParameterSpec == null) {
            kEMParameterSpec = new KEMParameterSpec("AES-KWP");
        } else {
            if (!(algorithmParameterSpec instanceof KTSParameterSpec)) {
                throw new InvalidAlgorithmParameterException(C9045.m23341(new StringBuilder(), this.algorithmName, " can only accept KTSParameterSpec"));
            }
            kEMParameterSpec = (KTSParameterSpec) algorithmParameterSpec;
        }
        this.kemParameterSpec = kEMParameterSpec;
        if (i == 3) {
            if (!(key instanceof BCNTRUPublicKey)) {
                throw new InvalidKeyException(C9045.m23341(new StringBuilder("Only a "), this.algorithmName, " public key can be used for wrapping"));
            }
            this.wrapKey = (BCNTRUPublicKey) key;
            this.kemGen = new NTRUKEMGenerator(CryptoServicesRegistrar.getSecureRandom(secureRandom));
            return;
        }
        if (i != 4) {
            throw new InvalidParameterException("Cipher only valid for wrapping/unwrapping");
        }
        if (!(key instanceof BCNTRUPrivateKey)) {
            throw new InvalidKeyException(C9045.m23341(new StringBuilder("Only a "), this.algorithmName, " private key can be used for unwrapping"));
        }
        this.unwrapKey = (BCNTRUPrivateKey) key;
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException {
        if (i != 3) {
            throw new InvalidKeyException("only SECRET_KEY supported");
        }
        byte[] bArrExtractSecret = null;
        try {
            try {
                NTRUKEMExtractor nTRUKEMExtractor = new NTRUKEMExtractor(this.unwrapKey.getKeyParams());
                bArrExtractSecret = nTRUKEMExtractor.extractSecret(Arrays.copyOfRange(bArr, 0, nTRUKEMExtractor.getEncapsulationLength()));
                Wrapper keyUnwrapper = WrapUtil.getKeyUnwrapper(this.kemParameterSpec, bArrExtractSecret);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, nTRUKEMExtractor.getEncapsulationLength(), bArr.length);
                SecretKeySpec secretKeySpec = new SecretKeySpec(keyUnwrapper.unwrap(bArrCopyOfRange, 0, bArrCopyOfRange.length), str);
                if (bArrExtractSecret != null) {
                    Arrays.clear(bArrExtractSecret);
                }
                return secretKeySpec;
            } catch (IllegalArgumentException e) {
                throw new NoSuchAlgorithmException("unable to extract KTS secret: " + e.getMessage());
            } catch (InvalidCipherTextException e2) {
                throw new InvalidKeyException("unable to extract KTS secret: " + e2.getMessage());
            }
        } catch (Throwable th) {
            if (bArrExtractSecret != null) {
                Arrays.clear(bArrExtractSecret);
            }
            throw th;
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        if (key.getEncoded() == null) {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
        SecretWithEncapsulation secretWithEncapsulationGenerateEncapsulated = null;
        try {
            try {
                secretWithEncapsulationGenerateEncapsulated = this.kemGen.generateEncapsulated(this.wrapKey.getKeyParams());
                Wrapper keyWrapper = WrapUtil.getKeyWrapper(this.kemParameterSpec, secretWithEncapsulationGenerateEncapsulated.getSecret());
                byte[] encapsulation = secretWithEncapsulationGenerateEncapsulated.getEncapsulation();
                byte[] encoded = key.getEncoded();
                byte[] bArrConcatenate = Arrays.concatenate(encapsulation, keyWrapper.wrap(encoded, 0, encoded.length));
                Arrays.clear(encoded);
                try {
                    secretWithEncapsulationGenerateEncapsulated.destroy();
                    return bArrConcatenate;
                } catch (DestroyFailedException e) {
                    throw new IllegalBlockSizeException("unable to destroy interim values: " + e.getMessage());
                }
            } catch (IllegalArgumentException e2) {
                throw new IllegalBlockSizeException("unable to generate KTS secret: " + e2.getMessage());
            }
        } catch (Throwable th) {
            if (secretWithEncapsulationGenerateEncapsulated != null) {
                try {
                    secretWithEncapsulationGenerateEncapsulated.destroy();
                } catch (DestroyFailedException e3) {
                    throw new IllegalBlockSizeException("unable to destroy interim values: " + e3.getMessage());
                }
            }
            throw th;
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(C20094.m46315("Cannot support mode ", str));
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(C4860.m14172("Padding ", str, " unknown"));
    }
}
