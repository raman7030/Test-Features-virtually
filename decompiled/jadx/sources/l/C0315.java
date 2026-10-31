package l;

/* JADX INFO: renamed from: l.֡ۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 717L */
/* JADX INFO: loaded from: classes3.dex */
public final class C0315 extends AbstractC17955 {
    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo1729() {
        return "ParameterStringString";
    }

    @Override // l.AbstractC17955
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo1730(C1032 c1032, InterfaceC19150 interfaceC19150) {
        if (c1032.mo3566().contains("StringFog") || c1032.mo3566().startsWith("Lnp/")) {
            return true;
        }
        if (!super.mo1730(c1032, interfaceC19150)) {
            return false;
        }
        if (c1032.getParameters().size() == 2) {
            return true;
        }
        return m41952();
    }
}
