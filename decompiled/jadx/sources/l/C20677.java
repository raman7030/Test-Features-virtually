package l;

/* JADX INFO: renamed from: l.᩷ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R9WG */
/* JADX INFO: loaded from: classes5.dex */
public final class C20677 implements InterfaceC5257 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f66623 = C11321.m27961(C20677.class);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C3618 f66624;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f66625;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f66626;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7229 f66627;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC14325 f66628;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22751 f66629;

    public C20677(C12914 c12914, C3618 c3618) throws Exception {
        C17729 c17729 = c12914.f38759;
        boolean z = c17729.m41520() == 2;
        this.f66626 = z;
        if (c17729.m41522().getHost().isEmpty()) {
            this.f66629 = new C22751(c3618.m11094(), c3618.m11093(), Integer.MIN_VALUE);
            this.f66627 = new C7229(c3618.m11094());
        } else if (z) {
            this.f66629 = new C22751(c3618.m11094(), c17729.m41522().getHost(), -1);
            this.f66627 = new C7229(c3618.m11094());
        } else {
            throw new C3037("The requested list operations is invalid: " + c17729.m41522());
        }
        c3618.m11088();
        this.f66624 = c3618;
        try {
            c3618.m11087(this.f66629, this.f66627, new EnumC0214[0]);
            m47293();
            InterfaceC14325 interfaceC14325M47292 = m47292();
            if (interfaceC14325M47292 == null) {
                c3618.m11101();
                this.f66628 = null;
            }
            this.f66628 = interfaceC14325M47292;
        } catch (Exception e) {
            this.f66624.m11101();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m47293() throws C3037 {
        int iM41008 = this.f66627.m41008();
        if (iM41008 == 2184) {
            throw new C0089();
        }
        if (iM41008 != 0 && iM41008 != 234) {
            throw new C3037(iM41008, true);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC14325 m47292() throws C3037 {
        C7229 c7229 = this.f66627;
        if (this.f66625 < (c7229.m41008() == 234 ? c7229.m41013() - 1 : c7229.m41013())) {
            InterfaceC14325[] interfaceC14325ArrM41007 = c7229.m41007();
            int i = this.f66625;
            InterfaceC14325 interfaceC14325 = interfaceC14325ArrM41007[i];
            this.f66625 = i + 1;
            interfaceC14325.getClass();
            return interfaceC14325;
        }
        if (!this.f66626 || c7229.m41008() != 234) {
            return null;
        }
        String strM19330 = c7229.m19330();
        C22751 c22751 = this.f66629;
        c22751.m50829(0, strM19330);
        c7229.reset();
        c22751.m42530((byte) -41);
        this.f66624.m11087(c22751, c7229, new EnumC0214[0]);
        m47293();
        this.f66625 = 0;
        return m47292();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f66628 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC14325 interfaceC14325 = this.f66628;
        try {
            InterfaceC14325 interfaceC14325M47292 = m47292();
            if (interfaceC14325M47292 != null) {
                this.f66628 = interfaceC14325M47292;
                return interfaceC14325;
            }
            this.f66624.m11101();
            this.f66628 = null;
            return interfaceC14325;
        } catch (C19369 e) {
            f66623.mo7083("Enumeration failed", (Throwable) e);
            this.f66628 = null;
            return interfaceC14325;
        }
    }

    @Override // l.InterfaceC5257, java.lang.AutoCloseable
    public final void close() {
        if (this.f66628 != null) {
            this.f66624.m11101();
            this.f66628 = null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
