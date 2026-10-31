package l;

/* JADX INFO: renamed from: l.ۗ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X10D */
/* JADX INFO: loaded from: classes2.dex */
public final class C3256 {
    static {
        C7017.m18984();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19883 m9975(InterfaceC17889 interfaceC17889) {
        if (interfaceC17889.isDirectory() || interfaceC17889.mo36982()) {
            return C19883.f64181;
        }
        if (interfaceC17889.mo36972()) {
            return ((AbstractC18512) interfaceC17889).m43023();
        }
        if (interfaceC17889.getName().equals("payload.bin")) {
            return C19883.f64233;
        }
        return interfaceC17889.mo36973().m7317();
    }
}
