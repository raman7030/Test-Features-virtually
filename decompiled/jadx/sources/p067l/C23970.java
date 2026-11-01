package p067l;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩺ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23970 implements Serializable {
    public static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: a */
    public final long f76156a;

    /* JADX INFO: renamed from: b */
    public final long f76157b;

    /* JADX INFO: renamed from: c */
    public final long f76158c;

    /* JADX INFO: renamed from: d */
    public final long f76159d;

    /* JADX INFO: renamed from: f */
    public static C23970 m53119f(long j, long j2) {
        if (j > j2) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new C23970(j, j, j2, j2);
    }

    /* JADX INFO: renamed from: g */
    public static C23970 m53120g(long j, long j2, long j3) {
        if (j > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j2 > j3) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j3) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new C23970(j, 1L, j2, j3);
    }

    public C23970(long j, long j2, long j3, long j4) {
        this.f76156a = j;
        this.f76157b = j2;
        this.f76158c = j3;
        this.f76159d = j4;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m53124d() {
        return this.f76156a >= -2147483648L && this.f76159d <= 2147483647L;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m53125e(long j) {
        return j >= this.f76156a && j <= this.f76159d;
    }

    /* JADX INFO: renamed from: a */
    public final int m53121a(long j, InterfaceC11901 interfaceC11901) {
        if (m53124d() && m53125e(j)) {
            return (int) j;
        }
        throw new C17796(m53123c(j, interfaceC11901));
    }

    /* JADX INFO: renamed from: b */
    public final void m53122b(long j, InterfaceC11901 interfaceC11901) {
        if (!m53125e(j)) {
            throw new C17796(m53123c(j, interfaceC11901));
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m53123c(long j, InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 != null) {
            return "Invalid value for " + interfaceC11901 + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j = this.f76156a;
        long j2 = this.f76157b;
        if (j > j2) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j3 = this.f76158c;
        long j4 = this.f76159d;
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
        if (obj instanceof C23970) {
            C23970 c23970 = (C23970) obj;
            if (this.f76156a == c23970.f76156a && this.f76157b == c23970.f76157b && this.f76158c == c23970.f76158c && this.f76159d == c23970.f76159d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f76156a;
        long j2 = this.f76157b;
        long j3 = j + (j2 << 16) + (j2 >> 48);
        long j4 = this.f76158c;
        long j5 = j3 + (j4 << 32) + (j4 >> 32);
        long j6 = this.f76159d;
        long j7 = j5 + (j6 << 48) + (j6 >> 16);
        return (int) (j7 ^ (j7 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f76156a);
        if (this.f76156a != this.f76157b) {
            sb.append('/');
            sb.append(this.f76157b);
        }
        sb.append(" - ");
        sb.append(this.f76158c);
        if (this.f76158c != this.f76159d) {
            sb.append('/');
            sb.append(this.f76159d);
        }
        return sb.toString();
    }
}
