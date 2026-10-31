package l;

/* JADX INFO: renamed from: l.۫ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12187 implements InterfaceC2268 {
    public final /* synthetic */ InterfaceC13410 a;
    public final /* synthetic */ InterfaceC2268 b;
    public final /* synthetic */ InterfaceC2765 c;
    public final /* synthetic */ AbstractC5650 d;

    @Override // l.InterfaceC2268
    public final /* synthetic */ int l(InterfaceC10030 interfaceC10030) {
        return AbstractC5796.a(this, interfaceC10030);
    }

    public C12187(InterfaceC13410 interfaceC13410, InterfaceC2268 interfaceC2268, InterfaceC2765 interfaceC2765, AbstractC5650 abstractC5650) {
        this.a = interfaceC13410;
        this.b = interfaceC2268;
        this.c = interfaceC2765;
        this.d = abstractC5650;
    }

    @Override // l.InterfaceC2268
    public final boolean e(InterfaceC10030 interfaceC10030) {
        InterfaceC13410 interfaceC13410 = this.a;
        if (interfaceC13410 != null && interfaceC10030.isDateBased()) {
            return interfaceC13410.e(interfaceC10030);
        }
        return this.b.e(interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        InterfaceC13410 interfaceC13410 = this.a;
        if (interfaceC13410 != null && interfaceC10030.isDateBased()) {
            return interfaceC13410.n(interfaceC10030);
        }
        return this.b.n(interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        InterfaceC13410 interfaceC13410 = this.a;
        if (interfaceC13410 != null && interfaceC10030.isDateBased()) {
            return interfaceC13410.G(interfaceC10030);
        }
        return this.b.G(interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final Object T(C8556 c8556) {
        if (c8556 == AbstractC5796.b) {
            return this.c;
        }
        if (c8556 == AbstractC5796.a) {
            return this.d;
        }
        if (c8556 == AbstractC5796.c) {
            return this.b.T(c8556);
        }
        return c8556.h(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        InterfaceC2765 interfaceC2765 = this.c;
        if (interfaceC2765 != null) {
            str = " with chronology " + interfaceC2765;
        } else {
            str = "";
        }
        AbstractC5650 abstractC5650 = this.d;
        if (abstractC5650 != null) {
            str2 = " with zone " + abstractC5650;
        }
        return this.b + str + str2;
    }
}
