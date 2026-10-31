package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۘۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75HT */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3675 implements Comparable, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Comparable f11610;

    public abstract int hashCode();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC3675 mo11189(AbstractC19198 abstractC19198) {
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7488(StringBuilder sb);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo7489(Comparable comparable);

    /* JADX INFO: renamed from: ۧ */
    public abstract EnumC3717 mo7490();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo7491(StringBuilder sb);

    /* JADX INFO: renamed from: ܿ */
    public abstract EnumC3717 mo7492();

    public AbstractC3675(Comparable comparable) {
        this.f11610 = comparable;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Comparable mo11188() {
        return this.f11610;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC3675) {
            try {
                if (compareTo((AbstractC3675) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public int compareTo(AbstractC3675 abstractC3675) {
        if (abstractC3675 == C15668.f48229) {
            return 1;
        }
        if (abstractC3675 == C9320.f28269) {
            return -1;
        }
        Comparable comparable = abstractC3675.f11610;
        int i = C13758.f41051;
        int iCompareTo = this.f11610.compareTo(comparable);
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof C8614, abstractC3675 instanceof C8614);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C2264 m11186(Comparable comparable) {
        comparable.getClass();
        return new C2264(comparable);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C8614 m11185(Comparable comparable) {
        comparable.getClass();
        return new C8614(comparable);
    }
}
