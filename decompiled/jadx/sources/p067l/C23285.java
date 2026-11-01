package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹ۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5QT */
/* JADX INFO: loaded from: classes.dex */
public final class C23285 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f73274 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final HashMap f73275;

    /* JADX INFO: renamed from: ֫ */
    public static int m51866(String str) {
        Integer num = (Integer) f73275.get(str);
        if (num == null) {
            throw new C17034(null, "Invalid verification error: %s", str);
        }
        return num.intValue();
    }

    static {
        HashMap map = new HashMap();
        f73275 = map;
        C14110.m32032(1, map, "generic-error", 2, "no-such-class");
        C14110.m32032(3, map, "no-such-field", 4, "no-such-method");
        C14110.m32032(5, map, "illegal-class-access", 6, "illegal-field-access");
        C14110.m32032(7, map, "illegal-method-access", 8, "class-change-error");
        map.put("instantiation-error", 9);
    }
}
