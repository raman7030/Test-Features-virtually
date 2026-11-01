package p067l;

/* JADX INFO: renamed from: l.ۗ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X10D */
/* JADX INFO: loaded from: classes2.dex */
public final class C5463 {
    static {
        C9038.m20941();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21265 m12008(InterfaceC19370 interfaceC19370) {
        if (interfaceC19370.isDirectory() || interfaceC19370.mo39148()) {
            return C21265.f66817;
        }
        if (interfaceC19370.mo39138()) {
            return ((AbstractC19962) interfaceC19370).m45301();
        }
        if (interfaceC19370.getName().equals("payload.bin")) {
            return C21265.f66869;
        }
        return interfaceC19370.mo39139().m9396();
    }
}
