package p067l;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.᩷֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 67G0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21883 {
    /* JADX INFO: renamed from: ֫ */
    public static C8471 m49339(Exception exc) {
        if (m49341(exc, Collections.newSetFromMap(new IdentityHashMap()))) {
            return new C8471(EnumC17187.SMB1_ONLY, null, false);
        }
        return new C8471(EnumC17187.UNKNOWN, exc, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m49340(Throwable th) {
        return m49342(th, Collections.newSetFromMap(new IdentityHashMap()));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m49341(Throwable th, Set set) {
        if (th == null || !set.add(th)) {
            return false;
        }
        if (th instanceof C4591) {
            return true;
        }
        for (Throwable th2 : th.getSuppressed()) {
            if (m49341(th2, set)) {
                return true;
            }
        }
        return m49341(th.getCause(), set);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m49342(Throwable th, Set set) {
        if (th == null || !set.add(th)) {
            return false;
        }
        if (th instanceof C3406) {
            C3406 c3406 = (C3406) th;
            EnumC24036 enumC24036M6033 = c3406.m6033();
            if (enumC24036M6033 == EnumC24036.SMB2_SESSION_SETUP && c3406.m6034() == EnumC9460.STATUS_ACCESS_DENIED.getValue()) {
                return true;
            }
            if (enumC24036M6033 == EnumC24036.SMB2_NEGOTIATE) {
                long jM6034 = c3406.m6034();
                if (jM6034 == EnumC9460.STATUS_NOT_SUPPORTED.getValue() || jM6034 == EnumC9460.STATUS_INVALID_PARAMETER.getValue() || jM6034 == EnumC9460.STATUS_NOT_IMPLEMENTED.getValue()) {
                    return true;
                }
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            if (m49342(th2, set)) {
                return true;
            }
        }
        return m49342(th.getCause(), set);
    }
}
