package p067l;

/* JADX INFO: renamed from: l.ܰۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SN */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC15415 {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35142(EnumC15415 enumC15415) {
        C13045.m29867(enumC15415, "state");
        return compareTo(enumC15415) >= 0;
    }
}
