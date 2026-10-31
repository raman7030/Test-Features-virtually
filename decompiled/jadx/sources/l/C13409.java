package l;

/* JADX INFO: renamed from: l.۬᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6UO */
/* JADX INFO: loaded from: classes3.dex */
public class C13409 implements CharSequence, AutoCloseable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile C11999 f40077;

    /* JADX INFO: renamed from: ֫ */
    public int mo27939() {
        return 0;
    }

    public C13409(C11999 c11999) {
        C21605 c21605 = c11999.f35930;
        if (c21605 != null) {
            c21605.m48811();
        }
        this.f40077 = c11999;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11999 m32420() {
        C11999 c11999 = this.f40077;
        if (c11999 != null) {
            return c11999;
        }
        throw new IllegalStateException("Text handle is closed");
    }

    @Override // java.lang.CharSequence
    public int length() {
        return m32420().m29347();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        C11999 c11999M32420 = m32420();
        if (i < 0 || i >= c11999M32420.m29347()) {
            throw new IndexOutOfBoundsException("Invalid character index");
        }
        return c11999M32420.m29340(i);
    }

    @Override // java.lang.CharSequence
    public C13409 subSequence(int i, int i2) {
        C11999 c11999M32420 = m32420();
        C11999.m29337(i, i2, c11999M32420.m29347());
        C21605 c21605 = c11999M32420.f35930;
        return (c21605 == null || !c21605.m48805()) ? new C13409(c11999M32420.m29343(i, i2)) : new C11294(c11999M32420, i, i2);
    }

    public void getChars(int i, int i2, char[] cArr, int i3) {
        C11999 c11999M32420 = m32420();
        C11999.m29337(i, i2, c11999M32420.m29347());
        int i4 = i2 - i;
        m32419(cArr, i3, i4);
        C21172 c21172 = new C21172(c11999M32420, 0, c11999M32420.m29347(), i);
        try {
            c21172.m48113(cArr, i3, i4);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32419(char[] cArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i2 > cArr.length - i) {
            throw new IndexOutOfBoundsException("Invalid destination range");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public C21172 mo27940(int i) {
        C11999 c11999M32420 = m32420();
        return new C21172(c11999M32420, 0, c11999M32420.m29347(), i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m32423() {
        AbstractC20466 abstractC20466 = m32420().f35929;
        return ((long) (abstractC20466 == null ? 0 : abstractC20466.f65977)) + 1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m32421(int i) {
        C11999 c11999M32420 = m32420();
        C11999.m29337(i, i, c11999M32420.m29347());
        AbstractC20466 abstractC20466 = c11999M32420.f35929;
        if (abstractC20466 == null || i == 0) {
            return 0;
        }
        if (i == abstractC20466.f65976) {
            return abstractC20466.f65977;
        }
        int i2 = 0;
        while (abstractC20466 instanceof C23993) {
            if (abstractC20466.f65977 == 0) {
                return i2;
            }
            AbstractC20466[] abstractC20466Arr = ((C23993) abstractC20466).f77779;
            for (int i3 = 0; i3 < abstractC20466Arr.length; i3++) {
                AbstractC20466 abstractC20467 = abstractC20466Arr[i3];
                int i4 = abstractC20467.f65976;
                if (i < i4 || i3 == abstractC20466Arr.length - 1) {
                    abstractC20466 = abstractC20467;
                    break;
                }
                i -= i4;
                i2 += abstractC20467.f65977;
            }
        }
        if (abstractC20466.f65977 != 0) {
            return i2 + ((C21877) abstractC20466).m49266(i);
        }
        return i2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m32422(int i) {
        AbstractC20466 abstractC20466 = m32420().f35929;
        int i2 = abstractC20466 == null ? 0 : abstractC20466.f65977;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("Invalid line index");
        }
        if (i == 0) {
            return 0;
        }
        int i3 = i - 1;
        int i4 = 0;
        while (abstractC20466 instanceof C23993) {
            for (AbstractC20466 abstractC20467 : ((C23993) abstractC20466).f77779) {
                int i5 = abstractC20467.f65977;
                if (i3 < i5) {
                    abstractC20466 = abstractC20467;
                    break;
                }
                i3 -= i5;
                i4 += abstractC20467.f65976;
            }
        }
        return i4 + ((C21877) abstractC20466).m49268(i3) + 1;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        C11999 c11999M32420 = m32420();
        int iM29347 = c11999M32420.m29347();
        char[] cArr = new char[iM29347];
        C21172 c21172 = new C21172(c11999M32420, 0, c11999M32420.m29347(), 0);
        try {
            c21172.m48113(cArr, 0, iM29347);
            c21172.close();
            return new String(cArr);
        } catch (Throwable th) {
            try {
                c21172.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C11999 c11999;
        C21605 c21605;
        synchronized (this) {
            c11999 = this.f40077;
            this.f40077 = null;
        }
        if (c11999 == null || (c21605 = c11999.f35930) == null) {
            return;
        }
        c21605.m48812();
    }
}
