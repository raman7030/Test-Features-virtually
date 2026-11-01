package p067l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۢܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C11574 extends EnumC2483 {
    public /* synthetic */ C11574(EnumC19919 enumC19919, EnumC5837 enumC5837, EnumC11202 enumC11202) {
        this("A", 44, "-A", "opt.arg.key.equals.value", "opt.A", enumC19919, enumC5837, enumC11202);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ᩷ */
    public boolean mo3588() {
        return false;
    }

    public C11574(String str, int i, String str2, String str3, String str4, EnumC19919 enumC19919, EnumC5837 enumC5837, EnumC11202 enumC11202) {
        super(str, i, str2, str3, str4, enumC19919, enumC5837, enumC11202, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3584(String str) {
        return str.startsWith("-A");
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3579(AbstractC3154 abstractC3154, String str) throws C4496 {
        int length = str.length();
        if (length == 2) {
            throw abstractC3154.m5388(C8300.f22069);
        }
        int iIndexOf = str.indexOf(61);
        if (iIndexOf != -1) {
            length = iIndexOf;
        }
        String strSubstring = str.substring(2, length);
        Pattern pattern = C3606.f7406;
        for (String str2 : strSubstring.split("\\.", -1)) {
            if (!EnumC5698.m12682(str2)) {
                C14040 c14040 = C8300.f21997;
                throw abstractC3154.m5388(new C14040("compiler", "invalid.A.key", str));
            }
        }
        abstractC3154.mo5391(str, str);
    }
}
