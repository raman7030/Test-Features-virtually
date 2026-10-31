package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܽ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9KI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16325 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f50272;

    static {
        HashMap map = new HashMap();
        f50272 = map;
        map.put("KDF/Counter/HMACSHA256", new C1509());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC0262 m38473() {
        InterfaceC20203 interfaceC20203 = (InterfaceC20203) f50272.get("KDF/Counter/HMACSHA256");
        if (interfaceC20203 == null) {
            throw new IllegalArgumentException("Unknown DerivationFunction KDF/Counter/HMACSHA256");
        }
        return (InterfaceC0262) interfaceC20203.create();
    }
}
