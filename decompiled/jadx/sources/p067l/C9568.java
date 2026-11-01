package p067l;

/* JADX INFO: renamed from: l.۟ܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: T70E */
/* JADX INFO: loaded from: classes3.dex */
public final class C9568 implements InterfaceC24235 {

    /* JADX INFO: renamed from: ᩸ */
    public final CharSequence f26345;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C3832 f26346;

    @Override // p067l.InterfaceC24235
    public final int lastIndexOf(char c, int i, int i2) {
        int iMax = Math.max(0, i);
        int iMin = Math.min(this.f26346.f8215, i2);
        while (iMin > iMax) {
            iMin--;
            if (charAt(iMin) == '\n') {
                return iMin;
            }
        }
        return -1;
    }

    public C9568(C3832 c3832, CharSequence charSequence) {
        this.f26346 = c3832;
        this.f26345 = charSequence;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f26346.f8215;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        char cCharAt = this.f26345.charAt(i);
        C3832.m7487(this.f26346, i, i + 1);
        return cCharAt;
    }

    @Override // p067l.InterfaceC24235
    public final int indexOf(char c, int i, int i2) {
        int iMax = Math.max(0, i);
        C3832 c3832 = this.f26346;
        int iMin = Math.min(c3832.f8215, i2);
        int i3 = -1;
        if (iMax >= iMin) {
            return -1;
        }
        CharSequence charSequence = this.f26345;
        if (charSequence instanceof InterfaceC24235) {
            int iIndexOf = ((InterfaceC24235) charSequence).indexOf(c, iMax, iMin);
            if (iIndexOf < -1 || (iIndexOf >= 0 && (iIndexOf < iMax || iIndexOf >= iMin))) {
                throw new IllegalStateException("Searchable syntax text returned an invalid index");
            }
            i3 = iIndexOf;
        } else {
            for (int i4 = iMax; i4 < iMin; i4++) {
                if (charSequence.charAt(i4) == c) {
                    i3 = i4;
                    break;
                }
            }
        }
        if (i3 >= 0) {
            iMin = i3 + 1;
        }
        C3832.m7487(c3832, iMax, iMin);
        return i3;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C14847(i, i2, this);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        CharSequence charSequence = this.f26345;
        boolean z = charSequence instanceof String;
        C3832 c3832 = this.f26346;
        if (z) {
            String str = (String) charSequence;
            C3832.m7487(c3832, 0, c3832.f8215);
            return str;
        }
        return new C14847(0, c3832.f8215, this).toString();
    }
}
