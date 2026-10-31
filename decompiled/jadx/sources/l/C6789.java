package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۜ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6789 implements Comparable, Serializable {
    public static final /* synthetic */ int e = 0;
    public static final long serialVersionUID = -6946044323557704546L;
    public final long a;
    public final C22770 b;
    public final C18078 c;
    public final C18078 d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((C6789) obj).a);
    }

    public C6789(C22770 c22770, C18078 c18078, C18078 c18079) {
        c22770.getClass();
        this.a = AbstractC22791.j(c22770, c18078);
        this.b = c22770;
        this.c = c18078;
        this.d = c18079;
    }

    public C6789(long j, C18078 c18078, C18078 c18079) {
        this.a = j;
        this.b = C22770.Z(j, 0, c18078);
        this.c = c18078;
        this.d = c18079;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C23722((byte) 2, this);
    }

    public final boolean l() {
        return this.d.b > this.c.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6789) {
            C6789 c6789 = (C6789) obj;
            if (this.a == c6789.a && this.c.equals(c6789.c) && this.d.equals(c6789.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() ^ this.c.b) ^ Integer.rotateLeft(this.d.b, 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(l() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.b);
        sb.append(this.c);
        sb.append(" to ");
        sb.append(this.d);
        sb.append(']');
        return sb.toString();
    }
}
