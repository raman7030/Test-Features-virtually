package l;

import com.alipay.sdk.m.y.q;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۛ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6292 {
    public static final C6292 f;
    public static final C6292 g;
    public static final C6292 h;
    public final C17832 a;
    public final Locale b;
    public final C1604 c;
    public final EnumC17126 d;
    public final InterfaceC2765 e;

    /* JADX WARN: Code duplicated, block: B:120:0x01e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:131:0x022b  */
    /* JADX WARN: Code duplicated, block: B:133:0x022e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x026c  */
    /* JADX WARN: Code duplicated, block: B:153:0x0270  */
    /* JADX WARN: Code duplicated, block: B:154:0x027f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0283  */
    /* JADX WARN: Code duplicated, block: B:157:0x028a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x028c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0291  */
    /* JADX WARN: Code duplicated, block: B:160:0x0296  */
    /* JADX WARN: Code duplicated, block: B:263:0x048a  */
    /* JADX WARN: Code duplicated, block: B:265:0x0494  */
    /* JADX WARN: Code duplicated, block: B:266:0x0498  */
    /* JADX WARN: Code duplicated, block: B:301:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x04a3 A[SYNTHETIC] */
    public static C6292 ofPattern(String str, Locale locale) {
        String strSubstring;
        int i;
        int i2;
        C19949 c19949;
        boolean z;
        C4426 c4426 = new C4426();
        C11003.requireNonNull(str, "pattern");
        int i3 = 0;
        while (i3 < str.length()) {
            char cCharAt = str.charAt(i3);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i4 = i3 + 1;
                while (i4 < str.length() && str.charAt(i4) == cCharAt) {
                    i4++;
                }
                int i5 = i4 - i3;
                if (cCharAt == 'p') {
                    if (i4 >= str.length() || (((cCharAt = str.charAt(i4)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i = i4;
                        i2 = i5;
                        i5 = 0;
                    } else {
                        i = i4 + 1;
                        while (i < str.length() && str.charAt(i) == cCharAt) {
                            i++;
                        }
                        i2 = i - i4;
                    }
                    if (i5 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i5 < 1) {
                        throw new IllegalArgumentException("The pad width must be at least one but was " + i5);
                    }
                    C4426 c4427 = c4426.a;
                    c4427.e = i5;
                    c4427.f = ' ';
                    c4427.g = -1;
                } else {
                    i = i4;
                    i2 = i5;
                }
                InterfaceC10030 interfaceC10030 = (InterfaceC10030) ((HashMap) C4426.i).get(Character.valueOf(cCharAt));
                if (interfaceC10030 != null) {
                    if (cCharAt == 'A') {
                        c4426.m(interfaceC10030, i2, 19, EnumC23476.NOT_NEGATIVE);
                    } else if (cCharAt == 'Q') {
                        z = false;
                        if (i2 == 1 || i2 == 2) {
                            if (cCharAt == 'e') {
                                c4426.j(new C21360(cCharAt, i2, i2, i2, 0));
                            } else if (cCharAt == 'E') {
                                c4426.i(interfaceC10030, EnumC20655.SHORT);
                            } else if (i2 == 1) {
                                c4426.k(interfaceC10030);
                            } else {
                                c4426.l(interfaceC10030, 2);
                            }
                        } else if (i2 == 3) {
                            c4426.i(interfaceC10030, z ? EnumC20655.SHORT_STANDALONE : EnumC20655.SHORT);
                        } else if (i2 == 4) {
                            c4426.i(interfaceC10030, z ? EnumC20655.FULL_STANDALONE : EnumC20655.FULL);
                        } else {
                            if (i2 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            c4426.i(interfaceC10030, z ? EnumC20655.NARROW_STANDALONE : EnumC20655.NARROW);
                        }
                    } else if (cCharAt == 'S') {
                        c4426.b(EnumC18496.NANO_OF_SECOND, i2, i2, false);
                    } else if (cCharAt == 'a') {
                        if (i2 != 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c4426.i(interfaceC10030, EnumC20655.SHORT);
                    } else if (cCharAt != 'k') {
                        if (cCharAt != 'q') {
                            if (cCharAt == 's') {
                                if (i2 == 1) {
                                    c4426.k(interfaceC10030);
                                } else {
                                    if (i2 == 2) {
                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                    }
                                    c4426.l(interfaceC10030, i2);
                                }
                            } else if (cCharAt == 'u' || cCharAt == 'y') {
                                if (i2 == 2) {
                                    C19056 c19056 = C0898.h;
                                    C11003.requireNonNull(interfaceC10030, "field");
                                    C11003.requireNonNull(c19056, "baseDate");
                                    C0898 c0898 = new C0898(interfaceC10030, 2, 2, c19056, 0);
                                    if (c19056 == null) {
                                        long j = 0;
                                        if (!interfaceC10030.s().e(j)) {
                                            throw new IllegalArgumentException("The base value must be within the range of the field");
                                        }
                                        if (j + C2310.f[2] > 2147483647L) {
                                            throw new C16232("Unable to add printer-parser as the range exceeds the capacity of an int");
                                        }
                                    }
                                    c4426.j(c0898);
                                } else if (i2 < 4) {
                                    c4426.m(interfaceC10030, i2, 19, EnumC23476.NORMAL);
                                } else {
                                    c4426.m(interfaceC10030, i2, 19, EnumC23476.EXCEEDS_PAD);
                                }
                            } else if (cCharAt == 'g') {
                                c4426.m(interfaceC10030, i2, 19, EnumC23476.NORMAL);
                            } else if (cCharAt == 'h' || cCharAt == 'm') {
                                if (i2 == 1) {
                                    c4426.k(interfaceC10030);
                                } else {
                                    if (i2 == 2) {
                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                    }
                                    c4426.l(interfaceC10030, i2);
                                }
                            } else if (cCharAt != 'n') {
                                switch (cCharAt) {
                                    case 'D':
                                        if (i2 == 1) {
                                            c4426.k(interfaceC10030);
                                        } else {
                                            if (i2 != 2 && i2 != 3) {
                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                            }
                                            c4426.m(interfaceC10030, i2, 3, EnumC23476.NOT_NEGATIVE);
                                        }
                                        break;
                                    case 'E':
                                        z = false;
                                        if (i2 == 1) {
                                            if (cCharAt == 'e') {
                                                c4426.j(new C21360(cCharAt, i2, i2, i2, 0));
                                            } else if (cCharAt == 'E') {
                                                c4426.i(interfaceC10030, EnumC20655.SHORT);
                                            } else if (i2 == 1) {
                                                c4426.l(interfaceC10030, 2);
                                            } else {
                                                c4426.k(interfaceC10030);
                                            }
                                        } else if (cCharAt == 'e') {
                                            c4426.j(new C21360(cCharAt, i2, i2, i2, 0));
                                        } else if (cCharAt == 'E') {
                                            c4426.i(interfaceC10030, EnumC20655.SHORT);
                                        } else if (i2 == 1) {
                                            c4426.l(interfaceC10030, 2);
                                        } else {
                                            c4426.k(interfaceC10030);
                                        }
                                        break;
                                    case 'F':
                                        if (i2 != 1) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        c4426.k(interfaceC10030);
                                        break;
                                        break;
                                    case 'G':
                                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                                            c4426.i(interfaceC10030, EnumC20655.SHORT);
                                        } else if (i2 == 4) {
                                            c4426.i(interfaceC10030, EnumC20655.FULL);
                                        } else {
                                            if (i2 != 5) {
                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                            }
                                            c4426.i(interfaceC10030, EnumC20655.NARROW);
                                        }
                                        break;
                                    case 'H':
                                        if (i2 == 1) {
                                            c4426.k(interfaceC10030);
                                        } else {
                                            if (i2 == 2) {
                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                            }
                                            c4426.l(interfaceC10030, i2);
                                        }
                                        break;
                                    default:
                                        switch (cCharAt) {
                                            case 'K':
                                                if (i2 == 1) {
                                                    c4426.k(interfaceC10030);
                                                } else {
                                                    if (i2 == 2) {
                                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                    }
                                                    c4426.l(interfaceC10030, i2);
                                                }
                                                break;
                                            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                                break;
                                            case 'M':
                                                z = false;
                                                if (i2 == 1) {
                                                    if (cCharAt == 'e') {
                                                        c4426.j(new C21360(cCharAt, i2, i2, i2, 0));
                                                    } else if (cCharAt == 'E') {
                                                        c4426.i(interfaceC10030, EnumC20655.SHORT);
                                                    } else if (i2 == 1) {
                                                        c4426.l(interfaceC10030, 2);
                                                    } else {
                                                        c4426.k(interfaceC10030);
                                                    }
                                                } else if (cCharAt == 'e') {
                                                    c4426.j(new C21360(cCharAt, i2, i2, i2, 0));
                                                } else if (cCharAt == 'E') {
                                                    c4426.i(interfaceC10030, EnumC20655.SHORT);
                                                } else if (i2 == 1) {
                                                    c4426.l(interfaceC10030, 2);
                                                } else {
                                                    c4426.k(interfaceC10030);
                                                }
                                                break;
                                            case 'N':
                                                c4426.m(interfaceC10030, i2, 19, EnumC23476.NOT_NEGATIVE);
                                                break;
                                            default:
                                                switch (cCharAt) {
                                                    case q.f /* 99 */:
                                                        if (i2 == 1) {
                                                            c4426.j(new C21360(cCharAt, i2, i2, i2, 0));
                                                        } else if (i2 == 2) {
                                                            throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                        }
                                                        break;
                                                    case 'd':
                                                        if (i2 == 1) {
                                                            c4426.k(interfaceC10030);
                                                        } else {
                                                            if (i2 == 2) {
                                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                            }
                                                            c4426.l(interfaceC10030, i2);
                                                        }
                                                        break;
                                                    case 'e':
                                                        z = false;
                                                        if (i2 == 1) {
                                                            if (cCharAt == 'e') {
                                                                c4426.j(new C21360(cCharAt, i2, i2, i2, 0));
                                                            } else if (cCharAt == 'E') {
                                                                c4426.i(interfaceC10030, EnumC20655.SHORT);
                                                            } else if (i2 == 1) {
                                                                c4426.l(interfaceC10030, 2);
                                                            } else {
                                                                c4426.k(interfaceC10030);
                                                            }
                                                        } else if (cCharAt == 'e') {
                                                            c4426.j(new C21360(cCharAt, i2, i2, i2, 0));
                                                        } else if (cCharAt == 'E') {
                                                            c4426.i(interfaceC10030, EnumC20655.SHORT);
                                                        } else if (i2 == 1) {
                                                            c4426.l(interfaceC10030, 2);
                                                        } else {
                                                            c4426.k(interfaceC10030);
                                                        }
                                                        break;
                                                    default:
                                                        if (i2 != 1) {
                                                            c4426.l(interfaceC10030, i2);
                                                        } else {
                                                            c4426.k(interfaceC10030);
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                c4426.m(interfaceC10030, i2, 19, EnumC23476.NOT_NEGATIVE);
                            }
                        }
                        z = true;
                        if (i2 == 1) {
                            if (cCharAt == 'e') {
                                c4426.j(new C21360(cCharAt, i2, i2, i2, 0));
                            } else if (cCharAt == 'E') {
                                c4426.i(interfaceC10030, EnumC20655.SHORT);
                            } else if (i2 == 1) {
                                c4426.k(interfaceC10030);
                            } else {
                                c4426.l(interfaceC10030, 2);
                            }
                        } else if (cCharAt == 'e') {
                            c4426.j(new C21360(cCharAt, i2, i2, i2, 0));
                        } else if (cCharAt == 'E') {
                            c4426.i(interfaceC10030, EnumC20655.SHORT);
                        } else if (i2 == 1) {
                            c4426.k(interfaceC10030);
                        } else {
                            c4426.l(interfaceC10030, 2);
                        }
                    } else if (i2 == 1) {
                        c4426.k(interfaceC10030);
                    } else {
                        if (i2 == 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c4426.l(interfaceC10030, i2);
                    }
                } else if (cCharAt == 'z') {
                    if (i2 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                    }
                    c4426.c(i2 == 4 ? new C19949(EnumC20655.FULL, false) : new C19949(EnumC20655.SHORT, false));
                } else if (cCharAt == 'V') {
                    if (i2 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + cCharAt);
                    }
                    c4426.c(new C22065(AbstractC5796.a, "ZoneId()"));
                } else if (cCharAt == 'v') {
                    if (i2 == 1) {
                        c19949 = new C19949(EnumC20655.SHORT, true);
                    } else {
                        if (i2 != 4) {
                            throw new IllegalArgumentException("Wrong number of  pattern letters: " + cCharAt);
                        }
                        c19949 = new C19949(EnumC20655.FULL, true);
                    }
                    c4426.c(c19949);
                } else {
                    String str2 = "+0000";
                    if (cCharAt == 'Z') {
                        if (i2 < 4) {
                            c4426.g("+HHMM", "+0000");
                        } else if (i2 == 4) {
                            c4426.f(EnumC20655.FULL);
                        } else {
                            if (i2 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            c4426.g("+HH:MM:ss", "Z");
                        }
                    } else if (cCharAt == 'O') {
                        if (i2 == 1) {
                            c4426.f(EnumC20655.SHORT);
                        } else {
                            if (i2 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + cCharAt);
                            }
                            c4426.f(EnumC20655.FULL);
                        }
                    } else if (cCharAt == 'X') {
                        if (i2 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c4426.g(C3721.d[i2 + (i2 == 1 ? 0 : 1)], "Z");
                    } else if (cCharAt == 'x') {
                        if (i2 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        if (i2 == 1) {
                            str2 = "+00";
                        } else if (i2 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        c4426.g(C3721.d[i2 + (i2 == 1 ? 0 : 1)], str2);
                    } else if (cCharAt == 'W') {
                        if (i2 > 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c4426.j(new C21360(cCharAt, i2, i2, i2, 0));
                    } else if (cCharAt == 'w') {
                        if (i2 > 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c4426.j(new C21360(cCharAt, i2, i2, 2, 0));
                    } else {
                        if (cCharAt != 'Y') {
                            throw new IllegalArgumentException("Unknown pattern letter: " + cCharAt);
                        }
                        if (i2 == 2) {
                            c4426.j(new C21360(cCharAt, i2, i2, 2, 0));
                        } else {
                            c4426.j(new C21360(cCharAt, i2, i2, 19, 0));
                        }
                    }
                }
                i3 = i - 1;
            } else if (cCharAt == '\'') {
                int i6 = i3 + 1;
                int i7 = i6;
                while (i7 < str.length()) {
                    if (str.charAt(i7) == '\'') {
                        int i8 = i7 + 1;
                        if (i8 < str.length() && str.charAt(i8) == '\'') {
                            i7 = i8;
                        } else {
                            if (i7 < str.length()) {
                                throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                            }
                            strSubstring = str.substring(i6, i7);
                            if (strSubstring.isEmpty()) {
                                c4426.d('\'');
                            } else {
                                c4426.e(strSubstring.replace("''", "'"));
                            }
                            i3 = i7;
                        }
                    }
                    i7++;
                }
                if (i7 < str.length()) {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                }
                strSubstring = str.substring(i6, i7);
                if (strSubstring.isEmpty()) {
                    c4426.d('\'');
                } else {
                    c4426.e(strSubstring.replace("''", "'"));
                }
                i3 = i7;
            } else if (cCharAt == '[') {
                c4426.o();
            } else if (cCharAt == ']') {
                if (c4426.a.b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                c4426.n();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                c4426.d(cCharAt);
            }
            i3++;
        }
        return c4426.q(locale, EnumC17126.SMART, null);
    }

    static {
        C4426 c4426 = new C4426();
        EnumC18496 enumC18496 = EnumC18496.YEAR;
        EnumC23476 enumC23476 = EnumC23476.EXCEEDS_PAD;
        c4426.m(enumC18496, 4, 10, enumC23476);
        c4426.d('-');
        EnumC18496 enumC18497 = EnumC18496.MONTH_OF_YEAR;
        c4426.l(enumC18497, 2);
        c4426.d('-');
        EnumC18496 enumC18498 = EnumC18496.DAY_OF_MONTH;
        c4426.l(enumC18498, 2);
        EnumC17126 enumC17126 = EnumC17126.STRICT;
        C8409 c8409 = C8409.c;
        C6292 c6292P = c4426.p(enumC17126, c8409);
        f = c6292P;
        C4426 c4427 = new C4426();
        EnumC7954 enumC7954 = EnumC7954.INSENSITIVE;
        c4427.c(enumC7954);
        c4427.a(c6292P);
        C3721 c3721 = C3721.e;
        c4427.c(c3721);
        c4427.p(enumC17126, c8409);
        C4426 c4428 = new C4426();
        c4428.c(enumC7954);
        c4428.a(c6292P);
        c4428.o();
        c4428.c(c3721);
        c4428.p(enumC17126, c8409);
        C4426 c4429 = new C4426();
        EnumC18496 enumC18499 = EnumC18496.HOUR_OF_DAY;
        c4429.l(enumC18499, 2);
        c4429.d(':');
        EnumC18496 enumC184910 = EnumC18496.MINUTE_OF_HOUR;
        c4429.l(enumC184910, 2);
        c4429.o();
        c4429.d(':');
        EnumC18496 enumC184911 = EnumC18496.SECOND_OF_MINUTE;
        c4429.l(enumC184911, 2);
        c4429.o();
        c4429.b(EnumC18496.NANO_OF_SECOND, 0, 9, true);
        C6292 c6292P2 = c4429.p(enumC17126, null);
        C4426 c44210 = new C4426();
        c44210.c(enumC7954);
        c44210.a(c6292P2);
        c44210.c(c3721);
        c44210.p(enumC17126, null);
        C4426 c44211 = new C4426();
        c44211.c(enumC7954);
        c44211.a(c6292P2);
        c44211.o();
        c44211.c(c3721);
        c44211.p(enumC17126, null);
        C4426 c44212 = new C4426();
        c44212.c(enumC7954);
        c44212.a(c6292P);
        c44212.d('T');
        c44212.a(c6292P2);
        C6292 c6292P3 = c44212.p(enumC17126, c8409);
        C4426 c44213 = new C4426();
        c44213.c(enumC7954);
        c44213.a(c6292P3);
        EnumC7954 enumC7955 = EnumC7954.LENIENT;
        c44213.c(enumC7955);
        c44213.c(c3721);
        EnumC7954 enumC7956 = EnumC7954.STRICT;
        c44213.c(enumC7956);
        C6292 c6292P4 = c44213.p(enumC17126, c8409);
        g = c6292P4;
        C4426 c44214 = new C4426();
        c44214.a(c6292P4);
        c44214.o();
        c44214.d('[');
        EnumC7954 enumC7957 = EnumC7954.SENSITIVE;
        c44214.c(enumC7957);
        C8556 c8556 = C4426.h;
        c44214.c(new C22065(c8556, "ZoneRegionId()"));
        c44214.d(']');
        c44214.p(enumC17126, c8409);
        C4426 c44215 = new C4426();
        c44215.a(c6292P3);
        c44215.o();
        c44215.c(c3721);
        c44215.o();
        c44215.d('[');
        c44215.c(enumC7957);
        c44215.c(new C22065(c8556, "ZoneRegionId()"));
        c44215.d(']');
        c44215.p(enumC17126, c8409);
        C4426 c44216 = new C4426();
        c44216.c(enumC7954);
        c44216.m(enumC18496, 4, 10, enumC23476);
        c44216.d('-');
        c44216.l(EnumC18496.DAY_OF_YEAR, 3);
        c44216.o();
        c44216.c(c3721);
        c44216.p(enumC17126, c8409);
        C4426 c44217 = new C4426();
        c44217.c(enumC7954);
        c44217.m(AbstractC22024.c, 4, 10, enumC23476);
        c44217.e("-W");
        c44217.l(AbstractC22024.b, 2);
        c44217.d('-');
        EnumC18496 enumC184912 = EnumC18496.DAY_OF_WEEK;
        c44217.l(enumC184912, 1);
        c44217.o();
        c44217.c(c3721);
        c44217.p(enumC17126, c8409);
        C4426 c44218 = new C4426();
        c44218.c(enumC7954);
        c44218.c(new C9366());
        h = c44218.p(enumC17126, null);
        C4426 c44219 = new C4426();
        c44219.c(enumC7954);
        c44219.l(enumC18496, 4);
        c44219.l(enumC18497, 2);
        c44219.l(enumC18498, 2);
        c44219.o();
        c44219.c(enumC7955);
        c44219.g("+HHMMss", "Z");
        c44219.c(enumC7956);
        c44219.p(enumC17126, c8409);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        C4426 c44220 = new C4426();
        c44220.c(enumC7954);
        c44220.c(enumC7955);
        c44220.o();
        c44220.h(enumC184912, map);
        c44220.e(", ");
        c44220.n();
        c44220.m(enumC18498, 1, 2, EnumC23476.NOT_NEGATIVE);
        c44220.d(' ');
        c44220.h(enumC18497, map2);
        c44220.d(' ');
        c44220.l(enumC18496, 4);
        c44220.d(' ');
        c44220.l(enumC18499, 2);
        c44220.d(':');
        c44220.l(enumC184910, 2);
        c44220.o();
        c44220.d(':');
        c44220.l(enumC184911, 2);
        c44220.n();
        c44220.d(' ');
        c44220.g("+HHMM", "GMT");
        c44220.p(EnumC17126.SMART, c8409);
    }

    public C6292(C17832 c17832, Locale locale, EnumC17126 enumC17126, InterfaceC2765 interfaceC2765) {
        C1604 c1604 = C1604.a;
        this.a = (C17832) C11003.requireNonNull(c17832, "printerParser");
        this.b = (Locale) C11003.requireNonNull(locale, "locale");
        this.c = (C1604) C11003.requireNonNull(c1604, "decimalStyle");
        this.d = (EnumC17126) C11003.requireNonNull(enumC17126, "resolverStyle");
        this.e = interfaceC2765;
    }

    public String format(InterfaceC2268 interfaceC2268) {
        StringBuilder sb = new StringBuilder(32);
        C17832 c17832 = this.a;
        C11003.requireNonNull(interfaceC2268, "temporal");
        C11003.requireNonNull(sb, "appendable");
        try {
            c17832.l(new C10071(interfaceC2268, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new C16232(e.getMessage(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x032a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0336  */
    /* JADX WARN: Code duplicated, block: B:131:0x0367  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0271  */
    /* JADX WARN: Code duplicated, block: B:92:0x0277  */
    /* JADX WARN: Code duplicated, block: B:97:0x0293  */
    public final C16420 a(CharSequence charSequence) {
        String string;
        InterfaceC10030 interfaceC10030;
        EnumC18496 enumC18496;
        Map map;
        EnumC18496 enumC18497;
        InterfaceC10030 interfaceC10031;
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        C11003.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        C11003.requireNonNull(parsePosition, "position");
        C3015 c3015 = new C3015(this);
        int iM = this.a.m(c3015, charSequence, parsePosition.getIndex());
        AbstractC5650 abstractC5650 = null;
        if (iM < 0) {
            parsePosition.setErrorIndex(~iM);
            c3015 = null;
        } else {
            parsePosition.setIndex(iM);
        }
        if (c3015 != null) {
            C6292 c6292 = c3015.a;
            if (parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
                C16420 c16420C = c3015.c();
                InterfaceC2765 interfaceC2765 = c3015.c().c;
                if (interfaceC2765 == null && (interfaceC2765 = c6292.e) == null) {
                    interfaceC2765 = C8409.c;
                }
                c16420C.c = interfaceC2765;
                AbstractC5650 abstractC5651 = c16420C.b;
                if (abstractC5651 != null) {
                    abstractC5650 = abstractC5651;
                } else {
                    c6292.getClass();
                }
                c16420C.b = abstractC5650;
                c16420C.e = this.d;
                c16420C.k();
                c16420C.v(c16420C.c.O(c16420C.a, c16420C.e));
                c16420C.q();
                if (((HashMap) c16420C.a).size() > 0) {
                    loop0: while (i < 50) {
                        Iterator it = ((HashMap) c16420C.a).entrySet().iterator();
                        do {
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            interfaceC10031 = (InterfaceC10030) ((Map.Entry) it.next()).getKey();
                            InterfaceC2268 interfaceC2268N = interfaceC10031.n(c16420C.a, c16420C, c16420C.e);
                            if (interfaceC2268N != null) {
                                if (interfaceC2268N instanceof InterfaceC22583) {
                                    InterfaceC22583 interfaceC22583 = (InterfaceC22583) interfaceC2268N;
                                    AbstractC5650 abstractC5652 = c16420C.b;
                                    if (abstractC5652 == null) {
                                        c16420C.b = interfaceC22583.F();
                                    } else if (!abstractC5652.equals(interfaceC22583.F())) {
                                        throw new C16232("ChronoZonedDateTime must use the effective parsed zone: " + c16420C.b);
                                    }
                                    interfaceC2268N = interfaceC22583.t();
                                }
                                if (interfaceC2268N instanceof InterfaceC14115) {
                                    InterfaceC14115 interfaceC14115 = (InterfaceC14115) interfaceC2268N;
                                    c16420C.s(interfaceC14115.b(), C6501.d);
                                    c16420C.v(interfaceC14115.f());
                                    break;
                                }
                                if (interfaceC2268N instanceof InterfaceC13410) {
                                    c16420C.v((InterfaceC13410) interfaceC2268N);
                                    break;
                                }
                                if (interfaceC2268N instanceof C7248) {
                                    c16420C.s((C7248) interfaceC2268N, C6501.d);
                                    break;
                                }
                                throw new C16232("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                            }
                        } while (((HashMap) c16420C.a).containsKey(interfaceC10031));
                        i++;
                    }
                    if (i == 50) {
                        throw new C16232("One of the parsed fields has an incorrectly implemented resolve method");
                    }
                    if (i > 0) {
                        c16420C.k();
                        c16420C.v(c16420C.c.O(c16420C.a, c16420C.e));
                        c16420C.q();
                    }
                }
                if (c16420C.g == null) {
                    Map map2 = c16420C.a;
                    EnumC18496 enumC18498 = EnumC18496.MILLI_OF_SECOND;
                    if (((HashMap) map2).containsKey(enumC18498)) {
                        long jLongValue = ((Long) ((HashMap) c16420C.a).remove(enumC18498)).longValue();
                        Map map3 = c16420C.a;
                        EnumC18496 enumC18499 = EnumC18496.MICRO_OF_SECOND;
                        if (((HashMap) map3).containsKey(enumC18499)) {
                            long jLongValue2 = (((Long) ((HashMap) c16420C.a).get(enumC18499)).longValue() % 1000) + (jLongValue * 1000);
                            c16420C.x(enumC18498, enumC18499, Long.valueOf(jLongValue2));
                            ((HashMap) c16420C.a).remove(enumC18499);
                            ((HashMap) c16420C.a).put(EnumC18496.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                        } else {
                            ((HashMap) c16420C.a).put(EnumC18496.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                        }
                    } else {
                        Map map4 = c16420C.a;
                        EnumC18496 enumC184910 = EnumC18496.MICRO_OF_SECOND;
                        if (((HashMap) map4).containsKey(enumC184910)) {
                            ((HashMap) c16420C.a).put(EnumC18496.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) c16420C.a).remove(enumC184910)).longValue() * 1000));
                        }
                    }
                    Map map5 = c16420C.a;
                    EnumC18496 enumC184911 = EnumC18496.HOUR_OF_DAY;
                    Long l2 = (Long) ((HashMap) map5).get(enumC184911);
                    if (l2 != null) {
                        Map map6 = c16420C.a;
                        EnumC18496 enumC184912 = EnumC18496.MINUTE_OF_HOUR;
                        Long l3 = (Long) ((HashMap) map6).get(enumC184912);
                        Map map7 = c16420C.a;
                        EnumC18496 enumC184913 = EnumC18496.SECOND_OF_MINUTE;
                        Long l4 = (Long) ((HashMap) map7).get(enumC184913);
                        Map map8 = c16420C.a;
                        EnumC18496 enumC184914 = EnumC18496.NANO_OF_SECOND;
                        Long l5 = (Long) ((HashMap) map8).get(enumC184914);
                        if ((l3 != null || (l4 == null && l5 == null)) && (l3 == null || l4 != null || l5 == null)) {
                            c16420C.p(l2.longValue(), l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L, l5 != null ? l5.longValue() : 0L);
                            ((HashMap) c16420C.a).remove(enumC184911);
                            ((HashMap) c16420C.a).remove(enumC184912);
                            ((HashMap) c16420C.a).remove(enumC184913);
                            ((HashMap) c16420C.a).remove(enumC184914);
                            if (c16420C.e != EnumC17126.LENIENT && ((HashMap) c16420C.a).size() > 0) {
                                for (Map.Entry entry : ((HashMap) c16420C.a).entrySet()) {
                                    interfaceC10030 = (InterfaceC10030) entry.getKey();
                                    if (interfaceC10030 instanceof EnumC18496) {
                                        enumC18496 = (EnumC18496) interfaceC10030;
                                        if (enumC18496.V()) {
                                            enumC18496.T(((Long) entry.getValue()).longValue());
                                        }
                                    }
                                }
                            }
                        }
                    } else if (c16420C.e != EnumC17126.LENIENT) {
                        while (r2.hasNext()) {
                            interfaceC10030 = (InterfaceC10030) entry.getKey();
                            if (interfaceC10030 instanceof EnumC18496) {
                                enumC18496 = (EnumC18496) interfaceC10030;
                                if (enumC18496.V()) {
                                    enumC18496.T(((Long) entry.getValue()).longValue());
                                }
                            }
                        }
                    }
                } else if (c16420C.e != EnumC17126.LENIENT) {
                    while (r2.hasNext()) {
                        interfaceC10030 = (InterfaceC10030) entry.getKey();
                        if (interfaceC10030 instanceof EnumC18496) {
                            enumC18496 = (EnumC18496) interfaceC10030;
                            if (enumC18496.V()) {
                                enumC18496.T(((Long) entry.getValue()).longValue());
                            }
                        }
                    }
                }
                InterfaceC13410 interfaceC13410 = c16420C.f;
                if (interfaceC13410 != null) {
                    c16420C.j(interfaceC13410);
                }
                C7248 c7248 = c16420C.g;
                if (c7248 != null) {
                    c16420C.j(c7248);
                    if (c16420C.f != null && ((HashMap) c16420C.a).size() > 0) {
                        c16420C.j(c16420C.f.I(c16420C.g));
                    }
                }
                if (c16420C.f != null && c16420C.g != null) {
                    C6501 c6501 = c16420C.h;
                    c6501.getClass();
                    C6501 c6502 = C6501.d;
                    if (c6501 != c6502) {
                        c16420C.f = c16420C.f.N(c16420C.h);
                        c16420C.h = c6502;
                    }
                }
                if (c16420C.g == null) {
                    if (((HashMap) c16420C.a).containsKey(EnumC18496.INSTANT_SECONDS)) {
                        map = c16420C.a;
                        enumC18497 = EnumC18496.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(enumC18497)) {
                            long jLongValue3 = ((Long) ((HashMap) c16420C.a).get(enumC18497)).longValue();
                            ((HashMap) c16420C.a).put(EnumC18496.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / 1000));
                            ((HashMap) c16420C.a).put(EnumC18496.MILLI_OF_SECOND, Long.valueOf(jLongValue3 / 1000000));
                        } else {
                            ((HashMap) c16420C.a).put(enumC18497, 0L);
                            ((HashMap) c16420C.a).put(EnumC18496.MICRO_OF_SECOND, 0L);
                            ((HashMap) c16420C.a).put(EnumC18496.MILLI_OF_SECOND, 0L);
                        }
                    } else if (((HashMap) c16420C.a).containsKey(EnumC18496.SECOND_OF_DAY)) {
                        map = c16420C.a;
                        enumC18497 = EnumC18496.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(enumC18497)) {
                            long jLongValue4 = ((Long) ((HashMap) c16420C.a).get(enumC18497)).longValue();
                            ((HashMap) c16420C.a).put(EnumC18496.MICRO_OF_SECOND, Long.valueOf(jLongValue4 / 1000));
                            ((HashMap) c16420C.a).put(EnumC18496.MILLI_OF_SECOND, Long.valueOf(jLongValue4 / 1000000));
                        } else {
                            ((HashMap) c16420C.a).put(enumC18497, 0L);
                            ((HashMap) c16420C.a).put(EnumC18496.MICRO_OF_SECOND, 0L);
                            ((HashMap) c16420C.a).put(EnumC18496.MILLI_OF_SECOND, 0L);
                        }
                    } else if (((HashMap) c16420C.a).containsKey(EnumC18496.SECOND_OF_MINUTE)) {
                        map = c16420C.a;
                        enumC18497 = EnumC18496.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(enumC18497)) {
                            long jLongValue5 = ((Long) ((HashMap) c16420C.a).get(enumC18497)).longValue();
                            ((HashMap) c16420C.a).put(EnumC18496.MICRO_OF_SECOND, Long.valueOf(jLongValue5 / 1000));
                            ((HashMap) c16420C.a).put(EnumC18496.MILLI_OF_SECOND, Long.valueOf(jLongValue5 / 1000000));
                        } else {
                            ((HashMap) c16420C.a).put(enumC18497, 0L);
                            ((HashMap) c16420C.a).put(EnumC18496.MICRO_OF_SECOND, 0L);
                            ((HashMap) c16420C.a).put(EnumC18496.MILLI_OF_SECOND, 0L);
                        }
                    }
                }
                if (c16420C.f != null && c16420C.g != null) {
                    Long l6 = (Long) ((HashMap) c16420C.a).get(EnumC18496.OFFSET_SECONDS);
                    if (l6 != null) {
                        ((HashMap) c16420C.a).put(EnumC18496.INSTANT_SECONDS, Long.valueOf(c16420C.f.I(c16420C.g).D(C18078.e0(l6.intValue())).U()));
                        return c16420C;
                    }
                    if (c16420C.b != null) {
                        ((HashMap) c16420C.a).put(EnumC18496.INSTANT_SECONDS, Long.valueOf(c16420C.f.I(c16420C.g).D(c16420C.b).U()));
                    }
                }
                return c16420C;
            }
        }
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new C12892(str, charSequence);
        }
        String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new C12892(str2, charSequence);
    }

    public final String toString() {
        String string = this.a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
