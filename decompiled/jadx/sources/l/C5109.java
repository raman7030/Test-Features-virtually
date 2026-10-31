package l;

/* JADX INFO: renamed from: l.ۚۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AWM */
/* JADX INFO: loaded from: classes3.dex */
public final class C5109 implements InterfaceC19221 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f16018;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f16019;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f16020;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f16021;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC19221 interfaceC19221 = (InterfaceC19221) obj;
        if (interfaceC19221 instanceof C0169) {
            return 1;
        }
        if (interfaceC19221 instanceof C5109) {
            C5109 c5109 = (C5109) interfaceC19221;
            int i = -this.f16021.compareTo(c5109.f16021);
            return i == 0 ? -this.f16020.compareTo(c5109.f16020) : i;
        }
        throw new RuntimeException();
    }

    public C5109(String str, String str2, boolean z, boolean z2) {
        if (str == null || str.isEmpty() || str2.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f16021 = str;
        this.f16020 = str2;
        this.f16018 = z;
        this.f16019 = z2;
    }

    @Override // l.InterfaceC19221
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1301(InterfaceC7785 interfaceC7785, int i, int i2) {
        C18515.m43032(i, i2, interfaceC7785);
        int iM43034 = C18515.m43034(i, i2, interfaceC7785);
        int iM43033 = C18515.m43033(iM43034, i2, interfaceC7785);
        if (iM43034 == iM43033) {
            return true;
        }
        int i3 = iM43033 - iM43034;
        String str = this.f16021;
        int length = str.length();
        String str2 = this.f16020;
        if (i3 < str2.length() + length) {
            return false;
        }
        String string = interfaceC7785.subSequence(iM43034, str.length() + iM43034).toString();
        String string2 = interfaceC7785.subSequence(iM43033 - str2.length(), iM43033).toString();
        if (this.f16019) {
            return string.equalsIgnoreCase(str) && string2.equalsIgnoreCase(str2);
        }
        return string.equals(str) && string2.equals(str2);
    }

    @Override // l.InterfaceC19221
    /* JADX INFO: renamed from: ۧ */
    public final int mo1302(C21856 c21856, int i, int i2, int[] iArr) {
        C18515.m43032(i, i2, c21856);
        int iM43034 = C18515.m43034(i, i2, c21856);
        int iM43033 = C18515.m43033(iM43034, i2, c21856);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16021);
        boolean z = this.f16018;
        sb.append(z ? " " : "");
        String string = sb.toString();
        String strConcat = (z ? " " : "").concat(this.f16020);
        c21856.m49243(iM43034, 0, string.length(), string);
        int length = string.length();
        int i3 = iM43033 + length;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 >= iM43034) {
                iArr[i4] = i5 + length;
            }
        }
        c21856.m49243(i3, 0, strConcat.length(), strConcat);
        int length2 = strConcat.length();
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 > i3) {
                iArr[i6] = i7 + length2;
            }
        }
        return length + length2;
    }

    @Override // l.InterfaceC19221
    /* JADX INFO: renamed from: ֫ */
    public final int mo1300(C21856 c21856, int i, int i2, int[] iArr) {
        C18515.m43032(i, i2, c21856);
        int iM43034 = C18515.m43034(i, i2, c21856);
        int iM43033 = C18515.m43033(iM43034, i2, c21856);
        int i3 = iM43033 - iM43034;
        String str = this.f16021;
        int length = str.length();
        String str2 = this.f16020;
        int length2 = str2.length() + length;
        if (i3 >= length2) {
            String string = c21856.subSequence(iM43034, str.length() + iM43034).toString();
            String string2 = c21856.subSequence(iM43033 - str2.length(), iM43033).toString();
            if (!this.f16019 ? !(!string.equals(str) || !string2.equals(str2)) : !(!string.equalsIgnoreCase(str) || !string2.equalsIgnoreCase(str2))) {
                int length3 = str.length() + iM43034;
                int length4 = iM43033 - str2.length();
                boolean z = this.f16018;
                if (z && length3 < length4 && c21856.charAt(length3) == ' ') {
                    length3++;
                }
                if (z && length3 < length4 && c21856.charAt(length4 - 1) == ' ') {
                    length4--;
                }
                c21856.delete(iM43034, length3);
                int i4 = length3 - iM43034;
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    int i6 = iArr[i5];
                    if (i6 > iM43034) {
                        iArr[i5] = i6 - Math.min(i4, i6 - iM43034);
                    }
                }
                int i7 = length4 - i4;
                int i8 = iM43033 - i4;
                c21856.delete(i7, i8);
                int i9 = i8 - i7;
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    int i11 = iArr[i10];
                    if (i11 > i7) {
                        iArr[i10] = i11 - Math.min(i9, i11 - i7);
                    }
                }
                return i4 + i9;
            }
        }
        return 0;
    }

    public final String toString() {
        return "{start='" + this.f16021 + "', end='" + this.f16020 + "', addBlank=" + this.f16018 + '}';
    }
}
