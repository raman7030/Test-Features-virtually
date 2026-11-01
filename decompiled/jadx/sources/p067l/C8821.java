package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۜ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8821 implements Comparable, Serializable {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f23946e = 0;
    public static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: a */
    public final long f23947a;

    /* JADX INFO: renamed from: b */
    public final C24009 f23948b;

    /* JADX INFO: renamed from: c */
    public final C19550 f23949c;

    /* JADX INFO: renamed from: d */
    public final C19550 f23950d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f23947a, ((C8821) obj).f23947a);
    }

    public C8821(C24009 c24009, C19550 c19550, C19550 c19551) {
        c24009.getClass();
        this.f23947a = AbstractC24029.m53241j(c24009, c19550);
        this.f23948b = c24009;
        this.f23949c = c19550;
        this.f23950d = c19551;
    }

    public C8821(long j, C19550 c19550, C19550 c19551) {
        this.f23947a = j;
        this.f23948b = C24009.m53183Z(j, 0, c19550);
        this.f23949c = c19550;
        this.f23950d = c19551;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C24914((byte) 2, this);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m20383l() {
        return this.f23950d.f59520b > this.f23949c.f59520b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8821) {
            C8821 c8821 = (C8821) obj;
            if (this.f23947a == c8821.f23947a && this.f23949c.equals(c8821.f23949c) && this.f23950d.equals(c8821.f23950d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f23948b.hashCode() ^ this.f23949c.f59520b) ^ Integer.rotateLeft(this.f23950d.f59520b, 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(m20383l() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f23948b);
        sb.append(this.f23949c);
        sb.append(" to ");
        sb.append(this.f23950d);
        sb.append(']');
        return sb.toString();
    }
}
