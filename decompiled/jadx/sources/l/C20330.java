package l;

/* JADX INFO: renamed from: l.᩶ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4KU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20330 extends AbstractC15945 implements InterfaceC12568 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f65634;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f65635;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f65636;

    public C20330(String str, String str2, String str3) {
        this.f65635 = str;
        this.f65636 = str2;
        this.f65634 = str3;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C20330 m46640(InterfaceC18877 interfaceC18877) {
        if (interfaceC18877 instanceof C20330) {
            return (C20330) interfaceC18877;
        }
        return new C20330(interfaceC18877.mo8192(), interfaceC18877.getName(), interfaceC18877.getType());
    }

    @Override // l.InterfaceC18877
    /* JADX INFO: renamed from: ܳ */
    public final String mo8192() {
        return this.f65635;
    }

    @Override // l.InterfaceC18877
    public final String getName() {
        return this.f65636;
    }

    @Override // l.InterfaceC18877
    public final String getType() {
        return this.f65634;
    }
}
