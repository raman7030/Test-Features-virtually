package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۢۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8H6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11300 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f31482;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f31483;

    /* JADX INFO: renamed from: ܽ */
    public final String f31484;

    public C11300(String str, byte[] bArr, String str2) {
        this.f31484 = str;
        this.f31482 = str2;
        this.f31483 = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11300)) {
            return false;
        }
        C11300 c11300 = (C11300) obj;
        return C12826.equals(this.f31484, c11300.f31484) && C12826.equals(this.f31482, c11300.f31482) && C12826.equals(this.f31483, c11300.f31483);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f31483) + C21720.m49003(C12826.hashCode(this.f31484) * 31, 31, this.f31482);
    }

    public final String toString() {
        Object[] objArr = {this.f31484, this.f31482, this.f31483};
        String[] strArrSplit = "title;author;image".length() == 0 ? new String[0] : "title;author;image".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder("WavID3Info[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m26241() {
        return this.f31482;
    }

    /* JADX INFO: renamed from: ܽ */
    public final byte[] m26242() {
        return this.f31483;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m26243() {
        return this.f31484;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11300 m26239(C24618 c24618) {
        try {
            c24618.seek(0L);
            if (c24618.readInt() == 1179011410) {
                c24618.skipBytes(4);
                if (c24618.readInt() == 1163280727) {
                    while (c24618.available() > 8) {
                        int i = c24618.readInt();
                        int i2 = c24618.readInt();
                        if (i == 540238953) {
                            if ((c24618.readInt() & 16777215) != 3359817) {
                                break;
                            }
                            c24618.skipBytes(2);
                            C24618 c24618M54259 = c24618.m54259(c24618.m54254(), ((c24618.readByte() & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21) | ((c24618.readByte() & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14) | ((c24618.readByte() & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (c24618.readByte() & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID));
                            byte[] bArr = null;
                            String strM26240 = null;
                            String strM26241 = null;
                            while (c24618M54259.available() > 10) {
                                int i3 = c24618M54259.readInt();
                                int iReverseBytes = Integer.reverseBytes(c24618M54259.readInt());
                                c24618M54259.skipBytes(2);
                                if (i3 == 0) {
                                    break;
                                }
                                if (i3 == 1128878145) {
                                    long filePointer = c24618M54259.getFilePointer() + ((long) iReverseBytes);
                                    c24618M54259.skipBytes(1);
                                    while (c24618M54259.readByte() != 0) {
                                    }
                                    c24618M54259.skipBytes(1);
                                    while (c24618M54259.readByte() != 0) {
                                    }
                                    int filePointer2 = (int) (filePointer - c24618M54259.getFilePointer());
                                    if (filePointer2 > 0) {
                                        bArr = new byte[filePointer2];
                                        c24618M54259.m54256(bArr, 0, filePointer2);
                                    }
                                } else if (i3 == 844384596) {
                                    byte[] bArr2 = new byte[iReverseBytes];
                                    c24618M54259.m54256(bArr2, 0, iReverseBytes);
                                    strM26240 = m26240(bArr2);
                                } else if (i3 == 826626132) {
                                    byte[] bArr3 = new byte[iReverseBytes];
                                    c24618M54259.m54256(bArr3, 0, iReverseBytes);
                                    strM26241 = m26240(bArr3);
                                } else if (i3 == 843403348 && strM26241 == null) {
                                    byte[] bArr4 = new byte[iReverseBytes];
                                    c24618M54259.m54256(bArr4, 0, iReverseBytes);
                                    strM26241 = m26240(bArr4);
                                } else {
                                    c24618M54259.skipBytes(iReverseBytes);
                                }
                            }
                            return new C11300(strM26240, bArr, strM26241);
                        }
                        c24618.skipBytes(i2);
                    }
                }
            }
        } catch (IOException unused) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0039  */
    /* JADX WARN: Code duplicated, block: B:32:0x003b  */
    /* JADX INFO: renamed from: ۧ */
    public static String m26240(byte[] bArr) {
        Charset charset;
        int i;
        if (bArr.length < 1) {
            return null;
        }
        byte b = bArr[0];
        if (b == 1) {
            charset = StandardCharsets.UTF_16;
        } else if (b == 2) {
            charset = StandardCharsets.UTF_16BE;
        } else if (b == 3) {
            charset = StandardCharsets.UTF_8;
        } else {
            charset = StandardCharsets.ISO_8859_1;
        }
        int i2 = 1;
        while (i2 < bArr.length) {
            Charset charset2 = StandardCharsets.UTF_16;
            if (charset == charset2) {
                int i3 = i2 + 1;
                if (i3 < bArr.length && bArr[i2] == 0 && bArr[i3] == 0) {
                    break;
                }
                if (charset == charset2) {
                    i = 2;
                } else {
                    i = 1;
                }
                i2 += i;
            } else {
                if (bArr[i2] == 0) {
                    break;
                }
                if (charset == charset2) {
                    i = 2;
                } else {
                    i = 1;
                }
                i2 += i;
            }
        }
        return new String(bArr, 1, i2 - 1, charset);
    }
}
