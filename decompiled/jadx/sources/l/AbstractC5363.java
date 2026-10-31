package l;

/* JADX INFO: renamed from: l.ۚ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 76AN */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5363 extends AbstractC19475 implements InterfaceC21699 {
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getType().compareTo(((CharSequence) obj).toString());
    }

    public final int hashCode() {
        return getType().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof InterfaceC21699) {
            return getType().equals(((InterfaceC21699) obj).getType());
        }
        if (obj instanceof CharSequence) {
            return getType().equals(obj.toString());
        }
        return false;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return getType().length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return getType().charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return getType().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return getType();
    }
}
