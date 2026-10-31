package l;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.᩷֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 67G0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20533 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6421 m47016(Exception exc) {
        if (m47018(exc, Collections.newSetFromMap(new IdentityHashMap()))) {
            return new C6421(EnumC15592.SMB1_ONLY, null, false);
        }
        return new C6421(EnumC15592.UNKNOWN, exc, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47017(Throwable th) {
        return m47019(th, Collections.newSetFromMap(new IdentityHashMap()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47018(Throwable th, Set set) {
        if (th == null || !set.add(th)) {
            return false;
        }
        if (th instanceof C2339) {
            return true;
        }
        for (Throwable th2 : th.getSuppressed()) {
            if (m47018(th2, set)) {
                return true;
            }
        }
        return m47018(th.getCause(), set);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m47019(Throwable th, Set set) {
        if (th == null || !set.add(th)) {
            return false;
        }
        if (th instanceof C1092) {
            C1092 c1092 = (C1092) th;
            EnumC22799 enumC22799M3761 = c1092.m3761();
            if (enumC22799M3761 == EnumC22799.SMB2_SESSION_SETUP && c1092.m3762() == EnumC7462.STATUS_ACCESS_DENIED.getValue()) {
                return true;
            }
            if (enumC22799M3761 == EnumC22799.SMB2_NEGOTIATE) {
                long jM3762 = c1092.m3762();
                if (jM3762 == EnumC7462.STATUS_NOT_SUPPORTED.getValue() || jM3762 == EnumC7462.STATUS_INVALID_PARAMETER.getValue() || jM3762 == EnumC7462.STATUS_NOT_IMPLEMENTED.getValue()) {
                    return true;
                }
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            if (m47019(th2, set)) {
                return true;
            }
        }
        return m47019(th.getCause(), set);
    }
}
