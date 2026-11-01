package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7D8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23841 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f75751 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final HashMap f75752 = new HashMap(301);

    /* JADX INFO: renamed from: ܽ */
    public static final HashMap f75753 = new HashMap(301);

    static {
        for (EnumC17134 enumC17134 : EnumC17134.values()) {
            f75752.put(enumC17134.f50974, enumC17134);
            HashMap map = f75753;
            map.put(enumC17134.f50976, enumC17134);
            if (enumC17134.f50977 != null) {
                map.put(enumC17134.f50977, enumC17134);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC17134 m52912(String str) {
        return (EnumC17134) f75753.get(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC17134 m52911(Integer num) {
        return (EnumC17134) f75752.get(num);
    }
}
