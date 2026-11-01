package p067l;

/* JADX INFO: renamed from: l.ܰܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BHK */
/* JADX INFO: loaded from: classes3.dex */
public final class C15640 implements Comparable {

    /* JADX INFO: renamed from: ۙ */
    public final C14260 f44754;

    /* JADX INFO: renamed from: ᩶ */
    public final C22783 f44755;

    /* JADX INFO: renamed from: ᩸ */
    public final int f44756;

    /* JADX INFO: renamed from: ᩹ */
    public final EnumC24358 f44757;

    public C15640(int i, EnumC24358 enumC24358, C22783 c22783) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        if (enumC24358 == null) {
            throw new NullPointerException("disposition == null");
        }
        try {
            if (c22783.m50990() == null) {
                throw new NullPointerException("spec.getLocalItem() == null");
            }
            this.f44756 = i;
            this.f44757 = enumC24358;
            this.f44755 = c22783;
            this.f44754 = C14260.m32769(c22783.getType());
        } catch (NullPointerException unused) {
            throw new NullPointerException("spec == null");
        }
    }

    public final String toString() {
        return Integer.toHexString(this.f44756) + " " + this.f44757 + " " + this.f44755;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C15640) && compareTo((C15640) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C15640 c15640) {
        int i = c15640.f44756;
        int i2 = this.f44756;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        boolean zM35542 = m35542();
        if (zM35542 != c15640.m35542()) {
            return zM35542 ? 1 : -1;
        }
        return this.f44755.compareTo(c15640.f44755);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m35535() {
        return this.f44756;
    }

    /* JADX INFO: renamed from: ۧ */
    public final EnumC24358 m35539() {
        return this.f44757;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m35542() {
        return this.f44757 == EnumC24358.START;
    }

    public final C14930 getName() {
        return this.f44755.m50990().getName();
    }

    public final C14930 getSignature() {
        return this.f44755.m50990().getSignature();
    }

    public final C14260 getType() {
        return this.f44754;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m35541() {
        return this.f44755.m50989();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C22783 m35543() {
        return this.f44755;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35538(C22783 c22783) {
        return this.f44755.m50984(c22783);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m35540(C15640 c15640) {
        return this.f44755.m50984(c15640.f44755);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15640 m35537(EnumC24358 enumC24358) {
        return enumC24358 == this.f44757 ? this : new C15640(this.f44756, enumC24358, this.f44755);
    }
}
