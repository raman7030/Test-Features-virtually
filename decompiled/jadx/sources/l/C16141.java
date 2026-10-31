package l;

/* JADX INFO: renamed from: l.ܺ᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6782 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16141 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m38053(String str) {
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
        throw C6411.m17739((RuntimeException) new IllegalArgumentException("invalid sort method"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9087 m38052(String str) {
        Integer num = (Integer) C19890.f64282.get("local:" + str);
        if (num == null) {
            return null;
        }
        return new C9087(C7489.m20112(num.intValue()), C7489.m20122(num.intValue()));
    }
}
