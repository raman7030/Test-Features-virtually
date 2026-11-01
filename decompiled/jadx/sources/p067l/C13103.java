package p067l;

/* JADX INFO: renamed from: l.ۧ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6TX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13103 extends C15113 {

    /* JADX INFO: renamed from: ᩶ */
    public final int f36834;

    /* JADX INFO: renamed from: ᩹ */
    public final int f36835;

    public C13103(C13773 c13773, int i, int i2) {
        super(c13773);
        this.f36834 = i;
        this.f36835 = i2;
    }

    @Override // p067l.C15113
    /* JADX INFO: renamed from: ֫ */
    public final int mo30000() {
        return this.f36834;
    }

    @Override // p067l.C15113, java.lang.CharSequence
    public final int length() {
        m34522();
        return this.f36835 - this.f36834;
    }

    @Override // p067l.C15113, java.lang.CharSequence
    public final char charAt(int i) {
        C13773 c13773M34522 = m34522();
        if (i >= 0) {
            int i2 = this.f36835;
            int i3 = this.f36834;
            if (i < i2 - i3) {
                return c13773M34522.m31395(i3 + i);
            }
        }
        throw new IndexOutOfBoundsException("Invalid character index");
    }

    @Override // p067l.C15113, java.lang.CharSequence
    public final C15113 subSequence(int i, int i2) {
        C13773 c13773M34522 = m34522();
        int i3 = this.f36835;
        int i4 = this.f36834;
        C13773.m31392(i, i2, i3 - i4);
        return new C13103(c13773M34522, i + i4, i4 + i2);
    }

    @Override // p067l.C15113
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        C13773 c13773M34522 = m34522();
        int i4 = this.f36835;
        int i5 = this.f36834;
        C13773.m31392(i, i2, i4 - i5);
        int i6 = i2 - i;
        C15113.m34521(cArr, i3, i6);
        C22491 c22491 = new C22491(c13773M34522, i5, i4, i);
        try {
            c22491.m50443(cArr, i3, i6);
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

    @Override // p067l.C15113
    /* JADX INFO: renamed from: ۧ */
    public final C22491 mo30001(int i) {
        return new C22491(m34522(), this.f36834, this.f36835, i);
    }

    @Override // p067l.C15113, java.lang.CharSequence
    public final String toString() {
        int length = length();
        char[] cArr = new char[length];
        getChars(0, length, cArr, 0);
        return new String(cArr);
    }
}
