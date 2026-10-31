package l;

import com.alipay.sdk.m.w.a;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J63D */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11145 implements InterfaceC3571 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21916[] m27656(C21916[] c21916Arr) {
        if (c21916Arr != null) {
            int length = getValue().length();
            boolean z = false;
            for (int i = 0; i < c21916Arr.length; i++) {
                if (!c21916Arr[i].m49327(length)) {
                    c21916Arr[i] = null;
                    z = true;
                }
            }
            if (!z) {
                return c21916Arr;
            }
            C21916[] c21916Arr2 = (C21916[]) C22311.stream(c21916Arr).filter(new C23159(0)).toArray(new C13986(0));
            if (c21916Arr2.length != 0) {
                return c21916Arr2;
            }
        }
        return null;
    }

    @Override // l.InterfaceC3571
    /* JADX INFO: renamed from: ܿ֫ */
    public final C21916[] mo10888() {
        return C4982.m14468(mo10320());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InterfaceC3571 interfaceC3571 = (InterfaceC3571) obj;
        return getValue().equals(interfaceC3571.getValue()) && Arrays.equals(getStyle(), interfaceC3571.getStyle());
    }

    public int hashCode() {
        return Arrays.hashCode(getStyle()) + (getValue().hashCode() * 31);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return getValue().length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return getValue().charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return getValue().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return getValue();
    }

    @Override // l.InterfaceC8510
    /* JADX INFO: renamed from: ֫ */
    public final void mo12336(InterfaceC8510 interfaceC8510) {
        InterfaceC3571 interfaceC3571 = (InterfaceC3571) interfaceC8510;
        String value = getValue();
        String value2 = interfaceC3571.getValue();
        if (C11003.equals(value, value2)) {
            String strM27654 = m27654(value, mo10888());
            String strM27655 = m27654(value2, interfaceC3571.mo10888());
            if (!C11003.equals(strM27654, strM27655)) {
                throw new RuntimeException(C22870.m50967(strM27654, " != ", strM27655));
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        C5801 c5801 = C10035.f30192;
        sb.append(c5801.m28254(value));
        sb.append(" != ");
        sb.append(c5801.m28254(value2));
        throw new RuntimeException(sb.toString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m27654(String str, C21916[] c21916Arr) {
        if (c21916Arr != null && c21916Arr.length != 0) {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            C21916[] c21916Arr2 = (C21916[]) C22311.stream(c21916Arr).sorted(new C7637(0)).toArray(new C1972());
            for (int i = 0; i <= length; i++) {
                for (C21916 c21916 : c21916Arr2) {
                    int i2 = c21916.f70168;
                    if (i2 == i && i2 == c21916.f70167) {
                        m27655(c21916.f70169, sb, false);
                    }
                }
                for (int length2 = c21916Arr2.length - 1; length2 >= 0; length2--) {
                    C21916 c21917 = c21916Arr2[length2];
                    if (c21917.f70167 == i) {
                        m27655(c21917.f70169, sb, true);
                    }
                }
                for (C21916 c21918 : c21916Arr2) {
                    int i3 = c21918.f70168;
                    if (i3 == i && i3 != c21918.f70167) {
                        m27655(c21918.f70169, sb, false);
                    }
                }
                if (i != length) {
                    sb.append(C9679.m24611(C9679.m24611(String.valueOf(str.charAt(i)), a.p, "&amp;"), "<", "&lt;"));
                }
            }
            return sb.toString();
        }
        return C9679.m24611(C9679.m24611(str, a.p, "&amp;"), "<", "&lt;");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27655(String str, StringBuilder sb, boolean z) {
        String strSubstring;
        sb.append('<');
        if (z) {
            sb.append('/');
        }
        int iIndexOf = str.indexOf(59);
        if (iIndexOf == -1) {
            sb.append(str);
        } else {
            sb.append((CharSequence) str, 0, iIndexOf);
            if (!z) {
                boolean z2 = true;
                while (z2) {
                    int i = iIndexOf + 1;
                    int iIndexOf2 = str.indexOf(61, i);
                    if (iIndexOf2 != -1) {
                        sb.append(' ');
                        sb.append((CharSequence) str, i, iIndexOf2);
                        sb.append("=\"");
                        int i2 = iIndexOf2 + 1;
                        iIndexOf = str.indexOf(59, i2);
                        if (iIndexOf != -1) {
                            strSubstring = str.substring(i2, iIndexOf);
                        } else {
                            strSubstring = str.substring(i2);
                            z2 = false;
                        }
                        sb.append(C9679.m24611(C9679.m24611(strSubstring, a.p, "&amp;"), "<", "&lt;"));
                        sb.append('\"');
                    } else {
                        z2 = false;
                    }
                }
            }
        }
        sb.append('>');
    }
}
