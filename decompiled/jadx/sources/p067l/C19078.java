package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܿ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19078 implements InterfaceC13912, Serializable {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f56926e = 0;
    public static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: a */
    public final InterfaceC4997 f56927a;

    /* JADX INFO: renamed from: b */
    public final int f56928b;

    /* JADX INFO: renamed from: c */
    public final int f56929c;

    /* JADX INFO: renamed from: d */
    public final int f56930d;

    static {
        AbstractC24029.m53212B(new Object[]{EnumC10559.YEARS, EnumC10559.MONTHS, EnumC10559.DAYS});
    }

    public C19078(InterfaceC4997 interfaceC4997, int i, int i2, int i3) {
        C12826.requireNonNull(interfaceC4997, "chrono");
        this.f56927a = interfaceC4997;
        this.f56928b = i;
        this.f56929c = i2;
        this.f56930d = i3;
    }

    public final String toString() {
        if (this.f56928b == 0 && this.f56929c == 0 && this.f56930d == 0) {
            return this.f56927a.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f56927a.toString());
        sb.append(" P");
        int i = this.f56928b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.f56929c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.f56930d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    @Override // p067l.InterfaceC13912
    /* JADX INFO: renamed from: l */
    public final InterfaceC17263 mo10794l(InterfaceC17263 interfaceC17263) {
        C12826.requireNonNull(interfaceC17263, "temporal");
        InterfaceC4997 interfaceC4997 = (InterfaceC4997) interfaceC17263.mo6950T(AbstractC7877.f20680b);
        if (interfaceC4997 == null || this.f56927a.equals(interfaceC4997)) {
            if (this.f56929c != 0) {
                C23970 c23970Mo10588v = this.f56927a.mo10588v(EnumC19947.MONTH_OF_YEAR);
                long j = (c23970Mo10588v.f76156a == c23970Mo10588v.f76157b && c23970Mo10588v.f76158c == c23970Mo10588v.f76159d && c23970Mo10588v.m53124d()) ? (c23970Mo10588v.f76159d - c23970Mo10588v.f76156a) + 1 : -1L;
                if (j > 0) {
                    interfaceC17263 = interfaceC17263.mo7153d((((long) this.f56928b) * j) + ((long) this.f56929c), EnumC10559.MONTHS);
                } else {
                    int i = this.f56928b;
                    if (i != 0) {
                        interfaceC17263 = interfaceC17263.mo7153d(i, EnumC10559.YEARS);
                    }
                    interfaceC17263 = interfaceC17263.mo7153d(this.f56929c, EnumC10559.MONTHS);
                }
            } else {
                int i2 = this.f56928b;
                if (i2 != 0) {
                    interfaceC17263 = interfaceC17263.mo7153d(i2, EnumC10559.YEARS);
                }
            }
            int i3 = this.f56930d;
            return i3 != 0 ? interfaceC17263.mo7153d(i3, EnumC10559.DAYS) : interfaceC17263;
        }
        throw new C17796("Chronology mismatch, expected: " + this.f56927a.mo10584k() + ", actual: " + interfaceC4997.mo10584k());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C19078) {
            C19078 c19078 = (C19078) obj;
            if (this.f56928b == c19078.f56928b && this.f56929c == c19078.f56929c && this.f56930d == c19078.f56930d && this.f56927a.equals(c19078.f56927a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.f56930d, 16) + (Integer.rotateLeft(this.f56929c, 8) + this.f56928b)) ^ this.f56927a.hashCode();
    }

    public Object writeReplace() {
        return new C9750((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
