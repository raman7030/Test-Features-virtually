package l;

/* JADX INFO: renamed from: l.ᩳܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBDZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18115 extends AbstractC10438 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC13717[] f56379;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f56380;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f56381;

    public C18115(C13259 c13259, C10191 c10191, C20069 c20069, AbstractC13717[] abstractC13717Arr) {
        super(c13259, c10191, c20069);
        this.f56379 = abstractC13717Arr;
        this.f56381 = new int[abstractC13717Arr.length];
        int i = 0;
        while (true) {
            int[] iArr = this.f56381;
            if (i < iArr.length) {
                if (abstractC13717Arr[i] == null) {
                    throw new NullPointerException("constants[i] == null");
                }
                iArr[i] = -1;
                i++;
            } else {
                this.f56380 = -1;
                return;
            }
        }
    }

    public C18115(C13259 c13259, C10191 c10191, C20069 c20069, AbstractC13717[] abstractC13717Arr, int[] iArr, int i) {
        super(c13259, c10191, c20069);
        this.f56379 = abstractC13717Arr;
        this.f56381 = iArr;
        this.f56380 = i;
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4793 mo3993(C13259 c13259) {
        return new C18115(c13259, m13983(), m13993(), this.f56379, this.f56381, this.f56380);
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4793 mo2081(C20069 c20069) {
        return new C18115(m13994(), m13983(), c20069, this.f56379, this.f56381, this.f56380);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m42238() {
        return this.f56379.length;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC13717 m42239(int i) {
        return this.f56379[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42237(int i, int i2) {
        if (i2 >= 0) {
            int[] iArr = this.f56381;
            if (iArr[i] != -1) {
                throw new IllegalStateException("index already set");
            }
            iArr[i] = i2;
            return;
        }
        throw new IllegalArgumentException("index < 0");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m42241(int i) {
        int i2 = this.f56381[i];
        if (i2 != -1) {
            return i2;
        }
        StringBuilder sbM32308 = C13325.m32308(i, "index not yet set for constant ", " value = ");
        sbM32308.append(this.f56379[i]);
        throw new IllegalStateException(sbM32308.toString());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m42240(int i) {
        if (i >= 0) {
            if (this.f56380 != -1) {
                throw new IllegalStateException("class index already set");
            }
            this.f56380 = i;
            return;
        }
        throw new IllegalArgumentException("index < 0");
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫ */
    public final String mo2080() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            AbstractC13717[] abstractC13717Arr = this.f56379;
            if (i < abstractC13717Arr.length) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(abstractC13717Arr[i].mo2463());
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ᩳ */
    public final String mo13992() {
        return mo2080();
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ܽ */
    public final String mo13988() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            AbstractC13717[] abstractC13717Arr = this.f56379;
            if (i < abstractC13717Arr.length) {
                if (this.f56381[i] == -1) {
                    return "";
                }
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(abstractC13717Arr[i].mo8292());
                sb.append('@');
                int iM42241 = m42241(i);
                if (iM42241 < 65536) {
                    sb.append(C14712.m35006(iM42241));
                } else {
                    sb.append(C14712.m35008(iM42241));
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }
}
