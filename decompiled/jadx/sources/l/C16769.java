package l;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U19E */
/* JADX INFO: loaded from: classes4.dex */
public final class C16769 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f51488;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f51489;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] f51490;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f51491;

    public C16769(byte[] bArr) {
        int length = bArr.length;
        this.f51490 = bArr;
        this.f51491 = 0;
        this.f51489 = length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11126 m39451() {
        int i;
        String strM39449;
        do {
            i = this.f51491;
            strM39449 = m39449();
            if (strM39449 == null) {
                return null;
            }
        } while (strM39449.length() == 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(m39448(strM39449));
        while (true) {
            String strM394410 = m39449();
            if (strM394410 == null || strM394410.length() == 0) {
                break;
            }
            arrayList.add(m39448(strM394410));
        }
        return new C11126(arrayList, i, this.f51491 - i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1953 m39448(String str) {
        int iIndexOf = str.indexOf(": ");
        if (iIndexOf == -1) {
            return new C1953(str, "");
        }
        return new C1953(str.substring(0, iIndexOf), str.substring(iIndexOf + 2));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private String m39449() {
        byte[] bArr = this.f51488;
        byte[] bArr2 = C5659.f17466;
        if (bArr != null && bArr.length == 0) {
            this.f51488 = null;
        } else {
            byte[] bArrM39450 = m39450();
            if (bArrM39450 == null) {
                bArr2 = this.f51488;
                if (bArr2 != null) {
                    this.f51488 = null;
                } else {
                    bArr2 = null;
                }
            } else if (bArrM39450.length == 0) {
                bArrM39450 = this.f51488;
                if (bArrM39450 != null) {
                    this.f51488 = bArr2;
                    bArr2 = bArrM39450;
                }
            } else {
                byte[] bArr3 = this.f51488;
                if (bArr3 != null) {
                    if (bArrM39450[0] != 32) {
                        this.f51488 = bArrM39450;
                        bArr2 = bArr3;
                    } else {
                        this.f51488 = null;
                        int length = bArrM39450.length - 1;
                        byte[] bArr4 = new byte[bArr3.length + length];
                        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                        System.arraycopy(bArrM39450, 1, bArr4, bArr3.length, length);
                        bArrM39450 = bArr4;
                    }
                }
                while (true) {
                    byte[] bArrM39451 = m39450();
                    if (bArrM39451 == null) {
                        break;
                    }
                    if (bArrM39451.length == 0) {
                        this.f51488 = bArr2;
                        break;
                    }
                    if (bArrM39451[0] == 32) {
                        int length2 = bArrM39451.length - 1;
                        byte[] bArr5 = new byte[bArrM39450.length + length2];
                        System.arraycopy(bArrM39450, 0, bArr5, 0, bArrM39450.length);
                        System.arraycopy(bArrM39451, 1, bArr5, bArrM39450.length, length2);
                        bArrM39450 = bArr5;
                    } else {
                        this.f51488 = bArrM39451;
                        break;
                    }
                }
                bArr2 = bArrM39450;
            }
        }
        if (bArr2 == null) {
            return null;
        }
        return bArr2.length == 0 ? "" : new String(bArr2, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private byte[] m39450() {
        byte[] bArr;
        int i;
        int i2 = this.f51491;
        int i3 = this.f51489;
        if (i2 >= i3) {
            return null;
        }
        int i4 = i2;
        while (true) {
            bArr = this.f51490;
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
        this.f51491 = i3;
        if (i4 == i2) {
            return C5659.f17466;
        }
        return Arrays.copyOfRange(bArr, i2, i4);
    }
}
