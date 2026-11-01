package p067l;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U19E */
/* JADX INFO: loaded from: classes4.dex */
public final class C18306 {

    /* JADX INFO: renamed from: ֫ */
    public byte[] f54670;

    /* JADX INFO: renamed from: ۧ */
    public int f54671;

    /* JADX INFO: renamed from: ܽ */
    public final byte[] f54672;

    /* JADX INFO: renamed from: ᩳ */
    public int f54673;

    public C18306(byte[] bArr) {
        int length = bArr.length;
        this.f54672 = bArr;
        this.f54673 = 0;
        this.f54671 = length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12943 m41687() {
        int i;
        String strM41685;
        do {
            i = this.f54673;
            strM41685 = m41685();
            if (strM41685 == null) {
                return null;
            }
        } while (strM41685.length() == 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(m41684(strM41685));
        while (true) {
            String strM41686 = m41685();
            if (strM41686 == null || strM41686.length() == 0) {
                break;
            }
            arrayList.add(m41684(strM41686));
        }
        return new C12943(arrayList, i, this.f54673 - i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4225 m41684(String str) {
        int iIndexOf = str.indexOf(": ");
        if (iIndexOf == -1) {
            return new C4225(str, "");
        }
        return new C4225(str.substring(0, iIndexOf), str.substring(iIndexOf + 2));
    }

    /* JADX INFO: renamed from: ۧ */
    private String m41685() {
        byte[] bArr = this.f54670;
        byte[] bArr2 = C7747.f20313;
        if (bArr != null && bArr.length == 0) {
            this.f54670 = null;
        } else {
            byte[] bArrM41686 = m41686();
            if (bArrM41686 == null) {
                bArr2 = this.f54670;
                if (bArr2 != null) {
                    this.f54670 = null;
                } else {
                    bArr2 = null;
                }
            } else if (bArrM41686.length == 0) {
                bArrM41686 = this.f54670;
                if (bArrM41686 != null) {
                    this.f54670 = bArr2;
                    bArr2 = bArrM41686;
                }
            } else {
                byte[] bArr3 = this.f54670;
                if (bArr3 != null) {
                    if (bArrM41686[0] != 32) {
                        this.f54670 = bArrM41686;
                        bArr2 = bArr3;
                    } else {
                        this.f54670 = null;
                        int length = bArrM41686.length - 1;
                        byte[] bArr4 = new byte[bArr3.length + length];
                        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                        System.arraycopy(bArrM41686, 1, bArr4, bArr3.length, length);
                        bArrM41686 = bArr4;
                    }
                }
                while (true) {
                    byte[] bArrM41687 = m41686();
                    if (bArrM41687 == null) {
                        break;
                    }
                    if (bArrM41687.length == 0) {
                        this.f54670 = bArr2;
                        break;
                    }
                    if (bArrM41687[0] == 32) {
                        int length2 = bArrM41687.length - 1;
                        byte[] bArr5 = new byte[bArrM41686.length + length2];
                        System.arraycopy(bArrM41686, 0, bArr5, 0, bArrM41686.length);
                        System.arraycopy(bArrM41687, 1, bArr5, bArrM41686.length, length2);
                        bArrM41686 = bArr5;
                    } else {
                        this.f54670 = bArrM41687;
                        break;
                    }
                }
                bArr2 = bArrM41686;
            }
        }
        if (bArr2 == null) {
            return null;
        }
        return bArr2.length == 0 ? "" : new String(bArr2, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ܽ */
    private byte[] m41686() {
        byte[] bArr;
        int i;
        int i2 = this.f54673;
        int i3 = this.f54671;
        if (i2 >= i3) {
            return null;
        }
        int i4 = i2;
        while (true) {
            bArr = this.f54672;
            if (i4 >= i3) {
                i4 = -1;
                i = -1;
                break;
            }
            byte b = bArr[i4];
            if (b == 13) {
                i = i4 + 1;
                if (i >= i3 || bArr[i] != 10) {
                    break;
                    break;
                }
                i = i4 + 2;
                break;
            }
            if (b == 10) {
                i = i4 + 1;
                break;
            }
            i4++;
        }
        if (i4 == -1) {
            i4 = i3;
        } else {
            i3 = i;
        }
        this.f54673 = i3;
        if (i4 == i2) {
            return C7747.f20313;
        }
        return Arrays.copyOfRange(bArr, i2, i4);
    }
}
