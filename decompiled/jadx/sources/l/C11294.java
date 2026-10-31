package l;

/* JADX INFO: renamed from: l.ۧ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6TX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11294 extends C13409 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f33835;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f33836;

    public C11294(C11999 c11999, int i, int i2) {
        super(c11999);
        this.f33835 = i;
        this.f33836 = i2;
    }

    @Override // l.C13409
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo27939() {
        return this.f33835;
    }

    @Override // l.C13409, java.lang.CharSequence
    public final int length() {
        m32420();
        return this.f33836 - this.f33835;
    }

    @Override // l.C13409, java.lang.CharSequence
    public final char charAt(int i) {
        C11999 c11999M32420 = m32420();
        if (i >= 0) {
            int i2 = this.f33836;
            int i3 = this.f33835;
            if (i < i2 - i3) {
                return c11999M32420.m29340(i3 + i);
            }
        }
        throw new IndexOutOfBoundsException("Invalid character index");
    }

    @Override // l.C13409, java.lang.CharSequence
    public final C13409 subSequence(int i, int i2) {
        C11999 c11999M32420 = m32420();
        int i3 = this.f33836;
        int i4 = this.f33835;
        C11999.m29337(i, i2, i3 - i4);
        return new C11294(c11999M32420, i + i4, i4 + i2);
    }

    @Override // l.C13409
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        C11999 c11999M32420 = m32420();
        int i4 = this.f33836;
        int i5 = this.f33835;
        C11999.m29337(i, i2, i4 - i5);
        int i6 = i2 - i;
        C13409.m32419(cArr, i3, i6);
        C21172 c21172 = new C21172(c11999M32420, i5, i4, i);
        try {
            c21172.m48113(cArr, i3, i6);
            c21172.close();
        } catch (Throwable th) {
            try {
                c21172.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.C13409
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21172 mo27940(int i) {
        return new C21172(m32420(), this.f33835, this.f33836, i);
    }

    @Override // l.C13409, java.lang.CharSequence
    public final String toString() {
        int length = length();
        char[] cArr = new char[length];
        getChars(0, length, cArr, 0);
        return new String(cArr);
    }
}
