package l;

/* JADX INFO: renamed from: l.۟ܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: T70E */
/* JADX INFO: loaded from: classes3.dex */
public final class C7575 implements InterfaceC23008 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence f23433;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1540 f23434;

    @Override // l.InterfaceC23008
    public final int lastIndexOf(char c, int i, int i2) {
        int iMax = Math.max(0, i);
        int iMin = Math.min(this.f23434.f5433, i2);
        while (iMin > iMax) {
            iMin--;
            if (charAt(iMin) == '\n') {
                return iMin;
            }
        }
        return -1;
    }

    public C7575(C1540 c1540, CharSequence charSequence) {
        this.f23434 = c1540;
        this.f23433 = charSequence;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f23434.f5433;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        char cCharAt = this.f23433.charAt(i);
        C1540.m5258(this.f23434, i, i + 1);
        return cCharAt;
    }

    @Override // l.InterfaceC23008
    public final int indexOf(char c, int i, int i2) {
        int iMax = Math.max(0, i);
        C1540 c1540 = this.f23434;
        int iMin = Math.min(c1540.f5433, i2);
        int i3 = -1;
        if (iMax >= iMin) {
            return -1;
        }
        CharSequence charSequence = this.f23433;
        if (charSequence instanceof InterfaceC23008) {
            int iIndexOf = ((InterfaceC23008) charSequence).indexOf(c, iMax, iMin);
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
        C1540.m5258(c1540, iMax, iMin);
        return i3;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C13130(i, i2, this);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        CharSequence charSequence = this.f23433;
        boolean z = charSequence instanceof String;
        C1540 c1540 = this.f23434;
        if (z) {
            String str = (String) charSequence;
            C1540.m5258(c1540, 0, c1540.f5433);
            return str;
        }
        return new C13130(0, c1540.f5433, this).toString();
    }
}
