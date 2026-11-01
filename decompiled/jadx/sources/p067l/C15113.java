package p067l;

/* JADX INFO: renamed from: l.۬᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6UO */
/* JADX INFO: loaded from: classes3.dex */
public class C15113 implements CharSequence, AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public volatile C13773 f43147;

    /* JADX INFO: renamed from: ֫ */
    public int mo30000() {
        return 0;
    }

    public C15113(C13773 c13773) {
        C22902 c22902 = c13773.f38940;
        if (c22902 != null) {
            c22902.m51158();
        }
        this.f43147 = c13773;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C13773 m34522() {
        C13773 c13773 = this.f43147;
        if (c13773 != null) {
            return c13773;
        }
        throw new IllegalStateException("Text handle is closed");
    }

    @Override // java.lang.CharSequence
    public int length() {
        return m34522().m31402();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        C13773 c13773M34522 = m34522();
        if (i < 0 || i >= c13773M34522.m31402()) {
            throw new IndexOutOfBoundsException("Invalid character index");
        }
        return c13773M34522.m31395(i);
    }

    @Override // java.lang.CharSequence
    public C15113 subSequence(int i, int i2) {
        C13773 c13773M34522 = m34522();
        C13773.m31392(i, i2, c13773M34522.m31402());
        C22902 c22902 = c13773M34522.f38940;
        return (c22902 == null || !c22902.m51152()) ? new C15113(c13773M34522.m31398(i, i2)) : new C13103(c13773M34522, i, i2);
    }

    public void getChars(int i, int i2, char[] cArr, int i3) {
        C13773 c13773M34522 = m34522();
        C13773.m31392(i, i2, c13773M34522.m31402());
        int i4 = i2 - i;
        m34521(cArr, i3, i4);
        C22491 c22491 = new C22491(c13773M34522, 0, c13773M34522.m31402(), i);
        try {
            c22491.m50443(cArr, i3, i4);
            c22491.close();
        } catch (Throwable th) {
            try {
                c22491.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34521(char[] cArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i2 > cArr.length - i) {
            throw new IndexOutOfBoundsException("Invalid destination range");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public C22491 mo30001(int i) {
        C13773 c13773M34522 = m34522();
        return new C22491(c13773M34522, 0, c13773M34522.m31402(), i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m34525() {
        AbstractC21820 abstractC21820 = m34522().f38939;
        return ((long) (abstractC21820 == null ? 0 : abstractC21820.f68653)) + 1;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m34523(int i) {
        C13773 c13773M34522 = m34522();
        C13773.m31392(i, i, c13773M34522.m31402());
        AbstractC21820 abstractC21820 = c13773M34522.f38939;
        if (abstractC21820 == null || i == 0) {
            return 0;
        }
        if (i == abstractC21820.f68652) {
            return abstractC21820.f68653;
        }
        int i2 = 0;
        while (abstractC21820 instanceof C25172) {
            if (abstractC21820.f68653 == 0) {
                return i2;
            }
            AbstractC21820[] abstractC21820Arr = ((C25172) abstractC21820).f80530;
            for (int i3 = 0; i3 < abstractC21820Arr.length; i3++) {
                AbstractC21820 abstractC21821 = abstractC21820Arr[i3];
                int i4 = abstractC21821.f68652;
                if (i < i4 || i3 == abstractC21820Arr.length - 1) {
                    abstractC21820 = abstractC21821;
                    break;
                }
                i -= i4;
                i2 += abstractC21821.f68653;
            }
        }
        if (abstractC21820.f68653 != 0) {
            return i2 + ((C23161) abstractC21820).m51618(i);
        }
        return i2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m34524(int i) {
        AbstractC21820 abstractC21820 = m34522().f38939;
        int i2 = abstractC21820 == null ? 0 : abstractC21820.f68653;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("Invalid line index");
        }
        if (i == 0) {
            return 0;
        }
        int i3 = i - 1;
        int i4 = 0;
        while (abstractC21820 instanceof C25172) {
            for (AbstractC21820 abstractC21821 : ((C25172) abstractC21820).f80530) {
                int i5 = abstractC21821.f68653;
                if (i3 < i5) {
                    abstractC21820 = abstractC21821;
                    break;
                }
                i3 -= i5;
                i4 += abstractC21821.f68652;
            }
        }
        return i4 + ((C23161) abstractC21820).m51620(i3) + 1;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        C13773 c13773M34522 = m34522();
        int iM31402 = c13773M34522.m31402();
        char[] cArr = new char[iM31402];
        C22491 c22491 = new C22491(c13773M34522, 0, c13773M34522.m31402(), 0);
        try {
            c22491.m50443(cArr, 0, iM31402);
            c22491.close();
            return new String(cArr);
        } catch (Throwable th) {
            try {
                c22491.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C13773 c13773;
        C22902 c22902;
        synchronized (this) {
            c13773 = this.f43147;
            this.f43147 = null;
        }
        if (c13773 == null || (c22902 = c13773.f38940) == null) {
            return;
        }
        c22902.m51159();
    }
}
