package l;

/* JADX INFO: renamed from: l.ᩳܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 35UV */
/* JADX INFO: loaded from: classes4.dex */
public final class C18124 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11069 m42247(C1190 c1190, int i, InterfaceC22677 interfaceC22677) {
        String str;
        if (interfaceC22677 instanceof InterfaceC7155) {
            C22357 c22357 = c1190.f4289;
            InterfaceC7155 interfaceC7155 = (InterfaceC7155) interfaceC22677;
            C14595 c14595 = new C14595(c1190, i, interfaceC7155);
            int iMo2818 = interfaceC7155.mo2818() + i;
            EnumC0841 enumC0841Mo3975 = ((InterfaceC7155) c14595.f33245).mo3975();
            switch (C17418.f53277[enumC0841Mo3975.f3316.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    str = "goto_";
                    break;
                case 4:
                case 5:
                    str = "cond_";
                    break;
                case 6:
                    if (enumC0841Mo3975 != EnumC0841.f3121) {
                        str = enumC0841Mo3975 != EnumC0841.f3293 ? "sswitch_data_" : "pswitch_data_";
                    } else {
                        str = "array_";
                    }
                    break;
                default:
                    str = null;
                    break;
            }
            C19536 c19536 = new C19536(c22357, iMo2818, str);
            c14595.f44684 = c19536;
            c14595.f44684 = c1190.m4014().m15515(c19536);
            return c14595;
        }
        if (interfaceC22677 instanceof C12131) {
            return new C18830(c1190, i, (C12131) interfaceC22677);
        }
        int i2 = C16712.f51330[interfaceC22677.mo3975().f3316.ordinal()];
        if (i2 == 1) {
            return new C7335(c1190, i, (InterfaceC8835) interfaceC22677);
        }
        if (i2 == 2) {
            return new C9658(c1190, i, (InterfaceC8999) interfaceC22677);
        }
        if (i2 == 3) {
            return new C4013(c1190, i, (InterfaceC16053) interfaceC22677);
        }
        return C11069.m27455(c1190, i, interfaceC22677);
    }
}
