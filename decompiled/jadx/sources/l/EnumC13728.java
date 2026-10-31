package l;

/* JADX INFO: renamed from: l.ܰۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SN */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC13728 {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33028(EnumC13728 enumC13728) {
        C11233.m27805(enumC13728, "state");
        return compareTo(enumC13728) >= 0;
    }
}
