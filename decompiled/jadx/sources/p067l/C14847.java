package p067l;

/* JADX INFO: renamed from: l.۬۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z71W */
/* JADX INFO: loaded from: classes4.dex */
public final class C14847 implements InterfaceC24235 {

    /* JADX INFO: renamed from: ᩶ */
    public final CharSequence f42330;

    /* JADX INFO: renamed from: ᩸ */
    public final int f42331;

    /* JADX INFO: renamed from: ᩹ */
    public final int f42332;

    public C14847(int i, int i2, CharSequence charSequence) {
        int length = charSequence.length();
        if (i < 0 || i2 > length || i > i2) {
            StringBuilder sbM49005 = C21720.m49005("start = ", i, ", end = ", ", length = ", i2);
            sbM49005.append(length);
            throw new IndexOutOfBoundsException(sbM49005.toString());
        }
        if (charSequence instanceof C14847) {
            C14847 c14847 = (C14847) charSequence;
            this.f42330 = c14847.f42330;
            this.f42332 = c14847.f42332 + i;
        } else {
            this.f42330 = charSequence;
            this.f42332 = i;
        }
        this.f42331 = i2 - i;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f42331;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f42331;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C19768.m44907("index = ", i, i2, ", length = "));
        }
        return this.f42330.charAt(this.f42332 + i);
    }

    @Override // p067l.InterfaceC24235
    public final int indexOf(char c, int i, int i2) {
        int i3 = this.f42331;
        if (i < 0 || i2 > i3 || i > i2) {
            StringBuilder sbM49005 = C21720.m49005("start = ", i, ", end = ", ", length = ", i2);
            sbM49005.append(i3);
            throw new IndexOutOfBoundsException(sbM49005.toString());
        }
        if (i == i2) {
            return -1;
        }
        CharSequence charSequence = this.f42330;
        boolean z = charSequence instanceof InterfaceC24235;
        int i4 = this.f42332;
        if (!z) {
            while (i < i2) {
                if (charSequence.charAt(i4 + i) == c) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i5 = i + i4;
        int i6 = i2 + i4;
        int iIndexOf = ((InterfaceC24235) charSequence).indexOf(c, i5, i6);
        if (iIndexOf < -1 || (iIndexOf >= 0 && (iIndexOf < i5 || iIndexOf >= i6))) {
            throw new IllegalStateException("Searchable character sequence returned an invalid index");
        }
        if (iIndexOf < 0) {
            return -1;
        }
        return iIndexOf - i4;
    }

    @Override // p067l.InterfaceC24235
    public final int lastIndexOf(char c, int i, int i2) {
        int i3 = this.f42331;
        if (i < 0 || i2 > i3 || i > i2) {
            StringBuilder sbM49005 = C21720.m49005("start = ", i, ", end = ", ", length = ", i2);
            sbM49005.append(i3);
            throw new IndexOutOfBoundsException(sbM49005.toString());
        }
        if (i != i2) {
            CharSequence charSequence = this.f42330;
            boolean z = charSequence instanceof InterfaceC24235;
            int i4 = this.f42332;
            if (!z) {
                do {
                    i2--;
                    if (i2 >= i) {
                    }
                } while (charSequence.charAt(i4 + i2) != '\n');
                return i2;
            }
            int i5 = i + i4;
            int i6 = i2 + i4;
            int iLastIndexOf = ((InterfaceC24235) charSequence).lastIndexOf('\n', i5, i6);
            if (iLastIndexOf < -1 || (iLastIndexOf >= 0 && (iLastIndexOf < i5 || iLastIndexOf >= i6))) {
                throw new IllegalStateException("Searchable character sequence returned an invalid index");
            }
            if (iLastIndexOf >= 0) {
                return iLastIndexOf - i4;
            }
        }
        return -1;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = this.f42331;
        if (i < 0 || i2 > i3 || i > i2) {
            StringBuilder sbM49005 = C21720.m49005("start = ", i, ", end = ", ", length = ", i2);
            sbM49005.append(i3);
            throw new IndexOutOfBoundsException(sbM49005.toString());
        }
        if (i == 0 && i2 == i3) {
            return this;
        }
        int i4 = this.f42332;
        return new C14847(i + i4, i4 + i2, this.f42330);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.f42331;
        if (i == 0) {
            return "";
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = this.f42330.charAt(this.f42332 + i2);
        }
        return new String(cArr);
    }
}
