package l;

import java.text.ParseException;

/* JADX INFO: renamed from: l.ܿۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5R0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17283 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f52962 = new C1761();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f52960 = new C10934();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f52961 = new C16577();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int f52963 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40574(int i) {
        if (i < 0 || i > 2) {
            return;
        }
        f52963 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m40573(long j, boolean z, boolean z2) {
        int i = f52963;
        if (i == 1) {
            return ((C17989) f52960.get()).m42036(j, z, z2);
        }
        if (i == 2) {
            return ((C17989) f52961.get()).m42036(j, z, z2);
        }
        return ((C17989) f52962.get()).m42036(j, z, z2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m40572(long j) {
        C17989 c17989;
        int i = f52963;
        if (i == 1) {
            c17989 = (C17989) f52960.get();
        } else if (i == 2) {
            c17989 = (C17989) f52961.get();
        } else {
            c17989 = (C17989) f52962.get();
        }
        return c17989.f56103.format(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m40577(long j) {
        C17989 c17989;
        int i = f52963;
        if (i == 1) {
            c17989 = (C17989) f52960.get();
        } else if (i == 2) {
            c17989 = (C17989) f52961.get();
        } else {
            c17989 = (C17989) f52962.get();
        }
        return c17989.f56104.format(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m40576(long j) {
        C17989 c17989;
        int i = f52963;
        if (i == 1) {
            c17989 = (C17989) f52960.get();
        } else if (i == 2) {
            c17989 = (C17989) f52961.get();
        } else {
            c17989 = (C17989) f52962.get();
        }
        return c17989.f56102.format(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m40570(String str) {
        try {
            int i = f52963;
            if (i != 1) {
                return i != 2 ? ((C17989) f52962.get()).f56103.parse(str).getTime() : ((C17989) f52961.get()).f56103.parse(str).getTime();
            }
            return ((C17989) f52960.get()).f56103.parse(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m40575(String str) {
        try {
            int i = f52963;
            if (i != 1) {
                return i != 2 ? ((C17989) f52962.get()).f56102.parse(str).getTime() : ((C17989) f52961.get()).f56102.parse(str).getTime();
            }
            return ((C17989) f52960.get()).f56102.parse(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m40571() {
        int i = f52963;
        if (i != 1) {
            return i != 2 ? "yyyy-MM-dd HH:mm:ss" : "HH:mm:ss dd-MM-yyyy";
        }
        return "dd-MM-yyyy HH:mm:ss";
    }
}
