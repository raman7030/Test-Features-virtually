package p067l;

import com.google.android.material.color.MaterialColors;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B08 */
/* JADX INFO: loaded from: classes4.dex */
public class C18691 implements Closeable {

    /* JADX INFO: renamed from: ֫֫ */
    public int[] f55806;

    /* JADX INFO: renamed from: ۤ */
    public String[] f55811;

    /* JADX INFO: renamed from: ۨ */
    public long f55813;

    /* JADX INFO: renamed from: ۫ */
    public int[] f55814;

    /* JADX INFO: renamed from: ܰ */
    public String f55816;

    /* JADX INFO: renamed from: ᩹ */
    public final StringReader f55820;

    /* JADX INFO: renamed from: ᩺ */
    public int f55821;

    /* JADX INFO: renamed from: ܽ֫ */
    public EnumC17663 f55817 = EnumC17663.LEGACY_STRICT;

    /* JADX INFO: renamed from: ۬ */
    public int f55815 = 255;

    /* JADX INFO: renamed from: ᩸ */
    public final char[] f55819 = new char[1024];

    /* JADX INFO: renamed from: ۟ */
    public int f55810 = 0;

    /* JADX INFO: renamed from: ᩶ */
    public int f55818 = 0;

    /* JADX INFO: renamed from: ۙ */
    public int f55808 = 0;

    /* JADX INFO: renamed from: ۗ */
    public int f55807 = 0;

    /* JADX INFO: renamed from: ۛ */
    public int f55809 = 0;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f55812 = 1;

