package p067l;

/* JADX INFO: renamed from: l.ۚ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49FQ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7468 {

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC13503 f19547;

    public abstract Object getValue();

    public AbstractC7468(AbstractC13503 abstractC13503) {
        this.f19547 = abstractC13503;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC7468 abstractC7468 = (AbstractC7468) obj;
        if (this.f19547 != abstractC7468.f19547) {
            return false;
        }
        if (getValue() != null) {
            return getValue().equals(abstractC7468.getValue());
        }
        return abstractC7468.getValue() == null;
    }

    public final int hashCode() {
        return this.f19547.m30660();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        return C10965.m25286(sb, mo11953(), "]");
    }

    /* JADX INFO: renamed from: ܽ */
    public String mo11953() {
        if (getValue() != null) {
            return getValue().toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC13503 m17239() {
        return this.f19547;
    }
}
