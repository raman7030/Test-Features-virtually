package l;

/* JADX INFO: renamed from: l.᩺۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C23017 extends C18059 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f74091;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23017() {
        super(true);
        boolean z = true;
        m42126((InterfaceC10318) null);
        InterfaceC15673 interfaceC15673M42131 = m42131();
        C2269 c2269 = interfaceC15673M42131 instanceof C2269 ? (C2269) interfaceC15673M42131 : null;
        if (c2269 == null) {
            z = false;
            break;
        }
        C18059 c18059M20123 = c2269.m20123();
        while (!c18059M20123.mo42129()) {
            InterfaceC15673 interfaceC15673M42132 = c18059M20123.m42131();
            C2269 c22610 = interfaceC15673M42132 instanceof C2269 ? (C2269) interfaceC15673M42132 : null;
            if (c22610 == null) {
                z = false;
                break;
            }
            c18059M20123 = c22610.m20123();
        }
        this.f74091 = z;
    }

    @Override // l.C18059
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo42129() {
        return this.f74091;
    }
}
