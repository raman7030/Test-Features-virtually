package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7D8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22593 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f73024 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f73025 = new HashMap(301);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final HashMap f73026 = new HashMap(301);

    static {
        for (EnumC15536 enumC15536 : EnumC15536.values()) {
            f73025.put(enumC15536.f47842, enumC15536);
            HashMap map = f73026;
            map.put(enumC15536.f47844, enumC15536);
            if (enumC15536.f47845 != null) {
                map.put(enumC15536.f47845, enumC15536);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC15536 m50570(String str) {
        return (EnumC15536) f73026.get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC15536 m50569(Integer num) {
        return (EnumC15536) f73025.get(num);
    }
}
