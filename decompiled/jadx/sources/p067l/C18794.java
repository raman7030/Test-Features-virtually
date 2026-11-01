package p067l;

import java.text.ParseException;

/* JADX INFO: renamed from: l.ܿۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5R0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18794 {

    /* JADX INFO: renamed from: ܽ */
    public static final ThreadLocal f56144 = new C4042();

    /* JADX INFO: renamed from: ֫ */
    public static final ThreadLocal f56142 = new C12760();

    /* JADX INFO: renamed from: ۧ */
    public static final ThreadLocal f56143 = new C18123();

    /* JADX INFO: renamed from: ᩳ */
    public static int f56145 = 0;

    /* JADX INFO: renamed from: ֫ */
    public static void m42825(int i) {
        if (i < 0 || i > 2) {
            return;
        }
        f56145 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m42824(long j, boolean z, boolean z2) {
        int i = f56145;
        if (i == 1) {
            return ((C19465) f56142.get()).m44286(j, z, z2);
        }
        if (i == 2) {
            return ((C19465) f56143.get()).m44286(j, z, z2);
        }
        return ((C19465) f56144.get()).m44286(j, z, z2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m42823(long j) {
        C19465 c19465;
        int i = f56145;
        if (i == 1) {
            c19465 = (C19465) f56142.get();
        } else if (i == 2) {
            c19465 = (C19465) f56143.get();
        } else {
            c19465 = (C19465) f56144.get();
        }
        return c19465.f59300.format(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m42828(long j) {
        C19465 c19465;
        int i = f56145;
        if (i == 1) {
            c19465 = (C19465) f56142.get();
        } else if (i == 2) {
            c19465 = (C19465) f56143.get();
        } else {
            c19465 = (C19465) f56144.get();
        }
        return c19465.f59301.format(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m42827(long j) {
        C19465 c19465;
        int i = f56145;
        if (i == 1) {
            c19465 = (C19465) f56142.get();
        } else if (i == 2) {
            c19465 = (C19465) f56143.get();
        } else {
            c19465 = (C19465) f56144.get();
        }
        return c19465.f59299.format(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m42821(String str) {
        try {
            int i = f56145;
            if (i != 1) {
                return i != 2 ? ((C19465) f56144.get()).f59300.parse(str).getTime() : ((C19465) f56143.get()).f59300.parse(str).getTime();
            }
            return ((C19465) f56142.get()).f59300.parse(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m42826(String str) {
        try {
            int i = f56145;
            if (i != 1) {
                return i != 2 ? ((C19465) f56144.get()).f59299.parse(str).getTime() : ((C19465) f56143.get()).f59299.parse(str).getTime();
            }
            return ((C19465) f56142.get()).f59299.parse(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m42822() {
        int i = f56145;
        if (i != 1) {
            return i != 2 ? "yyyy-MM-dd HH:mm:ss" : "HH:mm:ss dd-MM-yyyy";
        }
        return "dd-MM-yyyy HH:mm:ss";
    }
}
