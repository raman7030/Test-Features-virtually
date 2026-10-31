package l;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.֫ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1945 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final LinkedHashMap f6494;

    static {
        C10248 c10248 = new C10248("", new C7425[0]);
        EnumC21537 enumC21537 = EnumC21537.ARG_MISMATCH;
        C7425 c7425 = new C7425(enumC21537.m48696(), c10248);
        C11659 c11659 = new C11659(enumC21537.m48696(), c10248, c10248);
        c11659.f34763 = new C6014(c11659);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f6494 = linkedHashMap;
        linkedHashMap.put(c7425, new C22947(0));
        linkedHashMap.put(c11659, new C22947(1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16719 m6407(C5931 c5931, InterfaceC3109 interfaceC3109, C14397 c14397, EnumC12986 enumC12986, C16719 c16719) {
        for (Map.Entry entry : f6494.entrySet()) {
            if (((C7425) entry.getKey()).mo19958(c16719)) {
                C16719 c16719Mo33087 = ((InterfaceC13774) entry.getValue()).mo33087(c5931, interfaceC3109, c14397, enumC12986, c16719);
                c16719Mo33087.m39351(EnumC20043.COMPRESSED);
                return c16719Mo33087;
            }
        }
        return null;
    }
}
