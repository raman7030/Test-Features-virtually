package l;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩺ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C22729 implements Serializable {
    public static final long serialVersionUID = -7317881728594519368L;
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public static C22729 f(long j, long j2) {
        if (j > j2) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new C22729(j, j, j2, j2);
    }

    public static C22729 g(long j, long j2, long j3) {
        if (j > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j2 > j3) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j3) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new C22729(j, 1L, j2, j3);
    }

    public C22729(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean d() {
        return this.a >= -2147483648L && this.d <= 2147483647L;
    }

    public final boolean e(long j) {
        return j >= this.a && j <= this.d;
    }

    public final int a(long j, InterfaceC10030 interfaceC10030) {
        if (d() && e(j)) {
            return (int) j;
        }
        throw new C16232(c(j, interfaceC10030));
    }

    public final void b(long j, InterfaceC10030 interfaceC10030) {
        if (!e(j)) {
            throw new C16232(c(j, interfaceC10030));
        }
    }

    public final String c(long j, InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 != null) {
            return "Invalid value for " + interfaceC10030 + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j = this.a;
        long j2 = this.b;
        if (j > j2) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j3 = this.c;
        long j4 = this.d;
        if (j3 > j4) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j2 > j4) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22729) {
            C22729 c22729 = (C22729) obj;
            if (this.a == c22729.a && this.b == c22729.b && this.c == c22729.c && this.d == c22729.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = j + (j2 << 16) + (j2 >> 48);
        long j4 = this.c;
        long j5 = j3 + (j4 << 32) + (j4 >> 32);
        long j6 = this.d;
        long j7 = j5 + (j6 << 48) + (j6 >> 16);
        return (int) (j7 ^ (j7 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        if (this.a != this.b) {
            sb.append('/');
            sb.append(this.b);
        }
        sb.append(" - ");
        sb.append(this.c);
        if (this.c != this.d) {
            sb.append('/');
            sb.append(this.d);
        }
        return sb.toString();
    }
}
