package p067l;

/* JADX INFO: renamed from: l.ۨۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47EO */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC13232 {
    SHORT(new C10927()),
    LONG(new C19925()),
    VERBOSE(new C19965());


    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC9208 f37184;

    /* JADX INFO: renamed from: ᩳ */
    public static /* synthetic */ String m30293(EnumC22620 enumC22620, String str, String str2) {
        return str2;
    }

    /* JADX INFO: renamed from: ܿ */
    public static /* synthetic */ String m30292(EnumC22620 enumC22620, String str, String str2) {
        return C24104.m53357(enumC22620.m50678(), ": ", str2);
    }

    /* JADX INFO: renamed from: ܳ */
    public static /* synthetic */ String m30290(EnumC22620 enumC22620, String str, String str2) {
        return enumC22620 == EnumC22620.INFO ? str2 : String.format("%-7s-%6s: %s", str, enumC22620.m50679(), str2);
    }

    EnumC13232(InterfaceC9208 interfaceC9208) {
        this.f37184 = interfaceC9208;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m30295(EnumC22620 enumC22620, String str, String str2, Object... objArr) {
        return (str2 == null || str == null) ? "" : this.f37184.mo21226(enumC22620, str, String.format(str2, objArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public String m30294(String str, C23960 c23960) {
        return c23960.m53081() ? "" : this.f37184.mo21226(c23960.m53080(), str, c23960.m53082());
    }
}
