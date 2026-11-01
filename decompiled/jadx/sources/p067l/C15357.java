package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܰ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C15357 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f43829;

    static {
        HashMap map = new HashMap();
        f43829 = map;
        map.put("DES/ECB/NoPadding", new C14017());
        map.put("RC4", new C7982());
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC20724 m34950() {
        InterfaceC21569 interfaceC21569 = (InterfaceC21569) f43829.get("RC4");
        if (interfaceC21569 == null) {
            throw new IllegalArgumentException("Unknown Cipher RC4");
        }
        return (InterfaceC20724) interfaceC21569.create();
    }
}
