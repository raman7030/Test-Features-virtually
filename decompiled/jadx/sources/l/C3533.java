package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3533 extends AbstractC4944 implements Serializable {
    public static final C3533 c = new C3533();
    public static final long serialVersionUID = 1039765215346859963L;

    @Override // l.InterfaceC2765
    public final String k() {
        return "Minguo";
    }

    @Override // l.InterfaceC2765
    public final String o() {
        return "roc";
    }

    @Override // l.InterfaceC2765
    public final InterfaceC4176 y(int i) {
        if (i == 0) {
            return EnumC23288.BEFORE_ROC;
        }
        if (i == 1) {
            return EnumC23288.ROC;
        }
        throw new C16232("Invalid era: " + i);
    }

    @Override // l.InterfaceC2765
    public final InterfaceC13410 M(int i, int i2, int i3) {
        return new C6355(C19056.h0(i + 1911, i2, i3));
    }

    @Override // l.InterfaceC2765
    public final InterfaceC13410 q(int i, int i2) {
        return new C6355(C19056.j0(i + 1911, i2));
    }

    @Override // l.InterfaceC2765
    public final InterfaceC13410 j(long j) {
        return new C6355(C19056.i0(j));
    }

    @Override // l.AbstractC4944
    public final InterfaceC13410 m() {
        return new C6355(C19056.X(C19056.g0(AbstractC9178.a())));
    }

    @Override // l.InterfaceC2765
    public final InterfaceC13410 E(InterfaceC2268 interfaceC2268) {
        if (interfaceC2268 instanceof C6355) {
            return (C6355) interfaceC2268;
        }
        return new C6355(C19056.X(interfaceC2268));
    }

    @Override // l.InterfaceC2765
    public final boolean S(long j) {
        return C8409.c.S(j + 1911);
    }

    @Override // l.InterfaceC2765
    public final int z(InterfaceC4176 interfaceC4176, int i) {
        if (interfaceC4176 instanceof EnumC23288) {
            return interfaceC4176 == EnumC23288.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // l.InterfaceC2765
    public final List x() {
        return AbstractC22791.B(EnumC23288.values());
    }

    @Override // l.InterfaceC2765
    public final C22729 v(EnumC18496 enumC18496) {
        int i = AbstractC20467.a[enumC18496.ordinal()];
        if (i == 1) {
            C22729 c22729 = EnumC18496.PROLEPTIC_MONTH.b;
            return C22729.f(c22729.a - 22932, c22729.d - 22932);
        }
        if (i == 2) {
            C22729 c227210 = EnumC18496.YEAR.b;
            return C22729.g(1L, c227210.d - 1911, (-c227210.a) + 1912);
        }
        if (i != 3) {
            return enumC18496.b;
        }
        C22729 c227211 = EnumC18496.YEAR.b;
        return C22729.f(c227211.a - 1911, c227211.d - 1911);
    }

    @Override // l.AbstractC4944, l.InterfaceC2765
    public final InterfaceC13410 O(Map map, EnumC17126 enumC17126) {
        return (C6355) super.O(map, enumC17126);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.InterfaceC2765
    public final InterfaceC22583 P(C4239 c4239, AbstractC5650 abstractC5650) {
        return C9115.W(this, c4239, abstractC5650);
    }

    public Object writeReplace() {
        return new C7766((byte) 1, this);
    }
}
