package org.bouncycastle.pqc.crypto.picnic;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Properties;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LowmcConstants {
    public KMatrices KMatrix;
    public KMatrices KMatrix_full;
    public KMatrices KMatrix_inv;
    public KMatrices LMatrix;
    public KMatrices LMatrix_full;
    public KMatrices LMatrix_inv;
    public KMatrices RConstants;
    public KMatrices RConstants_full;
    public int[] keyMatrices;
    public int[] keyMatrices_full;
    public int[] keyMatrices_inv;
    public int[] linearMatrices;
    public int[] linearMatrices_full;
    public int[] linearMatrices_inv;
    public int[] roundConstants;
    public int[] roundConstants_full;

    private KMatricesWithPointer GET_MAT(KMatrices kMatrices, int i) {
        KMatricesWithPointer kMatricesWithPointer = new KMatricesWithPointer(kMatrices);
        kMatricesWithPointer.setMatrixPointer(i * kMatricesWithPointer.getSize());
        return kMatricesWithPointer;
    }

    public static int[] ReadFromProperty(Properties properties, String str, int i) {
        byte[] bArrDecode = Hex.decode(removeCommas(properties.getProperty(str)));
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < bArrDecode.length / 4; i2++) {
            iArr[i2] = Pack.littleEndianToInt(bArrDecode, i2 * 4);
        }
        return iArr;
    }

    public static int[] readArray(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        int[] iArr = new int[i];
        for (int i2 = 0; i2 != i; i2++) {
            iArr[i2] = dataInputStream.readInt();
        }
        return iArr;
    }

    public static byte[] removeCommas(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != str.length(); i++) {
            if (str.charAt(i) != ',') {
                byteArrayOutputStream.write(str.charAt(i));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0021  */
    public KMatricesWithPointer KMatrix(PicnicEngine picnicEngine, int i) {
        KMatrices kMatrices;
        int i2 = picnicEngine.stateSizeBits;
        if (i2 != 128) {
            if (i2 != 129) {
                if (i2 == 192) {
                    if (picnicEngine.numRounds != 4) {
                        kMatrices = this.KMatrix;
                    }
                } else if (i2 != 255) {
                    if (i2 != 256) {
                        return null;
                    }
                    kMatrices = this.KMatrix;
                }
            }
            kMatrices = this.KMatrix_full;
        } else {
            kMatrices = this.KMatrix;
        }
        return GET_MAT(kMatrices, i);
    }

    public KMatricesWithPointer KMatrixInv(PicnicEngine picnicEngine) {
        int i = picnicEngine.stateSizeBits;
        if (i == 129 || ((i == 192 && picnicEngine.numRounds == 4) || i == 255)) {
            return GET_MAT(this.KMatrix_inv, 0);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0021  */
    public KMatricesWithPointer LMatrix(PicnicEngine picnicEngine, int i) {
        KMatrices kMatrices;
        int i2 = picnicEngine.stateSizeBits;
        if (i2 != 128) {
            if (i2 != 129) {
                if (i2 == 192) {
                    if (picnicEngine.numRounds != 4) {
                        kMatrices = this.LMatrix;
                    }
                } else if (i2 != 255) {
                    if (i2 != 256) {
                        return null;
                    }
                    kMatrices = this.LMatrix;
                }
            }
            kMatrices = this.LMatrix_full;
        } else {
            kMatrices = this.LMatrix;
        }
        return GET_MAT(kMatrices, i);
    }

    public KMatricesWithPointer LMatrixInv(PicnicEngine picnicEngine, int i) {
        int i2 = picnicEngine.stateSizeBits;
        if (i2 == 129 || ((i2 == 192 && picnicEngine.numRounds == 4) || i2 == 255)) {
            return GET_MAT(this.LMatrix_inv, i);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0021  */
    public KMatricesWithPointer RConstant(PicnicEngine picnicEngine, int i) {
        KMatrices kMatrices;
        int i2 = picnicEngine.stateSizeBits;
        if (i2 != 128) {
            if (i2 != 129) {
                if (i2 == 192) {
                    if (picnicEngine.numRounds != 4) {
                        kMatrices = this.RConstants;
                    }
                } else if (i2 != 255) {
                    if (i2 != 256) {
                        return null;
                    }
                    kMatrices = this.RConstants;
                }
            }
            kMatrices = this.RConstants_full;
        } else {
            kMatrices = this.RConstants;
        }
        return GET_MAT(kMatrices, i);
    }
}
