package p067l;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.֫ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4217 {

    /* JADX INFO: renamed from: ֫ */
    public static final LinkedHashMap f9273;

    static {
        C12108 c12108 = new C12108("", new C9425[0]);
        EnumC22837 enumC22837 = EnumC22837.ARG_MISMATCH;
        C9425 c9425 = new C9425(enumC22837.m51041(), c12108);
        C13449 c13449 = new C13449(enumC22837.m51041(), c12108, c12108);
        c13449.f37762 = new C8084(c13449);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f9273 = linkedHashMap;
        linkedHashMap.put(c9425, new C24177(0));
        linkedHashMap.put(c13449, new C24177(1));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18258 m8564(C8005 c8005, InterfaceC5323 interfaceC5323, C16051 c16051, EnumC14710 enumC14710, C18258 c18258) {
        for (Map.Entry entry : f9273.entrySet()) {
            if (((C9425) entry.getKey()).mo21932(c18258)) {
                C18258 c18258Mo35203 = ((InterfaceC15459) entry.getValue()).mo35203(c8005, interfaceC5323, c16051, enumC14710, c18258);
                c18258Mo35203.m41587(EnumC21417.COMPRESSED);
                return c18258Mo35203;
            }
        }
        return null;
    }
}
