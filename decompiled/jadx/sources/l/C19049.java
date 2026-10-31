package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩴ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1TP */
/* JADX INFO: loaded from: classes4.dex */
public final class C19049 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f59994;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f59995;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public char[] f59996;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f59997;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long[] f59998;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public short f59999;

    public C19049(int i, long j) {
        this.f59994 = i;
        this.f59996 = new char[(int) (i * 1.5f)];
        this.f59998 = new long[i];
        m43906(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43907(C19049 c19049, int i, int i2, int i3) {
        int codePoint;
        this.f59995 |= c19049.f59995;
        int iM43904 = c19049.m43904(i);
        int iM43905 = c19049.m43904(i2);
        boolean z = i > 0 && c19049.m43902(i + (-1));
        char[] cArrCopyOf = c19049.f59996;
        if (this == c19049) {
            cArrCopyOf = Arrays.copyOf(cArrCopyOf, cArrCopyOf.length);
        }
        int i4 = 0;
        while (iM43904 < iM43905) {
            char c = cArrCopyOf[iM43904];
            if (Character.isHighSurrogate(c)) {
                codePoint = c;
                iM43904++;
                codePoint = Character.toCodePoint(c, cArrCopyOf[iM43904]);
            }
            if (z) {
                codePoint = 32;
                z = false;
            }
            int iM18920 = C6991.m18920(codePoint);
            if (iM18920 > 0) {
                i3 += i4;
                i += i4;
                i4 = iM18920;
            }
            m43905(i3, codePoint, c19049.f59998[i]);
            iM43904++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m43903() {
        return this.f59999;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m43909() {
        short s = this.f59999;
        for (int i = 0; i < s; i++) {
            if (this.f59996[i] != ' ') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m43904(int i) {
        if (i == this.f59994) {
            return this.f59999;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            char c = this.f59996[i2];
            boolean zIsHighSurrogate = Character.isHighSurrogate(c);
            int i5 = c;
            if (zIsHighSurrogate) {
                int codePoint = Character.toCodePoint(c, this.f59996[i4]);
                i4 = i2 + 2;
                i5 = codePoint;
            }
            int iM18920 = C6991.m18920(i5);
            if (iM18920 > 0) {
                i3 += iM18920;
                if (i3 == i) {
                    while (i4 < this.f59999) {
                        if (Character.isHighSurrogate(this.f59996[i4])) {
                            char[] cArr = this.f59996;
                            if (C6991.m18920(Character.toCodePoint(cArr[i4], cArr[i4 + 1])) > 0) {
                                break;
                            }
                            i4 += 2;
                        } else {
                            if (C6991.m18920(this.f59996[i4]) > 0) {
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m43902(int i) {
        int codePoint;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f59999) {
            int i4 = i2 + 1;
            char c = this.f59996[i2];
            if (Character.isHighSurrogate(c)) {
                i2 += 2;
                codePoint = Character.toCodePoint(c, this.f59996[i4]);
            } else {
                i2 = i4;
                codePoint = c;
            }
            int iM18920 = C6991.m18920(codePoint);
            if (iM18920 > 0) {
                if (i3 == i && iM18920 == 2) {
                    return true;
                }
                i3 += iM18920;
                if (i3 > i) {
                    break;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43906(long j) {
        Arrays.fill(this.f59996, ' ');
        Arrays.fill(this.f59998, j);
        this.f59999 = (short) this.f59994;
        this.f59995 = false;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43905(int i, int i2, long j) {
        int i3;
        char[] cArr;
        int iM43904;
        char c;
        boolean zIsHighSurrogate;
        int codePoint;
        int iM18920;
        int i4;
        int i5;
        int iM43905;
        int i6;
        int iCharCount;
        int i7;
        int i8;
        int i9;
        short s;
        int i10;
        this.f59998[i] = j;
        int iM18921 = C6991.m18920(i2);
        if (!this.f59995) {
            if (i2 >= 65536 || iM18921 != 1) {
                this.f59995 = true;
            } else {
                this.f59996[i] = (char) i2;
                return;
            }
        }
        boolean z = iM18921 <= 0;
        boolean z2 = i > 0 && m43902(i + (-1));
        if (z) {
            if (z2) {
                i3 = i - 1;
            }
            cArr = this.f59996;
            iM43904 = m43904(i3);
            c = cArr[iM43904];
            zIsHighSurrogate = Character.isHighSurrogate(c);
            codePoint = c;
            if (zIsHighSurrogate) {
                codePoint = Character.toCodePoint(c, cArr[iM43904 + 1]);
            }
            iM18920 = C6991.m18920(codePoint);
            i4 = i3 + iM18920;
            i5 = this.f59994;
            if (i4 < i5) {
                iM43905 = m43904(i4);
            } else {
                iM43905 = this.f59999;
            }
            i6 = iM43905 - iM43904;
            iCharCount = Character.charCount(i2);
            if (z) {
                iCharCount += i6;
            }
            i7 = iM43904 + i6;
            i8 = iM43904 + iCharCount;
            i9 = iCharCount - i6;
            if (i9 > 0) {
                s = this.f59999;
                i10 = s - i7;
                if (s + i9 > cArr.length) {
                    char[] cArr2 = new char[cArr.length + i5];
                    System.arraycopy(cArr, 0, cArr2, 0, i7);
                    System.arraycopy(cArr, i7, cArr2, i8, i10);
                    this.f59996 = cArr2;
                    cArr = cArr2;
                } else {
                    System.arraycopy(cArr, i7, cArr, i8, i10);
                }
            } else if (i9 < 0) {
                System.arraycopy(cArr, i7, cArr, i8, this.f59999 - i7);
            }
            this.f59999 = (short) (this.f59999 + i9);
            if (!z) {
                i6 = 0;
            }
            Character.toChars(i2, cArr, iM43904 + i6);
            if (iM18920 != 2 && iM18921 == 1) {
                short s2 = this.f59999;
                if (s2 + 1 > cArr.length) {
                    char[] cArr3 = new char[cArr.length + i5];
                    System.arraycopy(cArr, 0, cArr3, 0, i8);
                    System.arraycopy(cArr, i8, cArr3, i8 + 1, this.f59999 - i8);
                    this.f59996 = cArr3;
                    cArr = cArr3;
                } else {
                    System.arraycopy(cArr, i8, cArr, i8 + 1, s2 - i8);
                }
                cArr[i8] = ' ';
                this.f59999 = (short) (this.f59999 + 1);
                return;
            }
            if (iM18920 == 1 || iM18921 != 2) {
            }
            if (i3 == i5 - 1) {
                throw new IllegalArgumentException();
            }
            if (i3 == i5 - 2) {
                this.f59999 = (short) i8;
                return;
            }
            int i11 = (Character.isHighSurrogate(this.f59996[i8]) ? 2 : 1) + i8;
            System.arraycopy(cArr, i11, cArr, i8, this.f59999 - i11);
            this.f59999 = (short) (this.f59999 - (i11 - i8));
            return;
        }
        if (z2) {
            m43905(i - 1, 32, j);
        }
        if (iM18921 == 2) {
            int i12 = i + 1;
            if (m43902(i12)) {
                m43905(i12, 32, j);
            }
        }
        i3 = i;
        cArr = this.f59996;
        iM43904 = m43904(i3);
        c = cArr[iM43904];
        zIsHighSurrogate = Character.isHighSurrogate(c);
        codePoint = c;
        if (zIsHighSurrogate) {
            codePoint = Character.toCodePoint(c, cArr[iM43904 + 1]);
        }
        iM18920 = C6991.m18920(codePoint);
        i4 = i3 + iM18920;
        i5 = this.f59994;
        if (i4 < i5) {
            iM43905 = m43904(i4);
        } else {
            iM43905 = this.f59999;
        }
        i6 = iM43905 - iM43904;
        iCharCount = Character.charCount(i2);
        if (z) {
            iCharCount += i6;
        }
        i7 = iM43904 + i6;
        i8 = iM43904 + iCharCount;
        i9 = iCharCount - i6;
        if (i9 > 0) {
            s = this.f59999;
            i10 = s - i7;
            if (s + i9 > cArr.length) {
                char[] cArr4 = new char[cArr.length + i5];
                System.arraycopy(cArr, 0, cArr4, 0, i7);
                System.arraycopy(cArr, i7, cArr4, i8, i10);
                this.f59996 = cArr4;
                cArr = cArr4;
            } else {
                System.arraycopy(cArr, i7, cArr, i8, i10);
            }
        } else if (i9 < 0) {
            System.arraycopy(cArr, i7, cArr, i8, this.f59999 - i7);
        }
        this.f59999 = (short) (this.f59999 + i9);
        if (!z) {
            i6 = 0;
        }
        Character.toChars(i2, cArr, iM43904 + i6);
        if (iM18920 != 2) {
        }
        if (iM18920 == 1) {
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m43908(int i) {
        return this.f59998[i];
    }
}
