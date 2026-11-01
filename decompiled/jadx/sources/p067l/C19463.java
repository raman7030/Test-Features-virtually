package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ᩳۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7EK */
/* JADX INFO: loaded from: classes4.dex */
public final class C19463 {

    /* JADX INFO: renamed from: ᩻ */
    public static final HashMap f59297 = new HashMap(9);

    /* JADX INFO: renamed from: ۜ */
    public static final HashMap f59291 = new HashMap(9);

    /* JADX INFO: renamed from: ܿ */
    public static final HashMap f59295 = new HashMap(10);

    /* JADX INFO: renamed from: ܽ */
    public static final HashMap f59294 = new HashMap(10);

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f59290 = new HashMap(10);

    /* JADX INFO: renamed from: ܳ */
    public static final HashMap f59293 = new HashMap(20);

    /* JADX INFO: renamed from: ۧ */
    public static final HashMap f59292 = new HashMap(20);

    /* JADX INFO: renamed from: ᩳ */
    public static final HashMap f59296 = new HashMap(20);

    static {
        for (EnumC12758 enumC12758 : EnumC12758.values()) {
            f59293.put(enumC12758.f35929, enumC12758);
            if (enumC12758.f35931) {
                f59292.put(enumC12758.f35929, enumC12758);
            }
            HashMap map = f59296;
            if (!map.containsKey(Integer.valueOf(enumC12758.f35927))) {
                map.put(Integer.valueOf(enumC12758.f35927), enumC12758);
            }
        }
        for (EnumC18121 enumC18121 : EnumC18121.values()) {
            f59297.put(enumC18121.f54144, enumC18121);
            f59291.put(enumC18121.f54145, enumC18121);
        }
        for (EnumC4040 enumC4040 : EnumC4040.values()) {
            f59295.put(enumC4040.f8883, enumC4040);
            f59294.put(enumC4040.f8884, enumC4040);
        }
        for (EnumC9462 enumC9462 : EnumC9462.values()) {
            f59290.put(Character.valueOf(enumC9462.f25898.charAt(0)), enumC9462);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static EnumC12758 m44280(int i) {
        EnumC12758 enumC12758 = (EnumC12758) f59296.get(Integer.valueOf(i));
        return enumC12758 == null ? EnumC12758.f35909 : enumC12758;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static EnumC12758 m44285(String str) {
        return (EnumC12758) f59293.get(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static EnumC12758 m44281(String str) {
        return (EnumC12758) f59292.get(str);
    }

    /* JADX INFO: renamed from: ܿ */
    public static EnumC18121 m44284(String str) {
        return (EnumC18121) f59297.get(str);
    }

    /* JADX INFO: renamed from: ܽ */
    public static EnumC18121 m44283(int i) {
        return (EnumC18121) f59291.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ܽ */
    public static EnumC4040 m44282(String str) {
        return (EnumC4040) f59295.get(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC4040 m44278(int i) {
        return (EnumC4040) f59294.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m44277(String str) {
        EnumC4040 enumC4040 = (EnumC4040) f59295.get(str);
        if (enumC4040 != null) {
            return enumC4040.f8884.intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC9462 m44279(char c) {
        EnumC9462 enumC9462 = (EnumC9462) f59290.get(Character.valueOf(c));
        return enumC9462 == null ? EnumC9462.AE_UNKNOWN : enumC9462;
    }
}
