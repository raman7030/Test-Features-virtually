package p067l;

import java.util.logging.Logger;

/* JADX INFO: renamed from: l.᩹ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes.dex */
public final class C23268 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f73121 = 0;

    /* JADX INFO: renamed from: ۢ */
    public static final Logger f73123 = Logger.getLogger(C23268.class.getName());

    /* JADX INFO: renamed from: ܿ */
    public static final int[] f73127 = new int[0];

    /* JADX INFO: renamed from: ۧ */
    public static final C19244[] f73124 = new C19244[0];

    /* JADX INFO: renamed from: ᩳ */
    public static final C2479[] f73128 = new C2479[0];

    /* JADX INFO: renamed from: ܽ */
    public static final C11198[] f73126 = new C11198[0];

    /* JADX INFO: renamed from: ᩻ */
    public static final C22598[] f73130 = new C22598[0];

    /* JADX INFO: renamed from: ܳ */
    public static final C16561[] f73125 = new C16561[0];

    /* JADX INFO: renamed from: ۜ */
    public static final ConcurrentMapC12768 f73122 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ᩷ */
    public static volatile C12716 f73129 = null;

    /* JADX INFO: renamed from: ֫ */
    public static C8041 m51809(EnumC5674 enumC5674) {
        int i = C12716.f35702;
        int i2 = C12539.f35192;
        C17683 c17683 = C25080.f80008;
        if (f73129 == null) {
            synchronized (C23268.class) {
                if (f73129 == null) {
                    try {
                        C3860 c3860M7613 = C3860.m7613();
                        c3860M7613.m7615(C25080.f80008);
                        f73129 = C12716.m29229("\n\u001d\u0018æ\u0007\"\u0003Ê>\u0000*\u0013\b\u0001\u0010\u0002\u0018\u0002 \u0003(\u00010\u0002Ê>\u0004\b\u0001\u0010\u0001\n\u001d\u0018ç\u0007\"\u0003Ê>\u0000*\u0013\b\u0002\u0010\u0001\u0018\u0001 \u0002(\u00010\u0001Ê>\u0004\b\u0000\u0010\u0001\n\u001d\u0018è\u0007\"\u0013\b\u0001\u0010\u0001\u0018\u0001 \u0002(\u00010\u0001Ê>\u0004\b\u0000\u0010\u0001*\u0003Ê>\u0000 æ\u0007(è\u0007".getBytes(C15671.f44806), c3860M7613);
                    } catch (Exception e) {
                        throw new AssertionError(e);
                    }
                }
            }
        }
        C12716 c12716 = f73129;
        if (enumC5674.getNumber() < c12716.m29236().getNumber()) {
            throw new IllegalArgumentException("Edition " + enumC5674 + " is lower than the minimum supported edition " + c12716.m29236() + "!");
        }
        if (enumC5674.getNumber() > c12716.m29238().getNumber()) {
            throw new IllegalArgumentException("Edition " + enumC5674 + " is greater than the maximum supported edition " + c12716.m29238() + "!");
        }
        C3998 c3998 = null;
        for (C3998 c3999 : c12716.m29234()) {
            if (c3999.m7962().getNumber() > enumC5674.getNumber()) {
                break;
            }
            c3998 = c3999;
        }
        if (c3998 == null) {
            throw new IllegalArgumentException("Edition " + enumC5674 + " does not have a valid default FeatureSet!");
        }
        C2676 builder = c3998.m7966().toBuilder();
        builder.m4130(c3998.m7964());
        return builder.build();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8041 m51810(C8041 c8041) {
        C8041 c8042 = (C8041) f73122.putIfAbsent(Integer.valueOf(c8041.hashCode()), c8041);
        return c8042 == null ? c8041 : c8042;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m51807(C7174 c7174, C19244 c19244, String str) {
        if (c19244 != null) {
            return c19244.mo3542() + '.' + str;
        }
        String strM16487 = c7174.m16487();
        if (strM16487.isEmpty()) {
            return str;
        }
        return strM16487 + '.' + str;
    }
}
