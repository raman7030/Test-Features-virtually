package l;

/* JADX INFO: renamed from: l.۟۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4QP */
/* JADX INFO: loaded from: classes4.dex */
public final class C7459 extends AbstractC7479 implements InterfaceC0367, InterfaceC0804 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f22887 = EnumC3664.Format20bc;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f22888;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC8293 f22889;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315;
    }

    public C7459(EnumC0841 enumC0841, int i, InterfaceC8293 interfaceC8293) {
        super(enumC0841);
        int i2 = C22009.f70561;
        if (i > 0 && i < 10) {
            this.f22888 = i;
            this.f22889 = interfaceC8293;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid verification error value: %d. Must be between 1 and 9, inclusive", Integer.valueOf(i)));
    }

    @Override // l.InterfaceC0367
    /* JADX INFO: renamed from: ᩵ */
    public final int mo1819() {
        return this.f22888;
    }

    @Override // l.InterfaceC10952
    public final InterfaceC8293 getReference() {
        return this.f22889;
    }

    @Override // l.InterfaceC0804
    /* JADX INFO: renamed from: ֫ */
    public final void mo3030(C19357 c19357) {
        this.f22889 = c19357.m44609(this.f22889);
    }

    @Override // l.InterfaceC10952
    /* JADX INFO: renamed from: ֡ */
    public final int mo3609() {
        InterfaceC8293 interfaceC8293 = this.f22889;
        if (interfaceC8293 instanceof InterfaceC15347) {
            return 0;
        }
        if (interfaceC8293 instanceof InterfaceC21699) {
            return 1;
        }
        if (interfaceC8293 instanceof InterfaceC18877) {
            return 2;
        }
        if (interfaceC8293 instanceof InterfaceC5471) {
            return 3;
        }
        if (interfaceC8293 instanceof InterfaceC0531) {
            return 4;
        }
        if (interfaceC8293 instanceof InterfaceC4060) {
            return 5;
        }
        if (interfaceC8293 instanceof InterfaceC19583) {
            return 6;
        }
        throw new IllegalStateException("Invalid reference");
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f22887;
    }
}
