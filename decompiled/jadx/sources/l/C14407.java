package l;

/* JADX INFO: renamed from: l.ܳ۠᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes4.dex */
public final class C14407 extends C6647 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC17230 m34431(InterfaceC2123 interfaceC2123) {
        return new C0296(interfaceC2123);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC17230 m34432(EnumC20759 enumC20759, InterfaceC2123 interfaceC2123) {
        C11233.m27805(enumC20759, "mode");
        int i = C23580.f76471[enumC20759.ordinal()];
        if (i == 1) {
            return new C0296(interfaceC2123);
        }
        if (i == 2) {
            return new C19348(interfaceC2123);
        }
        if (i == 3) {
            return new C15112(interfaceC2123);
        }
        throw new C8764();
    }
}
