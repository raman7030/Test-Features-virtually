package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.p082io.Streams;
import p067l.C7241;
import p067l.C7470;

/* JADX INFO: loaded from: classes2.dex */
public class LMSPublicKeyParameters extends LMSKeyParameters implements LMSContextBasedVerifier {

    /* JADX INFO: renamed from: I */
    public final byte[] f81651I;

    /* JADX INFO: renamed from: T1 */
    public final byte[] f81652T1;
    public final LMOtsParameters lmOtsType;
    public final LMSigParameters parameterSet;

    public LMSPublicKeyParameters(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, byte[] bArr, byte[] bArr2) {
        super(false);
        this.parameterSet = lMSigParameters;
        this.lmOtsType = lMOtsParameters;
        this.f81651I = Arrays.clone(bArr2);
        this.f81652T1 = Arrays.clone(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LMSPublicKeyParameters lMSPublicKeyParameters = (LMSPublicKeyParameters) obj;
        if (this.parameterSet.equals(lMSPublicKeyParameters.parameterSet) && this.lmOtsType.equals(lMSPublicKeyParameters.lmOtsType) && Arrays.areEqual(this.f81651I, lMSPublicKeyParameters.f81651I)) {
            return Arrays.areEqual(this.f81652T1, lMSPublicKeyParameters.f81652T1);
        }
        return false;
    }

    public LMSContext generateOtsContext(LMSSignature lMSSignature) {
        int type = getOtsParameters().getType();
        if (lMSSignature.getOtsSignature().getType().getType() == type) {
            return new LMOtsPublicKey(LMOtsParameters.getParametersForType(type), this.f81651I, lMSSignature.getQ(), null).createOtsContext(lMSSignature);
        }
        throw new IllegalArgumentException("ots type from lsm signature does not match ots signature type from embedded ots signature");
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return toByteArray();
    }

    public byte[] getI() {
        return Arrays.clone(this.f81651I);
    }

    public LMSParameters getLMSParameters() {
        return new LMSParameters(getSigParameters(), getOtsParameters());
    }

    public LMOtsParameters getOtsParameters() {
        return this.lmOtsType;
    }

    public LMSigParameters getSigParameters() {
        return this.parameterSet;
    }

    public byte[] getT1() {
        return Arrays.clone(this.f81652T1);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f81652T1) + ((Arrays.hashCode(this.f81651I) + ((this.lmOtsType.hashCode() + (this.parameterSet.hashCode() * 31)) * 31)) * 31);
    }

    public boolean matchesT1(byte[] bArr) {
        return Arrays.constantTimeAreEqual(this.f81652T1, bArr);
    }

    public byte[] refI() {
        return this.f81651I;
    }

    public byte[] toByteArray() {
        return Composer.compose().u32str(this.parameterSet.getType()).u32str(this.lmOtsType.getType()).bytes(this.f81651I).bytes(this.f81652T1).build();
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedVerifier
    public boolean verify(LMSContext lMSContext) {
        return LMS.verifySignature(this, lMSContext);
    }

    public static LMSPublicKeyParameters getInstance(Object obj) throws Throwable {
        if (obj instanceof LMSPublicKeyParameters) {
            return (LMSPublicKeyParameters) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            LMSigParameters parametersForType = LMSigParameters.getParametersForType(dataInputStream.readInt());
            LMOtsParameters parametersForType2 = LMOtsParameters.getParametersForType(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[parametersForType.getM()];
            dataInputStream.readFully(bArr2);
            return new LMSPublicKeyParameters(parametersForType, parametersForType2, bArr2, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException(C7470.m17246(obj, "cannot parse "));
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                LMSPublicKeyParameters lMSPublicKeyParameters = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMSPublicKeyParameters;
            } catch (Throwable th) {
                th = th;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedVerifier
    public LMSContext generateLMSContext(byte[] bArr) {
        try {
            return generateOtsContext(LMSSignature.getInstance(bArr));
        } catch (IOException e) {
            throw new IllegalStateException(C7241.m16586(e, new StringBuilder("cannot parse signature: ")));
        }
    }
}
