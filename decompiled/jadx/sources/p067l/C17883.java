package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܽ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9KI */
/* JADX INFO: loaded from: classes4.dex */
public final class C17883 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f53444;

    static {
        HashMap map = new HashMap();
        f53444 = map;
        map.put("KDF/Counter/HMACSHA256", new C3802());
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC2617 m40688() {
        InterfaceC21569 interfaceC21569 = (InterfaceC21569) f53444.get("KDF/Counter/HMACSHA256");
        if (interfaceC21569 == null) {
            throw new IllegalArgumentException("Unknown DerivationFunction KDF/Counter/HMACSHA256");
        }
        return (InterfaceC2617) interfaceC21569.create();
    }
}
