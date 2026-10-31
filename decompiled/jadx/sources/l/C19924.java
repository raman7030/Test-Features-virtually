package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩶ۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97EU */
/* JADX INFO: loaded from: classes4.dex */
public final class C19924 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22040 m45867(C16828 c16828) {
        synchronized (c16828) {
            String strM39588 = c16828.m39588();
            String strM39596 = c16828.m39596();
            int iM39593 = c16828.m39593();
            if (strM39588.equals(strM39596)) {
                return new C22040(strM39588, iM39593, false);
            }
            int i = iM39593 + 1;
            c16828.m39576(i);
            c16828.m39577(strM39588);
            return new C22040(strM39588, i, true);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45869(C16828 c16828, C22040 c22040, C10402 c10402) {
        synchronized (c16828) {
            if (m45871(c16828, c22040)) {
                c16828.m39578(new WeakReference(c10402));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m45870(C16828 c16828, C22040 c22040) {
        boolean zM45871;
        synchronized (c16828) {
            zM45871 = m45871(c16828, c22040);
        }
        return zM45871;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10402 m45866(C16828 c16828, C22040 c22040, C19883 c19883, C11813 c11813) {
        synchronized (c16828) {
            if (!m45871(c16828, c22040)) {
                return null;
            }
            WeakReference weakReferenceM39595 = c16828.m39595();
            c16828.m39585(c19883, c11813);
            return weakReferenceM39595 != null ? (C10402) weakReferenceM39595.get() : null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45868(C16828 c16828, C22040 c22040) {
        synchronized (c16828) {
            if (m45871(c16828, c22040)) {
                c16828.m39577((String) null);
                c16828.m39578((WeakReference) null);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m45871(C16828 c16828, C22040 c22040) {
        return c16828.m39593() == c22040.m49586() && c22040.m49585().equals(c16828.m39588()) && c22040.m49585().equals(c16828.m39596());
    }
}
