package p067l;

/* JADX INFO: renamed from: l.᩺ۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SN */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC24133 {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;


    /* JADX INFO: renamed from: ᩹ */
    public static final C8040 f76564 = new C8040();

    /* JADX INFO: renamed from: ֫ */
    public static final EnumC24133 m53375(EnumC15415 enumC15415) {
        f76564.getClass();
        return C8040.m18634(enumC15415);
    }

    /* JADX INFO: renamed from: ܽ */
    public static final EnumC24133 m53378(EnumC15415 enumC15415) {
        f76564.getClass();
        return C8040.m18635(enumC15415);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static final EnumC24133 m53379(EnumC15415 enumC15415) {
        f76564.getClass();
        return C8040.m18636(enumC15415);
    }

    /* JADX INFO: renamed from: ۧ */
    public static final EnumC24133 m53376(EnumC15415 enumC15415) {
        f76564.getClass();
        C13045.m29867(enumC15415, "state");
        int i = C12064.f33613[enumC15415.ordinal()];
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

    /* JADX INFO: renamed from: ֫ */
    public final EnumC15415 m53380() {
        switch (C13405.f37621[ordinal()]) {
            case 1:
            case 2:
                return EnumC15415.CREATED;
            case 3:
            case 4:
                return EnumC15415.STARTED;
            case 5:
                return EnumC15415.RESUMED;
            case 6:
                return EnumC15415.DESTROYED;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
