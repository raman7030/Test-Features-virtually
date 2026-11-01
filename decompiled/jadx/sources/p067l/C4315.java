package p067l;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.֫᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4HM */
/* JADX INFO: loaded from: classes2.dex */
public final class C4315 {
    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17054 m8848(AbstractC17054 abstractC17054) {
        while (abstractC17054 != null && !(abstractC17054 instanceof C23091)) {
            abstractC17054 = abstractC17054.f50440;
        }
        return abstractC17054;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m8851(AbstractC17054 abstractC17054) {
        ((C23091) abstractC17054).m51501();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8850(C23091 c23091) {
        try {
            Field declaredField = C23091.class.getDeclaredField("᩵֫");
            declaredField.setAccessible(true);
            C9009 c9009 = ((C8338) declaredField.get(c23091)).f22303;
            Field declaredField2 = C9009.class.getDeclaredField("ۢ");
            declaredField2.setAccessible(true);
            C23091 c23092 = (C23091) declaredField2.get(c9009);
            Field declaredField3 = C9009.class.getDeclaredField("᩵");
            declaredField3.setAccessible(true);
            C23091 c23093 = (C23091) declaredField3.get(c9009);
            if (c23092 == c23091) {
                declaredField2.set(c9009, null);
                if (c23093 == c23091) {
                    declaredField3.set(c9009, null);
                    return;
                }
                return;
            }
            while (c23092 != null) {
                AbstractC17054 abstractC17054 = c23092.f50440;
                if (abstractC17054 == c23091) {
                    c23092.f50440 = c23091.f50440;
                    if (c23093 == c23091) {
                        declaredField3.set(c9009, c23092);
                        return;
                    }
                    return;
                }
                c23092 = (C23091) abstractC17054;
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8849(AbstractC17054 abstractC17054, C13271 c13271) {
        C23091 c23091 = (C23091) abstractC17054;
        try {
            Field declaredField = C23091.class.getDeclaredField("᩵֫");
            declaredField.setAccessible(true);
            c13271.m30330(((C8338) declaredField.get(c23091)).f22303);
            m8850(c23091);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }
}
