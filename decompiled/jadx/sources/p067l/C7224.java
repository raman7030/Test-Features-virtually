package p067l;

/* JADX INFO: renamed from: l.ۚۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AWM */
/* JADX INFO: loaded from: classes3.dex */
public final class C7224 implements InterfaceC20636 {

    /* JADX INFO: renamed from: ۙ */
    public final boolean f18852;

    /* JADX INFO: renamed from: ᩶ */
    public final boolean f18853;

    /* JADX INFO: renamed from: ᩸ */
    public final String f18854;

    /* JADX INFO: renamed from: ᩹ */
    public final String f18855;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC20636 interfaceC20636 = (InterfaceC20636) obj;
        if (interfaceC20636 instanceof C2529) {
            return 1;
        }
        if (interfaceC20636 instanceof C7224) {
            C7224 c7224 = (C7224) interfaceC20636;
            int i = -this.f18855.compareTo(c7224.f18855);
            return i == 0 ? -this.f18854.compareTo(c7224.f18854) : i;
        }
        throw new RuntimeException();
    }

    public C7224(String str, String str2, boolean z, boolean z2) {
        if (str == null || str.isEmpty() || str2.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f18855 = str;
        this.f18854 = str2;
        this.f18852 = z;
        this.f18853 = z2;
    }

    @Override // p067l.InterfaceC20636
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3709(InterfaceC9768 interfaceC9768, int i, int i2) {
        C19965.m45310(i, i2, interfaceC9768);
        int iM45312 = C19965.m45312(i, i2, interfaceC9768);
        int iM45311 = C19965.m45311(iM45312, i2, interfaceC9768);
        if (iM45312 == iM45311) {
            return true;
        }
        int i3 = iM45311 - iM45312;
        String str = this.f18855;
        int length = str.length();
        String str2 = this.f18854;
        if (i3 < str2.length() + length) {
            return false;
        }
        String string = interfaceC9768.subSequence(iM45312, str.length() + iM45312).toString();
        String string2 = interfaceC9768.subSequence(iM45311 - str2.length(), iM45311).toString();
        if (this.f18853) {
            return string.equalsIgnoreCase(str) && string2.equalsIgnoreCase(str2);
        }
        return string.equals(str) && string2.equals(str2);
    }

    @Override // p067l.InterfaceC20636
    /* JADX INFO: renamed from: ۧ */
    public final int mo3710(C23141 c23141, int i, int i2, int[] iArr) {
        C19965.m45310(i, i2, c23141);
        int iM45312 = C19965.m45312(i, i2, c23141);
        int iM45311 = C19965.m45311(iM45312, i2, c23141);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18855);
        boolean z = this.f18852;
        sb.append(z ? " " : "");
        String string = sb.toString();
        String strConcat = (z ? " " : "").concat(this.f18854);
        c23141.m51594(iM45312, 0, string.length(), string);
        int length = string.length();
        int i3 = iM45311 + length;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 >= iM45312) {
                iArr[i4] = i5 + length;
            }
        }
        c23141.m51594(i3, 0, strConcat.length(), strConcat);
        int length2 = strConcat.length();
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 > i3) {
                iArr[i6] = i7 + length2;
            }
        }
        return length + length2;
    }

    @Override // p067l.InterfaceC20636
    /* JADX INFO: renamed from: ֫ */
    public final int mo3708(C23141 c23141, int i, int i2, int[] iArr) {
        C19965.m45310(i, i2, c23141);
        int iM45312 = C19965.m45312(i, i2, c23141);
        int iM45311 = C19965.m45311(iM45312, i2, c23141);
        int i3 = iM45311 - iM45312;
        String str = this.f18855;
        int length = str.length();
        String str2 = this.f18854;
        int length2 = str2.length() + length;
        if (i3 >= length2) {
            String string = c23141.subSequence(iM45312, str.length() + iM45312).toString();
            String string2 = c23141.subSequence(iM45311 - str2.length(), iM45311).toString();
            if (!this.f18853 ? !(!string.equals(str) || !string2.equals(str2)) : !(!string.equalsIgnoreCase(str) || !string2.equalsIgnoreCase(str2))) {
                int length3 = str.length() + iM45312;
                int length4 = iM45311 - str2.length();
                boolean z = this.f18852;
                if (z && length3 < length4 && c23141.charAt(length3) == ' ') {
                    length3++;
                }
                if (z && length3 < length4 && c23141.charAt(length4 - 1) == ' ') {
                    length4--;
                }
                c23141.delete(iM45312, length3);
                int i4 = length3 - iM45312;
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    int i6 = iArr[i5];
                    if (i6 > iM45312) {
                        iArr[i5] = i6 - Math.min(i4, i6 - iM45312);
                    }
                }
                int i7 = length4 - i4;
                int i8 = iM45311 - i4;
                c23141.delete(i7, i8);
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
        return "{start='" + this.f18855 + "', end='" + this.f18854 + "', addBlank=" + this.f18852 + '}';
    }
}