    public C18691(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f55806 = iArr;
        iArr[0] = 6;
        this.f55811 = new String[32];
        this.f55814 = new int[32];
        this.f55820 = stringReader;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m42650() {
        return this.f55817 == EnumC17663.LENIENT;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42637(EnumC17663 enumC17663) {
        C12826.requireNonNull(enumC17663);
        this.f55817 = enumC17663;
    }

    /* JADX INFO: renamed from: ۘ */
    public final EnumC17663 m42640() {
        return this.f55817;
    }

    /* JADX INFO: renamed from: ֫ */
    public void m42636() throws IOException {
        int iM42648 = this.f55809;
        if (iM42648 == 0) {
            iM42648 = m42648();
        }
        if (iM42648 == 3) {
            m42627(1);
            this.f55814[this.f55812 - 1] = 0;
            this.f55809 = 0;
            return;
        }
        throw m42626("BEGIN_ARRAY");
    }

    /* JADX INFO: renamed from: ܳ */
    public void m42645() throws IOException {
        int iM42648 = this.f55809;
        if (iM42648 == 0) {
            iM42648 = m42648();
        }
        if (iM42648 == 4) {
            int i = this.f55812;
            this.f55812 = i - 1;
            int[] iArr = this.f55814;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.f55809 = 0;
            return;
        }
        throw m42626("END_ARRAY");
    }

    /* JADX INFO: renamed from: ܽ */
    public void m42647() throws IOException {
        int iM42648 = this.f55809;
        if (iM42648 == 0) {
            iM42648 = m42648();
        }
        if (iM42648 == 1) {
            m42627(3);
            this.f55809 = 0;
            return;
        }
        throw m42626("BEGIN_OBJECT");
    }

    /* JADX INFO: renamed from: ᩻ */
    public void m42655() throws IOException {
        int iM42648 = this.f55809;
        if (iM42648 == 0) {
            iM42648 = m42648();
        }
        if (iM42648 == 2) {
            int i = this.f55812;
            int i2 = i - 1;
            this.f55812 = i2;
            this.f55811[i2] = null;
            int[] iArr = this.f55814;
            int i3 = i - 2;
            iArr[i3] = iArr[i3] + 1;
            this.f55809 = 0;
            return;
        }
        throw m42626("END_OBJECT");
    }

    /* JADX INFO: renamed from: ᩴ */
    public boolean m42649() throws IOException {
        int iM42648 = this.f55809;
        if (iM42648 == 0) {
            iM42648 = m42648();
        }
        return (iM42648 == 2 || iM42648 == 4 || iM42648 == 17) ? false : true;
    }

    /* JADX INFO: renamed from: ۤ */
    public EnumC16008 m42643() throws IOException {
        int iM42648 = this.f55809;
        if (iM42648 == 0) {
            iM42648 = m42648();
        }
        switch (iM42648) {
            case 1:
                return EnumC16008.BEGIN_OBJECT;
            case 2:
                return EnumC16008.END_OBJECT;
            case 3:
                return EnumC16008.BEGIN_ARRAY;
            case 4:
                return EnumC16008.END_ARRAY;
            case 5:
            case 6:
                return EnumC16008.BOOLEAN;
            case 7:
                return EnumC16008.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC16008.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC16008.NAME;
            case 15:
            case 16:
                return EnumC16008.NUMBER;
            case 17:
                return EnumC16008.END_DOCUMENT;
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
    /* JADX INFO: renamed from: ᩳ */
    public final int m42648() throws IOException {
        int iM42625;
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
        int[] iArr = this.f55806;
        int i7 = this.f55812 - 1;
        int i8 = iArr[i7];
        char[] cArr = this.f55819;
        if (i8 == 1) {
            iArr[i7] = 2;
        } else if (i8 == 2) {
            int iM42626 = m42625(true);
            if (iM42626 != 44) {
                if (iM42626 != 59) {
                    if (iM42626 == 93) {
                        this.f55809 = 4;
                        return 4;
                    }
                    m42622("Unterminated array");
                    throw null;
                }
                m42630();
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7] = 4;
                if (i8 == 5 && (iM42625 = m42625(true)) != 44) {
                    if (iM42625 != 59) {
                        if (iM42625 == 125) {
                            this.f55809 = 2;
                            return 2;
                        }
                        m42622("Unterminated object");
                        throw null;
                    }
                    m42630();
                }
                int iM42627 = m42625(true);
                if (iM42627 == 34) {
                    this.f55809 = 13;
                    return 13;
                }
                if (iM42627 == 39) {
                    m42630();
                    this.f55809 = 12;
                    return 12;
                }
                if (iM42627 == 125) {
                    if (i8 != 5) {
                        this.f55809 = 2;
                        return 2;
                    }
                    m42622("Expected name");
                    throw null;
                }
                m42630();
                this.f55810--;
                if (m42628((char) iM42627)) {
                    this.f55809 = 14;
                    return 14;
                }
                m42622("Expected name");
                throw null;
            }
            if (i8 == 4) {
                iArr[i7] = 5;
                int iM42628 = m42625(true);
                if (iM42628 != 58) {
                    if (iM42628 == 61) {
                        m42630();
                        if (this.f55810 < this.f55818 || m42623(1)) {
                            int i9 = this.f55810;
                            if (cArr[i9] == '>') {
                                this.f55810 = i9 + 1;
                            }
                        }
                    } else {
                        m42622("Expected ':'");
                        throw null;
                    }
                }
            } else if (i8 == 6) {
                if (this.f55817 == EnumC17663.LENIENT) {
                    m42625(true);
                    int i10 = this.f55810;
                    this.f55810 = i10 - 1;
                    if (i10 + 4 <= this.f55818 || m42623(5)) {
                        int i11 = this.f55810;
                        if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == '\n') {
                            this.f55810 = i11 + 5;
                        }
                    }
                }
                this.f55806[this.f55812 - 1] = 7;
            } else if (i8 == 7) {
                if (m42625(false) == -1) {
                    this.f55809 = 17;
                    return 17;
                }
                m42630();
                this.f55810--;
            } else if (i8 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iM42629 = m42625(true);
        if (iM42629 == 34) {
            this.f55809 = 9;
            return 9;
        }
        if (iM42629 == 39) {
            m42630();
            this.f55809 = 8;
            return 8;
        }
        if (iM42629 != 44 && iM42629 != 59) {
            if (iM42629 == 91) {
                this.f55809 = 3;
                return 3;
            }
            if (iM42629 != 93) {
                if (iM42629 == 123) {
                    this.f55809 = 1;
                    return 1;
                }
                int i12 = this.f55810 - 1;
                this.f55810 = i12;
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
                        i2 = this.f55810;
                        i3 = this.f55818;
                        long j = 0;
                        c2 = 0;
                        i4 = 0;
                        z = true;
                        boolean z2 = false;
                        while (true) {
                            if (i2 + i4 != i3) {
                                if (i4 != cArr.length) {
                                    if (!m42623(i4 + 1)) {
                                        i2 = this.f55810;
                                        i3 = this.f55818;
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
                                            if (m42628(cArr[this.f55810])) {
                                                m42622("Expected value");
                                                throw null;
                                            }
                                            m42630();
                                            this.f55809 = 10;
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
                                        this.f55821 = i4;
                                        i6 = 16;
                                        this.f55809 = 16;
                                    } else {
                                        if (!z) {
                                        }
                                        c4 = 2;
                                        if (c2 != c4) {
                                        }
                                        this.f55821 = i4;
                                        i6 = 16;
                                        this.f55809 = 16;
                                    }
                                    if (i6 != 0) {
                                        return i6;
                                    }
                                    if (m42628(cArr[this.f55810])) {
                                        m42622("Expected value");
                                        throw null;
                                    }
                                    m42630();
                                    this.f55809 = 10;
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
                                        } else if (!m42628(c3)) {
                                            c4 = 2;
                                            if (c2 != 2) {
                                                if (c2 != c4 || c2 == 4 || c2 == 7) {
                                                    this.f55821 = i4;
                                                    i6 = 16;
                                                    this.f55809 = 16;
                                                }
                                            } else if (!z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
                                                if (!z2) {
                                                    j = -j;
                                                }
                                                this.f55813 = j;
                                                this.f55810 += i4;
                                                i6 = 15;
                                                this.f55809 = 15;
                                            } else {
                                                c4 = 2;
                                                if (c2 != c4) {
                                                }
                                                this.f55821 = i4;
                                                i6 = 16;
                                                this.f55809 = 16;
                                            }
                                        }
                                    } else if (c2 == 2) {
                                        c2 = 3;
                                        i4++;
                                    }
                                    if (i6 != 0) {
                                        return i6;
                                    }
                                    if (m42628(cArr[this.f55810])) {
                                        m42622("Expected value");
                                        throw null;
                                    }
                                    m42630();
                                    this.f55809 = 10;
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
                            if (m42628(cArr[this.f55810])) {
                                m42622("Expected value");
                                throw null;
                            }
                            m42630();
                            this.f55809 = 10;
                            return 10;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i = 6;
                }
                boolean z3 = this.f55817 != EnumC17663.STRICT;
                int length = str.length();
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        if ((this.f55810 + i13 < this.f55818 || m42623(i13 + 1)) && ((c = cArr[this.f55810 + i13]) == str.charAt(i13) || (z3 && c == str2.charAt(i13)))) {
                            i13++;
                        }
                    } else {
                        if ((this.f55810 + length >= this.f55818 && !m42623(length + 1)) || !m42628(cArr[this.f55810 + length])) {
                            this.f55810 += length;
                            this.f55809 = i;
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
                i2 = this.f55810;
                i3 = this.f55818;
                long j3 = 0;
                c2 = 0;
                i4 = 0;
                z = true;
                boolean z4 = false;
                while (true) {
                    if (i2 + i4 != i3) {
                        if (i4 != cArr.length) {
                            if (!m42623(i4 + 1)) {
                                i2 = this.f55810;
                                i3 = this.f55818;
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
                                    if (m42628(cArr[this.f55810])) {
                                        m42622("Expected value");
                                        throw null;
                                    }
                                    m42630();
                                    this.f55809 = 10;
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
                                this.f55821 = i4;
                                i6 = 16;
                                this.f55809 = 16;
                            } else {
                                if (!z) {
                                }
                                c4 = 2;
                                if (c2 != c4) {
                                }
                                this.f55821 = i4;
                                i6 = 16;
                                this.f55809 = 16;
                            }
                            if (i6 != 0) {
                                return i6;
                            }
                            if (m42628(cArr[this.f55810])) {
                                m42622("Expected value");
                                throw null;
                            }
                            m42630();
                            this.f55809 = 10;
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
                            if (m42628(cArr[this.f55810])) {
                                m42622("Expected value");
                                throw null;
                            }
                            m42630();
                            this.f55809 = 10;
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
                    if (m42628(cArr[this.f55810])) {
                        m42622("Expected value");
                        throw null;
                    }
                    m42630();
                    this.f55809 = 10;
                    return 10;
                }
            }
            if (i8 == 1) {
                this.f55809 = 4;
                return 4;
            }
        }
        if (i8 == 1 || i8 == 2) {
            m42630();
            this.f55810--;
            this.f55809 = 7;
            return 7;
        }
        m42622("Unexpected value");
        throw null;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m42628(char c) throws C8633 {
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
        m42630();
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public String m42641() throws IOException {
        String strM42631;
        int iM42648 = this.f55809;
        if (iM42648 == 0) {
            iM42648 = m42648();
        }
        if (iM42648 == 14) {
            strM42631 = m42624();
        } else if (iM42648 == 12) {
            strM42631 = m42631('\'');
        } else if (iM42648 == 13) {
            strM42631 = m42631('\"');
        } else {
            throw m42626("a name");
        }
        this.f55809 = 0;
        this.f55811[this.f55812 - 1] = strM42631;
        return strM42631;
    }

    /* JADX INFO: renamed from: ۬ */
    public String m42644() throws IOException {
        String str;
        int iM42648 = this.f55809;
        if (iM42648 == 0) {
            iM42648 = m42648();
        }
        if (iM42648 == 10) {
            str = m42624();
        } else if (iM42648 == 8) {
            str = m42631('\'');
        } else if (iM42648 == 9) {
            str = m42631('\"');
        } else if (iM42648 == 11) {
            str = this.f55816;
            this.f55816 = null;
        } else if (iM42648 == 15) {
            str = Long.toString(this.f55813);
        } else if (iM42648 == 16) {
            str = new String(this.f55819, this.f55810, this.f55821);
            this.f55810 += this.f55821;
        } else {
            throw m42626("a string");
        }
        this.f55809 = 0;
        int[] iArr = this.f55814;
        int i = this.f55812 - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX INFO: renamed from: ܶ */
    public boolean m42646() throws IOException {
        int iM42648 = this.f55809;
        if (iM42648 == 0) {
            iM42648 = m42648();
        }
        if (iM42648 == 5) {
            this.f55809 = 0;
            int[] iArr = this.f55814;
            int i = this.f55812 - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM42648 == 6) {
            this.f55809 = 0;
            int[] iArr2 = this.f55814;
            int i2 = this.f55812 - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw m42626("a boolean");
    }

    /* JADX INFO: renamed from: ۗ */
    public void m42639() {
        int iM42648 = this.f55809;
        if (iM42648 == 0) {
            iM42648 = m42648();
        }
        if (iM42648 == 7) {
            this.f55809 = 0;
            int[] iArr = this.f55814;
            int i = this.f55812 - 1;
            iArr[i] = iArr[i] + 1;
            return;
        }
        throw m42626("null");
    }

    /* JADX INFO: renamed from: ᩸ */
    public double m42652() throws IOException {
        int iM42648 = this.f55809;
        if (iM42648 == 0) {
            iM42648 = m42648();
        }
        if (iM42648 == 15) {
            this.f55809 = 0;
            int[] iArr = this.f55814;
            int i = this.f55812 - 1;
            iArr[i] = iArr[i] + 1;
            return this.f55813;
        }
        if (iM42648 == 16) {
            this.f55816 = new String(this.f55819, this.f55810, this.f55821);
            this.f55810 += this.f55821;
        } else if (iM42648 == 8 || iM42648 == 9) {
            this.f55816 = m42631(iM42648 == 8 ? '\'' : '\"');
        } else if (iM42648 == 10) {
            this.f55816 = m42624();
        } else if (iM42648 != 11) {
            throw m42626("a double");
        }
        this.f55809 = 11;
        double d = Double.parseDouble(this.f55816);
        if (this.f55817 != EnumC17663.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            m42622("JSON forbids NaN and infinities: " + d);
            throw null;
        }
        this.f55816 = null;
        this.f55809 = 0;
        int[] iArr2 = this.f55814;
        int i2 = this.f55812 - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    /* JADX INFO: renamed from: ᩶ */
    public long m42651() throws IOException {
        int iM42648 = this.f55809;
        if (iM42648 == 0) {
            iM42648 = m42648();
        }
        if (iM42648 == 15) {
            this.f55809 = 0;
            int[] iArr = this.f55814;
            int i = this.f55812 - 1;
            iArr[i] = iArr[i] + 1;
            return this.f55813;
        }
        if (iM42648 == 16) {
            this.f55816 = new String(this.f55819, this.f55810, this.f55821);
            this.f55810 += this.f55821;
        } else if (iM42648 == 8 || iM42648 == 9 || iM42648 == 10) {
            if (iM42648 == 10) {
                this.f55816 = m42624();
            } else {
                this.f55816 = m42631(iM42648 == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.f55816);
                this.f55809 = 0;
                int[] iArr2 = this.f55814;
                int i2 = this.f55812 - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw m42626("a long");
        }
        this.f55809 = 11;
        double d = Double.parseDouble(this.f55816);
        long j2 = (long) d;
        if (j2 != d) {
            throw new NumberFormatException("Expected a long but was " + this.f55816 + m42635());
        }
        this.f55816 = null;
        this.f55809 = 0;
        int[] iArr3 = this.f55814;
        int i3 = this.f55812 - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    /* JADX INFO: renamed from: ܽ */
    private String m42631(char c) throws C8633 {
        int i;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i2 = this.f55810;
            int i3 = this.f55818;
            while (true) {
                i = i2;
                while (true) {
                    cArr = this.f55819;
                    if (i < i3) {
                        int i4 = i + 1;
                        char c2 = cArr[i];
                        if (this.f55817 == EnumC17663.STRICT && c2 < ' ') {
                            m42622("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                            throw null;
                        }
                        if (c2 == c) {
                            this.f55810 = i4;
                            int i5 = (i4 - i2) - 1;
                            if (sb == null) {
                                return new String(cArr, i2, i5);
                            }
                            sb.append(cArr, i2, i5);
                            return sb.toString();
                        }
                        if (c2 == '\\') {
                            this.f55810 = i4;
                            int i6 = i4 - i2;
                            int i7 = i6 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i6 * 2, 16));
                            }
                            sb.append(cArr, i2, i7);
                            sb.append(m42629());
                            i2 = this.f55810;
                            i3 = this.f55818;
                        } else {
                            if (c2 == '\n') {
                                this.f55808++;
                                this.f55807 = i4;
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
            this.f55810 = i;
        } while (m42623(1));
        m42622("Unterminated string");
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ */
    private String m42624() throws C8633 {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.f55810;
                int i4 = i3 + i2;
                int i5 = this.f55818;
                char[] cArr = this.f55819;
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
                        m42630();
                    }
                    i = i2;
                } else if (i2 < cArr.length) {
                    if (!m42623(i2 + 1)) {
                        i = i2;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(cArr, this.f55810, i2);
                    this.f55810 += i2;
                    if (!m42623(1)) {
                    }
                }
                if (sb == null) {
                    string = new String(cArr, this.f55810, i);
                } else {
                    sb.append(cArr, this.f55810, i);
                    string = sb.toString();
                }
                this.f55810 += i;
                return string;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m42633(char c) throws C8633 {
        do {
            int i = this.f55810;
            int i2 = this.f55818;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.f55819[i];
                if (c2 == c) {
                    this.f55810 = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.f55810 = i3;
                    m42629();
                    i = this.f55810;
                    i2 = this.f55818;
                } else {
                    if (c2 == '\n') {
                        this.f55808++;
                        this.f55807 = i3;
                    }
                    i = i3;
                }
            }
            this.f55810 = i;
        } while (m42623(1));
        m42622("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: ܿ֫ */
    private void m42632() throws C8633 {
        do {
            int i = 0;
            while (true) {
                int i2 = this.f55810;
                if (i2 + i < this.f55818) {
                    char c = this.f55819[i2 + i];
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
                        m42630();
                    }
                    this.f55810 += i;
                    return;
                }
                this.f55810 = i2 + i;
            }
        } while (m42623(1));
    }

    /* JADX INFO: renamed from: ᩹ */
    public int m42653() throws IOException {
        int iM42648 = this.f55809;
        if (iM42648 == 0) {
            iM42648 = m42648();
        }
        if (iM42648 == 15) {
            long j = this.f55813;
            int i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + this.f55813 + m42635());
            }
            this.f55809 = 0;
            int[] iArr = this.f55814;
            int i2 = this.f55812 - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iM42648 == 16) {
            this.f55816 = new String(this.f55819, this.f55810, this.f55821);
            this.f55810 += this.f55821;
        } else if (iM42648 == 8 || iM42648 == 9 || iM42648 == 10) {
            if (iM42648 == 10) {
                this.f55816 = m42624();
            } else {
                this.f55816 = m42631(iM42648 == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.f55816);
                this.f55809 = 0;
                int[] iArr2 = this.f55814;
                int i4 = this.f55812 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw m42626("an int");
        }
        this.f55809 = 11;
        double d = Double.parseDouble(this.f55816);
        int i5 = (int) d;
        if (i5 != d) {
            throw new NumberFormatException("Expected an int but was " + this.f55816 + m42635());
        }
        this.f55816 = null;
        this.f55809 = 0;
        int[] iArr3 = this.f55814;
        int i6 = this.f55812 - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f55809 = 0;
        this.f55806[0] = 8;
        this.f55812 = 1;
        this.f55820.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ᩺ */
    public void m42654() throws IOException {
        int i = 0;
        do {
            int iM42648 = this.f55809;
            if (iM42648 == 0) {
                iM42648 = m42648();
            }
            switch (iM42648) {
                case 1:
                    m42627(3);
                    i++;
                    this.f55809 = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f55811[this.f55812 - 1] = null;
                    }
                    this.f55812--;
                    i--;
                    this.f55809 = 0;
                    break;
                case 3:
                    m42627(1);
                    i++;
                    this.f55809 = 0;
                    break;
                case 4:
                    this.f55812--;
                    i--;
                    this.f55809 = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f55809 = 0;
                    break;
                case 8:
                    m42633('\'');
                    this.f55809 = 0;
                    break;
                case 9:
                    m42633('\"');
                    this.f55809 = 0;
                    break;
                case 10:
                    m42632();
                    this.f55809 = 0;
                    break;
                case 12:
                    m42633('\'');
                    if (i == 0) {
                        this.f55811[this.f55812 - 1] = "<skipped>";
                    }
                    this.f55809 = 0;
                    break;
                case 13:
                    m42633('\"');
                    if (i == 0) {
                        this.f55811[this.f55812 - 1] = "<skipped>";
                    }
                    this.f55809 = 0;
                    break;
                case 14:
                    m42632();
                    if (i == 0) {
                        this.f55811[this.f55812 - 1] = "<skipped>";
                    }
                    this.f55809 = 0;
                    break;
                case 16:
                    this.f55810 += this.f55821;
                    this.f55809 = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f55814;
        int i2 = this.f55812 - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m42627(int i) throws C8633 {
        int i2 = this.f55812;
        int i3 = i2 - 1;
        int i4 = this.f55815;
        if (i3 >= i4) {
            StringBuilder sbM34408 = C15033.m34408(i4, "Nesting limit ", " reached");
            sbM34408.append(m42635());
            throw new C8633(sbM34408.toString());
        }
        int[] iArr = this.f55806;
        if (i2 == iArr.length) {
            int i5 = i2 * 2;
            this.f55806 = Arrays.copyOf(iArr, i5);
            this.f55814 = Arrays.copyOf(this.f55814, i5);
            this.f55811 = (String[]) Arrays.copyOf(this.f55811, i5);
        }
        int[] iArr2 = this.f55806;
        int i6 = this.f55812;
        this.f55812 = i6 + 1;
        iArr2[i6] = i;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m42623(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.f55807;
        int i5 = this.f55810;
        this.f55807 = i4 - i5;
        int i6 = this.f55818;
        char[] cArr = this.f55819;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f55818 = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f55818 = 0;
        }
        this.f55810 = 0;
        do {
            int i8 = this.f55818;
            int i9 = this.f55820.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f55818 + i9;
            this.f55818 = i2;
            if (this.f55808 == 0 && (i3 = this.f55807) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f55810++;
                this.f55807 = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    private int m42625(boolean z) throws IOException {
        int i = this.f55810;
        int i2 = this.f55818;
        while (true) {
            if (i == i2) {
                this.f55810 = i;
                if (!m42623(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m42635());
                }
                i = this.f55810;
                i2 = this.f55818;
            }
            int i3 = i + 1;
            char[] cArr = this.f55819;
            char c = cArr[i];
            if (c == '\n') {
                this.f55808++;
                this.f55807 = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f55810 = i3;
                    if (i3 == i2) {
                        this.f55810 = i;
                        boolean zM42623 = m42623(2);
                        this.f55810++;
                        if (!zM42623) {
                        }
                        return c;
                    }
                    m42630();
                    int i4 = this.f55810;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f55810 = i4 + 1;
                        while (true) {
                            if (this.f55810 + 2 > this.f55818 && !m42623(2)) {
                                m42622("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.f55810;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= 2) {
                                        i = this.f55810 + 2;
                                        i2 = this.f55818;
                                        break;
                                    }
                                    if (cArr[this.f55810 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.f55808++;
                                this.f55807 = i5 + 1;
                            }
                            this.f55810++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.f55810 = i4 + 1;
                        m42634();
                        i = this.f55810;
                        i2 = this.f55818;
                    }
                } else if (c == '#') {
                    this.f55810 = i3;
                    m42630();
                    m42634();
                    i = this.f55810;
                    i2 = this.f55818;
                } else {
                    this.f55810 = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: ܰ */
    private void m42630() throws C8633 {
        if (this.f55817 == EnumC17663.LENIENT) {
            return;
        }
        m42622("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    private void m42634() {
        char c;
        do {
            if (this.f55810 >= this.f55818 && !m42623(1)) {
                return;
            }
            int i = this.f55810;
            int i2 = i + 1;
            this.f55810 = i2;
            c = this.f55819[i];
            if (c == '\n') {
                this.f55808++;
                this.f55807 = i2;
                return;
            }
        } while (c != '\r');
    }

    public String toString() {
        return getClass().getSimpleName() + m42635();
    }

    /* JADX INFO: renamed from: ֡ */
    public final String m42635() {
        StringBuilder sbM49005 = C21720.m49005(" at line ", this.f55808 + 1, " column ", " path ", (this.f55810 - this.f55807) + 1);
        sbM49005.append(m42642());
        return sbM49005.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    private String m42621(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.f55812;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.f55806[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.f55814[i];
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
                    String str = this.f55811[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(C20778.m46922(i3, "Unknown scope value: "));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public String m42642() {
        return m42621(false);
    }

    /* JADX INFO: renamed from: ۖ */
    public String m42638() {
        return m42621(true);
    }

    /* JADX INFO: renamed from: ۧ֫ */
    private char m42629() throws C8633 {
        int i;
        if (this.f55810 == this.f55818 && !m42623(1)) {
            m42622("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.f55810;
        int i3 = i2 + 1;
        this.f55810 = i3;
        char[] cArr = this.f55819;
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
                            if (i2 + 5 > this.f55818 && !m42623(4)) {
                                m42622("Unterminated escape sequence");
                                throw null;
                            }
                            int i4 = this.f55810;
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
                                        m42622("Malformed Unicode escape \\u".concat(new String(cArr, this.f55810, 4)));
                                        throw null;
                                    }
                                    i = c2 - '7';
                                }
                                i6 = i7 + i;
                                i4++;
                            }
                            this.f55810 += 4;
                            return (char) i6;
                        }
                        m42622("Invalid escape sequence");
                        throw null;
                    }
                }
            }
            return c;
        }
        if (this.f55817 == EnumC17663.STRICT) {
            m42622("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f55808++;
        this.f55807 = i3;
        if (this.f55817 == EnumC17663.STRICT) {
            m42622("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m42622(String str) throws C8633 {
        StringBuilder sbM17248 = C7470.m17248(str);
        sbM17248.append(m42635());
        sbM17248.append("\nSee ");
        sbM17248.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new C8633(sbM17248.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public IllegalStateException m42626(String str) {
        String str2 = m42643() == EnumC16008.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbM11879 = C5410.m11879("Expected ", str, " but was ");
        sbM11879.append(m42643());
        sbM11879.append(m42635());
        sbM11879.append("\nSee ");
        sbM11879.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbM11879.toString());
    }

    static {
        AbstractC24369.f77157 = new C19362();
    }
}
