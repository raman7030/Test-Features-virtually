package l;

/* JADX INFO: renamed from: l.ۙ᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1799 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4892 implements InterfaceC8795 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f15445;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f15446;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f15447;

    @Override // l.InterfaceC8795
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo14252(String str, String str2, String str3) {
        return false;
    }

    @Override // l.InterfaceC8795
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo14253(String str, String str2, String str3) {
        return false;
    }

    public C4892(String str, String str2, boolean z) {
        this.f15446 = str;
        this.f15447 = str2;
        this.f15445 = z;
    }

    @Override // l.InterfaceC8795
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo14251(String str, String str2) {
        return this.f15445 && this.f15446.equals(str) && this.f15447.equals(str2);
    }

    @Override // l.InterfaceC8795
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC9501 mo14250(String str, String str2, String str3, String str4) {
        return EnumC9501.NONE;
    }
}
