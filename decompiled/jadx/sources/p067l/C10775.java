package p067l;

import android.text.TextUtils;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.badge.BadgeDrawable;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۡۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55EZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10775 {

    /* JADX INFO: renamed from: ۧ */
    public final int f29855;

    /* JADX INFO: renamed from: ᩳ */
    public final CharSequence f29857;

    /* JADX INFO: renamed from: ܽ */
    public int f29856 = 0;

    /* JADX INFO: renamed from: ֫ */
    public int f29854 = 0;

    public C10775(CharSequence charSequence) {
        this.f29857 = charSequence;
        this.f29855 = charSequence.length();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m24820() {
        int iIndexOf = -1;
        int i = 1;
        while (true) {
            iIndexOf = TextUtils.indexOf(this.f29857, '\n', iIndexOf + 1);
            if (iIndexOf == -1 || iIndexOf >= this.f29854) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m24823() throws Exception {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        while (z) {
            char cM24818 = m24818();
            int i = this.f29856;
            this.f29854 = i;
            if (cM24818 == '\n') {
                this.f29854 = i - 1;
                throw new Exception("Can not find the right \"");
            }
            if (cM24818 == '\"') {
                z = false;
            } else if (cM24818 == '\\') {
                char cM24819 = m24818();
                this.f29854 = this.f29856;
                if (cM24819 == '\"' || cM24819 == '\'' || cM24819 == '\\') {
                    sb.append(cM24819);
                } else if (cM24819 == 'b') {
                    sb.append('\b');
                } else if (cM24819 == 'f') {
                    sb.append('\f');
                } else if (cM24819 == 'n') {
                    sb.append('\n');
                } else if (cM24819 == 'r') {
                    sb.append('\r');
                } else if (cM24819 == 't') {
                    sb.append('\t');
                } else {
                    throw new Exception("Invalid escape sequence: \\" + cM24819);
                }
            } else {
                sb.append(cM24818);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m24817(String str) {
        return str.replace("\\", "\\\\").replace("\f", "\\f").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t").replace("\b", "\\b").replace("\"", "\\\"");
    }

    /* JADX INFO: renamed from: ܿ */
    private char m24818() throws Exception {
        int i = this.f29856;
        if (i >= this.f29855) {
            throw new Exception("EOF");
        }
        this.f29856 = i + 1;
        return this.f29857.charAt(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m24822() throws Exception {
        int i;
        boolean z = true;
        while (true) {
            i = this.f29855;
            if (z && this.f29856 < i) {
                char cM24818 = m24818();
                if (cM24818 != '\f' && cM24818 != '\r' && cM24818 != ' ') {
                    if (cM24818 != '/') {
                        switch (cM24818) {
                            case '\b':
                            case '\t':
                            case '\n':
                                continue;
                        }
                        m24819();
                        z = false;
                    } else {
                        char cM24819 = m24818();
                        if (cM24819 == '/') {
                            while (this.f29856 < i && m24818() != '\n') {
                            }
                        } else if (cM24819 == '*') {
                            while (true) {
                                if (this.f29856 >= i || m24818() == '*') {
                                    if (this.f29856 >= i) {
                                        throw new Exception("EOF");
                                    }
                                    if (m24818() == '/') {
                                        break;
                                    }
                                }
                            }
                        } else {
                            m24819();
                            m24819();
                            z = false;
                        }
                    }
                }
            }
        }
        int i2 = this.f29856;
        if (i2 >= i) {
            return "";
        }
        this.f29854 = i2;
        char cM248110 = m24818();
        if (cM248110 == '!') {
            if (m24818() == '=') {
                return "!=";
            }
            m24819();
            return "!";
        }
        if (cM248110 != '\"' && cM248110 != '.') {
            if (cM248110 == '/') {
                if (m24818() == '=') {
                    return "/=";
                }
                m24819();
                return "/";
            }
            if (cM248110 != '[' && cM248110 != ']') {
                if (cM248110 == '^') {
                    if (m24818() == '=') {
                        return "^=";
                    }
                    m24819();
                    return "^";
                }
                switch (cM248110) {
                    case '%':
                        if (m24818() == '=') {
                            return "%=";
                        }
                        m24819();
                        return "%";
                    case '&':
                        char cM248111 = m24818();
                        if (cM248111 == '&') {
                            return "&&";
                        }
                        if (cM248111 == '=') {
                            return "&=";
                        }
                        m24819();
                        return C0233a.f1084p;
                    case '\'':
                    case '(':
                    case ')':
                    case ',':
                        break;
                    case '*':
                        if (m24818() == '=') {
                            return "*=";
                        }
                        m24819();
                        return "*";
                    case '+':
                        char cM248112 = m24818();
                        if (cM248112 == '+') {
                            return "++";
                        }
                        if (cM248112 == '=') {
                            return "+=";
                        }
                        m24819();
                        return BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX;
                    default:
                        switch (cM248110) {
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                            case '?':
                                break;
                            case '<':
                                char cM248113 = m24818();
                                if (cM248113 == '=') {
                                    return "<=";
                                }
                                if (cM248113 != '<') {
                                    m24819();
                                    return "<";
                                }
                                if (m24818() == '=') {
                                    return "<<=";
                                }
                                m24819();
                                return "<<";
                            case '=':
                                if (m24818() == '=') {
                                    return "==";
                                }
                                m24819();
                                return "=";
                            case '>':
                                char cM248114 = m24818();
                                if (cM248114 == '=') {
                                    return ">=";
                                }
                                if (cM248114 != '>') {
                                    m24819();
                                    return ">";
                                }
                                char cM248115 = m24818();
                                if (cM248115 == '>') {
                                    if (m24818() == '=') {
                                        return ">>>=";
                                    }
                                    m24819();
                                    return ">>>";
                                }
                                if (cM248115 == '=') {
                                    return ">>=";
                                }
                                m24819();
                                return ">>";
                            default:
                                switch (cM248110) {
                                    case '{':
                                    case C0254q.f1218h /* 125 */:
                                    case '~':
                                        break;
                                    case '|':
                                        char cM248116 = m24818();
                                        if (cM248116 == '|') {
                                            return "||";
                                        }
                                        if (cM248116 == '=') {
                                            return "|=";
                                        }
                                        m24819();
                                        return "|";
                                    default:
                                        boolean z2 = cM248110 == '-';
                                        if (z2) {
                                            cM248110 = m24818();
                                            if (cM248110 == '-') {
                                                return "--";
                                            }
                                            if (cM248110 == '=') {
                                                return "-=";
                                            }
                                        }
                                        boolean z3 = '0' <= cM248110 && cM248110 <= '9';
                                        if (!z3 && z2) {
                                            m24819();
                                            return "-";
                                        }
                                        if (!z3 && (('a' > cM248110 || cM248110 > 'z') && (('A' > cM248110 || cM248110 > 'Z') && cM248110 != '_' && cM248110 != '$' && (19968 > cM248110 || cM248110 > 40869)))) {
                                            throw new Exception("Unknown Token Start: " + cM248110);
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        if (z2) {
                                            sb.append('-');
                                        }
                                        while (true) {
                                            sb.append(cM248110);
                                            cM248110 = m24818();
                                            if (('a' <= cM248110 && cM248110 <= 'z') || (('A' <= cM248110 && cM248110 <= 'Z') || cM248110 == '_' || cM248110 == '$' || (19968 <= cM248110 && cM248110 <= 40869))) {
                                                z3 = false;
                                            } else if ('0' > cM248110 || cM248110 > '9') {
                                                if (!z3 || cM248110 != '.') {
                                                }
                                            }
                                        }
                                        m24819();
                                        return sb.toString();
                                }
                                break;
                        }
                        break;
                }
            }
        }
        return String.valueOf(cM248110);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24821(String str) throws Exception {
        String strM24822 = m24822();
        if (!strM24822.equals(str)) {
            throw new Exception(C20865.m47154("Invalid token: expected=", str, ", got=", strM24822));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m24816(String str) throws Exception {
        if (!str.equals("{")) {
            throw new Exception("Invalid token: expected={, got=".concat(str));
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m24819() {
        this.f29856--;
    }
}
