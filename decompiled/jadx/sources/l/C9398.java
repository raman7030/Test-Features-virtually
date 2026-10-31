package l;

import com.alipay.sdk.m.y.l;
import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۢۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8H6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9398 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f28533;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f28534;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f28535;

    public C9398(String str, byte[] bArr, String str2) {
        this.f28535 = str;
        this.f28533 = str2;
        this.f28534 = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9398)) {
            return false;
        }
        C9398 c9398 = (C9398) obj;
        return C11003.equals(this.f28535, c9398.f28535) && C11003.equals(this.f28533, c9398.f28533) && C11003.equals(this.f28534, c9398.f28534);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f28534) + C20361.m46680(C11003.hashCode(this.f28535) * 31, 31, this.f28533);
    }

    public final String toString() {
        Object[] objArr = {this.f28535, this.f28533, this.f28534};
        String[] strArrSplit = "title;author;image".length() == 0 ? new String[0] : "title;author;image".split(l.b);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m24231() {
        return this.f28533;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m24232() {
        return this.f28534;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m24233() {
        return this.f28535;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9398 m24229(C23411 c23411) {
        try {
            c23411.seek(0L);
            if (c23411.readInt() == 1179011410) {
                c23411.skipBytes(4);
                if (c23411.readInt() == 1163280727) {
                    while (c23411.available() > 8) {
                        int i = c23411.readInt();
                        int i2 = c23411.readInt();
                        if (i == 540238953) {
                            if ((c23411.readInt() & 16777215) != 3359817) {
                                break;
                            }
                            c23411.skipBytes(2);
                            C23411 c23411M51861 = c23411.m51861(c23411.m51856(), ((c23411.readByte() & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21) | ((c23411.readByte() & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14) | ((c23411.readByte() & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (c23411.readByte() & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID));
                            byte[] bArr = null;
                            String strM24230 = null;
                            String strM24231 = null;
                            while (c23411M51861.available() > 10) {
                                int i3 = c23411M51861.readInt();
                                int iReverseBytes = Integer.reverseBytes(c23411M51861.readInt());
                                c23411M51861.skipBytes(2);
                                if (i3 == 0) {
                                    break;
                                }
                                if (i3 == 1128878145) {
                                    long filePointer = c23411M51861.getFilePointer() + ((long) iReverseBytes);
                                    c23411M51861.skipBytes(1);
                                    while (c23411M51861.readByte() != 0) {
                                    }
                                    c23411M51861.skipBytes(1);
                                    while (c23411M51861.readByte() != 0) {
                                    }
                                    int filePointer2 = (int) (filePointer - c23411M51861.getFilePointer());
                                    if (filePointer2 > 0) {
                                        bArr = new byte[filePointer2];
                                        c23411M51861.m51858(bArr, 0, filePointer2);
                                    }
                                } else if (i3 == 844384596) {
                                    byte[] bArr2 = new byte[iReverseBytes];
                                    c23411M51861.m51858(bArr2, 0, iReverseBytes);
                                    strM24230 = m24230(bArr2);
                                } else if (i3 == 826626132) {
                                    byte[] bArr3 = new byte[iReverseBytes];
                                    c23411M51861.m51858(bArr3, 0, iReverseBytes);
                                    strM24231 = m24230(bArr3);
                                } else if (i3 == 843403348 && strM24231 == null) {
                                    byte[] bArr4 = new byte[iReverseBytes];
                                    c23411M51861.m51858(bArr4, 0, iReverseBytes);
                                    strM24231 = m24230(bArr4);
                                } else {
                                    c23411M51861.skipBytes(iReverseBytes);
                                }
                            }
                            return new C9398(strM24230, bArr, strM24231);
                        }
                        c23411.skipBytes(i2);
                    }
                }
            }
        } catch (IOException unused) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0039  */
    /* JADX WARN: Code duplicated, block: B:32:0x003b  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m24230(byte[] bArr) {
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
