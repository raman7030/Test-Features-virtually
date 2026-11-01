package p067l;

/* JADX INFO: renamed from: l.ܺ᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6782 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17709 {
    /* JADX INFO: renamed from: ۧ */
    public static int m40245(String str) {
        if ("name".equals(str)) {
            return 0;
        }
        if ("date".equals(str)) {
            return 1;
        }
        if ("size".equals(str)) {
            return 2;
        }
        if ("type".equals(str)) {
            return 3;
        }
        throw C8461.m19686((RuntimeException) new IllegalArgumentException("invalid sort method"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11005 m40244(String str) {
        Integer num = (Integer) C21272.f66918.get("local:" + str);
        if (num == null) {
            return null;
        }
        return new C11005(C9486.m22088(num.intValue()), C9486.m22098(num.intValue()));
    }
}
