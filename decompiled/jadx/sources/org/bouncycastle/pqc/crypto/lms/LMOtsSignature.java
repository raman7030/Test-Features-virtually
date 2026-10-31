package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;
import l.C5368;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes2.dex */
public class LMOtsSignature implements Encodable {
    public final byte[] C;
    public final LMOtsParameters type;
    public final byte[] y;

    public LMOtsSignature(LMOtsParameters lMOtsParameters, byte[] bArr, byte[] bArr2) {
        this.type = lMOtsParameters;
        this.C = bArr;
        this.y = bArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LMOtsSignature lMOtsSignature = (LMOtsSignature) obj;
        LMOtsParameters lMOtsParameters = this.type;
        if (lMOtsParameters == null ? lMOtsSignature.type != null : !lMOtsParameters.equals(lMOtsSignature.type)) {
            return false;
        }
        if (Arrays.equals(this.C, lMOtsSignature.C)) {
            return Arrays.equals(this.y, lMOtsSignature.y);
        }
        return false;
    }

    public byte[] getC() {
        return this.C;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return Composer.compose().u32str(this.type.getType()).bytes(this.C).bytes(this.y).build();
    }

    public LMOtsParameters getType() {
        return this.type;
    }

    public byte[] getY() {
        return this.y;
    }

    public int hashCode() {
        LMOtsParameters lMOtsParameters = this.type;
        return Arrays.hashCode(this.y) + ((Arrays.hashCode(this.C) + ((lMOtsParameters != null ? lMOtsParameters.hashCode() : 0) * 31)) * 31);
    }

    public static LMOtsSignature getInstance(Object obj) throws Throwable {
        if (obj instanceof LMOtsSignature) {
            return (LMOtsSignature) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            LMOtsParameters parametersForType = LMOtsParameters.getParametersForType(dataInputStream.readInt());
            byte[] bArr = new byte[parametersForType.getN()];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[parametersForType.getN() * parametersForType.getP()];
            dataInputStream.readFully(bArr2);
            return new LMOtsSignature(parametersForType, bArr, bArr2);
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
                LMOtsSignature lMOtsSignature = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMOtsSignature;
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
