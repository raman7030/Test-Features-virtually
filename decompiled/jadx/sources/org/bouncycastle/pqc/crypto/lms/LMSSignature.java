package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;
import l.C5368;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes2.dex */
public class LMSSignature implements Encodable {
    public final LMOtsSignature otsSignature;
    public final LMSigParameters parameter;
    public final int q;
    public final byte[][] y;

    public LMSSignature(int i, LMOtsSignature lMOtsSignature, LMSigParameters lMSigParameters, byte[][] bArr) {
        this.q = i;
        this.otsSignature = lMOtsSignature;
        this.parameter = lMSigParameters;
        this.y = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LMSSignature lMSSignature = (LMSSignature) obj;
        if (this.q != lMSSignature.q) {
            return false;
        }
        LMOtsSignature lMOtsSignature = this.otsSignature;
        if (lMOtsSignature == null ? lMSSignature.otsSignature != null : !lMOtsSignature.equals(lMSSignature.otsSignature)) {
            return false;
        }
        LMSigParameters lMSigParameters = this.parameter;
        if (lMSigParameters == null ? lMSSignature.parameter == null : lMSigParameters.equals(lMSSignature.parameter)) {
            return Arrays.deepEquals(this.y, lMSSignature.y);
        }
        return false;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return Composer.compose().u32str(this.q).bytes(this.otsSignature.getEncoded()).u32str(this.parameter.getType()).bytes(this.y).build();
    }

    public LMOtsSignature getOtsSignature() {
        return this.otsSignature;
    }

    public LMSigParameters getParameter() {
        return this.parameter;
    }

    public int getQ() {
        return this.q;
    }

    public byte[][] getY() {
        return this.y;
    }

    public int hashCode() {
        int i = this.q * 31;
        LMOtsSignature lMOtsSignature = this.otsSignature;
        int iHashCode = (i + (lMOtsSignature != null ? lMOtsSignature.hashCode() : 0)) * 31;
        LMSigParameters lMSigParameters = this.parameter;
        return Arrays.deepHashCode(this.y) + ((iHashCode + (lMSigParameters != null ? lMSigParameters.hashCode() : 0)) * 31);
    }

    public static LMSSignature getInstance(Object obj) throws Throwable {
        if (obj instanceof LMSSignature) {
            return (LMSSignature) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            int i = dataInputStream.readInt();
            LMOtsSignature lMOtsSignature = LMOtsSignature.getInstance(obj);
            LMSigParameters parametersForType = LMSigParameters.getParametersForType(dataInputStream.readInt());
            int h = parametersForType.getH();
            byte[][] bArr = new byte[h][];
            for (int i2 = 0; i2 < h; i2++) {
                byte[] bArr2 = new byte[parametersForType.getM()];
                bArr[i2] = bArr2;
                dataInputStream.readFully(bArr2);
            }
            return new LMSSignature(i, lMOtsSignature, parametersForType, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException(C5368.m15337(obj, "cannot parse "));
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                LMSSignature lMSSignature = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMSSignature;
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
