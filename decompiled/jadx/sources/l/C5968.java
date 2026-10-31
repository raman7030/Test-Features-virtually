package l;

/* JADX INFO: renamed from: l.ۛۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SN */
/* JADX INFO: loaded from: classes2.dex */
public final class C5968 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC22901 m16708(EnumC13728 enumC13728) {
        C11233.m27805(enumC13728, "state");
        int i = C10202.f30652[enumC13728.ordinal()];
        if (i == 1) {
            return EnumC22901.ON_DESTROY;
        }
        if (i == 2) {
            return EnumC22901.ON_STOP;
        }
        if (i != 3) {
            return null;
        }
        return EnumC22901.ON_PAUSE;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC22901 m16709(EnumC13728 enumC13728) {
        C11233.m27805(enumC13728, "state");
        int i = C10202.f30652[enumC13728.ordinal()];
        if (i == 1) {
            return EnumC22901.ON_START;
        }
        if (i == 2) {
            return EnumC22901.ON_RESUME;
        }
        if (i != 5) {
            return null;
        }
        return EnumC22901.ON_CREATE;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static EnumC22901 m16710(EnumC13728 enumC13728) {
        C11233.m27805(enumC13728, "state");
        int i = C10202.f30652[enumC13728.ordinal()];
        if (i == 1) {
            return EnumC22901.ON_CREATE;
        }
        if (i == 2) {
            return EnumC22901.ON_START;
        }
        if (i != 3) {
            return null;
        }
        return EnumC22901.ON_RESUME;
    }
}
