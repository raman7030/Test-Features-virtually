package p067l;

/* JADX INFO: renamed from: l.۟ۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB9X */
/* JADX INFO: loaded from: classes3.dex */
public final class C9391 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public final C14930 f25652;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC15405 f25653;

    public C9391(C14930 c14930, AbstractC15405 abstractC15405) {
        if (c14930 == null) {
            throw new NullPointerException("name == null");
        }
        if (abstractC15405 == null) {
            throw new NullPointerException("value == null");
        }
        this.f25652 = c14930;
        this.f25653 = abstractC15405;
    }

    public final String toString() {
        return this.f25652.mo4819() + ":" + this.f25653;
    }

    public final int hashCode() {
        return this.f25653.hashCode() + (this.f25652.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9391)) {
            return false;
        }
        C9391 c9391 = (C9391) obj;
        return this.f25652.equals(c9391.f25652) && this.f25653.equals(c9391.f25653);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C9391 c9391) {
        int iCompareTo = this.f25652.compareTo(c9391.f25652);
        return iCompareTo != 0 ? iCompareTo : this.f25653.compareTo(c9391.f25653);
    }

    public final C14930 getName() {
        return this.f25652;
    }

    public final AbstractC15405 getValue() {
        return this.f25653;
    }
}
