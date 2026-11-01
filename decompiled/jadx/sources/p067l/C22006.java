package p067l;

import java.util.logging.Logger;

/* JADX INFO: renamed from: l.᩷ۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C22006 {

    /* JADX INFO: renamed from: ֫ */
    public static final EnumC8594 f69223 = EnumC8594.PUBLIC;

    static {
        String.format("%d.%d.%d%s", 4, 27, 2, "");
        Logger.getLogger(C22006.class.getName());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49606(EnumC8594 enumC8594, String str) {
        String str2 = System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        if (str2 == null || !str2.equals("true")) {
            String str3 = System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
            if (str3 == null || !str3.equals("true")) {
                String.format("%d.%d.%d%s", 4, 27, 2, "");
                EnumC8594 enumC8595 = f69223;
                if (enumC8594 == enumC8595) {
                    return;
                }
                throw new C24687("Detected mismatched Protobuf Gencode/Runtime domains when loading " + str + ": gencode " + enumC8594 + ", runtime " + enumC8595 + ". Cross-domain usage of Protobuf is not supported.");
            }
        }
    }
}
