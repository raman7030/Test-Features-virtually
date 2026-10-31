package l;

import com.umeng.analytics.pro.d;
import java.util.Stack;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֡᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37JR */
/* JADX INFO: loaded from: classes2.dex */
public final class C0666 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f2577;

    public C0666(String str, C20177 c20177) {
        this.f2577 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m2713(String str) throws C19401 {
        int i;
        int i2;
        C0666 c0666 = this;
        StringBuilder sb = new StringBuilder();
        Stack stack = new Stack();
        int i3 = 0;
        int i4 = 1;
        stack.push(new C19718(null, 0, true, false));
        int i5 = 0;
        int i6 = 0;
        C0666 c0667 = c0666;
        while (true) {
            int length = str.length();
            String str2 = c0667.f2577;
            if (i5 > length) {
                if (stack.size() != 1) {
                    C19718 c19718 = (C19718) stack.peek();
                    throw new C3781(str2, c19718.f63723, 0, C9045.m23341(new StringBuilder("Unclosed #"), c19718.f63722, " block"));
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
            int iM44264 = C19180.m44264(i3, strSubstring);
            boolean z = iM44264 < strSubstring.length() && strSubstring.charAt(iM44264) == '#';
            int i8 = iM44264 + 1;
            int i9 = i8;
            if (z) {
                while (i9 < strSubstring.length() && strSubstring.charAt(i9) >= 'a' && strSubstring.charAt(i9) <= 'z') {
                    i9++;
                }
            }
            String strSubstring2 = z ? strSubstring.substring(i8, i9) : "";
            C0666 c0668 = c0667;
            boolean z2 = z;
            if (strSubstring2.equals("if") || strSubstring2.equals("elif") || strSubstring2.equals("else") || strSubstring2.equals("endif") || strSubstring2.equals(d.O)) {
                if (i9 == strSubstring.length()) {
                    i2 = i8;
                } else {
                    int iM44265 = C19180.m44264(i9, strSubstring);
                    if (iM44265 > i9) {
                        i2 = i8;
                        while (iM44265 < strSubstring.length() && !C19180.m44258(strSubstring.charAt(iM44265))) {
                            iM44265++;
                        }
                        if (iM44265 != strSubstring.length()) {
                            i = i2;
                        }
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c0666 = this;
                        i5 = i7;
                        c0667 = c0668;
                    } else {
                        i = i8;
                    }
                    c0668 = this;
                }
                String strSubstring3 = strSubstring.substring(0, iM44264);
                String strSubstring4 = strSubstring.substring(i9);
                switch (strSubstring2) {
                    case "if":
                        this = this;
                        boolean zM2712 = this.m2712(strSubstring4.trim(), i6, i9, strSubstring2);
                        stack.push(new C19718(strSubstring2, i6 + 1, ((C19718) stack.peek()).f63724 && zM2712, zM2712));
                        sb.append(strSubstring3);
                        sb.append("//#if");
                        sb.append(strSubstring4);
                        sb.append("\n");
                        c0668 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c0666 = this;
                        i5 = i7;
                        c0667 = c0668;
                        break;
                    case "elif":
                        int i10 = i2;
                        if (stack.size() <= 1) {
                            throw new C3781(str2, i6 + 1, i10, "Unexpected #elif");
                        }
                        C19718 c19719 = (C19718) stack.pop();
                        C19718 c197110 = (C19718) stack.peek();
                        this = this;
                        boolean zM2713 = this.m2712(strSubstring4.trim(), i6, i9, strSubstring2);
                        stack.push(new C19718(strSubstring2, i6 + 1, c197110.f63724 && !c19719.f63721 && zM2713, c19719.f63721 || zM2713));
                        sb.append(strSubstring3);
                        sb.append("//#elif");
                        sb.append(strSubstring4);
                        sb.append("\n");
                        c0668 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c0666 = this;
                        i5 = i7;
                        c0667 = c0668;
                        break;
                        break;
                    case "else":
                        int i11 = i2;
                        if (stack.size() <= 1) {
                            throw new C3781(str2, i6 + 1, i11, "Unexpected #else");
                        }
                        if (!strSubstring4.trim().isEmpty()) {
                            throw new C3781(str2, i6 + 1, i9, "Unexpected content after #else");
                        }
                        stack.push(new C19718(strSubstring2, i6 + 1, ((C19718) stack.peek()).f63724 && !((C19718) stack.pop()).f63721, true));
                        sb.append(strSubstring3);
                        sb.append("//#else\n");
                        this = this;
                        c0668 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c0666 = this;
                        i5 = i7;
                        c0667 = c0668;
                        break;
                        break;
                    case "endif":
                        if (stack.size() <= 1) {
                            throw new C3781(str2, i6 + 1, i2, "Unexpected #endif");
                        }
                        if (!strSubstring4.trim().isEmpty()) {
                            throw new C3781(str2, i6 + 1, i9, "Unexpected content after #endif");
                        }
                        stack.pop();
                        sb.append(strSubstring3);
                        sb.append("//#endif\n");
                        this = this;
                        c0668 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c0666 = this;
                        i5 = i7;
                        c0667 = c0668;
                        break;
                        break;
                    case "error":
                        if (!((C19718) stack.peek()).f63724) {
                            ASN1BMPString$$ExternalSyntheticOutline0.m(sb, strSubstring3, "//#error", strSubstring4, "\n");
                            this = this;
                            c0668 = this;
                            i6++;
                            i3 = 0;
                            i4 = 1;
                            c0666 = this;
                            i5 = i7;
                            c0667 = c0668;
                            break;
                        } else {
                            String strTrim = strSubstring4.trim();
                            if (strTrim.isEmpty()) {
                                strTrim = "#error";
                            }
                            throw new C19401(strTrim);
                        }
                        break;
                    default:
                        this = this;
                        c0668 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c0666 = this;
                        i5 = i7;
                        c0667 = c0668;
                        break;
                }
            } else {
                this = c0666;
                i = i8;
            }
            if (z2) {
                int i12 = i6 + 1;
                int i13 = i;
                while (i13 < strSubstring.length() && !C19180.m44258(strSubstring.charAt(i13))) {
                    i13++;
                }
                throw new C3781(str2, i12, iM44264, C20094.m46315("Unknown directive: #", strSubstring.substring(i, i13)));
            }
            if (((C19718) stack.peek()).f63724) {
                sb.append(strSubstring);
                sb.append("\n");
            } else {
                C20177.m46410(sb, "//", strSubstring, "\n");
            }
            i6++;
            i3 = 0;
            i4 = 1;
            c0666 = this;
            i5 = i7;
            c0667 = c0668;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m2712(String str, int i, int i2, String str2) {
        String strConcat;
        char cCharAt;
        int iM44264 = str.startsWith("MT") ? C19180.m44264(2, str) : 0;
        int i3 = iM44264;
        while (i3 < str.length() && ((cCharAt = str.charAt(i3)) == '>' || cCharAt == '<' || cCharAt == '=' || cCharAt == '!')) {
            i3++;
        }
        int iM44265 = C19180.m44264(i3, str);
        if (iM44264 <= 2 || i3 <= iM44264 || iM44265 <= i3 || C19180.m44265(iM44265, str) != str.length()) {
            int i4 = i + 1;
            if (str.isEmpty()) {
                strConcat = "Missing condition after #".concat(str2);
            } else {
                strConcat = "Invalid condition: ".concat(str);
            }
            throw new C3781(this.f2577, i4, i2, strConcat);
        }
        return C19180.m44260(str.substring(iM44264, i3), str.substring(iM44265));
    }
}
