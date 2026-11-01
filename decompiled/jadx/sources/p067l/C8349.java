package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
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
public final class C8349 {

    /* JADX INFO: renamed from: f */
    public static final C8349 f22318f;

    /* JADX INFO: renamed from: g */
    public static final C8349 f22319g;

    /* JADX INFO: renamed from: h */
    public static final C8349 f22320h;

    /* JADX INFO: renamed from: a */
    public final C19316 f22321a;

    /* JADX INFO: renamed from: b */
    public final Locale f22322b;

    /* JADX INFO: renamed from: c */
    public final C3893 f22323c;

    /* JADX INFO: renamed from: d */
    public final EnumC18645 f22324d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4997 f22325e;

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
    public static C8349 ofPattern(String str, Locale locale) {
        String strSubstring;
        int i;
        int i2;
        C21328 c21328;
        boolean z;
        C6575 c6575 = new C6575();
        C12826.requireNonNull(str, "pattern");
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
                    C6575 c6576 = c6575.f16978a;
                    c6576.f16982e = i5;
                    c6576.f16983f = ' ';
                    c6576.f16984g = -1;
                } else {
                    i = i4;
                    i2 = i5;
                }
                InterfaceC11901 interfaceC11901 = (InterfaceC11901) ((HashMap) C6575.f16977i).get(Character.valueOf(cCharAt));
                if (interfaceC11901 != null) {
                    if (cCharAt == 'A') {
                        c6575.m15024m(interfaceC11901, i2, 19, EnumC24680.NOT_NEGATIVE);
                    } else if (cCharAt == 'Q') {
                        z = false;
                        if (i2 == 1 || i2 == 2) {
                            if (cCharAt == 'e') {
                                c6575.m15021j(new C22669(cCharAt, i2, i2, i2, 0));
                            } else if (cCharAt == 'E') {
                                c6575.m15020i(interfaceC11901, EnumC21999.SHORT);
                            } else if (i2 == 1) {
                                c6575.m15022k(interfaceC11901);
                            } else {
                                c6575.m15023l(interfaceC11901, 2);
                            }
                        } else if (i2 == 3) {
                            c6575.m15020i(interfaceC11901, z ? EnumC21999.SHORT_STANDALONE : EnumC21999.SHORT);
                        } else if (i2 == 4) {
                            c6575.m15020i(interfaceC11901, z ? EnumC21999.FULL_STANDALONE : EnumC21999.FULL);
                        } else {
                            if (i2 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            c6575.m15020i(interfaceC11901, z ? EnumC21999.NARROW_STANDALONE : EnumC21999.NARROW);
                        }
                    } else if (cCharAt == 'S') {
                        c6575.m15013b(EnumC19947.NANO_OF_SECOND, i2, i2, false);
                    } else if (cCharAt == 'a') {
                        if (i2 != 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c6575.m15020i(interfaceC11901, EnumC21999.SHORT);
                    } else if (cCharAt != 'k') {
                        if (cCharAt != 'q') {
                            if (cCharAt == 's') {
                                if (i2 == 1) {
                                    c6575.m15022k(interfaceC11901);
                                } else {
                                    if (i2 == 2) {
                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                    }
                                    c6575.m15023l(interfaceC11901, i2);
                                }
                            } else if (cCharAt == 'u' || cCharAt == 'y') {
                                if (i2 == 2) {
                                    C20480 c20480 = C3222.f6245h;
                                    C12826.requireNonNull(interfaceC11901, "field");
                                    C12826.requireNonNull(c20480, "baseDate");
                                    C3222 c3222 = new C3222(interfaceC11901, 2, 2, c20480, 0);
                                    if (c20480 == null) {
                                        long j = 0;
                                        if (!interfaceC11901.mo3657s().m53125e(j)) {
                                            throw new IllegalArgumentException("The base value must be within the range of the field");
                                        }
                                        if (j + C4564.f10231f[2] > 2147483647L) {
                                            throw new C17796("Unable to add printer-parser as the range exceeds the capacity of an int");
                                        }
                                    }
                                    c6575.m15021j(c3222);
                                } else if (i2 < 4) {
                                    c6575.m15024m(interfaceC11901, i2, 19, EnumC24680.NORMAL);
                                } else {
                                    c6575.m15024m(interfaceC11901, i2, 19, EnumC24680.EXCEEDS_PAD);
                                }
                            } else if (cCharAt == 'g') {
                                c6575.m15024m(interfaceC11901, i2, 19, EnumC24680.NORMAL);
                            } else if (cCharAt == 'h' || cCharAt == 'm') {
                                if (i2 == 1) {
                                    c6575.m15022k(interfaceC11901);
                                } else {
                                    if (i2 == 2) {
                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                    }
                                    c6575.m15023l(interfaceC11901, i2);
                                }
                            } else if (cCharAt != 'n') {
                                switch (cCharAt) {
                                    case 'D':
                                        if (i2 == 1) {
                                            c6575.m15022k(interfaceC11901);
                                        } else {
                                            if (i2 != 2 && i2 != 3) {
                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                            }
                                            c6575.m15024m(interfaceC11901, i2, 3, EnumC24680.NOT_NEGATIVE);
                                        }
                                        break;
                                    case 'E':
                                        z = false;
                                        if (i2 == 1) {
                                            if (cCharAt == 'e') {
                                                c6575.m15021j(new C22669(cCharAt, i2, i2, i2, 0));
                                            } else if (cCharAt == 'E') {
                                                c6575.m15020i(interfaceC11901, EnumC21999.SHORT);
                                            } else if (i2 == 1) {
                                                c6575.m15023l(interfaceC11901, 2);
                                            } else {
                                                c6575.m15022k(interfaceC11901);
                                            }
                                        } else if (cCharAt == 'e') {
                                            c6575.m15021j(new C22669(cCharAt, i2, i2, i2, 0));
                                        } else if (cCharAt == 'E') {
                                            c6575.m15020i(interfaceC11901, EnumC21999.SHORT);
                                        } else if (i2 == 1) {
                                            c6575.m15023l(interfaceC11901, 2);
                                        } else {
                                            c6575.m15022k(interfaceC11901);
                                        }
                                        break;
                                    case 'F':
                                        if (i2 != 1) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        c6575.m15022k(interfaceC11901);
                                        break;
                                        break;
                                    case 'G':
                                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                                            c6575.m15020i(interfaceC11901, EnumC21999.SHORT);
                                        } else if (i2 == 4) {
                                            c6575.m15020i(interfaceC11901, EnumC21999.FULL);
                                        } else {
                                            if (i2 != 5) {
                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                            }
                                            c6575.m15020i(interfaceC11901, EnumC21999.NARROW);
                                        }
                                        break;
                                    case 'H':
                                        if (i2 == 1) {
                                            c6575.m15022k(interfaceC11901);
                                        } else {
                                            if (i2 == 2) {
                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                            }
                                            c6575.m15023l(interfaceC11901, i2);
                                        }
                                        break;
                                    default:
                                        switch (cCharAt) {
                                            case 'K':
                                                if (i2 == 1) {
                                                    c6575.m15022k(interfaceC11901);
                                                } else {
                                                    if (i2 == 2) {
                                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                    }
                                                    c6575.m15023l(interfaceC11901, i2);
                                                }
                                                break;
                                            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                                break;
                                            case 'M':
                                                z = false;
                                                if (i2 == 1) {
                                                    if (cCharAt == 'e') {
                                                        c6575.m15021j(new C22669(cCharAt, i2, i2, i2, 0));
                                                    } else if (cCharAt == 'E') {
                                                        c6575.m15020i(interfaceC11901, EnumC21999.SHORT);
                                                    } else if (i2 == 1) {
                                                        c6575.m15023l(interfaceC11901, 2);
                                                    } else {
                                                        c6575.m15022k(interfaceC11901);
                                                    }
                                                } else if (cCharAt == 'e') {
                                                    c6575.m15021j(new C22669(cCharAt, i2, i2, i2, 0));
                                                } else if (cCharAt == 'E') {
                                                    c6575.m15020i(interfaceC11901, EnumC21999.SHORT);
                                                } else if (i2 == 1) {
                                                    c6575.m15023l(interfaceC11901, 2);
                                                } else {
                                                    c6575.m15022k(interfaceC11901);
                                                }
                                                break;
                                            case 'N':
                                                c6575.m15024m(interfaceC11901, i2, 19, EnumC24680.NOT_NEGATIVE);
                                                break;
                                            default:
                                                switch (cCharAt) {
                                                    case C0254q.f1216f /* 99 */:
                                                        if (i2 == 1) {
                                                            c6575.m15021j(new C22669(cCharAt, i2, i2, i2, 0));
                                                        } else if (i2 == 2) {
                                                            throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                        }
                                                        break;
                                                    case 'd':
                                                        if (i2 == 1) {
                                                            c6575.m15022k(interfaceC11901);
                                                        } else {
                                                            if (i2 == 2) {
                                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                            }
                                                            c6575.m15023l(interfaceC11901, i2);
                                                        }
                                                        break;
                                                    case 'e':
                                                        z = false;
                                                        if (i2 == 1) {
                                                            if (cCharAt == 'e') {
                                                                c6575.m15021j(new C22669(cCharAt, i2, i2, i2, 0));
                                                            } else if (cCharAt == 'E') {
                                                                c6575.m15020i(interfaceC11901, EnumC21999.SHORT);
                                                            } else if (i2 == 1) {
                                                                c6575.m15023l(interfaceC11901, 2);
                                                            } else {
                                                                c6575.m15022k(interfaceC11901);
                                                            }
                                                        } else if (cCharAt == 'e') {
                                                            c6575.m15021j(new C22669(cCharAt, i2, i2, i2, 0));
                                                        } else if (cCharAt == 'E') {
                                                            c6575.m15020i(interfaceC11901, EnumC21999.SHORT);
                                                        } else if (i2 == 1) {
                                                            c6575.m15023l(interfaceC11901, 2);
                                                        } else {
                                                            c6575.m15022k(interfaceC11901);
                                                        }
                                                        break;
                                                    default:
                                                        if (i2 != 1) {
                                                            c6575.m15023l(interfaceC11901, i2);
                                                        } else {
                                                            c6575.m15022k(interfaceC11901);
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                c6575.m15024m(interfaceC11901, i2, 19, EnumC24680.NOT_NEGATIVE);
                            }
                        }
                        z = true;
                        if (i2 == 1) {
                            if (cCharAt == 'e') {
                                c6575.m15021j(new C22669(cCharAt, i2, i2, i2, 0));
                            } else if (cCharAt == 'E') {
                                c6575.m15020i(interfaceC11901, EnumC21999.SHORT);
                            } else if (i2 == 1) {
                                c6575.m15022k(interfaceC11901);
                            } else {
                                c6575.m15023l(interfaceC11901, 2);
                            }
                        } else if (cCharAt == 'e') {
                            c6575.m15021j(new C22669(cCharAt, i2, i2, i2, 0));
                        } else if (cCharAt == 'E') {
                            c6575.m15020i(interfaceC11901, EnumC21999.SHORT);
                        } else if (i2 == 1) {
                            c6575.m15022k(interfaceC11901);
                        } else {
                            c6575.m15023l(interfaceC11901, 2);
                        }
                    } else if (i2 == 1) {
                        c6575.m15022k(interfaceC11901);
                    } else {
                        if (i2 == 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c6575.m15023l(interfaceC11901, i2);
                    }
                } else if (cCharAt == 'z') {
                    if (i2 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                    }
                    c6575.m15014c(i2 == 4 ? new C21328(EnumC21999.FULL, false) : new C21328(EnumC21999.SHORT, false));
                } else if (cCharAt == 'V') {
                    if (i2 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + cCharAt);
                    }
                    c6575.m15014c(new C23339(AbstractC7877.f20679a, "ZoneId()"));
                } else if (cCharAt == 'v') {
                    if (i2 == 1) {
                        c21328 = new C21328(EnumC21999.SHORT, true);
                    } else {
                        if (i2 != 4) {
                            throw new IllegalArgumentException("Wrong number of  pattern letters: " + cCharAt);
                        }
                        c21328 = new C21328(EnumC21999.FULL, true);
                    }
                    c6575.m15014c(c21328);
                } else {
                    String str2 = "+0000";
                    if (cCharAt == 'Z') {
                        if (i2 < 4) {
                            c6575.m15018g("+HHMM", "+0000");
                        } else if (i2 == 4) {
                            c6575.m15017f(EnumC21999.FULL);
                        } else {
                            if (i2 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            c6575.m15018g("+HH:MM:ss", "Z");
                        }
                    } else if (cCharAt == 'O') {
                        if (i2 == 1) {
                            c6575.m15017f(EnumC21999.SHORT);
                        } else {
                            if (i2 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + cCharAt);
                            }
                            c6575.m15017f(EnumC21999.FULL);
                        }
                    } else if (cCharAt == 'X') {
                        if (i2 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c6575.m15018g(C5905.f14560d[i2 + (i2 == 1 ? 0 : 1)], "Z");
                    } else if (cCharAt == 'x') {
                        if (i2 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        if (i2 == 1) {
                            str2 = "+00";
                        } else if (i2 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        c6575.m15018g(C5905.f14560d[i2 + (i2 == 1 ? 0 : 1)], str2);
                    } else if (cCharAt == 'W') {
                        if (i2 > 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c6575.m15021j(new C22669(cCharAt, i2, i2, i2, 0));
                    } else if (cCharAt == 'w') {
                        if (i2 > 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        c6575.m15021j(new C22669(cCharAt, i2, i2, 2, 0));
                    } else {
                        if (cCharAt != 'Y') {
                            throw new IllegalArgumentException("Unknown pattern letter: " + cCharAt);
                        }
                        if (i2 == 2) {
                            c6575.m15021j(new C22669(cCharAt, i2, i2, 2, 0));
                        } else {
                            c6575.m15021j(new C22669(cCharAt, i2, i2, 19, 0));
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
                                c6575.m15015d('\'');
                            } else {
                                c6575.m15016e(strSubstring.replace("''", "'"));
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
                    c6575.m15015d('\'');
                } else {
                    c6575.m15016e(strSubstring.replace("''", "'"));
                }
                i3 = i7;
            } else if (cCharAt == '[') {
                c6575.m15026o();
            } else if (cCharAt == ']') {
                if (c6575.f16978a.f16979b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                c6575.m15025n();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                c6575.m15015d(cCharAt);
            }
            i3++;
        }
        return c6575.m15028q(locale, EnumC18645.SMART, null);
    }

    static {
        C6575 c6575 = new C6575();
        EnumC19947 enumC19947 = EnumC19947.YEAR;
        EnumC24680 enumC24680 = EnumC24680.EXCEEDS_PAD;
        c6575.m15024m(enumC19947, 4, 10, enumC24680);
        c6575.m15015d('-');
        EnumC19947 enumC19948 = EnumC19947.MONTH_OF_YEAR;
        c6575.m15023l(enumC19948, 2);
        c6575.m15015d('-');
        EnumC19947 enumC19949 = EnumC19947.DAY_OF_MONTH;
        c6575.m15023l(enumC19949, 2);
        EnumC18645 enumC18645 = EnumC18645.STRICT;
        C10361 c10361 = C10361.f28676c;
        C8349 c8349M15027p = c6575.m15027p(enumC18645, c10361);
        f22318f = c8349M15027p;
        C6575 c6576 = new C6575();
        EnumC9928 enumC9928 = EnumC9928.INSENSITIVE;
        c6576.m15014c(enumC9928);
        c6576.m15012a(c8349M15027p);
        C5905 c5905 = C5905.f14561e;
        c6576.m15014c(c5905);
        c6576.m15027p(enumC18645, c10361);
        C6575 c6577 = new C6575();
        c6577.m15014c(enumC9928);
        c6577.m15012a(c8349M15027p);
        c6577.m15026o();
        c6577.m15014c(c5905);
        c6577.m15027p(enumC18645, c10361);
        C6575 c6578 = new C6575();
        EnumC19947 enumC199410 = EnumC19947.HOUR_OF_DAY;
        c6578.m15023l(enumC199410, 2);
        c6578.m15015d(':');
        EnumC19947 enumC199411 = EnumC19947.MINUTE_OF_HOUR;
        c6578.m15023l(enumC199411, 2);
        c6578.m15026o();
        c6578.m15015d(':');
        EnumC19947 enumC199412 = EnumC19947.SECOND_OF_MINUTE;
        c6578.m15023l(enumC199412, 2);
        c6578.m15026o();
        c6578.m15013b(EnumC19947.NANO_OF_SECOND, 0, 9, true);
        C8349 c8349M15027p2 = c6578.m15027p(enumC18645, null);
        C6575 c6579 = new C6575();
        c6579.m15014c(enumC9928);
        c6579.m15012a(c8349M15027p2);
        c6579.m15014c(c5905);
        c6579.m15027p(enumC18645, null);
        C6575 c65710 = new C6575();
        c65710.m15014c(enumC9928);
        c65710.m15012a(c8349M15027p2);
        c65710.m15026o();
        c65710.m15014c(c5905);
        c65710.m15027p(enumC18645, null);
        C6575 c65711 = new C6575();
        c65711.m15014c(enumC9928);
        c65711.m15012a(c8349M15027p);
        c65711.m15015d('T');
        c65711.m15012a(c8349M15027p2);
        C8349 c8349M15027p3 = c65711.m15027p(enumC18645, c10361);
        C6575 c65712 = new C6575();
        c65712.m15014c(enumC9928);
        c65712.m15012a(c8349M15027p3);
        EnumC9928 enumC9929 = EnumC9928.LENIENT;
        c65712.m15014c(enumC9929);
        c65712.m15014c(c5905);
        EnumC9928 enumC99210 = EnumC9928.STRICT;
        c65712.m15014c(enumC99210);
        C8349 c8349M15027p4 = c65712.m15027p(enumC18645, c10361);
        f22319g = c8349M15027p4;
        C6575 c65713 = new C6575();
        c65713.m15012a(c8349M15027p4);
        c65713.m15026o();
        c65713.m15015d('[');
        EnumC9928 enumC99211 = EnumC9928.SENSITIVE;
        c65713.m15014c(enumC99211);
        C10500 c10500 = C6575.f16976h;
        c65713.m15014c(new C23339(c10500, "ZoneRegionId()"));
        c65713.m15015d(']');
        c65713.m15027p(enumC18645, c10361);
        C6575 c65714 = new C6575();
        c65714.m15012a(c8349M15027p3);
        c65714.m15026o();
        c65714.m15014c(c5905);
        c65714.m15026o();
        c65714.m15015d('[');
        c65714.m15014c(enumC99211);
        c65714.m15014c(new C23339(c10500, "ZoneRegionId()"));
        c65714.m15015d(']');
        c65714.m15027p(enumC18645, c10361);
        C6575 c65715 = new C6575();
        c65715.m15014c(enumC9928);
        c65715.m15024m(enumC19947, 4, 10, enumC24680);
        c65715.m15015d('-');
        c65715.m15023l(EnumC19947.DAY_OF_YEAR, 3);
        c65715.m15026o();
        c65715.m15014c(c5905);
        c65715.m15027p(enumC18645, c10361);
        C6575 c65716 = new C6575();
        c65716.m15014c(enumC9928);
        c65716.m15024m(AbstractC23300.f73304c, 4, 10, enumC24680);
        c65716.m15016e("-W");
        c65716.m15023l(AbstractC23300.f73303b, 2);
        c65716.m15015d('-');
        EnumC19947 enumC199413 = EnumC19947.DAY_OF_WEEK;
        c65716.m15023l(enumC199413, 1);
        c65716.m15026o();
        c65716.m15014c(c5905);
        c65716.m15027p(enumC18645, c10361);
        C6575 c65717 = new C6575();
        c65717.m15014c(enumC9928);
        c65717.m15014c(new C11270());
        f22320h = c65717.m15027p(enumC18645, null);
        C6575 c65718 = new C6575();
        c65718.m15014c(enumC9928);
        c65718.m15023l(enumC19947, 4);
        c65718.m15023l(enumC19948, 2);
        c65718.m15023l(enumC19949, 2);
        c65718.m15026o();
        c65718.m15014c(enumC9929);
        c65718.m15018g("+HHMMss", "Z");
        c65718.m15014c(enumC99210);
        c65718.m15027p(enumC18645, c10361);
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
        C6575 c65719 = new C6575();
        c65719.m15014c(enumC9928);
        c65719.m15014c(enumC9929);
        c65719.m15026o();
        c65719.m15019h(enumC199413, map);
        c65719.m15016e(", ");
        c65719.m15025n();
        c65719.m15024m(enumC19949, 1, 2, EnumC24680.NOT_NEGATIVE);
        c65719.m15015d(' ');
        c65719.m15019h(enumC19948, map2);
        c65719.m15015d(' ');
        c65719.m15023l(enumC19947, 4);
        c65719.m15015d(' ');
        c65719.m15023l(enumC199410, 2);
        c65719.m15015d(':');
        c65719.m15023l(enumC199411, 2);
        c65719.m15026o();
        c65719.m15015d(':');
        c65719.m15023l(enumC199412, 2);
        c65719.m15025n();
        c65719.m15015d(' ');
        c65719.m15018g("+HHMM", "GMT");
        c65719.m15027p(EnumC18645.SMART, c10361);
    }

    public C8349(C19316 c19316, Locale locale, EnumC18645 enumC18645, InterfaceC4997 interfaceC4997) {
        C3893 c3893 = C3893.f8438a;
        this.f22321a = (C19316) C12826.requireNonNull(c19316, "printerParser");
        this.f22322b = (Locale) C12826.requireNonNull(locale, "locale");
        this.f22323c = (C3893) C12826.requireNonNull(c3893, "decimalStyle");
        this.f22324d = (EnumC18645) C12826.requireNonNull(enumC18645, "resolverStyle");
        this.f22325e = interfaceC4997;
    }

    public String format(InterfaceC4524 interfaceC4524) {
        StringBuilder sb = new StringBuilder(32);
        C19316 c19316 = this.f22321a;
        C12826.requireNonNull(interfaceC4524, "temporal");
        C12826.requireNonNull(sb, "appendable");
        try {
            c19316.mo9636l(new C11940(interfaceC4524, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new C17796(e.getMessage(), e);
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
    /* JADX INFO: renamed from: a */
    public final C17974 m19269a(CharSequence charSequence) {
        String string;
        InterfaceC11901 interfaceC11901;
        EnumC19947 enumC19947;
        Map map;
        EnumC19947 enumC19948;
        InterfaceC11901 interfaceC11902;
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        C12826.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        C12826.requireNonNull(parsePosition, "position");
        C5234 c5234 = new C5234(this);
        int iMo9637m = this.f22321a.mo9637m(c5234, charSequence, parsePosition.getIndex());
        AbstractC7739 abstractC7739 = null;
        if (iMo9637m < 0) {
            parsePosition.setErrorIndex(~iMo9637m);
            c5234 = null;
        } else {
            parsePosition.setIndex(iMo9637m);
        }
        if (c5234 != null) {
            C8349 c8349 = c5234.f12334a;
            if (parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
                C17974 c17974M11288c = c5234.m11288c();
                InterfaceC4997 interfaceC4997 = c5234.m11288c().f53683c;
                if (interfaceC4997 == null && (interfaceC4997 = c8349.f22325e) == null) {
                    interfaceC4997 = C10361.f28676c;
                }
                c17974M11288c.f53683c = interfaceC4997;
                AbstractC7739 abstractC77310 = c17974M11288c.f53682b;
                if (abstractC77310 != null) {
                    abstractC7739 = abstractC77310;
                } else {
                    c8349.getClass();
                }
                c17974M11288c.f53682b = abstractC7739;
                c17974M11288c.f53685e = this.f22324d;
                c17974M11288c.m40912k();
                c17974M11288c.m40917v(c17974M11288c.f53683c.mo10580O(c17974M11288c.f53681a, c17974M11288c.f53685e));
                c17974M11288c.m40915q();
                if (((HashMap) c17974M11288c.f53681a).size() > 0) {
                    loop0: while (i < 50) {
                        Iterator it = ((HashMap) c17974M11288c.f53681a).entrySet().iterator();
                        do {
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            interfaceC11902 = (InterfaceC11901) ((Map.Entry) it.next()).getKey();
                            InterfaceC4524 interfaceC4524Mo3656n = interfaceC11902.mo3656n(c17974M11288c.f53681a, c17974M11288c, c17974M11288c.f53685e);
                            if (interfaceC4524Mo3656n != null) {
                                if (interfaceC4524Mo3656n instanceof InterfaceC23832) {
                                    InterfaceC23832 interfaceC23832 = (InterfaceC23832) interfaceC4524Mo3656n;
                                    AbstractC7739 abstractC77311 = c17974M11288c.f53682b;
                                    if (abstractC77311 == null) {
                                        c17974M11288c.f53682b = interfaceC23832.mo7146F();
                                    } else if (!abstractC77311.equals(interfaceC23832.mo7146F())) {
                                        throw new C17796("ChronoZonedDateTime must use the effective parsed zone: " + c17974M11288c.f53682b);
                                    }
                                    interfaceC4524Mo3656n = interfaceC23832.mo7159t();
                                }
                                if (interfaceC4524Mo3656n instanceof InterfaceC15784) {
                                    InterfaceC15784 interfaceC15784 = (InterfaceC15784) interfaceC4524Mo3656n;
                                    c17974M11288c.m40916s(interfaceC15784.mo35852b(), C8547.f22959d);
                                    c17974M11288c.m40917v(interfaceC15784.mo35853f());
                                    break;
                                }
                                if (interfaceC4524Mo3656n instanceof InterfaceC15114) {
                                    c17974M11288c.m40917v((InterfaceC15114) interfaceC4524Mo3656n);
                                    break;
                                }
                                if (interfaceC4524Mo3656n instanceof C9257) {
                                    c17974M11288c.m40916s((C9257) interfaceC4524Mo3656n, C8547.f22959d);
                                    break;
                                }
                                throw new C17796("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                            }
                        } while (((HashMap) c17974M11288c.f53681a).containsKey(interfaceC11902));
                        i++;
                    }
                    if (i == 50) {
                        throw new C17796("One of the parsed fields has an incorrectly implemented resolve method");
                    }
                    if (i > 0) {
                        c17974M11288c.m40912k();
                        c17974M11288c.m40917v(c17974M11288c.f53683c.mo10580O(c17974M11288c.f53681a, c17974M11288c.f53685e));
                        c17974M11288c.m40915q();
                    }
                }
                if (c17974M11288c.f53687g == null) {
                    Map map2 = c17974M11288c.f53681a;
                    EnumC19947 enumC19949 = EnumC19947.MILLI_OF_SECOND;
                    if (((HashMap) map2).containsKey(enumC19949)) {
                        long jLongValue = ((Long) ((HashMap) c17974M11288c.f53681a).remove(enumC19949)).longValue();
                        Map map3 = c17974M11288c.f53681a;
                        EnumC19947 enumC199410 = EnumC19947.MICRO_OF_SECOND;
                        if (((HashMap) map3).containsKey(enumC199410)) {
                            long jLongValue2 = (((Long) ((HashMap) c17974M11288c.f53681a).get(enumC199410)).longValue() % 1000) + (jLongValue * 1000);
                            c17974M11288c.m40918x(enumC19949, enumC199410, Long.valueOf(jLongValue2));
                            ((HashMap) c17974M11288c.f53681a).remove(enumC199410);
                            ((HashMap) c17974M11288c.f53681a).put(EnumC19947.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                        } else {
                            ((HashMap) c17974M11288c.f53681a).put(EnumC19947.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                        }
                    } else {
                        Map map4 = c17974M11288c.f53681a;
                        EnumC19947 enumC199411 = EnumC19947.MICRO_OF_SECOND;
                        if (((HashMap) map4).containsKey(enumC199411)) {
                            ((HashMap) c17974M11288c.f53681a).put(EnumC19947.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) c17974M11288c.f53681a).remove(enumC199411)).longValue() * 1000));
                        }
                    }
                    Map map5 = c17974M11288c.f53681a;
                    EnumC19947 enumC199412 = EnumC19947.HOUR_OF_DAY;
                    Long l2 = (Long) ((HashMap) map5).get(enumC199412);
                    if (l2 != null) {
                        Map map6 = c17974M11288c.f53681a;
                        EnumC19947 enumC199413 = EnumC19947.MINUTE_OF_HOUR;
                        Long l3 = (Long) ((HashMap) map6).get(enumC199413);
                        Map map7 = c17974M11288c.f53681a;
                        EnumC19947 enumC199414 = EnumC19947.SECOND_OF_MINUTE;
                        Long l4 = (Long) ((HashMap) map7).get(enumC199414);
                        Map map8 = c17974M11288c.f53681a;
                        EnumC19947 enumC199415 = EnumC19947.NANO_OF_SECOND;
                        Long l5 = (Long) ((HashMap) map8).get(enumC199415);
                        if ((l3 != null || (l4 == null && l5 == null)) && (l3 == null || l4 != null || l5 == null)) {
                            c17974M11288c.m40914p(l2.longValue(), l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L, l5 != null ? l5.longValue() : 0L);
                            ((HashMap) c17974M11288c.f53681a).remove(enumC199412);
                            ((HashMap) c17974M11288c.f53681a).remove(enumC199413);
                            ((HashMap) c17974M11288c.f53681a).remove(enumC199414);
                            ((HashMap) c17974M11288c.f53681a).remove(enumC199415);
                            if (c17974M11288c.f53685e != EnumC18645.LENIENT && ((HashMap) c17974M11288c.f53681a).size() > 0) {
                                for (Map.Entry entry : ((HashMap) c17974M11288c.f53681a).entrySet()) {
                                    interfaceC11901 = (InterfaceC11901) entry.getKey();
                                    if (interfaceC11901 instanceof EnumC19947) {
                                        enumC19947 = (EnumC19947) interfaceC11901;
                                        if (enumC19947.m45274V()) {
                                            enumC19947.m45273T(((Long) entry.getValue()).longValue());
                                        }
                                    }
                                }
                            }
                        }
                    } else if (c17974M11288c.f53685e != EnumC18645.LENIENT) {
                        while (r2.hasNext()) {
                            interfaceC11901 = (InterfaceC11901) entry.getKey();
                            if (interfaceC11901 instanceof EnumC19947) {
                                enumC19947 = (EnumC19947) interfaceC11901;
                                if (enumC19947.m45274V()) {
                                    enumC19947.m45273T(((Long) entry.getValue()).longValue());
                                }
                            }
                        }
                    }
                } else if (c17974M11288c.f53685e != EnumC18645.LENIENT) {
                    while (r2.hasNext()) {
                        interfaceC11901 = (InterfaceC11901) entry.getKey();
                        if (interfaceC11901 instanceof EnumC19947) {
                            enumC19947 = (EnumC19947) interfaceC11901;
                            if (enumC19947.m45274V()) {
                                enumC19947.m45273T(((Long) entry.getValue()).longValue());
                            }
                        }
                    }
                }
                InterfaceC15114 interfaceC15114 = c17974M11288c.f53686f;
                if (interfaceC15114 != null) {
                    c17974M11288c.m40911j(interfaceC15114);
                }
                C9257 c9257 = c17974M11288c.f53687g;
                if (c9257 != null) {
                    c17974M11288c.m40911j(c9257);
                    if (c17974M11288c.f53686f != null && ((HashMap) c17974M11288c.f53681a).size() > 0) {
                        c17974M11288c.m40911j(c17974M11288c.f53686f.mo16119I(c17974M11288c.f53687g));
                    }
                }
                if (c17974M11288c.f53686f != null && c17974M11288c.f53687g != null) {
                    C8547 c8547 = c17974M11288c.f53688h;
                    c8547.getClass();
                    C8547 c8548 = C8547.f22959d;
                    if (c8547 != c8548) {
                        c17974M11288c.f53686f = c17974M11288c.f53686f.mo16121N(c17974M11288c.f53688h);
                        c17974M11288c.f53688h = c8548;
                    }
                }
                if (c17974M11288c.f53687g == null) {
                    if (((HashMap) c17974M11288c.f53681a).containsKey(EnumC19947.INSTANT_SECONDS)) {
                        map = c17974M11288c.f53681a;
                        enumC19948 = EnumC19947.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(enumC19948)) {
                            long jLongValue3 = ((Long) ((HashMap) c17974M11288c.f53681a).get(enumC19948)).longValue();
                            ((HashMap) c17974M11288c.f53681a).put(EnumC19947.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / 1000));
                            ((HashMap) c17974M11288c.f53681a).put(EnumC19947.MILLI_OF_SECOND, Long.valueOf(jLongValue3 / 1000000));
                        } else {
                            ((HashMap) c17974M11288c.f53681a).put(enumC19948, 0L);
                            ((HashMap) c17974M11288c.f53681a).put(EnumC19947.MICRO_OF_SECOND, 0L);
                            ((HashMap) c17974M11288c.f53681a).put(EnumC19947.MILLI_OF_SECOND, 0L);
                        }
                    } else if (((HashMap) c17974M11288c.f53681a).containsKey(EnumC19947.SECOND_OF_DAY)) {
                        map = c17974M11288c.f53681a;
                        enumC19948 = EnumC19947.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(enumC19948)) {
                            long jLongValue4 = ((Long) ((HashMap) c17974M11288c.f53681a).get(enumC19948)).longValue();
                            ((HashMap) c17974M11288c.f53681a).put(EnumC19947.MICRO_OF_SECOND, Long.valueOf(jLongValue4 / 1000));
                            ((HashMap) c17974M11288c.f53681a).put(EnumC19947.MILLI_OF_SECOND, Long.valueOf(jLongValue4 / 1000000));
                        } else {
                            ((HashMap) c17974M11288c.f53681a).put(enumC19948, 0L);
                            ((HashMap) c17974M11288c.f53681a).put(EnumC19947.MICRO_OF_SECOND, 0L);
                            ((HashMap) c17974M11288c.f53681a).put(EnumC19947.MILLI_OF_SECOND, 0L);
                        }
                    } else if (((HashMap) c17974M11288c.f53681a).containsKey(EnumC19947.SECOND_OF_MINUTE)) {
                        map = c17974M11288c.f53681a;
                        enumC19948 = EnumC19947.NANO_OF_SECOND;
                        if (((HashMap) map).containsKey(enumC19948)) {
                            long jLongValue5 = ((Long) ((HashMap) c17974M11288c.f53681a).get(enumC19948)).longValue();
                            ((HashMap) c17974M11288c.f53681a).put(EnumC19947.MICRO_OF_SECOND, Long.valueOf(jLongValue5 / 1000));
                            ((HashMap) c17974M11288c.f53681a).put(EnumC19947.MILLI_OF_SECOND, Long.valueOf(jLongValue5 / 1000000));
                        } else {
                            ((HashMap) c17974M11288c.f53681a).put(enumC19948, 0L);
                            ((HashMap) c17974M11288c.f53681a).put(EnumC19947.MICRO_OF_SECOND, 0L);
                            ((HashMap) c17974M11288c.f53681a).put(EnumC19947.MILLI_OF_SECOND, 0L);
                        }
                    }
                }
                if (c17974M11288c.f53686f != null && c17974M11288c.f53687g != null) {
                    Long l6 = (Long) ((HashMap) c17974M11288c.f53681a).get(EnumC19947.OFFSET_SECONDS);
                    if (l6 != null) {
                        ((HashMap) c17974M11288c.f53681a).put(EnumC19947.INSTANT_SECONDS, Long.valueOf(c17974M11288c.f53686f.mo16119I(c17974M11288c.f53687g).mo35849D(C19550.m44395e0(l6.intValue())).mo7147U()));
                        return c17974M11288c;
                    }
                    if (c17974M11288c.f53682b != null) {
                        ((HashMap) c17974M11288c.f53681a).put(EnumC19947.INSTANT_SECONDS, Long.valueOf(c17974M11288c.f53686f.mo16119I(c17974M11288c.f53687g).mo35849D(c17974M11288c.f53682b).mo7147U()));
                    }
                }
                return c17974M11288c;
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
            throw new C14621(str, charSequence);
        }
        String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new C14621(str2, charSequence);
    }

    public final String toString() {
        String string = this.f22321a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
