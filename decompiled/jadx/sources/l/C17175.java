package l;

import com.google.android.material.color.MaterialColors;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B08 */
/* JADX INFO: loaded from: classes4.dex */
public class C17175 implements Closeable {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int[] f52625;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String[] f52630;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f52632;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int[] f52633;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f52635;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final StringReader f52639;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f52640;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public EnumC16093 f52636 = EnumC16093.LEGACY_STRICT;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f52634 = 255;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final char[] f52638 = new char[1024];

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f52629 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f52637 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f52627 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f52626 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f52628 = 0;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f52631 = 1;

    public C17175(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f52625 = iArr;
        iArr[0] = 6;
        this.f52630 = new String[32];
        this.f52633 = new int[32];
        this.f52639 = stringReader;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m40405() {
        return this.f52636 == EnumC16093.LENIENT;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40392(EnumC16093 enumC16093) {
        C11003.requireNonNull(enumC16093);
        this.f52636 = enumC16093;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC16093 m40395() {
        return this.f52636;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m40391() throws IOException {
        int iM40403 = this.f52628;
        if (iM40403 == 0) {
            iM40403 = m40403();
        }
        if (iM40403 == 3) {
            m40382(1);
            this.f52633[this.f52631 - 1] = 0;
            this.f52628 = 0;
            return;
        }
        throw m40381("BEGIN_ARRAY");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m40400() throws IOException {
        int iM40403 = this.f52628;
        if (iM40403 == 0) {
            iM40403 = m40403();
        }
        if (iM40403 == 4) {
            int i = this.f52631;
            this.f52631 = i - 1;
            int[] iArr = this.f52633;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.f52628 = 0;
            return;
        }
        throw m40381("END_ARRAY");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m40402() throws IOException {
        int iM40403 = this.f52628;
        if (iM40403 == 0) {
            iM40403 = m40403();
        }
        if (iM40403 == 1) {
            m40382(3);
            this.f52628 = 0;
            return;
        }
        throw m40381("BEGIN_OBJECT");
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void m40410() throws IOException {
        int iM40403 = this.f52628;
        if (iM40403 == 0) {
            iM40403 = m40403();
        }
        if (iM40403 == 2) {
            int i = this.f52631;
            int i2 = i - 1;
            this.f52631 = i2;
            this.f52630[i2] = null;
            int[] iArr = this.f52633;
            int i3 = i - 2;
            iArr[i3] = iArr[i3] + 1;
            this.f52628 = 0;
            return;
        }
        throw m40381("END_OBJECT");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean m40404() throws IOException {
        int iM40403 = this.f52628;
        if (iM40403 == 0) {
            iM40403 = m40403();
        }
        return (iM40403 == 2 || iM40403 == 4 || iM40403 == 17) ? false : true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public EnumC14352 m40398() throws IOException {
        int iM40403 = this.f52628;
        if (iM40403 == 0) {
            iM40403 = m40403();
        }
        switch (iM40403) {
            case 1:
                return EnumC14352.BEGIN_OBJECT;
            case 2:
                return EnumC14352.END_OBJECT;
            case 3:
                return EnumC14352.BEGIN_ARRAY;
            case 4:
                return EnumC14352.END_ARRAY;
            case 5:
            case 6:
                return EnumC14352.BOOLEAN;
            case 7:
                return EnumC14352.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC14352.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC14352.NAME;
            case 15:
            case 16:
                return EnumC14352.NUMBER;
            case 17:
                return EnumC14352.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0184 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:0x0185  */
    /* JADX WARN: Code duplicated, block: B:120:0x0195  */
    /* JADX WARN: Code duplicated, block: B:123:0x019a  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:127:0x01aa A[PHI: r1 r2
      0x01aa: PHI (r1v64 int) = (r1v63 int), (r1v88 int) binds: [B:119:0x0193, B:126:0x01a6] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r2v33 int) = (r2v32 int), (r2v34 int) binds: [B:119:0x0193, B:126:0x01a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:173:0x0222  */
    /* JADX WARN: Code duplicated, block: B:174:0x0224  */
    /* JADX WARN: Code duplicated, block: B:185:0x0244 A[DONT_INVERT, PHI: r1
      0x0244: PHI (r1v75 char) = (r1v74 char), (r1v79 char) binds: [B:172:0x0220, B:184:0x0243] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:186:0x0246  */
    /* JADX WARN: Code duplicated, block: B:198:0x0262  */
    /* JADX WARN: Code duplicated, block: B:200:0x0265  */
    /* JADX WARN: Code duplicated, block: B:203:0x026a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x0275 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:209:0x0276  */
    /* JADX WARN: Code duplicated, block: B:211:0x0280  */
    /* JADX WARN: Code duplicated, block: B:213:0x0288  */
    /* JADX WARN: Code duplicated, block: B:274:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x01a2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m40403() throws IOException {
        int iM40380;
        String str;
        String str2;
        int i;
        char c;
        int i2;
        int i3;
        char c2;
        int i4;
        boolean z;
        char c3;
        int i5;
        int i6;
        char c4;
        int[] iArr = this.f52625;
        int i7 = this.f52631 - 1;
        int i8 = iArr[i7];
        char[] cArr = this.f52638;
        if (i8 == 1) {
            iArr[i7] = 2;
        } else if (i8 == 2) {
            int iM40381 = m40380(true);
            if (iM40381 != 44) {
                if (iM40381 != 59) {
                    if (iM40381 == 93) {
                        this.f52628 = 4;
                        return 4;
                    }
                    m40377("Unterminated array");
                    throw null;
                }
                m40385();
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7] = 4;
                if (i8 == 5 && (iM40380 = m40380(true)) != 44) {
                    if (iM40380 != 59) {
                        if (iM40380 == 125) {
                            this.f52628 = 2;
                            return 2;
                        }
                        m40377("Unterminated object");
                        throw null;
                    }
                    m40385();
                }
                int iM40382 = m40380(true);
                if (iM40382 == 34) {
                    this.f52628 = 13;
                    return 13;
                }
                if (iM40382 == 39) {
                    m40385();
                    this.f52628 = 12;
                    return 12;
                }
                if (iM40382 == 125) {
                    if (i8 != 5) {
                        this.f52628 = 2;
                        return 2;
                    }
                    m40377("Expected name");
                    throw null;
                }
                m40385();
                this.f52629--;
                if (m40383((char) iM40382)) {
                    this.f52628 = 14;
                    return 14;
                }
                m40377("Expected name");
                throw null;
            }
            if (i8 == 4) {
                iArr[i7] = 5;
                int iM40383 = m40380(true);
                if (iM40383 != 58) {
                    if (iM40383 == 61) {
                        m40385();
                        if (this.f52629 < this.f52637 || m40378(1)) {
                            int i9 = this.f52629;
                            if (cArr[i9] == '>') {
                                this.f52629 = i9 + 1;
                            }
                        }
                    } else {
                        m40377("Expected ':'");
                        throw null;
                    }
                }
            } else if (i8 == 6) {
                if (this.f52636 == EnumC16093.LENIENT) {
                    m40380(true);
                    int i10 = this.f52629;
                    this.f52629 = i10 - 1;
                    if (i10 + 4 <= this.f52637 || m40378(5)) {
                        int i11 = this.f52629;
                        if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == '\n') {
                            this.f52629 = i11 + 5;
                        }
                    }
                }
                this.f52625[this.f52631 - 1] = 7;
            } else if (i8 == 7) {
                if (m40380(false) == -1) {
                    this.f52628 = 17;
                    return 17;
                }
                m40385();
                this.f52629--;
            } else if (i8 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iM40384 = m40380(true);
        if (iM40384 == 34) {
            this.f52628 = 9;
            return 9;
        }
        if (iM40384 == 39) {
            m40385();
            this.f52628 = 8;
            return 8;
        }
        if (iM40384 != 44 && iM40384 != 59) {
            if (iM40384 == 91) {
                this.f52628 = 3;
                return 3;
            }
            if (iM40384 != 93) {
                if (iM40384 == 123) {
                    this.f52628 = 1;
                    return 1;
                }
                int i12 = this.f52629 - 1;
                this.f52629 = i12;
                char c5 = cArr[i12];
                if (c5 == 't' || c5 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i = 5;
                } else {
                    if (c5 != 'f' && c5 != 'F') {
                        if (c5 != 'n' && c5 != 'N') {
                            i = 0;
                            break;
                        }
                        str = "null";
                        str2 = "NULL";
                        i = 7;
                        if (i != 0) {
                            return i;
                        }
                        i2 = this.f52629;
                        i3 = this.f52637;
                        long j = 0;
                        c2 = 0;
                        i4 = 0;
                        z = true;
                        boolean z2 = false;
                        while (true) {
                            if (i2 + i4 != i3) {
                                if (i4 != cArr.length) {
                                    if (!m40378(i4 + 1)) {
                                        i2 = this.f52629;
                                        i3 = this.f52637;
                                        c3 = cArr[i2 + i4];
                                        if (c3 != '+') {
                                            if (c3 != 'E') {
                                                if (c2 != 2) {
                                                }
                                                c2 = 5;
                                                i4++;
                                            } else {
                                                if (c2 != 2) {
                                                }
                                                c2 = 5;
                                                i4++;
                                            }
                                            if (i6 != 0) {
                                                return i6;
                                            }
                                            if (m40383(cArr[this.f52629])) {
                                                m40377("Expected value");
                                                throw null;
                                            }
                                            m40385();
                                            this.f52628 = 10;
                                            return 10;
                                        }
                                        if (c2 != 5) {
                                        }
                                        c2 = 6;
                                        i4++;
                                    }
                                    c4 = 2;
                                    if (c2 != 2) {
                                        if (c2 != c4) {
                                        }
                                        this.f52640 = i4;
                                        i6 = 16;
                                        this.f52628 = 16;
                                    } else {
                                        if (!z) {
                                        }
                                        c4 = 2;
                                        if (c2 != c4) {
                                        }
                                        this.f52640 = i4;
                                        i6 = 16;
                                        this.f52628 = 16;
                                    }
                                    if (i6 != 0) {
                                        return i6;
                                    }
                                    if (m40383(cArr[this.f52629])) {
                                        m40377("Expected value");
                                        throw null;
                                    }
                                    m40385();
                                    this.f52628 = 10;
                                    return 10;
                                }
                            } else {
                                c3 = cArr[i2 + i4];
                                if (c3 != '+') {
                                    if (c3 != 'E' || c3 == 'e') {
                                        if (c2 != 2 || c2 == 4) {
                                            c2 = 5;
                                            i4++;
                                        }
                                    } else if (c3 == '-') {
                                        if (c2 == 0) {
                                            c2 = 1;
                                            z2 = true;
                                        } else {
                                            if (c2 != 5) {
                                            }
                                            c2 = 6;
                                        }
                                        i4++;
                                    } else if (c3 != '.') {
                                        if (c3 >= '0' && c3 <= '9') {
                                            if (c2 == 1 || c2 == 0) {
                                                i5 = i4;
                                                j = -(c3 - '0');
                                                c2 = 2;
                                            } else {
                                                if (c2 != 2) {
                                                    i5 = i4;
                                                    if (c2 == 3) {
                                                        c2 = 4;
                                                    } else if (c2 == 5 || c2 == 6) {
                                                        c2 = 7;
                                                    }
                                                } else if (j != 0) {
                                                    i5 = i4;
                                                    long j2 = (10 * j) - ((long) (c3 - '0'));
                                                    z = (j > -922337203685477580L || (j == -922337203685477580L && j2 < j)) & z;
                                                    j = j2;
                                                }
                                                i4 = i5;
                                                i4++;
                                            }
                                            i4 = i5;
                                            i4++;
                                        } else if (!m40383(c3)) {
                                            c4 = 2;
                                            if (c2 != 2) {
                                                if (c2 != c4 || c2 == 4 || c2 == 7) {
                                                    this.f52640 = i4;
                                                    i6 = 16;
                                                    this.f52628 = 16;
                                                }
                                            } else if (!z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
                                                if (!z2) {
                                                    j = -j;
                                                }
                                                this.f52632 = j;
                                                this.f52629 += i4;
                                                i6 = 15;
                                                this.f52628 = 15;
                                            } else {
                                                c4 = 2;
                                                if (c2 != c4) {
                                                }
                                                this.f52640 = i4;
                                                i6 = 16;
                                                this.f52628 = 16;
                                            }
                                        }
                                    } else if (c2 == 2) {
                                        c2 = 3;
                                        i4++;
                                    }
                                    if (i6 != 0) {
                                        return i6;
                                    }
                                    if (m40383(cArr[this.f52629])) {
                                        m40377("Expected value");
                                        throw null;
                                    }
                                    m40385();
                                    this.f52628 = 10;
                                    return 10;
                                }
                                if (c2 != 5) {
                                }
                                c2 = 6;
                                i4++;
                            }
                            i6 = 0;
                            if (i6 != 0) {
                                return i6;
                            }
                            if (m40383(cArr[this.f52629])) {
                                m40377("Expected value");
                                throw null;
                            }
                            m40385();
                            this.f52628 = 10;
                            return 10;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i = 6;
                }
                boolean z3 = this.f52636 != EnumC16093.STRICT;
                int length = str.length();
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        if ((this.f52629 + i13 < this.f52637 || m40378(i13 + 1)) && ((c = cArr[this.f52629 + i13]) == str.charAt(i13) || (z3 && c == str2.charAt(i13)))) {
                            i13++;
                        }
                    } else {
                        if ((this.f52629 + length >= this.f52637 && !m40378(length + 1)) || !m40383(cArr[this.f52629 + length])) {
                            this.f52629 += length;
                            this.f52628 = i;
                            break;
                        }
                        break;
                    }
                    i = 0;
                    break;
                }
                if (i != 0) {
                    return i;
                }
                i2 = this.f52629;
                i3 = this.f52637;
                long j3 = 0;
                c2 = 0;
                i4 = 0;
                z = true;
                boolean z4 = false;
                while (true) {
                    if (i2 + i4 != i3) {
                        if (i4 != cArr.length) {
                            if (!m40378(i4 + 1)) {
                                i2 = this.f52629;
                                i3 = this.f52637;
                                c3 = cArr[i2 + i4];
                                if (c3 != '+') {
                                    if (c3 != 'E') {
                                        if (c2 != 2) {
                                        }
                                        c2 = 5;
                                        i4++;
                                    } else {
                                        if (c2 != 2) {
                                        }
                                        c2 = 5;
                                        i4++;
                                    }
                                    if (i6 != 0) {
                                        return i6;
                                    }
                                    if (m40383(cArr[this.f52629])) {
                                        m40377("Expected value");
                                        throw null;
                                    }
                                    m40385();
                                    this.f52628 = 10;
                                    return 10;
                                }
                                if (c2 != 5) {
                                }
                                c2 = 6;
                                i4++;
                            }
                            c4 = 2;
                            if (c2 != 2) {
                                if (c2 != c4) {
                                }
                                this.f52640 = i4;
                                i6 = 16;
                                this.f52628 = 16;
                            } else {
                                if (!z) {
                                }
                                c4 = 2;
                                if (c2 != c4) {
                                }
                                this.f52640 = i4;
                                i6 = 16;
                                this.f52628 = 16;
                            }
                            if (i6 != 0) {
                                return i6;
                            }
                            if (m40383(cArr[this.f52629])) {
                                m40377("Expected value");
                                throw null;
                            }
                            m40385();
                            this.f52628 = 10;
                            return 10;
                        }
                    } else {
                        c3 = cArr[i2 + i4];
                        if (c3 != '+') {
                            if (c3 != 'E') {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i4++;
                            } else {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i4++;
                            }
                            if (i6 != 0) {
                                return i6;
                            }
                            if (m40383(cArr[this.f52629])) {
                                m40377("Expected value");
                                throw null;
                            }
                            m40385();
                            this.f52628 = 10;
                            return 10;
                        }
                        if (c2 != 5) {
                        }
                        c2 = 6;
                        i4++;
                    }
                    i6 = 0;
                    if (i6 != 0) {
                        return i6;
                    }
                    if (m40383(cArr[this.f52629])) {
                        m40377("Expected value");
                        throw null;
                    }
                    m40385();
                    this.f52628 = 10;
                    return 10;
                }
            }
            if (i8 == 1) {
                this.f52628 = 4;
                return 4;
            }
        }
        if (i8 == 1 || i8 == 2) {
            m40385();
            this.f52629--;
            this.f52628 = 7;
            return 7;
        }
        m40377("Unexpected value");
        throw null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m40383(char c) throws C6592 {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m40385();
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m40396() throws IOException {
        String strM40386;
        int iM40403 = this.f52628;
        if (iM40403 == 0) {
            iM40403 = m40403();
        }
        if (iM40403 == 14) {
            strM40386 = m40379();
        } else if (iM40403 == 12) {
            strM40386 = m40386('\'');
        } else if (iM40403 == 13) {
            strM40386 = m40386('\"');
        } else {
            throw m40381("a name");
        }
        this.f52628 = 0;
        this.f52630[this.f52631 - 1] = strM40386;
        return strM40386;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String m40399() throws IOException {
        String str;
        int iM40403 = this.f52628;
        if (iM40403 == 0) {
            iM40403 = m40403();
        }
        if (iM40403 == 10) {
            str = m40379();
        } else if (iM40403 == 8) {
            str = m40386('\'');
        } else if (iM40403 == 9) {
            str = m40386('\"');
        } else if (iM40403 == 11) {
            str = this.f52635;
            this.f52635 = null;
        } else if (iM40403 == 15) {
            str = Long.toString(this.f52632);
        } else if (iM40403 == 16) {
            str = new String(this.f52638, this.f52629, this.f52640);
            this.f52629 += this.f52640;
        } else {
            throw m40381("a string");
        }
        this.f52628 = 0;
        int[] iArr = this.f52633;
        int i = this.f52631 - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean m40401() throws IOException {
        int iM40403 = this.f52628;
        if (iM40403 == 0) {
            iM40403 = m40403();
        }
        if (iM40403 == 5) {
            this.f52628 = 0;
            int[] iArr = this.f52633;
            int i = this.f52631 - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM40403 == 6) {
            this.f52628 = 0;
            int[] iArr2 = this.f52633;
            int i2 = this.f52631 - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw m40381("a boolean");
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public void m40394() {
        int iM40403 = this.f52628;
        if (iM40403 == 0) {
            iM40403 = m40403();
        }
        if (iM40403 == 7) {
            this.f52628 = 0;
            int[] iArr = this.f52633;
            int i = this.f52631 - 1;
            iArr[i] = iArr[i] + 1;
            return;
        }
        throw m40381("null");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public double m40407() throws IOException {
        int iM40403 = this.f52628;
        if (iM40403 == 0) {
            iM40403 = m40403();
        }
        if (iM40403 == 15) {
            this.f52628 = 0;
            int[] iArr = this.f52633;
            int i = this.f52631 - 1;
            iArr[i] = iArr[i] + 1;
            return this.f52632;
        }
        if (iM40403 == 16) {
            this.f52635 = new String(this.f52638, this.f52629, this.f52640);
            this.f52629 += this.f52640;
        } else if (iM40403 == 8 || iM40403 == 9) {
            this.f52635 = m40386(iM40403 == 8 ? '\'' : '\"');
        } else if (iM40403 == 10) {
            this.f52635 = m40379();
        } else if (iM40403 != 11) {
            throw m40381("a double");
        }
        this.f52628 = 11;
        double d = Double.parseDouble(this.f52635);
        if (this.f52636 != EnumC16093.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            m40377("JSON forbids NaN and infinities: " + d);
            throw null;
        }
        this.f52635 = null;
        this.f52628 = 0;
        int[] iArr2 = this.f52633;
        int i2 = this.f52631 - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long m40406() throws IOException {
        int iM40403 = this.f52628;
        if (iM40403 == 0) {
            iM40403 = m40403();
        }
        if (iM40403 == 15) {
            this.f52628 = 0;
            int[] iArr = this.f52633;
            int i = this.f52631 - 1;
            iArr[i] = iArr[i] + 1;
            return this.f52632;
        }
        if (iM40403 == 16) {
            this.f52635 = new String(this.f52638, this.f52629, this.f52640);
            this.f52629 += this.f52640;
        } else if (iM40403 == 8 || iM40403 == 9 || iM40403 == 10) {
            if (iM40403 == 10) {
                this.f52635 = m40379();
            } else {
                this.f52635 = m40386(iM40403 == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.f52635);
                this.f52628 = 0;
                int[] iArr2 = this.f52633;
                int i2 = this.f52631 - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw m40381("a long");
        }
        this.f52628 = 11;
        double d = Double.parseDouble(this.f52635);
        long j2 = (long) d;
        if (j2 != d) {
            throw new NumberFormatException("Expected a long but was " + this.f52635 + m40390());
        }
        this.f52635 = null;
        this.f52628 = 0;
        int[] iArr3 = this.f52633;
        int i3 = this.f52631 - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private String m40386(char c) throws C6592 {
        int i;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i2 = this.f52629;
            int i3 = this.f52637;
            while (true) {
                i = i2;
                while (true) {
                    cArr = this.f52638;
                    if (i < i3) {
                        int i4 = i + 1;
                        char c2 = cArr[i];
                        if (this.f52636 == EnumC16093.STRICT && c2 < ' ') {
                            m40377("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                            throw null;
                        }
                        if (c2 == c) {
                            this.f52629 = i4;
                            int i5 = (i4 - i2) - 1;
                            if (sb == null) {
                                return new String(cArr, i2, i5);
                            }
                            sb.append(cArr, i2, i5);
                            return sb.toString();
                        }
                        if (c2 == '\\') {
                            this.f52629 = i4;
                            int i6 = i4 - i2;
                            int i7 = i6 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i6 * 2, 16));
                            }
                            sb.append(cArr, i2, i7);
                            sb.append(m40384());
                            i2 = this.f52629;
                            i3 = this.f52637;
                        } else {
                            if (c2 == '\n') {
                                this.f52627++;
                                this.f52626 = i4;
                            }
                            i = i4;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i - i2) * 2, 16));
            }
            sb.append(cArr, i2, i - i2);
            this.f52629 = i;
        } while (m40378(1));
        m40377("Unterminated string");
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private String m40379() throws C6592 {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.f52629;
                int i4 = i3 + i2;
                int i5 = this.f52637;
                char[] cArr = this.f52638;
                if (i4 < i5) {
                    char c = cArr[i3 + i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        m40385();
                    }
                    i = i2;
                } else if (i2 < cArr.length) {
                    if (!m40378(i2 + 1)) {
                        i = i2;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(cArr, this.f52629, i2);
                    this.f52629 += i2;
                    if (!m40378(1)) {
                    }
                }
                if (sb == null) {
                    string = new String(cArr, this.f52629, i);
                } else {
                    sb.append(cArr, this.f52629, i);
                    string = sb.toString();
                }
                this.f52629 += i;
                return string;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m40388(char c) throws C6592 {
        do {
            int i = this.f52629;
            int i2 = this.f52637;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.f52638[i];
                if (c2 == c) {
                    this.f52629 = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.f52629 = i3;
                    m40384();
                    i = this.f52629;
                    i2 = this.f52637;
                } else {
                    if (c2 == '\n') {
                        this.f52627++;
                        this.f52626 = i3;
                    }
                    i = i3;
                }
            }
            this.f52629 = i;
        } while (m40378(1));
        m40377("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    private void m40387() throws C6592 {
        do {
            int i = 0;
            while (true) {
                int i2 = this.f52629;
                if (i2 + i < this.f52637) {
                    char c = this.f52638[i2 + i];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                    break;
                                                default:
                                                    i++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        m40385();
                    }
                    this.f52629 += i;
                    return;
                }
                this.f52629 = i2 + i;
            }
        } while (m40378(1));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int m40408() throws IOException {
        int iM40403 = this.f52628;
        if (iM40403 == 0) {
            iM40403 = m40403();
        }
        if (iM40403 == 15) {
            long j = this.f52632;
            int i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + this.f52632 + m40390());
            }
            this.f52628 = 0;
            int[] iArr = this.f52633;
            int i2 = this.f52631 - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iM40403 == 16) {
            this.f52635 = new String(this.f52638, this.f52629, this.f52640);
            this.f52629 += this.f52640;
        } else if (iM40403 == 8 || iM40403 == 9 || iM40403 == 10) {
            if (iM40403 == 10) {
                this.f52635 = m40379();
            } else {
                this.f52635 = m40386(iM40403 == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.f52635);
                this.f52628 = 0;
                int[] iArr2 = this.f52633;
                int i4 = this.f52631 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw m40381("an int");
        }
        this.f52628 = 11;
        double d = Double.parseDouble(this.f52635);
        int i5 = (int) d;
        if (i5 != d) {
            throw new NumberFormatException("Expected an int but was " + this.f52635 + m40390());
        }
        this.f52635 = null;
        this.f52628 = 0;
        int[] iArr3 = this.f52633;
        int i6 = this.f52631 - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f52628 = 0;
        this.f52625[0] = 8;
        this.f52631 = 1;
        this.f52639.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public void m40409() throws IOException {
        int i = 0;
        do {
            int iM40403 = this.f52628;
            if (iM40403 == 0) {
                iM40403 = m40403();
            }
            switch (iM40403) {
                case 1:
                    m40382(3);
                    i++;
                    this.f52628 = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f52630[this.f52631 - 1] = null;
                    }
                    this.f52631--;
                    i--;
                    this.f52628 = 0;
                    break;
                case 3:
                    m40382(1);
                    i++;
                    this.f52628 = 0;
                    break;
                case 4:
                    this.f52631--;
                    i--;
                    this.f52628 = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f52628 = 0;
                    break;
                case 8:
                    m40388('\'');
                    this.f52628 = 0;
                    break;
                case 9:
                    m40388('\"');
                    this.f52628 = 0;
                    break;
                case 10:
                    m40387();
                    this.f52628 = 0;
                    break;
                case 12:
                    m40388('\'');
                    if (i == 0) {
                        this.f52630[this.f52631 - 1] = "<skipped>";
                    }
                    this.f52628 = 0;
                    break;
                case 13:
                    m40388('\"');
                    if (i == 0) {
                        this.f52630[this.f52631 - 1] = "<skipped>";
                    }
                    this.f52628 = 0;
                    break;
                case 14:
                    m40387();
                    if (i == 0) {
                        this.f52630[this.f52631 - 1] = "<skipped>";
                    }
                    this.f52628 = 0;
                    break;
                case 16:
                    this.f52629 += this.f52640;
                    this.f52628 = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f52633;
        int i2 = this.f52631 - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m40382(int i) throws C6592 {
        int i2 = this.f52631;
        int i3 = i2 - 1;
        int i4 = this.f52634;
        if (i3 >= i4) {
            StringBuilder sbM32308 = C13325.m32308(i4, "Nesting limit ", " reached");
            sbM32308.append(m40390());
            throw new C6592(sbM32308.toString());
        }
        int[] iArr = this.f52625;
        if (i2 == iArr.length) {
            int i5 = i2 * 2;
            this.f52625 = Arrays.copyOf(iArr, i5);
            this.f52633 = Arrays.copyOf(this.f52633, i5);
            this.f52630 = (String[]) Arrays.copyOf(this.f52630, i5);
        }
        int[] iArr2 = this.f52625;
        int i6 = this.f52631;
        this.f52631 = i6 + 1;
        iArr2[i6] = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m40378(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.f52626;
        int i5 = this.f52629;
        this.f52626 = i4 - i5;
        int i6 = this.f52637;
        char[] cArr = this.f52638;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f52637 = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f52637 = 0;
        }
        this.f52629 = 0;
        do {
            int i8 = this.f52637;
            int i9 = this.f52639.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f52637 + i9;
            this.f52637 = i2;
            if (this.f52627 == 0 && (i3 = this.f52626) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f52629++;
                this.f52626 = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m40380(boolean z) throws IOException {
        int i = this.f52629;
        int i2 = this.f52637;
        while (true) {
            if (i == i2) {
                this.f52629 = i;
                if (!m40378(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m40390());
                }
                i = this.f52629;
                i2 = this.f52637;
            }
            int i3 = i + 1;
            char[] cArr = this.f52638;
            char c = cArr[i];
            if (c == '\n') {
                this.f52627++;
                this.f52626 = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f52629 = i3;
                    if (i3 == i2) {
                        this.f52629 = i;
                        boolean zM40378 = m40378(2);
                        this.f52629++;
                        if (!zM40378) {
                        }
                        return c;
                    }
                    m40385();
                    int i4 = this.f52629;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f52629 = i4 + 1;
                        while (true) {
                            if (this.f52629 + 2 > this.f52637 && !m40378(2)) {
                                m40377("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.f52629;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= 2) {
                                        i = this.f52629 + 2;
                                        i2 = this.f52637;
                                        break;
                                    }
                                    if (cArr[this.f52629 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.f52627++;
                                this.f52626 = i5 + 1;
                            }
                            this.f52629++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.f52629 = i4 + 1;
                        m40389();
                        i = this.f52629;
                        i2 = this.f52637;
                    }
                } else if (c == '#') {
                    this.f52629 = i3;
                    m40385();
                    m40389();
                    i = this.f52629;
                    i2 = this.f52637;
                } else {
                    this.f52629 = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m40385() throws C6592 {
        if (this.f52636 == EnumC16093.LENIENT) {
            return;
        }
        m40377("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    private void m40389() {
        char c;
        do {
            if (this.f52629 >= this.f52637 && !m40378(1)) {
                return;
            }
            int i = this.f52629;
            int i2 = i + 1;
            this.f52629 = i2;
            c = this.f52638[i];
            if (c == '\n') {
                this.f52627++;
                this.f52626 = i2;
                return;
            }
        } while (c != '\r');
    }

    public String toString() {
        return getClass().getSimpleName() + m40390();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String m40390() {
        StringBuilder sbM46682 = C20361.m46682(" at line ", this.f52627 + 1, " column ", " path ", (this.f52629 - this.f52626) + 1);
        sbM46682.append(m40397());
        return sbM46682.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m40376(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.f52631;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.f52625[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.f52633[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f52630[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(C19370.m44628(i3, "Unknown scope value: "));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String m40397() {
        return m40376(false);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String m40393() {
        return m40376(true);
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    private char m40384() throws C6592 {
        int i;
        if (this.f52629 == this.f52637 && !m40378(1)) {
            m40377("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.f52629;
        int i3 = i2 + 1;
        this.f52629 = i3;
        char[] cArr = this.f52638;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c == 'u') {
                            if (i2 + 5 > this.f52637 && !m40378(4)) {
                                m40377("Unterminated escape sequence");
                                throw null;
                            }
                            int i4 = this.f52629;
                            int i5 = i4 + 4;
                            int i6 = 0;
                            while (i4 < i5) {
                                char c2 = cArr[i4];
                                int i7 = i6 << 4;
                                if (c2 >= '0' && c2 <= '9') {
                                    i = c2 - '0';
                                } else if (c2 >= 'a' && c2 <= 'f') {
                                    i = c2 - 'W';
                                } else {
                                    if (c2 < 'A' || c2 > 'F') {
                                        m40377("Malformed Unicode escape \\u".concat(new String(cArr, this.f52629, 4)));
                                        throw null;
                                    }
                                    i = c2 - '7';
                                }
                                i6 = i7 + i;
                                i4++;
                            }
                            this.f52629 += 4;
                            return (char) i6;
                        }
                        m40377("Invalid escape sequence");
                        throw null;
                    }
                }
            }
            return c;
        }
        if (this.f52636 == EnumC16093.STRICT) {
            m40377("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f52627++;
        this.f52626 = i3;
        if (this.f52636 == EnumC16093.STRICT) {
            m40377("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40377(String str) throws C6592 {
        StringBuilder sbM15339 = C5368.m15339(str);
        sbM15339.append(m40390());
        sbM15339.append("\nSee ");
        sbM15339.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new C6592(sbM15339.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public IllegalStateException m40381(String str) {
        String str2 = m40398() == EnumC14352.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbM9834 = C3200.m9834("Expected ", str, " but was ");
        sbM9834.append(m40398());
        sbM9834.append(m40390());
        sbM9834.append("\nSee ");
        sbM9834.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbM9834.toString());
    }

    static {
        AbstractC23149.f74411 = new C17881();
    }
}
