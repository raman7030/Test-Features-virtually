package p067l;

import android.graphics.Paint;
import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: renamed from: l.᩵ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4UF */
/* JADX INFO: loaded from: classes4.dex */
public final class C20699 implements Serializable {
    public static final long serialVersionUID = 12335435;

    /* JADX INFO: renamed from: ᩺ */
    public static final int f63905;

    /* JADX INFO: renamed from: ۗ */
    public int f63906;

    /* JADX INFO: renamed from: ۙ */
    public int f63907;

    /* JADX INFO: renamed from: ۛ */
    public boolean f63908 = true;

    /* JADX INFO: renamed from: ۤ */
    public String f63909;

    /* JADX INFO: renamed from: ۨ */
    public int f63910;

    /* JADX INFO: renamed from: ۫ */
    public String f63911;

    /* JADX INFO: renamed from: ۬ */
    public String f63912;

    /* JADX INFO: renamed from: ᩶ */
    public String f63913;

    /* JADX INFO: renamed from: ᩸ */
    public int f63914;

    /* JADX INFO: renamed from: ᩹ */
    public int f63915;

    static {
        Paint paint = new Paint(1);
        paint.setTextSize(C13076.m29941(12.0f));
        f63905 = Math.max(30, (int) (C13076.f36764.x / paint.measureText("我")));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20699 m46760(int i, int i2) {
        C20699 c20699 = new C20699(10);
        c20699.f63912 = "";
        c20699.f63906 = 0;
        c20699.f63907 = 0;
        c20699.f63914 = i;
        c20699.f63915 = i2;
        return c20699;
    }

    public C20699(int i) {
        this.f63910 = i;
    }

    public final String toString() {
        int i = this.f63910;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder("TYPE_EXACT: ");
                sb.append(m46758());
                sb.append(" (");
                sb.append(this.f63914);
                sb.append(", ");
                return C5410.m11876(this.f63915, MotionUtils.EASING_TYPE_FORMAT_END, sb);
            case 1:
                return "TYPE_SOURCE_FILE: " + m46758();
            case 2:
                return "TYPE_CLASS_ANNOTATION: " + m46758() + " " + this.f63914 + " -> " + this.f63915;
            case 3:
                return "TYPE_METHOD_NAME: " + m46758();
            case 4:
                return "TYPE_METHOD_ANNOTATION: " + m46758() + " " + this.f63911 + MotionUtils.EASING_TYPE_FORMAT_START + this.f63909 + MotionUtils.EASING_TYPE_FORMAT_END + this.f63913 + " -> " + this.f63914 + " -> " + this.f63915;
            case 5:
                return "TYPE_METHOD_INSTRUCTION: " + m46758() + " " + this.f63911 + MotionUtils.EASING_TYPE_FORMAT_START + this.f63909 + MotionUtils.EASING_TYPE_FORMAT_END + this.f63913 + " -> " + this.f63914;
            case 6:
                return "TYPE_METHOD_INSTRUCTION_IN: " + m46758() + " " + this.f63911 + MotionUtils.EASING_TYPE_FORMAT_START + this.f63909 + MotionUtils.EASING_TYPE_FORMAT_END + this.f63913 + " -> " + this.f63914 + " -> " + this.f63915;
            case 7:
                return "TYPE_FIELD_NAME: " + m46758();
            case 8:
                return "TYPE_FIELD_ANNOTATION: " + m46758() + " " + this.f63911 + ":" + this.f63913 + " -> " + this.f63914 + "->" + this.f63915;
            case 9:
                return "TYPE_FIELD_VALUE: " + m46758();
            case 10:
                StringBuilder sb2 = new StringBuilder("TYPE_LINE_COL: ");
                sb2.append(m46758());
                sb2.append(" (");
                sb2.append(this.f63914);
                sb2.append(", ");
                return C5410.m11876(this.f63915, MotionUtils.EASING_TYPE_FORMAT_END, sb2);
            default:
                return C20778.m46922(i, "UNKNOWN_TYPE: ");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private String m46758() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f63912);
        sb.insert(this.f63906, '[');
        sb.insert(this.f63907 + 1, ']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46763(int i, int i2, String str) {
        int i3 = f63905;
        if (i <= i3 - 5) {
            this.f63906 = i;
            this.f63907 = i2;
            this.f63912 = str;
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
        this.f63906 = i + 1;
        this.f63907 = i2 + 1;
        this.f63912 = C21466.m48631("…", str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46767(InterfaceC11180 interfaceC11180, C13929 c13929) {
        if (interfaceC11180.getValue().mo4670() != 23) {
            String str = interfaceC11180.getName() + " = {...";
            String strGroup = c13929.group();
            m46763(str.length(), strGroup.length() + str.length(), C24104.m53357(str, strGroup, "...}"));
            return;
        }
        String value = ((InterfaceC19007) interfaceC11180.getValue()).getValue();
        String strM35742 = C15693.m35742(value);
        String str2 = interfaceC11180.getName() + " = \"";
        int iM11396 = C5275.m11396(c13929.start(), 0, 0, value);
        m46763(str2.length() + iM11396, str2.length() + C5275.m11396(c13929.end(), c13929.start(), iM11396, value), C24104.m53357(str2, strM35742, "\""));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46766(InterfaceC11180 interfaceC11180, InterfaceC12262 interfaceC12262) {
        C13220 c13220 = new C13220();
        try {
            AbstractC13363.m30508(new C5636(new C23948(c13220)), interfaceC12262);
        } catch (IOException unused) {
        }
        String str = interfaceC11180.getName() + " = ";
        int iMo4670 = interfaceC11180.getValue().mo4670();
        if (iMo4670 == 0 || iMo4670 == 6 || iMo4670 == 2 || iMo4670 == 3 || iMo4670 == 4) {
            int length = str.length();
            m46763(length, c13220.length() + length, str.concat(c13220.toString()));
            return;
        }
        String strM40053 = C17588.m40053(str, "{... ");
        int length2 = strM40053.length();
        int length3 = c13220.length() + length2;
        StringBuilder sbM17248 = C7470.m17248(strM40053);
        sbM17248.append(c13220.toString());
        sbM17248.append(" ...}");
        m46763(length2, length3, sbM17248.toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46765(InterfaceC5815 interfaceC5815, C13929 c13929) {
        if (interfaceC5815.mo13085().mo4670() != 23) {
            String strM25286 = C10965.m25286(new StringBuilder(), m46759(interfaceC5815), "{...");
            String strGroup = c13929.group();
            m46763(strM25286.length(), strGroup.length() + strM25286.length(), C24104.m53357(strM25286, strGroup, "...}"));
            return;
        }
        String value = ((InterfaceC19007) interfaceC5815.mo13085()).getValue();
        String strM35742 = C15693.m35742(value);
        String str = m46759(interfaceC5815) + '\"';
        int iM11396 = C5275.m11396(c13929.start(), 0, 0, value);
        m46763(str.length() + iM11396, str.length() + C5275.m11396(c13929.end(), c13929.start(), iM11396, value), C24104.m53357(str, strM35742, "\""));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46764(InterfaceC5815 interfaceC5815, InterfaceC12262 interfaceC12262) {
        C13220 c13220 = new C13220();
        try {
            AbstractC13363.m30508(new C5636(new C23948(c13220)), interfaceC12262);
        } catch (IOException unused) {
        }
        String strM46759 = m46759(interfaceC5815);
        int iMo4670 = interfaceC5815.mo13085().mo4670();
        if (iMo4670 == 0 || iMo4670 == 6 || iMo4670 == 2 || iMo4670 == 3 || iMo4670 == 4) {
            int length = strM46759.length();
            m46763(length, c13220.length() + length, strM46759.concat(c13220.toString()));
            return;
        }
        String strM40053 = C17588.m40053(strM46759, "{... ");
        int length2 = strM40053.length();
        int length3 = c13220.length() + length2;
        StringBuilder sbM17248 = C7470.m17248(strM40053);
        sbM17248.append(c13220.toString());
        sbM17248.append(" ...}");
        m46763(length2, length3, sbM17248.toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46769(InterfaceC19897 interfaceC19897, int i, int i2) {
        StringBuilder sbM17248 = C7470.m17248(".method ");
        for (EnumC17248 enumC17248 : EnumC17248.m39024(interfaceC19897.mo5854())) {
            sbM17248.append(enumC17248.toString());
            sbM17248.append(' ');
        }
        int length = sbM17248.length() + i;
        int length2 = sbM17248.length() + i2;
        sbM17248.append(interfaceC19897.getName());
        sbM17248.append(MotionUtils.EASING_TYPE_FORMAT_START);
        AbstractC6767 abstractC6767ListIterator = AbstractC16192.copyOf((Collection) interfaceC19897.getParameters()).listIterator(0);
        while (abstractC6767ListIterator.hasNext()) {
            sbM17248.append(((InterfaceC2461) abstractC6767ListIterator.next()).getType());
        }
        sbM17248.append(MotionUtils.EASING_TYPE_FORMAT_END);
        sbM17248.append(interfaceC19897.mo5855());
        m46763(length, length2, sbM17248.toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m46759(InterfaceC5815 interfaceC5815) {
        StringBuilder sb = new StringBuilder(".field ");
        for (EnumC17248 enumC17248 : EnumC17248.m39030(interfaceC5815.mo13086())) {
            sb.append(enumC17248.toString());
            sb.append(' ');
        }
        sb.append(interfaceC5815.getName());
        sb.append(':');
        sb.append(interfaceC5815.getType());
        sb.append(" = ");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46762(int i, int i2, CharSequence charSequence) {
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
        int i4 = f63905;
        if (i2 > length) {
            i2 = length;
        } else if (length - i2 > i4) {
            length = i2 + i4;
        }
        int i5 = i - i3;
        if (i5 > i4 - 5) {
            int i6 = i2 - i;
            int i7 = i6 >= i4 ? i : i - (i4 - i6);
            this.f63906 = (i + 1) - i7;
            this.f63907 = (i2 + 1) - i7;
            this.f63912 = "…" + ((Object) charSequence.subSequence(i7, length));
            return;
        }
        this.f63906 = i5;
        this.f63907 = i2 - i3;
        this.f63912 = charSequence.subSequence(i3, length).toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46768(C14146 c14146) {
        C9729 c9729Mo28589 = c14146.m32500().mo28589();
        try {
            m46761(c14146, c9729Mo28589);
            c9729Mo28589.close();
        } catch (Throwable th) {
            try {
                c9729Mo28589.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01b8  */
    /* JADX INFO: renamed from: ֫ */
    private void m46761(C14146 c14146, C9729 c9729) {
        int i;
        int i2;
        int iIndexOf;
        int iIndexOf2;
        switch (this.f63910) {
            case 0:
                int i3 = this.f63914;
                int i4 = this.f63915;
                if (i3 <= i4 && i4 <= c14146.m32590()) {
                    String strSubstring = this.f63912.substring(this.f63906, this.f63907);
                    if (!strSubstring.isEmpty() && !strSubstring.equals(c9729.subSequence(this.f63914, this.f63915))) {
                        int i5 = this.f63914;
                        int iM13902 = C6112.m13902(0, i5 + 1, c9729, strSubstring);
                        int iIndexOf3 = TextUtils.indexOf(c9729, strSubstring, i5);
                        if (iM13902 == -1 || (i = i5 - iM13902) > 50) {
                            i = -1;
                        }
                        if (iIndexOf3 == -1 || (i2 = iIndexOf3 - i5) > 50) {
                            i2 = -1;
                        }
                        if (i == -1 || i2 == -1) {
                            if (i == -1) {
                                if (i2 != -1) {
                                    iM13902 = iIndexOf3;
                                } else {
                                    iM13902 = -1;
                                }
                            }
                        } else if (i >= i2) {
                            iM13902 = iIndexOf3;
                        }
                        if (iM13902 != -1) {
                            c14146.mo27944(iM13902, strSubstring.length() + iM13902);
                        } else {
                            c14146.mo27944(this.f63914, this.f63915);
                        }
                    } else {
                        c14146.mo27944(this.f63914, this.f63915);
                    }
                    c14146.m32601();
                    c14146.m32494(false);
                    break;
                }
                break;
            case 1:
                int iIndexOf4 = TextUtils.indexOf(c9729, ".source");
                if (iIndexOf4 != -1 && (iIndexOf = c9729.indexOf('\"', iIndexOf4, c9729.length())) != -1) {
                    int i6 = (this.f63906 + iIndexOf) - 8;
                    c14146.mo27944(i6, (iIndexOf + this.f63907) - 8);
                    c14146.m32601();
                    c14146.m32491(i6, false);
                    break;
                }
                break;
            case 2:
                C21694 c21694M48968 = C21694.m48968(c9729);
                c21694M48968.m48977(c14146);
                c21694M48968.m48974(this.f63914, this.f63915);
                break;
            case 3:
                C23035 c23035M48973 = C21694.m48968(c9729).m48973(this.f63911, this.f63909, this.f63913);
                if (c23035M48973 != null) {
                    int i7 = c23035M48973.f72421;
                    int i8 = this.f63914 + i7;
                    c14146.mo27944(i8, i7 + this.f63915);
                    c14146.m32491(i8, false);
                } else {
                    c14146.mo27941(0);
                    c14146.m32413(0, false);
                }
                c14146.m32601();
                break;
            case 4:
                C21694 c21694M48969 = C21694.m48968(c9729);
                c21694M48969.m48977(c14146);
                c21694M48969.m48976(this.f63911, this.f63914, this.f63909, this.f63913, this.f63915);
                break;
            case 5:
                C21694 c21694M489610 = C21694.m48968(c9729);
                c21694M489610.m48977(c14146);
                c21694M489610.m48978(this.f63911, this.f63914, this.f63909, this.f63913, -1);
                break;
            case 6:
                C21694 c21694M489611 = C21694.m48968(c9729);
                c21694M489611.m48977(c14146);
                c21694M489611.m48978(this.f63911, this.f63914, this.f63909, this.f63913, this.f63915);
                break;
            case 7:
                C23035 c23035M48972 = C21694.m48968(c9729).m48972(this.f63911, this.f63913);
                if (c23035M48972 != null) {
                    int i9 = c23035M48972.f72421;
                    int i10 = this.f63914 + i9;
                    c14146.mo27944(i10, i9 + this.f63915);
                    c14146.m32491(i10, false);
                } else {
                    c14146.mo27941(0);
                    c14146.m32413(0, false);
                }
                c14146.m32601();
                break;
            case 8:
                C21694 c21694M489612 = C21694.m48968(c9729);
                c21694M489612.m48977(c14146);
                c21694M489612.m48975(this.f63911, this.f63914, this.f63915, this.f63913);
                break;
            case 9:
                C23035 c23035M48974 = C21694.m48968(c9729).m48972(this.f63911, this.f63913);
                if (c23035M48974 != null) {
                    int i11 = c23035M48974.f72420;
                    C12306 c12306 = new C12306(i11, c9729.length(), c9729);
                    c12306.m28340();
                    if (c12306.m28343() == '=') {
                        c12306.m28340();
                        int iM28342 = c12306.m28342();
                        int iM28338 = c12306.m28338();
                        if (iM28338 - iM28342 >= 2 && c9729.charAt(iM28342) == '\"' && c9729.charAt(iM28338 - 1) == '\"') {
                            iM28342++;
                            iM28338--;
                        }
                        c14146.mo27944(iM28342, iM28338);
                    } else {
                        c14146.mo27941(i11);
                    }
                    c14146.m32601();
                    c14146.m32491(c14146.m32508(), false);
                }
                break;
            case 10:
                int i12 = 0;
                for (int i13 = 1; i13 < this.f63914 && (iIndexOf2 = c9729.indexOf('\n', i12, c9729.length())) != -1; i13++) {
                    i12 = iIndexOf2 + 1;
                }
                int i14 = i12 + this.f63915;
                c14146.mo27941(i14);
                c14146.m32601();
                c14146.m32413(i14, false);
                break;
        }
    }
}
