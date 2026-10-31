package l;

/* JADX INFO: renamed from: l.ۨۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47EO */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC11431 {
    SHORT(new C9005()),
    LONG(new C18473()),
    VERBOSE(new C18515());


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC7197 f34188;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m28249(EnumC21309 enumC21309, String str, String str2) {
        return str2;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m28248(EnumC21309 enumC21309, String str, String str2) {
        return C22870.m50967(enumC21309.m48343(), ": ", str2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m28246(EnumC21309 enumC21309, String str, String str2) {
        return enumC21309 == EnumC21309.INFO ? str2 : String.format("%-7s-%6s: %s", str, enumC21309.m48344(), str2);
    }

    EnumC11431(InterfaceC7197 interfaceC7197) {
        this.f34188 = interfaceC7197;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m28251(EnumC21309 enumC21309, String str, String str2, Object... objArr) {
        return (str2 == null || str == null) ? "" : this.f34188.mo19279(enumC21309, str, String.format(str2, objArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m28250(String str, C22719 c22719) {
        return c22719.m50755() ? "" : this.f34188.mo19279(c22719.m50754(), str, c22719.m50756());
    }
}
