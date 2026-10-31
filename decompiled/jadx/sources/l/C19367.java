package l;

/* JADX INFO: renamed from: l.᩵ۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1Y3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19367 extends AbstractC17955 {
    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ֫ */
    public final String mo1729() {
        return "ParameterString";
    }

    @Override // l.AbstractC17955
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7875(C0657 c0657) {
        return true;
    }

    @Override // l.AbstractC17955
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1730(C1032 c1032, InterfaceC19150 interfaceC19150) {
        if (!c1032.mo3566().contains("StringFog") && !c1032.mo3566().startsWith("Lnp/")) {
            if (!super.mo1730(c1032, interfaceC19150)) {
                return false;
            }
            if (c1032.getParameters().size() != 1) {
                return m41952();
            }
        }
        return true;
    }

    @Override // l.AbstractC17955
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo11597(C1032 c1032) {
        return EnumC15657.STATIC.m36866(c1032.mo3567());
    }
}
