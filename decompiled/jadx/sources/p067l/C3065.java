package p067l;

/* JADX INFO: renamed from: l.֡᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 71FI */
/* JADX INFO: loaded from: classes2.dex */
public final class C3065 implements Comparable {

    /* JADX INFO: renamed from: ۗ */
    public final String f5532;

    /* JADX INFO: renamed from: ۙ */
    public final boolean f5533;

    /* JADX INFO: renamed from: ۤ */
    public C12828 f5534;

    /* JADX INFO: renamed from: ᩶ */
    public int f5537;

    /* JADX INFO: renamed from: ᩸ */
    public int f5538;

    /* JADX INFO: renamed from: ᩹ */
    public C12828 f5539;

    /* JADX INFO: renamed from: ۬ */
    public int f5536 = -1;

    /* JADX INFO: renamed from: ۫ */
    public int f5535 = -1;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f5532.compareTo(((C3065) obj).f5532);
    }

    public C3065(String str, boolean z) {
        this.f5532 = str;
        this.f5533 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m5166() {
        C12828 c12828 = this.f5539;
        C12826.requireNonNull(c12828);
        C13337 c13337 = new C13337(c12828.m29402());
        try {
            c13337.seek(this.f5537);
            if (this.f5533) {
                String strM13637 = C6054.m13637(c13337.m30466());
                c13337.close();
                return strM13637;
            }
            String strM30467 = c13337.m30467();
            c13337.close();
            return strM30467;
        } catch (Throwable th) {
            try {
                c13337.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3065.class != obj.getClass()) {
            return false;
        }
        return this.f5532.equals(((C3065) obj).f5532);
    }

    public final int hashCode() {
        return this.f5532.hashCode();
    }
}
