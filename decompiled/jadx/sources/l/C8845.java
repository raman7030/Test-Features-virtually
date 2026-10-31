package l;

import android.text.TextUtils;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.q;
import com.google.android.material.badge.BadgeDrawable;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۡۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55EZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8845 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f26931;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f26933;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f26932 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f26930 = 0;

    public C8845(CharSequence charSequence) {
        this.f26933 = charSequence;
        this.f26931 = charSequence.length();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m22850() {
        int iIndexOf = -1;
        int i = 1;
        while (true) {
            iIndexOf = TextUtils.indexOf(this.f26933, '\n', iIndexOf + 1);
            if (iIndexOf == -1 || iIndexOf >= this.f26930) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m22853() throws Exception {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        while (z) {
            char cM22848 = m22848();
            int i = this.f26932;
            this.f26930 = i;
            if (cM22848 == '\n') {
                this.f26930 = i - 1;
                throw new Exception("Can not find the right \"");
            }
            if (cM22848 == '\"') {
                z = false;
            } else if (cM22848 == '\\') {
                char cM22849 = m22848();
                this.f26930 = this.f26932;
                if (cM22849 == '\"' || cM22849 == '\'' || cM22849 == '\\') {
                    sb.append(cM22849);
                } else if (cM22849 == 'b') {
                    sb.append('\b');
                } else if (cM22849 == 'f') {
                    sb.append('\f');
                } else if (cM22849 == 'n') {
                    sb.append('\n');
                } else if (cM22849 == 'r') {
                    sb.append('\r');
                } else if (cM22849 == 't') {
                    sb.append('\t');
                } else {
                    throw new Exception("Invalid escape sequence: \\" + cM22849);
                }
            } else {
                sb.append(cM22848);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m22847(String str) {
        return str.replace("\\", "\\\\").replace("\f", "\\f").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t").replace("\b", "\\b").replace("\"", "\\\"");
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private char m22848() throws Exception {
        int i = this.f26932;
        if (i >= this.f26931) {
            throw new Exception("EOF");
        }
        this.f26932 = i + 1;
        return this.f26933.charAt(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m22852() throws Exception {
        int i;
        boolean z = true;
        while (true) {
            i = this.f26931;
            if (z && this.f26932 < i) {
                char cM22848 = m22848();
                if (cM22848 != '\f' && cM22848 != '\r' && cM22848 != ' ') {
                    if (cM22848 != '/') {
                        switch (cM22848) {
                            case '\b':
                            case '\t':
                            case '\n':
                                continue;
                        }
                        m22849();
                        z = false;
                    } else {
                        char cM22849 = m22848();
                        if (cM22849 == '/') {
                            while (this.f26932 < i && m22848() != '\n') {
                            }
                        } else if (cM22849 == '*') {
                            while (true) {
                                if (this.f26932 >= i || m22848() == '*') {
                                    if (this.f26932 >= i) {
                                        throw new Exception("EOF");
                                    }
                                    if (m22848() == '/') {
                                        break;
                                    }
                                }
                            }
                        } else {
                            m22849();
                            m22849();
                            z = false;
                        }
                    }
                }
            }
        }
        int i2 = this.f26932;
        if (i2 >= i) {
            return "";
        }
        this.f26930 = i2;
        char cM228410 = m22848();
        if (cM228410 == '!') {
            if (m22848() == '=') {
                return "!=";
            }
            m22849();
            return "!";
        }
        if (cM228410 != '\"' && cM228410 != '.') {
            if (cM228410 == '/') {
                if (m22848() == '=') {
                    return "/=";
                }
                m22849();
                return "/";
            }
            if (cM228410 != '[' && cM228410 != ']') {
                if (cM228410 == '^') {
                    if (m22848() == '=') {
                        return "^=";
                    }
                    m22849();
                    return "^";
                }
                switch (cM228410) {
                    case '%':
                        if (m22848() == '=') {
                            return "%=";
                        }
                        m22849();
                        return "%";
                    case '&':
                        char cM228411 = m22848();
                        if (cM228411 == '&') {
                            return "&&";
                        }
                        if (cM228411 == '=') {
                            return "&=";
                        }
                        m22849();
                        return a.p;
                    case '\'':
                    case '(':
                    case ')':
                    case ',':
                        break;
                    case '*':
                        if (m22848() == '=') {
                            return "*=";
                        }
                        m22849();
                        return "*";
                    case '+':
                        char cM228412 = m22848();
                        if (cM228412 == '+') {
                            return "++";
                        }
                        if (cM228412 == '=') {
                            return "+=";
                        }
                        m22849();
                        return BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX;
                    default:
                        switch (cM228410) {
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                            case '?':
                                break;
                            case '<':
                                char cM228413 = m22848();
                                if (cM228413 == '=') {
                                    return "<=";
                                }
                                if (cM228413 != '<') {
                                    m22849();
                                    return "<";
                                }
                                if (m22848() == '=') {
                                    return "<<=";
                                }
                                m22849();
                                return "<<";
                            case '=':
                                if (m22848() == '=') {
                                    return "==";
                                }
                                m22849();
                                return "=";
                            case '>':
                                char cM228414 = m22848();
                                if (cM228414 == '=') {
                                    return ">=";
                                }
                                if (cM228414 != '>') {
                                    m22849();
                                    return ">";
                                }
                                char cM228415 = m22848();
                                if (cM228415 == '>') {
                                    if (m22848() == '=') {
                                        return ">>>=";
                                    }
                                    m22849();
                                    return ">>>";
                                }
                                if (cM228415 == '=') {
                                    return ">>=";
                                }
                                m22849();
                                return ">>";
                            default:
                                switch (cM228410) {
                                    case '{':
                                    case q.h /* 125 */:
                                    case '~':
                                        break;
                                    case '|':
                                        char cM228416 = m22848();
                                        if (cM228416 == '|') {
                                            return "||";
                                        }
                                        if (cM228416 == '=') {
                                            return "|=";
                                        }
                                        m22849();
                                        return "|";
                                    default:
                                        boolean z2 = cM228410 == '-';
                                        if (z2) {
                                            cM228410 = m22848();
                                            if (cM228410 == '-') {
                                                return "--";
                                            }
                                            if (cM228410 == '=') {
                                                return "-=";
                                            }
                                        }
                                        boolean z3 = '0' <= cM228410 && cM228410 <= '9';
                                        if (!z3 && z2) {
                                            m22849();
                                            return "-";
                                        }
                                        if (!z3 && (('a' > cM228410 || cM228410 > 'z') && (('A' > cM228410 || cM228410 > 'Z') && cM228410 != '_' && cM228410 != '$' && (19968 > cM228410 || cM228410 > 40869)))) {
                                            throw new Exception("Unknown Token Start: " + cM228410);
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        if (z2) {
                                            sb.append('-');
                                        }
                                        while (true) {
                                            sb.append(cM228410);
                                            cM228410 = m22848();
                                            if (('a' <= cM228410 && cM228410 <= 'z') || (('A' <= cM228410 && cM228410 <= 'Z') || cM228410 == '_' || cM228410 == '$' || (19968 <= cM228410 && cM228410 <= 40869))) {
                                                z3 = false;
                                            } else if ('0' > cM228410 || cM228410 > '9') {
                                                if (!z3 || cM228410 != '.') {
                                                }
                                            }
                                        }
                                        m22849();
                                        return sb.toString();
                                }
                                break;
                        }
                        break;
                }
            }
        }
        return String.valueOf(cM228410);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22851(String str) throws Exception {
        String strM22852 = m22852();
        if (!strM22852.equals(str)) {
            throw new Exception(C19462.m44858("Invalid token: expected=", str, ", got=", strM22852));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m22846(String str) throws Exception {
        if (!str.equals("{")) {
            throw new Exception("Invalid token: expected={, got=".concat(str));
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m22849() {
        this.f26932--;
    }
}
