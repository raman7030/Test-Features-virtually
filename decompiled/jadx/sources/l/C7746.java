package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.color.MaterialColors;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.am;
import java.io.Closeable;
import java.io.IOException;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.۟᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZAX9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7746 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m20777(C9246 c9246) {
        while (c9246.m23720()) {
            switch (c9246.m23725()) {
                case '[':
                    return false;
                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                    c9246.m23723();
                    char cM23725 = c9246.m23725();
                    switch (cM23725) {
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                        case '.':
                        case '/':
                            c9246.m23723();
                            break;
                        default:
                            switch (cM23725) {
                                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    c9246.m23723();
                                    break;
                                default:
                                    switch (cM23725) {
                                        case '[':
                                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                        case ']':
                                        case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                        case '_':
                                        case '`':
                                            c9246.m23723();
                                            break;
                                        default:
                                            switch (cM23725) {
                                                case '{':
                                                case '|':
                                                case q.h /* 125 */:
                                                case '~':
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            c9246.m23723();
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
                case ']':
                    return true;
                default:
                    c9246.m23723();
                    break;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0097 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m20775(C9246 c9246) {
        char cM23725;
        if (c9246.m23720()) {
            if (c9246.m23726('<')) {
                while (c9246.m23720() && (cM23725 = c9246.m23725()) != '\n' && cM23725 != '<') {
                    if (cM23725 == '>') {
                        c9246.m23723();
                        return true;
                    }
                    if (cM23725 == '\\') {
                        c9246.m23723();
                        char cM23726 = c9246.m23725();
                        switch (cM23726) {
                            case '!':
                            case '\"':
                            case '#':
                            case '$':
                            case '%':
                            case '&':
                            case '\'':
                            case '(':
                            case ')':
                            case '*':
                            case '+':
                            case ',':
                            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                            case '.':
                            case '/':
                                c9246.m23723();
                                break;
                            default:
                                switch (cM23726) {
                                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                        c9246.m23723();
                                        break;
                                    default:
                                        switch (cM23726) {
                                            case '[':
                                            case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                            case ']':
                                            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                            case '_':
                                            case '`':
                                                c9246.m23723();
                                                break;
                                            default:
                                                switch (cM23726) {
                                                    case '{':
                                                    case '|':
                                                    case q.h /* 125 */:
                                                    case '~':
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                c9246.m23723();
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        c9246.m23723();
                    }
                }
            } else {
                boolean z = true;
                int i = 0;
                while (c9246.m23720()) {
                    char cM23727 = c9246.m23725();
                    if (cM23727 != ' ') {
                        if (cM23727 == '\\') {
                            c9246.m23723();
                            char cM23728 = c9246.m23725();
                            switch (cM23728) {
                                default:
                                    switch (cM23728) {
                                        default:
                                            switch (cM23728) {
                                                case '[':
                                                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                case ']':
                                                case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                                case '_':
                                                case '`':
                                                    break;
                                                default:
                                                    switch (cM23728) {
                                                        case '{':
                                                        case '|':
                                                        case q.h /* 125 */:
                                                        case '~':
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    break;
                                            }
                                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                        case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                        case '<':
                                        case '=':
                                        case '>':
                                        case '?':
                                        case '@':
                                            c9246.m23723();
                                            break;
                                    }
                                case '!':
                                case '\"':
                                case '#':
                                case '$':
                                case '%':
                                case '&':
                                case '\'':
                                case '(':
                                case ')':
                                case '*':
                                case '+':
                                case ',':
                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                case '.':
                                case '/':
                                    c9246.m23723();
                                    break;
                            }
                        } else if (cM23727 == '(') {
                            i++;
                            if (i <= 32) {
                                c9246.m23723();
                            }
                        } else if (cM23727 != ')') {
                            if (!Character.isISOControl(cM23727)) {
                                c9246.m23723();
                            }
                        } else {
                            if (i == 0) {
                                return true;
                            }
                            i--;
                            c9246.m23723();
                        }
                        z = false;
                    }
                    return !z;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m20774(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C10881.m27179(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20772(InterfaceC9978 interfaceC9978) {
        StringBuilder sb = new StringBuilder("{");
        int iMo3615 = interfaceC9978.mo3615();
        if (iMo3615 == 1) {
            sb.append(am.aE);
            sb.append(interfaceC9978.mo3614());
        } else if (iMo3615 == 2) {
            sb.append(am.aE);
            sb.append(interfaceC9978.mo3614());
            sb.append(", v");
            sb.append(interfaceC9978.mo3612());
        } else if (iMo3615 == 3) {
            sb.append(am.aE);
            sb.append(interfaceC9978.mo3614());
            sb.append(", v");
            sb.append(interfaceC9978.mo3612());
            sb.append(", v");
            sb.append(interfaceC9978.mo3611());
        } else if (iMo3615 == 4) {
            sb.append(am.aE);
            sb.append(interfaceC9978.mo3614());
            sb.append(", v");
            sb.append(interfaceC9978.mo3612());
            sb.append(", v");
            sb.append(interfaceC9978.mo3611());
            sb.append(", v");
            sb.append(interfaceC9978.mo3613());
        } else if (iMo3615 == 5) {
            sb.append(am.aE);
            sb.append(interfaceC9978.mo3614());
            sb.append(", v");
            sb.append(interfaceC9978.mo3612());
            sb.append(", v");
            sb.append(interfaceC9978.mo3611());
            sb.append(", v");
            sb.append(interfaceC9978.mo3613());
            sb.append(", v");
            sb.append(interfaceC9978.mo3610());
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m20778(C9246 c9246) {
        if (!c9246.m23720()) {
            return false;
        }
        char cM23725 = c9246.m23725();
        char c = '\"';
        if (cM23725 != '\"') {
            c = '\'';
            if (cM23725 != '\'') {
                if (cM23725 != '(') {
                    return false;
                }
                c = ')';
            }
        }
        c9246.m23723();
        if (!m20776(c9246, c) || !c9246.m23720()) {
            return false;
        }
        c9246.m23723();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20773(InterfaceC16595 interfaceC16595) {
        int iMo3615 = interfaceC16595.mo3615();
        if (iMo3615 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{v");
        int iMo9712 = interfaceC16595.mo9712();
        sb.append(iMo9712);
        sb.append(" .. v");
        sb.append((iMo9712 + iMo3615) - 1);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m20776(C9246 c9246, char c) {
        while (c9246.m23720()) {
            char cM23725 = c9246.m23725();
            if (cM23725 == '\\') {
                c9246.m23723();
                char cM23726 = c9246.m23725();
                switch (cM23726) {
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                    case ',':
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case '.':
                    case '/':
                        c9246.m23723();
                        break;
                    default:
                        switch (cM23726) {
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                            case '<':
                            case '=':
                            case '>':
                            case '?':
                            case '@':
                                c9246.m23723();
                                break;
                            default:
                                switch (cM23726) {
                                    case '[':
                                    case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                    case ']':
                                    case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                    case '_':
                                    case '`':
                                        c9246.m23723();
                                        break;
                                    default:
                                        switch (cM23726) {
                                            case '{':
                                            case '|':
                                            case q.h /* 125 */:
                                            case '~':
                                                break;
                                            default:
                                                continue;
                                        }
                                        c9246.m23723();
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                if (cM23725 == c) {
                    return true;
                }
                if (c == ')' && cM23725 == '(') {
                    return false;
                }
                c9246.m23723();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20771(int i) {
        char[] cArr = new char[2];
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[1 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }
}
