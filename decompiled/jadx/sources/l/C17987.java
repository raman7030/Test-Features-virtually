package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ᩳۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7EK */
/* JADX INFO: loaded from: classes4.dex */
public final class C17987 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final HashMap f56100 = new HashMap(9);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final HashMap f56094 = new HashMap(9);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final HashMap f56098 = new HashMap(10);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final HashMap f56097 = new HashMap(10);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f56093 = new HashMap(10);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final HashMap f56096 = new HashMap(20);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f56095 = new HashMap(20);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final HashMap f56099 = new HashMap(20);

    static {
        for (EnumC10932 enumC10932 : EnumC10932.values()) {
            f56096.put(enumC10932.f32951, enumC10932);
            if (enumC10932.f32953) {
                f56095.put(enumC10932.f32951, enumC10932);
            }
            HashMap map = f56099;
            if (!map.containsKey(Integer.valueOf(enumC10932.f32949))) {
                map.put(Integer.valueOf(enumC10932.f32949), enumC10932);
            }
        }
        for (EnumC16575 enumC16575 : EnumC16575.values()) {
            f56100.put(enumC16575.f50967, enumC16575);
            f56094.put(enumC16575.f50968, enumC16575);
        }
        for (EnumC1759 enumC1759 : EnumC1759.values()) {
            f56098.put(enumC1759.f6107, enumC1759);
            f56097.put(enumC1759.f6108, enumC1759);
        }
        for (EnumC7464 enumC7464 : EnumC7464.values()) {
            f56093.put(Character.valueOf(enumC7464.f22985.charAt(0)), enumC7464);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC10932 m42030(int i) {
        EnumC10932 enumC10932 = (EnumC10932) f56099.get(Integer.valueOf(i));
        return enumC10932 == null ? EnumC10932.f32931 : enumC10932;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static EnumC10932 m42035(String str) {
        return (EnumC10932) f56096.get(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC10932 m42031(String str) {
        return (EnumC10932) f56095.get(str);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static EnumC16575 m42034(String str) {
        return (EnumC16575) f56100.get(str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static EnumC16575 m42033(int i) {
        return (EnumC16575) f56094.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static EnumC1759 m42032(String str) {
        return (EnumC1759) f56098.get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC1759 m42028(int i) {
        return (EnumC1759) f56097.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m42027(String str) {
        EnumC1759 enumC1759 = (EnumC1759) f56098.get(str);
        if (enumC1759 != null) {
            return enumC1759.f6108.intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC7464 m42029(char c) {
        EnumC7464 enumC7464 = (EnumC7464) f56093.get(Character.valueOf(c));
        return enumC7464 == null ? EnumC7464.AE_UNKNOWN : enumC7464;
    }
}
