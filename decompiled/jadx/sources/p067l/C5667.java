package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۗ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5667 implements InterfaceC6338, Serializable {

    /* JADX INFO: renamed from: d */
    public static final C5667 f13786d;

    /* JADX INFO: renamed from: e */
    public static final C5667[] f13787e;
    public static final long serialVersionUID = 1466499369062886794L;

    /* JADX INFO: renamed from: a */
    public final transient int f13788a;

    /* JADX INFO: renamed from: b */
    public final transient C20480 f13789b;

    /* JADX INFO: renamed from: c */
    public final transient String f13790c;

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final /* synthetic */ long mo6949G(InterfaceC11901 interfaceC11901) {
        return AbstractC17736.m40302d(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: T */
    public final /* synthetic */ Object mo6950T(C10500 c10500) {
        return AbstractC17736.m40304f(this, c10500);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean mo6951e(InterfaceC11901 interfaceC11901) {
        return AbstractC17736.m40303e(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int mo6952l(InterfaceC11901 interfaceC11901) {
        return AbstractC17736.m40301c(this, interfaceC11901);
    }

    static {
        C5667 c5667 = new C5667(-1, C20480.m46187h0(1868, 1, 1), "Meiji");
        f13786d = c5667;
        f13787e = new C5667[]{c5667, new C5667(0, C20480.m46187h0(1912, 7, 30), "Taisho"), new C5667(1, C20480.m46187h0(1926, 12, 25), "Showa"), new C5667(2, C20480.m46187h0(1989, 1, 8), "Heisei"), new C5667(3, C20480.m46187h0(2019, 5, 1), "Reiwa")};
    }

    /* JADX INFO: renamed from: k */
    public final C5667 m12626k() {
        C5667[] c5667Arr = f13787e;
        if (this == c5667Arr[c5667Arr.length - 1]) {
            return null;
        }
        return m12625o(this.f13788a + 1);
    }

    public C5667(int i, C20480 c20480, String str) {
        this.f13788a = i;
        this.f13789b = c20480;
        this.f13790c = str;
    }

    /* JADX INFO: renamed from: o */
    public static C5667 m12625o(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            C5667[] c5667Arr = f13787e;
            if (i2 < c5667Arr.length) {
                return c5667Arr[i2];
            }
        }
        throw new C17796("Invalid era: " + i);
    }

    @Override // p067l.InterfaceC5195
    /* JADX INFO: renamed from: s */
    public final InterfaceC17263 mo6954s(InterfaceC17263 interfaceC17263) {
        return interfaceC17263.mo7152c(getValue(), EnumC19947.ERA);
    }

    /* JADX INFO: renamed from: j */
    public static C5667 m12624j(C20480 c20480) {
        C5667 c5667;
        if (c20480.m46196c0(C7008.f18257d)) {
            throw new C17796("JapaneseDate before Meiji 6 are not supported");
        }
        int length = f13787e.length;
        do {
            length--;
            if (length < 0) {
                return null;
            }
            c5667 = f13787e[length];
        } while (c20480.compareTo(c5667.f13789b) < 0);
        return c5667;
    }

    @Override // p067l.InterfaceC6338
    public final int getValue() {
        return this.f13788a;
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        EnumC19947 enumC19947 = EnumC19947.ERA;
        if (interfaceC11901 != enumC19947) {
            return AbstractC7877.m18196d(this, interfaceC11901);
        }
        return C23772.f75602c.mo10588v(enumC19947);
    }

    public final String toString() {
        return this.f13790c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C9750((byte) 5, this);
    }
}
