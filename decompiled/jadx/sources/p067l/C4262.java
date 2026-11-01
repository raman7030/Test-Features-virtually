package p067l;

/* JADX INFO: renamed from: l.֫ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BCT */
/* JADX INFO: loaded from: classes3.dex */
public final class C4262 extends AbstractC15620 {

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC3830[] f9452;

    @Override // p067l.AbstractC15620
    /* JADX INFO: renamed from: ֨ */
    public final C4262 mo8655() {
        return this;
    }

    public C4262(int i) {
        super(i != 0);
        this.f9452 = new InterfaceC3830[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4262 m8656(C4262 c4262) {
        InterfaceC3830[] interfaceC3830Arr = this.f9452;
        if (this != c4262) {
            try {
                int length = interfaceC3830Arr.length;
                if (c4262.f9452.length != length) {
                    throw new C4933("mismatched maxLocals values", null);
                }
                C4262 c4262Mo8662 = null;
                for (int i = 0; i < length; i++) {
                    InterfaceC3830 interfaceC3830 = interfaceC3830Arr[i];
                    InterfaceC3830 interfaceC3830M53421 = C24158.m53421(interfaceC3830, c4262.f9452[i]);
                    if (interfaceC3830M53421 != interfaceC3830) {
                        if (c4262Mo8662 == null) {
                            c4262Mo8662 = mo8662();
                        }
                        if (interfaceC3830M53421 != null) {
                            c4262Mo8662.mo8659(i, interfaceC3830M53421);
                        } else {
                            c4262Mo8662.m46001();
                            c4262Mo8662.f9452[i] = null;
                        }
                    }
                }
                if (c4262Mo8662 != null) {
                    c4262Mo8662.mo22326();
                    return c4262Mo8662;
                }
            } catch (C4933 e) {
                e.m23570("underlay locals:");
                mo8660(e);
                e.m23570("overlay locals:");
                c4262.mo8660(e);
                throw e;
            }
        }
        return this;
    }

    @Override // p067l.AbstractC15620
    /* JADX INFO: renamed from: ۚ */
    public final C4262 mo8662() {
        InterfaceC3830[] interfaceC3830Arr = this.f9452;
        C4262 c4262 = new C4262(interfaceC3830Arr.length);
        System.arraycopy(interfaceC3830Arr, 0, c4262.f9452, 0, interfaceC3830Arr.length);
        return c4262;
    }

    @Override // p067l.AbstractC15620
    /* JADX INFO: renamed from: ֫ */
    public final void mo8660(C4933 c4933) {
        int i = 0;
        while (true) {
            InterfaceC3830[] interfaceC3830Arr = this.f9452;
            if (i >= interfaceC3830Arr.length) {
                return;
            }
            InterfaceC3830 interfaceC3830 = interfaceC3830Arr[i];
            c4933.m23570("locals[" + C16351.m37153(i) + "]: " + (interfaceC3830 == null ? "<invalid>" : interfaceC3830.toString()));
            i++;
        }
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            InterfaceC3830[] interfaceC3830Arr = this.f9452;
            if (i < interfaceC3830Arr.length) {
                InterfaceC3830 interfaceC3830 = interfaceC3830Arr[i];
                sb.append("locals[" + C16351.m37153(i) + "]: " + (interfaceC3830 == null ? "<invalid>" : interfaceC3830.toString()) + "\n");
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override // p067l.AbstractC15620
    /* JADX INFO: renamed from: ۧ */
    public final void mo8664(C9566 c9566) {
        InterfaceC3830[] interfaceC3830Arr = this.f9452;
        int length = interfaceC3830Arr.length;
        if (length == 0) {
            return;
        }
        m46001();
        C9566 c9566M22282 = c9566.m22282();
        for (int i = 0; i < length; i++) {
            if (interfaceC3830Arr[i] == c9566) {
                interfaceC3830Arr[i] = c9566M22282;
            }
        }
    }

    /* JADX INFO: renamed from: ۠ */
    public final int m8663() {
        return this.f9452.length;
    }

    @Override // p067l.AbstractC15620
    /* JADX INFO: renamed from: ֫ */
    public final void mo8659(int i, InterfaceC3830 interfaceC3830) {
        int i2;
        InterfaceC3830 interfaceC3831;
        m46001();
        try {
            InterfaceC3830 interfaceC3830Mo7483 = interfaceC3830.mo7483();
            if (i < 0) {
                throw new IndexOutOfBoundsException("idx < 0");
            }
            boolean zM22285 = interfaceC3830Mo7483.getType().m22285();
            InterfaceC3830[] interfaceC3830Arr = this.f9452;
            if (zM22285) {
                interfaceC3830Arr[i + 1] = null;
            }
            interfaceC3830Arr[i] = interfaceC3830Mo7483;
            if (i == 0 || (interfaceC3831 = interfaceC3830Arr[(i2 = i - 1)]) == null || !interfaceC3831.getType().m22285()) {
                return;
            }
            interfaceC3830Arr[i2] = null;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    @Override // p067l.AbstractC15620
    /* JADX INFO: renamed from: ֫ */
    public final void mo8661(C22783 c22783) {
        mo8659(c22783.m50989(), c22783);
    }

    @Override // p067l.AbstractC15620
    public final InterfaceC3830 get(int i) {
        InterfaceC3830 interfaceC3830 = this.f9452[i];
        if (interfaceC3830 != null) {
            return interfaceC3830;
        }
        throw new C4933("local " + C16351.m37153(i) + ": invalid", null);
    }

    @Override // p067l.AbstractC15620
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15620 mo8658(AbstractC15620 abstractC15620) {
        if (abstractC15620 instanceof C4262) {
            return m8656((C4262) abstractC15620);
        }
        return abstractC15620.mo8658(this);
    }

    @Override // p067l.AbstractC15620
    /* JADX INFO: renamed from: ֫ */
    public final C9586 mo8657(AbstractC15620 abstractC15620, int i) {
        return new C9586(this.f9452.length).mo8657(abstractC15620, i);
    }
}
