package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩴ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1TP */
/* JADX INFO: loaded from: classes4.dex */
public final class C20473 {

    /* JADX INFO: renamed from: ֫ */
    public final int f63223;

    /* JADX INFO: renamed from: ۧ */
    public boolean f63224;

    /* JADX INFO: renamed from: ܳ */
    public char[] f63225;

    /* JADX INFO: renamed from: ܽ */
    public boolean f63226;

    /* JADX INFO: renamed from: ܿ */
    public final long[] f63227;

    /* JADX INFO: renamed from: ᩳ */
    public short f63228;

    public C20473(int i, long j) {
        this.f63223 = i;
        this.f63225 = new char[(int) (i * 1.5f)];
        this.f63227 = new long[i];
        m46175(j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46176(C20473 c20473, int i, int i2, int i3) {
        int codePoint;
        this.f63224 |= c20473.f63224;
        int iM46173 = c20473.m46173(i);
        int iM46174 = c20473.m46173(i2);
        boolean z = i > 0 && c20473.m46171(i + (-1));
        char[] cArrCopyOf = c20473.f63225;
        if (this == c20473) {
            cArrCopyOf = Arrays.copyOf(cArrCopyOf, cArrCopyOf.length);
        }
        int i4 = 0;
        while (iM46173 < iM46174) {
            char c = cArrCopyOf[iM46173];
            if (Character.isHighSurrogate(c)) {
                codePoint = c;
                iM46173++;
                codePoint = Character.toCodePoint(c, cArrCopyOf[iM46173]);
            }
            if (z) {
                codePoint = 32;
                z = false;
            }
            int iM20874 = C9013.m20874(codePoint);
            if (iM20874 > 0) {
                i3 += i4;
                i += i4;
                i4 = iM20874;
            }
            m46174(i3, codePoint, c20473.f63227[i]);
            iM46173++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m46172() {
        return this.f63228;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m46178() {
        short s = this.f63228;
        for (int i = 0; i < s; i++) {
            if (this.f63225[i] != ' ') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m46173(int i) {
        if (i == this.f63223) {
            return this.f63228;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            char c = this.f63225[i2];
            boolean zIsHighSurrogate = Character.isHighSurrogate(c);
            int i5 = c;
            if (zIsHighSurrogate) {
                int codePoint = Character.toCodePoint(c, this.f63225[i4]);
                i4 = i2 + 2;
                i5 = codePoint;
            }
            int iM20874 = C9013.m20874(i5);
            if (iM20874 > 0) {
                i3 += iM20874;
                if (i3 == i) {
                    while (i4 < this.f63228) {
                        if (Character.isHighSurrogate(this.f63225[i4])) {
                            char[] cArr = this.f63225;
                            if (C9013.m20874(Character.toCodePoint(cArr[i4], cArr[i4 + 1])) > 0) {
                                break;
                            }
                            i4 += 2;
                        } else {
                            if (C9013.m20874(this.f63225[i4]) > 0) {
                                break;
                            }
                            i4++;
                        }
                    }
                    return i4;
                }
                if (i3 > i) {
                    return i2;
                }
            }
            i2 = i4;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m46171(int i) {
        int codePoint;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f63228) {
            int i4 = i2 + 1;
            char c = this.f63225[i2];
            if (Character.isHighSurrogate(c)) {
                i2 += 2;
                codePoint = Character.toCodePoint(c, this.f63225[i4]);
            } else {
                i2 = i4;
                codePoint = c;
            }
            int iM20874 = C9013.m20874(codePoint);
            if (iM20874 > 0) {
                if (i3 == i && iM20874 == 2) {
                    return true;
                }
                i3 += iM20874;
                if (i3 > i) {
                    break;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46175(long j) {
        Arrays.fill(this.f63225, ' ');
        Arrays.fill(this.f63227, j);
        this.f63228 = (short) this.f63223;
        this.f63224 = false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0092  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6  */
    /* JADX INFO: renamed from: ֫ */
    public final void m46174(int i, int i2, long j) {
        int i3;
        char[] cArr;
        int iM46173;
        char c;
        boolean zIsHighSurrogate;
        int codePoint;
        int iM20874;
        int i4;
        int i5;
        int iM46174;
        int i6;
        int iCharCount;
        int i7;
        int i8;
        int i9;
        short s;
        int i10;
        this.f63227[i] = j;
        int iM20875 = C9013.m20874(i2);
        if (!this.f63224) {
            if (i2 >= 65536 || iM20875 != 1) {
                this.f63224 = true;
            } else {
                this.f63225[i] = (char) i2;
                return;
            }
        }
        boolean z = iM20875 <= 0;
        boolean z2 = i > 0 && m46171(i + (-1));
        if (z) {
            if (z2) {
                i3 = i - 1;
            }
            cArr = this.f63225;
            iM46173 = m46173(i3);
            c = cArr[iM46173];
            zIsHighSurrogate = Character.isHighSurrogate(c);
            codePoint = c;
            if (zIsHighSurrogate) {
                codePoint = Character.toCodePoint(c, cArr[iM46173 + 1]);
            }
            iM20874 = C9013.m20874(codePoint);
            i4 = i3 + iM20874;
            i5 = this.f63223;
            if (i4 < i5) {
                iM46174 = m46173(i4);
            } else {
                iM46174 = this.f63228;
            }
            i6 = iM46174 - iM46173;
            iCharCount = Character.charCount(i2);
            if (z) {
                iCharCount += i6;
            }
            i7 = iM46173 + i6;
            i8 = iM46173 + iCharCount;
            i9 = iCharCount - i6;
            if (i9 > 0) {
                s = this.f63228;
                i10 = s - i7;
                if (s + i9 > cArr.length) {
                    char[] cArr2 = new char[cArr.length + i5];
                    System.arraycopy(cArr, 0, cArr2, 0, i7);
                    System.arraycopy(cArr, i7, cArr2, i8, i10);
                    this.f63225 = cArr2;
                    cArr = cArr2;
                } else {
                    System.arraycopy(cArr, i7, cArr, i8, i10);
                }
            } else if (i9 < 0) {
                System.arraycopy(cArr, i7, cArr, i8, this.f63228 - i7);
            }
            this.f63228 = (short) (this.f63228 + i9);
            if (!z) {
                i6 = 0;
            }
            Character.toChars(i2, cArr, iM46173 + i6);
            if (iM20874 != 2 && iM20875 == 1) {
                short s2 = this.f63228;
                if (s2 + 1 > cArr.length) {
                    char[] cArr3 = new char[cArr.length + i5];
                    System.arraycopy(cArr, 0, cArr3, 0, i8);
                    System.arraycopy(cArr, i8, cArr3, i8 + 1, this.f63228 - i8);
                    this.f63225 = cArr3;
                    cArr = cArr3;
                } else {
                    System.arraycopy(cArr, i8, cArr, i8 + 1, s2 - i8);
                }
                cArr[i8] = ' ';
                this.f63228 = (short) (this.f63228 + 1);
                return;
            }
            if (iM20874 == 1 || iM20875 != 2) {
            }
            if (i3 == i5 - 1) {
                throw new IllegalArgumentException();
            }
            if (i3 == i5 - 2) {
                this.f63228 = (short) i8;
                return;
            }
            int i11 = (Character.isHighSurrogate(this.f63225[i8]) ? 2 : 1) + i8;
            System.arraycopy(cArr, i11, cArr, i8, this.f63228 - i11);
            this.f63228 = (short) (this.f63228 - (i11 - i8));
            return;
        }
        if (z2) {
            m46174(i - 1, 32, j);
        }
        if (iM20875 == 2) {
            int i12 = i + 1;
            if (m46171(i12)) {
                m46174(i12, 32, j);
            }
        }
        i3 = i;
        cArr = this.f63225;
        iM46173 = m46173(i3);
        c = cArr[iM46173];
        zIsHighSurrogate = Character.isHighSurrogate(c);
        codePoint = c;
        if (zIsHighSurrogate) {
            codePoint = Character.toCodePoint(c, cArr[iM46173 + 1]);
        }
        iM20874 = C9013.m20874(codePoint);
        i4 = i3 + iM20874;
        i5 = this.f63223;
        if (i4 < i5) {
            iM46174 = m46173(i4);
        } else {
            iM46174 = this.f63228;
        }
        i6 = iM46174 - iM46173;
        iCharCount = Character.charCount(i2);
        if (z) {
            iCharCount += i6;
        }
        i7 = iM46173 + i6;
        i8 = iM46173 + iCharCount;
        i9 = iCharCount - i6;
        if (i9 > 0) {
            s = this.f63228;
            i10 = s - i7;
            if (s + i9 > cArr.length) {
                char[] cArr4 = new char[cArr.length + i5];
                System.arraycopy(cArr, 0, cArr4, 0, i7);
                System.arraycopy(cArr, i7, cArr4, i8, i10);
                this.f63225 = cArr4;
                cArr = cArr4;
            } else {
                System.arraycopy(cArr, i7, cArr, i8, i10);
            }
        } else if (i9 < 0) {
            System.arraycopy(cArr, i7, cArr, i8, this.f63228 - i7);
        }
        this.f63228 = (short) (this.f63228 + i9);
        if (!z) {
            i6 = 0;
        }
        Character.toChars(i2, cArr, iM46173 + i6);
        if (iM20874 != 2) {
        }
        if (iM20874 == 1) {
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m46177(int i) {
        return this.f63227[i];
    }
}
