package l;

/* JADX INFO: renamed from: l.ۤܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: LBBB */
/* JADX INFO: loaded from: classes3.dex */
public final class C10396 extends C18947 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC13717[] f31271;

    public C10396(int i) {
        super(i > 1);
        if (i < 1) {
            throw new IllegalArgumentException("size < 1");
        }
        this.f31271 = new AbstractC13717[i];
    }

    public final int size() {
        return this.f31271.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC13717 m26225(int i) {
        try {
            return this.f31271[i];
        } catch (IndexOutOfBoundsException unused) {
            throw new C8136("invalid constant pool index ".concat(C14712.m35006(i)), null);
        }
    }

    public final AbstractC13717 get(int i) {
        try {
            AbstractC13717 abstractC13717 = this.f31271[i];
            if (abstractC13717 != null) {
                return abstractC13717;
            }
            throw new C8136("invalid constant pool index ".concat(C14712.m35006(i)), null);
        } catch (IndexOutOfBoundsException unused) {
            throw new C8136("invalid constant pool index ".concat(C14712.m35006(i)), null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26226(int i, AbstractC13717 abstractC13717) {
        int i2;
        AbstractC13717 abstractC13718;
        m43734();
        boolean z = abstractC13717 != null && abstractC13717.mo2229();
        if (i < 1) {
            throw new IllegalArgumentException("n < 1");
        }
        AbstractC13717[] abstractC13717Arr = this.f31271;
        if (z) {
            if (i == abstractC13717Arr.length - 1) {
                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
            }
            abstractC13717Arr[i + 1] = null;
        }
        if (abstractC13717 != null && abstractC13717Arr[i] == null && (abstractC13718 = abstractC13717Arr[(i2 = i - 1)]) != null && abstractC13718.mo2229()) {
            abstractC13717Arr[i2] = null;
        }
        abstractC13717Arr[i] = abstractC13717;
    }
}
