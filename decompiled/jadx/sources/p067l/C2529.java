package p067l;

/* JADX INFO: renamed from: l.֡ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2529 implements InterfaceC20636 {

    /* JADX INFO: renamed from: ᩶ */
    public final boolean f4160;

    /* JADX INFO: renamed from: ᩸ */
    public final String f4161;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f4162;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC20636 interfaceC20636 = (InterfaceC20636) obj;
        if (interfaceC20636 instanceof C7224) {
            return 1;
        }
        if (interfaceC20636 instanceof C2529) {
            return -this.f4161.compareTo(((C2529) interfaceC20636).f4161);
        }
        throw new RuntimeException();
    }

    public C2529(String str, boolean z, boolean z2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f4161 = str;
        this.f4160 = z;
        this.f4162 = z2;
    }

    @Override // p067l.InterfaceC20636
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3709(InterfaceC9768 interfaceC9768, int i, int i2) {
        C19965.m45310(i, i2, interfaceC9768);
        int iM45312 = C19965.m45312(i, i2, interfaceC9768);
        if (iM45312 == i2) {
            return true;
        }
        int i3 = i2 - iM45312;
        String str = this.f4161;
        if (i3 < str.length()) {
            return false;
        }
        String string = interfaceC9768.subSequence(iM45312, str.length() + iM45312).toString();
        if (this.f4162) {
            return string.equalsIgnoreCase(str);
        }
        return string.equals(str);
    }

    @Override // p067l.InterfaceC20636
    /* JADX INFO: renamed from: ۧ */
    public final int mo3710(C23141 c23141, int i, int i2, int[] iArr) {
        C19965.m45310(i, i2, c23141);
        int iM45312 = C19965.m45312(i, i2, c23141);
        if (iM45312 == i2) {
            return 0;
        }
        boolean z = this.f4160;
        String strM40053 = this.f4161;
        if (z) {
            strM40053 = C17588.m40053(strM40053, " ");
        }
        c23141.m51594(iM45312, 0, strM40053.length(), strM40053);
        int length = strM40053.length();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            if (i4 >= iM45312) {
                iArr[i3] = i4 + length;
            }
        }
        return length;
    }

    @Override // p067l.InterfaceC20636
    /* JADX INFO: renamed from: ֫ */
    public final int mo3708(C23141 c23141, int i, int i2, int[] iArr) {
        C19965.m45310(i, i2, c23141);
        int iM45312 = C19965.m45312(i, i2, c23141);
        String str = this.f4161;
        int length = str.length() + iM45312;
        if (length <= i2) {
            String string = c23141.subSequence(iM45312, length).toString();
            if (!this.f4162 ? string.equals(str) : string.equalsIgnoreCase(str)) {
                if (length != i2 && c23141.charAt(length) == ' ') {
                    length++;
                }
                c23141.delete(iM45312, length);
                int i3 = length - iM45312;
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    int i5 = iArr[i4];
                    if (i5 > iM45312) {
                        iArr[i4] = i5 - Math.min(i3, i5 - iM45312);
                    }
                }
                return i3;
            }
        }
        return 0;
    }

    public final String toString() {
        return "{start='" + this.f4161 + "', insertSpace=" + this.f4160 + '}';
    }
}
