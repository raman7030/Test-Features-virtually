package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۘۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75HT */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5861 implements Comparable, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final Comparable f14414;

    public abstract int hashCode();

    /* JADX INFO: renamed from: ֫ */
    public AbstractC5861 mo13149(AbstractC20614 abstractC20614) {
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9570(StringBuilder sb);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo9571(Comparable comparable);

    /* JADX INFO: renamed from: ۧ */
    public abstract EnumC5901 mo9572();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo9573(StringBuilder sb);

    /* JADX INFO: renamed from: ܿ */
    public abstract EnumC5901 mo9574();

    public AbstractC5861(Comparable comparable) {
        this.f14414 = comparable;
    }

    /* JADX INFO: renamed from: ֫ */
    public Comparable mo13148() {
        return this.f14414;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC5861) {
            try {
                if (compareTo((AbstractC5861) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC5861 abstractC5861) {
        if (abstractC5861 == C17259.f51368) {
            return 1;
        }
        if (abstractC5861 == C11226.f31218) {
            return -1;
        }
        Comparable comparable = abstractC5861.f14414;
        int i = C15444.f44129;
        int iCompareTo = this.f14414.compareTo(comparable);
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof C10555, abstractC5861 instanceof C10555);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C4520 m13146(Comparable comparable) {
        comparable.getClass();
        return new C4520(comparable);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C10555 m13145(Comparable comparable) {
        comparable.getClass();
        return new C10555(comparable);
    }
}
