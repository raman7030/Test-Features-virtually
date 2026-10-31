package l;

/* JADX INFO: renamed from: l.֨᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89EN */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1424 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC8480 f5119;

    public AbstractC1424(EnumC8480 enumC8480) {
        this.f5119 = enumC8480;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m4924(C0097 c0097) {
        C0097 c0098 = new C0097();
        int iMo2824 = mo2824(c0098);
        c0097.m26086((int) this.f5119.getValue());
        c0097.m26086(iMo2824);
        c0097.m1081();
        c0097.m26080(c0098);
        return iMo2824 + 8;
    }

    /* JADX INFO: renamed from: ᩳ */
    public int mo2824(C0097 c0097) {
        throw new UnsupportedOperationException("Should be implemented by specific SMB2NegotiateContext");
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static AbstractC1424 m4921(C0097 c0097) throws C13146 {
        int iM26100 = c0097.m26100();
        EnumC8480 enumC8480 = (EnumC8480) C15262.m36279(iM26100, EnumC8480.class, null);
        int i = C5658.f17465[enumC8480.ordinal()];
        if (i == 1) {
            C21886 c21886 = new C21886();
            c21886.m4923(c0097);
            return c21886;
        }
        if (i == 2) {
            C0718 c0718 = new C0718();
            c0718.m4923(c0097);
            return c0718;
        }
        if (i == 3) {
            C19770 c19770 = new C19770();
            c19770.m4923(c0097);
            return c19770;
        }
        if (i == 4) {
            C15534 c15534 = new C15534(EnumC8480.SMB2_NETNAME_NEGOTIATE_CONTEXT_ID);
            c15534.m4923(c0097);
            return c15534;
        }
        throw new C10951("Unknown SMB2NegotiateContextType encountered: " + iM26100 + " / " + enumC8480);
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo2823(C0097 c0097) {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4923(C0097 c0097) throws C13146 {
        int iM26100 = c0097.m26100();
        c0097.m26096(4);
        mo2823(c0097);
        int i = iM26100 % 8;
        int i2 = i == 0 ? 0 : 8 - i;
        if (i2 <= 0 || c0097.m26092() < i2) {
            return;
        }
        c0097.m26096(i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC8480 m4922() {
        return this.f5119;
    }
}
