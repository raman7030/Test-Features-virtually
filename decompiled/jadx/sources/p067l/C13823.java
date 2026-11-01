package p067l;

/* JADX INFO: renamed from: l.۫֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes3.dex */
public final class C13823 {

    /* JADX INFO: renamed from: ۜ */
    public static final C13823 f39053 = new C13823(EnumC14493.UNSUPPORTED, null, null, null, null, false);

    /* JADX INFO: renamed from: ᩷ */
    public static final C13823 f39054 = new C13823(EnumC14493.WAITING_FOR_CACHE, null, null, null, null, false);

    /* JADX INFO: renamed from: ᩻ */
    public static final C13823 f39055 = new C13823(EnumC14493.BLACK_ONLY, null, null, null, null, false);

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 f39056;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC7788 f39057;

    /* JADX INFO: renamed from: ܳ */
    public final EnumC14493 f39058;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f39059;

    /* JADX INFO: renamed from: ܿ */
    public final String f39060;

    /* JADX INFO: renamed from: ᩳ */
    public final C23881 f39061;

    public C13823(EnumC14493 enumC14493, AbstractC17043 abstractC17043, C23881 c23881, InterfaceC7788 interfaceC7788, String str, boolean z) {
        this.f39058 = enumC14493;
        this.f39056 = abstractC17043;
        this.f39061 = c23881;
        this.f39057 = interfaceC7788;
        this.f39060 = str;
        this.f39059 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13823 m31490(AbstractC17043 abstractC17043, boolean z) {
        return new C13823(EnumC14493.LOCAL_FILE, abstractC17043, null, null, null, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13823 m31491(C23881 c23881) {
        return new C13823(EnumC14493.NETWORK_CACHE, null, c23881, null, null, m31492(c23881.f75826.getPath()));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13823 m31489(String str, InterfaceC7788 interfaceC7788, boolean z) {
        return new C13823(EnumC14493.PAGED, null, null, interfaceC7788, str, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m31492(String str) {
        return str != null && str.length() >= 3 && str.regionMatches(true, str.length() + (-3), ".ts", 0, 3);
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m31500() {
        return this.f39059;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m31502() {
        return this.f39058 == EnumC14493.UNSUPPORTED;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m31499() {
        return this.f39058 == EnumC14493.BLACK_ONLY;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m31494() {
        EnumC14493 enumC14493 = EnumC14493.LOCAL_FILE;
        EnumC14493 enumC14494 = this.f39058;
        return enumC14494 == enumC14493 || enumC14494 == EnumC14493.NETWORK_CACHE || enumC14494 == EnumC14493.PAGED;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m31501() {
        return this.f39058 == EnumC14493.LOCAL_FILE;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m31498() {
        return this.f39058 == EnumC14493.NETWORK_CACHE;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m31503() {
        return this.f39058 == EnumC14493.PAGED;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 m31493() {
        return this.f39056;
    }

    /* JADX INFO: renamed from: ۢ */
    public final C23881 m31496() {
        return this.f39061;
    }

    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC9501 m31495() {
        InterfaceC7788 interfaceC7788;
        C23881 c23881;
        AbstractC17043 abstractC17043;
        EnumC14493 enumC14493 = EnumC14493.LOCAL_FILE;
        EnumC14493 enumC14494 = this.f39058;
        if (enumC14494 == enumC14493 && (abstractC17043 = this.f39056) != null) {
            return new C6447(abstractC17043);
        }
        if (enumC14494 == EnumC14493.NETWORK_CACHE && (c23881 = this.f39061) != null) {
            return c23881.m52967();
        }
        if (enumC14494 != EnumC14493.PAGED || (interfaceC7788 = this.f39057) == null) {
            return null;
        }
        return interfaceC7788.mo18032();
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m31497() {
        C23881 c23881 = this.f39061;
        if (c23881 != null) {
            return c23881.m52965();
        }
        String str = this.f39060;
        if (str != null) {
            return "paged:".concat(str);
        }
        AbstractC17043 abstractC17043 = this.f39056;
        if (abstractC17043 != null) {
            return "local:" + abstractC17043.mo25505() + ":" + abstractC17043.mo25101();
        }
        return this.f39058.name();
    }
}
