package l;

/* JADX INFO: renamed from: l.᩸᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBK3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21807 implements Cloneable {
    public abstract double getX();

    public abstract double getY();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo22010(double d, double d2);

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(getX()) ^ (Double.doubleToLongBits(getY()) * 31);
        return ((int) jDoubleToLongBits) ^ ((int) (jDoubleToLongBits >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC21807) {
            AbstractC21807 abstractC21807 = (AbstractC21807) obj;
            return getX() == abstractC21807.getX() && getY() == abstractC21807.getY();
        }
        return super.equals(obj);
    }
}
