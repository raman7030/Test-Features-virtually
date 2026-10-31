package l;

/* JADX INFO: renamed from: l.۫֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12053 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C12053 f36042 = new C12053(EnumC12758.UNSUPPORTED, null, null, null, null, false);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C12053 f36043 = new C12053(EnumC12758.WAITING_FOR_CACHE, null, null, null, null, false);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C12053 f36044 = new C12053(EnumC12758.BLACK_ONLY, null, null, null, null, false);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f36045;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5703 f36046;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC12758 f36047;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f36048;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f36049;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22636 f36050;

    public C12053(EnumC12758 enumC12758, AbstractC15440 abstractC15440, C22636 c22636, InterfaceC5703 interfaceC5703, String str, boolean z) {
        this.f36047 = enumC12758;
        this.f36045 = abstractC15440;
        this.f36050 = c22636;
        this.f36046 = interfaceC5703;
        this.f36049 = str;
        this.f36048 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12053 m29428(AbstractC15440 abstractC15440, boolean z) {
        return new C12053(EnumC12758.LOCAL_FILE, abstractC15440, null, null, null, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12053 m29429(C22636 c22636) {
        return new C12053(EnumC12758.NETWORK_CACHE, null, c22636, null, null, m29430(c22636.f73100.getPath()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12053 m29427(String str, InterfaceC5703 interfaceC5703, boolean z) {
        return new C12053(EnumC12758.PAGED, null, null, interfaceC5703, str, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m29430(String str) {
        return str != null && str.length() >= 3 && str.regionMatches(true, str.length() + (-3), ".ts", 0, 3);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m29438() {
        return this.f36048;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m29440() {
        return this.f36047 == EnumC12758.UNSUPPORTED;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m29437() {
        return this.f36047 == EnumC12758.BLACK_ONLY;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m29432() {
        EnumC12758 enumC12758 = EnumC12758.LOCAL_FILE;
        EnumC12758 enumC12759 = this.f36047;
        return enumC12759 == enumC12758 || enumC12759 == EnumC12758.NETWORK_CACHE || enumC12759 == EnumC12758.PAGED;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m29439() {
        return this.f36047 == EnumC12758.LOCAL_FILE;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m29436() {
        return this.f36047 == EnumC12758.NETWORK_CACHE;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m29441() {
        return this.f36047 == EnumC12758.PAGED;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m29431() {
        return this.f36045;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C22636 m29434() {
        return this.f36050;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7505 m29433() {
        InterfaceC5703 interfaceC5703;
        C22636 c22636;
        AbstractC15440 abstractC15440;
        EnumC12758 enumC12758 = EnumC12758.LOCAL_FILE;
        EnumC12758 enumC12759 = this.f36047;
        if (enumC12759 == enumC12758 && (abstractC15440 = this.f36045) != null) {
            return new C4292(abstractC15440);
        }
        if (enumC12759 == EnumC12758.NETWORK_CACHE && (c22636 = this.f36050) != null) {
            return c22636.m50641();
        }
        if (enumC12759 != EnumC12758.PAGED || (interfaceC5703 = this.f36046) == null) {
            return null;
        }
        return interfaceC5703.mo16113();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m29435() {
        C22636 c22636 = this.f36050;
        if (c22636 != null) {
            return c22636.m50639();
        }
        String str = this.f36049;
        if (str != null) {
            return "paged:".concat(str);
        }
        AbstractC15440 abstractC15440 = this.f36045;
        if (abstractC15440 != null) {
            return "local:" + abstractC15440.mo23554() + ":" + abstractC15440.mo23127();
        }
        return this.f36047.name();
    }
}
