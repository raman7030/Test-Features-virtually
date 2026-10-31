package l;

/* JADX INFO: renamed from: l.᩺ۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SN */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC22901 {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;


    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C5968 f73834 = new C5968();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC22901 m50984(EnumC13728 enumC13728) {
        f73834.getClass();
        return C5968.m16708(enumC13728);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC22901 m50987(EnumC13728 enumC13728) {
        f73834.getClass();
        return C5968.m16709(enumC13728);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC22901 m50988(EnumC13728 enumC13728) {
        f73834.getClass();
        return C5968.m16710(enumC13728);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC22901 m50985(EnumC13728 enumC13728) {
        f73834.getClass();
        C11233.m27805(enumC13728, "state");
        int i = C10202.f30652[enumC13728.ordinal()];
        if (i == 1) {
            return ON_STOP;
        }
        if (i == 2) {
            return ON_PAUSE;
        }
        if (i != 4) {
            return null;
        }
        return ON_DESTROY;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC13728 m50989() {
        switch (C11613.f34624[ordinal()]) {
            case 1:
            case 2:
                return EnumC13728.CREATED;
            case 3:
            case 4:
                return EnumC13728.STARTED;
            case 5:
                return EnumC13728.RESUMED;
            case 6:
                return EnumC13728.DESTROYED;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
