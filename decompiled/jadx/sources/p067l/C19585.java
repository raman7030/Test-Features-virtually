package p067l;

/* JADX INFO: renamed from: l.ᩳܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBDZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19585 extends AbstractC12289 {

    /* JADX INFO: renamed from: ܳ */
    public final AbstractC15405[] f59592;

    /* JADX INFO: renamed from: ܿ */
    public int f59593;

    /* JADX INFO: renamed from: ᩻ */
    public final int[] f59594;

    public C19585(C14970 c14970, C12054 c12054, C21442 c21442, AbstractC15405[] abstractC15405Arr) {
        super(c14970, c12054, c21442);
        this.f59592 = abstractC15405Arr;
        this.f59594 = new int[abstractC15405Arr.length];
        int i = 0;
        while (true) {
            int[] iArr = this.f59594;
            if (i < iArr.length) {
                if (abstractC15405Arr[i] == null) {
                    throw new NullPointerException("constants[i] == null");
                }
                iArr[i] = -1;
                i++;
            } else {
                this.f59593 = -1;
                return;
            }
        }
    }

    public C19585(C14970 c14970, C12054 c12054, C21442 c21442, AbstractC15405[] abstractC15405Arr, int[] iArr, int i) {
        super(c14970, c12054, c21442);
        this.f59592 = abstractC15405Arr;
        this.f59594 = iArr;
        this.f59593 = i;
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6924 mo6235(C14970 c14970) {
        return new C19585(c14970, m15863(), m15873(), this.f59592, this.f59594, this.f59593);
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6924 mo4462(C21442 c21442) {
        return new C19585(m15874(), m15863(), c21442, this.f59592, this.f59594, this.f59593);
    }

    /* JADX INFO: renamed from: ۖ */
    public final int m44497() {
        return this.f59592.length;
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC15405 m44498(int i) {
        return this.f59592[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44496(int i, int i2) {
        if (i2 >= 0) {
            int[] iArr = this.f59594;
            if (iArr[i] != -1) {
                throw new IllegalStateException("index already set");
            }
            iArr[i] = i2;
            return;
        }
        throw new IllegalArgumentException("index < 0");
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m44500(int i) {
        int i2 = this.f59594[i];
        if (i2 != -1) {
            return i2;
        }
        StringBuilder sbM34408 = C15033.m34408(i, "index not yet set for constant ", " value = ");
        sbM34408.append(this.f59592[i]);
        throw new IllegalStateException(sbM34408.toString());
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m44499(int i) {
        if (i >= 0) {
            if (this.f59593 != -1) {
                throw new IllegalStateException("class index already set");
            }
            this.f59593 = i;
            return;
        }
        throw new IllegalArgumentException("index < 0");
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final String mo4461() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            AbstractC15405[] abstractC15405Arr = this.f59592;
            if (i < abstractC15405Arr.length) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(abstractC15405Arr[i].mo4819());
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ᩳ */
    public final String mo15872() {
        return mo4461();
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ܽ */
    public final String mo15868() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            AbstractC15405[] abstractC15405Arr = this.f59592;
            if (i < abstractC15405Arr.length) {
                if (this.f59594[i] == -1) {
                    return "";
                }
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(abstractC15405Arr[i].mo10336());
                sb.append('@');
                int iM44500 = m44500(i);
                if (iM44500 < 65536) {
                    sb.append(C16351.m37153(iM44500));
                } else {
                    sb.append(C16351.m37155(iM44500));
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }
}
