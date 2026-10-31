package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹ۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5QT */
/* JADX INFO: loaded from: classes.dex */
public final class C22009 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f70561 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f70562;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m49531(String str) {
        Integer num = (Integer) f70562.get(str);
        if (num == null) {
            throw new C15431(null, "Invalid verification error: %s", str);
        }
        return num.intValue();
    }

    static {
        HashMap map = new HashMap();
        f70562 = map;
        C12354.m29971(1, map, "generic-error", 2, "no-such-class");
        C12354.m29971(3, map, "no-such-field", 4, "no-such-method");
        C12354.m29971(5, map, "illegal-class-access", 6, "illegal-field-access");
        C12354.m29971(7, map, "illegal-method-access", 8, "class-change-error");
        map.put("instantiation-error", 9);
    }
}
