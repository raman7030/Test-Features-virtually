package p067l;

/* JADX INFO: renamed from: l.ۛۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SN */
/* JADX INFO: loaded from: classes2.dex */
public final class C8040 {
    /* JADX INFO: renamed from: ֫ */
    public static EnumC24133 m18634(EnumC15415 enumC15415) {
        C13045.m29867(enumC15415, "state");
        int i = C12064.f33613[enumC15415.ordinal()];
        if (i == 1) {
            return EnumC24133.ON_DESTROY;
        }
        if (i == 2) {
            return EnumC24133.ON_STOP;
        }
        if (i != 3) {
            return null;
        }
        return EnumC24133.ON_PAUSE;
    }

    /* JADX INFO: renamed from: ۧ */
    public static EnumC24133 m18635(EnumC15415 enumC15415) {
        C13045.m29867(enumC15415, "state");
        int i = C12064.f33613[enumC15415.ordinal()];
        if (i == 1) {
            return EnumC24133.ON_START;
        }
        if (i == 2) {
            return EnumC24133.ON_RESUME;
        }
        if (i != 5) {
            return null;
        }
        return EnumC24133.ON_CREATE;
    }

    /* JADX INFO: renamed from: ܽ */
    public static EnumC24133 m18636(EnumC15415 enumC15415) {
        C13045.m29867(enumC15415, "state");
        int i = C12064.f33613[enumC15415.ordinal()];
        if (i == 1) {
            return EnumC24133.ON_CREATE;
        }
        if (i == 2) {
            return EnumC24133.ON_START;
        }
        if (i != 3) {
            return null;
        }
        return EnumC24133.ON_RESUME;
    }
}
