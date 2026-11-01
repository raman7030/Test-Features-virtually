package org.bouncycastle.util.encoders;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: loaded from: classes2.dex */
public class UTF8 {
    public static final byte C_CR1 = 1;
    public static final byte C_CR2 = 2;
    public static final byte C_CR3 = 3;
    public static final byte C_ILL = 0;
    public static final byte C_L2A = 4;
    public static final byte C_L3A = 5;
    public static final byte C_L3B = 6;
    public static final byte C_L3C = 7;
    public static final byte C_L4A = 8;
    public static final byte C_L4B = 9;
    public static final byte C_L4C = 10;
    public static final byte S_CS1 = 0;
    public static final byte S_CS2 = 16;
    public static final byte S_CS3 = 32;
    public static final byte S_END = -1;
    public static final byte S_ERR = -2;
    public static final byte S_P3A = 48;
    public static final byte S_P3B = 64;
    public static final byte S_P4A = 80;
    public static final byte S_P4B = 96;
    public static final short[] firstUnitTable = new short[128];
    public static final byte[] transitionTable;

    static {
        byte[] bArr = new byte[UMErrorCode.E_UM_BE_DEFLATE_FAILED];
        transitionTable = bArr;
        byte[] bArr2 = new byte[128];
        fill(bArr2, 0, 15, (byte) 1);
        fill(bArr2, 16, 31, (byte) 2);
        fill(bArr2, 32, 63, (byte) 3);
        fill(bArr2, 64, 65, (byte) 0);
        fill(bArr2, 66, 95, (byte) 4);
        fill(bArr2, 96, 96, (byte) 5);
        fill(bArr2, 97, 108, (byte) 6);
        fill(bArr2, 109, 109, (byte) 7);
        fill(bArr2, UMErrorCode.E_UM_BE_JSON_FAILED, UMErrorCode.E_UM_BE_CREATE_FAILED, (byte) 6);
        fill(bArr2, UMErrorCode.E_UM_BE_DEFLATE_FAILED, UMErrorCode.E_UM_BE_DEFLATE_FAILED, (byte) 8);
        fill(bArr2, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 115, (byte) 9);
        fill(bArr2, 116, 116, (byte) 10);
        fill(bArr2, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 127, (byte) 0);
        fill(bArr, 0, bArr.length - 1, (byte) -2);
        fill(bArr, 8, 11, (byte) -1);
        fill(bArr, 24, 27, (byte) 0);
        fill(bArr, 40, 43, (byte) 16);
        fill(bArr, 58, 59, (byte) 0);
        fill(bArr, 72, 73, (byte) 0);
        fill(bArr, 89, 91, (byte) 16);
        fill(bArr, IShizukuService.Stub.TRANSACTION_isHidden, IShizukuService.Stub.TRANSACTION_isHidden, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, C0684bo.f2505j, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, S_P3A, 16, 64, S_P4A, S_CS3, S_P4B};
        for (int i = 0; i < 128; i++) {
            byte b = bArr2[i];
            firstUnitTable[i] = (short) (bArr4[b] | ((bArr3[b] & i) << 8));
        }
    }

    public static void fill(byte[] bArr, int i, int i2, byte b) {
        while (i <= i2) {
            bArr[i] = b;
            i++;
        }
    }

    public static int transcodeToUTF16(byte[] bArr, int i, int i2, char[] cArr) {
        int i3 = i2 + i;
        int i4 = 0;
        while (i < i3) {
            int i5 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                short s = firstUnitTable[b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID];
                int i6 = s >>> 8;
                byte b2 = (byte) s;
                while (b2 >= 0) {
                    if (i5 >= i3) {
                        return -1;
                    }
                    int i7 = i5 + 1;
                    byte b3 = bArr[i5];
                    i6 = (i6 << 6) | (b3 & 63);
                    b2 = transitionTable[b2 + ((b3 & 255) >>> 4)];
                    i5 = i7;
                }
                if (b2 == -2) {
                    return -1;
                }
                if (i6 <= 65535) {
                    if (i4 >= cArr.length) {
                        return -1;
                    }
                    cArr[i4] = (char) i6;
                    i4++;
                } else {
                    if (i4 >= cArr.length - 1) {
                        return -1;
                    }
                    int i8 = i4 + 1;
                    cArr[i4] = (char) ((i6 >>> 10) + 55232);
                    i4 += 2;
                    cArr[i8] = (char) ((i6 & 1023) | 56320);
                }
                i = i5;
            } else {
                if (i4 >= cArr.length) {
                    return -1;
                }
                cArr[i4] = (char) b;
                i = i5;
                i4++;
            }
        }
        return i4;
    }

    public static int transcodeToUTF16(byte[] bArr, char[] cArr) {
        return transcodeToUTF16(bArr, 0, bArr.length, cArr);
    }
}
