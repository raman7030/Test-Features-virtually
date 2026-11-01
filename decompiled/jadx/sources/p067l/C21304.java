package p067l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩶ۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97EU */
/* JADX INFO: loaded from: classes4.dex */
public final class C21304 {
    /* JADX INFO: renamed from: ֫ */
    public static C23315 m48180(C18362 c18362) {
        synchronized (c18362) {
            String strM41824 = c18362.m41824();
            String strM41832 = c18362.m41832();
            int iM41829 = c18362.m41829();
            if (strM41824.equals(strM41832)) {
                return new C23315(strM41824, iM41829, false);
            }
            int i = iM41829 + 1;
            c18362.m41812(i);
            c18362.m41813(strM41824);
            return new C23315(strM41824, i, true);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48182(C18362 c18362, C23315 c23315, C12255 c12255) {
        synchronized (c18362) {
            if (m48184(c18362, c23315)) {
                c18362.m41814(new WeakReference(c12255));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m48183(C18362 c18362, C23315 c23315) {
        boolean zM48184;
        synchronized (c18362) {
            zM48184 = m48184(c18362, c23315);
        }
        return zM48184;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12255 m48179(C18362 c18362, C23315 c23315, C21265 c21265, C13596 c13596) {
        synchronized (c18362) {
            if (!m48184(c18362, c23315)) {
                return null;
            }
            WeakReference weakReferenceM41831 = c18362.m41831();
            c18362.m41821(c21265, c13596);
            return weakReferenceM41831 != null ? (C12255) weakReferenceM41831.get() : null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48181(C18362 c18362, C23315 c23315) {
        synchronized (c18362) {
            if (m48184(c18362, c23315)) {
                c18362.m41813((String) null);
                c18362.m41814((WeakReference) null);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m48184(C18362 c18362, C23315 c23315) {
        return c18362.m41829() == c23315.m51922() && c23315.m51921().equals(c18362.m41824()) && c23315.m51921().equals(c18362.m41832());
    }
}
