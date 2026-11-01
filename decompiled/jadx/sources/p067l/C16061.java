package p067l;

/* JADX INFO: renamed from: l.ܳ۠᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes4.dex */
public final class C16061 extends C8686 {
    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC18744 m36565(InterfaceC4387 interfaceC4387) {
        return new C2650(interfaceC4387);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC18744 m36566(EnumC22098 enumC22098, InterfaceC4387 interfaceC4387) {
        C13045.m29867(enumC22098, "mode");
        int i = C24779.f79217[enumC22098.ordinal()];
        if (i == 1) {
            return new C2650(interfaceC4387);
        }
        if (i == 2) {
            return new C20757(interfaceC4387);
        }
        if (i == 3) {
            return new C16731(interfaceC4387);
        }
        throw new C10698();
    }
}
