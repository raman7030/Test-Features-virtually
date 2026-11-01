package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J63D */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12961 implements InterfaceC5763 {
    /* JADX INFO: renamed from: ֫ */
    public final C23198[] m29718(C23198[] c23198Arr) {
        if (c23198Arr != null) {
            int length = getValue().length();
            boolean z = false;
            for (int i = 0; i < c23198Arr.length; i++) {
                if (!c23198Arr[i].m51680(length)) {
                    c23198Arr[i] = null;
                    z = true;
                }
            }
            if (!z) {
                return c23198Arr;
            }
            C23198[] c23198Arr2 = (C23198[]) C23573.stream(c23198Arr).filter(new C24379(0)).toArray(new C15661(0));
            if (c23198Arr2.length != 0) {
                return c23198Arr2;
            }
        }
        return null;
    }

    @Override // p067l.InterfaceC5763
    /* JADX INFO: renamed from: ܿ֫ */
    public final C23198[] mo12868() {
        return C7104.m16372(mo12358());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InterfaceC5763 interfaceC5763 = (InterfaceC5763) obj;
        return getValue().equals(interfaceC5763.getValue()) && Arrays.equals(getStyle(), interfaceC5763.getStyle());
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

    @Override // p067l.InterfaceC10457
    /* JADX INFO: renamed from: ֫ */
    public final void mo14241(InterfaceC10457 interfaceC10457) {
        InterfaceC5763 interfaceC5763 = (InterfaceC5763) interfaceC10457;
        String value = getValue();
        String value2 = interfaceC5763.getValue();
        if (C12826.equals(value, value2)) {
            String strM29716 = m29716(value, mo12868());
            String strM29717 = m29716(value2, interfaceC5763.mo12868());
            if (!C12826.equals(strM29716, strM29717)) {
                throw new RuntimeException(C24104.m53357(strM29716, " != ", strM29717));
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        C7881 c7881 = C11905.f33150;
        sb.append(c7881.m30298(value));
        sb.append(" != ");
        sb.append(c7881.m30298(value2));
        throw new RuntimeException(sb.toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m29716(String str, C23198[] c23198Arr) {
        if (c23198Arr != null && c23198Arr.length != 0) {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            C23198[] c23198Arr2 = (C23198[]) C23573.stream(c23198Arr).sorted(new C9627(0)).toArray(new C4243());
            for (int i = 0; i <= length; i++) {
                for (C23198 c23198 : c23198Arr2) {
                    int i2 = c23198.f72882;
                    if (i2 == i && i2 == c23198.f72881) {
                        m29717(c23198.f72883, sb, false);
                    }
                }
                for (int length2 = c23198Arr2.length - 1; length2 >= 0; length2--) {
                    C23198 c23199 = c23198Arr2[length2];
                    if (c23199.f72881 == i) {
                        m29717(c23199.f72883, sb, true);
                    }
                }
                for (C23198 c231910 : c23198Arr2) {
                    int i3 = c231910.f72882;
                    if (i3 == i && i3 != c231910.f72881) {
                        m29717(c231910.f72883, sb, false);
                    }
                }
                if (i != length) {
                    sb.append(C11567.m26625(C11567.m26625(String.valueOf(str.charAt(i)), C0233a.f1084p, "&amp;"), "<", "&lt;"));
                }
            }
            return sb.toString();
        }
        return C11567.m26625(C11567.m26625(str, C0233a.f1084p, "&amp;"), "<", "&lt;");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29717(String str, StringBuilder sb, boolean z) {
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
                        sb.append(C11567.m26625(C11567.m26625(strSubstring, C0233a.f1084p, "&amp;"), "<", "&lt;"));
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
