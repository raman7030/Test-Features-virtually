package l;

/* JADX INFO: renamed from: l.֡ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWL */
/* JADX INFO: loaded from: classes2.dex */
public final class C0169 implements InterfaceC19221 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f1386;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f1387;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f1388;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC19221 interfaceC19221 = (InterfaceC19221) obj;
        if (interfaceC19221 instanceof C5109) {
            return 1;
        }
        if (interfaceC19221 instanceof C0169) {
            return -this.f1387.compareTo(((C0169) interfaceC19221).f1387);
        }
        throw new RuntimeException();
    }

    public C0169(String str, boolean z, boolean z2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f1387 = str;
        this.f1386 = z;
        this.f1388 = z2;
    }

    @Override // l.InterfaceC19221
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo1301(InterfaceC7785 interfaceC7785, int i, int i2) {
        C18515.m43032(i, i2, interfaceC7785);
        int iM43034 = C18515.m43034(i, i2, interfaceC7785);
        if (iM43034 == i2) {
            return true;
        }
        int i3 = i2 - iM43034;
        String str = this.f1387;
        if (i3 < str.length()) {
            return false;
        }
        String string = interfaceC7785.subSequence(iM43034, str.length() + iM43034).toString();
        if (this.f1388) {
            return string.equalsIgnoreCase(str);
        }
        return string.equals(str);
    }

    @Override // l.InterfaceC19221
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo1302(C21856 c21856, int i, int i2, int[] iArr) {
        C18515.m43032(i, i2, c21856);
        int iM43034 = C18515.m43034(i, i2, c21856);
        if (iM43034 == i2) {
            return 0;
        }
        boolean z = this.f1386;
        String strM37867 = this.f1387;
        if (z) {
            strM37867 = C16014.m37867(strM37867, " ");
        }
        c21856.m49243(iM43034, 0, strM37867.length(), strM37867);
        int length = strM37867.length();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            if (i4 >= iM43034) {
                iArr[i3] = i4 + length;
            }
        }
        return length;
    }

    @Override // l.InterfaceC19221
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo1300(C21856 c21856, int i, int i2, int[] iArr) {
        C18515.m43032(i, i2, c21856);
        int iM43034 = C18515.m43034(i, i2, c21856);
        String str = this.f1387;
        int length = str.length() + iM43034;
        if (length <= i2) {
            String string = c21856.subSequence(iM43034, length).toString();
            if (!this.f1388 ? string.equals(str) : string.equalsIgnoreCase(str)) {
                if (length != i2 && c21856.charAt(length) == ' ') {
                    length++;
                }
                c21856.delete(iM43034, length);
                int i3 = length - iM43034;
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    int i5 = iArr[i4];
                    if (i5 > iM43034) {
                        iArr[i4] = i5 - Math.min(i3, i5 - iM43034);
                    }
                }
                return i3;
            }
        }
        return 0;
    }

    public final String toString() {
        return "{start='" + this.f1387 + "', insertSpace=" + this.f1386 + '}';
    }
}
