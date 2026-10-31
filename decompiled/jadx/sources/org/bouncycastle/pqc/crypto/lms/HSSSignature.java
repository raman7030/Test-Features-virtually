package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import l.C5368;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Objects;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes2.dex */
public class HSSSignature implements Encodable {
    public final int lMinus1;
    public final LMSSignature signature;
    public final LMSSignedPubKey[] signedPubKey;

    public HSSSignature(int i, LMSSignedPubKey[] lMSSignedPubKeyArr, LMSSignature lMSSignature) {
        this.lMinus1 = i;
        this.signedPubKey = lMSSignedPubKeyArr;
        this.signature = lMSSignature;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HSSSignature hSSSignature = (HSSSignature) obj;
            if (this.lMinus1 == hSSSignature.lMinus1 && Arrays.areEqual(this.signedPubKey, hSSSignature.signedPubKey) && Objects.areEqual(this.signature, hSSSignature.signature)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        Composer composerCompose = Composer.compose();
        composerCompose.u32str(this.lMinus1);
        LMSSignedPubKey[] lMSSignedPubKeyArr = this.signedPubKey;
        if (lMSSignedPubKeyArr != null) {
            for (LMSSignedPubKey lMSSignedPubKey : lMSSignedPubKeyArr) {
                composerCompose.bytes(lMSSignedPubKey);
            }
        }
        composerCompose.bytes(this.signature);
        return composerCompose.build();
    }

    public LMSSignature getSignature() {
        return this.signature;
    }

    public LMSSignedPubKey[] getSignedPubKey() {
        return this.signedPubKey;
    }

    public int getlMinus1() {
        return this.lMinus1;
    }

    public int hashCode() {
        return Objects.hashCode(this.signature) + (((this.lMinus1 * 31) + Arrays.hashCode(this.signedPubKey)) * 31);
    }

    public static HSSSignature getInstance(Object obj, int i) {
        if (obj instanceof HSSSignature) {
            return (HSSSignature) obj;
        }
        if (obj instanceof DataInputStream) {
            int i2 = ((DataInputStream) obj).readInt();
            if (i2 != i - 1) {
                throw new IllegalStateException("nspk exceeded maxNspk");
            }
            LMSSignedPubKey[] lMSSignedPubKeyArr = new LMSSignedPubKey[i2];
            if (i2 != 0) {
                for (int i3 = 0; i3 < i2; i3++) {
                    lMSSignedPubKeyArr[i3] = new LMSSignedPubKey(LMSSignature.getInstance(obj), LMSPublicKeyParameters.getInstance(obj));
                }
            }
            return new HSSSignature(i2, lMSSignedPubKeyArr, LMSSignature.getInstance(obj));
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj), i);
            }
            throw new IllegalArgumentException(C5368.m15337(obj, "cannot parse "));
        }
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                HSSSignature hSSSignature = getInstance(dataInputStream2, i);
                dataInputStream2.close();
                return hSSSignature;
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
