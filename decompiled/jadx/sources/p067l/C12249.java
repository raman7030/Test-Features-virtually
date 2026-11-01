package p067l;

/* JADX INFO: renamed from: l.ۤܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: LBBB */
/* JADX INFO: loaded from: classes3.dex */
public final class C12249 extends C20376 {

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC15405[] f34236;

    public C12249(int i) {
        super(i > 1);
        if (i < 1) {
            throw new IllegalArgumentException("size < 1");
        }
        this.f34236 = new AbstractC15405[i];
    }

    public final int size() {
        return this.f34236.length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15405 m28254(int i) {
        try {
            return this.f34236[i];
        } catch (IndexOutOfBoundsException unused) {
            throw new C10101("invalid constant pool index ".concat(C16351.m37153(i)), null);
        }
    }

    public final AbstractC15405 get(int i) {
        try {
            AbstractC15405 abstractC15405 = this.f34236[i];
            if (abstractC15405 != null) {
                return abstractC15405;
            }
            throw new C10101("invalid constant pool index ".concat(C16351.m37153(i)), null);
        } catch (IndexOutOfBoundsException unused) {
            throw new C10101("invalid constant pool index ".concat(C16351.m37153(i)), null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28255(int i, AbstractC15405 abstractC15405) {
        int i2;
        AbstractC15405 abstractC15406;
        m46001();
        boolean z = abstractC15405 != null && abstractC15405.mo4596();
        if (i < 1) {
            throw new IllegalArgumentException("n < 1");
        }
        AbstractC15405[] abstractC15405Arr = this.f34236;
        if (z) {
            if (i == abstractC15405Arr.length - 1) {
                throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
            }
            abstractC15405Arr[i + 1] = null;
        }
        if (abstractC15405 != null && abstractC15405Arr[i] == null && (abstractC15406 = abstractC15405Arr[(i2 = i - 1)]) != null && abstractC15406.mo4596()) {
            abstractC15405Arr[i2] = null;
        }
        abstractC15405Arr[i] = abstractC15405;
    }
}
