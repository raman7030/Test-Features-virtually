package p067l;

import java.nio.file.InvalidPathException;

/* JADX INFO: renamed from: l.ۛܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C8220 extends EnumC2483 {
    public /* synthetic */ C8220(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("SOURCEFILE", 79, "sourcefile", null, enumC19919, enumC5837);
    }

    public C8220(String str, int i, String str2, String str3, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, enumC19919, enumC5837, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3584(String str) {
        if (str.endsWith(".java")) {
            return true;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            return EnumC5698.m12688(str.substring(0, iIndexOf)) && EnumC5698.m12688(str.substring(iIndexOf + 1));
        }
        return EnumC5698.m12688(str);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3579(AbstractC3154 abstractC3154, String str) throws C4496 {
        if (str.endsWith(".java")) {
            try {
                InterfaceC22097 interfaceC22097 = C10697.get(str, new String[0]);
                if (!C18743.exists(interfaceC22097, new EnumC16060[0])) {
                    String string = interfaceC22097.toString();
                    C14040 c14040 = C8300.f21997;
                    throw abstractC3154.m5388(new C14040("compiler", "file.not.found", string));
                }
                if (!C18743.isRegularFile(interfaceC22097, new EnumC16060[0])) {
                    C14040 c14041 = C8300.f21997;
                    throw abstractC3154.m5388(new C14040("compiler", "file.not.file", interfaceC22097));
                }
                abstractC3154.mo5392(interfaceC22097);
                return;
            } catch (InvalidPathException unused) {
                C14040 c14042 = C8300.f21997;
                throw abstractC3154.m5388(new C14040("compiler", "invalid.path", str));
            }
        }
        abstractC3154.mo5390(str);
    }
}
