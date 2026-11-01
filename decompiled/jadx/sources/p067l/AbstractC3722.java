package p067l;

/* JADX INFO: renamed from: l.֨᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89EN */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3722 {

    /* JADX INFO: renamed from: ֫ */
    public EnumC10428 f7892;

    public AbstractC3722(EnumC10428 enumC10428) {
        this.f7892 = enumC10428;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m7166(C2460 c2460) {
        C2460 c2461 = new C2460();
        int iMo5153 = mo5153(c2461);
        c2460.m28111((int) this.f7892.getValue());
        c2460.m28111(iMo5153);
        c2460.m3477();
        c2460.m28105(c2461);
        return iMo5153 + 8;
    }

    /* JADX INFO: renamed from: ᩳ */
    public int mo5153(C2460 c2460) {
        throw new UnsupportedOperationException("Should be implemented by specific SMB2NegotiateContext");
    }

    /* JADX INFO: renamed from: ܿ */
    public static AbstractC3722 m7163(C2460 c2460) throws C14862 {
        int iM28125 = c2460.m28125();
        EnumC10428 enumC10428 = (EnumC10428) C16873.m38440(iM28125, EnumC10428.class, null);
        int i = C7746.f20312[enumC10428.ordinal()];
        if (i == 1) {
            C23169 c23169 = new C23169();
            c23169.m7165(c2460);
            return c23169;
        }
        if (i == 2) {
            C3051 c3051 = new C3051();
            c3051.m7165(c2460);
            return c3051;
        }
        if (i == 3) {
            C21158 c21158 = new C21158();
            c21158.m7165(c2460);
            return c21158;
        }
        if (i == 4) {
            C17132 c17132 = new C17132(EnumC10428.SMB2_NETNAME_NEGOTIATE_CONTEXT_ID);
            c17132.m7165(c2460);
            return c17132;
        }
        throw new C12776("Unknown SMB2NegotiateContextType encountered: " + iM28125 + " / " + enumC10428);
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo5152(C2460 c2460) {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7165(C2460 c2460) throws C14862 {
        int iM28125 = c2460.m28125();
        c2460.m28121(4);
        mo5152(c2460);
        int i = iM28125 % 8;
        int i2 = i == 0 ? 0 : 8 - i;
        if (i2 <= 0 || c2460.m28117() < i2) {
            return;
        }
        c2460.m28121(i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC10428 m7164() {
        return this.f7892;
    }
}
