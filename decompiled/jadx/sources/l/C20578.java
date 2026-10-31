package l;

/* JADX INFO: renamed from: l.᩷ۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: B410 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20578 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC9169 f66258;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC18278 f66259;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC6466 f66260;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC15823 f66261;

    public C20578(EnumC6466 enumC6466) {
        this(enumC6466, null, null, null);
    }

    public C20578(EnumC6466 enumC6466, InterfaceC18278 interfaceC18278) {
        this(enumC6466, interfaceC18278, null, null);
    }

    public C20578(EnumC6466 enumC6466, InterfaceC15823 interfaceC15823, InterfaceC9169 interfaceC9169) {
        this(enumC6466, interfaceC15823.mo4614(), interfaceC15823, interfaceC9169);
    }

    public C20578(EnumC6466 enumC6466, InterfaceC18278 interfaceC18278, InterfaceC15823 interfaceC15823, InterfaceC9169 interfaceC9169) {
        this.f66260 = enumC6466;
        this.f66259 = interfaceC18278;
        this.f66261 = interfaceC15823;
        this.f66258 = interfaceC9169;
    }

    public final String toString() {
        return "TaskEvent[" + this.f66260 + "," + this.f66259 + "," + this.f66258 + "]";
    }

    public C20578(EnumC6466 enumC6466, C1323 c1323) {
        this(enumC6466, c1323.f4745, c1323, null);
    }
}
