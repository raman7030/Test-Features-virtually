package p067l;

/* JADX INFO: renamed from: l.ۗ᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 99YG */
/* JADX INFO: loaded from: classes2.dex */
public final class C5650 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f13718;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f13719;

    /* JADX INFO: renamed from: ܽ */
    public final long f13720;

    /* JADX INFO: renamed from: ܿ */
    public final String f13721;

    /* JADX INFO: renamed from: ᩳ */
    public final long f13722;

    public C5650(InterfaceC12059 interfaceC12059) {
        String name = interfaceC12059.getName();
        this.f13721 = name.endsWith("/") ? C17073.m38720(1, 0, name) : name;
        this.f13720 = interfaceC12059.mo27615();
        boolean zIsDirectory = interfaceC12059.isDirectory();
        this.f13719 = zIsDirectory;
        this.f13718 = interfaceC12059.mo27614();
        this.f13722 = zIsDirectory ? -1L : interfaceC12059.length();
    }

    public C5650(C14629 c14629) {
        String strM33426 = c14629.m33426();
        this.f13721 = strM33426;
        this.f13720 = -1L;
        this.f13722 = -1L;
        this.f13719 = true;
        this.f13718 = strM33426.startsWith("$");
    }

    public C5650(C4709 c4709) {
        this.f13721 = c4709.m49952();
        this.f13722 = c4709.m9985();
        C24212 c24212M9982 = c4709.m9982();
        c24212M9982 = c24212M9982 == null ? c4709.m9983() : c24212M9982;
        this.f13720 = c24212M9982 != null ? c24212M9982.m53526() : -1L;
        long jM9984 = c4709.m9984();
        this.f13719 = C16873.m38441(jM9984, EnumC4038.FILE_ATTRIBUTE_DIRECTORY);
        this.f13718 = C16873.m38441(jM9984, EnumC4038.FILE_ATTRIBUTE_HIDDEN);
    }
}
