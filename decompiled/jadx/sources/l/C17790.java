package l;

import com.umeng.analytics.pro.cb;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: renamed from: l.ᩳۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17790 implements InterfaceC2268, InterfaceC2974, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    public static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C17790 c17790 = (C17790) obj;
        int i = this.a - c17790.a;
        return i == 0 ? this.b - c17790.b : i;
    }

    static {
        C4426 c4426 = new C4426();
        c4426.e("--");
        c4426.l(EnumC18496.MONTH_OF_YEAR, 2);
        c4426.d('-');
        c4426.l(EnumC18496.DAY_OF_MONTH, 2);
        c4426.q(Locale.getDefault(), EnumC17126.SMART, null);
    }

    public C17790(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // l.InterfaceC2268
    public final boolean e(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            return interfaceC10030 == EnumC18496.MONTH_OF_YEAR || interfaceC10030 == EnumC18496.DAY_OF_MONTH;
        }
        return interfaceC10030 != null && interfaceC10030.l(this);
    }

    @Override // l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        int i;
        if (interfaceC10030 == EnumC18496.MONTH_OF_YEAR) {
            return interfaceC10030.s();
        }
        if (interfaceC10030 != EnumC18496.DAY_OF_MONTH) {
            return AbstractC5796.d(this, interfaceC10030);
        }
        EnumC10735 enumC10735Y = EnumC10735.Y(this.a);
        enumC10735Y.getClass();
        int i2 = AbstractC1562.a[enumC10735Y.ordinal()];
        if (i2 != 1) {
            i = (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31;
        } else {
            i = 28;
        }
        return C22729.g(1L, i, EnumC10735.Y(this.a).X());
    }

    @Override // l.InterfaceC2268
    public final int l(InterfaceC10030 interfaceC10030) {
        return n(interfaceC10030).a(G(interfaceC10030), interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        int i;
        if (!(interfaceC10030 instanceof EnumC18496)) {
            return interfaceC10030.C(this);
        }
        int i2 = AbstractC16378.a[((EnumC18496) interfaceC10030).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
            }
            i = this.a;
        }
        return i;
    }

    @Override // l.InterfaceC2268
    public final Object T(C8556 c8556) {
        if (c8556 == AbstractC5796.b) {
            return C8409.c;
        }
        return AbstractC5796.c(this, c8556);
    }

    @Override // l.InterfaceC2974
    public final InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        if (!AbstractC16169.r(interfaceC15672).equals(C8409.c)) {
            throw new C16232("Adjustment only supported on ISO date-time");
        }
        InterfaceC15672 interfaceC15672C = interfaceC15672.c(this.a, EnumC18496.MONTH_OF_YEAR);
        EnumC18496 enumC18496 = EnumC18496.DAY_OF_MONTH;
        return interfaceC15672C.c(Math.min(interfaceC15672C.n(enumC18496).d, this.b), enumC18496);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17790) {
            C17790 c17790 = (C17790) obj;
            if (this.a == c17790.a && this.b == c17790.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.a < 10 ? "0" : "");
        sb.append(this.a);
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new C20613(cb.k, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
