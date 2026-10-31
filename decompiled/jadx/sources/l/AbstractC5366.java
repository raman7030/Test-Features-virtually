package l;

/* JADX INFO: renamed from: l.ۚ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49FQ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5366 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC11716 f16709;

    public abstract Object getValue();

    public AbstractC5366(AbstractC11716 abstractC11716) {
        this.f16709 = abstractC11716;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC5366 abstractC5366 = (AbstractC5366) obj;
        if (this.f16709 != abstractC5366.f16709) {
            return false;
        }
        if (getValue() != null) {
            return getValue().equals(abstractC5366.getValue());
        }
        return abstractC5366.getValue() == null;
    }

    public final int hashCode() {
        return this.f16709.m28612();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        return C9045.m23341(sb, mo9905(), "]");
    }

    /* JADX INFO: renamed from: ܽ */
    public String mo9905() {
        if (getValue() != null) {
            return getValue().toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC11716 m15330() {
        return this.f16709;
    }
}
