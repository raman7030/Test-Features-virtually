package l;

import java.util.logging.Logger;

/* JADX INFO: renamed from: l.᩷ۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C20663 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC6551 f66541 = EnumC6551.PUBLIC;

    static {
        String.format("%d.%d.%d%s", 4, 27, 2, "");
        Logger.getLogger(C20663.class.getName());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47279(EnumC6551 enumC6551, String str) {
        String str2 = System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        if (str2 == null || !str2.equals("true")) {
            String str3 = System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
            if (str3 == null || !str3.equals("true")) {
                String.format("%d.%d.%d%s", 4, 27, 2, "");
                EnumC6551 enumC6552 = f66541;
                if (enumC6551 == enumC6552) {
                    return;
                }
                throw new C23484("Detected mismatched Protobuf Gencode/Runtime domains when loading " + str + ": gencode " + enumC6551 + ", runtime " + enumC6552 + ". Cross-domain usage of Protobuf is not supported.");
            }
        }
    }
}
