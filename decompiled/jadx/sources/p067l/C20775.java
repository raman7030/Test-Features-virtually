package p067l;

/* JADX INFO: renamed from: l.᩵ۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1Y3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20775 extends AbstractC19433 {
    @Override // p067l.AbstractC24797
    /* JADX INFO: renamed from: ֫ */
    public final String mo4127() {
        return "ParameterString";
    }

    @Override // p067l.AbstractC19433
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9923(C2993 c2993) {
        return true;
    }

    @Override // p067l.AbstractC19433
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4128(C3349 c3349, InterfaceC20568 interfaceC20568) {
        if (!c3349.mo5853().contains("StringFog") && !c3349.mo5853().startsWith("Lnp/")) {
            if (!super.mo4128(c3349, interfaceC20568)) {
                return false;
            }
            if (c3349.getParameters().size() != 1) {
                return m44201();
            }
        }
        return true;
    }

    @Override // p067l.AbstractC19433
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13533(C3349 c3349) {
        return EnumC17248.STATIC.m39032(c3349.mo5854());
    }
}
