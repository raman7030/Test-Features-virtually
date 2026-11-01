package p067l;

import com.umeng.analytics.pro.C0708d;
import java.util.Stack;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֡᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37JR */
/* JADX INFO: loaded from: classes2.dex */
public final class C3002 {

    /* JADX INFO: renamed from: ֫ */
    public final String f5350;

    public C3002(String str, C21545 c21545) {
        this.f5350 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ֫ */
    public final String m5052(String str) throws C20807 {
        int i;
        int i2;
        C3002 c3002 = this;
        StringBuilder sb = new StringBuilder();
        Stack stack = new Stack();
        int i3 = 0;
        int i4 = 1;
        stack.push(new C21109(null, 0, true, false));
        int i5 = 0;
        int i6 = 0;
        C3002 c3003 = c3002;
        while (true) {
            int length = str.length();
            String str2 = c3003.f5350;
            if (i5 > length) {
                if (stack.size() != 1) {
                    C21109 c21109 = (C21109) stack.peek();
                    throw new C5962(str2, c21109.f66354, 0, C10965.m25286(new StringBuilder("Unclosed #"), c21109.f66353, " block"));
                }
                if (!str.endsWith("\n") && sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                return sb.toString();
            }
            int iIndexOf = str.indexOf(10, i5);
            if (iIndexOf < 0) {
                iIndexOf = str.length();
            }
            String strSubstring = str.substring(i5, iIndexOf);
            int i7 = i4 + iIndexOf;
            int iM46559 = C20597.m46559(i3, strSubstring);
            boolean z = iM46559 < strSubstring.length() && strSubstring.charAt(iM46559) == '#';
            int i8 = iM46559 + 1;
            int i9 = i8;
            if (z) {
                while (i9 < strSubstring.length() && strSubstring.charAt(i9) >= 'a' && strSubstring.charAt(i9) <= 'z') {
                    i9++;
                }
            }
            String strSubstring2 = z ? strSubstring.substring(i8, i9) : "";
            C3002 c3004 = c3003;
            boolean z2 = z;
            if (strSubstring2.equals("if") || strSubstring2.equals("elif") || strSubstring2.equals("else") || strSubstring2.equals("endif") || strSubstring2.equals(C0708d.f2599O)) {
                if (i9 == strSubstring.length()) {
                    i2 = i8;
                } else {
                    int iM465510 = C20597.m46559(i9, strSubstring);
                    if (iM465510 > i9) {
                        i2 = i8;
                        while (iM465510 < strSubstring.length() && !C20597.m46553(strSubstring.charAt(iM465510))) {
                            iM465510++;
                        }
                        if (iM465510 != strSubstring.length()) {
                            i = i2;
                        }
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c3002 = this;
                        i5 = i7;
                        c3003 = c3004;
                    } else {
                        i = i8;
                    }
                    c3004 = this;
                }
                String strSubstring3 = strSubstring.substring(0, iM46559);
                String strSubstring4 = strSubstring.substring(i9);
                switch (strSubstring2) {
                    case "if":
                        this = this;
                        boolean zM5051 = this.m5051(strSubstring4.trim(), i6, i9, strSubstring2);
                        stack.push(new C21109(strSubstring2, i6 + 1, ((C21109) stack.peek()).f66355 && zM5051, zM5051));
                        sb.append(strSubstring3);
                        sb.append("//#if");
                        sb.append(strSubstring4);
                        sb.append("\n");
                        c3004 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c3002 = this;
                        i5 = i7;
                        c3003 = c3004;
                        break;
                    case "elif":
                        int i10 = i2;
                        if (stack.size() <= 1) {
                            throw new C5962(str2, i6 + 1, i10, "Unexpected #elif");
                        }
                        C21109 c211010 = (C21109) stack.pop();
                        C21109 c211011 = (C21109) stack.peek();
                        this = this;
                        boolean zM5052 = this.m5051(strSubstring4.trim(), i6, i9, strSubstring2);
                        stack.push(new C21109(strSubstring2, i6 + 1, c211011.f66355 && !c211010.f66352 && zM5052, c211010.f66352 || zM5052));
                        sb.append(strSubstring3);
                        sb.append("//#elif");
                        sb.append(strSubstring4);
                        sb.append("\n");
                        c3004 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c3002 = this;
                        i5 = i7;
                        c3003 = c3004;
                        break;
                        break;
                    case "else":
                        int i11 = i2;
                        if (stack.size() <= 1) {
                            throw new C5962(str2, i6 + 1, i11, "Unexpected #else");
                        }
                        if (!strSubstring4.trim().isEmpty()) {
                            throw new C5962(str2, i6 + 1, i9, "Unexpected content after #else");
                        }
                        stack.push(new C21109(strSubstring2, i6 + 1, ((C21109) stack.peek()).f66355 && !((C21109) stack.pop()).f66352, true));
                        sb.append(strSubstring3);
                        sb.append("//#else\n");
                        this = this;
                        c3004 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c3002 = this;
                        i5 = i7;
                        c3003 = c3004;
                        break;
                        break;
                    case "endif":
                        if (stack.size() <= 1) {
                            throw new C5962(str2, i6 + 1, i2, "Unexpected #endif");
                        }
                        if (!strSubstring4.trim().isEmpty()) {
                            throw new C5962(str2, i6 + 1, i9, "Unexpected content after #endif");
                        }
                        stack.pop();
                        sb.append(strSubstring3);
                        sb.append("//#endif\n");
                        this = this;
                        c3004 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c3002 = this;
                        i5 = i7;
                        c3003 = c3004;
                        break;
                        break;
                    case "error":
                        if (!((C21109) stack.peek()).f66355) {
                            ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, strSubstring3, "//#error", strSubstring4, "\n");
                            this = this;
                            c3004 = this;
                            i6++;
                            i3 = 0;
                            i4 = 1;
                            c3002 = this;
                            i5 = i7;
                            c3003 = c3004;
                            break;
                        } else {
                            String strTrim = strSubstring4.trim();
                            if (strTrim.isEmpty()) {
                                strTrim = "#error";
                            }
                            throw new C20807(strTrim);
                        }
                        break;
                    default:
                        this = this;
                        c3004 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c3002 = this;
                        i5 = i7;
                        c3003 = c3004;
                        break;
                }
            } else {
                this = c3002;
                i = i8;
            }
            if (z2) {
                int i12 = i6 + 1;
                int i13 = i;
                while (i13 < strSubstring.length() && !C20597.m46553(strSubstring.charAt(i13))) {
                    i13++;
                }
                throw new C5962(str2, i12, iM46559, C21466.m48631("Unknown directive: #", strSubstring.substring(i, i13)));
            }
            if (((C21109) stack.peek()).f66355) {
                sb.append(strSubstring);
                sb.append("\n");
            } else {
                C21545.m48729(sb, "//", strSubstring, "\n");
            }
            i6++;
            i3 = 0;
            i4 = 1;
            c3002 = this;
            i5 = i7;
            c3003 = c3004;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m5051(String str, int i, int i2, String str2) {
        String strConcat;
        char cCharAt;
        int iM46559 = str.startsWith("MT") ? C20597.m46559(2, str) : 0;
        int i3 = iM46559;
        while (i3 < str.length() && ((cCharAt = str.charAt(i3)) == '>' || cCharAt == '<' || cCharAt == '=' || cCharAt == '!')) {
            i3++;
        }
        int iM465510 = C20597.m46559(i3, str);
        if (iM46559 <= 2 || i3 <= iM46559 || iM465510 <= i3 || C20597.m46560(iM465510, str) != str.length()) {
            int i4 = i + 1;
            if (str.isEmpty()) {
                strConcat = "Missing condition after #".concat(str2);
            } else {
                strConcat = "Invalid condition: ".concat(str);
            }
            throw new C5962(this.f5350, i4, i2, strConcat);
        }
        return C20597.m46555(str.substring(iM46559, i3), str.substring(iM465510));
    }
}
