package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܿ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17581 implements InterfaceC12146, Serializable {
    public static final /* synthetic */ int e = 0;
    public static final long serialVersionUID = 57387258289L;
    public final InterfaceC2765 a;
    public final int b;
    public final int c;
    public final int d;

    static {
        AbstractC22791.B(new Object[]{EnumC8618.YEARS, EnumC8618.MONTHS, EnumC8618.DAYS});
    }

    public C17581(InterfaceC2765 interfaceC2765, int i, int i2, int i3) {
        C11003.requireNonNull(interfaceC2765, "chrono");
        this.a = interfaceC2765;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final String toString() {
        if (this.b == 0 && this.c == 0 && this.d == 0) {
            return this.a.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.toString());
        sb.append(" P");
        int i = this.b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    @Override // l.InterfaceC12146
    public final InterfaceC15672 l(InterfaceC15672 interfaceC15672) {
        C11003.requireNonNull(interfaceC15672, "temporal");
        InterfaceC2765 interfaceC2765 = (InterfaceC2765) interfaceC15672.T(AbstractC5796.b);
        if (interfaceC2765 == null || this.a.equals(interfaceC2765)) {
            if (this.c != 0) {
                C22729 c22729V = this.a.v(EnumC18496.MONTH_OF_YEAR);
                long j = (c22729V.a == c22729V.b && c22729V.c == c22729V.d && c22729V.d()) ? (c22729V.d - c22729V.a) + 1 : -1L;
                if (j > 0) {
                    interfaceC15672 = interfaceC15672.d((((long) this.b) * j) + ((long) this.c), EnumC8618.MONTHS);
                } else {
                    int i = this.b;
                    if (i != 0) {
                        interfaceC15672 = interfaceC15672.d(i, EnumC8618.YEARS);
                    }
                    interfaceC15672 = interfaceC15672.d(this.c, EnumC8618.MONTHS);
                }
            } else {
                int i2 = this.b;
                if (i2 != 0) {
                    interfaceC15672 = interfaceC15672.d(i2, EnumC8618.YEARS);
                }
            }
            int i3 = this.d;
            return i3 != 0 ? interfaceC15672.d(i3, EnumC8618.DAYS) : interfaceC15672;
        }
        throw new C16232("Chronology mismatch, expected: " + this.a.k() + ", actual: " + interfaceC2765.k());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17581) {
            C17581 c17581 = (C17581) obj;
            if (this.b == c17581.b && this.c == c17581.c && this.d == c17581.d && this.a.equals(c17581.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b)) ^ this.a.hashCode();
    }

    public Object writeReplace() {
        return new C7766((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
