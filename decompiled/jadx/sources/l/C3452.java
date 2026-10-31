package l;

/* JADX INFO: renamed from: l.ۗ᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 99YG */
/* JADX INFO: loaded from: classes2.dex */
public final class C3452 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f10916;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f10917;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f10918;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f10919;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f10920;

    public C3452(InterfaceC10196 interfaceC10196) {
        String name = interfaceC10196.getName();
        this.f10919 = name.endsWith("/") ? C15472.m36561(1, 0, name) : name;
        this.f10918 = interfaceC10196.mo25593();
        boolean zIsDirectory = interfaceC10196.isDirectory();
        this.f10917 = zIsDirectory;
        this.f10916 = interfaceC10196.mo25592();
        this.f10920 = zIsDirectory ? -1L : interfaceC10196.length();
    }

    public C3452(C12901 c12901) {
        String strM31340 = c12901.m31340();
        this.f10919 = strM31340;
        this.f10918 = -1L;
        this.f10920 = -1L;
        this.f10917 = true;
        this.f10916 = strM31340.startsWith("$");
    }

    public C3452(C2463 c2463) {
        this.f10919 = c2463.m47624();
        this.f10920 = c2463.m7937();
        C22984 c22984M7934 = c2463.m7934();
        c22984M7934 = c22984M7934 == null ? c2463.m7935() : c22984M7934;
        this.f10918 = c22984M7934 != null ? c22984M7934.m51133() : -1L;
        long jM7936 = c2463.m7936();
        this.f10917 = C15262.m36280(jM7936, EnumC1757.FILE_ATTRIBUTE_DIRECTORY);
        this.f10916 = C15262.m36280(jM7936, EnumC1757.FILE_ATTRIBUTE_HIDDEN);
    }
}
