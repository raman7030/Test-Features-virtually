package l;

import android.graphics.Paint;
import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: renamed from: l.᩵ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4UF */
/* JADX INFO: loaded from: classes4.dex */
public final class C19287 implements Serializable {
    public static final long serialVersionUID = 12335435;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final int f60675;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f60676;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f60677;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f60678 = true;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f60679;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f60680;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f60681;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f60682;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f60683;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f60684;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f60685;

    static {
        Paint paint = new Paint(1);
        paint.setTextSize(C11266.m27880(12.0f));
        f60675 = Math.max(30, (int) (C11266.f33764.x / paint.measureText("我")));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19287 m44466(int i, int i2) {
        C19287 c19287 = new C19287(10);
        c19287.f60682 = "";
        c19287.f60676 = 0;
        c19287.f60677 = 0;
        c19287.f60684 = i;
        c19287.f60685 = i2;
        return c19287;
    }

    public C19287(int i) {
        this.f60680 = i;
    }

    public final String toString() {
        int i = this.f60680;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder("TYPE_EXACT: ");
                sb.append(m44464());
                sb.append(" (");
                sb.append(this.f60684);
                sb.append(", ");
                return C3200.m9831(this.f60685, MotionUtils.EASING_TYPE_FORMAT_END, sb);
            case 1:
                return "TYPE_SOURCE_FILE: " + m44464();
            case 2:
                return "TYPE_CLASS_ANNOTATION: " + m44464() + " " + this.f60684 + " -> " + this.f60685;
            case 3:
                return "TYPE_METHOD_NAME: " + m44464();
            case 4:
                return "TYPE_METHOD_ANNOTATION: " + m44464() + " " + this.f60681 + MotionUtils.EASING_TYPE_FORMAT_START + this.f60679 + MotionUtils.EASING_TYPE_FORMAT_END + this.f60683 + " -> " + this.f60684 + " -> " + this.f60685;
            case 5:
                return "TYPE_METHOD_INSTRUCTION: " + m44464() + " " + this.f60681 + MotionUtils.EASING_TYPE_FORMAT_START + this.f60679 + MotionUtils.EASING_TYPE_FORMAT_END + this.f60683 + " -> " + this.f60684;
            case 6:
                return "TYPE_METHOD_INSTRUCTION_IN: " + m44464() + " " + this.f60681 + MotionUtils.EASING_TYPE_FORMAT_START + this.f60679 + MotionUtils.EASING_TYPE_FORMAT_END + this.f60683 + " -> " + this.f60684 + " -> " + this.f60685;
            case 7:
                return "TYPE_FIELD_NAME: " + m44464();
            case 8:
                return "TYPE_FIELD_ANNOTATION: " + m44464() + " " + this.f60681 + ":" + this.f60683 + " -> " + this.f60684 + "->" + this.f60685;
            case 9:
                return "TYPE_FIELD_VALUE: " + m44464();
            case 10:
                StringBuilder sb2 = new StringBuilder("TYPE_LINE_COL: ");
                sb2.append(m44464());
                sb2.append(" (");
                sb2.append(this.f60684);
                sb2.append(", ");
                return C3200.m9831(this.f60685, MotionUtils.EASING_TYPE_FORMAT_END, sb2);
            default:
                return C19370.m44628(i, "UNKNOWN_TYPE: ");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m44464() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f60682);
        sb.insert(this.f60676, '[');
        sb.insert(this.f60677 + 1, ']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44469(int i, int i2, String str) {
        int i3 = f60675;
        if (i <= i3 - 5) {
            this.f60676 = i;
            this.f60677 = i2;
            this.f60682 = str;
            return;
        }
        int i4 = i2 - i;
        if (i4 >= i3) {
            str = str.substring(i);
            i = 0;
            i2 = i4;
        } else {
            int i5 = i - (i3 - i4);
            if (i5 > 0) {
                str = str.substring(i5);
                i -= i5;
                i2 -= i5;
            }
        }
        this.f60676 = i + 1;
        this.f60677 = i2 + 1;
        this.f60682 = C20094.m46315("…", str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44473(InterfaceC9272 interfaceC9272, C12164 c12164) {
        if (interfaceC9272.getValue().mo2302() != 23) {
            String str = interfaceC9272.getName() + " = {...";
            String strGroup = c12164.group();
            m44469(str.length(), strGroup.length() + str.length(), C22870.m50967(str, strGroup, "...}"));
            return;
        }
        String value = ((InterfaceC17507) interfaceC9272.getValue()).getValue();
        String strM33622 = C14020.m33622(value);
        String str2 = interfaceC9272.getName() + " = \"";
        int iM9354 = C3058.m9354(c12164.start(), 0, 0, value);
        m44469(str2.length() + iM9354, str2.length() + C3058.m9354(c12164.end(), c12164.start(), iM9354, value), C22870.m50967(str2, strM33622, "\""));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44472(InterfaceC9272 interfaceC9272, InterfaceC10410 interfaceC10410) {
        C11418 c11418 = new C11418();
        try {
            AbstractC11569.m28462(new C3438(new C22706(c11418)), interfaceC10410);
        } catch (IOException unused) {
        }
        String str = interfaceC9272.getName() + " = ";
        int iMo2302 = interfaceC9272.getValue().mo2302();
        if (iMo2302 == 0 || iMo2302 == 6 || iMo2302 == 2 || iMo2302 == 3 || iMo2302 == 4) {
            int length = str.length();
            m44469(length, c11418.length() + length, str.concat(c11418.toString()));
            return;
        }
        String strM37867 = C16014.m37867(str, "{... ");
        int length2 = strM37867.length();
        int length3 = c11418.length() + length2;
        StringBuilder sbM15339 = C5368.m15339(strM37867);
        sbM15339.append(c11418.toString());
        sbM15339.append(" ...}");
        m44469(length2, length3, sbM15339.toString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44471(InterfaceC3627 interfaceC3627, C12164 c12164) {
        if (interfaceC3627.mo11109().mo2302() != 23) {
            String strM23341 = C9045.m23341(new StringBuilder(), m44465(interfaceC3627), "{...");
            String strGroup = c12164.group();
            m44469(strM23341.length(), strGroup.length() + strM23341.length(), C22870.m50967(strM23341, strGroup, "...}"));
            return;
        }
        String value = ((InterfaceC17507) interfaceC3627.mo11109()).getValue();
        String strM33622 = C14020.m33622(value);
        String str = m44465(interfaceC3627) + '\"';
        int iM9354 = C3058.m9354(c12164.start(), 0, 0, value);
        m44469(str.length() + iM9354, str.length() + C3058.m9354(c12164.end(), c12164.start(), iM9354, value), C22870.m50967(str, strM33622, "\""));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44470(InterfaceC3627 interfaceC3627, InterfaceC10410 interfaceC10410) {
        C11418 c11418 = new C11418();
        try {
            AbstractC11569.m28462(new C3438(new C22706(c11418)), interfaceC10410);
        } catch (IOException unused) {
        }
        String strM44465 = m44465(interfaceC3627);
        int iMo2302 = interfaceC3627.mo11109().mo2302();
        if (iMo2302 == 0 || iMo2302 == 6 || iMo2302 == 2 || iMo2302 == 3 || iMo2302 == 4) {
            int length = strM44465.length();
            m44469(length, c11418.length() + length, strM44465.concat(c11418.toString()));
            return;
        }
        String strM37867 = C16014.m37867(strM44465, "{... ");
        int length2 = strM37867.length();
        int length3 = c11418.length() + length2;
        StringBuilder sbM15339 = C5368.m15339(strM37867);
        sbM15339.append(c11418.toString());
        sbM15339.append(" ...}");
        m44469(length2, length3, sbM15339.toString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44475(InterfaceC18444 interfaceC18444, int i, int i2) {
        StringBuilder sbM15339 = C5368.m15339(".method ");
        for (EnumC15657 enumC15657 : EnumC15657.m36858(interfaceC18444.mo3567())) {
            sbM15339.append(enumC15657.toString());
            sbM15339.append(' ');
        }
        int length = sbM15339.length() + i;
        int length2 = sbM15339.length() + i2;
        sbM15339.append(interfaceC18444.getName());
        sbM15339.append(MotionUtils.EASING_TYPE_FORMAT_START);
        AbstractC4628 abstractC4628ListIterator = AbstractC14545.copyOf((Collection) interfaceC18444.getParameters()).listIterator(0);
        while (abstractC4628ListIterator.hasNext()) {
            sbM15339.append(((InterfaceC0098) abstractC4628ListIterator.next()).getType());
        }
        sbM15339.append(MotionUtils.EASING_TYPE_FORMAT_END);
        sbM15339.append(interfaceC18444.mo3568());
        m44469(length, length2, sbM15339.toString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m44465(InterfaceC3627 interfaceC3627) {
        StringBuilder sb = new StringBuilder(".field ");
        for (EnumC15657 enumC15657 : EnumC15657.m36864(interfaceC3627.mo11110())) {
            sb.append(enumC15657.toString());
            sb.append(' ');
        }
        sb.append(interfaceC3627.getName());
        sb.append(':');
        sb.append(interfaceC3627.getType());
        sb.append(" = ");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44468(int i, int i2, CharSequence charSequence) {
        int i3;
        int iMin = Math.min(i - 1, charSequence.length() - 1);
        while (true) {
            if (iMin < 0) {
                i3 = 0;
                break;
            }
            char cCharAt = charSequence.charAt(iMin);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i3 = iMin + 1;
                break;
            }
            iMin--;
        }
        int length = charSequence.length();
        for (int iMax = Math.max(i2, 0); iMax < length; iMax++) {
            char cCharAt2 = charSequence.charAt(iMax);
            if (cCharAt2 == '\n' || cCharAt2 == '\r') {
                length = iMax;
                break;
            }
        }
        while (i3 < i && charSequence.charAt(i3) == ' ') {
            i3++;
        }
        int i4 = f60675;
        if (i2 > length) {
            i2 = length;
        } else if (length - i2 > i4) {
            length = i2 + i4;
        }
        int i5 = i - i3;
        if (i5 > i4 - 5) {
            int i6 = i2 - i;
            int i7 = i6 >= i4 ? i : i - (i4 - i6);
            this.f60676 = (i + 1) - i7;
            this.f60677 = (i2 + 1) - i7;
            this.f60682 = "…" + ((Object) charSequence.subSequence(i7, length));
            return;
        }
        this.f60676 = i5;
        this.f60677 = i2 - i3;
        this.f60682 = charSequence.subSequence(i3, length).toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44474(C12392 c12392) {
        C7744 c7744Mo26556 = c12392.m30436().mo26556();
        try {
            m44467(c12392, c7744Mo26556);
            c7744Mo26556.close();
        } catch (Throwable th) {
            try {
                c7744Mo26556.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01b8  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44467(C12392 c12392, C7744 c7744) {
        int i;
        int i2;
        int iIndexOf;
        int iIndexOf2;
        switch (this.f60680) {
            case 0:
                int i3 = this.f60684;
                int i4 = this.f60685;
                if (i3 <= i4 && i4 <= c12392.m30526()) {
                    String strSubstring = this.f60682.substring(this.f60676, this.f60677);
                    if (!strSubstring.isEmpty() && !strSubstring.equals(c7744.subSequence(this.f60684, this.f60685))) {
                        int i5 = this.f60684;
                        int iM11982 = C3939.m11982(0, i5 + 1, c7744, strSubstring);
                        int iIndexOf3 = TextUtils.indexOf(c7744, strSubstring, i5);
                        if (iM11982 == -1 || (i = i5 - iM11982) > 50) {
                            i = -1;
                        }
                        if (iIndexOf3 == -1 || (i2 = iIndexOf3 - i5) > 50) {
                            i2 = -1;
                        }
                        if (i == -1 || i2 == -1) {
                            if (i == -1) {
                                if (i2 != -1) {
                                    iM11982 = iIndexOf3;
                                } else {
                                    iM11982 = -1;
                                }
                            }
                        } else if (i >= i2) {
                            iM11982 = iIndexOf3;
                        }
                        if (iM11982 != -1) {
                            c12392.mo25922(iM11982, strSubstring.length() + iM11982);
                        } else {
                            c12392.mo25922(this.f60684, this.f60685);
                        }
                    } else {
                        c12392.mo25922(this.f60684, this.f60685);
                    }
                    c12392.m30537();
                    c12392.m30430(false);
                    break;
                }
                break;
            case 1:
                int iIndexOf4 = TextUtils.indexOf(c7744, ".source");
                if (iIndexOf4 != -1 && (iIndexOf = c7744.indexOf('\"', iIndexOf4, c7744.length())) != -1) {
                    int i6 = (this.f60676 + iIndexOf) - 8;
                    c12392.mo25922(i6, (iIndexOf + this.f60677) - 8);
                    c12392.m30537();
                    c12392.m30427(i6, false);
                    break;
                }
                break;
            case 2:
                C20334 c20334M46645 = C20334.m46645(c7744);
                c20334M46645.m46654(c12392);
                c20334M46645.m46651(this.f60684, this.f60685);
                break;
            case 3:
                C21745 c21745M46650 = C20334.m46645(c7744).m46650(this.f60681, this.f60679, this.f60683);
                if (c21745M46650 != null) {
                    int i7 = c21745M46650.f69714;
                    int i8 = this.f60684 + i7;
                    c12392.mo25922(i8, i7 + this.f60685);
                    c12392.m30427(i8, false);
                } else {
                    c12392.mo25919(0);
                    c12392.m30349(0, false);
                }
                c12392.m30537();
                break;
            case 4:
                C20334 c20334M46646 = C20334.m46645(c7744);
                c20334M46646.m46654(c12392);
                c20334M46646.m46653(this.f60681, this.f60684, this.f60679, this.f60683, this.f60685);
                break;
            case 5:
                C20334 c20334M46647 = C20334.m46645(c7744);
                c20334M46647.m46654(c12392);
                c20334M46647.m46655(this.f60681, this.f60684, this.f60679, this.f60683, -1);
                break;
            case 6:
                C20334 c20334M46648 = C20334.m46645(c7744);
                c20334M46648.m46654(c12392);
                c20334M46648.m46655(this.f60681, this.f60684, this.f60679, this.f60683, this.f60685);
                break;
            case 7:
                C21745 c21745M46649 = C20334.m46645(c7744).m46649(this.f60681, this.f60683);
                if (c21745M46649 != null) {
                    int i9 = c21745M46649.f69714;
                    int i10 = this.f60684 + i9;
                    c12392.mo25922(i10, i9 + this.f60685);
                    c12392.m30427(i10, false);
                } else {
                    c12392.mo25919(0);
                    c12392.m30349(0, false);
                }
                c12392.m30537();
                break;
            case 8:
                C20334 c20334M46649 = C20334.m46645(c7744);
                c20334M46649.m46654(c12392);
                c20334M46649.m46652(this.f60681, this.f60684, this.f60685, this.f60683);
                break;
            case 9:
                C21745 c21745M466410 = C20334.m46645(c7744).m46649(this.f60681, this.f60683);
                if (c21745M466410 != null) {
                    int i11 = c21745M466410.f69713;
                    C10456 c10456 = new C10456(i11, c7744.length(), c7744);
                    c10456.m26310();
                    if (c10456.m26313() == '=') {
                        c10456.m26310();
                        int iM26312 = c10456.m26312();
                        int iM26308 = c10456.m26308();
                        if (iM26308 - iM26312 >= 2 && c7744.charAt(iM26312) == '\"' && c7744.charAt(iM26308 - 1) == '\"') {
                            iM26312++;
                            iM26308--;
                        }
                        c12392.mo25922(iM26312, iM26308);
                    } else {
                        c12392.mo25919(i11);
                    }
                    c12392.m30537();
                    c12392.m30427(c12392.m30444(), false);
                }
                break;
            case 10:
                int i12 = 0;
                for (int i13 = 1; i13 < this.f60684 && (iIndexOf2 = c7744.indexOf('\n', i12, c7744.length())) != -1; i13++) {
                    i12 = iIndexOf2 + 1;
                }
                int i14 = i12 + this.f60685;
                c12392.mo25919(i14);
                c12392.m30537();
                c12392.m30349(i14, false);
                break;
        }
    }
}
