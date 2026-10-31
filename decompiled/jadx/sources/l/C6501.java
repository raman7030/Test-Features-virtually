package l;

import com.umeng.analytics.pro.cb;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۜۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6501 implements InterfaceC12146, Serializable {
    public static final C6501 d = new C6501(0, 0, 0);
    public static final long serialVersionUID = -3587258372562876L;
    public final int a;
    public final int b;
    public final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        AbstractC22791.B(new Object[]{EnumC8618.YEARS, EnumC8618.MONTHS, EnumC8618.DAYS});
    }

    public static C6501 a(int i, int i2, int i3) {
        if ((i | i2 | i3) == 0) {
            return d;
        }
        return new C6501(i, i2, i3);
    }

    public C6501(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // l.InterfaceC12146
    public final InterfaceC15672 l(InterfaceC15672 interfaceC15672) {
        C11003.requireNonNull(interfaceC15672, "temporal");
        InterfaceC2765 interfaceC2765 = (InterfaceC2765) interfaceC15672.T(AbstractC5796.b);
        if (interfaceC2765 == null || C8409.c.equals(interfaceC2765)) {
            int i = this.b;
            if (i != 0) {
                long j = (((long) this.a) * 12) + ((long) i);
                if (j != 0) {
                    interfaceC15672 = interfaceC15672.d(j, EnumC8618.MONTHS);
                }
            } else {
                int i2 = this.a;
                if (i2 != 0) {
                    interfaceC15672 = interfaceC15672.d(i2, EnumC8618.YEARS);
                }
            }
            int i3 = this.c;
            return i3 != 0 ? interfaceC15672.d(i3, EnumC8618.DAYS) : interfaceC15672;
        }
        throw new C16232("Chronology mismatch, expected: ISO, actual: " + interfaceC2765.k());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6501) {
            C6501 c6501 = (C6501) obj;
            if (this.a == c6501.a && this.b == c6501.b && this.c == c6501.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new C20613(cb.f77931l, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
