package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Objects;
import org.bouncycastle.util.p082io.Streams;
import p067l.C7470;

/* JADX INFO: loaded from: classes2.dex */
public class LMOtsPublicKey implements Encodable {

    /* JADX INFO: renamed from: I */
    public final byte[] f81642I;

    /* JADX INFO: renamed from: K */
    public final byte[] f81643K;
    public final LMOtsParameters parameter;

    /* JADX INFO: renamed from: q */
    public final int f81644q;

    public LMOtsPublicKey(LMOtsParameters lMOtsParameters, byte[] bArr, int i, byte[] bArr2) {
        this.parameter = lMOtsParameters;
        this.f81642I = bArr;
        this.f81644q = i;
        this.f81643K = bArr2;
    }

    public LMSContext createOtsContext(LMOtsSignature lMOtsSignature) {
        Digest digest = DigestUtil.getDigest(this.parameter);
        LmsUtils.byteArray(this.f81642I, digest);
        LmsUtils.u32str(this.f81644q, digest);
        LmsUtils.u16str(LM_OTS.D_MESG, digest);
        LmsUtils.byteArray(lMOtsSignature.getC(), digest);
        return new LMSContext(this, lMOtsSignature, digest);
    }

    public LMSContext createOtsContext(LMSSignature lMSSignature) {
        Digest digest = DigestUtil.getDigest(this.parameter);
        LmsUtils.byteArray(this.f81642I, digest);
        LmsUtils.u32str(this.f81644q, digest);
        LmsUtils.u16str(LM_OTS.D_MESG, digest);
        LmsUtils.byteArray(lMSSignature.getOtsSignature().getC(), digest);
        return new LMSContext(this, lMSSignature, digest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LMOtsPublicKey lMOtsPublicKey = (LMOtsPublicKey) obj;
            if (this.f81644q == lMOtsPublicKey.f81644q && Objects.areEqual(this.parameter, lMOtsPublicKey.parameter) && Arrays.areEqual(this.f81642I, lMOtsPublicKey.f81642I) && Arrays.areEqual(this.f81643K, lMOtsPublicKey.f81643K)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return Composer.compose().u32str(this.parameter.getType()).bytes(this.f81642I).u32str(this.f81644q).bytes(this.f81643K).build();
    }

    public byte[] getI() {
        return this.f81642I;
    }

    public byte[] getK() {
        return this.f81643K;
    }

    public LMOtsParameters getParameter() {
        return this.parameter;
    }

    public int getQ() {
        return this.f81644q;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f81643K) + ((Arrays.hashCode(this.f81642I) + ((Objects.hashCode(this.parameter) + (this.f81644q * 31)) * 31)) * 31);
    }

    public static LMOtsPublicKey getInstance(Object obj) throws Throwable {
        if (obj instanceof LMOtsPublicKey) {
            return (LMOtsPublicKey) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            LMOtsParameters parametersForType = LMOtsParameters.getParametersForType(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            int i = dataInputStream.readInt();
            byte[] bArr2 = new byte[parametersForType.getN()];
            dataInputStream.readFully(bArr2);
            return new LMOtsPublicKey(parametersForType, bArr, i, bArr2);
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
                LMOtsPublicKey lMOtsPublicKey = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMOtsPublicKey;
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
}
