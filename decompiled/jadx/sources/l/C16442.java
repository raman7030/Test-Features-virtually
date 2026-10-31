package l;

/* JADX INFO: renamed from: l.ܽۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 59UK */
/* JADX INFO: loaded from: classes5.dex */
public final class C16442 extends AbstractC17854 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f50563 = C11321.m27961(C16442.class);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C18267 f50564;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f50565;

    @Override // l.AbstractC17854
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo27000() {
        return false;
    }

    @Override // l.AbstractC17854
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC14325[] mo27004() {
        InterfaceC14325[] interfaceC14325ArrM42599 = this.f50564.m42599();
        return interfaceC14325ArrM42599 == null ? new InterfaceC14325[0] : interfaceC14325ArrM42599;
    }

    @Override // l.AbstractC17854
    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC14325 mo27001() throws C3037 {
        C3618 c3618M41827 = m41827();
        C2039 c2039 = new C2039(((C12914) m41828()).f38759.m41529(), c3618M41827.m11094());
        c2039.m6632(1);
        c2039.m6633(129);
        C16855 c16855 = new C16855(c3618M41827.m11094(), C10485.f31453);
        c16855.m39627("*");
        c2039.mo10438(c16855);
        try {
            this.f50565 = ((C11212) c3618M41827.m11087(c2039, null, new EnumC0214[0])).m27780();
            this.f50564 = (C18267) c16855.mo5429();
            InterfaceC14325 interfaceC14325M41825 = m41825(false);
            if (interfaceC14325M41825 == null) {
                m41826();
            }
            return interfaceC14325M41825;
        } catch (C3037 e) {
            C11212 c11212 = (C11212) c2039.mo5429();
            if (c11212 != null && c11212.mo28213() && c11212.m10446() == 0) {
                try {
                    c3618M41827.m11087(new C14011(c3618M41827.m11094(), c11212.m27780()), null, new EnumC0214[0]);
                } catch (C3037 e2) {
                    e.addSuppressed(e2);
                }
            }
            C18267 c18267 = (C18267) c16855.mo5429();
            if (c18267 != null && c18267.mo28213() && c18267.m10446() == -1073741809) {
                m41826();
                return null;
            }
            throw e;
        }
    }

    @Override // l.AbstractC17854
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo27003() throws C3037 {
        InterfaceC14325[] interfaceC14325ArrM42599 = this.f50564.m42599();
        C3618 c3618M41827 = m41827();
        C16855 c16855 = new C16855(c3618M41827.m11094(), this.f50565);
        c16855.m39627("*");
        c16855.m39628(interfaceC14325ArrM42599[interfaceC14325ArrM42599.length - 1].mo3113());
        c16855.m39626();
        try {
            C18267 c18267 = (C18267) c3618M41827.m11087(c16855, null, new EnumC0214[0]);
            if (c18267.m10446() == -2147483642) {
                return false;
            }
            this.f50564 = c18267;
            return true;
        } catch (C3037 e) {
            if (e.m9291() == -2147483642) {
                f50563.mo7081("End of listing", (Exception) e);
                return false;
            }
            throw e;
        }
    }

    @Override // l.AbstractC17854
    /* JADX INFO: renamed from: ܽ */
    public final void mo27002() {
        try {
            C3618 c3618M41827 = m41827();
            if (this.f50565 != null && c3618M41827.m11095()) {
                c3618M41827.m11087(new C14011(c3618M41827.m11094(), this.f50565), null, new EnumC0214[0]);
            }
        } finally {
            this.f50565 = null;
        }
    }
}
