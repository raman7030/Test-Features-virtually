package p067l;

/* JADX INFO: renamed from: l.ᩳܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 35UV */
/* JADX INFO: loaded from: classes4.dex */
public final class C19593 {
    /* JADX INFO: renamed from: ֫ */
    public static C12888 m44506(C3499 c3499, int i, InterfaceC23920 interfaceC23920) {
        String str;
        if (interfaceC23920 instanceof InterfaceC9168) {
            C23616 c23616 = c3499.f7058;
            InterfaceC9168 interfaceC9168 = (InterfaceC9168) interfaceC23920;
            C16239 c16239 = new C16239(c3499, i, interfaceC9168);
            int iMo5147 = interfaceC9168.mo5147() + i;
            EnumC3167 enumC3167Mo6217 = ((InterfaceC9168) c16239.f36247).mo6217();
            switch (C18922.f56465[enumC3167Mo6217.f6090.ordinal()]) {
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
                    if (enumC3167Mo6217 != EnumC3167.f5895) {
                        str = enumC3167Mo6217 != EnumC3167.f6067 ? "sswitch_data_" : "pswitch_data_";
                    } else {
                        str = "array_";
                    }
                    break;
                default:
                    str = null;
                    break;
            }
            C20935 c20935 = new C20935(c23616, iMo5147, str);
            c16239.f47791 = c20935;
            c16239.f47791 = c3499.m6256().m17426(c20935);
            return c16239;
        }
        if (interfaceC23920 instanceof C13897) {
            return new C20264(c3499, i, (C13897) interfaceC23920);
        }
        int i2 = C18251.f54514[interfaceC23920.mo6217().f6090.ordinal()];
        if (i2 == 1) {
            return new C9339(c3499, i, (InterfaceC10765) interfaceC23920);
        }
        if (i2 == 2) {
            return new C11547(c3499, i, (InterfaceC10921) interfaceC23920);
        }
        if (i2 == 3) {
            return new C6182(c3499, i, (InterfaceC17625) interfaceC23920);
        }
        return C12888.m29517(c3499, i, interfaceC23920);
    }
}
