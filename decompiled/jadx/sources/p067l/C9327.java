package p067l;

import com.google.android.material.slider.BaseSlider;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.math.p080ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AUQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C9327 {

    /* JADX INFO: renamed from: ۗ */
    public static final boolean[] f25368;

    /* JADX INFO: renamed from: ۙ */
    public static final boolean[] f25369;

    /* JADX INFO: renamed from: ۬ */
    public static final ThreadLocal f25370;

    /* JADX INFO: renamed from: ܶ */
    public static final char[] f25371;

    /* JADX INFO: renamed from: ᩶ */
    public static final int[] f25372;

    /* JADX INFO: renamed from: ᩸ */
    public static final int[] f25373;

    /* JADX INFO: renamed from: ᩹ */
    public static boolean f25374;

    /* JADX INFO: renamed from: ֡ */
    public String f25375;

    /* JADX INFO: renamed from: ֨ */
    public TimeZone f25376;

    /* JADX INFO: renamed from: ֫ */
    public int f25377;

    /* JADX INFO: renamed from: ۖ */
    public int f25378;

    /* JADX INFO: renamed from: ۘ */
    public int f25379;

    /* JADX INFO: renamed from: ۚ */
    public final String f25380;

    /* JADX INFO: renamed from: ۜ */
    public boolean f25381;

    /* JADX INFO: renamed from: ۠ */
    public int f25382;

    /* JADX INFO: renamed from: ۡ */
    public Locale f25383;

    /* JADX INFO: renamed from: ۢ */
    public final int f25384;

    /* JADX INFO: renamed from: ۧ */
    public Calendar f25385;

    /* JADX INFO: renamed from: ܳ */
    public int f25386;

    /* JADX INFO: renamed from: ܺ */
    public int f25387;

    /* JADX INFO: renamed from: ܽ */
    public char f25388;

    /* JADX INFO: renamed from: ܿ */
    public boolean f25389;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f25390;

    /* JADX INFO: renamed from: ᩴ */
    public char[] f25391;

    /* JADX INFO: renamed from: ᩵ */
    public int f25392;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f25393;

    /* JADX INFO: renamed from: ᩻ */
    public long f25394;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m21576(char c, char c2, char c3, char c4, char c5, char c6, int i, int i2) {
        if (c >= '1' && c <= '3' && c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9') {
            if (c5 == '0') {
                if (c6 < '1' || c6 > '9') {
                    return false;
                }
            } else if (c5 != '1' || (c6 != '0' && c6 != '1' && c6 != '2')) {
                return false;
            }
            if (i == 48) {
                return i2 >= 49 && i2 <= 57;
            }
            if (i != 49 && i != 50) {
                return i == 51 && (i2 == 48 || i2 == 49);
            }
            if (i2 >= 48 && i2 <= 57) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m21579(char c, char c2, char c3, char c4, char c5, char c6) {
        if (c == '0') {
            if (c2 < '0' || c2 > '9') {
                return false;
            }
        } else {
            if (c != '1') {
                if (c == '2' && c2 >= '0' && c2 <= '4') {
                }
                return false;
            }
            if (c2 < '0' || c2 > '9') {
                return false;
            }
        }
        if (c3 < '0' || c3 > '5') {
            if (c3 != '6' || c4 != '0') {
                return false;
            }
        } else if (c4 < '0' || c4 > '9') {
            return false;
        }
        if (c5 < '0' || c5 > '5') {
            return c5 == '6' && c6 == '0';
        }
        return c6 >= '0' && c6 <= '9';
    }

    static {
        int i;
        char c;
        char c2;
        try {
            i = Class.forName("android.os.Build$VERSION").getField("SDK_INT").getInt(null);
            while (true) {
                boolean[] zArr = f25369;
                if (c2 >= zArr.length) {
                    break;
                }
                if (c2 >= 'A' && c2 <= 'Z') {
                    zArr[c2] = true;
                } else if (c2 >= 'a' && c2 <= 'z') {
                    zArr[c2] = true;
                } else if (c2 == '_') {
                    zArr[c2] = true;
                }
                c2 = (char) (c2 + 1);
            }
            while (true) {
                boolean[] zArr2 = f25368;
                if (c >= zArr2.length) {
                    return;
                }
                if (c >= 'A' && c <= 'Z') {
                    zArr2[c] = true;
                } else if (c >= 'a' && c <= 'z') {
                    zArr2[c] = true;
                } else if (c == '_') {
                    zArr2[c] = true;
                } else if (c >= '0' && c <= '9') {
                    zArr2[c] = true;
                }
                c = (char) (c + 1);
            }
        } catch (Exception unused) {
            i = -1;
        }
        c = 0;
        f25374 = i >= 23;
        f25370 = new ThreadLocal();
        f25372 = new int[IShizukuService.Stub.TRANSACTION_dispatchPackageChanged];
        for (int i2 = 48; i2 <= 57; i2++) {
            f25372[i2] = i2 - 48;
        }
        for (int i3 = 97; i3 <= 102; i3++) {
            f25372[i3] = i3 - 87;
        }
        for (int i4 = 65; i4 <= 70; i4++) {
            f25372[i4] = i4 - 55;
        }
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f25371 = charArray;
        int[] iArr = new int[256];
        f25373 = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i5 = 0; i5 < length; i5++) {
            f25373[f25371[i5]] = i5;
        }
        f25373[61] = 0;
        f25369 = new boolean[256];
        c2 = 0;
        f25368 = new boolean[256];
    }

    public C9327(String str) {
        this(str, AbstractC7316.f19153);
    }

    public C9327(String str, int i) {
        this.f25386 = AbstractC7316.f19153;
        this.f25389 = false;
        this.f25393 = false;
        this.f25376 = AbstractC7316.f19149;
        this.f25383 = AbstractC7316.f19150;
        this.f25385 = null;
        this.f25387 = 0;
        char[] cArr = (char[]) f25370.get();
        this.f25391 = cArr;
        if (cArr == null) {
            this.f25391 = new char[512];
        }
        this.f25386 = i;
        this.f25380 = str;
        int length = str.length();
        this.f25384 = length;
        int i2 = (-1) + 1;
        this.f25377 = i2;
        char cCharAt = i2 >= length ? (char) 26 : str.charAt(i2);
        this.f25388 = cCharAt;
        if (cCharAt == 65279) {
            m21625();
        }
        this.f25375 = (EnumC15361.InitStringFieldAsEmpty.f43892 & i) != 0 ? "" : null;
        this.f25390 = (EnumC15361.DisableCircularReferenceDetect.f43892 & i) != 0;
    }

    /* JADX INFO: renamed from: ܶ */
    public final int m21614() {
        return this.f25382;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m21608() {
        char[] cArr = this.f25391;
        if (cArr.length <= 8196) {
            f25370.set(cArr);
        }
        this.f25391 = null;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final char m21625() {
        int i = this.f25377 + 1;
        this.f25377 = i;
        char cCharAt = i >= this.f25384 ? (char) 26 : this.f25380.charAt(i);
        this.f25388 = cCharAt;
        return cCharAt;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m21592(EnumC15361 enumC15361) {
        return (enumC15361.f43892 & this.f25386) != 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m21603() {
        this.f25392 = 0;
        while (true) {
            char c = this.f25388;
            if (c == ':') {
                int i = this.f25377 + 1;
                this.f25377 = i;
                this.f25388 = i >= this.f25384 ? (char) 26 : this.f25380.charAt(i);
                m21606();
                return;
            }
            if (c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == '\f' || c == '\b') {
                m21625();
            } else {
                throw new C16702("not match : - " + this.f25388);
            }
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final String m21616() {
        char cCharAt = this.f25380.charAt((this.f25378 + this.f25392) - 1);
        int i = this.f25392;
        if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B' || cCharAt == 'F' || cCharAt == 'D') {
            i--;
        }
        return m21578(this.f25378, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final char m21584(int i) {
        if (i >= this.f25384) {
            return (char) 26;
        }
        return this.f25380.charAt(i);
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m21606() {
        int i = 0;
        this.f25392 = 0;
        while (true) {
            int i2 = this.f25377;
            this.f25379 = i2;
            char c = this.f25388;
            if (c == '/') {
                m21599();
            } else {
                if (c == '\"') {
                    m21624();
                    return;
                }
                if ((c >= '0' && c <= '9') || c == '-') {
                    m21598();
                    return;
                }
                if (c == ',') {
                    m21625();
                    this.f25382 = 16;
                    return;
                }
                if (c != '\f' && c != '\r' && c != ' ') {
                    if (c == ':') {
                        m21625();
                        this.f25382 = 17;
                        return;
                    }
                    int i3 = this.f25384;
                    String str = this.f25380;
                    if (c == '[') {
                        int i4 = i2 + 1;
                        this.f25377 = i4;
                        this.f25388 = i4 < i3 ? str.charAt(i4) : (char) 26;
                        this.f25382 = 14;
                        return;
                    }
                    if (c == ']') {
                        m21625();
                        this.f25382 = 15;
                        return;
                    }
                    if (c == 'f') {
                        if (str.startsWith("false", i2)) {
                            int i5 = this.f25377 + 5;
                            this.f25377 = i5;
                            char cM21584 = m21584(i5);
                            this.f25388 = cM21584;
                            if (cM21584 == ' ' || cM21584 == ',' || cM21584 == '}' || cM21584 == ']' || cM21584 == '\n' || cM21584 == '\r' || cM21584 == '\t' || cM21584 == 26 || cM21584 == '\f' || cM21584 == '\b' || cM21584 == ':') {
                                this.f25382 = 7;
                                return;
                            }
                        }
                        throw new C16702("scan false error");
                    }
                    if (c == 'n') {
                        if (str.startsWith("null", i2)) {
                            this.f25377 += 4;
                            i = 8;
                        } else if (str.startsWith("new", this.f25377)) {
                            this.f25377 += 3;
                            i = 9;
                        }
                        if (i != 0) {
                            char cM21585 = m21584(this.f25377);
                            this.f25388 = cM21585;
                            if (cM21585 == ' ' || cM21585 == ',' || cM21585 == '}' || cM21585 == ']' || cM21585 == '\n' || cM21585 == '\r' || cM21585 == '\t' || cM21585 == 26 || cM21585 == '\f' || cM21585 == '\b') {
                                this.f25382 = i;
                                return;
                            }
                        }
                        throw new C16702("scan null/new error");
                    }
                    if (c == '{') {
                        int i6 = i2 + 1;
                        this.f25377 = i6;
                        this.f25388 = i6 < i3 ? str.charAt(i6) : (char) 26;
                        this.f25382 = 12;
                        return;
                    }
                    if (c == '}') {
                        int i7 = i2 + 1;
                        this.f25377 = i7;
                        this.f25388 = i7 < i3 ? str.charAt(i7) : (char) 26;
                        this.f25382 = 13;
                        return;
                    }
                    if (c != 'S' && c != 'T') {
                        if (c == 't') {
                            if (str.startsWith("true", i2)) {
                                int i8 = this.f25377 + 4;
                                this.f25377 = i8;
                                char cM21586 = m21584(i8);
                                this.f25388 = cM21586;
                                if (cM21586 == ' ' || cM21586 == ',' || cM21586 == '}' || cM21586 == ']' || cM21586 == '\n' || cM21586 == '\r' || cM21586 == '\t' || cM21586 == 26 || cM21586 == '\f' || cM21586 == '\b' || cM21586 == ':') {
                                    this.f25382 = 6;
                                    return;
                                }
                            }
                            throw new C16702("scan true error");
                        }
                        if (c != 'u') {
                            switch (c) {
                                case '\b':
                                case '\t':
                                case '\n':
                                    break;
                                default:
                                    switch (c) {
                                        case '\'':
                                            m21624();
                                            return;
                                        case '(':
                                            m21625();
                                            this.f25382 = 10;
                                            return;
                                        case ')':
                                            m21625();
                                            this.f25382 = 11;
                                            return;
                                        default:
                                            if (i2 == i3 || (c == 26 && i2 + 1 == i3)) {
                                                if (this.f25382 == 20) {
                                                    throw new C16702("EOF error");
                                                }
                                                this.f25382 = 20;
                                                this.f25377 = 0;
                                                this.f25379 = 0;
                                                return;
                                            }
                                            if (c > 31 && c != 127) {
                                                this.f25382 = 1;
                                                m21625();
                                                return;
                                            } else {
                                                m21625();
                                                continue;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        }
                    }
                    m21581();
                    return;
                }
                m21625();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:143:0x009d A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ */
    public final void m21609(int i) {
        char c;
        this.f25392 = 0;
        while (true) {
            if (i != 2) {
                String str = this.f25380;
                int i2 = this.f25384;
                if (i == 4) {
                    char c2 = this.f25388;
                    if (c2 == '\"') {
                        this.f25379 = this.f25377;
                        m21624();
                        return;
                    } else if (c2 >= '0' && c2 <= '9') {
                        this.f25379 = this.f25377;
                        m21598();
                        return;
                    } else if (c2 == '{') {
                        this.f25382 = 12;
                        int i3 = this.f25377 + 1;
                        this.f25377 = i3;
                        this.f25388 = i3 < i2 ? str.charAt(i3) : (char) 26;
                        return;
                    }
                } else if (i == 12) {
                    char c3 = this.f25388;
                    if (c3 == '{') {
                        this.f25382 = 12;
                        int i4 = this.f25377 + 1;
                        this.f25377 = i4;
                        this.f25388 = i4 < i2 ? str.charAt(i4) : (char) 26;
                        return;
                    }
                    if (c3 == '[') {
                        this.f25382 = 14;
                        int i5 = this.f25377 + 1;
                        this.f25377 = i5;
                        this.f25388 = i5 < i2 ? str.charAt(i5) : (char) 26;
                        return;
                    }
                } else {
                    if (i == 18) {
                        while (true) {
                            c = this.f25388;
                            if (c <= ' ' && (c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == '\f' || c == '\b')) {
                                m21625();
                            }
                        }
                        if (c == '_' || Character.isLetter(c)) {
                            m21581();
                            return;
                        } else {
                            m21606();
                            return;
                        }
                    }
                    if (i != 20) {
                        switch (i) {
                            case 14:
                                char c4 = this.f25388;
                                if (c4 == '[') {
                                    this.f25382 = 14;
                                    m21625();
                                } else if (c4 == '{') {
                                    this.f25382 = 12;
                                    m21625();
                                }
                                break;
                            case 15:
                                if (this.f25388 == ']') {
                                    this.f25382 = 15;
                                    m21625();
                                }
                                if (this.f25388 == 26) {
                                    this.f25382 = 20;
                                }
                                break;
                            case 16:
                                char c5 = this.f25388;
                                if (c5 == ',') {
                                    this.f25382 = 16;
                                    int i6 = this.f25377 + 1;
                                    this.f25377 = i6;
                                    this.f25388 = i6 < i2 ? str.charAt(i6) : (char) 26;
                                } else if (c5 == '}') {
                                    this.f25382 = 13;
                                    int i7 = this.f25377 + 1;
                                    this.f25377 = i7;
                                    this.f25388 = i7 < i2 ? str.charAt(i7) : (char) 26;
                                } else if (c5 == ']') {
                                    this.f25382 = 15;
                                    int i8 = this.f25377 + 1;
                                    this.f25377 = i8;
                                    this.f25388 = i8 < i2 ? str.charAt(i8) : (char) 26;
                                } else if (c5 == 26) {
                                    this.f25382 = 20;
                                }
                                break;
                        }
                        return;
                    }
                    if (this.f25388 == 26) {
                        this.f25382 = 20;
                        return;
                    }
                }
            } else {
                char c6 = this.f25388;
                if (c6 >= '0' && c6 <= '9') {
                    this.f25379 = this.f25377;
                    m21598();
                    return;
                }
                if (c6 == '\"') {
                    this.f25379 = this.f25377;
                    m21624();
                    return;
                } else if (c6 == '[') {
                    this.f25382 = 14;
                    m21625();
                    return;
                } else if (c6 == '{') {
                    this.f25382 = 12;
                    m21625();
                    return;
                }
            }
            char c7 = this.f25388;
            if (c7 == ' ' || c7 == '\n' || c7 == '\r' || c7 == '\t' || c7 == '\f' || c7 == '\b') {
                m21625();
            } else {
                m21606();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final Number m21612() {
        char c;
        boolean z;
        long j;
        int i;
        long j2;
        int i2 = this.f25378;
        int i3 = this.f25392 + i2;
        int i4 = i3 - 1;
        String str = this.f25380;
        int i5 = this.f25384;
        char cCharAt = i4 >= i5 ? (char) 26 : str.charAt(i4);
        if (cCharAt == 'B') {
            i3--;
            c = 'B';
        } else if (cCharAt == 'L') {
            i3--;
            c = 'L';
        } else if (cCharAt != 'S') {
            c = ' ';
        } else {
            i3--;
            c = 'S';
        }
        int i6 = this.f25378;
        if ((i6 >= i5 ? (char) 26 : str.charAt(i6)) == '-') {
            i2++;
            j = Long.MIN_VALUE;
            z = true;
        } else {
            z = false;
            j = -9223372036854775807L;
        }
        if (i2 < i3) {
            int i7 = i2 + 1;
            i = 1;
            j2 = -((i2 >= i5 ? (char) 26 : str.charAt(i2)) - '0');
            i2 = i7;
        } else {
            i = 1;
            j2 = 0;
        }
        while (i2 < i3) {
            int i8 = i2 + 1;
            int iCharAt = (i2 >= i5 ? (char) 26 : str.charAt(i2)) - '0';
            if (j2 < -922337203685477580L) {
                return new BigInteger(m21616());
            }
            long j3 = j2 * 10;
            long j4 = iCharAt;
            if (j3 < j + j4) {
                return new BigInteger(m21616());
            }
            j2 = j3 - j4;
            i2 = i8;
        }
        if (!z) {
            long j5 = -j2;
            if (j5 > 2147483647L || c == 'L') {
                return Long.valueOf(j5);
            }
            if (c == 'S') {
                return Short.valueOf((short) j5);
            }
            if (c == 'B') {
                return Byte.valueOf((byte) j5);
            }
            return Integer.valueOf((int) j5);
        }
        if (i2 <= this.f25378 + i) {
            throw new NumberFormatException(m21616());
        }
        if (j2 < -2147483648L || c == 'L') {
            return Long.valueOf(j2);
        }
        if (c == 'S') {
            return Short.valueOf((short) j2);
        }
        if (c == 'B') {
            return Byte.valueOf((byte) j2);
        }
        return Integer.valueOf((int) j2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m21586(C11187 c11187) {
        char c;
        while (true) {
            c = this.f25388;
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t' && c != '\f' && c != '\b') {
                break;
            }
            m21625();
        }
        if (c == '\"') {
            return m21587(c11187, '\"');
        }
        if (c == '\'') {
            return m21587(c11187, '\'');
        }
        if (c == '}') {
            m21625();
            this.f25382 = 13;
            return null;
        }
        if (c == ',') {
            m21625();
            this.f25382 = 16;
            return null;
        }
        if (c == 26) {
            this.f25382 = 20;
            return null;
        }
        return m21607(c11187);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m21587(C11187 c11187, char c) {
        String strM21574;
        int i = this.f25377 + 1;
        String str = this.f25380;
        int iIndexOf = str.indexOf(c, i);
        if (iIndexOf == -1) {
            throw new C16702("unclosed str, " + m21622());
        }
        int i2 = iIndexOf - i;
        char[] cArrM21594 = m21594(this.f25377 + 1, i2);
        boolean z = false;
        while (i2 > 0 && cArrM21594[i2 - 1] == '\\') {
            int i3 = 1;
            for (int i4 = i2 - 2; i4 >= 0 && cArrM21594[i4] == '\\'; i4--) {
                i3++;
            }
            if (i3 % 2 == 0) {
                break;
            }
            int iIndexOf2 = str.indexOf(c, iIndexOf + 1);
            int i5 = (iIndexOf2 - iIndexOf) + i2;
            if (i5 >= cArrM21594.length) {
                int length = (cArrM21594.length * 3) / 2;
                if (length < i5) {
                    length = i5;
                }
                char[] cArr = new char[length];
                System.arraycopy(cArrM21594, 0, cArr, 0, cArrM21594.length);
                cArrM21594 = cArr;
            }
            str.getChars(iIndexOf, iIndexOf2, cArrM21594, i2);
            iIndexOf = iIndexOf2;
            i2 = i5;
            z = true;
        }
        if (z) {
            strM21574 = m21574(cArrM21594, i2);
        } else {
            int i6 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                char c2 = cArrM21594[i7];
                i6 = (i6 * 31) + c2;
                if (c2 == '\\') {
                    z = true;
                }
            }
            if (z) {
                strM21574 = m21574(cArrM21594, i2);
            } else {
                strM21574 = i2 < 20 ? c11187.m25815(cArrM21594, i2, i6) : new String(cArrM21594, 0, i2);
            }
        }
        int i8 = iIndexOf + 1;
        this.f25377 = i8;
        this.f25388 = i8 >= this.f25384 ? (char) 26 : str.charAt(i8);
        return strM21574;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f5  */
    /* JADX INFO: renamed from: ֫ */
    public static String m21574(char[] cArr, int i) {
        int i2;
        int i3;
        char[] cArr2 = new char[i];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            char c = cArr[i4];
            if (c != '\\') {
                cArr2[i5] = c;
                i5++;
            } else {
                int i6 = i4 + 1;
                char c2 = cArr[i6];
                if (c2 == '\"') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\"';
                } else if (c2 == '\'') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\'';
                } else if (c2 == 'F') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\f';
                } else if (c2 == '\\') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\\';
                } else if (c2 == 'b') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\b';
                } else if (c2 == 'f') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\f';
                } else if (c2 == 'n') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\n';
                } else if (c2 != 'r') {
                    if (c2 != 'x') {
                        switch (c2) {
                            case '/':
                                i2 = i5 + 1;
                                cArr2[i5] = '/';
                                break;
                            case '0':
                                i2 = i5 + 1;
                                cArr2[i5] = 0;
                                break;
                            case '1':
                                i2 = i5 + 1;
                                cArr2[i5] = 1;
                                break;
                            case '2':
                                i2 = i5 + 1;
                                cArr2[i5] = 2;
                                break;
                            case '3':
                                i2 = i5 + 1;
                                cArr2[i5] = 3;
                                break;
                            case '4':
                                i2 = i5 + 1;
                                cArr2[i5] = 4;
                                break;
                            case '5':
                                i2 = i5 + 1;
                                cArr2[i5] = 5;
                                break;
                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                i2 = i5 + 1;
                                cArr2[i5] = 6;
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                i2 = i5 + 1;
                                cArr2[i5] = 7;
                                break;
                            default:
                                switch (c2) {
                                    case 't':
                                        i2 = i5 + 1;
                                        cArr2[i5] = '\t';
                                        break;
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                        i3 = i5 + 1;
                                        char c3 = cArr[i4 + 2];
                                        char c4 = cArr[i4 + 3];
                                        char c5 = cArr[i4 + 4];
                                        i4 += 5;
                                        cArr2[i5] = (char) Integer.parseInt(new String(new char[]{c3, c4, c5, cArr[i4]}), 16);
                                        break;
                                    case 'v':
                                        i2 = i5 + 1;
                                        cArr2[i5] = 11;
                                        break;
                                    default:
                                        throw new C16702("unclosed.str.lit");
                                }
                                break;
                        }
                    } else {
                        i3 = i5 + 1;
                        char c6 = cArr[i4 + 2];
                        int[] iArr = f25372;
                        i4 += 3;
                        cArr2[i5] = (char) ((iArr[c6] * 16) + iArr[cArr[i4]]);
                    }
                    i5 = i3;
                } else {
                    i2 = i5 + 1;
                    cArr2[i5] = '\r';
                }
                i5 = i2;
                i4 = i6;
            }
            i4++;
        }
        return new String(cArr2, 0, i5);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m21622() {
        StringBuilder sb = new StringBuilder("pos ");
        sb.append(this.f25377);
        sb.append(", json : ");
        String strSubstring = this.f25380;
        if (this.f25384 >= 65536) {
            strSubstring = strSubstring.substring(0, 65536);
        }
        sb.append(strSubstring);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m21599() {
        m21625();
        char c = this.f25388;
        if (c == '/') {
            do {
                m21625();
            } while (this.f25388 != '\n');
            m21625();
        } else if (c == '*') {
            m21625();
            while (true) {
                char c2 = this.f25388;
                if (c2 == 26) {
                    return;
                }
                if (c2 == '*') {
                    m21625();
                    if (this.f25388 == '/') {
                        m21625();
                        return;
                    }
                } else {
                    m21625();
                }
            }
        } else {
            throw new C16702("invalid comment");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m21607(C11187 c11187) {
        int i = this.f25388;
        boolean[] zArr = f25369;
        if (i < zArr.length && !zArr[i]) {
            throw new C16702("illegal identifier : " + this.f25388 + ", " + m21622());
        }
        this.f25378 = this.f25377;
        this.f25392 = 1;
        while (true) {
            char cM21625 = m21625();
            boolean[] zArr2 = f25368;
            if (cM21625 < zArr2.length && !zArr2[cM21625]) {
                break;
            }
            i = (i * 31) + cM21625;
            this.f25392++;
        }
        this.f25388 = m21584(this.f25377);
        this.f25382 = 18;
        int i2 = this.f25392;
        String str = this.f25380;
        if (i2 == 4 && str.startsWith("null", this.f25378)) {
            return null;
        }
        return c11187.m25814(this.f25378, this.f25392, i, str);
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m21624() {
        char c = this.f25388;
        int i = this.f25377 + 1;
        String str = this.f25380;
        int iIndexOf = str.indexOf(c, i);
        if (iIndexOf == -1) {
            throw new C16702("unclosed str, " + m21622());
        }
        int i2 = iIndexOf - i;
        char[] cArrM21594 = m21594(this.f25377 + 1, i2);
        boolean z = false;
        while (i2 > 0 && cArrM21594[i2 - 1] == '\\') {
            int i3 = 1;
            for (int i4 = i2 - 2; i4 >= 0 && cArrM21594[i4] == '\\'; i4--) {
                i3++;
            }
            if (i3 % 2 == 0) {
                break;
            }
            int iIndexOf2 = str.indexOf(c, iIndexOf + 1);
            int i5 = (iIndexOf2 - iIndexOf) + i2;
            if (i5 >= cArrM21594.length) {
                int length = (cArrM21594.length * 3) / 2;
                if (length < i5) {
                    length = i5;
                }
                char[] cArr = new char[length];
                System.arraycopy(cArrM21594, 0, cArr, 0, cArrM21594.length);
                cArrM21594 = cArr;
            }
            str.getChars(iIndexOf, iIndexOf2, cArrM21594, i2);
            iIndexOf = iIndexOf2;
            i2 = i5;
            z = true;
        }
        if (!z) {
            for (int i6 = 0; i6 < i2; i6++) {
                if (cArrM21594[i6] == '\\') {
                    z = true;
                }
            }
        }
        this.f25391 = cArrM21594;
        this.f25392 = i2;
        this.f25378 = this.f25377;
        this.f25381 = z;
        int i7 = iIndexOf + 1;
        this.f25377 = i7;
        this.f25388 = i7 >= this.f25384 ? (char) 26 : str.charAt(i7);
        this.f25382 = 4;
    }

    /* JADX INFO: renamed from: ֡ */
    public final String m21582() {
        String str;
        int i = this.f25377 + 1;
        String str2 = this.f25380;
        int iIndexOf = str2.indexOf(34, i);
        if (iIndexOf == -1) {
            throw new C16702("unclosed str, " + m21622());
        }
        if (f25374) {
            str = str2.substring(i, iIndexOf);
        } else {
            int i2 = iIndexOf - i;
            str = new String(m21594(this.f25377 + 1, i2), 0, i2);
        }
        if (str.indexOf(92) != -1) {
            while (true) {
                int i3 = 0;
                for (int i4 = iIndexOf - 1; i4 >= 0 && str2.charAt(i4) == '\\'; i4--) {
                    i3++;
                }
                if (i3 % 2 == 0) {
                    break;
                }
                iIndexOf = str2.indexOf(34, iIndexOf + 1);
            }
            int i5 = iIndexOf - i;
            str = m21574(m21594(this.f25377 + 1, i5), i5);
        }
        int i6 = iIndexOf + 1;
        this.f25377 = i6;
        this.f25388 = i6 >= this.f25384 ? (char) 26 : str2.charAt(i6);
        return str;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m21619() {
        int i;
        boolean z;
        int i2 = this.f25378;
        int i3 = this.f25392 + i2;
        String str = this.f25380;
        int i4 = this.f25384;
        int i5 = 0;
        if ((i2 >= i4 ? (char) 26 : str.charAt(i2)) == '-') {
            i2++;
            i = Integer.MIN_VALUE;
            z = true;
        } else {
            i = SecP160R1Field.PInv;
            z = false;
        }
        if (i2 < i3) {
            int i6 = i2 + 1;
            i5 = -((i2 >= i4 ? (char) 26 : str.charAt(i2)) - '0');
            i2 = i6;
        }
        while (i2 < i3) {
            int i7 = i2 + 1;
            char cCharAt = i2 >= i4 ? (char) 26 : str.charAt(i2);
            if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B') {
                i2 = i7;
                break;
            }
            int i8 = cCharAt - '0';
            if (i5 < -214748364) {
                throw new NumberFormatException(m21616());
            }
            int i9 = i5 * 10;
            if (i9 < i + i8) {
                throw new NumberFormatException(m21616());
            }
            i5 = i9 - i8;
            i2 = i7;
        }
        if (!z) {
            return -i5;
        }
        if (i2 > this.f25378 + 1) {
            return i5;
        }
        throw new NumberFormatException(m21616());
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m21593() {
        return m21577(this.f25378 + 1, this.f25392, this.f25380);
    }

    /* JADX INFO: renamed from: ᩸ */
    private void m21581() {
        this.f25378 = this.f25377 - 1;
        this.f25381 = false;
        do {
            this.f25392++;
            m21625();
        } while (Character.isLetterOrDigit(this.f25388));
        String strM21602 = m21602();
        if (strM21602.equals("null")) {
            this.f25382 = 8;
            return;
        }
        if (strM21602.equals("true")) {
            this.f25382 = 6;
            return;
        }
        if (strM21602.equals("false")) {
            this.f25382 = 7;
            return;
        }
        if (strM21602.equals("new")) {
            this.f25382 = 9;
            return;
        }
        if (strM21602.equals("undefined")) {
            this.f25382 = 23;
            return;
        }
        if (strM21602.equals("Set")) {
            this.f25382 = 21;
        } else if (strM21602.equals("TreeSet")) {
            this.f25382 = 22;
        } else {
            this.f25382 = 18;
        }
    }

    /* JADX INFO: renamed from: ۠ */
    public final String m21602() {
        if (this.f25381) {
            return m21574(this.f25391, this.f25392);
        }
        return m21578(this.f25378 + 1, this.f25392);
    }

    /* JADX INFO: renamed from: ۧ */
    private final String m21578(int i, int i2) {
        char[] cArr = this.f25391;
        int length = cArr.length;
        String str = this.f25380;
        if (i2 < length) {
            str.getChars(i, i + i2, cArr, 0);
            return new String(this.f25391, 0, i2);
        }
        char[] cArr2 = new char[i2];
        str.getChars(i, i2 + i, cArr2, 0);
        return new String(cArr2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final char[] m21594(int i, int i2) {
        char[] cArr = this.f25391;
        int length = cArr.length;
        String str = this.f25380;
        if (i2 < length) {
            str.getChars(i, i2 + i, cArr, 0);
            return this.f25391;
        }
        char[] cArr2 = new char[i2];
        this.f25391 = cArr2;
        str.getChars(i, i2 + i, cArr2, 0);
        return cArr2;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m21628() {
        int i = 0;
        while (true) {
            char cM21584 = m21584(i);
            if (cM21584 == 26) {
                return true;
            }
            if (cM21584 > ' ' || !(cM21584 == ' ' || cM21584 == '\n' || cM21584 == '\r' || cM21584 == '\t' || cM21584 == '\f' || cM21584 == '\b')) {
                return false;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֨ */
    public final void m21583() {
        while (true) {
            char c = this.f25388;
            if (c > '/') {
                return;
            }
            if (c == ' ' || c == '\r' || c == '\n' || c == '\t' || c == '\f' || c == '\b') {
                m21625();
            } else if (c != '/') {
                return;
            } else {
                m21599();
            }
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m21598() {
        char c;
        char c2;
        int i = this.f25377;
        this.f25378 = i;
        this.f25389 = false;
        char c3 = this.f25388;
        String str = this.f25380;
        int i2 = this.f25384;
        if (c3 == '-') {
            this.f25392++;
            int i3 = i + 1;
            this.f25377 = i3;
            this.f25388 = i3 >= i2 ? (char) 26 : str.charAt(i3);
        }
        while (true) {
            c = this.f25388;
            if (c < '0' || c > '9') {
                break;
            }
            this.f25392++;
            int i4 = this.f25377 + 1;
            this.f25377 = i4;
            this.f25388 = i4 >= i2 ? (char) 26 : str.charAt(i4);
        }
        this.f25393 = false;
        if (c == '.') {
            this.f25392++;
            int i5 = this.f25377 + 1;
            this.f25377 = i5;
            this.f25388 = i5 >= i2 ? (char) 26 : str.charAt(i5);
            this.f25393 = true;
            while (true) {
                char c4 = this.f25388;
                if (c4 < '0' || c4 > '9') {
                    break;
                }
                this.f25392++;
                int i6 = this.f25377 + 1;
                this.f25377 = i6;
                this.f25388 = i6 >= i2 ? (char) 26 : str.charAt(i6);
            }
        }
        char c5 = this.f25388;
        if (c5 == 'L' || c5 == 'S' || c5 == 'B') {
            this.f25392++;
            m21625();
        } else if (c5 == 'F' || c5 == 'D') {
            this.f25392++;
            m21625();
            this.f25393 = true;
        } else if (c5 == 'e' || c5 == 'E') {
            this.f25392++;
            int i7 = this.f25377 + 1;
            this.f25377 = i7;
            char cCharAt = i7 >= i2 ? (char) 26 : str.charAt(i7);
            this.f25388 = cCharAt;
            if (cCharAt == '+' || cCharAt == '-') {
                this.f25392++;
                int i8 = this.f25377 + 1;
                this.f25377 = i8;
                this.f25388 = i8 >= i2 ? (char) 26 : str.charAt(i8);
            }
            while (true) {
                c2 = this.f25388;
                if (c2 < '0' || c2 > '9') {
                    break;
                }
                this.f25392++;
                int i9 = this.f25377 + 1;
                this.f25377 = i9;
                this.f25388 = i9 >= i2 ? (char) 26 : str.charAt(i9);
            }
            if (c2 == 'D' || c2 == 'F') {
                this.f25392++;
                m21625();
            }
            this.f25389 = true;
            this.f25393 = true;
        }
        if (this.f25393) {
            this.f25382 = 3;
        } else {
            this.f25382 = 2;
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public final Number m21623() {
        long j;
        boolean z;
        char c;
        int i;
        boolean z2;
        int i2;
        char c2;
        boolean z3;
        char[] cArr;
        int i3;
        int i4;
        char[] cArr2;
        char c3;
        long j2;
        long j3;
        long j4;
        long j5;
        int i5 = this.f25377;
        this.f25378 = 0;
        char c4 = this.f25388;
        int i6 = this.f25384;
        String str = this.f25380;
        if (c4 == '-') {
            this.f25378 = 1;
            int i7 = i5 + 1;
            this.f25377 = i7;
            this.f25388 = i7 >= i6 ? (char) 26 : str.charAt(i7);
            j = Long.MIN_VALUE;
            z = true;
        } else {
            j = -9223372036854775807L;
            z = false;
        }
        long j6 = 0;
        int i8 = 1;
        boolean z4 = false;
        while (true) {
            c = this.f25388;
            i = 18;
            if (c < '0' || c > '9') {
                break;
            }
            int i9 = c - '0';
            if (i8 < 18) {
                j4 = j6 * 10;
                j5 = i9;
            } else {
                if (j6 < -922337203685477580L) {
                    z4 = true;
                }
                j4 = j6 * 10;
                j5 = i9;
                if (j4 < j + j5) {
                    z4 = true;
                }
            }
            j6 = j4 - j5;
            this.f25378++;
            int i10 = this.f25377 + 1;
            this.f25377 = i10;
            this.f25388 = i10 >= i6 ? (char) 26 : str.charAt(i10);
            i8++;
        }
        Number numberValueOf = null;
        if (c == '.') {
            this.f25378++;
            int i11 = this.f25377 + 1;
            this.f25377 = i11;
            this.f25388 = i11 >= i6 ? (char) 26 : str.charAt(i11);
            i2 = 0;
            char c5 = '9';
            while (true) {
                c3 = this.f25388;
                if (c3 < '0' || c3 > c5) {
                    break;
                }
                i2++;
                int i12 = c3 - '0';
                if (i8 < i) {
                    j2 = j6 * 10;
                    j3 = i12;
                } else {
                    if (j6 < -922337203685477580L) {
                        z4 = true;
                    }
                    j2 = j6 * 10;
                    j3 = i12;
                    if (j2 < j + j3) {
                        z4 = true;
                    }
                }
                j6 = j2 - j3;
                this.f25378++;
                int i13 = this.f25377 + 1;
                this.f25377 = i13;
                this.f25388 = i13 >= i6 ? (char) 26 : str.charAt(i13);
                i8++;
                c5 = '9';
                i = 18;
            }
            if (!z) {
                j6 = -j6;
            }
            if (c3 == 'F' || c3 == 'D') {
                this.f25378++;
                m21625();
            }
            z2 = true;
        } else {
            if (!z) {
                j6 = -j6;
            }
            if (c == 'L') {
                this.f25378++;
                m21625();
                numberValueOf = Long.valueOf(j6);
            } else if (c == 'S') {
                this.f25378++;
                m21625();
                numberValueOf = Short.valueOf((short) j6);
            } else if (c == 'B') {
                this.f25378++;
                m21625();
                numberValueOf = Byte.valueOf((byte) j6);
            } else if (c == 'F') {
                this.f25378++;
                m21625();
                numberValueOf = Float.valueOf(j6);
            } else if (c == 'D') {
                this.f25378++;
                m21625();
                numberValueOf = Double.valueOf(j6);
            }
            z2 = false;
            i2 = 0;
        }
        char c6 = this.f25388;
        if (c6 == 'e' || c6 == 'E') {
            this.f25378++;
            int i14 = this.f25377 + 1;
            this.f25377 = i14;
            char cCharAt = i14 >= i6 ? (char) 26 : str.charAt(i14);
            this.f25388 = cCharAt;
            if (cCharAt == '+' || cCharAt == '-') {
                this.f25378++;
                int i15 = this.f25377 + 1;
                this.f25377 = i15;
                this.f25388 = i15 >= i6 ? (char) 26 : str.charAt(i15);
            }
            while (true) {
                c2 = this.f25388;
                if (c2 < '0' || c2 > '9') {
                    break;
                }
                this.f25378++;
                int i16 = this.f25377 + 1;
                this.f25377 = i16;
                this.f25388 = i16 >= i6 ? (char) 26 : str.charAt(i16);
            }
            if (c2 == 'D' || c2 == 'F') {
                this.f25378++;
                m21625();
            } else {
                c2 = 0;
            }
            z3 = true;
        } else {
            z3 = false;
            c2 = 0;
        }
        if (!z2 && !z3) {
            if (z4) {
                int i17 = this.f25377;
                char[] cArr3 = new char[i17 - i5];
                str.getChars(i5, i17, cArr3, 0);
                numberValueOf = new BigInteger(new String(cArr3));
            }
            if (numberValueOf != null) {
                return numberValueOf;
            }
            if (j6 > -2147483648L && j6 < 2147483647L) {
                return Integer.valueOf((int) j6);
            }
            return Long.valueOf(j6);
        }
        int i18 = this.f25377 - i5;
        if (c2 != 0) {
            i18--;
        }
        if (!z3 && (EnumC15361.UseBigDecimal.f43892 & this.f25386) != 0) {
            if (!z4) {
                return BigDecimal.valueOf(j6, i2);
            }
            char[] cArr4 = this.f25391;
            if (i18 < cArr4.length) {
                i4 = 0;
                str.getChars(i5, i5 + i18, cArr4, 0);
                cArr2 = this.f25391;
            } else {
                i4 = 0;
                char[] cArr5 = new char[i18];
                str.getChars(i5, i5 + i18, cArr5, 0);
                cArr2 = cArr5;
            }
            return new BigDecimal(cArr2, i4, i18);
        }
        char[] cArr6 = this.f25391;
        if (i18 < cArr6.length) {
            str.getChars(i5, i5 + i18, cArr6, 0);
            cArr = this.f25391;
        } else {
            char[] cArr7 = new char[i18];
            str.getChars(i5, i5 + i18, cArr7, 0);
            cArr = cArr7;
        }
        try {
            if (i18 <= 9 && !z3) {
                char c7 = cArr[0];
                if (c7 == '-' || c7 == '+') {
                    c7 = cArr[1];
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                int i19 = c7 - '0';
                int i20 = 0;
                while (i3 < i18) {
                    char c8 = cArr[i3];
                    if (c8 == '.') {
                        i20 = 1;
                    } else {
                        i19 = (i19 * 10) + (c8 - '0');
                        if (i20 != 0) {
                            i20 *= 10;
                        }
                    }
                    i3++;
                }
                if (c2 == 'F') {
                    float f = i19 / i20;
                    if (z) {
                        f = -f;
                    }
                    return Float.valueOf(f);
                }
                double d = ((double) i19) / ((double) i20);
                if (z) {
                    d = -d;
                }
                return Double.valueOf(d);
            }
            String str2 = new String(cArr, 0, i18);
            if (c2 == 'F') {
                return Float.valueOf(str2);
            }
            return Double.valueOf(Double.parseDouble(str2));
        } catch (NumberFormatException e) {
            throw new C16702(e.getMessage() + ", " + m21622(), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final long m21595() {
        long j;
        boolean z = false;
        this.f25378 = 0;
        char c = this.f25388;
        String str = this.f25380;
        int i = this.f25384;
        if (c == '-') {
            this.f25378 = 1;
            int i2 = this.f25377 + 1;
            this.f25377 = i2;
            if (i2 >= i) {
                throw new C16702("syntax error, " + m21622());
            }
            this.f25388 = str.charAt(i2);
            j = Long.MIN_VALUE;
            z = true;
        } else {
            j = -9223372036854775807L;
        }
        long j2 = 0;
        while (true) {
            char c2 = this.f25388;
            if (c2 < '0' || c2 > '9') {
                break;
            }
            int i3 = c2 - '0';
            if (j2 < -922337203685477580L) {
                StringBuilder sbM33191 = C14536.m33191("error long value, ", ", ", j2);
                sbM33191.append(m21622());
                throw new C16702(sbM33191.toString());
            }
            long j3 = j2 * 10;
            long j4 = i3;
            if (j3 < j + j4) {
                StringBuilder sbM33192 = C14536.m33191("error long value, ", ", ", j3);
                sbM33192.append(m21622());
                throw new C16702(sbM33192.toString());
            }
            j2 = j3 - j4;
            this.f25378++;
            int i4 = this.f25377 + 1;
            this.f25377 = i4;
            this.f25388 = i4 >= i ? (char) 26 : str.charAt(i4);
        }
        return !z ? -j2 : j2;
    }

    /* JADX INFO: renamed from: ۜ */
    public final long m21600() {
        boolean z;
        long j;
        long j2;
        int i = this.f25378;
        int i2 = this.f25392 + i;
        if (m21584(i) == '-') {
            i++;
            j = Long.MIN_VALUE;
            z = true;
        } else {
            z = false;
            j = -9223372036854775807L;
        }
        if (i < i2) {
            long j3 = -(m21584(i) - '0');
            i++;
            j2 = j3;
        } else {
            j2 = 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            char cCharAt = i >= this.f25384 ? (char) 26 : this.f25380.charAt(i);
            if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B') {
                i = i3;
                break;
            }
            int i4 = cCharAt - '0';
            if (j2 < -922337203685477580L) {
                throw new NumberFormatException(m21616());
            }
            long j4 = j2 * 10;
            long j5 = i4;
            if (j4 < j + j5) {
                throw new NumberFormatException(m21616());
            }
            j2 = j4 - j5;
            i = i3;
        }
        if (!z) {
            return -j2;
        }
        if (i > this.f25378 + 1) {
            return j2;
        }
        throw new NumberFormatException(m21616());
    }

    /* JADX INFO: renamed from: ֫ */
    public final Number m21585(boolean z) {
        char[] cArr;
        boolean z2;
        int i = (this.f25378 + this.f25392) - 1;
        int i2 = this.f25384;
        String str = this.f25380;
        char cCharAt = i >= i2 ? (char) 26 : str.charAt(i);
        try {
            if (cCharAt == 'F') {
                return Float.valueOf(Float.parseFloat(m21616()));
            }
            if (cCharAt == 'D') {
                return Double.valueOf(Double.parseDouble(m21616()));
            }
            if (z) {
                return m21617();
            }
            char cCharAt2 = str.charAt((this.f25378 + this.f25392) - 1);
            int i3 = this.f25392;
            if (cCharAt2 == 'L' || cCharAt2 == 'S' || cCharAt2 == 'B' || cCharAt2 == 'F' || cCharAt2 == 'D') {
                i3--;
            }
            int i4 = this.f25378;
            char[] cArr2 = this.f25391;
            int i5 = 0;
            if (i3 < cArr2.length) {
                str.getChars(i4, i4 + i3, cArr2, 0);
                cArr = this.f25391;
            } else {
                char[] cArr3 = new char[i3];
                str.getChars(i4, i4 + i3, cArr3, 0);
                cArr = cArr3;
            }
            if (i3 <= 9 && !this.f25389) {
                char c = cArr[0];
                int i6 = 2;
                if (c == '-') {
                    c = cArr[1];
                    z2 = true;
                } else if (c == '+') {
                    c = cArr[1];
                    z2 = false;
                } else {
                    z2 = false;
                    i6 = 1;
                }
                int i7 = c - '0';
                while (i6 < i3) {
                    char c2 = cArr[i6];
                    if (c2 == '.') {
                        i5 = 1;
                    } else {
                        i7 = (i7 * 10) + (c2 - '0');
                        if (i5 != 0) {
                            i5 *= 10;
                        }
                    }
                    i6++;
                }
                double d = ((double) i7) / ((double) i5);
                if (z2) {
                    d = -d;
                }
                return Double.valueOf(d);
            }
            return Double.valueOf(Double.parseDouble(new String(cArr, 0, i3)));
        } catch (NumberFormatException e) {
            throw new C16702(e.getMessage() + ", " + m21622());
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final BigDecimal m21617() {
        int i = (this.f25378 + this.f25392) - 1;
        String str = this.f25380;
        char cCharAt = str.charAt(i);
        int i2 = this.f25392;
        if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B' || cCharAt == 'F' || cCharAt == 'D') {
            i2--;
        }
        int i3 = this.f25378;
        char[] cArr = this.f25391;
        if (i2 < cArr.length) {
            str.getChars(i3, i3 + i2, cArr, 0);
            return new BigDecimal(this.f25391, 0, i2);
        }
        char[] cArr2 = new char[i2];
        str.getChars(i3, i2 + i3, cArr2, 0);
        return new BigDecimal(cArr2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m21591(long j) {
        char cCharAt = this.f25388;
        int i = this.f25377 + 1;
        int i2 = 1;
        while (true) {
            String str = this.f25380;
            int i3 = this.f25384;
            if (cCharAt == '\"' || cCharAt == '\'') {
                long j2 = -3750763034362895579L;
                for (int i4 = i; i4 < i3; i4++) {
                    char cCharAt2 = str.charAt(i4);
                    if (cCharAt2 == cCharAt) {
                        i2 += (i4 - i) + 1;
                        break;
                    }
                    j2 = (j2 ^ ((long) cCharAt2)) * 1099511628211L;
                }
                if (j2 != j) {
                    this.f25387 = -2;
                    this.f25394 = j2;
                    return false;
                }
                int i5 = i2 + 1;
                int i6 = this.f25377 + i2;
                char cCharAt3 = i6 >= i3 ? (char) 26 : str.charAt(i6);
                while (cCharAt3 != ':') {
                    if (cCharAt3 <= ' ' && (cCharAt3 == ' ' || cCharAt3 == '\n' || cCharAt3 == '\r' || cCharAt3 == '\t' || cCharAt3 == '\f' || cCharAt3 == '\b')) {
                        int i7 = i5 + 1;
                        int i8 = this.f25377 + i5;
                        cCharAt3 = i8 >= i3 ? (char) 26 : str.charAt(i8);
                        i5 = i7;
                    } else {
                        throw new C16702("match feild error expect ':'");
                    }
                }
                int i9 = this.f25377 + i5;
                char cCharAt4 = i9 >= i3 ? (char) 26 : str.charAt(i9);
                if (cCharAt4 == '{') {
                    int i10 = i9 + 1;
                    this.f25377 = i10;
                    this.f25388 = i10 < i3 ? str.charAt(i10) : (char) 26;
                    this.f25382 = 12;
                } else if (cCharAt4 == '[') {
                    int i11 = i9 + 1;
                    this.f25377 = i11;
                    this.f25388 = i11 < i3 ? str.charAt(i11) : (char) 26;
                    this.f25382 = 14;
                } else {
                    this.f25377 = i9;
                    this.f25388 = i9 < i3 ? str.charAt(i9) : (char) 26;
                    m21606();
                }
                return true;
            }
            if (cCharAt > ' ' || !(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t' || cCharAt == '\f' || cCharAt == '\b')) {
                break;
            }
            int i12 = i2 + 1;
            int i13 = this.f25377 + i2;
            cCharAt = i13 >= i3 ? (char) 26 : str.charAt(i13);
            i2 = i12;
        }
        this.f25394 = 0L;
        this.f25387 = -2;
        return false;
    }

    /* JADX INFO: renamed from: ᩴ */
    private int m21580(long j) {
        String str;
        int i;
        char cCharAt = this.f25388;
        int i2 = 1;
        while (true) {
            str = this.f25380;
            i = this.f25384;
            if (cCharAt == '\"' || cCharAt == '\'') {
                break;
            }
            if (cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t' || cCharAt == '\f' || cCharAt == '\b') {
                int i3 = i2 + 1;
                int i4 = this.f25377 + i2;
                cCharAt = i4 >= i ? (char) 26 : str.charAt(i4);
                i2 = i3;
            } else {
                this.f25394 = 0L;
                this.f25387 = -2;
                return 0;
            }
        }
        long j2 = -3750763034362895579L;
        for (int i5 = this.f25377 + i2; i5 < i; i5++) {
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 == cCharAt) {
                i2 += (i5 - this.f25377) - i2;
                break;
            }
            j2 = (j2 ^ ((long) cCharAt2)) * 1099511628211L;
        }
        if (j2 != j) {
            this.f25394 = j2;
            this.f25387 = -2;
            return 0;
        }
        int i6 = i2 + 1;
        int i7 = this.f25377 + i6;
        char cCharAt3 = i7 >= i ? (char) 26 : str.charAt(i7);
        while (cCharAt3 != ':') {
            if (cCharAt3 <= ' ' && (cCharAt3 == ' ' || cCharAt3 == '\n' || cCharAt3 == '\r' || cCharAt3 == '\t' || cCharAt3 == '\f' || cCharAt3 == '\b')) {
                int i8 = i6 + 1;
                int i9 = this.f25377 + i6;
                cCharAt3 = i9 >= i ? (char) 26 : str.charAt(i9);
                i6 = i8;
            } else {
                throw new C16702("match feild error expect ':'");
            }
        }
        return i6 + 1;
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m21605(long j) {
        int i;
        char cCharAt;
        this.f25387 = 0;
        int iM21580 = m21580(j);
        if (iM21580 == 0) {
            return 0;
        }
        int i2 = iM21580 + 1;
        int i3 = this.f25377 + iM21580;
        String str = this.f25380;
        int i4 = this.f25384;
        char cCharAt2 = i3 >= i4 ? (char) 26 : str.charAt(i3);
        boolean z = cCharAt2 == '\"';
        if (z) {
            int i5 = iM21580 + 2;
            int i6 = this.f25377 + i2;
            cCharAt2 = i6 >= i4 ? (char) 26 : str.charAt(i6);
            z = true;
            i2 = i5;
        }
        boolean z2 = cCharAt2 == '-';
        if (z2) {
            int i7 = i2 + 1;
            int i8 = this.f25377 + i2;
            cCharAt2 = i8 >= i4 ? (char) 26 : str.charAt(i8);
            i2 = i7;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            this.f25387 = -1;
            return 0;
        }
        int i9 = cCharAt2 - '0';
        while (true) {
            i = i2 + 1;
            int i10 = this.f25377 + i2;
            cCharAt = i10 >= i4 ? (char) 26 : str.charAt(i10);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            i9 = (i9 * 10) + (cCharAt - '0');
            i2 = i;
        }
        if (cCharAt == '.') {
            this.f25387 = -1;
            return 0;
        }
        if (cCharAt == '\"') {
            if (!z) {
                this.f25387 = -1;
                return 0;
            }
            int i11 = i2 + 2;
            int i12 = this.f25377 + i;
            cCharAt = i12 >= i4 ? (char) 26 : str.charAt(i12);
            i = i11;
        }
        if (i9 < 0) {
            this.f25387 = -1;
            return 0;
        }
        while (cCharAt != ',') {
            if (cCharAt > ' ' || !(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t' || cCharAt == '\f' || cCharAt == '\b')) {
                if (cCharAt == '}') {
                    char cM21584 = m21584(this.f25377 + i);
                    if (cM21584 == ',') {
                        this.f25382 = 16;
                        int i13 = this.f25377 + i + 1;
                        this.f25377 = i13;
                        this.f25388 = i13 < i4 ? str.charAt(i13) : (char) 26;
                    } else if (cM21584 == ']') {
                        this.f25382 = 15;
                        int i14 = this.f25377 + i + 1;
                        this.f25377 = i14;
                        this.f25388 = i14 < i4 ? str.charAt(i14) : (char) 26;
                    } else if (cM21584 == '}') {
                        this.f25382 = 13;
                        int i15 = this.f25377 + i + 1;
                        this.f25377 = i15;
                        this.f25388 = i15 < i4 ? str.charAt(i15) : (char) 26;
                    } else if (cM21584 == 26) {
                        this.f25382 = 20;
                        this.f25377 += i;
                        this.f25388 = (char) 26;
                    } else {
                        this.f25387 = -1;
                        return 0;
                    }
                    this.f25387 = 4;
                    if (z2) {
                        return -i9;
                    }
                    return i9;
                }
                this.f25387 = -1;
                return 0;
            }
            int i16 = i + 1;
            int i17 = this.f25377 + i;
            cCharAt = i17 >= i4 ? (char) 26 : str.charAt(i17);
            i = i16;
        }
        int i18 = (i - 1) + this.f25377 + 1;
        this.f25377 = i18;
        this.f25388 = i18 < i4 ? str.charAt(i18) : (char) 26;
        this.f25387 = 3;
        this.f25382 = 16;
        if (z2) {
            return -i9;
        }
        return i9;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int[] m21604(long j) {
        int i;
        boolean z;
        int i2;
        char cCharAt;
        char cCharAt2;
        int i3;
        int i4;
        int[] iArr;
        this.f25387 = 0;
        int iM21580 = m21580(j);
        int[] iArr2 = null;
        if (iM21580 == 0) {
            return null;
        }
        int i5 = iM21580 + 1;
        int i6 = this.f25377 + iM21580;
        String str = this.f25380;
        int i7 = this.f25384;
        if ((i6 >= i7 ? (char) 26 : str.charAt(i6)) != '[') {
            this.f25387 = -1;
            return null;
        }
        int i8 = iM21580 + 2;
        int i9 = this.f25377 + i5;
        char cCharAt3 = i9 >= i7 ? (char) 26 : str.charAt(i9);
        int[] iArr3 = new int[16];
        if (cCharAt3 == ']') {
            i3 = iM21580 + 3;
            int i10 = this.f25377 + i8;
            cCharAt2 = i10 >= i7 ? (char) 26 : str.charAt(i10);
            i4 = 0;
        } else {
            int i11 = 0;
            while (true) {
                if (cCharAt3 == '-') {
                    i = i8 + 1;
                    int i12 = this.f25377 + i8;
                    cCharAt3 = i12 >= i7 ? (char) 26 : str.charAt(i12);
                    z = true;
                } else {
                    i = i8;
                    z = false;
                }
                if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                    int i13 = cCharAt3 - '0';
                    while (true) {
                        i2 = i + 1;
                        int i14 = this.f25377 + i;
                        cCharAt = i14 >= i7 ? (char) 26 : str.charAt(i14);
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i13 = (i13 * 10) + (cCharAt - '0');
                        i = i2;
                    }
                    if (i11 >= iArr3.length) {
                        int[] iArr4 = new int[(iArr3.length * 3) / 2];
                        System.arraycopy(iArr3, 0, iArr4, 0, i11);
                        iArr3 = iArr4;
                    }
                    int i15 = i11 + 1;
                    if (z) {
                        i13 = -i13;
                    }
                    iArr3[i11] = i13;
                    if (cCharAt == ',') {
                        int i16 = i + 2;
                        int i17 = this.f25377 + i2;
                        cCharAt3 = i17 >= i7 ? (char) 26 : str.charAt(i17);
                        i8 = i16;
                        iArr = null;
                    } else {
                        if (cCharAt == ']') {
                            int i18 = i + 2;
                            int i19 = this.f25377 + i2;
                            cCharAt2 = i19 >= i7 ? (char) 26 : str.charAt(i19);
                            i3 = i18;
                            i4 = i15;
                            break;
                        }
                        iArr = null;
                        cCharAt3 = cCharAt;
                        i8 = i2;
                    }
                    iArr2 = iArr;
                    i11 = i15;
                } else {
                    int[] iArr5 = iArr2;
                    this.f25387 = -1;
                    return iArr5;
                }
            }
        }
        if (i4 != iArr3.length) {
            int[] iArr6 = new int[i4];
            System.arraycopy(iArr3, 0, iArr6, 0, i4);
            iArr3 = iArr6;
        }
        if (cCharAt2 == ',') {
            this.f25377 = (i3 - 1) + this.f25377;
            m21625();
            this.f25387 = 3;
            this.f25382 = 16;
            return iArr3;
        }
        if (cCharAt2 == '}') {
            char cM21584 = m21584(this.f25377 + i3);
            if (cM21584 == ',') {
                this.f25382 = 16;
                this.f25377 += i3;
                m21625();
            } else if (cM21584 == ']') {
                this.f25382 = 15;
                this.f25377 += i3;
                m21625();
            } else if (cM21584 == '}') {
                this.f25382 = 13;
                this.f25377 += i3;
                m21625();
            } else if (cM21584 == 26) {
                this.f25377 += i3;
                this.f25382 = 20;
                this.f25388 = (char) 26;
            } else {
                this.f25387 = -1;
                return null;
            }
            this.f25387 = 4;
            return iArr3;
        }
        this.f25387 = -1;
        return null;
    }

    /* JADX INFO: renamed from: ܺ */
    public final long m21615(long j) {
        int i;
        char cCharAt;
        this.f25387 = 0;
        int iM21580 = m21580(j);
        if (iM21580 == 0) {
            return 0L;
        }
        int i2 = iM21580 + 1;
        int i3 = this.f25377 + iM21580;
        String str = this.f25380;
        int i4 = this.f25384;
        char cCharAt2 = i3 >= i4 ? (char) 26 : str.charAt(i3);
        boolean z = cCharAt2 == '\"';
        if (z) {
            int i5 = iM21580 + 2;
            int i6 = this.f25377 + i2;
            cCharAt2 = i6 >= i4 ? (char) 26 : str.charAt(i6);
            i2 = i5;
        }
        boolean z2 = cCharAt2 == '-';
        if (z2) {
            int i7 = i2 + 1;
            int i8 = this.f25377 + i2;
            i2 = i7;
            cCharAt2 = i8 >= i4 ? (char) 26 : str.charAt(i8);
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            this.f25387 = -1;
            return 0L;
        }
        long j2 = cCharAt2 - '0';
        while (true) {
            i = i2 + 1;
            int i9 = this.f25377 + i2;
            cCharAt = i9 >= i4 ? (char) 26 : str.charAt(i9);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j2 = (j2 * 10) + ((long) (cCharAt - '0'));
            i2 = i;
        }
        if (cCharAt == '.') {
            this.f25387 = -1;
            return 0L;
        }
        if (cCharAt == '\"') {
            if (!z) {
                this.f25387 = -1;
                return 0L;
            }
            int i10 = i2 + 2;
            int i11 = this.f25377 + i;
            cCharAt = i11 >= i4 ? (char) 26 : str.charAt(i11);
            i = i10;
        }
        if (j2 < 0) {
            this.f25387 = -1;
            return 0L;
        }
        if (cCharAt == ',') {
            int i12 = (i - 1) + this.f25377 + 1;
            this.f25377 = i12;
            this.f25388 = i12 < i4 ? str.charAt(i12) : (char) 26;
            this.f25387 = 3;
            this.f25382 = 16;
            if (z2) {
                return -j2;
            }
        } else if (cCharAt == '}') {
            char cM21584 = m21584(this.f25377 + i);
            if (cM21584 == ',') {
                this.f25382 = 16;
                int i13 = this.f25377 + i + 1;
                this.f25377 = i13;
                this.f25388 = i13 < i4 ? str.charAt(i13) : (char) 26;
            } else if (cM21584 == ']') {
                this.f25382 = 15;
                int i14 = this.f25377 + i + 1;
                this.f25377 = i14;
                this.f25388 = i14 < i4 ? str.charAt(i14) : (char) 26;
            } else if (cM21584 == '}') {
                this.f25382 = 13;
                int i15 = this.f25377 + i + 1;
                this.f25377 = i15;
                this.f25388 = i15 < i4 ? str.charAt(i15) : (char) 26;
            } else if (cM21584 == 26) {
                this.f25382 = 20;
                this.f25377 += i;
                this.f25388 = (char) 26;
            } else {
                this.f25387 = -1;
                return 0L;
            }
            this.f25387 = 4;
            if (z2) {
                return -j2;
            }
        } else {
            this.f25387 = -1;
            return 0L;
        }
        return j2;
    }

    /* JADX INFO: renamed from: ۖ */
    public final String m21596(long j) {
        String str;
        this.f25387 = 0;
        int iM21580 = m21580(j);
        if (iM21580 == 0) {
            return null;
        }
        int i = iM21580 + 1;
        int i2 = this.f25377 + iM21580;
        int i3 = this.f25384;
        if (i2 >= i3) {
            throw new C16702("unclosed str, " + m21622());
        }
        String str2 = this.f25380;
        char cCharAt = str2.charAt(i2);
        String str3 = this.f25375;
        if (cCharAt != '\"') {
            this.f25387 = -1;
            return str3;
        }
        int i4 = this.f25377 + i;
        int iIndexOf = str2.indexOf(34, i4);
        if (iIndexOf == -1) {
            throw new C16702("unclosed str, " + m21622());
        }
        if (f25374) {
            str = str2.substring(i4, iIndexOf);
        } else {
            int i5 = iIndexOf - i4;
            str = new String(m21594(this.f25377 + i, i5), 0, i5);
        }
        if (str.indexOf(92) != -1) {
            boolean z = false;
            while (true) {
                int i6 = iIndexOf - 1;
                int i7 = 0;
                while (i6 >= 0 && str2.charAt(i6) == '\\') {
                    i7++;
                    i6--;
                    z = true;
                }
                if (i7 % 2 == 0) {
                    break;
                }
                iIndexOf = str2.indexOf(34, iIndexOf + 1);
            }
            int i8 = iIndexOf - i4;
            char[] cArrM21594 = m21594(this.f25377 + i, i8);
            if (z) {
                str = m21574(cArrM21594, i8);
            } else {
                str = new String(cArrM21594, 0, i8);
                if (str.indexOf(92) != -1) {
                    str = m21574(cArrM21594, i8);
                }
            }
        }
        int i9 = iIndexOf + 1;
        char cCharAt2 = i9 >= i3 ? (char) 26 : str2.charAt(i9);
        if (cCharAt2 == ',') {
            int i10 = iIndexOf + 2;
            this.f25377 = i10;
            this.f25388 = i10 < i3 ? str2.charAt(i10) : (char) 26;
            this.f25387 = 3;
            this.f25382 = 16;
            return str;
        }
        if (cCharAt2 == '}') {
            int i11 = iIndexOf + 2;
            char cCharAt3 = i11 >= i3 ? (char) 26 : str2.charAt(i11);
            if (cCharAt3 == ',') {
                this.f25382 = 16;
                this.f25377 = i11;
                m21625();
            } else if (cCharAt3 == ']') {
                this.f25382 = 15;
                this.f25377 = i11;
                m21625();
            } else if (cCharAt3 == '}') {
                this.f25382 = 13;
                this.f25377 = i11;
                m21625();
            } else if (cCharAt3 == 26) {
                this.f25382 = 20;
                this.f25377 = i11;
                this.f25388 = (char) 26;
            } else {
                this.f25387 = -1;
                return str3;
            }
            this.f25387 = 4;
            return str;
        }
        this.f25387 = -1;
        return str3;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Date m21618(long j) {
        int i;
        char cCharAt;
        char cCharAt2;
        int i2;
        Date date;
        this.f25387 = 0;
        int iM21580 = m21580(j);
        if (iM21580 == 0) {
            return null;
        }
        int i3 = this.f25377;
        char c = this.f25388;
        int i4 = iM21580 + 1;
        int i5 = i3 + iM21580;
        int i6 = this.f25384;
        String str = this.f25380;
        char cCharAt3 = i5 >= i6 ? (char) 26 : str.charAt(i5);
        if (cCharAt3 == '\"') {
            int i7 = this.f25377;
            int i8 = i7 + i4;
            int i9 = iM21580 + 2;
            int i10 = i7 + i4;
            if (i10 < i6) {
                str.charAt(i10);
            }
            int iIndexOf = str.indexOf(34, this.f25377 + i9);
            if (iIndexOf == -1) {
                throw new C16702("unclosed str");
            }
            int i11 = iIndexOf - i8;
            this.f25377 = i8;
            if (m21590(i11, false)) {
                date = this.f25385.getTime();
                int i12 = i9 + i11;
                i2 = i12 + 1;
                cCharAt2 = m21584(i12 + i3);
                this.f25377 = i3;
            } else {
                this.f25377 = i3;
                this.f25387 = -1;
                return null;
            }
        } else {
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                this.f25387 = -1;
                return null;
            }
            long j2 = cCharAt3 - '0';
            while (true) {
                i = i4 + 1;
                int i13 = this.f25377 + i4;
                cCharAt = i13 >= i6 ? (char) 26 : str.charAt(i13);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                j2 = (j2 * 10) + ((long) (cCharAt - '0'));
                i4 = i;
            }
            if (cCharAt == '.') {
                this.f25387 = -1;
                return null;
            }
            if (cCharAt == '\"') {
                i2 = i4 + 2;
                int i14 = this.f25377 + i;
                cCharAt2 = i14 >= i6 ? (char) 26 : str.charAt(i14);
            } else {
                cCharAt2 = cCharAt;
                i2 = i;
            }
            if (j2 < 0) {
                this.f25387 = -1;
                return null;
            }
            date = new Date(j2);
        }
        if (cCharAt2 == ',') {
            int i15 = (i2 - 1) + this.f25377 + 1;
            this.f25377 = i15;
            this.f25388 = i15 < i6 ? str.charAt(i15) : (char) 26;
            this.f25387 = 3;
            this.f25382 = 16;
            return date;
        }
        if (cCharAt2 == '}') {
            char cM21584 = m21584(this.f25377 + i2);
            if (cM21584 == ',') {
                this.f25382 = 16;
                int i16 = this.f25377 + i2 + 1;
                this.f25377 = i16;
                this.f25388 = i16 < i6 ? str.charAt(i16) : (char) 26;
            } else if (cM21584 == ']') {
                this.f25382 = 15;
                int i17 = this.f25377 + i2 + 1;
                this.f25377 = i17;
                this.f25388 = i17 < i6 ? str.charAt(i17) : (char) 26;
            } else if (cM21584 == '}') {
                this.f25382 = 13;
                int i18 = this.f25377 + i2 + 1;
                this.f25377 = i18;
                this.f25388 = i18 < i6 ? str.charAt(i18) : (char) 26;
            } else if (cM21584 == 26) {
                this.f25382 = 20;
                this.f25377 += i2;
                this.f25388 = (char) 26;
            } else {
                this.f25377 = i3;
                this.f25388 = c;
                this.f25387 = -1;
                return null;
            }
            this.f25387 = 4;
            return date;
        }
        this.f25377 = i3;
        this.f25388 = c;
        this.f25387 = -1;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00db  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:74:0x0109  */
    /* JADX WARN: Code duplicated, block: B:76:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0112  */
    /* JADX WARN: Code duplicated, block: B:80:0x011e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0127  */
    /* JADX WARN: Code duplicated, block: B:86:0x0135  */
    /* JADX WARN: Code duplicated, block: B:88:0x0138  */
    /* JADX INFO: renamed from: ۧ */
    public final boolean m21610(long j) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        char cM21584;
        this.f25387 = 0;
        int iM21580 = m21580(j);
        if (iM21580 == 0) {
            return false;
        }
        int i5 = this.f25377 + iM21580;
        String str = this.f25380;
        if (!str.startsWith("false", i5)) {
            if (str.startsWith("true", this.f25377 + iM21580)) {
                i = iM21580 + 4;
            } else if (str.startsWith("\"false\"", this.f25377 + iM21580)) {
                i = iM21580 + 7;
            } else if (str.startsWith("\"true\"", this.f25377 + iM21580)) {
                i = iM21580 + 6;
            } else if (str.charAt(this.f25377 + iM21580) == '1') {
                i = iM21580 + 1;
            } else if (str.charAt(this.f25377 + iM21580) == '0') {
                i = iM21580 + 1;
            } else if (str.startsWith("\"1\"", this.f25377 + iM21580)) {
                i = iM21580 + 3;
            } else {
                if (!str.startsWith("\"0\"", this.f25377 + iM21580)) {
                    this.f25387 = -1;
                    return false;
                }
                i = iM21580 + 3;
            }
            z = true;
            i2 = i + 1;
            i3 = this.f25377 + i;
            i4 = this.f25384;
            if (i3 >= i4) {
                cCharAt = 26;
            } else {
                cCharAt = str.charAt(i3);
            }
            while (cCharAt != ',') {
                if (cCharAt != '}' || (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t' && cCharAt != '\f' && cCharAt != '\b')) {
                    break;
                    if (cCharAt == '}') {
                        cM21584 = m21584(this.f25377 + i2);
                        if (cM21584 == ',') {
                            this.f25382 = 16;
                            int i6 = this.f25377 + i2 + 1;
                            this.f25377 = i6;
                            this.f25388 = i6 < i4 ? str.charAt(i6) : (char) 26;
                        } else if (cM21584 == ']') {
                            this.f25382 = 15;
                            int i7 = this.f25377 + i2 + 1;
                            this.f25377 = i7;
                            this.f25388 = i7 < i4 ? str.charAt(i7) : (char) 26;
                        } else if (cM21584 == '}') {
                            this.f25382 = 13;
                            int i8 = this.f25377 + i2 + 1;
                            this.f25377 = i8;
                            this.f25388 = i8 < i4 ? str.charAt(i8) : (char) 26;
                        } else if (cM21584 == 26) {
                            this.f25382 = 20;
                            this.f25377 += i2;
                            this.f25388 = (char) 26;
                        } else {
                            this.f25387 = -1;
                            return false;
                        }
                        this.f25387 = 4;
                        return z;
                    }
                    this.f25387 = -1;
                    return false;
                }
                int i9 = i2 + 1;
                int i10 = this.f25377 + i2;
                cCharAt = i10 >= i4 ? (char) 26 : str.charAt(i10);
                i2 = i9;
            }
            int i11 = (i2 - 1) + this.f25377 + 1;
            this.f25377 = i11;
            this.f25388 = i11 < i4 ? str.charAt(i11) : (char) 26;
            this.f25387 = 3;
            this.f25382 = 16;
            return z;
        }
        i = iM21580 + 5;
        z = false;
        i2 = i + 1;
        i3 = this.f25377 + i;
        i4 = this.f25384;
        if (i3 >= i4) {
            cCharAt = 26;
        } else {
            cCharAt = str.charAt(i3);
        }
        while (true) {
            if (cCharAt != '}') {
                break;
            }
            i2 = i9;
        }
        if (cCharAt == '}') {
            cM21584 = m21584(this.f25377 + i2);
            if (cM21584 == ',') {
                this.f25382 = 16;
                int i12 = this.f25377 + i2 + 1;
                this.f25377 = i12;
                this.f25388 = i12 < i4 ? str.charAt(i12) : (char) 26;
            } else if (cM21584 == ']') {
                this.f25382 = 15;
                int i13 = this.f25377 + i2 + 1;
                this.f25377 = i13;
                this.f25388 = i13 < i4 ? str.charAt(i13) : (char) 26;
            } else if (cM21584 == '}') {
                this.f25382 = 13;
                int i14 = this.f25377 + i2 + 1;
                this.f25377 = i14;
                this.f25388 = i14 < i4 ? str.charAt(i14) : (char) 26;
            } else if (cM21584 == 26) {
                this.f25382 = 20;
                this.f25377 += i2;
                this.f25388 = (char) 26;
            } else {
                this.f25387 = -1;
                return false;
            }
            this.f25387 = 4;
            return z;
        }
        this.f25387 = -1;
        return false;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final float m21627(long j) {
        int i;
        char cM21584;
        int i2;
        float f;
        float f2;
        this.f25387 = 0;
        int iM21580 = m21580(j);
        if (iM21580 == 0) {
            return 0.0f;
        }
        int i3 = iM21580 + 1;
        char cM21585 = m21584(this.f25377 + iM21580);
        int i4 = this.f25377;
        int i5 = (i4 + i3) - 1;
        boolean z = cM21585 == '-';
        if (z) {
            cM21585 = m21584(i4 + i3);
            i3 = iM21580 + 2;
        }
        if (cM21585 >= '0' && cM21585 <= '9') {
            int i6 = cM21585 - '0';
            while (true) {
                i = i3 + 1;
                cM21584 = m21584(this.f25377 + i3);
                if (cM21584 < '0' || cM21584 > '9') {
                    break;
                }
                i6 = (i6 * 10) + (cM21584 - '0');
                i3 = i;
            }
            if (cM21584 == '.') {
                int i7 = i3 + 2;
                char cM21586 = m21584(this.f25377 + i);
                if (cM21586 < '0' || cM21586 > '9') {
                    this.f25387 = -1;
                    return 0.0f;
                }
                i2 = 10;
                i6 = (cM21586 - '0') + (i6 * 10);
                while (true) {
                    i = i7 + 1;
                    cM21584 = m21584(this.f25377 + i7);
                    if (cM21584 < '0' || cM21584 > '9') {
                        break;
                    }
                    i6 = (i6 * 10) + (cM21584 - '0');
                    i2 *= 10;
                    i7 = i;
                }
            } else {
                i2 = 1;
            }
            boolean z2 = cM21584 == 'e' || cM21584 == 'E';
            if (z2) {
                int i8 = i + 1;
                char cM21587 = m21584(this.f25377 + i);
                f = 0.0f;
                if (cM21587 == '+' || cM21587 == '-') {
                    i += 2;
                    cM21587 = m21584(this.f25377 + i8);
                } else {
                    i = i8;
                }
                cM21584 = cM21587;
                while (cM21584 >= '0' && cM21584 <= '9') {
                    cM21584 = m21584(this.f25377 + i);
                    i++;
                }
            } else {
                f = 0.0f;
            }
            int i9 = ((this.f25377 + i) - i5) - 1;
            if (z2 || i9 >= 10) {
                f2 = Float.parseFloat(m21578(i5, i9));
            } else {
                f2 = i6 / i2;
                if (z) {
                    f2 = -f2;
                }
            }
            if (cM21584 == ',') {
                this.f25377 = (i - 1) + this.f25377;
                m21625();
                this.f25387 = 3;
                this.f25382 = 16;
                return f2;
            }
            if (cM21584 == '}') {
                char cM21588 = m21584(this.f25377 + i);
                if (cM21588 == ',') {
                    this.f25382 = 16;
                    this.f25377 += i;
                    m21625();
                } else if (cM21588 == ']') {
                    this.f25382 = 15;
                    this.f25377 += i;
                    m21625();
                } else if (cM21588 == '}') {
                    this.f25382 = 13;
                    this.f25377 += i;
                    m21625();
                } else if (cM21588 == 26) {
                    this.f25377 += i;
                    this.f25382 = 20;
                    this.f25388 = (char) 26;
                } else {
                    this.f25387 = -1;
                    return f;
                }
                this.f25387 = 4;
                return f2;
            }
            this.f25387 = -1;
            return f;
        }
        this.f25387 = -1;
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۜ */
    public final float[] m21601(long j) {
        int i;
        char cCharAt;
        int i2;
        int i3;
        float f;
        char c;
        this.f25387 = 0;
        int iM21580 = m21580(j);
        if (iM21580 == 0) {
            return null;
        }
        int i4 = iM21580 + 1;
        int i5 = this.f25377 + iM21580;
        String str = this.f25380;
        int i6 = this.f25384;
        int i7 = -1;
        if ((i5 >= i6 ? (char) 26 : str.charAt(i5)) != '[') {
            this.f25387 = -1;
            return null;
        }
        int i8 = iM21580 + 2;
        int i9 = this.f25377 + i4;
        char cCharAt2 = i9 >= i6 ? (char) 26 : str.charAt(i9);
        float[] fArr = new float[16];
        int i10 = 0;
        while (true) {
            int i11 = this.f25377;
            int i12 = (i11 + i8) - 1;
            boolean z = cCharAt2 == '-';
            if (z) {
                int i13 = i8 + 1;
                int i14 = i11 + i8;
                cCharAt2 = i14 >= i6 ? (char) 26 : str.charAt(i14);
                i8 = i13;
            }
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                break;
            }
            int i15 = cCharAt2 - '0';
            while (true) {
                i = i8 + 1;
                int i16 = this.f25377 + i8;
                cCharAt = i16 >= i6 ? (char) 26 : str.charAt(i16);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i15 = (i15 * 10) + (cCharAt - '0');
                i8 = i;
            }
            if (cCharAt == '.') {
                int i17 = i8 + 2;
                int i18 = this.f25377 + i;
                char cCharAt3 = i18 >= i6 ? (char) 26 : str.charAt(i18);
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    this.f25387 = i7;
                    return null;
                }
                i15 = (cCharAt3 - '0') + (i15 * 10);
                i2 = 10;
                while (true) {
                    i = i17 + 1;
                    int i19 = this.f25377 + i17;
                    cCharAt = i19 >= i6 ? (char) 26 : str.charAt(i19);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    i15 = (i15 * 10) + (cCharAt - '0');
                    i2 *= 10;
                    i17 = i;
                }
            } else {
                i2 = 1;
            }
            boolean z2 = cCharAt == 'e' || cCharAt == 'E';
            if (z2) {
                int i20 = i + 1;
                int i21 = this.f25377 + i;
                cCharAt = i21 >= i6 ? (char) 26 : str.charAt(i21);
                if (cCharAt == '+' || cCharAt == '-') {
                    i += 2;
                    int i22 = this.f25377 + i20;
                    cCharAt = i22 >= i6 ? (char) 26 : str.charAt(i22);
                    c = '9';
                    z2 = z2;
                } else {
                    i = i20;
                    c = '9';
                }
                while (cCharAt >= '0' && cCharAt <= c) {
                    int i23 = i + 1;
                    int i24 = this.f25377 + i;
                    i = i23;
                    cCharAt = i24 >= i6 ? (char) 26 : str.charAt(i24);
                    c = c;
                    z2 = z2;
                }
                i3 = 10;
            } else {
                i3 = 10;
            }
            int i25 = ((this.f25377 + i) - i12) - 1;
            if (z2 || i25 >= i3) {
                f = Float.parseFloat(m21578(i12, i25));
            } else {
                f = i15 / i2;
                if (z) {
                    f = -f;
                }
            }
            if (i10 >= fArr.length) {
                float[] fArr2 = new float[(fArr.length * 3) / 2];
                System.arraycopy(fArr, 0, fArr2, 0, i10);
                fArr = fArr2;
            }
            int i26 = i10 + 1;
            fArr[i10] = f;
            if (cCharAt == ',') {
                int i27 = i + 1;
                int i28 = this.f25377 + i;
                cCharAt = i28 >= i6 ? (char) 26 : str.charAt(i28);
                i8 = i27;
            } else {
                if (cCharAt == ']') {
                    int i29 = i + 1;
                    int i30 = this.f25377 + i;
                    char cCharAt4 = i30 >= i6 ? (char) 26 : str.charAt(i30);
                    if (i26 != fArr.length) {
                        float[] fArr3 = new float[i26];
                        System.arraycopy(fArr, 0, fArr3, 0, i26);
                        fArr = fArr3;
                    }
                    if (cCharAt4 == ',') {
                        this.f25377 += i;
                        m21625();
                        this.f25387 = 3;
                        this.f25382 = 16;
                        return fArr;
                    }
                    if (cCharAt4 == '}') {
                        int i31 = this.f25377 + i29;
                        char cCharAt5 = i31 >= i6 ? (char) 26 : str.charAt(i31);
                        if (cCharAt5 == ',') {
                            this.f25382 = 16;
                            this.f25377 = i + 1 + this.f25377;
                            m21625();
                        } else if (cCharAt5 == ']') {
                            this.f25382 = 15;
                            this.f25377 = i + 1 + this.f25377;
                            m21625();
                        } else if (cCharAt5 == '}') {
                            this.f25382 = 13;
                            this.f25377 = i + 1 + this.f25377;
                            m21625();
                        } else if (cCharAt5 == 26) {
                            this.f25377 = i + 1 + this.f25377;
                            this.f25382 = 20;
                            this.f25388 = (char) 26;
                        } else {
                            this.f25387 = -1;
                            return null;
                        }
                        this.f25387 = 4;
                        return fArr;
                    }
                    this.f25387 = -1;
                    return null;
                }
                i8 = i;
            }
            i7 = -1;
            i10 = i26;
            cCharAt2 = cCharAt;
        }
        this.f25387 = -1;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:97:0x0126  */
    /* JADX INFO: renamed from: ᩷ */
    public final float[][] m21626(long j) {
        int i;
        char cCharAt;
        int i2;
        float f;
        int i3;
        int i4;
        char cCharAt2;
        this.f25387 = 0;
        int iM21580 = m21580(j);
        if (iM21580 == 0) {
            return null;
        }
        int i5 = iM21580 + 1;
        int i6 = this.f25377 + iM21580;
        String str = this.f25380;
        int i7 = this.f25384;
        char c = '[';
        int i8 = -1;
        if ((i6 >= i7 ? (char) 26 : str.charAt(i6)) != '[') {
            this.f25387 = -1;
            return null;
        }
        int i9 = iM21580 + 2;
        int i10 = this.f25377 + i5;
        char cCharAt3 = i10 >= i7 ? (char) 26 : str.charAt(i10);
        int i11 = 16;
        float[][] fArr = new float[16][];
        int i12 = 0;
        loop0: while (true) {
            if (cCharAt3 == c) {
                int i13 = i9 + 1;
                int i14 = this.f25377 + i9;
                char cCharAt4 = i14 >= i7 ? (char) 26 : str.charAt(i14);
                float[] fArr2 = new float[i11];
                int i15 = 0;
                while (true) {
                    int i16 = this.f25377;
                    int i17 = (i16 + i13) - 1;
                    boolean z = cCharAt4 == '-';
                    if (z) {
                        int i18 = i16 + i13;
                        i13++;
                        cCharAt4 = i18 >= i7 ? (char) 26 : str.charAt(i18);
                    }
                    if (cCharAt4 < '0' || cCharAt4 > '9') {
                        break loop0;
                    }
                    int i19 = cCharAt4 - '0';
                    while (true) {
                        i = i13 + 1;
                        int i20 = this.f25377 + i13;
                        cCharAt = i20 >= i7 ? (char) 26 : str.charAt(i20);
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i19 = (i19 * 10) + (cCharAt - '0');
                        i13 = i;
                    }
                    if (cCharAt == '.') {
                        int i21 = i13 + 2;
                        int i22 = this.f25377 + i;
                        char cCharAt5 = i22 >= i7 ? (char) 26 : str.charAt(i22);
                        if (cCharAt5 < '0' || cCharAt5 > '9') {
                            this.f25387 = i8;
                            return null;
                        }
                        i19 = (cCharAt5 - '0') + (i19 * 10);
                        i2 = 10;
                        while (true) {
                            i = i21 + 1;
                            int i23 = this.f25377 + i21;
                            cCharAt = i23 >= i7 ? (char) 26 : str.charAt(i23);
                            if (cCharAt < '0' || cCharAt > '9') {
                                break;
                            }
                            i19 = (i19 * 10) + (cCharAt - '0');
                            i2 *= 10;
                            i21 = i;
                        }
                    } else {
                        i2 = 1;
                    }
                    boolean z2 = cCharAt == 'e' || cCharAt == 'E';
                    if (z2) {
                        int i24 = i + 1;
                        int i25 = this.f25377 + i;
                        char cCharAt6 = i25 >= i7 ? (char) 26 : str.charAt(i25);
                        if (cCharAt6 == '+' || cCharAt6 == '-') {
                            i += 2;
                            int i26 = this.f25377 + i24;
                            if (i26 >= i7) {
                                cCharAt = 26;
                            } else {
                                cCharAt6 = str.charAt(i26);
                            }
                            while (cCharAt >= '0' && cCharAt <= '9') {
                                int i27 = i + 1;
                                i4 = this.f25377 + i;
                                if (i4 >= i7) {
                                    cCharAt2 = 26;
                                } else {
                                    cCharAt2 = str.charAt(i4);
                                }
                                i = i27;
                                cCharAt = cCharAt2;
                            }
                        } else {
                            i = i24;
                        }
                        cCharAt = cCharAt6;
                        while (cCharAt >= '0') {
                            int i28 = i + 1;
                            i4 = this.f25377 + i;
                            if (i4 >= i7) {
                                cCharAt2 = 26;
                            } else {
                                cCharAt2 = str.charAt(i4);
                            }
                            i = i28;
                            cCharAt = cCharAt2;
                        }
                    }
                    int i29 = ((this.f25377 + i) - i17) - 1;
                    if (z2 || i29 >= 10) {
                        f = Float.parseFloat(m21578(i17, i29));
                    } else {
                        f = i19 / i2;
                        if (z) {
                            f = -f;
                        }
                    }
                    if (i15 >= fArr2.length) {
                        float[] fArr3 = new float[(fArr2.length * 3) / 2];
                        System.arraycopy(fArr2, 0, fArr3, 0, i15);
                        fArr2 = fArr3;
                    }
                    int i30 = i15 + 1;
                    fArr2[i15] = f;
                    if (cCharAt == ',') {
                        int i31 = i + 1;
                        int i32 = this.f25377 + i;
                        cCharAt4 = i32 >= i7 ? (char) 26 : str.charAt(i32);
                        i13 = i31;
                    } else {
                        if (cCharAt == ']') {
                            int i33 = i + 1;
                            int i34 = this.f25377 + i;
                            char cCharAt7 = i34 >= i7 ? (char) 26 : str.charAt(i34);
                            if (i30 != fArr2.length) {
                                float[] fArr4 = new float[i30];
                                i3 = 0;
                                System.arraycopy(fArr2, 0, fArr4, 0, i30);
                                fArr2 = fArr4;
                            } else {
                                i3 = 0;
                            }
                            if (i12 >= fArr.length) {
                                fArr = new float[(fArr.length * 3) / 2][];
                                System.arraycopy(fArr2, i3, fArr, i3, i30);
                            }
                            int i35 = i12 + 1;
                            fArr[i12] = fArr2;
                            if (cCharAt7 == ',') {
                                int i36 = i + 2;
                                int i37 = this.f25377 + i33;
                                cCharAt3 = i37 >= i7 ? (char) 26 : str.charAt(i37);
                                i9 = i36;
                            } else {
                                if (cCharAt7 == ']') {
                                    int i38 = i + 2;
                                    int i39 = this.f25377 + i33;
                                    char cCharAt8 = i39 >= i7 ? (char) 26 : str.charAt(i39);
                                    if (i35 != fArr.length) {
                                        float[][] fArr5 = new float[i35][];
                                        System.arraycopy(fArr, 0, fArr5, 0, i35);
                                        fArr = fArr5;
                                    }
                                    if (cCharAt8 == ',') {
                                        this.f25377 = i + 1 + this.f25377;
                                        m21625();
                                        this.f25387 = 3;
                                        this.f25382 = 16;
                                        return fArr;
                                    }
                                    if (cCharAt8 == '}') {
                                        char cM21584 = m21584(this.f25377 + i38);
                                        if (cM21584 == ',') {
                                            this.f25382 = 16;
                                            this.f25377 = i + 2 + this.f25377;
                                            m21625();
                                        } else if (cM21584 == ']') {
                                            this.f25382 = 15;
                                            this.f25377 = i + 2 + this.f25377;
                                            m21625();
                                        } else if (cM21584 == '}') {
                                            this.f25382 = 13;
                                            this.f25377 = i + 2 + this.f25377;
                                            m21625();
                                        } else if (cM21584 == 26) {
                                            this.f25377 = i + 2 + this.f25377;
                                            this.f25382 = 20;
                                            this.f25388 = (char) 26;
                                        } else {
                                            this.f25387 = -1;
                                            return null;
                                        }
                                        this.f25387 = 4;
                                        return fArr;
                                    }
                                    this.f25387 = -1;
                                    return null;
                                }
                                cCharAt3 = cCharAt7;
                                i9 = i33;
                            }
                            i8 = -1;
                            i11 = 16;
                            c = '[';
                            i12 = i35;
                            break;
                        }
                        cCharAt4 = cCharAt;
                        i13 = i;
                    }
                    i8 = -1;
                    i15 = i30;
                }
            }
        }
        this.f25387 = i8;
        return null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final double m21621(long j) {
        int i;
        char cM21584;
        int i2;
        double d;
        int i3;
        char cM21585;
        this.f25387 = 0;
        int iM21580 = m21580(j);
        if (iM21580 == 0) {
            return 0.0d;
        }
        int i4 = iM21580 + 1;
        char cM21586 = m21584(this.f25377 + iM21580);
        int i5 = this.f25377;
        int i6 = (i5 + i4) - 1;
        boolean z = cM21586 == '-';
        if (z) {
            cM21586 = m21584(i5 + i4);
            i4 = iM21580 + 2;
        }
        if (cM21586 >= '0' && cM21586 <= '9') {
            int i7 = cM21586 - '0';
            while (true) {
                i = i4 + 1;
                cM21584 = m21584(this.f25377 + i4);
                if (cM21584 < '0' || cM21584 > '9') {
                    break;
                }
                i7 = (i7 * 10) + (cM21584 - '0');
                i4 = i;
            }
            if (cM21584 == '.') {
                int i8 = i4 + 2;
                char cM21587 = m21584(this.f25377 + i);
                if (cM21587 < '0' || cM21587 > '9') {
                    this.f25387 = -1;
                    return 0.0d;
                }
                int i9 = (cM21587 - '0') + (i7 * 10);
                int i10 = 10;
                while (true) {
                    i3 = i8 + 1;
                    cM21585 = m21584(this.f25377 + i8);
                    if (cM21585 < '0' || cM21585 > '9') {
                        break;
                    }
                    i9 = (i9 * 10) + (cM21585 - '0');
                    i10 *= 10;
                    i8 = i3;
                }
                i = i3;
                i2 = i10;
                i7 = i9;
                cM21584 = cM21585;
            } else {
                i2 = 1;
            }
            boolean z2 = cM21584 == 'e' || cM21584 == 'E';
            if (z2) {
                int i11 = i + 1;
                cM21584 = m21584(this.f25377 + i);
                if (cM21584 == '+' || cM21584 == '-') {
                    i += 2;
                    cM21584 = m21584(this.f25377 + i11);
                } else {
                    i = i11;
                }
                while (cM21584 >= '0' && cM21584 <= '9') {
                    cM21584 = m21584(this.f25377 + i);
                    i++;
                }
            }
            int i12 = ((this.f25377 + i) - i6) - 1;
            if (z2 || i12 >= 10) {
                d = Double.parseDouble(m21578(i6, i12));
            } else {
                d = ((double) i7) / ((double) i2);
                if (z) {
                    d = -d;
                }
            }
            if (cM21584 == ',') {
                this.f25377 = (i - 1) + this.f25377;
                m21625();
                this.f25387 = 3;
                this.f25382 = 16;
                return d;
            }
            if (cM21584 == '}') {
                char cM21588 = m21584(this.f25377 + i);
                if (cM21588 == ',') {
                    this.f25382 = 16;
                    this.f25377 += i;
                    m21625();
                } else if (cM21588 == ']') {
                    this.f25382 = 15;
                    this.f25377 += i;
                    m21625();
                } else if (cM21588 == '}') {
                    this.f25382 = 13;
                    this.f25377 += i;
                    m21625();
                } else if (cM21588 == 26) {
                    this.f25377 += i;
                    this.f25382 = 20;
                    this.f25388 = (char) 26;
                } else {
                    this.f25387 = -1;
                    return 0.0d;
                }
                this.f25387 = 4;
                return d;
            }
            this.f25387 = -1;
            return 0.0d;
        }
        this.f25387 = -1;
        return 0.0d;
    }

    /* JADX INFO: renamed from: ܿ */
    public final double[] m21620(long j) {
        int i;
        char cCharAt;
        int i2;
        int i3;
        double[] dArr;
        double d;
        char c;
        this.f25387 = 0;
        int iM21580 = m21580(j);
        double[] dArr2 = null;
        if (iM21580 == 0) {
            return null;
        }
        int i4 = iM21580 + 1;
        int i5 = this.f25377 + iM21580;
        String str = this.f25380;
        int i6 = this.f25384;
        int i7 = -1;
        if ((i5 >= i6 ? (char) 26 : str.charAt(i5)) != '[') {
            this.f25387 = -1;
            return null;
        }
        int i8 = iM21580 + 2;
        int i9 = this.f25377 + i4;
        char cCharAt2 = i9 >= i6 ? (char) 26 : str.charAt(i9);
        double[] dArr3 = new double[16];
        int i10 = 0;
        while (true) {
            int i11 = this.f25377;
            int i12 = (i11 + i8) - 1;
            boolean z = cCharAt2 == '-';
            if (z) {
                int i13 = i8 + 1;
                int i14 = i11 + i8;
                cCharAt2 = i14 >= i6 ? (char) 26 : str.charAt(i14);
                i8 = i13;
            }
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                break;
            }
            int i15 = cCharAt2 - '0';
            while (true) {
                i = i8 + 1;
                int i16 = this.f25377 + i8;
                cCharAt = i16 >= i6 ? (char) 26 : str.charAt(i16);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i15 = (i15 * 10) + (cCharAt - '0');
                i8 = i;
            }
            if (cCharAt == '.') {
                int i17 = i8 + 2;
                int i18 = this.f25377 + i;
                char cCharAt3 = i18 >= i6 ? (char) 26 : str.charAt(i18);
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    this.f25387 = i7;
                    return dArr2;
                }
                i15 = (cCharAt3 - '0') + (i15 * 10);
                i2 = 10;
                while (true) {
                    i = i17 + 1;
                    int i19 = this.f25377 + i17;
                    cCharAt = i19 >= i6 ? (char) 26 : str.charAt(i19);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    i15 = (i15 * 10) + (cCharAt - '0');
                    i2 *= 10;
                    i17 = i;
                }
            } else {
                i2 = 1;
            }
            boolean z2 = cCharAt == 'e' || cCharAt == 'E';
            if (z2) {
                int i20 = i + 1;
                int i21 = this.f25377 + i;
                cCharAt = i21 >= i6 ? (char) 26 : str.charAt(i21);
                if (cCharAt == '+' || cCharAt == '-') {
                    i += 2;
                    int i22 = this.f25377 + i20;
                    cCharAt = i22 >= i6 ? (char) 26 : str.charAt(i22);
                    c = '9';
                    z2 = z2;
                } else {
                    i = i20;
                    c = '9';
                }
                while (cCharAt >= '0' && cCharAt <= c) {
                    int i23 = i + 1;
                    int i24 = this.f25377 + i;
                    i = i23;
                    cCharAt = i24 >= i6 ? (char) 26 : str.charAt(i24);
                    c = c;
                    z2 = z2;
                }
                i3 = 10;
            } else {
                i3 = 10;
            }
            int i25 = ((this.f25377 + i) - i12) - 1;
            if (z2 || i25 >= i3) {
                dArr = dArr2;
                d = Double.parseDouble(m21578(i12, i25));
            } else {
                dArr = dArr2;
                d = ((double) i15) / ((double) i2);
                if (z) {
                    d = -d;
                }
            }
            if (i10 >= dArr3.length) {
                double[] dArr4 = new double[(dArr3.length * 3) / 2];
                System.arraycopy(dArr3, 0, dArr4, 0, i10);
                dArr3 = dArr4;
            }
            int i26 = i10 + 1;
            dArr3[i10] = d;
            if (cCharAt == ',') {
                int i27 = i + 1;
                int i28 = this.f25377 + i;
                i = i27;
                cCharAt2 = i28 >= i6 ? (char) 26 : str.charAt(i28);
            } else {
                if (cCharAt == ']') {
                    int i29 = i + 1;
                    int i30 = this.f25377 + i;
                    char cCharAt4 = i30 >= i6 ? (char) 26 : str.charAt(i30);
                    if (i26 != dArr3.length) {
                        double[] dArr5 = new double[i26];
                        System.arraycopy(dArr3, 0, dArr5, 0, i26);
                        dArr3 = dArr5;
                    }
                    if (cCharAt4 == ',') {
                        this.f25377 += i;
                        m21625();
                        this.f25387 = 3;
                        this.f25382 = 16;
                        return dArr3;
                    }
                    if (cCharAt4 == '}') {
                        int i31 = this.f25377 + i29;
                        char cCharAt5 = i31 >= i6 ? (char) 26 : str.charAt(i31);
                        if (cCharAt5 == ',') {
                            this.f25382 = 16;
                            this.f25377 = i + 1 + this.f25377;
                            m21625();
                        } else if (cCharAt5 == ']') {
                            this.f25382 = 15;
                            this.f25377 = i + 1 + this.f25377;
                            m21625();
                        } else if (cCharAt5 == '}') {
                            this.f25382 = 13;
                            this.f25377 = i + 1 + this.f25377;
                            m21625();
                        } else if (cCharAt5 == 26) {
                            this.f25377 = i + 1 + this.f25377;
                            this.f25382 = 20;
                            this.f25388 = (char) 26;
                        } else {
                            this.f25387 = -1;
                            return dArr;
                        }
                        this.f25387 = 4;
                        return dArr3;
                    }
                    this.f25387 = -1;
                    return dArr;
                }
                cCharAt2 = cCharAt;
            }
            i7 = -1;
            dArr2 = dArr;
            i10 = i26;
            i8 = i;
        }
        this.f25387 = -1;
        return dArr2;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:97:0x0126  */
    /* JADX INFO: renamed from: ܳ */
    public final double[][] m21613(long j) {
        int i;
        char cCharAt;
        int i2;
        double d;
        int i3;
        int i4;
        int i5;
        char cCharAt2;
        this.f25387 = 0;
        int iM21580 = m21580(j);
        if (iM21580 == 0) {
            return null;
        }
        int i6 = iM21580 + 1;
        int i7 = this.f25377 + iM21580;
        String str = this.f25380;
        int i8 = this.f25384;
        char c = '[';
        int i9 = -1;
        if ((i7 >= i8 ? (char) 26 : str.charAt(i7)) != '[') {
            this.f25387 = -1;
            return null;
        }
        int i10 = iM21580 + 2;
        int i11 = this.f25377 + i6;
        char cCharAt3 = i11 >= i8 ? (char) 26 : str.charAt(i11);
        int i12 = 16;
        double[][] dArr = new double[16][];
        int i13 = 0;
        loop0: while (true) {
            if (cCharAt3 == c) {
                int i14 = i10 + 1;
                int i15 = this.f25377 + i10;
                char cCharAt4 = i15 >= i8 ? (char) 26 : str.charAt(i15);
                double[] dArr2 = new double[i12];
                int i16 = 0;
                while (true) {
                    int i17 = this.f25377;
                    int i18 = (i17 + i14) - 1;
                    boolean z = cCharAt4 == '-';
                    if (z) {
                        int i19 = i17 + i14;
                        i14++;
                        cCharAt4 = i19 >= i8 ? (char) 26 : str.charAt(i19);
                    }
                    if (cCharAt4 < '0' || cCharAt4 > '9') {
                        break loop0;
                    }
                    int i20 = cCharAt4 - '0';
                    while (true) {
                        i = i14 + 1;
                        int i21 = this.f25377 + i14;
                        cCharAt = i21 >= i8 ? (char) 26 : str.charAt(i21);
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i20 = (i20 * 10) + (cCharAt - '0');
                        i14 = i;
                    }
                    if (cCharAt == '.') {
                        int i22 = i14 + 2;
                        int i23 = this.f25377 + i;
                        char cCharAt5 = i23 >= i8 ? (char) 26 : str.charAt(i23);
                        if (cCharAt5 < '0' || cCharAt5 > '9') {
                            this.f25387 = i9;
                            return null;
                        }
                        i20 = (cCharAt5 - '0') + (i20 * 10);
                        i2 = 10;
                        while (true) {
                            i = i22 + 1;
                            int i24 = this.f25377 + i22;
                            cCharAt = i24 >= i8 ? (char) 26 : str.charAt(i24);
                            if (cCharAt < '0' || cCharAt > '9') {
                                break;
                            }
                            i20 = (i20 * 10) + (cCharAt - '0');
                            i2 *= 10;
                            i22 = i;
                        }
                    } else {
                        i2 = 1;
                    }
                    boolean z2 = cCharAt == 'e' || cCharAt == 'E';
                    if (z2) {
                        int i25 = i + 1;
                        int i26 = this.f25377 + i;
                        char cCharAt6 = i26 >= i8 ? (char) 26 : str.charAt(i26);
                        if (cCharAt6 == '+' || cCharAt6 == '-') {
                            i += 2;
                            int i27 = this.f25377 + i25;
                            if (i27 >= i8) {
                                cCharAt = 26;
                            } else {
                                cCharAt6 = str.charAt(i27);
                            }
                            while (cCharAt >= '0' && cCharAt <= '9') {
                                int i28 = i + 1;
                                i5 = this.f25377 + i;
                                if (i5 >= i8) {
                                    cCharAt2 = 26;
                                } else {
                                    cCharAt2 = str.charAt(i5);
                                }
                                i = i28;
                                cCharAt = cCharAt2;
                            }
                        } else {
                            i = i25;
                        }
                        cCharAt = cCharAt6;
                        while (cCharAt >= '0') {
                            int i29 = i + 1;
                            i5 = this.f25377 + i;
                            if (i5 >= i8) {
                                cCharAt2 = 26;
                            } else {
                                cCharAt2 = str.charAt(i5);
                            }
                            i = i29;
                            cCharAt = cCharAt2;
                        }
                    }
                    int i30 = ((this.f25377 + i) - i18) - 1;
                    if (z2 || i30 >= 10) {
                        d = Double.parseDouble(m21578(i18, i30));
                    } else {
                        d = ((double) i20) / ((double) i2);
                        if (z) {
                            d = -d;
                        }
                    }
                    if (i16 >= dArr2.length) {
                        double[] dArr3 = new double[(dArr2.length * 3) / 2];
                        System.arraycopy(dArr2, 0, dArr3, 0, i16);
                        dArr2 = dArr3;
                    }
                    int i31 = i16 + 1;
                    dArr2[i16] = d;
                    if (cCharAt == ',') {
                        int i32 = i + 1;
                        int i33 = this.f25377 + i;
                        cCharAt = i33 >= i8 ? (char) 26 : str.charAt(i33);
                        i14 = i32;
                    } else {
                        if (cCharAt == ']') {
                            int i34 = i + 1;
                            int i35 = this.f25377 + i;
                            char cCharAt7 = i35 >= i8 ? (char) 26 : str.charAt(i35);
                            if (i31 != dArr2.length) {
                                double[] dArr4 = new double[i31];
                                i3 = 0;
                                System.arraycopy(dArr2, 0, dArr4, 0, i31);
                                dArr2 = dArr4;
                            } else {
                                i3 = 0;
                            }
                            if (i13 >= dArr.length) {
                                dArr = new double[(dArr.length * 3) / 2][];
                                System.arraycopy(dArr2, i3, dArr, i3, i31);
                            }
                            int i36 = i13 + 1;
                            dArr[i13] = dArr2;
                            if (cCharAt7 == ',') {
                                i4 = i + 2;
                                int i37 = this.f25377 + i34;
                                cCharAt3 = i37 >= i8 ? (char) 26 : str.charAt(i37);
                            } else {
                                if (cCharAt7 == ']') {
                                    int i38 = i + 2;
                                    int i39 = this.f25377 + i34;
                                    char cCharAt8 = i39 >= i8 ? (char) 26 : str.charAt(i39);
                                    if (i36 != dArr.length) {
                                        double[][] dArr5 = new double[i36][];
                                        System.arraycopy(dArr, 0, dArr5, 0, i36);
                                        dArr = dArr5;
                                    }
                                    if (cCharAt8 == ',') {
                                        this.f25377 = i + 1 + this.f25377;
                                        m21625();
                                        this.f25387 = 3;
                                        this.f25382 = 16;
                                        return dArr;
                                    }
                                    if (cCharAt8 == '}') {
                                        char cM21584 = m21584(this.f25377 + i38);
                                        if (cM21584 == ',') {
                                            this.f25382 = 16;
                                            this.f25377 = i + 2 + this.f25377;
                                            m21625();
                                        } else if (cM21584 == ']') {
                                            this.f25382 = 15;
                                            this.f25377 = i + 2 + this.f25377;
                                            m21625();
                                        } else if (cM21584 == '}') {
                                            this.f25382 = 13;
                                            this.f25377 = i + 2 + this.f25377;
                                            m21625();
                                        } else if (cM21584 == 26) {
                                            this.f25377 = i + 2 + this.f25377;
                                            this.f25382 = 20;
                                            this.f25388 = (char) 26;
                                        } else {
                                            this.f25387 = -1;
                                            return null;
                                        }
                                        this.f25387 = 4;
                                        return dArr;
                                    }
                                    this.f25387 = -1;
                                    return null;
                                }
                                cCharAt3 = cCharAt7;
                                i4 = i34;
                            }
                            i9 = -1;
                            i12 = 16;
                            c = '[';
                            i13 = i36;
                            i10 = i4;
                            break;
                        }
                        i14 = i;
                    }
                    i9 = -1;
                    i16 = i31;
                    cCharAt4 = cCharAt;
                }
            }
        }
        this.f25387 = i9;
        return null;
    }

    /* JADX INFO: renamed from: ۘ */
    public final long m21597(long j) {
        this.f25387 = 0;
        int iM21580 = m21580(j);
        if (iM21580 == 0) {
            return 0L;
        }
        int i = iM21580 + 1;
        int i2 = this.f25377 + iM21580;
        String str = this.f25380;
        int i3 = this.f25384;
        if ((i2 >= i3 ? (char) 26 : str.charAt(i2)) != '\"') {
            this.f25387 = -1;
            return 0L;
        }
        long j2 = -3750763034362895579L;
        while (true) {
            int i4 = i + 1;
            int i5 = this.f25377 + i;
            char cCharAt = i5 >= i3 ? (char) 26 : str.charAt(i5);
            if (cCharAt == '\"') {
                int i6 = i + 2;
                int i7 = this.f25377 + i4;
                char cCharAt2 = i7 >= i3 ? (char) 26 : str.charAt(i7);
                if (cCharAt2 == ',') {
                    int iM46927 = C20780.m46927(i, 1, this.f25377, 1);
                    this.f25377 = iM46927;
                    this.f25388 = iM46927 < i3 ? str.charAt(iM46927) : (char) 26;
                    this.f25387 = 3;
                    return j2;
                }
                if (cCharAt2 == '}') {
                    int i8 = this.f25377 + i6;
                    char cCharAt3 = i8 >= i3 ? (char) 26 : str.charAt(i8);
                    if (cCharAt3 == ',') {
                        this.f25382 = 16;
                        this.f25377 = i + 2 + this.f25377;
                        m21625();
                    } else if (cCharAt3 == ']') {
                        this.f25382 = 15;
                        this.f25377 = i + 2 + this.f25377;
                        m21625();
                    } else if (cCharAt3 == '}') {
                        this.f25382 = 13;
                        this.f25377 = i + 2 + this.f25377;
                        m21625();
                    } else if (cCharAt3 == 26) {
                        this.f25382 = 20;
                        this.f25377 = i + 2 + this.f25377;
                        this.f25388 = (char) 26;
                    } else {
                        this.f25387 = -1;
                        return 0L;
                    }
                    this.f25387 = 4;
                    return j2;
                }
                this.f25387 = -1;
                return 0L;
            }
            j2 = (j2 ^ ((long) cCharAt)) * 1099511628211L;
            if (cCharAt == '\\') {
                this.f25387 = -1;
                return 0L;
            }
            i = i4;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m21611(boolean z) {
        return m21590(this.f25384 - this.f25377, z);
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0331  */
    /* JADX WARN: Code duplicated, block: B:140:0x0352  */
    /* JADX WARN: Code duplicated, block: B:154:0x0381  */
    /* JADX WARN: Code duplicated, block: B:175:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:177:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:207:0x0476  */
    /* JADX WARN: Code duplicated, block: B:297:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01fa  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m21590(int i, boolean z) {
        char cM21584;
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        int i7;
        char c7;
        char c8;
        int i8;
        char cM21585;
        int i9;
        char cM21586;
        char cM21587;
        char cM21588;
        char cM21589;
        char cM215810;
        char cM215811;
        char cM215812;
        int i10;
        char cM215813;
        int i11;
        int i12;
        char cM215814;
        char cM215815;
        char cM215816;
        int i13;
        int i14;
        int i15;
        char cM215817;
        char cM215818;
        char cM215819;
        char cM215820;
        if (!z && i > 13) {
            char cM215821 = m21584(this.f25377);
            char cM215822 = m21584(this.f25377 + 1);
            char cM215823 = m21584(this.f25377 + 2);
            char cM215824 = m21584(this.f25377 + 3);
            char cM215825 = m21584(this.f25377 + 4);
            char cM215826 = m21584(this.f25377 + 5);
            char cM215827 = m21584((this.f25377 + i) - 1);
            char cM215828 = m21584((this.f25377 + i) - 2);
            if (cM215821 == '/' && cM215822 == 'D' && cM215823 == 'a' && cM215824 == 't' && cM215825 == 'e' && cM215826 == '(' && cM215827 == '/' && cM215828 == ')') {
                int i16 = -1;
                for (int i17 = 6; i17 < i; i17++) {
                    char cM215829 = m21584(this.f25377 + i17);
                    if (cM215829 != '+') {
                        if (cM215829 < '0' || cM215829 > '9') {
                            break;
                        }
                    } else {
                        i16 = i17;
                    }
                }
                if (i16 == -1) {
                    return false;
                }
                int i18 = this.f25377 + 6;
                long j = Long.parseLong(m21578(i18, i16 - i18));
                Calendar calendar = Calendar.getInstance(this.f25376, this.f25383);
                this.f25385 = calendar;
                calendar.setTimeInMillis(j);
                this.f25382 = 5;
                return true;
            }
        }
        if (i == 8 || i == 14 || ((i == 16 && ((cM215820 = m21584(this.f25377 + 10)) == 'T' || cM215820 == ' ')) || (i == 17 && m21584(this.f25377 + 6) != '-'))) {
            if (z) {
                return false;
            }
            char cM215830 = m21584(this.f25377);
            char cM215831 = m21584(this.f25377 + 1);
            char cM215832 = m21584(this.f25377 + 2);
            char cM215833 = m21584(this.f25377 + 3);
            char cM215834 = m21584(this.f25377 + 4);
            char cM215835 = m21584(this.f25377 + 5);
            char cM215836 = m21584(this.f25377 + 6);
            char cM215837 = m21584(this.f25377 + 7);
            char cM215838 = m21584(this.f25377 + 8);
            boolean z2 = cM215834 == '-' && cM215837 == '-';
            boolean z3 = z2 && i == 16;
            boolean z4 = z2 && i == 17;
            if (z4 || z3) {
                cM21584 = m21584(this.f25377 + 9);
                c = cM215838;
            } else {
                cM21584 = cM215837;
                c = cM215836;
                cM215836 = cM215835;
                cM215835 = cM215834;
            }
            if (!m21576(cM215830, cM215831, cM215832, cM215833, cM215835, cM215836, (int) c, (int) cM21584)) {
                return false;
            }
            m21575(cM215830, cM215831, cM215832, cM215833, cM215835, cM215836, c, cM21584);
            if (i != 8) {
                char cM215839 = m21584(this.f25377 + 9);
                char cM215840 = m21584(this.f25377 + 10);
                char cM215841 = m21584(this.f25377 + 11);
                char cM215842 = m21584(this.f25377 + 12);
                char cM215843 = m21584(this.f25377 + 13);
                if ((z4 && cM215840 == 'T' && cM215843 == ':' && m21584(this.f25377 + 16) == 'Z') || (z3 && ((cM215840 == ' ' || cM215840 == 'T') && cM215843 == ':'))) {
                    cM215840 = m21584(this.f25377 + 14);
                    cM215838 = cM215841;
                    cM215843 = '0';
                    cM215841 = m21584(this.f25377 + 15);
                    cM215839 = cM215842;
                    cM215842 = '0';
                }
                if (!m21579(cM215838, cM215839, cM215840, cM215841, cM215842, cM215843)) {
                    return false;
                }
                if (i != 17 || z4) {
                    i2 = 0;
                } else {
                    char cM215844 = m21584(this.f25377 + 14);
                    char cM215845 = m21584(this.f25377 + 15);
                    char cM215846 = m21584(this.f25377 + 16);
                    if (cM215844 < '0' || cM215844 > '9' || cM215845 < '0' || cM215845 > '9' || cM215846 < '0' || cM215846 > '9') {
                        return false;
                    }
                    i2 = (cM215846 - '0') + ((cM215845 - '0') * 10) + ((cM215844 - '0') * 100);
                }
                i5 = (cM215839 - '0') + ((cM215838 - '0') * 10);
                i3 = (cM215841 - '0') + ((cM215840 - '0') * 10);
                i4 = (cM215843 - '0') + ((cM215842 - '0') * 10);
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            this.f25385.set(11, i5);
            this.f25385.set(12, i3);
            this.f25385.set(13, i4);
            this.f25385.set(14, i2);
            this.f25382 = 5;
            return true;
        }
        if (i < 9) {
            return false;
        }
        char cM215847 = m21584(this.f25377);
        char cM215848 = m21584(this.f25377 + 1);
        char cM215849 = m21584(this.f25377 + 2);
        char cM215850 = m21584(this.f25377 + 3);
        char cM215851 = m21584(this.f25377 + 4);
        char cM215852 = m21584(this.f25377 + 5);
        char cM215853 = m21584(this.f25377 + 6);
        char cM215854 = m21584(this.f25377 + 7);
        char cM215855 = m21584(this.f25377 + 8);
        char cM215856 = m21584(this.f25377 + 9);
        if ((cM215851 != '-' || cM215854 != '-') && (cM215851 != '/' || cM215854 != '/')) {
            if (cM215851 == '-' && cM215853 == '-') {
                if (cM215855 == ' ') {
                    i6 = 8;
                    cM215853 = cM215852;
                    cM215852 = '0';
                    c7 = cM215848;
                    c8 = cM215849;
                    c2 = cM215850;
                    c3 = cM215852;
                    c4 = cM215853;
                    c6 = cM215854;
                    c5 = '0';
                    i7 = i6;
                    cM215853 = cM215847;
                } else {
                    i8 = 9;
                    cM215853 = cM215847;
                    c8 = cM215849;
                    c2 = cM215850;
                    c4 = cM215852;
                    c5 = cM215854;
                    c6 = cM215855;
                    c3 = '0';
                    i7 = i8;
                    c7 = cM215848;
                }
            } else if ((cM215849 == '.' && cM215852 == '.') || (cM215849 == '-' && cM215852 == '-')) {
                cM215852 = cM215850;
                cM215849 = cM215855;
                cM215850 = cM215856;
            } else {
                if (cM215851 != 24180 && cM215851 != 45380) {
                    return false;
                }
                if (cM215854 != 26376 && cM215854 != 50900) {
                    if (cM215853 != 26376 && cM215853 != 50900) {
                        return false;
                    }
                    if (cM215855 == 26085 || cM215855 == 51068) {
                        i6 = 10;
                        cM215853 = cM215852;
                        cM215852 = '0';
                        c7 = cM215848;
                        c8 = cM215849;
                        c2 = cM215850;
                        c3 = cM215852;
                        c4 = cM215853;
                        c6 = cM215854;
                        c5 = '0';
                        i7 = i6;
                        cM215853 = cM215847;
                    } else {
                        if (cM215856 != 26085 && cM215856 != 51068) {
                            return false;
                        }
                        i8 = 10;
                        cM215853 = cM215847;
                        c8 = cM215849;
                        c2 = cM215850;
                        c4 = cM215852;
                        c5 = cM215854;
                        c6 = cM215855;
                        c3 = '0';
                        i7 = i8;
                        c7 = cM215848;
                    }
                } else if (cM215856 == 26085 || cM215856 == 51068) {
                    i6 = 10;
                    cM215854 = cM215855;
                    c7 = cM215848;
                    c8 = cM215849;
                    c2 = cM215850;
                    c3 = cM215852;
                    c4 = cM215853;
                    c6 = cM215854;
                    c5 = '0';
                    i7 = i6;
                    cM215853 = cM215847;
                } else {
                    if (m21584(this.f25377 + 10) != 26085 && m21584(this.f25377 + 10) != 51068) {
                        return false;
                    }
                    c2 = cM215850;
                    c3 = cM215852;
                    c4 = cM215853;
                    c5 = cM215855;
                    c6 = cM215856;
                    i7 = 11;
                    cM215853 = cM215847;
                    c7 = cM215848;
                    c8 = cM215849;
                }
            }
            if (!m21576(cM215853, c7, c8, c2, c3, c4, (int) c5, (int) c6)) {
                return false;
            }
            m21575(cM215853, c7, c8, c2, c3, c4, c5, c6);
            cM21585 = m21584(this.f25377 + i7);
            if (cM21585 == 'T' && (cM21585 != ' ' || z)) {
                if (cM21585 == '\"' || cM21585 == 26 || cM21585 == 26085 || cM21585 == 51068) {
                    this.f25385.set(11, 0);
                    this.f25385.set(12, 0);
                    this.f25385.set(13, 0);
                    this.f25385.set(14, 0);
                    int i19 = this.f25377 + i7;
                    this.f25377 = i19;
                    this.f25388 = m21584(i19);
                    this.f25382 = 5;
                    return true;
                }
                if (cM21585 != '+' && cM21585 != '-') {
                    return false;
                }
                if (this.f25384 != i7 + 6 || m21584(this.f25377 + i7 + 3) != ':' || m21584(this.f25377 + i7 + 4) != '0' || m21584(this.f25377 + i7 + 5) != '0') {
                    return false;
                }
                m21589('0', '0', '0', '0', '0', '0');
                this.f25385.set(14, 0);
                m21588(cM21585, m21584(this.f25377 + i7 + 1), m21584(this.f25377 + i7 + 2));
                return true;
            }
            i9 = i7 + 9;
            if (i >= i9 || m21584(this.f25377 + i7 + 3) != ':' || m21584(this.f25377 + i7 + 6) != ':') {
                return false;
            }
            cM21586 = m21584(this.f25377 + i7 + 1);
            cM21587 = m21584(this.f25377 + i7 + 2);
            cM21588 = m21584(this.f25377 + i7 + 4);
            cM21589 = m21584(this.f25377 + i7 + 5);
            cM215810 = m21584(this.f25377 + i7 + 7);
            cM215811 = m21584(this.f25377 + i7 + 8);
            if (!m21579(cM21586, cM21587, cM21588, cM21589, cM215810, cM215811)) {
                return false;
            }
            m21589(cM21586, cM21587, cM21588, cM21589, cM215810, cM215811);
            cM215812 = m21584(this.f25377 + i7 + 9);
            if (cM215812 == '.') {
                this.f25385.set(14, 0);
                int i20 = this.f25377 + i9;
                this.f25377 = i20;
                this.f25388 = m21584(i20);
                this.f25382 = 5;
                if (cM215812 != 'Z' && this.f25385.getTimeZone().getRawOffset() != 0) {
                    String[] availableIDs = TimeZone.getAvailableIDs(0);
                    if (availableIDs.length <= 0) {
                        return true;
                    }
                    this.f25385.setTimeZone(C5468.getTimeZone(availableIDs[0]));
                    return true;
                }
            }
            i10 = i7 + 11;
            if (i >= i10 || (cM215813 = m21584(this.f25377 + i7 + 10)) < '0' || cM215813 > '9') {
                return false;
            }
            i11 = cM215813 - '0';
            if (i > i10 || (cM215819 = m21584(this.f25377 + i7 + 11)) < '0' || cM215819 > '9') {
                i12 = 1;
            } else {
                i11 = (i11 * 10) + (cM215819 - '0');
                i12 = 2;
            }
            if (i12 == 2 && (cM215818 = m21584(this.f25377 + i7 + 12)) >= '0' && cM215818 <= '9') {
                i11 = (i11 * 10) + (cM215818 - '0');
                i12 = 3;
            }
            this.f25385.set(14, i11);
            cM215814 = m21584(C20780.m46927(this.f25377, i7, 10, i12));
            if (cM215814 != '+' || cM215814 == '-') {
                cM215815 = m21584(this.f25377 + i7 + 10 + i12 + 1);
                if (cM215815 >= '0' || cM215815 > '1' || (cM215816 = m21584(this.f25377 + i7 + 10 + i12 + 2)) < '0' || cM215816 > '9') {
                    return false;
                }
                char cM215857 = m21584(this.f25377 + i7 + 10 + i12 + 3);
                if (cM215857 == ':') {
                    if (m21584(this.f25377 + i7 + 10 + i12 + 4) != '0' || m21584(this.f25377 + i7 + 10 + i12 + 5) != '0') {
                        return false;
                    }
                    i13 = 6;
                } else if (cM215857 != '0') {
                    i13 = 3;
                } else {
                    if (m21584(this.f25377 + i7 + 10 + i12 + 4) != '0') {
                        return false;
                    }
                    i13 = 5;
                }
                m21588(cM215814, cM215815, cM215816);
                i14 = i13;
                i15 = 10;
            } else if (cM215814 == 'Z') {
                if (this.f25385.getTimeZone().getRawOffset() != 0) {
                    String[] availableIDs2 = TimeZone.getAvailableIDs(0);
                    if (availableIDs2.length > 0) {
                        this.f25385.setTimeZone(C5468.getTimeZone(availableIDs2[0]));
                    }
                }
                i15 = 10;
                i14 = 1;
            } else {
                i15 = 10;
                i14 = 0;
            }
            int i21 = this.f25377;
            int iM46927 = C20780.m46927(i7, i15, i12, i14);
            cM215817 = m21584(i21 + iM46927);
            if (cM215817 == 26 && cM215817 != '\"') {
                return false;
            }
            int i22 = this.f25377 + iM46927;
            this.f25377 = i22;
            this.f25388 = m21584(i22);
            this.f25382 = 5;
            return true;
        }
        cM215854 = cM215848;
        cM215851 = cM215853;
        cM215848 = cM215856;
        cM215853 = cM215847;
        cM215847 = cM215855;
        c5 = cM215847;
        c6 = cM215848;
        c8 = cM215849;
        c2 = cM215850;
        c4 = cM215851;
        c3 = cM215852;
        c7 = cM215854;
        i7 = 10;
        if (!m21576(cM215853, c7, c8, c2, c3, c4, (int) c5, (int) c6)) {
            return false;
        }
        m21575(cM215853, c7, c8, c2, c3, c4, c5, c6);
        cM21585 = m21584(this.f25377 + i7);
        if (cM21585 == 'T') {
        }
        i9 = i7 + 9;
        if (i >= i9) {
            return false;
        }
        cM21586 = m21584(this.f25377 + i7 + 1);
        cM21587 = m21584(this.f25377 + i7 + 2);
        cM21588 = m21584(this.f25377 + i7 + 4);
        cM21589 = m21584(this.f25377 + i7 + 5);
        cM215810 = m21584(this.f25377 + i7 + 7);
        cM215811 = m21584(this.f25377 + i7 + 8);
        if (!m21579(cM21586, cM21587, cM21588, cM21589, cM215810, cM215811)) {
            return false;
        }
        m21589(cM21586, cM21587, cM21588, cM21589, cM215810, cM215811);
        cM215812 = m21584(this.f25377 + i7 + 9);
        if (cM215812 == '.') {
            this.f25385.set(14, 0);
            int i23 = this.f25377 + i9;
            this.f25377 = i23;
            this.f25388 = m21584(i23);
            this.f25382 = 5;
            return cM215812 != 'Z' ? true : true;
        }
        i10 = i7 + 11;
        if (i >= i10) {
            return false;
        }
        i11 = cM215813 - '0';
        if (i > i10) {
            i12 = 1;
        } else {
            i12 = 1;
        }
        if (i12 == 2) {
            i11 = (i11 * 10) + (cM215818 - '0');
            i12 = 3;
        }
        this.f25385.set(14, i11);
        cM215814 = m21584(C20780.m46927(this.f25377, i7, 10, i12));
        if (cM215814 != '+') {
            cM215815 = m21584(this.f25377 + i7 + 10 + i12 + 1);
            if (cM215815 >= '0') {
                return false;
            }
            return false;
        }
        cM215815 = m21584(this.f25377 + i7 + 10 + i12 + 1);
        if (cM215815 >= '0') {
            return false;
        }
        return false;
        int i24 = this.f25377;
        int iM46928 = C20780.m46927(i7, i15, i12, i14);
        cM215817 = m21584(i24 + iM46928);
        if (cM215817 == 26) {
        }
        int i25 = this.f25377 + iM46928;
        this.f25377 = i25;
        this.f25388 = m21584(i25);
        this.f25382 = 5;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21589(char c, char c2, char c3, char c4, char c5, char c6) {
        this.f25385.set(11, (c2 - '0') + ((c - '0') * 10));
        this.f25385.set(12, (c4 - '0') + ((c3 - '0') * 10));
        this.f25385.set(13, (c6 - '0') + ((c5 - '0') * 10));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21588(char c, char c2, char c3) {
        int i = ((c3 - '0') + ((c2 - '0') * 10)) * 3600000;
        if (c == '-') {
            i = -i;
        }
        if (this.f25385.getTimeZone().getRawOffset() != i) {
            String[] availableIDs = TimeZone.getAvailableIDs(i);
            if (availableIDs.length > 0) {
                this.f25385.setTimeZone(C5468.getTimeZone(availableIDs[0]));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m21575(char c, char c2, char c3, char c4, char c5, char c6, char c7, char c8) {
        Calendar calendar = Calendar.getInstance(this.f25376, this.f25383);
        this.f25385 = calendar;
        int i = c4 - '0';
        calendar.set(1, i + ((c3 - '0') * 10) + ((c2 - '0') * 100) + ((c - '0') * 1000));
        this.f25385.set(2, ((c6 - '0') + ((c5 - '0') * 10)) - 1);
        this.f25385.set(5, (c8 - '0') + ((c7 - '0') * 10));
    }

    /* JADX INFO: renamed from: ֫ */
    public static final byte[] m21577(int i, int i2, String str) {
        int[] iArr;
        int i3;
        int i4;
        if (i2 == 0) {
            return new byte[0];
        }
        int i5 = (i + i2) - 1;
        while (true) {
            iArr = f25373;
            if (i >= i5 || iArr[str.charAt(i)] >= 0) {
                break;
            }
            i++;
        }
        while (i5 > 0 && iArr[str.charAt(i5)] < 0) {
            i5--;
        }
        if (str.charAt(i5) == '=') {
            i3 = str.charAt(i5 + (-1)) == '=' ? 2 : 1;
        } else {
            i3 = 0;
        }
        int i6 = (i5 - i) + 1;
        if (i2 > 76) {
            i4 = (str.charAt(76) == '\r' ? i6 / 78 : 0) << 1;
        } else {
            i4 = 0;
        }
        int i7 = (((i6 - i4) * 6) >> 3) - i3;
        byte[] bArr = new byte[i7];
        int i8 = (i7 / 3) * 3;
        int i9 = 0;
        loop2: while (true) {
            int i10 = 0;
            while (true) {
                if (i9 >= i8) {
                    break loop2;
                }
                int i11 = i + 4;
                int i12 = (iArr[str.charAt(i + 1)] << 12) | (iArr[str.charAt(i)] << 18) | (iArr[str.charAt(i + 2)] << 6) | iArr[str.charAt(i + 3)];
                bArr[i9] = (byte) (i12 >> 16);
                int i13 = i9 + 2;
                bArr[i9 + 1] = (byte) (i12 >> 8);
                i9 += 3;
                bArr[i13] = (byte) i12;
                if (i4 <= 0 || (i10 = i10 + 1) != 19) {
                    i = i11;
                }
            }
            i += 6;
        }
        if (i9 < i7) {
            int i14 = 0;
            int i15 = 0;
            while (i <= i5 - i3) {
                i14 |= iArr[str.charAt(i)] << (18 - (i15 * 6));
                i15++;
                i++;
            }
            int i16 = 16;
            while (i9 < i7) {
                bArr[i9] = (byte) (i14 >> i16);
                i16 -= 8;
                i9++;
            }
        }
        return bArr;
    }
}
