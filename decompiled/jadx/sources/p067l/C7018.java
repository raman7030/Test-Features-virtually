package p067l;

/* JADX INFO: renamed from: l.ۙ᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1799 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7018 implements InterfaceC10727 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f18280;

    /* JADX INFO: renamed from: ۧ */
    public final String f18281;

    /* JADX INFO: renamed from: ܽ */
    public final String f18282;

    @Override // p067l.InterfaceC10727
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16149(String str, String str2, String str3) {
        return false;
    }

    @Override // p067l.InterfaceC10727
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo16150(String str, String str2, String str3) {
        return false;
    }

    public C7018(String str, String str2, boolean z) {
        this.f18281 = str;
        this.f18282 = str2;
        this.f18280 = z;
    }

    @Override // p067l.InterfaceC10727
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16148(String str, String str2) {
        return this.f18280 && this.f18281.equals(str) && this.f18282.equals(str2);
    }

    @Override // p067l.InterfaceC10727
    /* JADX INFO: renamed from: ֫ */
    public final EnumC11398 mo16147(String str, String str2, String str3, String str4) {
        return EnumC11398.NONE;
    }
}
