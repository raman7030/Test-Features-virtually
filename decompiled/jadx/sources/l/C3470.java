package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۗ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3470 implements InterfaceC4176, Serializable {
    public static final C3470 d;
    public static final C3470[] e;
    public static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient C19056 b;
    public final transient String c;

    @Override // l.InterfaceC2268
    public final /* synthetic */ long G(InterfaceC10030 interfaceC10030) {
        return AbstractC16169.d(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final /* synthetic */ Object T(C8556 c8556) {
        return AbstractC16169.f(this, c8556);
    }

    @Override // l.InterfaceC2268
    public final /* synthetic */ boolean e(InterfaceC10030 interfaceC10030) {
        return AbstractC16169.e(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final /* synthetic */ int l(InterfaceC10030 interfaceC10030) {
        return AbstractC16169.c(this, interfaceC10030);
    }

    static {
        C3470 c3470 = new C3470(-1, C19056.h0(1868, 1, 1), "Meiji");
        d = c3470;
        e = new C3470[]{c3470, new C3470(0, C19056.h0(1912, 7, 30), "Taisho"), new C3470(1, C19056.h0(1926, 12, 25), "Showa"), new C3470(2, C19056.h0(1989, 1, 8), "Heisei"), new C3470(3, C19056.h0(2019, 5, 1), "Reiwa")};
    }

    public final C3470 k() {
        C3470[] c3470Arr = e;
        if (this == c3470Arr[c3470Arr.length - 1]) {
            return null;
        }
        return o(this.a + 1);
    }

    public C3470(int i, C19056 c19056, String str) {
        this.a = i;
        this.b = c19056;
        this.c = str;
    }

    public static C3470 o(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            C3470[] c3470Arr = e;
            if (i2 < c3470Arr.length) {
                return c3470Arr[i2];
            }
        }
        throw new C16232("Invalid era: " + i);
    }

    @Override // l.InterfaceC2974
    public final InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        return interfaceC15672.c(getValue(), EnumC18496.ERA);
    }

    public static C3470 j(C19056 c19056) {
        C3470 c3470;
        if (c19056.c0(C4881.d)) {
            throw new C16232("JapaneseDate before Meiji 6 are not supported");
        }
        int length = e.length;
        do {
            length--;
            if (length < 0) {
                return null;
            }
            c3470 = e[length];
        } while (c19056.compareTo(c3470.b) < 0);
        return c3470;
    }

    @Override // l.InterfaceC4176
    public final int getValue() {
        return this.a;
    }

    @Override // l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        EnumC18496 enumC18496 = EnumC18496.ERA;
        if (interfaceC10030 != enumC18496) {
            return AbstractC5796.d(this, interfaceC10030);
        }
        return C22520.c.v(enumC18496);
    }

    public final String toString() {
        return this.c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C7766((byte) 5, this);
    }
}
