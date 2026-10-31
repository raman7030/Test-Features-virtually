package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܰ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13667 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f40748;

    static {
        HashMap map = new HashMap();
        f40748 = map;
        map.put("DES/ECB/NoPadding", new C12257());
        map.put("RC4", new C5907());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC19314 m32835() {
        InterfaceC20203 interfaceC20203 = (InterfaceC20203) f40748.get("RC4");
        if (interfaceC20203 == null) {
            throw new IllegalArgumentException("Unknown Cipher RC4");
        }
        return (InterfaceC19314) interfaceC20203.create();
    }
}
